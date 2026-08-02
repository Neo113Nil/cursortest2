package javazoom.jl.decoder;

/* loaded from: classes9.dex */
public final class Equalizer {
    private static final int BANDS = 32;
    public static final float BAND_NOT_PRESENT = Float.NEGATIVE_INFINITY;
    public static final Equalizer PASS_THRU_EQ = new Equalizer();
    private final float[] settings;

    public static abstract class EQFunction {
        public float getBand(int i) {
            return 0.0f;
        }
    }

    private float limit(float f) {
        if (f != Float.NEGATIVE_INFINITY) {
            if (f > 1.0f) {
                return 1.0f;
            }
            if (f < -1.0f) {
                return -1.0f;
            }
        }
        return f;
    }

    public Equalizer() {
        this.settings = new float[32];
    }

    public Equalizer(float[] fArr) {
        this.settings = new float[32];
        setFrom(fArr);
    }

    public Equalizer(EQFunction eQFunction) {
        this.settings = new float[32];
        setFrom(eQFunction);
    }

    public void setFrom(float[] fArr) {
        reset();
        int length = fArr.length <= 32 ? fArr.length : 32;
        for (int i = 0; i < length; i++) {
            this.settings[i] = limit(fArr[i]);
        }
    }

    public void setFrom(EQFunction eQFunction) {
        reset();
        for (int i = 0; i < 32; i++) {
            this.settings[i] = limit(eQFunction.getBand(i));
        }
    }

    public void setFrom(Equalizer equalizer) {
        if (equalizer != this) {
            setFrom(equalizer.settings);
        }
    }

    public void reset() {
        for (int i = 0; i < 32; i++) {
            this.settings[i] = 0.0f;
        }
    }

    public int getBandCount() {
        return this.settings.length;
    }

    public float setBand(int i, float f) {
        if (i < 0 || i >= 32) {
            return 0.0f;
        }
        float[] fArr = this.settings;
        float f2 = fArr[i];
        fArr[i] = limit(f);
        return f2;
    }

    public float getBand(int i) {
        if (i < 0 || i >= 32) {
            return 0.0f;
        }
        return this.settings[i];
    }

    float[] getBandFactors() {
        float[] fArr = new float[32];
        for (int i = 0; i < 32; i++) {
            fArr[i] = getBandFactor(this.settings[i]);
        }
        return fArr;
    }

    float getBandFactor(float f) {
        if (f == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return (float) Math.pow(2.0d, f);
    }
}
