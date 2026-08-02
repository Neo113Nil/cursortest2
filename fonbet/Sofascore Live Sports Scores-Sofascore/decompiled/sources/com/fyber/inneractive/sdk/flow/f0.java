package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class f0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InneractiveErrorCode.values().length];
        a = iArr;
        try {
            iArr[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[InneractiveErrorCode.NO_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
