attribute vec2 a_position;
varying float v_topY;
varying vec2 v_position;

uniform float u_time;
uniform float u_amplitude;
uniform float u_frequency;
uniform float u_current_wave_height;
uniform float u_phase;
uniform float u_stripes_count;

void main() {

    const float VALLEY_DEPTH = 0.15;
    const float BASE_OFFSET = 0.07;
    const float GLASS_REFRACTION = 0.5;
    const float MIN_DISPLACEMENT_STRENGTH = 0.7;
    const float MAX_DISPLACEMENT_STRENGTH = 1.4;
    const float BASE_DIRECTION = 0.3;
    const float PI = 3.14159;

    float t = u_time;

    float freqBaseX = a_position.x * u_frequency;
    float phaseHalf = u_phase * 0.5;

    // Waves to merge
   float f1 = 0.2 * sin(freqBaseX * 1.0 + phaseHalf) +
              0.15 * sin(freqBaseX * 2.7 + phaseHalf);
   float f2 = 0.15 * sin(freqBaseX * 2.0 + u_phase + 0.5);
   float f3 = 0.25 * sin(freqBaseX * 1.8 + u_phase + 0.3);
   float f4 = 0.15 * sin(freqBaseX * 2.0 + u_phase);

    float wA = 0.5 + 0.5 * sin(t);
    wA = smoothstep(0.0, 1.0, wA);

    // Resulted wave A after merging f1 and f2
    float waveA = mix(f1, f2, wA);

    float wB = 0.5 + 0.5 * sin(t + PI);
    wB = smoothstep(0.0, 1.0, wB);

    // Resulted wave B after merging f2 and f4
    float waveB = mix(f3, f4, wB);

    float switchW = 0.5 + 0.5 * sin(t * 0.4);
    switchW = smoothstep(0.0, 1.0, switchW);

    // Final wave after merging wave A and wave B
    float finalWave = mix(waveA, waveB, switchW);

    float eased_t = 0.5 - 0.5 * cos(t * PI);
    float topY = finalWave * u_amplitude + u_current_wave_height;

    float tNorm = 0.5 + 0.5 * sin(u_time);

    // The higher value the stronger displacement is
    float displacementStrength = mix(MIN_DISPLACEMENT_STRENGTH, MAX_DISPLACEMENT_STRENGTH, tNorm);

    float u = (a_position.x + 1.0) * 0.5;

    float xShift = fract(u * u_stripes_count) - 0.5;
    float displacement = xShift * GLASS_REFRACTION;

    float edgeFactor = clamp(abs(xShift) * 2.1, 0.0, 1.0);
    float valley = pow(edgeFactor, 1.9) * VALLEY_DEPTH + BASE_OFFSET;

    float df1 = 0.2 * cos(freqBaseX * 1.0 + phaseHalf) * u_frequency * 1.0 +
                0.15 * cos(freqBaseX * 2.7 + phaseHalf) * u_frequency * 2.7;
    float df2 = 0.15 * cos(freqBaseX * 2.0 + u_phase + 0.5) * u_frequency * 2.0;
    float df3 = 0.25 * cos(freqBaseX * 1.8 + u_phase + 0.3) * u_frequency * 1.8;
    float df4 = 0.15 * cos(freqBaseX * 2.0 + u_phase) * u_frequency * 2.0;

    float dwaveA = mix(df1, df2, wA);
    float dwaveB = mix(df3, df4, wB);
    float waveSlope = mix(dwaveA, dwaveB, switchW);

    float slopeNorm = clamp(waveSlope * 0.8, -1.0, 1.0);

    float direction = slopeNorm + BASE_DIRECTION * sign(xShift + 0.001);

    float displacementEffect = displacement * displacementStrength * direction;

    topY += displacementEffect - valley;

    float bottomY = -1.0 - displacementEffect * 0.5;

    float y = a_position.y < 0.0 ? bottomY : topY;

    gl_Position = vec4(a_position.x, y, 0.0, 1.0);

    v_position = vec2(a_position.x, y);
    v_topY = topY;
}
