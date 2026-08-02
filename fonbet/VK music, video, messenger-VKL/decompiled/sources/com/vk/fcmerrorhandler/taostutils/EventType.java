package com.vk.fcmerrorhandler.taostutils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventType.kt */
/* loaded from: classes18.dex */
public final class EventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    public static final EventType COLD_START;
    public static final EventType PUSH_NOTIFICATION;

    static {
        EventType eventType = new EventType("COLD_START", 0);
        COLD_START = eventType;
        EventType eventType2 = new EventType("PUSH_NOTIFICATION", 1);
        PUSH_NOTIFICATION = eventType2;
        EventType[] eventTypeArr = {eventType, eventType2};
        $VALUES = eventTypeArr;
        $ENTRIES = new asp(eventTypeArr);
    }

    public EventType() {
        throw null;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }
}
