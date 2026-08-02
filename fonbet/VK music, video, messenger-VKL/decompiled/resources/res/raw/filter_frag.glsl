precision highp float;

uniform float u_FilterIntensity;
uniform sampler2D u_Texture;
uniform sampler2D u_LutTexture;
uniform int u_FilterEnabled;
varying vec2 v_TexCoordinate;

vec4 filter(vec4 textureColor) {
    highp float blueColor = textureColor.b * 63.0;

    highp vec2 quad1;
    quad1.y = floor(floor(blueColor) / 8.0);
    quad1.x = floor(blueColor) - (quad1.y * 8.0);

    highp vec2 quad2;
    quad2.y = floor(ceil(blueColor) / 8.0);
    quad2.x = ceil(blueColor) - (quad2.y * 8.0);

    highp vec2 texPos1;
    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);
    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);

    highp vec2 texPos2;
    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);
    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);

    lowp vec4 lutColor = vec4(textureColor.rgb, 1.0);

    lutColor = mix(
        texture2D(u_LutTexture, texPos1),
        texture2D(u_LutTexture, texPos2),
        fract(blueColor)
    );

    return mix(textureColor, lutColor, u_FilterIntensity);
}

void main() {
    if (u_FilterEnabled == 1) {
        gl_FragColor = filter(
            texture2D(u_Texture, v_TexCoordinate)
        );
    } else {
        gl_FragColor = texture2D(u_Texture, v_TexCoordinate);
    }
}