package com.plaid.internal;

/* renamed from: com.plaid.internal.l7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3684l7 {
    PRE_CHECK(16),
    DEVICE_DESCRIPTOR(32),
    START(48),
    AUTHENTICATION(64),
    FINISH(80);


    /* renamed from: a, reason: collision with root package name */
    public final int f40772a;

    EnumC3684l7(int i10) {
        this.f40772a = i10;
    }

    public int getCode() {
        return this.f40772a;
    }
}
