package com.vk.video.polls.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UxPollEventType.kt */
/* loaded from: classes6.dex */
public final class UxPollEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UxPollEventType[] $VALUES;
    public static final UxPollEventType EntryPointHide;
    public static final UxPollEventType EntryPointView;
    public static final UxPollEventType PollHide;
    public static final UxPollEventType PollShow;
    private final String id;

    static {
        UxPollEventType uxPollEventType = new UxPollEventType("EntryPointHide", 0, "invite_hide");
        EntryPointHide = uxPollEventType;
        UxPollEventType uxPollEventType2 = new UxPollEventType("EntryPointView", 1, "invite_view");
        EntryPointView = uxPollEventType2;
        UxPollEventType uxPollEventType3 = new UxPollEventType("PollShow", 2, "show");
        PollShow = uxPollEventType3;
        UxPollEventType uxPollEventType4 = new UxPollEventType("PollHide", 3, "hide");
        PollHide = uxPollEventType4;
        UxPollEventType[] uxPollEventTypeArr = {uxPollEventType, uxPollEventType2, uxPollEventType3, uxPollEventType4};
        $VALUES = uxPollEventTypeArr;
        $ENTRIES = new asp(uxPollEventTypeArr);
    }

    public UxPollEventType(String str, int i, String str2) {
        this.id = str2;
    }

    public static UxPollEventType valueOf(String str) {
        return (UxPollEventType) Enum.valueOf(UxPollEventType.class, str);
    }

    public static UxPollEventType[] values() {
        return (UxPollEventType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
