package com.blaze.blazesdk.style.widgets;

import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlazeLiveStreamStatus.values().length];
        try {
            iArr[BlazeLiveStreamStatus.LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlazeLiveStreamStatus.UPCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BlazeLiveStreamStatus.ENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
