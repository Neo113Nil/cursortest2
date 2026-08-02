package com.vk.dto.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfferVkVideo.kt */
/* loaded from: classes18.dex */
public final class OfferVkVideo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OfferVkVideo[] $VALUES;
    public static final a Companion;
    public static final OfferVkVideo KIDS;
    public static final OfferVkVideo LISTING;
    public static final OfferVkVideo NONE;
    public static final OfferVkVideo SPORTS;
    private final String key;

    /* compiled from: OfferVkVideo.kt */
    public static final class a {
    }

    static {
        OfferVkVideo offerVkVideo = new OfferVkVideo("LISTING", 0, "limited_listing_video");
        LISTING = offerVkVideo;
        OfferVkVideo offerVkVideo2 = new OfferVkVideo("SPORTS", 1, "limited_listing_sports");
        SPORTS = offerVkVideo2;
        OfferVkVideo offerVkVideo3 = new OfferVkVideo("KIDS", 2, "limited_listing_kids");
        KIDS = offerVkVideo3;
        OfferVkVideo offerVkVideo4 = new OfferVkVideo("NONE", 3, "");
        NONE = offerVkVideo4;
        OfferVkVideo[] offerVkVideoArr = {offerVkVideo, offerVkVideo2, offerVkVideo3, offerVkVideo4};
        $VALUES = offerVkVideoArr;
        $ENTRIES = new asp(offerVkVideoArr);
        Companion = new a();
    }

    public OfferVkVideo(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<OfferVkVideo> h() {
        return $ENTRIES;
    }

    public static OfferVkVideo valueOf(String str) {
        return (OfferVkVideo) Enum.valueOf(OfferVkVideo.class, str);
    }

    public static OfferVkVideo[] values() {
        return (OfferVkVideo[]) $VALUES.clone();
    }

    public final String i() {
        return this.key;
    }
}
