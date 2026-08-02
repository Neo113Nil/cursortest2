package com.inmobi.ads;

import com.inmobi.ads.InMobiBanner;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InMobiBanner.AnimationType.values().length];
        try {
            iArr[InMobiBanner.AnimationType.ANIMATION_ALPHA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InMobiBanner.AnimationType.ROTATE_HORIZONTAL_AXIS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InMobiBanner.AnimationType.ROTATE_VERTICAL_AXIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
