package com.vk.newsfeed.api.stats;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsEntryEventItemType.kt */
/* loaded from: classes3.dex */
public final class NewsEntryEventItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsEntryEventItemType[] $VALUES;
    public static final NewsEntryEventItemType CLIP;
    public static final NewsEntryEventItemType PHOTO;
    public static final NewsEntryEventItemType POST;
    public static final NewsEntryEventItemType VIDEO;

    static {
        NewsEntryEventItemType newsEntryEventItemType = new NewsEntryEventItemType("POST", 0);
        POST = newsEntryEventItemType;
        NewsEntryEventItemType newsEntryEventItemType2 = new NewsEntryEventItemType("PHOTO", 1);
        PHOTO = newsEntryEventItemType2;
        NewsEntryEventItemType newsEntryEventItemType3 = new NewsEntryEventItemType("CLIP", 2);
        CLIP = newsEntryEventItemType3;
        NewsEntryEventItemType newsEntryEventItemType4 = new NewsEntryEventItemType(SignalingProtocol.MEDIA_OPTION_VIDEO, 3);
        VIDEO = newsEntryEventItemType4;
        NewsEntryEventItemType[] newsEntryEventItemTypeArr = {newsEntryEventItemType, newsEntryEventItemType2, newsEntryEventItemType3, newsEntryEventItemType4};
        $VALUES = newsEntryEventItemTypeArr;
        $ENTRIES = new asp(newsEntryEventItemTypeArr);
    }

    public NewsEntryEventItemType() {
        throw null;
    }

    public static NewsEntryEventItemType valueOf(String str) {
        return (NewsEntryEventItemType) Enum.valueOf(NewsEntryEventItemType.class, str);
    }

    public static NewsEntryEventItemType[] values() {
        return (NewsEntryEventItemType[]) $VALUES.clone();
    }
}
