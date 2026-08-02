precision highp float;

varying vec2 v_TexCoordinate;
uniform sampler2D u_Texture;

//uniform sampler2D u_exposureNegativeTexture; // exposure_negative.png
//uniform sampler2D u_exposurePositiveTexture; // exposure_positive.png
uniform sampler2D u_warmNegativeLutTexture; // warm_negative_lut.png
uniform sampler2D u_warmPositiveLutTexture; // warm_positive_lut.png
uniform sampler2D u_grainTexture; // image from grain.frag pass

uniform float paramExposure; // [-1.0; 1.0] default 0.0
uniform float paramBrightness; // [-1.0; 1.0] default 0.0
uniform float paramContrast; // [-1.0; 1.0] default 0.0
uniform float paramSaturation; // [-1.0; 1.0] default 0.0
uniform float paramTemperature; // [-1.0; 1.0] default 0.0
uniform float paramColorBalance; // [-1.0; 1.0] default 0.0
uniform float paramGrain; // [0.0; 1.0] default 0.0
uniform float paramVignette; // [0.0; 1.0] default 0.0
uniform float paramLights; // [-1.0; 1.0] default 0.0
uniform float paramDarks; // [-1.0; 1.0] default 0.0

vec4 exposure(vec3 view, float intensity) {
    vec3 color = view;
    color *= pow(2.0, intensity * 0.65);
    return vec4(color, 1.0);
}

vec3 ContrastSaturationBrightness(vec3 color, float brt, float sat, float con) {
    const float AvgLumR = 0.5;
    const float AvgLumG = 0.5;
    const float AvgLumB = 0.5;
    const vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);
    vec3 AvgLumin = vec3(AvgLumR, AvgLumG, AvgLumB);
    vec3 brtColor = color * brt;
    vec3 intensity = vec3(dot(brtColor, LumCoeff));
    vec3 satColor = mix(intensity, brtColor, sat);
    vec3 conColor = mix(AvgLumin, satColor, con);

    return conColor;
}

vec4 brightness(vec4 view, float intensity)
{
    vec2 range = vec2(0.5, 1.5);
    intensity = (intensity >= 0.0) ? 1.0 + (range.y - 1.0) * intensity : range.x + (1.0 - range.x) * (intensity + 1.0);
    return vec4(ContrastSaturationBrightness(view.rgb, intensity, 1.0, 1.0), 1.0);
}

vec4 contrast(vec4 view, float intensity)
{
    vec2 range = vec2(0.7, 1.3);
    intensity = (intensity >= 0.0) ? 1.0 + (range.y - 1.0) * intensity : range.x + (1.0 - range.x) * (intensity + 1.0);
    return vec4(ContrastSaturationBrightness(view.rgb, 1.0, 1.0, intensity), 1.0);
}

vec4 saturation(vec4 view, float intensity)
{
    vec2 range = vec2(0.0, 2.0);
    intensity = (intensity >= 0.0) ? 1.0 + (range.y - 1.0) * intensity : range.x + (1.0 - range.x) * (intensity + 1.0);
    return vec4(ContrastSaturationBrightness(view.rgb, 1.0, intensity, 1.0), 1.0);
}

vec4 temperature(vec4 view, float intensity, float balance) {
    float blueColor = view.b * 63.0;
    vec2 quad1;
    quad1.y = floor(floor(blueColor) / 8.0);
    quad1.x = floor(blueColor) - (quad1.y * 8.0);
    vec2 quad2;
    quad2.y = floor(ceil(blueColor) / 8.0);
    quad2.x = ceil(blueColor) - (quad2.y * 8.0);

    vec2 texPos1;
    texPos1.x = (quad1.x * 0.125) + 0.5 / 512.0 + ((0.125 - 1.0 / 512.0) * view.r);
    texPos1.y = (quad1.y * 0.125) + 0.5 / 512.0 + ((0.125 - 1.0 / 512.0) * view.g);
    vec2 texPos2;
    texPos2.x = (quad2.x * 0.125) + 0.5 / 512.0 + ((0.125 - 1.0 / 512.0) * view.r);
    texPos2.y = (quad2.y * 0.125) + 0.5 / 512.0 + ((0.125 - 1.0 / 512.0) * view.g);
    vec3 coldColor1 = texture2D(u_warmNegativeLutTexture, texPos1).rgb;
    vec3 coldColor2 = texture2D(u_warmNegativeLutTexture, texPos2).rgb;
    vec3 coldColor = mix(coldColor1, coldColor2, fract(blueColor));

    vec3 warmColor1 = texture2D(u_warmPositiveLutTexture, texPos1).rgb;
    vec3 warmColor2 = texture2D(u_warmPositiveLutTexture, texPos2).rgb;
    vec3 warmColor = mix(warmColor1, warmColor2, fract(blueColor));

    vec3 result;
    if (intensity >= 0.0) {
        result = mix(view.rgb, warmColor, intensity);
    } else {
        result = mix(view.rgb, coldColor, -intensity);
    }
    return vec4(result, 1.0);
}

