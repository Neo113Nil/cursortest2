package com.plaid.internal;

/* renamed from: com.plaid.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3673k5 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40731a;

    static {
        int[] iArr = new int[EnumC3664j5.values().length];
        try {
            iArr[EnumC3664j5.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC3664j5.DEVELOPMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC3664j5.SANDBOX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f40731a = iArr;
    }
}
