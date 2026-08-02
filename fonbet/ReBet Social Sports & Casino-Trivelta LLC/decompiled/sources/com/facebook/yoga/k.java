package com.facebook.yoga;

/* loaded from: classes2.dex */
public enum k {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Integer.MAX_VALUE),
    CLASSIC(2147483646);


    /* renamed from: a, reason: collision with root package name */
    public final int f31694a;

    k(int i10) {
        this.f31694a = i10;
    }

    public int b() {
        return this.f31694a;
    }
}
