precision highp float;

uniform sampler2D u_Texture;
varying vec2 v_TexCoordinate;

uniform vec2 u_TextureSize;

uniform float u_MusicMix_time;
uniform float u_MusicMix_swipe;
uniform vec2 u_MusicMix_gyro;

uniform float u_Shape_idleMul;
uniform float u_Shape_playMul;
uniform float u_Shape_loveMul;
uniform float u_Shape_cheerMul;
uniform float u_Shape_joyMul;
uniform float u_Shape_sadMul;
uniform float u_Shape_calmMul;
uniform float u_Shape_newYearMul;
uniform int u_Shape_type;

uniform vec2 u_Circle_pos;
uniform float u_Circle_rad;

uniform vec3 u_BackgroundPalette_top;
uniform vec3 u_BackgroundPalette_mid;
uniform vec3 u_BackgroundPalette_bot;

uniform vec3 u_WavePalette_base;
uniform vec3 u_WavePalette_inGlow;
uniform vec3 u_WavePalette_outGlow;

uniform vec3 u_ShapePalette_base;
uniform vec3 u_ShapePalette_inGlow;
uniform vec3 u_ShapePalette_outGlow;

uniform int u_IsShapeTypeContainsIdle;
uniform int u_IsShapeTypeContainsPlay;
uniform int u_IsShapeTypeContainsLove;
uniform int u_IsShapeTypeContainsCheer;
uniform int u_IsShapeTypeContainsJoy;
uniform int u_IsShapeTypeContainsSad;
uniform int u_IsShapeTypeContainsCalm;
uniform int u_IsShapeTypeContainsNewYear;

float GLASS_REFRACTION = 0.125;
float HALF_PI_F = 1.5707964;
float M_PI_F = 3.1415927;
float TWO_PI_F = 6.283185;
float MAIN_BLUR = 0.025;
float WAVE_BLUR = 0.3;
float WAVE_RAD = 1.0;
float NEW_YEAR_TIME_COFF = 0.7;
float SHAPE_RADIUS_COFF = 0.90;
vec2 WAVE_CENTER = vec2(0.5, 1.9);

float sins(float t) {
    return sin(mod(t, TWO_PI_F));
}

float coss(float t) {
    return cos(mod(t, TWO_PI_F));
}

vec2 squarifyUV(vec2 uv) {
    uv.y -= 0.5;
    uv.y /= u_TextureSize.x / u_TextureSize.y;
    uv.y += 0.5;
    return uv;
}

vec2 glass(vec2 uv) {
    float stripesCount = 22.0;
    float xShift = fract(uv.x * stripesCount) - 0.5;
    uv.x += xShift * GLASS_REFRACTION;
    return uv;
}

float squaredGlass(vec2 uv) {
    float side = 50.0;

    vec2 xy = floor(uv * side);
    vec2 cell = uv * side - xy;

    float border = 0.2;
    float res = step(1.0, cell.x + cell.y);
    if (cell.x > border && cell.x < (1.0 - border) && cell.y > border && cell.y < (1.0 - border)) {
        res = 0.5;
    }
    return res;
}

float offsetAngle(vec2 v) {
    if (v.x < 0.0) {
        return atan(v.y / v.x) + M_PI_F;
    } else {
        return atan(v.y / v.x);
    }
}

float wave(float angle, float time, vec2 gyro, float swipe) {
    float timeShift = sins(time);
    float tiltYmul = (gyro.y + 1.75) * 0.2 + 0.25;
    float mainWaveMul = 0.15;
    return sins(angle * 10.0 - gyro.x * 4.0 + swipe * 3.0 + timeShift) * mainWaveMul * tiltYmul;
}

float atan2(float y, float x) {
    if (x > 0.0) return atan(y / x);
    if (x < 0.0 && y >= 0.0) return atan(y / x) + M_PI_F;
    if (x < 0.0 && y < 0.0) return atan(y / x) - M_PI_F;
    if (x == 0.0 && y > 0.0) return HALF_PI_F;
    if (x == 0.0 && y < 0.0) return -HALF_PI_F;
    return 0.0;
}

float play(float angle) {
    float wobbleTime = mod(u_MusicMix_time * 2.0, M_PI_F * 2.0);
    float wobbleAtt = 35.0;
    float wobble = 0.0;
    wobble += sins(angle * 3.0 - wobbleTime);
    wobble += sins(angle * 4.0 + wobbleTime);
    return wobble / wobbleAtt;
}

