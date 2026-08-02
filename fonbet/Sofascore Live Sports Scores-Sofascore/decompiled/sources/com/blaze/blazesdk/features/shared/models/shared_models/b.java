package com.blaze.blazesdk.features.shared.models.shared_models;

import com.blaze.blazesdk.features.shared.models.shared_models.RenditionsDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RenditionsDto.FileTypeDto.values().length];
        try {
            iArr[RenditionsDto.FileTypeDto.MP4.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RenditionsDto.FileTypeDto.HLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RenditionsDto.FileTypeDto.DASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
