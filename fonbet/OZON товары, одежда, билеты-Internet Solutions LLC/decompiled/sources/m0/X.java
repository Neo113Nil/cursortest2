package m0;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes8.dex */
public final class X {
    public static final float a(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float b(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }
}
