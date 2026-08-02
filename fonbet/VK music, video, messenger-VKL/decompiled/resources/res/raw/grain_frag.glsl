precision highp float;

varying vec2 v_TexCoordinate;

vec4 rnm(in vec2 tc) {
    float timer = 0.4;
    float noise = sin(dot(tc + vec2(timer, timer), vec2(12.9898, 78.233))) * 43758.5453;
    float noiseR = fract(noise) * 2.0 - 1.0;
    float noiseG = fract(noise * 1.2154) * 2.0 - 1.0;
    float noiseB = fract(noise * 1.3453) * 2.0 - 1.0;
    float noiseA = fract(noise * 1.3647) * 2.0 - 1.0;
    return vec4(noiseR, noiseG, noiseB, noiseA);
}

float fade(in float t) {
    return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);
}

float pnoise3D(in vec3 p) {
    vec3 pi = 0.00195313 * floor(p) + 0.00195313;
    vec3 pf = fract(p);
    float perm00 = rnm(pi.xy).a;
    vec3 grad000 = rnm(vec2(perm00, pi.z)).rgb * 4.0 - 1.0;
    float n000 = dot(grad000, pf);
    vec3 grad001 = rnm(vec2(perm00, pi.z + 0.00195313)).rgb * 4.0 - 1.0;
    float n001 = dot(grad001, pf - vec3(0.0, 0.0, 1.0));
    float perm01 = rnm(pi.xy + vec2(0.0, 0.00195313)).a;
    vec3 grad010 = rnm(vec2(perm01, pi.z)).rgb * 4.0 - 1.0;
    float n010 = dot(grad010, pf - vec3(0.0, 1.0, 0.0));
    vec3 grad011 = rnm(vec2(perm01, pi.z + 0.00195313)).rgb * 4.0 - 1.0;
    float n011 = dot(grad011, pf - vec3(0.0, 1.0, 1.0));
    float perm10 = rnm(pi.xy + vec2(0.00195313, 0.0)).a;
    vec3 grad100 = rnm(vec2(perm10, pi.z)).rgb * 4.0 - 1.0;
    float n100 = dot(grad100, pf - vec3(1.0, 0.0, 0.0));
    vec3 grad101 = rnm(vec2(perm10, pi.z + 0.00195313)).rgb * 4.0 - 1.0;
    float n101 = dot(grad101, pf - vec3(1.0, 0.0, 1.0));
    float perm11 = rnm(pi.xy + vec2(0.00195313, 0.00195313)).a;
    vec3 grad110 = rnm(vec2(perm11, pi.z)).rgb * 4.0 - 1.0;
    float n110 = dot(grad110, pf - vec3(1.0, 1.0, 0.0));
    vec3 grad111 = rnm(vec2(perm11, pi.z + 0.00195313)).rgb * 4.0 - 1.0;
    float n111 = dot(grad111, pf - vec3(1.0, 1.0, 1.0));
    vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));
    vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));
    float n_xyz = mix(n_xy.x, n_xy.y, fade(pf.z));
    return n_xyz;
}

//2d coordinate orientation thing
vec2 coordRot(in vec2 tc, in float angle) {
    float aspect = 1080.0 / 1920.0;
    vec2 uv = (tc * 2.0) - 1.0;
    float rotX = (uv.x * aspect * cos(angle)) - (uv.y * sin(angle));
    float rotY = (uv.y * cos(angle)) + (uv.x * aspect * sin(angle));
    rotX = ((rotX / aspect) * 0.5 + 0.5);
    rotY = rotY * 0.5 + 0.5;
    return vec2(rotX, rotY);
}
vec4 grain() {
    vec2 texCoord = v_TexCoordinate;
    float timer = 0.4;
    float coloramount = 0.4;
    float grainsize = 2.0;
    float lumamount = 0.3;
    vec3 rotOffset = vec3(1.425, 3.892, 5.835);
    vec2 rotCoordsR = coordRot(texCoord, timer + rotOffset.x);
    vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(1024.0 / grainsize, 1024.0 / grainsize), 0.0)));
    vec3 col = vec3(0.5,0.5,0.5);
    vec3 lumcoeff = vec3(0.299, 0.587, 0.114);
    float luminance = lumamount * dot(col, lumcoeff);
    float lum = smoothstep(0.2, 0.0, luminance);
    lum += luminance;
    noise = mix(noise, vec3(0.0), pow(lum, 4.0));
    col = col + noise;

    return vec4(col, 1.0);
}

void main() {
    vec4 outputColor = vec4(0.0,0.0,0.0,1.0);
    outputColor = grain();
    gl_FragColor = vec4(outputColor.rgb,1.0);

}