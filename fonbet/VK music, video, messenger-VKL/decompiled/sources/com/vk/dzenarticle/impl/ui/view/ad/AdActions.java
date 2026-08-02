package com.vk.dzenarticle.impl.ui.view.ad;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdActions.kt */
/* loaded from: classes18.dex */
public final class AdActions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdActions[] $VALUES;
    public static final AdActions ADS_COPY_URL;
    public static final AdActions ADS_RECOMMENDATIONS_INFO;
    public static final AdActions ADV_INFO;
    public static final AdActions AD_MARKER_TEMPLATE;
    public static final AdActions DEBUG;
    public static final AdActions DISCLAIMER;
    public static final AdActions ERID;
    public static final AdActions ILLEGAL_HIDE;
    public static final AdActions NOT_INTERESTED;
    public static final AdActions OFFENSIVE_HIDE;
    public static final AdActions PURCHASED;
    public static final AdActions REPORT;
    public static final AdActions SCAM_HIDE;
    public static final AdActions SEXUAL_HIDE;
    public static final AdActions SHOW_ADVERTISER_INFO;
    public static final AdActions TOO_MANY;
    private final String alias;

    static {
        AdActions adActions = new AdActions("DEBUG", 0, "debug");
        DEBUG = adActions;
        AdActions adActions2 = new AdActions("ADS_COPY_URL", 1, "ads_copy_url");
        ADS_COPY_URL = adActions2;
        AdActions adActions3 = new AdActions("SHOW_ADVERTISER_INFO", 2, "show_advertiser_info");
        SHOW_ADVERTISER_INFO = adActions3;
        AdActions adActions4 = new AdActions("ADV_INFO", 3, "adv_info");
        ADV_INFO = adActions4;
        AdActions adActions5 = new AdActions("ERID", 4, "erid");
        ERID = adActions5;
        AdActions adActions6 = new AdActions("ADS_RECOMMENDATIONS_INFO", 5, "ads_recommendations_info");
        ADS_RECOMMENDATIONS_INFO = adActions6;
        AdActions adActions7 = new AdActions("AD_MARKER_TEMPLATE", 6, "ad_marker_template");
        AD_MARKER_TEMPLATE = adActions7;
        AdActions adActions8 = new AdActions("NOT_INTERESTED", 7, "not_interested");
        NOT_INTERESTED = adActions8;
        AdActions adActions9 = new AdActions("PURCHASED", 8, "purchased");
        PURCHASED = adActions9;
        AdActions adActions10 = new AdActions("TOO_MANY", 9, "too_many");
        TOO_MANY = adActions10;
        AdActions adActions11 = new AdActions("OFFENSIVE_HIDE", 10, "offensive_hide");
        OFFENSIVE_HIDE = adActions11;
        AdActions adActions12 = new AdActions("SEXUAL_HIDE", 11, "sexual_hide");
        SEXUAL_HIDE = adActions12;
        AdActions adActions13 = new AdActions("ILLEGAL_HIDE", 12, "illegal_hide");
        ILLEGAL_HIDE = adActions13;
        AdActions adActions14 = new AdActions("SCAM_HIDE", 13, "scam_hide");
        SCAM_HIDE = adActions14;
        AdActions adActions15 = new AdActions("REPORT", 14, "report");
        REPORT = adActions15;
        AdActions adActions16 = new AdActions("DISCLAIMER", 15, "disclaimer");
        DISCLAIMER = adActions16;
        AdActions[] adActionsArr = {adActions, adActions2, adActions3, adActions4, adActions5, adActions6, adActions7, adActions8, adActions9, adActions10, adActions11, adActions12, adActions13, adActions14, adActions15, adActions16};
        $VALUES = adActionsArr;
        $ENTRIES = new asp(adActionsArr);
    }

    public AdActions(String str, int i, String str2) {
        this.alias = str2;
    }

    public static AdActions valueOf(String str) {
        return (AdActions) Enum.valueOf(AdActions.class, str);
    }

    public static AdActions[] values() {
        return (AdActions[]) $VALUES.clone();
    }

    public final String h() {
        return this.alias;
    }
}
