%s
#extension GL_OES_standard_derivatives : enable
#ifdef GL_ES
precision highp float;
#endif

varying lowp vec2 vTextureCoord;
uniform %s sTexture;
uniform float paramIntensity;

float processOverlay(float lowerVal, float upperVal);
vec3 colorOverlay(vec3 color, vec3 overlayColor, float grayA);
vec3 luma(vec3 col);
vec3 brightnessContrastSaturationMid(vec3 color, float brt, float con, float sat, vec3 mid);
vec3 brightnessContrastSaturation(vec3 color, float brt, float con, float sat);
vec3 filter2(vec3 col, float paramIntensity);

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

vec3 luma(vec3 col) {
    float yy = dot(vec3(0.2126729, 0.7151522, 0.0721750), col);
    return vec3(yy);
}

vec3 brightnessContrastSaturationMid(vec3 color, float brt, float con, float sat, vec3 mid) {
    vec3 black = vec3(0.0, 0.0, 0.0);
    float lum = luma(color).x;
    vec3 gray = vec3(lum, lum, lum);
    vec3 brtColor = mix(black, color, brt);
    vec3 conColor = mix(mid, brtColor, con);
    vec3 satColor = mix(gray, conColor, sat);
    return satColor;
}

vec3 brightnessContrastSaturation(vec3 color, float brt, float con, float sat) {
    return brightnessContrastSaturationMid(color, brt, con, sat, vec3(0.5, 0.5, 0.5));
}

vec3 filter2(vec3 col, float paramIntensity) {
    float contrastInt = 1.0 + paramIntensity * 0.05;
    float intGB = 0.5 + paramIntensity * 0.2;
    col = colorOverlay(col, vec3(0.5, intGB, intGB * 1.1), 0.0);
    return brightnessContrastSaturation(col, 1.0, contrastInt, 1.0);
}

void main() {
    vec2 uv = vTextureCoord;
    vec4 col = texture2D(sTexture, uv);
    col.xyz = filter2(col.xyz, paramIntensity);
    gl_FragColor = col;
}