vec3 limit_color(vec3 color) {
    return clamp(color, vec3(0.0, 0.0, 0.0), vec3(1.0, 1.0, 1.0));
}

vec4 grain(vec4 view, float intensity) {
    vec3 noiseTex = texture2D(u_grainTexture, v_TexCoordinate).rgb;
    vec3 grain = noiseTex * (1.0 - view.rgb);
    vec3 result = view.rgb += grain * (intensity * 0.14);;
result = limit_color(result);
return vec4(result, 1.0);
}

vec4 lightsDarks(vec4 col, float highlights, float shadows) {
    float lumR = 0.299;
    float lumG = 0.587;
    float lumB = 0.114;
    float luminance = sqrt(lumR * pow(col.r, 2.0) + lumG * pow(col.g, 2.0) + lumB * pow(col.b, 2.0));
    float h = highlights * 0.05 * (pow(8.0, luminance) - 1.0);
    float s = shadows * 0.025 * (pow(8.0, 1.0 - luminance) - 1.0);
    vec4 outer;
    outer.r = col.r + h + s;
    outer.g = col.g + h + s;
    outer.b = col.b + h + s;
    return vec4(outer.rgb, 1.0);
}

float BF_Screen(float base, float blend) {
    return 1.0 - ((1.0 - base) * (1.0 - blend));
}

vec3 BF_Screen(vec3 base, vec3 blend) {
    return 1.0 - ((1.0 - base) * (1.0 - blend));
}

vec4 vignette(vec4 view, float intensity) {
    float dist = distance(v_TexCoordinate, vec2(0.5, 0.5));
    float size = 0.5 - intensity * 0.4;
    float amount = intensity; // Was ==> intensity * intensity * 0.1 + 0.5 * intensity;
    float vignette = smoothstep(0.8, size * 0.799, dist * (amount + size));
    vec3 result = (intensity >= 0.0) ? view.rgb * vignette : BF_Screen(view.rgb, vec3(1.0 - vignette));
    return vec4(result, 1.0);
}

vec4 colorGrade(vec4 textureColor) {
    vec4 outputColor = textureColor;
    if (paramGrain != 0.0) {
        outputColor = grain(outputColor, paramGrain);
    }
    if (paramSaturation != 0.0) {
        outputColor = saturation(outputColor, paramSaturation);
    }
    if (paramLights != 0.0 || paramDarks != 0.0) {
        outputColor = lightsDarks(outputColor, paramLights, paramDarks);
    }
    if (paramExposure != 0.0) {
        outputColor = exposure(outputColor.rgb, paramExposure);
    }
    if (paramBrightness != 0.0) {
        outputColor = brightness(outputColor, paramBrightness);
    }
    if (paramContrast != 0.0) {
        outputColor = contrast(outputColor, paramContrast);
    }

    outputColor.rgb = limit_color(outputColor.rgb);

    return outputColor;
}

//
// HSL
//

//входные HSL параметры для RED оттенков
uniform float colorHueRed; // [-1.0; 1.0] default 0.0
uniform float colorSaturationRed; // [-1.0; 1.0] default 0.0
uniform float colorLightnessRed; // [-1.0; 1.0] default 0.0

//входные HSL параметры для ORANGE оттенков
uniform float colorHueOrange; // [-1.0; 1.0] default 0.0
uniform float colorSaturationOrange; // [-1.0; 1.0] default 0.0
uniform float colorLightnessOrange; // [-1.0; 1.0] default 0.0

//входные HSL параметры для YELLOW оттенков
uniform float colorHueYellow; // [-1.0; 1.0] default 0.0
uniform float colorSaturationYellow; // [-1.0; 1.0] default 0.0
uniform float colorLightnessYellow; // [-1.0; 1.0] default 0.0

