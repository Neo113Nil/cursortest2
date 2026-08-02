package com.vk.channels.impl.post_settings.adapter;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostSettingsAdapterItem.kt */
/* loaded from: classes16.dex */
public final class PostSettingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostSettingType[] $VALUES;
    public static final PostSettingType ADD_AUTHOR_SIGN;
    public static final PostSettingType DELAYED_SEND;
    public static final PostSettingType ENABLE_COMMENTS;
    public static final PostSettingType HIDE_ONLY_PHOTOS;
    public static final PostSettingType MARK_ADVERTISEMENT;
    public static final PostSettingType ONLY_VISIBLE_TO_DONS;
    public static final PostSettingType POST_FOR_DONS;
    public static final PostSettingType PUBLISH_STORY;
    public static final PostSettingType SEND_NOTIFICATIONS;

    static {
        PostSettingType postSettingType = new PostSettingType("DELAYED_SEND", 0);
        DELAYED_SEND = postSettingType;
        PostSettingType postSettingType2 = new PostSettingType("ENABLE_COMMENTS", 1);
        ENABLE_COMMENTS = postSettingType2;
        PostSettingType postSettingType3 = new PostSettingType("ADD_AUTHOR_SIGN", 2);
        ADD_AUTHOR_SIGN = postSettingType3;
        PostSettingType postSettingType4 = new PostSettingType("SEND_NOTIFICATIONS", 3);
        SEND_NOTIFICATIONS = postSettingType4;
        PostSettingType postSettingType5 = new PostSettingType("ONLY_VISIBLE_TO_DONS", 4);
        ONLY_VISIBLE_TO_DONS = postSettingType5;
        PostSettingType postSettingType6 = new PostSettingType("POST_FOR_DONS", 5);
        POST_FOR_DONS = postSettingType6;
        PostSettingType postSettingType7 = new PostSettingType("MARK_ADVERTISEMENT", 6);
        MARK_ADVERTISEMENT = postSettingType7;
        PostSettingType postSettingType8 = new PostSettingType("PUBLISH_STORY", 7);
        PUBLISH_STORY = postSettingType8;
        PostSettingType postSettingType9 = new PostSettingType("HIDE_ONLY_PHOTOS", 8);
        HIDE_ONLY_PHOTOS = postSettingType9;
        PostSettingType[] postSettingTypeArr = {postSettingType, postSettingType2, postSettingType3, postSettingType4, postSettingType5, postSettingType6, postSettingType7, postSettingType8, postSettingType9};
        $VALUES = postSettingTypeArr;
        $ENTRIES = new asp(postSettingTypeArr);
    }

    public PostSettingType() {
        throw null;
    }

    public static PostSettingType valueOf(String str) {
        return (PostSettingType) Enum.valueOf(PostSettingType.class, str);
    }

    public static PostSettingType[] values() {
        return (PostSettingType[]) $VALUES.clone();
    }
}