vec2 rot(vec2 pos, float rotation) {
    float angle = -rotation * TWO_PI_F;
    float sine = sins(angle);
    float cosine = coss(angle);
    return vec2(cosine * pos.x + sine * pos.y, cosine * pos.y - sine * pos.x);
}

vec2 scale(vec2 pos, float scale) {
    return pos / scale;
}

vec2 newYearScale(vec2 pos, float time) {
    float scaleFactor = coss(time) * 0.1;
    return scale(pos, 0.9 + scaleFactor);
}

float star(vec2 p, float rad, float time) {
    float rotMul = (coss(time * 0.75) + 2.0) / 2.0;
    p = rot(p, sins(time) * 0.2 * rotMul);
    float s = coss(time) * 0.1;
    p = scale(p, 1.2 + s);
    float an = M_PI_F / 11.0;
    float sharpness = smoothstep(0.3, 0.7, (coss(time * 0.75) + 1.0) / 2.0);
    float en = M_PI_F / (4.0 + sharpness * 1.5);
    vec2 acs = vec2(coss(an), sins(an));
    vec2 ecs = vec2(coss(en), sins(en));

    p.x = abs(p.x);

    float bn = mod(atan2(p.x, p.y), 2.0 * an) - an;
    p = length(p) * vec2(coss(bn), abs(sins(bn)));
    p -= rad * acs;
    p += ecs * clamp(-dot(p, ecs), 0.0, rad * acs.y / ecs.y);
    return length(p) * sign(p.x);
}

float peak(float val, float target, float round) {
    float res = smoothstep(target - round, target, val);
    res -= smoothstep(target, target + round, val);
    return res;
}

float smoothIntersection(float d1, float d2, float k) {
    float h = clamp(0.5 - 0.5 * (d2 - d1) / k, 0.0, 1.0);
    return mix(d2, d1, h) + k * h * (1.0 - h);
}

float sdTriangleIsosceles(vec2 p, vec2 q) {
    p.x = abs(p.x);
    vec2 a = p - q * clamp(dot(p, q) / dot(q, q), 0.0, 1.0);
    vec2 b = p - q * vec2(clamp(p.x / q.x, 0.0, 1.0), 1.0);
    float k = sign(q.y);
    float d = min(dot(a, a), dot(b, b));
    float s = max(k * (p.x * q.y - p.y * q.x), k * (p.y - q.y));
    return sqrt(d) * sign(s);
}

float sdParabola(vec2 pos, float k) {
    pos.x = abs(pos.x);
    float ik = 1.0 / k;
    float p = ik * (pos.y - 0.5 * ik) / 3.0;
    float q = 0.25 * ik * ik * pos.x;
    float h = q * q - p * p * p;
    float r = sqrt(abs(h));
    float x = (h > 0.0)
    ? pow(q + r, 1.0 / 3.0) - pow(abs(q - r), 1.0 / 3.0) * sign(r - q)
    : 2.0 * coss(atan2(r, q) / 3.0) * sqrt(p);
    return length(pos - vec2(x, k * x * x)) * sign(pos.x - x);
}

float sdUnevenCapsule(vec2 p, float r1, float r2, float h) {
    p.x = abs(p.x);
    float b = (r1 - r2) / h;
    float a = sqrt(1.0 - b * b);
    float k = dot(p, vec2(-b, a));
    if (k < 0.0) return length(p) - r1;
    if (k > a * h) return length(p - vec2(0.0, h)) - r2;
    return dot(p, vec2(a, b)) - r1;
}

float heart(vec2 p, float time) {
    p *= 1.2 + coss(time) * 0.1;
    p = rot(p, sins(time) * 0.04);
    p.x = abs(p.x);
    p.y = -0.1 + p.y * 1.2 + p.x * (1.0 - p.x);
    float c = length(p) - 0.5;

    float tt = mod(time, 1.75);
    float beatSmoothness = 0.1;
    float ss = peak(tt, 1.0, beatSmoothness);
    ss += peak(tt, 1.2, beatSmoothness);
    c -= ss / 25.0;

    return c;
}


float sdRect(vec2 p, float halfSize) {
    vec2 componentWiseEdgeDistance = abs(p) - halfSize;
    float outsideDistance = length(max(componentWiseEdgeDistance, 0.0));
    float insideDistance = min(max(componentWiseEdgeDistance.x, componentWiseEdgeDistance.y), 0.0);
    return outsideDistance + insideDistance;
}