//входные HSL параметры для GREEN оттенков
uniform float colorHueGreen; // [-1.0; 1.0] default 0.0
uniform float colorSaturationGreen; // [-1.0; 1.0] default 0.0
uniform float colorLightnessGreen; // [-1.0; 1.0] default 0.0

//входные HSL параметры для CYAN оттенков
uniform float colorHueCyan; // [-1.0; 1.0] default 0.0
uniform float colorSaturationCyan; // [-1.0; 1.0] default 0.0
uniform float colorLightnessCyan; // [-1.0; 1.0] default 0.0

//входные HSL параметры для MAGENTA оттенков
uniform float colorHueMagenta; // [-1.0; 1.0] default 0.0
uniform float colorSaturationMagenta; // [-1.0; 1.0] default 0.0
uniform float colorLightnessMagenta; // [-1.0; 1.0] default 0.0

//____________
//вводные параметры Тонирования для SHADOWS
uniform float toneHueShadow; // [-1.0; 1.0] default 0.0
uniform float toneSaturationShadow; // [-1.0; 1.0] default 0.0
uniform float toneLightnessShadow; // [-1.0; 1.0] default 0.0

//вводные параметры Тонирования для MIDTONES
uniform float toneHueMidtones; // [-1.0; 1.0] default 0.0
uniform float toneSaturationMidtones; // [-1.0; 1.0] default 0.0
uniform float toneLightnessMidtones; // [-1.0; 1.0] default 0.0

//вводные параметры Тонирования для HIGHLIGHTS
uniform float toneHueHighlights; // [-1.0; 1.0] default 0.0
uniform float toneSaturationHighlights; // [-1.0; 1.0] default 0.0
uniform float toneLightnessHighlights; // [-1.0; 1.0] default 0.0

vec3 RGBtoHCV(vec3 RGB)
{
    vec4 P = (RGB.g < RGB.b) ? vec4(RGB.bg, -1.0, 2.0 / 3.0) : vec4(RGB.gb, 0.0, -1.0 / 3.0);
    vec4 Q = (RGB.r < P.x) ? vec4(P.xyw, RGB.r) : vec4(RGB.r, P.yzx);
    float C = Q.x - min(Q.w, Q.y);
    float H = abs((Q.w - Q.y) / (6.0 * C + 1e-7) + Q.z);
    return vec3(H, C, Q.x);
}

vec3 RGBtoHSL(vec3 RGB)
{
    vec3 HCV = RGBtoHCV(RGB);
    float L = HCV.z - HCV.y * 0.5;
    float S = HCV.y / (1.0 - abs(L * 2.0 - 1.0) - 1e-7);
    return vec3(HCV.x * 360.0, S, L);
}

vec3 RGBtoHSL2(vec3 RGB)
{
    vec3 HCV = RGBtoHCV(RGB);
    float L = HCV.z - HCV.y * 0.5;
    float S = HCV.y / (1.0 - abs(L * 2.0 - 1.0) - 1e-7);
    return vec3(HCV.x, S, L);
}

vec3 HUEtoRGB(float H)
{
    float R = abs(H * 6.0 - 3.0) - 1.0;
    float G = 2.0 - abs(H * 6.0 - 2.0);
    float B = 2.0 - abs(H * 6.0 - 4.0);
    return clamp(vec3(R, G, B), 0.0, 1.0);
}

vec3 HSLtoRGB(vec3 HSL)
{
    if (HSL.r < 0.0) { HSL.r = 360.0 - HSL.r; }
    HSL.x /= 360.0;
    vec3 RGB = HUEtoRGB(HSL.x);
    float C = (1.0 - abs(2.0 * HSL.z - 1.0)) * HSL.y;
    return (RGB - 0.5) * C + HSL.z;
}

vec3 HSLtoRGB2(vec3 HSL)
{
    vec3 RGB = HUEtoRGB(HSL.x);
    float C = (1.0 - abs(2.0 * HSL.z - 1.0)) * HSL.y;
    return (RGB - 0.5) * C + HSL.z;
}

