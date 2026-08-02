package k1;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7456b {
    public static final long a(float f7, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
        int i11 = C7455a.f70272c;
        return floatToRawIntBits;
    }
}
