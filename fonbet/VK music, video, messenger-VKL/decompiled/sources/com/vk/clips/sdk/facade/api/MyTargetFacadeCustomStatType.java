package com.vk.clips.sdk.facade.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyTargetFacadeCustomStatType.kt */
/* loaded from: classes17.dex */
public final class MyTargetFacadeCustomStatType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MyTargetFacadeCustomStatType[] $VALUES;
    public static final MyTargetFacadeCustomStatType AUDIO_CLICK;
    public static final MyTargetFacadeCustomStatType CLIP_AUTHOR_CLICK;
    public static final MyTargetFacadeCustomStatType CLIP_BOOKMARK;
    public static final MyTargetFacadeCustomStatType CLIP_COMMENT;
    public static final MyTargetFacadeCustomStatType CLIP_LIKE;
    public static final MyTargetFacadeCustomStatType CLIP_SHARE;
    public static final MyTargetFacadeCustomStatType CLIP_SUBSCRIBE;
    public static final MyTargetFacadeCustomStatType CTA_CLICK;
    public static final MyTargetFacadeCustomStatType LINK_EXT;
    private final String value;

    static {
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType = new MyTargetFacadeCustomStatType("AUDIO_CLICK", 0, "audioClick");
        AUDIO_CLICK = myTargetFacadeCustomStatType;
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType2 = new MyTargetFacadeCustomStatType("LINK_EXT", 1, "linkExt");
        LINK_EXT = myTargetFacadeCustomStatType2;
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType3 = new MyTargetFacadeCustomStatType("CLIP_LIKE", 2, "clipLike");
        CLIP_LIKE = myTargetFacadeCustomStatType3;
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType4 = new MyTargetFacadeCustomStatType("CLIP_SUBSCRIBE", 3, "clipSubscribe");
        CLIP_SUBSCRIBE = myTargetFacadeCustomStatType4;
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType5 = new MyTargetFacadeCustomStatType("CLIP_COMMENT", 4, "clipComment");
        CLIP_COMMENT = myTargetFacadeCustomStatType5;
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType6 = new MyTargetFacadeCustomStatType("CLIP_SHARE", 5, "clipShare");
        CLIP_SHARE = myTargetFacadeCustomStatType6;
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType7 = new MyTargetFacadeCustomStatType("CLIP_BOOKMARK", 6, "clipBookmark");
        CLIP_BOOKMARK = myTargetFacadeCustomStatType7;
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType8 = new MyTargetFacadeCustomStatType("CLIP_AUTHOR_CLICK", 7, "clipAuthorClick");
        CLIP_AUTHOR_CLICK = myTargetFacadeCustomStatType8;
        MyTargetFacadeCustomStatType myTargetFacadeCustomStatType9 = new MyTargetFacadeCustomStatType("CTA_CLICK", 8, "click");
        CTA_CLICK = myTargetFacadeCustomStatType9;
        MyTargetFacadeCustomStatType[] myTargetFacadeCustomStatTypeArr = {myTargetFacadeCustomStatType, myTargetFacadeCustomStatType2, myTargetFacadeCustomStatType3, myTargetFacadeCustomStatType4, myTargetFacadeCustomStatType5, myTargetFacadeCustomStatType6, myTargetFacadeCustomStatType7, myTargetFacadeCustomStatType8, myTargetFacadeCustomStatType9};
        $VALUES = myTargetFacadeCustomStatTypeArr;
        $ENTRIES = new asp(myTargetFacadeCustomStatTypeArr);
    }

    public MyTargetFacadeCustomStatType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MyTargetFacadeCustomStatType valueOf(String str) {
        return (MyTargetFacadeCustomStatType) Enum.valueOf(MyTargetFacadeCustomStatType.class, str);
    }

    public static MyTargetFacadeCustomStatType[] values() {
        return (MyTargetFacadeCustomStatType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