float sdMoon(vec2 p, float d, float ra, float rb) {
    p.y = abs(p.y);
    float a = (ra * ra - rb * rb + d * d) / (2.0 * d);
    float b = sqrt(max(ra * ra - a * a, 0.0));
    if (d * (p.x * b - p.y * a) > d * d * max(b - p.y, 0.0))
    return length(p - vec2(a, b));
    return max((length(p) - ra), -(length(p - vec2(d, 0.0)) - rb));
}

// SDF
float unionSDF(float d1, float d2) { return min(d1, d2); }
float intersectionSDF(float d1, float d2) { return max(d1, d2); }

float horn(vec2 p, float size) {
    vec2 bp = p;
    bp.y -= 0.5;
    float box = sdRect(bp, 0.5);
    return intersectionSDF(box, sdMoon(p, 0.25, size, size * 0.9));
}

int mod(int number, int module) {
    float floored = floor(float(number) / float(module));
    return number - (module * int(floored));
}

float smoothUnion(float d1, float d2, float k) {
    float h = clamp(0.5 + 0.5 * (d2 - d1) / k, 0.0, 1.0);
    return mix(d2, d1, h) - k * h * (1.0 - h);
}

float halfFire(vec2 p, float time, float s, float rad) {
    vec2 orig = p;
    if (p.x * s > 0.0) {
        float h = rad;
        if (abs(p.y) > h) {
            return length(vec2(0.0, sign(p.y) * h) - p);
        } else {
            return p.x * s;
        }
    }
    float distFromCenter = (p.x * p.x) / rad * 1.5;
    p.y -= distFromCenter / 2.0;
    if (s > 0.0) {
        p.x += sins(time) * 0.05;
    }

    p = rot(p, -orig.x * 0.1);

    float tCount = 7.0;
    p.x += sign(p.x) * fract(time) / 7.0;
    p.x = fract(p.x * tCount) - 0.5;

    return sdTriangleIsosceles(p + vec2(0.0, rad), vec2(rad * 3.0, 1.0 - distFromCenter));
}

float fire(vec2 p, float time, float rad) {
    p.x += sins(p.y * 10.0 + time) * 0.03;
    p.y += coss(p.x * 10.0 + time * 0.7) * 0.02;

    float fl = halfFire(p, time, 1.0, rad);
    float fr = halfFire(p, time, -1.0, rad);

    float fireTop = smoothUnion(fl, fr, 0.5);

    vec2 ep = p;
    ep.y *= -1.0;
    ep.y += rad * 0.85;

    float e = sdParabola(ep, 1.5);

    return smoothIntersection(e, fireTop, 0.1);
}

float sadScale(float time) {
    return 0.9 + sins(time) * 0.05;
}

float sdCircle(vec2 p, float time, float rad) {
    p = scale(p, sadScale(time));
    return length(p) - rad;
}

float sdRectangle(vec2 p, vec2 halfDistance) {
    vec2 d = abs(p) - halfDistance;
    return length(max(d, 0.0)) + min(max(d.x, d.y), 0.0);
}

float newYearCircle(vec2 p, float time, float rad) {
    vec2 scaledCircle = newYearScale(p, time);
    return length(scaledCircle) - rad;
}

float moon(vec2 p, float time, float sadMul, float rad) {
    p = rot(p, 0.1 - coss(time) * 0.03);
    p = scale(p, sadScale(time));
    return sdMoon(p, 0.1, rad * 1.1, rad * (1.95 - sadMul));
}

float flower(vec2 p, float time, float calmMul, float rad) {
    int sides = 6;
    float as = 1.0 / float(sides);

    p = rot(p, sins(time * 0.1) * 0.2);

    float dist = 100.0;
    for (int i = 0; i < sides; ++i) {
        float an = float(i) * as;
        vec2 rp = rot(p, -an);
        float hmul = 0.01;
        if (mod(i, 2) == 0) {
            hmul = 1.0;
            hmul += sins(time) * 0.05;
        } else {
            hmul += calmMul;
        }
        dist = unionSDF(dist, sdUnevenCapsule(rp, rad * 0.1, rad * 0.3, rad * 0.85 * hmul));
    }
    return dist;
}

