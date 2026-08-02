package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface kx4 {
    default float C(long j) {
        if (!mfj.a(lfj.b(j), 4294967296L)) {
            t3a.b("Only Sp can convert to Px");
        }
        float[] fArr = pg8.a;
        if (getFontScale() < 1.03f) {
            return getFontScale() * lfj.c(j);
        }
        og8 a = pg8.a(getFontScale());
        if (a != null) {
            return a.b(lfj.c(j));
        }
        return getFontScale() * lfj.c(j);
    }

    default float C0(int i) {
        return i / j();
    }

    default float D0(float f) {
        return f / j();
    }

    default float H0(float f) {
        return j() * f;
    }

    default long N(int i) {
        return u(C0(i));
    }

    default long O(float f) {
        return u(D0(f));
    }

    default long R0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float H0 = H0(s75.b(j));
        float H02 = H0(s75.a(j));
        return (Float.floatToRawIntBits(H0) << 32) | (Float.floatToRawIntBits(H02) & 4294967295L);
    }

    default int e0(float f) {
        float H0 = H0(f);
        if (Float.isInfinite(H0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(H0);
    }

    float getFontScale();

    default float h0(long j) {
        if (!mfj.a(lfj.b(j), 4294967296L)) {
            t3a.b("Only Sp can convert to Px");
        }
        return H0(C(j));
    }

    float j();

    default long u(float f) {
        float[] fArr = pg8.a;
        if (getFontScale() < 1.03f) {
            return v8a.E(4294967296L, f / getFontScale());
        }
        og8 a = pg8.a(getFontScale());
        return v8a.E(4294967296L, a != null ? a.a(f) : f / getFontScale());
    }

    default long v(long j) {
        if (j != 9205357640488583168L) {
            return hz8.i(D0(Float.intBitsToFloat((int) (j >> 32))), D0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}
