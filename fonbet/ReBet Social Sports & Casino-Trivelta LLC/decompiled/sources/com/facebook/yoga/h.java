package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f31673a;

    h(int i10) {
        this.f31673a = i10;
    }

    public static h b(int i10) {
        if (i10 == 0) {
            return INHERIT;
        }
        if (i10 == 1) {
            return LTR;
        }
        if (i10 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }

    public int c() {
        return this.f31673a;
    }
}
