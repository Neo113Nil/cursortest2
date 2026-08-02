package lh;

import kotlin.UShort;

/* loaded from: classes3.dex */
public abstract class b {
    public static final short a(int i10) {
        return f(i10);
    }

    public static final short b(int i10) {
        return e(i10);
    }

    public static int d(short s10, short s11) {
        return c(((s10 & UShort.MAX_VALUE) << 16) | (s11 & UShort.MAX_VALUE));
    }

    public static final short e(int i10) {
        return UShort.m428constructorimpl((short) (i10 & 65535));
    }

    public static final short f(int i10) {
        return UShort.m428constructorimpl((short) (i10 >>> 16));
    }

    public static int c(int i10) {
        return i10;
    }
}
