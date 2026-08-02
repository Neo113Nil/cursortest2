package com.vk.clips.sdk.screens.feed.helpers.scroll;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScrollEvent.kt */
/* loaded from: classes17.dex */
public final class ScrollEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScrollEvent[] $VALUES;
    public static final ScrollEvent DRAGGING;
    public static final ScrollEvent IDLE;
    public static final ScrollEvent SETTLING;

    static {
        ScrollEvent scrollEvent = new ScrollEvent("IDLE", 0);
        IDLE = scrollEvent;
        ScrollEvent scrollEvent2 = new ScrollEvent("DRAGGING", 1);
        DRAGGING = scrollEvent2;
        ScrollEvent scrollEvent3 = new ScrollEvent("SETTLING", 2);
        SETTLING = scrollEvent3;
        ScrollEvent[] scrollEventArr = {scrollEvent, scrollEvent2, scrollEvent3};
        $VALUES = scrollEventArr;
        $ENTRIES = new asp(scrollEventArr);
    }

    public ScrollEvent() {
        throw null;
    }

    public static ScrollEvent valueOf(String str) {
        return (ScrollEvent) Enum.valueOf(ScrollEvent.class, str);
    }

    public static ScrollEvent[] values() {
        return (ScrollEvent[]) $VALUES.clone();
    }
}