float getDistToShape(vec2 v, float time, vec2 gyro, float swipe, float rad) {
    float sdf = 0.0;
    float dToCenter = length(v);

    float a = offsetAngle(v);
    a += coss(time / 3.0) / 10.0;

    // CIRCLE-BASED SHAPES
    float dToCircle = dToCenter - rad;
    if (u_IsShapeTypeContainsIdle == 1) {
        sdf += (dToCircle - wave(a, time, gyro, swipe)) * u_Shape_idleMul;
    }
    if (u_IsShapeTypeContainsPlay == 1) {
        sdf += (dToCircle - play(a)) * u_Shape_playMul;
    }

    // ARBITRARY SHAPES
    if (u_IsShapeTypeContainsNewYear == 1) {
        time *= NEW_YEAR_TIME_COFF;
        v.y -= 0.1;
        v += vec2((sins(2.0 * time) + sins(3.0 * time) + sins(4.0 * time)) * 0.05, coss(time) * 0.02);
        v += u_MusicMix_gyro * 0.025 / rad;
        sdf += newYearCircle(v, time, rad) * u_Shape_newYearMul;
    }
    if (u_IsShapeTypeContainsJoy == 1) {
        sdf += star(v, rad * 0.9, time) * u_Shape_joyMul;
    }
    if (u_IsShapeTypeContainsLove == 1) {
        sdf += heart(v, time) * u_Shape_loveMul;
    }
    if (u_IsShapeTypeContainsCheer == 1) {
        sdf += fire(v, time, rad) * u_Shape_cheerMul;
    }
    if (u_IsShapeTypeContainsSad == 1) {
        sdf += sdCircle(v, time, rad) * u_Shape_sadMul;
    }
    if (u_IsShapeTypeContainsCalm == 1) {
        int activeTypes = u_IsShapeTypeContainsIdle + u_IsShapeTypeContainsCalm;
        
        bool isTransition = activeTypes > 1;
        
        if (isTransition) {
            sdf += flower(v, time, u_Shape_calmMul, rad) * u_Shape_calmMul * u_Shape_calmMul * u_Shape_calmMul;
        } else {
            sdf += flower(v, time, u_Shape_calmMul, rad) * u_Shape_calmMul;
        }
    }

    return sdf;
}

vec4 adShape(vec2 v, float time, vec3 shapeCol, float rad) {
    vec4 col = vec4(0.0);

    if (u_IsShapeTypeContainsSad == 1) {
        float sdf = moon(v, time, u_Shape_sadMul, rad) * u_Shape_sadMul;

        float alpha = smoothstep(MAIN_BLUR, 0.0, sdf) * u_Shape_sadMul * u_Shape_sadMul;

        col.rgb = shapeCol;
        col.a = alpha;
    }

    if (u_IsShapeTypeContainsNewYear == 1) {
        time *= NEW_YEAR_TIME_COFF;
        v.y -= 0.1;
        v += vec2((sins(2.0 * time) + sins(3.0 * time) + sins(4.0 * time)) * 0.05, coss(time) * 0.02);
        v += u_MusicMix_gyro * 0.025 / rad;

        float alpha = 0.0;
        // Это цвета текстуры новогодней игрушки. В целях экономии ресурсов для униформ решили
        // оставить их в коде. В планах удалить этот фрагмент кода или привести в состояние
        // похожее на остальные виды анимации.
        vec3 yellowColor = vec3(0.78039217, 0.67058825, 0.46666667);
        vec3 blackColor = vec3(0.16470589, 0.09803922, 0.039215688);

        float verticleHolderHalfSide = rad / 22.0;
        float horizontalHolderHalfSide = rad / 4.0;

        vec2 holderCenter = v;
        holderCenter.y += rad + verticleHolderHalfSide;
        float holderSdf = sdRectangle(holderCenter, vec2(horizontalHolderHalfSide, verticleHolderHalfSide));
        alpha = smoothstep(MAIN_BLUR, 0.0, holderSdf) * u_Shape_newYearMul * u_Shape_newYearMul;

        vec2 blackPart = holderCenter;
        blackPart.x += 0.01;

        float verticleBlackHalfSide = rad / 12.0;
        float horizontalBlackHalfSide = rad / 50.0;
        float blackSdf = sdRectangle(blackPart, vec2(horizontalBlackHalfSide, verticleBlackHalfSide));
        float blackAlpha = smoothstep(MAIN_BLUR, 0.0, blackSdf) * u_Shape_newYearMul * u_Shape_newYearMul;
        if (blackAlpha > 0.0) {
            col.rgb = blackColor;
            col.a = blackAlpha;
            return col;
        }

        if (alpha > 0.0) {
            col.rgb = yellowColor;
            col.a = alpha;
            return col;
        }
    }

    return col;
}

