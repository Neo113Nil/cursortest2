package com.vk.audience.api.domain;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudienceResearchSurfaceCode.kt */
/* loaded from: classes15.dex */
public final class AudienceResearchSurfaceCode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudienceResearchSurfaceCode[] $VALUES;
    public static final AudienceResearchSurfaceCode ARTICLE;
    public static final AudienceResearchSurfaceCode BOOKMARKS_ARTICLE;
    public static final AudienceResearchSurfaceCode BOOKMARKS_POST;
    public static final AudienceResearchSurfaceCode DETAILED_POST;
    public static final AudienceResearchSurfaceCode DZEN_ARTICLE;
    public static final AudienceResearchSurfaceCode DZEN_ARTICLE_CAROUSEL;
    public static final AudienceResearchSurfaceCode DZEN_NEWS;
    public static final AudienceResearchSurfaceCode DZEN_STORY;
    public static final AudienceResearchSurfaceCode MEDIADISCOVER;
    public static final AudienceResearchSurfaceCode MESSENGER_CHANNEL_POST;
    public static final AudienceResearchSurfaceCode MESSENGER_CHANNEL_REPOST;
    public static final AudienceResearchSurfaceCode MESSENGER_CHAT_ARTICLE;
    public static final AudienceResearchSurfaceCode MESSENGER_CHAT_REPOST;
    public static final AudienceResearchSurfaceCode MESSENGER_DIALOG_ARTICLE;
    public static final AudienceResearchSurfaceCode MESSENGER_DIALOG_REPOST;
    public static final AudienceResearchSurfaceCode NEWS_POST;
    public static final AudienceResearchSurfaceCode OTHER;
    public static final AudienceResearchSurfaceCode POST;
    public static final AudienceResearchSurfaceCode SEARCH_POST;
    public static final AudienceResearchSurfaceCode STORY_STICKER_POST;
    public static final AudienceResearchSurfaceCode WALL_POST;
    private final String code;

    static {
        AudienceResearchSurfaceCode audienceResearchSurfaceCode = new AudienceResearchSurfaceCode("POST", 0, "111");
        POST = audienceResearchSurfaceCode;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode2 = new AudienceResearchSurfaceCode("WALL_POST", 1, "112");
        WALL_POST = audienceResearchSurfaceCode2;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode3 = new AudienceResearchSurfaceCode("DETAILED_POST", 2, "113");
        DETAILED_POST = audienceResearchSurfaceCode3;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode4 = new AudienceResearchSurfaceCode("SEARCH_POST", 3, "114");
        SEARCH_POST = audienceResearchSurfaceCode4;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode5 = new AudienceResearchSurfaceCode("NEWS_POST", 4, "115");
        NEWS_POST = audienceResearchSurfaceCode5;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode6 = new AudienceResearchSurfaceCode("MEDIADISCOVER", 5, "116");
        MEDIADISCOVER = audienceResearchSurfaceCode6;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode7 = new AudienceResearchSurfaceCode("DZEN_NEWS", 6, "211");
        DZEN_NEWS = audienceResearchSurfaceCode7;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode8 = new AudienceResearchSurfaceCode("DZEN_STORY", 7, "212");
        DZEN_STORY = audienceResearchSurfaceCode8;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode9 = new AudienceResearchSurfaceCode("DZEN_ARTICLE_CAROUSEL", 8, "213");
        DZEN_ARTICLE_CAROUSEL = audienceResearchSurfaceCode9;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode10 = new AudienceResearchSurfaceCode("DZEN_ARTICLE", 9, "214");
        DZEN_ARTICLE = audienceResearchSurfaceCode10;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode11 = new AudienceResearchSurfaceCode("ARTICLE", 10, "311");
        ARTICLE = audienceResearchSurfaceCode11;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode12 = new AudienceResearchSurfaceCode("STORY_STICKER_POST", 11, "411");
        STORY_STICKER_POST = audienceResearchSurfaceCode12;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode13 = new AudienceResearchSurfaceCode("MESSENGER_CHANNEL_REPOST", 12, "511");
        MESSENGER_CHANNEL_REPOST = audienceResearchSurfaceCode13;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode14 = new AudienceResearchSurfaceCode("MESSENGER_CHANNEL_POST", 13, "512");
        MESSENGER_CHANNEL_POST = audienceResearchSurfaceCode14;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode15 = new AudienceResearchSurfaceCode("MESSENGER_DIALOG_REPOST", 14, "513");
        MESSENGER_DIALOG_REPOST = audienceResearchSurfaceCode15;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode16 = new AudienceResearchSurfaceCode("MESSENGER_CHAT_REPOST", 15, "514");
        MESSENGER_CHAT_REPOST = audienceResearchSurfaceCode16;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode17 = new AudienceResearchSurfaceCode("MESSENGER_DIALOG_ARTICLE", 16, "515");
        MESSENGER_DIALOG_ARTICLE = audienceResearchSurfaceCode17;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode18 = new AudienceResearchSurfaceCode("MESSENGER_CHAT_ARTICLE", 17, "516");
        MESSENGER_CHAT_ARTICLE = audienceResearchSurfaceCode18;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode19 = new AudienceResearchSurfaceCode("BOOKMARKS_POST", 18, "611");
        BOOKMARKS_POST = audienceResearchSurfaceCode19;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode20 = new AudienceResearchSurfaceCode("BOOKMARKS_ARTICLE", 19, "612");
        BOOKMARKS_ARTICLE = audienceResearchSurfaceCode20;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode21 = new AudienceResearchSurfaceCode(NativeAdContent.ViewTag.OTHER, 20, "711");
        OTHER = audienceResearchSurfaceCode21;
        AudienceResearchSurfaceCode[] audienceResearchSurfaceCodeArr = {audienceResearchSurfaceCode, audienceResearchSurfaceCode2, audienceResearchSurfaceCode3, audienceResearchSurfaceCode4, audienceResearchSurfaceCode5, audienceResearchSurfaceCode6, audienceResearchSurfaceCode7, audienceResearchSurfaceCode8, audienceResearchSurfaceCode9, audienceResearchSurfaceCode10, audienceResearchSurfaceCode11, audienceResearchSurfaceCode12, audienceResearchSurfaceCode13, audienceResearchSurfaceCode14, audienceResearchSurfaceCode15, audienceResearchSurfaceCode16, audienceResearchSurfaceCode17, audienceResearchSurfaceCode18, audienceResearchSurfaceCode19, audienceResearchSurfaceCode20, audienceResearchSurfaceCode21};
        $VALUES = audienceResearchSurfaceCodeArr;
        $ENTRIES = new asp(audienceResearchSurfaceCodeArr);
    }

    public AudienceResearchSurfaceCode(String str, int i, String str2) {
        this.code = str2;
    }

    public static AudienceResearchSurfaceCode valueOf(String str) {
        return (AudienceResearchSurfaceCode) Enum.valueOf(AudienceResearchSurfaceCode.class, str);
    }

    public static AudienceResearchSurfaceCode[] values() {
        return (AudienceResearchSurfaceCode[]) $VALUES.clone();
    }

    public final String h() {
        return this.code;
    }
}
