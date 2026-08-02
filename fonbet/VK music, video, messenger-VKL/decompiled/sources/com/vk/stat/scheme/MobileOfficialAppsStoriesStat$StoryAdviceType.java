package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStoriesStat$StoryAdviceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsStoriesStat$StoryAdviceType[] $VALUES;

    @pmi0("advice_avatar")
    public static final MobileOfficialAppsStoriesStat$StoryAdviceType ADVICE_AVATAR;

    @pmi0("memories_friends")
    public static final MobileOfficialAppsStoriesStat$StoryAdviceType MEMORIES_FRIENDS;

    @pmi0("memories_photo")
    public static final MobileOfficialAppsStoriesStat$StoryAdviceType MEMORIES_PHOTO;

    @pmi0("memories_post")
    public static final MobileOfficialAppsStoriesStat$StoryAdviceType MEMORIES_POST;

    @pmi0("memories_registered")
    public static final MobileOfficialAppsStoriesStat$StoryAdviceType MEMORIES_REGISTERED;

    @pmi0("memories_story")
    public static final MobileOfficialAppsStoriesStat$StoryAdviceType MEMORIES_STORY;

    static {
        MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType = new MobileOfficialAppsStoriesStat$StoryAdviceType("MEMORIES_FRIENDS", 0);
        MEMORIES_FRIENDS = mobileOfficialAppsStoriesStat$StoryAdviceType;
        MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType2 = new MobileOfficialAppsStoriesStat$StoryAdviceType("MEMORIES_PHOTO", 1);
        MEMORIES_PHOTO = mobileOfficialAppsStoriesStat$StoryAdviceType2;
        MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType3 = new MobileOfficialAppsStoriesStat$StoryAdviceType("MEMORIES_POST", 2);
        MEMORIES_POST = mobileOfficialAppsStoriesStat$StoryAdviceType3;
        MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType4 = new MobileOfficialAppsStoriesStat$StoryAdviceType("MEMORIES_STORY", 3);
        MEMORIES_STORY = mobileOfficialAppsStoriesStat$StoryAdviceType4;
        MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType5 = new MobileOfficialAppsStoriesStat$StoryAdviceType("MEMORIES_REGISTERED", 4);
        MEMORIES_REGISTERED = mobileOfficialAppsStoriesStat$StoryAdviceType5;
        MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType6 = new MobileOfficialAppsStoriesStat$StoryAdviceType("ADVICE_AVATAR", 5);
        ADVICE_AVATAR = mobileOfficialAppsStoriesStat$StoryAdviceType6;
        MobileOfficialAppsStoriesStat$StoryAdviceType[] mobileOfficialAppsStoriesStat$StoryAdviceTypeArr = {mobileOfficialAppsStoriesStat$StoryAdviceType, mobileOfficialAppsStoriesStat$StoryAdviceType2, mobileOfficialAppsStoriesStat$StoryAdviceType3, mobileOfficialAppsStoriesStat$StoryAdviceType4, mobileOfficialAppsStoriesStat$StoryAdviceType5, mobileOfficialAppsStoriesStat$StoryAdviceType6};
        $VALUES = mobileOfficialAppsStoriesStat$StoryAdviceTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsStoriesStat$StoryAdviceTypeArr);
    }

    private MobileOfficialAppsStoriesStat$StoryAdviceType(String str, int i) {
    }

    public static MobileOfficialAppsStoriesStat$StoryAdviceType valueOf(String str) {
        return (MobileOfficialAppsStoriesStat$StoryAdviceType) Enum.valueOf(MobileOfficialAppsStoriesStat$StoryAdviceType.class, str);
    }

    public static MobileOfficialAppsStoriesStat$StoryAdviceType[] values() {
        return (MobileOfficialAppsStoriesStat$StoryAdviceType[]) $VALUES.clone();
    }
}
