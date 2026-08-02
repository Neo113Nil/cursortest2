package com.vk.movika.sdk.base.utils;

import com.vk.movika.sdk.base.model.VideoVariant;

/* loaded from: classes3.dex */
public final /* synthetic */ class g {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VideoVariant.Type.values().length];
        try {
            iArr[VideoVariant.Type.HLS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoVariant.Type.MP4.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoVariant.Type.DASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VideoVariant.Type.CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
