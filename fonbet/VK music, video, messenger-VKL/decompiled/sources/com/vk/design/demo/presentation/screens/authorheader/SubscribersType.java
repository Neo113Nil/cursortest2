package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class SubscribersType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubscribersType[] $VALUES;
    public static final SubscribersType Default;
    public static final SubscribersType Empty;

    static {
        SubscribersType subscribersType = new SubscribersType("Default", 0);
        Default = subscribersType;
        SubscribersType subscribersType2 = new SubscribersType("Empty", 1);
        Empty = subscribersType2;
        SubscribersType[] subscribersTypeArr = {subscribersType, subscribersType2};
        $VALUES = subscribersTypeArr;
        $ENTRIES = new asp(subscribersTypeArr);
    }

    public SubscribersType() {
        throw null;
    }

    public static SubscribersType valueOf(String str) {
        return (SubscribersType) Enum.valueOf(SubscribersType.class, str);
    }

    public static SubscribersType[] values() {
        return (SubscribersType[]) $VALUES.clone();
    }
}