float reflection(vec2 v, float time, float rad) {
    float res = 0.0;

    if (u_IsShapeTypeContainsCheer == 1) {
        vec2 lightAngle = normalize(vec2(-0.5, -0.5));
        float spec = clamp(dot(v, lightAngle), 0.0, 1.0) / rad * u_Shape_cheerMul;
        res += spec * spec * u_Shape_cheerMul * 0.7;
    }
    if (u_IsShapeTypeContainsJoy == 1) {
        vec2 lightAngle = normalize(vec2(-0.5, -0.5));
        float spec = clamp(dot(v, lightAngle), 0.0, 1.0) / rad * u_Shape_joyMul;
        res += spec * spec * u_Shape_joyMul * 0.25;
    }
    if (u_IsShapeTypeContainsSad == 1) {
        vec2 lightAngle = normalize(vec2(0.5, -0.85));
        float spec = clamp(dot(v, lightAngle), 0.0, 1.0) / rad * u_Shape_sadMul;
        res += spec * spec * u_Shape_sadMul;
    }
    if (u_IsShapeTypeContainsNewYear == 1) {
        vec2 lightAngle = normalize(vec2(0.5, -0.85));
        float spec = clamp(dot(v, lightAngle), 0.0, 1.0) / rad * u_Shape_newYearMul;
        res += spec * spec * u_Shape_newYearMul * 0.7;
    }
    if (u_IsShapeTypeContainsCalm == 1) {
        vec2 lightAngle = normalize(vec2(-0.5, -0.85));
        float spec = clamp(dot(v, lightAngle), 0.0, 1.0) / rad * u_Shape_calmMul;
        res += spec * spec * u_Shape_calmMul;
    }

    return res;
}

vec4 mainShape(vec2 uv) {
    float rad = u_Circle_rad * SHAPE_RADIUS_COFF;

    vec2 center = u_Circle_pos;
    center.y += 0.075;
    center += u_MusicMix_gyro * 0.025 / rad;
    center += vec2(coss(u_MusicMix_time / 3.0), sin(u_MusicMix_time / 2.0)) * 0.05;

    vec2 v = vec2(uv - center);
    float dToCenter = length(v);

    float sdf = getDistToShape(v, u_MusicMix_time, u_MusicMix_gyro, u_MusicMix_swipe, rad);

    float mainColorAlpha = smoothstep(MAIN_BLUR, 0.0, sdf);

    vec3 outerGlowColor = u_ShapePalette_outGlow;
    float glowOffset = sins(u_MusicMix_time) * 0.05;

    vec3 col = outerGlowColor;
    float outerGlowAlpha = 0.0;
    if (sdf > 0.0) {
        float glowHeight = 0.175;
        outerGlowAlpha = 1.0 / exp(sdf * 7.0 - glowHeight - glowOffset);
        outerGlowAlpha *= outerGlowAlpha;
    }
    col = mix(outerGlowColor, u_ShapePalette_base, mainColorAlpha);

    if (sdf < 0.0) {
        float innerGlowDist = mix(rad - dToCenter, -sdf / rad, u_Shape_idleMul);
        innerGlowDist = max(0.0, innerGlowDist);
        float innerBorder = 0.4;
        float innerGlowAlpha = smoothstep(0.0, innerBorder, innerGlowDist);
        col = mix(col, u_ShapePalette_inGlow, innerGlowAlpha);
    }

    // additional reflection
    float r = reflection(v, u_MusicMix_time, rad);
    col = mix(col, vec3(u_ShapePalette_outGlow + 0.2), r);

    // additional shape
    vec4 adCol = adShape(v, u_MusicMix_time, u_BackgroundPalette_top, rad);
    col = mix(col, adCol.rgb, adCol.a);

    float alpha = max(mainColorAlpha, outerGlowAlpha);

    return vec4(col, alpha);
}

