package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum w {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3),
    MAX_CONTENT(4),
    FIT_CONTENT(5),
    STRETCH(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f31732a;

    w(int i10) {
        this.f31732a = i10;
    }

    public static w b(int i10) {
        switch (i10) {
            case 0:
                return UNDEFINED;
            case 1:
                return POINT;
            case 2:
                return PERCENT;
            case 3:
                return AUTO;
            case 4:
                return MAX_CONTENT;
            case 5:
                return FIT_CONTENT;
            case 6:
                return STRETCH;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i10);
        }
    }

    public int c() {
        return this.f31732a;
    }
}
