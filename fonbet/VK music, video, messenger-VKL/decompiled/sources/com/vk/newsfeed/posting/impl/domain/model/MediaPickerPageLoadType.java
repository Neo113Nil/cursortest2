package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public final class MediaPickerPageLoadType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaPickerPageLoadType[] $VALUES;
    public static final MediaPickerPageLoadType InitialLoad;
    public static final MediaPickerPageLoadType NextPage;
    public static final MediaPickerPageLoadType Reload;

    static {
        MediaPickerPageLoadType mediaPickerPageLoadType = new MediaPickerPageLoadType("Reload", 0);
        Reload = mediaPickerPageLoadType;
        MediaPickerPageLoadType mediaPickerPageLoadType2 = new MediaPickerPageLoadType("InitialLoad", 1);
        InitialLoad = mediaPickerPageLoadType2;
        MediaPickerPageLoadType mediaPickerPageLoadType3 = new MediaPickerPageLoadType("NextPage", 2);
        NextPage = mediaPickerPageLoadType3;
        MediaPickerPageLoadType[] mediaPickerPageLoadTypeArr = {mediaPickerPageLoadType, mediaPickerPageLoadType2, mediaPickerPageLoadType3};
        $VALUES = mediaPickerPageLoadTypeArr;
        $ENTRIES = new asp(mediaPickerPageLoadTypeArr);
    }

    public MediaPickerPageLoadType() {
        throw null;
    }

    public static MediaPickerPageLoadType valueOf(String str) {
        return (MediaPickerPageLoadType) Enum.valueOf(MediaPickerPageLoadType.class, str);
    }

    public static MediaPickerPageLoadType[] values() {
        return (MediaPickerPageLoadType[]) $VALUES.clone();
    }
}
