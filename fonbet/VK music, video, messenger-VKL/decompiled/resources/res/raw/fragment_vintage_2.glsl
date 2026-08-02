%s
#extension GL_OES_standard_derivatives : enable
#ifdef GL_ES
precision highp float;
#endif

varying lowp vec2 vTextureCoord;
uniform %s sTexture;
uniform sampler2D oTexture;
uniform float paramIntensity;

float processOverlay(float lowerVal, float upperVal);
vec3 colorOverlay(vec3 color, vec3 overlayColor, float grayA);
vec3 retroSin(vec3 col, vec2 uv, vec3 col2, float strenght);
vec3 filter8(vec3 col, vec3 col2, vec2 uv, float paramIntensity);

float processOverlay(float lowerVal, float upperVal) {
    float ret = 0.0;
    if (lowerVal >= 0.5) {
        ret = 1.0 - 2.0 * (1.0 - lowerVal) * (1.0 - upperVal);
    } else {
        ret = 2.0 * lowerVal * upperVal;
    }
    return ret;
}

vec3 colorOverlay(vec3 color, vec3 overlayColor, float grayA) {
    color.x = processOverlay(color.x, overlayColor.x);
    color.g = processOverlay(color.y, overlayColor.y);
    color.b = processOverlay(color.z, overlayColor.z);
    float a = grayA;
    float backA = 1.0 - a;
    vec3 gray = vec3(0.21 * color.x + 0.7 * color.y + 0.07 * color.z);
    color.xyz = vec3(backA * color.x + a * gray.x, backA * color.y + a * gray.y, backA * color.z + a * gray.z);
    return color.xyz;
}

vec3 retroSin(vec3 col, vec2 uv, vec3 col2, float strenght) {
    float sinVal1 = (sin(-0.3 + uv.x * 10.0) + 1.2) * 0.5 * (uv.y * 0.5 + 0.5) * (1.0 - uv.x * 0.8);
    sinVal1 = clamp(sinVal1, 0.0, 0.95);
    return col + vec3(sinVal1) * col2 * strenght;
}

vec3 filter8(vec3 col, vec3 col2, vec2 uv, float paramIntensity) {
    vec3 res = colorOverlay(col, vec3(0.8, 0.6, 0.5), 0.0);
    res = retroSin(res, uv, vec3(0.4, 0.1, 0.0), paramIntensity);
    return mix(col, res + col2, paramIntensity);
}

void main() {
    vec2 uv = vTextureCoord;
    vec4 col = texture2D(sTexture, uv);
    vec4 col2 = texture2D(oTexture, uv);
    col.xyz = filter8(col.xyz, col2.xyz, uv, paramIntensity);
    gl_FragColor = col;
}