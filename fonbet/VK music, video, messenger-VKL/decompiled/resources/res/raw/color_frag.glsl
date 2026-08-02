precision highp float;

uniform sampler2D u_Texture;
varying vec2 v_TexCoordinate;
uniform vec4 u_Color;

void main() {
    gl_FragColor = u_Color;
}