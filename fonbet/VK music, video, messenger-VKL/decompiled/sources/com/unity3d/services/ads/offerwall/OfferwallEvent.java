package com.unity3d.services.ads.offerwall;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfferwallEvent.kt */
/* loaded from: classes14.dex */
public final class OfferwallEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OfferwallEvent[] $VALUES;
    public static final OfferwallEvent REQUEST_SUCCESS = new OfferwallEvent("REQUEST_SUCCESS", 0);
    public static final OfferwallEvent REQUEST_FAILED = new OfferwallEvent("REQUEST_FAILED", 1);
    public static final OfferwallEvent ON_CONTENT_READY = new OfferwallEvent("ON_CONTENT_READY", 2);
    public static final OfferwallEvent ON_CONTENT_SHOW = new OfferwallEvent("ON_CONTENT_SHOW", 3);
    public static final OfferwallEvent ON_CONTENT_DISMISS = new OfferwallEvent("ON_CONTENT_DISMISS", 4);
    public static final OfferwallEvent SHOW_FAILED = new OfferwallEvent("SHOW_FAILED", 5);

    private static final /* synthetic */ OfferwallEvent[] $values() {
        return new OfferwallEvent[]{REQUEST_SUCCESS, REQUEST_FAILED, ON_CONTENT_READY, ON_CONTENT_SHOW, ON_CONTENT_DISMISS, SHOW_FAILED};
    }

    static {
        OfferwallEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private OfferwallEvent(String str, int i) {
    }

    public static zrp<OfferwallEvent> getEntries() {
        return $ENTRIES;
    }

    public static OfferwallEvent valueOf(String str) {
        return (OfferwallEvent) Enum.valueOf(OfferwallEvent.class, str);
    }

    public static OfferwallEvent[] values() {
        return (OfferwallEvent[]) $VALUES.clone();
    }
}