vec4 waveColor(float sdf, float blur, float time) {
    float halfBlur = blur * 0.5;
    float mainColorAlpha = smoothstep(blur, halfBlur, sdf);

    vec3 outerGlowColor = u_WavePalette_outGlow;
    float glowOffset = sins(time) * 0.01;

    vec3 col = outerGlowColor;
    float outerGlowAlpha = 0.0;
    if (sdf > 0.0) {
        float glowHeight = 0.5;
        outerGlowAlpha = smoothstep(glowHeight, 0.0, sdf + glowOffset);
    }
    col = mix(outerGlowColor, u_WavePalette_base, mainColorAlpha);

    if (sdf < 0.0) {
        float innerGlowDist = max(0.0, -sdf);
        float innerBorder = 0.3;
        float innerGlowAlpha = smoothstep(0.0, innerBorder, innerGlowDist);
        col = mix(col, u_WavePalette_inGlow, innerGlowAlpha);
    }

    float alpha = max(mainColorAlpha, outerGlowAlpha);

    return vec4(col, alpha);
}

float distToWave(vec2 uv) {
    float len = length(uv - WAVE_CENTER);
    float test = WAVE_RAD;

    float wobble = 0.0;
    float sinTime = (sins(u_MusicMix_time) + 1.0) / 2.0;

    wobble += sins(uv.x * 5.5431 + u_MusicMix_time * 2.121);
    wobble += sins(uv.x * coss(u_MusicMix_time / 6.0) * 10.0 - u_MusicMix_time * 3.5);
    wobble += sins(uv.x * 8.122 - u_MusicMix_time * 1.5);
    wobble += sins(uv.x * 16.0 - u_MusicMix_time) * sinTime;

    float wobbleMul = (coss(u_MusicMix_time) + 2.0) / 4.0 / 30.0;
    test += wobble * wobbleMul;
    float sdf = len - test;
    return sdf;
}

vec3 background(vec2 uv) {
    vec3 bgTop = u_BackgroundPalette_top;
    vec3 bgMid = u_BackgroundPalette_mid;
    vec3 bgBot = u_BackgroundPalette_bot;
    float sdf = distToWave(uv);
    vec4 waveCol = waveColor(sdf, WAVE_BLUR, u_MusicMix_time);
    vec3 col = vec3(0.0);

    if (waveCol.a > 0.0) {
        col = mix(bgBot, waveCol.rgb, waveCol.a);
    } else {
        col = mix(bgMid, bgBot, smoothstep(1.0, 0.6, sdf));
    }

    if (uv.y < 0.0) {
        col = mix(col, bgTop, abs(uv.y));
    }
    float distFromCenter = length(uv - vec2(0.5, 0.5)) * 0.25;
    col -= distFromCenter * distFromCenter; // radial vignette
    return col;
}

float rand(vec2 n) {
    return fract(sin(dot(n, vec2(12.9898, 4.1414))) * 43758.5453);
}

float perlin(vec2 p) {
    // Get integer and fractional parts of the coordinates
    vec2 i = floor(p);
    vec2 f = fract(p);

    // Smooth the fractional part
    f = f * f * (3.0 - 2.0 * f);
    float res = mix(
        mix(rand(i), rand(i + vec2(1.0, 0.0)), f.x),
        mix(rand(i + vec2(0.0, 1.0)), rand(i + vec2(1.0, 1.0)), f.x),
        f.y);
    return res * res;
}

vec3 mainShapeCol(vec2 gid) {
    vec2 uv = gid / u_TextureSize.xy;

    uv = glass(uv);
    uv = squarifyUV(uv);

    vec4 mainShapeCol = mainShape(uv);
    vec3 col = vec3(0.0);
    if (mainShapeCol.a < 0.99) {
        vec3 bgCol = background(uv);
        col = mix(bgCol, mainShapeCol.rgb, mainShapeCol.a);
    } else {
        col = mainShapeCol.rgb;
    }
    float grain = perlin(gid);
    col -= grain * 0.1;
    float glassBlock = squaredGlass(uv);
    col += glassBlock * 0.025;

    vec3 bgTop = u_BackgroundPalette_top;

    float navBarHeight = 0.5;
    if (uv.y < navBarHeight) {
        float topGrad = clamp((navBarHeight - uv.y) / navBarHeight, 0.0, 1.0);
        topGrad *= topGrad;
        topGrad *= clamp(1.0 - u_Shape_idleMul * u_Shape_idleMul, 0.0, 1.0);
        col = mix(col, bgTop, topGrad);
    }

    return col;
}

void main() {
    vec3 col = mainShapeCol(gl_FragCoord.xy);
    gl_FragColor = vec4(col, 1.0);
}
