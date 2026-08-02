package com.plaid.internal;

import com.plaid.link.configuration.LinkLogLevel;

/* loaded from: classes3.dex */
public final /* synthetic */ class E2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f39227a;

    static {
        int[] iArr = new int[LinkLogLevel.values().length];
        try {
            iArr[LinkLogLevel.ASSERT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkLogLevel.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LinkLogLevel.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LinkLogLevel.INFO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LinkLogLevel.VERBOSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LinkLogLevel.WARN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f39227a = iArr;
    }
}