//_____________________________________________HSL2____________________________
vec3 newFilterTone(vec4 originalColor) {
    vec4 color = originalColor;
    vec3 hsv = RGBtoHSL2(color.rgb);
    float gray = smoothstep(0.0, 0.2, hsv.g);
    float shadowValue = 1.0 - smoothstep(0.35, 0.6, hsv.z);
    float midValue = smoothstep(0.2, 0.3, hsv.z) * (1.0 - smoothstep(0.6, 0.7, hsv.z));
    float highValue = smoothstep(0.5, 0.7, hsv.z);

    hsv.x = mod(hsv.x + shadowValue * toneHueShadow * 0.05, 1.0);
    if (hsv.x < 0.0) { hsv.x += 1.0; }
    hsv.y += shadowValue * toneSaturationShadow * 0.3 * gray;
    hsv.y = clamp(hsv.y, 0.0, 1.0);
    hsv.z += shadowValue * toneLightnessShadow * 0.1;

    hsv.x = mod(hsv.x + midValue * toneHueMidtones * 0.04, 1.0);
    if (hsv.x < 0.0) { hsv.x += 1.0; }
    hsv.y += midValue * toneSaturationMidtones * 0.2 * gray;
    hsv.y = clamp(hsv.y, 0.0, 1.0);
    hsv.z += midValue * toneLightnessMidtones * 0.1;

    hsv.x = mod(hsv.x + highValue * toneHueHighlights * 0.07, 1.0);
    if (hsv.x < 0.0) { hsv.x += 1.0; }
    hsv.y += highValue * toneSaturationHighlights * 0.2 * gray;
    hsv.y = clamp(hsv.y, 0.0, 1.0);
    hsv.z += highValue * toneLightnessHighlights * 0.2;

    return vec3(HSLtoRGB2(hsv));
}

//_____________________________________________HSL1____________________________

vec3 rgb2hsv(vec3 c)
{
    vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);
    vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));
    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));

    float d = q.x - min(q.w, q.y);
    float e = 1.0e-10;
    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);
}

vec3 hsv2rgb(vec3 c)
{
    vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);
    vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);
    return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);
}

vec3 smoothTreatment(vec3 hsv, float hueEdge0, float hueEdge1, vec3 shiftEdge0, vec3 shiftEdge1)
{
    float smoothedHue = smoothstep(hueEdge0, hueEdge1, hsv.x);
    float hue = hsv.x + (shiftEdge0.x + ((shiftEdge1.x - shiftEdge0.x) * smoothedHue));
    float sat = hsv.y * (shiftEdge0.y + ((shiftEdge1.y - shiftEdge0.y) * smoothedHue));
    float lum = hsv.z * (shiftEdge0.z + ((shiftEdge1.z - shiftEdge0.z) * smoothedHue));
    return vec3(hue, sat, lum);
}

vec4 hsl(vec4 originalColor) {

    //vec3 outputColor = limit_color(newFilterTone(originalColor)); ---------- HSL2

    vec3 redColor = vec3(0.89, 0.24, 0.25);
    vec3 orangeColor = vec3(0.88, 0.55, 0.25);
    vec3 yellowColor = vec3(0.88, 0.86, 0.26);
    vec3 greenColor = vec3(0.27, 0.88, 0.25);
    vec3 cyanColor = vec3(0.25, 0.42, 0.88);
    vec3 magentaColor = vec3(0.72, 0.25, 0.88);

    vec3 hsv = rgb2hsv(originalColor.rgb);
    float gray = smoothstep(0.02, 0.25, hsv.g);

    float red = rgb2hsv(redColor).x;
    float orange = rgb2hsv(orangeColor).x;
    float yellow = rgb2hsv(yellowColor).x;
    float green = rgb2hsv(greenColor).x;
    float cyan = rgb2hsv(cyanColor).x;
    float magenta = rgb2hsv(magentaColor).x;

    vec3 delta = vec3(0.02,0.5,0.15) * gray;
    vec3 summ = vec3(0.0,1.0,1.0);

    vec3 shiftRed = vec3(colorHueRed, colorSaturationRed, colorLightnessRed) * delta + summ;
    vec3 shiftOrange = vec3(colorHueOrange, colorSaturationOrange, colorLightnessOrange) * delta + summ;
    vec3 shiftYellow = vec3(colorHueYellow, colorSaturationYellow, colorLightnessYellow) * delta + summ;
    vec3 shiftGreen = vec3(colorHueGreen, colorSaturationGreen, colorLightnessGreen) * delta + summ;
    vec3 shiftCyan = vec3(colorHueCyan, colorSaturationCyan, colorLightnessCyan) * delta + summ;
    vec3 shiftMagenta = vec3(colorHueMagenta, colorSaturationMagenta, colorLightnessMagenta) * delta + summ;

    if (hsv.x < orange) { hsv = smoothTreatment(hsv, 0.0, orange, shiftRed, shiftOrange); }
    else if (hsv.x >= orange && hsv.x < yellow) { hsv = smoothTreatment(hsv, orange, yellow, shiftOrange, shiftYellow); }
    else if (hsv.x >= yellow && hsv.x < green) { hsv = smoothTreatment(hsv, yellow, green, shiftYellow, shiftGreen); }
    else if (hsv.x >= green && hsv.x < cyan) { hsv = smoothTreatment(hsv, green, cyan, shiftGreen, shiftCyan); }
    else if (hsv.x >= cyan && hsv.x < magenta) { hsv = smoothTreatment(hsv, cyan, magenta, shiftCyan, shiftMagenta); }
    else { hsv = smoothTreatment(hsv, magenta, 1.0, shiftMagenta, shiftRed); };

    return vec4(limit_color(hsv2rgb(hsv)), 1.0);
}

