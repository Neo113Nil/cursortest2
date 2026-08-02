package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsButtonConfig.kt */
/* loaded from: classes6.dex */
public final class AdsBtnAlgorithmStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsBtnAlgorithmStyle[] $VALUES;
    public static final a Companion;
    public static final AdsBtnAlgorithmStyle V1;
    public static final AdsBtnAlgorithmStyle V2;
    private final String algorithmStyle;

    /* compiled from: AdsButtonConfig.kt */
    public static final class a {
    }

    static {
        AdsBtnAlgorithmStyle adsBtnAlgorithmStyle = new AdsBtnAlgorithmStyle("V1", 0, "v1");
        V1 = adsBtnAlgorithmStyle;
        AdsBtnAlgorithmStyle adsBtnAlgorithmStyle2 = new AdsBtnAlgorithmStyle("V2", 1, "v2");
        V2 = adsBtnAlgorithmStyle2;
        AdsBtnAlgorithmStyle[] adsBtnAlgorithmStyleArr = {adsBtnAlgorithmStyle, adsBtnAlgorithmStyle2};
        $VALUES = adsBtnAlgorithmStyleArr;
        $ENTRIES = new asp(adsBtnAlgorithmStyleArr);
        Companion = new a();
    }

    public AdsBtnAlgorithmStyle(String str, int i, String str2) {
        this.algorithmStyle = str2;
    }

    public static AdsBtnAlgorithmStyle valueOf(String str) {
        return (AdsBtnAlgorithmStyle) Enum.valueOf(AdsBtnAlgorithmStyle.class, str);
    }

    public static AdsBtnAlgorithmStyle[] values() {
        return (AdsBtnAlgorithmStyle[]) $VALUES.clone();
    }
}
