package com.blaze.blazesdk.app_configurations.models.ads;

import com.blaze.blazesdk.app_configurations.models.ads.AdsConfigurationsDto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AdsConfigurationsDto.ConfigType.values().length];
        try {
            iArr[AdsConfigurationsDto.ConfigType.Story.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdsConfigurationsDto.ConfigType.Moment.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdsConfigurationsDto.ConfigType.Video.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[AdsConfigurationsDto.AdsLocationType.values().length];
        try {
            iArr2[AdsConfigurationsDto.AdsLocationType.EveryXStories.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AdsConfigurationsDto.AdsLocationType.EveryXPages.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AdsConfigurationsDto.AdsLocationType.FixedPages.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AdsConfigurationsDto.AdsLocationType.FixedPercentages.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
