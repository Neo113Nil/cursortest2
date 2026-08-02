package com.vk.clips.upload.vk.ui.impl.fragment;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsUploadFeatureCell.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadFeatureCell {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsUploadFeatureCell[] $VALUES;
    public static final ClipsUploadFeatureCell AllowRepost;
    public static final ClipsUploadFeatureCell ClosedProfileBanner;
    public static final ClipsUploadFeatureCell Coauthors;
    public static final ClipsUploadFeatureCell EasyPromote;
    public static final ClipsUploadFeatureCell EasyPromoteSettings;
    public static final ClipsUploadFeatureCell EcommInvolvement;
    public static final ClipsUploadFeatureCell Geolocation;
    public static final ClipsUploadFeatureCell LicenseAgreementBanner;
    public static final ClipsUploadFeatureCell LinksAttach;
    public static final ClipsUploadFeatureCell MarketAttachments;
    public static final ClipsUploadFeatureCell Playlists;
    public static final ClipsUploadFeatureCell PostToMain;
    public static final ClipsUploadFeatureCell Privacy;
    public static final ClipsUploadFeatureCell RedirectBanner;
    public static final ClipsUploadFeatureCell VideoAttachment;
    public static final ClipsUploadFeatureCell VideoAttachmentOnboarding;
    private final String tag;

    static {
        ClipsUploadFeatureCell clipsUploadFeatureCell = new ClipsUploadFeatureCell("Geolocation", 0, "geo");
        Geolocation = clipsUploadFeatureCell;
        ClipsUploadFeatureCell clipsUploadFeatureCell2 = new ClipsUploadFeatureCell("Privacy", 1, "privacy");
        Privacy = clipsUploadFeatureCell2;
        ClipsUploadFeatureCell clipsUploadFeatureCell3 = new ClipsUploadFeatureCell("LinksAttach", 2, "links");
        LinksAttach = clipsUploadFeatureCell3;
        ClipsUploadFeatureCell clipsUploadFeatureCell4 = new ClipsUploadFeatureCell("Coauthors", 3, "coauthor");
        Coauthors = clipsUploadFeatureCell4;
        ClipsUploadFeatureCell clipsUploadFeatureCell5 = new ClipsUploadFeatureCell("Playlists", 4, "playlist");
        Playlists = clipsUploadFeatureCell5;
        ClipsUploadFeatureCell clipsUploadFeatureCell6 = new ClipsUploadFeatureCell("MarketAttachments", 5, "market");
        MarketAttachments = clipsUploadFeatureCell6;
        ClipsUploadFeatureCell clipsUploadFeatureCell7 = new ClipsUploadFeatureCell("EcommInvolvement", 6, "ecomm_cta");
        EcommInvolvement = clipsUploadFeatureCell7;
        ClipsUploadFeatureCell clipsUploadFeatureCell8 = new ClipsUploadFeatureCell("VideoAttachment", 7, "video_attach");
        VideoAttachment = clipsUploadFeatureCell8;
        ClipsUploadFeatureCell clipsUploadFeatureCell9 = new ClipsUploadFeatureCell("LicenseAgreementBanner", 8, "license_agreement_banner");
        LicenseAgreementBanner = clipsUploadFeatureCell9;
        ClipsUploadFeatureCell clipsUploadFeatureCell10 = new ClipsUploadFeatureCell("ClosedProfileBanner", 9, "closed_profile_banner");
        ClosedProfileBanner = clipsUploadFeatureCell10;
        ClipsUploadFeatureCell clipsUploadFeatureCell11 = new ClipsUploadFeatureCell("EasyPromote", 10, "easy_promote");
        EasyPromote = clipsUploadFeatureCell11;
        ClipsUploadFeatureCell clipsUploadFeatureCell12 = new ClipsUploadFeatureCell("EasyPromoteSettings", 11, "easy_promote_settings");
        EasyPromoteSettings = clipsUploadFeatureCell12;
        ClipsUploadFeatureCell clipsUploadFeatureCell13 = new ClipsUploadFeatureCell("RedirectBanner", 12, "redirect_banner");
        RedirectBanner = clipsUploadFeatureCell13;
        ClipsUploadFeatureCell clipsUploadFeatureCell14 = new ClipsUploadFeatureCell("PostToMain", 13, "post_to_main");
        PostToMain = clipsUploadFeatureCell14;
        ClipsUploadFeatureCell clipsUploadFeatureCell15 = new ClipsUploadFeatureCell("AllowRepost", 14, "allow_stories_repost");
        AllowRepost = clipsUploadFeatureCell15;
        ClipsUploadFeatureCell clipsUploadFeatureCell16 = new ClipsUploadFeatureCell("VideoAttachmentOnboarding", 15, "video_attachment_onboarding");
        VideoAttachmentOnboarding = clipsUploadFeatureCell16;
        ClipsUploadFeatureCell[] clipsUploadFeatureCellArr = {clipsUploadFeatureCell, clipsUploadFeatureCell2, clipsUploadFeatureCell3, clipsUploadFeatureCell4, clipsUploadFeatureCell5, clipsUploadFeatureCell6, clipsUploadFeatureCell7, clipsUploadFeatureCell8, clipsUploadFeatureCell9, clipsUploadFeatureCell10, clipsUploadFeatureCell11, clipsUploadFeatureCell12, clipsUploadFeatureCell13, clipsUploadFeatureCell14, clipsUploadFeatureCell15, clipsUploadFeatureCell16};
        $VALUES = clipsUploadFeatureCellArr;
        $ENTRIES = new asp(clipsUploadFeatureCellArr);
    }

    public ClipsUploadFeatureCell(String str, int i, String str2) {
        this.tag = str2;
    }

    public static zrp<ClipsUploadFeatureCell> h() {
        return $ENTRIES;
    }

    public static ClipsUploadFeatureCell valueOf(String str) {
        return (ClipsUploadFeatureCell) Enum.valueOf(ClipsUploadFeatureCell.class, str);
    }

    public static ClipsUploadFeatureCell[] values() {
        return (ClipsUploadFeatureCell[]) $VALUES.clone();
    }

    public final String i() {
        return this.tag;
    }
}