//
// SelectiveTone - Тон
//

uniform int selectiveDarkColor; //[0..6] 0 = none, 1 - первый цвет, 2 - второй и т.д.
uniform int selectiveLightColor; //[0..6] 0 = none, 1 - первый цвет, 2 - второй и т.д.
uniform float selectiveDarkLevel; // [0.0; 1.0] степень тонирования темных участков
uniform float selectiveLightLevel; // [0.0; 1.0] степень тонирования светлых участков

vec3 BF_Multiply(vec3 base, vec3 blend) { return base * blend; }

//_____________________________________________Тон____________________________
vec4 selectiveTone(vec4 originalColor) {
    vec3 darkcolors[6];
    vec3 lightcolors[6];
    vec4 result = originalColor;
    float originalColorLightness = smoothstep(0.6, 0.8, RGBtoHSL(originalColor.rgb).b) * 0.5;
    float originalColorDarkness = (1.0 - smoothstep(0.0, 0.7, RGBtoHSL(originalColor.rgb).b)) * 0.2;

    darkcolors[0] = vec3(0.92, 0.36, 0.33);
    darkcolors[1] = vec3(0.89, 0.53, 0.24);
    darkcolors[2] = vec3(0.97, 0.81, 0.27);
    darkcolors[3] = vec3(0.58, 0.82, 0.54);
    darkcolors[4] = vec3(0.52, 0.76, 0.83);
    darkcolors[5] = vec3(0.55, 0.24, 0.54);

    lightcolors[0] = vec3(0.95, 0.71, 0.7);
    lightcolors[1] = vec3(0.89, 0.83, 0.65);
    lightcolors[2] = vec3(0.93, 0.88, 0.58);
    lightcolors[3] = vec3(0.7, 0.91, 0.78);
    lightcolors[4] = vec3(0.58, 0.77, 0.87);
    lightcolors[5] = vec3(0.7, 0.6, 0.84);

    result.rgb = mix(originalColor.rgb, BF_Multiply(originalColor.rgb, lightcolors[selectiveLightColor - 1]), originalColorLightness * selectiveLightLevel);
    result.rgb = mix(result.rgb, BF_Screen(originalColor.rgb, darkcolors[selectiveDarkColor - 1]), originalColorDarkness * selectiveDarkLevel);

    return result;
}
vec4 generateGradient() {
    return vec4(HSLtoRGB2(vec3(v_TexCoordinate.y, v_TexCoordinate.x, 0.5)), 1.0);
}
void main() {
    //vec2 position = ( gl_FragCoord.xy / resolution.xy );
    vec4 textureColor = texture2D(u_Texture, v_TexCoordinate);

    //textureColor = generateGradient(); // градиент вместо фото

    textureColor = colorGrade(textureColor);
    textureColor = hsl(textureColor);

    if (selectiveDarkColor != 0 || selectiveLightColor != 0) { textureColor = selectiveTone(textureColor); }
    if (paramTemperature != 0.0 || paramColorBalance != 0.0) {textureColor = temperature(textureColor, paramTemperature, paramColorBalance);}
    if (paramVignette != 0.0) { textureColor = vignette(textureColor, paramVignette); }

    textureColor.rgb = limit_color(textureColor.rgb);
    gl_FragColor = vec4(textureColor.rgb, 1.0);
}
