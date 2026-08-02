package org.chromium.base;

/* loaded from: classes10.dex */
public class MathUtils {
    public static final float EPSILON = 0.001f;

    public static float clamp(float value, float a2, float b) {
        float f = a2 > b ? b : a2;
        if (a2 <= b) {
            a2 = b;
        }
        return value < f ? f : value > a2 ? a2 : value;
    }

    public static int clamp(int value, int a2, int b) {
        int i = a2 > b ? b : a2;
        if (a2 <= b) {
            a2 = b;
        }
        return value < i ? i : value > a2 ? a2 : value;
    }

    public static long clamp(long value, long a2, long b) {
        long j = a2 > b ? b : a2;
        if (a2 <= b) {
            a2 = b;
        }
        return value < j ? j : value > a2 ? a2 : value;
    }

    public static float flipSignIf(float value, boolean flipSign) {
        return flipSign ? -value : value;
    }

    public static int flipSignIf(int value, boolean flipSign) {
        return flipSign ? -value : value;
    }

    public static float interpolate(float value, float target, float speed) {
        return value + ((target - value) * speed);
    }

    public static float map(float value, float fromStart, float fromStop, float toStart, float toStop) {
        return toStart + ((toStop - toStart) * ((value - fromStart) / (fromStop - fromStart)));
    }

    public static float smoothstep(float t) {
        return t * t * (3.0f - (t * 2.0f));
    }

    private MathUtils() {
    }

    public static int positiveModulo(int a2, int b) {
        int i = a2 % b;
        return i >= 0 ? i : i + b;
    }

    public static boolean areFloatsEqual(float f1, float f2) {
        return Math.abs(f1 - f2) < 0.001f;
    }

    public static float distance(float x1, float y1, float x2, float y2) {
        float f = x2 - x1;
        float f2 = y2 - y1;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static float distance(float distanceX, float distanceY) {
        return (float) Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
    }

    public static double roundTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0d) / 100.0d;
    }
}
