package com.vk.superapp.api.dto.app;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppLifecycleEvent.kt */
/* loaded from: classes6.dex */
public final class AppLifecycleEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppLifecycleEvent[] $VALUES;
    public static final AppLifecycleEvent ON_CLOSE;
    public static final AppLifecycleEvent ON_START;
    private final String key;

    static {
        AppLifecycleEvent appLifecycleEvent = new AppLifecycleEvent("ON_START", 0, "on_start");
        ON_START = appLifecycleEvent;
        AppLifecycleEvent appLifecycleEvent2 = new AppLifecycleEvent("ON_CLOSE", 1, "on_close");
        ON_CLOSE = appLifecycleEvent2;
        AppLifecycleEvent[] appLifecycleEventArr = {appLifecycleEvent, appLifecycleEvent2};
        $VALUES = appLifecycleEventArr;
        $ENTRIES = new asp(appLifecycleEventArr);
    }

    public AppLifecycleEvent(String str, int i, String str2) {
        this.key = str2;
    }

    public static AppLifecycleEvent valueOf(String str) {
        return (AppLifecycleEvent) Enum.valueOf(AppLifecycleEvent.class, str);
    }

    public static AppLifecycleEvent[] values() {
        return (AppLifecycleEvent[]) $VALUES.clone();
    }
}
