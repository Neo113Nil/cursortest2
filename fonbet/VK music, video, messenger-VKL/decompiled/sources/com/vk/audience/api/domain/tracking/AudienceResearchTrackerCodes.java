package com.vk.audience.api.domain.tracking;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudienceResearchTrackerCodes.kt */
/* loaded from: classes15.dex */
public final class AudienceResearchTrackerCodes {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudienceResearchTrackerCodes[] $VALUES;
    public static final AudienceResearchTrackerCodes DZEN_ARTICLE_PING;
    public static final AudienceResearchTrackerCodes DZEN_ARTICLE_START;
    public static final AudienceResearchTrackerCodes DZEN_ARTICLE_STOP;
    public static final AudienceResearchTrackerCodes DZEN_CAROUSEL_PING;
    public static final AudienceResearchTrackerCodes DZEN_CAROUSEL_START;
    public static final AudienceResearchTrackerCodes DZEN_CAROUSEL_STOP;
    public static final AudienceResearchTrackerCodes DZEN_NEWS_PING;
    public static final AudienceResearchTrackerCodes DZEN_NEWS_START;
    public static final AudienceResearchTrackerCodes DZEN_NEWS_STOP;
    public static final AudienceResearchTrackerCodes DZEN_STORY_PING;
    public static final AudienceResearchTrackerCodes DZEN_STORY_START;
    public static final AudienceResearchTrackerCodes DZEN_STORY_STOP;
    private final String code;

    static {
        AudienceResearchTrackerCodes audienceResearchTrackerCodes = new AudienceResearchTrackerCodes("DZEN_NEWS_START", 0, "532631");
        DZEN_NEWS_START = audienceResearchTrackerCodes;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes2 = new AudienceResearchTrackerCodes("DZEN_NEWS_PING", 1, "542631");
        DZEN_NEWS_PING = audienceResearchTrackerCodes2;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes3 = new AudienceResearchTrackerCodes("DZEN_NEWS_STOP", 2, "552631");
        DZEN_NEWS_STOP = audienceResearchTrackerCodes3;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes4 = new AudienceResearchTrackerCodes("DZEN_STORY_START", 3, "532611");
        DZEN_STORY_START = audienceResearchTrackerCodes4;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes5 = new AudienceResearchTrackerCodes("DZEN_STORY_PING", 4, "542611");
        DZEN_STORY_PING = audienceResearchTrackerCodes5;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes6 = new AudienceResearchTrackerCodes("DZEN_STORY_STOP", 5, "552611");
        DZEN_STORY_STOP = audienceResearchTrackerCodes6;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes7 = new AudienceResearchTrackerCodes("DZEN_CAROUSEL_START", 6, "532631");
        DZEN_CAROUSEL_START = audienceResearchTrackerCodes7;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes8 = new AudienceResearchTrackerCodes("DZEN_CAROUSEL_PING", 7, "542631");
        DZEN_CAROUSEL_PING = audienceResearchTrackerCodes8;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes9 = new AudienceResearchTrackerCodes("DZEN_CAROUSEL_STOP", 8, "552631");
        DZEN_CAROUSEL_STOP = audienceResearchTrackerCodes9;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes10 = new AudienceResearchTrackerCodes("DZEN_ARTICLE_START", 9, "532611");
        DZEN_ARTICLE_START = audienceResearchTrackerCodes10;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes11 = new AudienceResearchTrackerCodes("DZEN_ARTICLE_PING", 10, "542611");
        DZEN_ARTICLE_PING = audienceResearchTrackerCodes11;
        AudienceResearchTrackerCodes audienceResearchTrackerCodes12 = new AudienceResearchTrackerCodes("DZEN_ARTICLE_STOP", 11, "552611");
        DZEN_ARTICLE_STOP = audienceResearchTrackerCodes12;
        AudienceResearchTrackerCodes[] audienceResearchTrackerCodesArr = {audienceResearchTrackerCodes, audienceResearchTrackerCodes2, audienceResearchTrackerCodes3, audienceResearchTrackerCodes4, audienceResearchTrackerCodes5, audienceResearchTrackerCodes6, audienceResearchTrackerCodes7, audienceResearchTrackerCodes8, audienceResearchTrackerCodes9, audienceResearchTrackerCodes10, audienceResearchTrackerCodes11, audienceResearchTrackerCodes12};
        $VALUES = audienceResearchTrackerCodesArr;
        $ENTRIES = new asp(audienceResearchTrackerCodesArr);
    }

    public AudienceResearchTrackerCodes(String str, int i, String str2) {
        this.code = str2;
    }

    public static AudienceResearchTrackerCodes valueOf(String str) {
        return (AudienceResearchTrackerCodes) Enum.valueOf(AudienceResearchTrackerCodes.class, str);
    }

    public static AudienceResearchTrackerCodes[] values() {
        return (AudienceResearchTrackerCodes[]) $VALUES.clone();
    }

    public final String h() {
        return this.code;
    }
}
