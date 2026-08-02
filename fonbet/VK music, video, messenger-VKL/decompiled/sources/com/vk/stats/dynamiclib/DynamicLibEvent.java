package com.vk.stats.dynamiclib;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DynamicLibEvent.kt */
/* loaded from: classes5.dex */
public final class DynamicLibEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DynamicLibEvent[] $VALUES;
    public static final DynamicLibEvent CANCEL;
    public static final DynamicLibEvent ERROR;
    public static final DynamicLibEvent START;
    public static final DynamicLibEvent SUCCESS;
    private final String value;

    static {
        DynamicLibEvent dynamicLibEvent = new DynamicLibEvent("START", 0, "start");
        START = dynamicLibEvent;
        DynamicLibEvent dynamicLibEvent2 = new DynamicLibEvent("CANCEL", 1, "cancel");
        CANCEL = dynamicLibEvent2;
        DynamicLibEvent dynamicLibEvent3 = new DynamicLibEvent("ERROR", 2, "error");
        ERROR = dynamicLibEvent3;
        DynamicLibEvent dynamicLibEvent4 = new DynamicLibEvent("SUCCESS", 3, "success");
        SUCCESS = dynamicLibEvent4;
        DynamicLibEvent[] dynamicLibEventArr = {dynamicLibEvent, dynamicLibEvent2, dynamicLibEvent3, dynamicLibEvent4};
        $VALUES = dynamicLibEventArr;
        $ENTRIES = new asp(dynamicLibEventArr);
    }

    public DynamicLibEvent(String str, int i, String str2) {
        this.value = str2;
    }

    public static DynamicLibEvent valueOf(String str) {
        return (DynamicLibEvent) Enum.valueOf(DynamicLibEvent.class, str);
    }

    public static DynamicLibEvent[] values() {
        return (DynamicLibEvent[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
