package com.vk.ads.externalsdkstat.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExternalSdk.kt */
/* loaded from: classes14.dex */
public final class ExternalSdk {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExternalSdk[] $VALUES;
    public static final ExternalSdk APPLOVIN_MAX;
    public static final ExternalSdk UNITY_LEVEL_PLAY;
    public static final ExternalSdk YANDEX;
    private final String sdkName;

    static {
        ExternalSdk externalSdk = new ExternalSdk("APPLOVIN_MAX", 0, "applovin_max");
        APPLOVIN_MAX = externalSdk;
        ExternalSdk externalSdk2 = new ExternalSdk("YANDEX", 1, "yandex_ads");
        YANDEX = externalSdk2;
        ExternalSdk externalSdk3 = new ExternalSdk("UNITY_LEVEL_PLAY", 2, "unity_level_play");
        UNITY_LEVEL_PLAY = externalSdk3;
        ExternalSdk[] externalSdkArr = {externalSdk, externalSdk2, externalSdk3};
        $VALUES = externalSdkArr;
        $ENTRIES = new asp(externalSdkArr);
    }

    public ExternalSdk(String str, int i, String str2) {
        this.sdkName = str2;
    }

    public static ExternalSdk valueOf(String str) {
        return (ExternalSdk) Enum.valueOf(ExternalSdk.class, str);
    }

    public static ExternalSdk[] values() {
        return (ExternalSdk[]) $VALUES.clone();
    }

    public final String h() {
        return this.sdkName;
    }
}
