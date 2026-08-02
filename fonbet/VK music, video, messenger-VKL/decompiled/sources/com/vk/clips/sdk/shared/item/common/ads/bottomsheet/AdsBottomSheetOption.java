package com.vk.clips.sdk.shared.item.common.ads.bottomsheet;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsBottomSheetOption.kt */
/* loaded from: classes17.dex */
public final class AdsBottomSheetOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsBottomSheetOption[] $VALUES;
    public static final AdsBottomSheetOption ADVERTISER_INFO;
    public static final AdsBottomSheetOption COPY_AD_MARKER;
    public static final AdsBottomSheetOption COPY_LINK;
    public static final AdsBottomSheetOption NOT_INTERESTED;
    public static final AdsBottomSheetOption REPORT;

    static {
        AdsBottomSheetOption adsBottomSheetOption = new AdsBottomSheetOption("COPY_LINK", 0);
        COPY_LINK = adsBottomSheetOption;
        AdsBottomSheetOption adsBottomSheetOption2 = new AdsBottomSheetOption("ADVERTISER_INFO", 1);
        ADVERTISER_INFO = adsBottomSheetOption2;
        AdsBottomSheetOption adsBottomSheetOption3 = new AdsBottomSheetOption("COPY_AD_MARKER", 2);
        COPY_AD_MARKER = adsBottomSheetOption3;
        AdsBottomSheetOption adsBottomSheetOption4 = new AdsBottomSheetOption("NOT_INTERESTED", 3);
        NOT_INTERESTED = adsBottomSheetOption4;
        AdsBottomSheetOption adsBottomSheetOption5 = new AdsBottomSheetOption("REPORT", 4);
        REPORT = adsBottomSheetOption5;
        AdsBottomSheetOption[] adsBottomSheetOptionArr = {adsBottomSheetOption, adsBottomSheetOption2, adsBottomSheetOption3, adsBottomSheetOption4, adsBottomSheetOption5};
        $VALUES = adsBottomSheetOptionArr;
        $ENTRIES = new asp(adsBottomSheetOptionArr);
    }

    public AdsBottomSheetOption() {
        throw null;
    }

    public static AdsBottomSheetOption valueOf(String str) {
        return (AdsBottomSheetOption) Enum.valueOf(AdsBottomSheetOption.class, str);
    }

    public static AdsBottomSheetOption[] values() {
        return (AdsBottomSheetOption[]) $VALUES.clone();
    }
}
