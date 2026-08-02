precision highp float;
uniform %%SAMPLER_TYPE%% sTexture;
varying vec2 vTextureCoord;

void main() {
    gl_FragColor = texture2D(sTexture, vTextureCoord);
}
