precision mediump float;

uniform vec4 u_color;
varying vec2 v_position;
varying float v_topY;

const float TOP_THICKNESS = 1.25;

void main() {
    float distance = v_topY - v_position.y;

    float alpha = 1.0;

    if(distance >= 0.0 && distance <= TOP_THICKNESS) {
        float t = distance / TOP_THICKNESS;
        alpha = smoothstep(0.0, 1.0, pow(t, 1.5));
    }

    gl_FragColor = vec4(u_color.rgb, alpha);
}
