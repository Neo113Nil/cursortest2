precision highp float;

uniform float u_FrameX1;
uniform float u_FrameY1;
uniform float u_FrameX2;
uniform float u_FrameY2;

uniform sampler2D u_Texture;
uniform sampler2D u_EnhancedTexture;
uniform int u_EnhanceEnabled;
uniform float u_EnhanceIntensity;

varying vec2 v_TexCoordinate;

vec4 autoenhance(vec4 textureColor, float intensity) {
    vec2 enhancedTextureCoord = vec2(
        v_TexCoordinate.x,
        -v_TexCoordinate.y // Flip enhanced texture (legacy of AllInOneFilter)
    );

    vec4 result = mix(
        textureColor,
        texture2D(u_EnhancedTexture, enhancedTextureCoord),
        intensity
    );

    return result;
}

void main() {
    vec4 outputColor = texture2D(u_Texture, v_TexCoordinate);

    if (gl_FragCoord.x > u_FrameX1
        && gl_FragCoord.x < u_FrameX2
        && gl_FragCoord.y > u_FrameY1
        && gl_FragCoord.y < u_FrameY2
    ) {
        if (u_EnhanceEnabled == 1) {
            outputColor = autoenhance(outputColor, u_EnhanceIntensity);
        }
    } else {
        outputColor = vec4(0.0,0.0,0.0,0.0);
    }

    gl_FragColor = outputColor;
}