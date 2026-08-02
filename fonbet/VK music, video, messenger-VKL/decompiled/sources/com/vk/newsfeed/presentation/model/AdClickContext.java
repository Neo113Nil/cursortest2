package com.vk.newsfeed.presentation.model;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdClickContext.kt */
/* loaded from: classes4.dex */
public final class AdClickContext {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdClickContext[] $VALUES;
    public static final AdClickContext ADVERTISING_LABEL;
    public static final AdClickContext AGE_RESTRICTION;
    public static final AdClickContext APP_CATEGORY;
    public static final AdClickContext BACKGROUND;
    public static final AdClickContext BUTTON;
    public static final AdClickContext CTA_BUTTON;
    public static final AdClickContext DESCRIPTION;
    public static final AdClickContext DOMAIN;
    public static final AdClickContext FOOTER;
    public static final AdClickContext HEADER;
    public static final AdClickContext ICON;
    public static final AdClickContext IMAGE;
    public static final AdClickContext RATING;
    public static final AdClickContext TEXT;
    public static final AdClickContext TITLE;
    public static final AdClickContext VIDEO;
    public static final AdClickContext VOTES;
    public static final AdClickContext WHOLE_VIEW;
    private final int targetBit;

    static {
        AdClickContext adClickContext = new AdClickContext(NativeAdContent.ViewTag.AD_TITLE, 0, 0);
        TITLE = adClickContext;
        AdClickContext adClickContext2 = new AdClickContext(NativeAdContent.ViewTag.AD_DESCRIPTION, 1, 1);
        DESCRIPTION = adClickContext2;
        AdClickContext adClickContext3 = new AdClickContext(NativeAdContent.ViewTag.AD_ICON, 2, 2);
        ICON = adClickContext3;
        AdClickContext adClickContext4 = new AdClickContext("IMAGE", 3, 3);
        IMAGE = adClickContext4;
        AdClickContext adClickContext5 = new AdClickContext(NativeAdContent.ViewTag.RATING, 4, 4);
        RATING = adClickContext5;
        AdClickContext adClickContext6 = new AdClickContext("VOTES", 5, 5);
        VOTES = adClickContext6;
        AdClickContext adClickContext7 = new AdClickContext("CTA_BUTTON", 6, 6);
        CTA_BUTTON = adClickContext7;
        AdClickContext adClickContext8 = new AdClickContext("AGE_RESTRICTION", 7, 7);
        AGE_RESTRICTION = adClickContext8;
        AdClickContext adClickContext9 = new AdClickContext("ADVERTISING_LABEL", 8, 8);
        ADVERTISING_LABEL = adClickContext9;
        AdClickContext adClickContext10 = new AdClickContext("DOMAIN", 9, 9);
        DOMAIN = adClickContext10;
        AdClickContext adClickContext11 = new AdClickContext("APP_CATEGORY", 10, 10);
        APP_CATEGORY = adClickContext11;
        AdClickContext adClickContext12 = new AdClickContext("BACKGROUND", 11, 11);
        BACKGROUND = adClickContext12;
        AdClickContext adClickContext13 = new AdClickContext("WHOLE_VIEW", 12, 12);
        WHOLE_VIEW = adClickContext13;
        AdClickContext adClickContext14 = new AdClickContext(SignalingProtocol.MEDIA_OPTION_VIDEO, 13, 13);
        VIDEO = adClickContext14;
        AdClickContext adClickContext15 = new AdClickContext("FOOTER", 14, -1);
        FOOTER = adClickContext15;
        AdClickContext adClickContext16 = new AdClickContext("HEADER", 15, 0);
        HEADER = adClickContext16;
        AdClickContext adClickContext17 = new AdClickContext("TEXT", 16, 1);
        TEXT = adClickContext17;
        AdClickContext adClickContext18 = new AdClickContext("BUTTON", 17, 6);
        BUTTON = adClickContext18;
        AdClickContext[] adClickContextArr = {adClickContext, adClickContext2, adClickContext3, adClickContext4, adClickContext5, adClickContext6, adClickContext7, adClickContext8, adClickContext9, adClickContext10, adClickContext11, adClickContext12, adClickContext13, adClickContext14, adClickContext15, adClickContext16, adClickContext17, adClickContext18};
        $VALUES = adClickContextArr;
        $ENTRIES = new asp(adClickContextArr);
    }

    public AdClickContext(String str, int i, int i2) {
        this.targetBit = i2;
    }

    public static AdClickContext valueOf(String str) {
        return (AdClickContext) Enum.valueOf(AdClickContext.class, str);
    }

    public static AdClickContext[] values() {
        return (AdClickContext[]) $VALUES.clone();
    }

    public final int h() {
        return this.targetBit;
    }
}
