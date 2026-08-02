precision highp float;

uniform float u_FrameX1;
uniform float u_FrameY1;
uniform float u_FrameX2;
uniform float u_FrameY2;

uniform sampler2D u_Texture;
uniform float u_sharpnessIntensity;

float stepSizeX = 0.001;
float stepSizeY = 0.001;

varying vec2 v_TexCoordinate;

vec4 sharpness(vec4 color, float intensity) {
    vec3 nbr_color = vec3(0.0, 0.0, 0.0);
    vec2 coord;
    coord.x = v_TexCoordinate.x - 0.5 * stepSizeX;
    coord.y = v_TexCoordinate.y - stepSizeY;
    nbr_color += texture2D(u_Texture, coord).rgb - color.rgb;
    coord.x = v_TexCoordinate.x - stepSizeX;
    coord.y = v_TexCoordinate.y + 0.5 * stepSizeY;
    nbr_color += texture2D(u_Texture, coord).rgb - color.rgb;
    coord.x = v_TexCoordinate.x + stepSizeX;
    coord.y = v_TexCoordinate.y - 0.5 * stepSizeY;
    nbr_color += texture2D(u_Texture, coord).rgb - color.rgb;
    coord.x = v_TexCoordinate.x + stepSizeX;
    coord.y = v_TexCoordinate.y + 0.5 * stepSizeY;
    nbr_color += texture2D(u_Texture, coord).rgb - color.rgb;
    vec3 result = clamp(color.rgb - intensity * nbr_color, 0.0, 1.0);
    return vec4(result, color.a);
}

void main() {
    vec4 outputColor = texture2D(u_Texture, v_TexCoordinate);

    if (gl_FragCoord.x > u_FrameX1
        && gl_FragCoord.x < u_FrameX2
        && gl_FragCoord.y > u_FrameY1
        && gl_FragCoord.y < u_FrameY2
    ) {
        if (u_sharpnessIntensity != 0.0
            && gl_FragCoord.x > u_FrameX1 + 1.0 // Fix artifacts on border
            && gl_FragCoord.x < u_FrameX2 - 1.0
            && gl_FragCoord.y > u_FrameY1 + 1.0
            && gl_FragCoord.y < u_FrameY2 - 1.0) {
            outputColor = sharpness(outputColor, u_sharpnessIntensity);
        }
    }

    gl_FragColor = outputColor;
}