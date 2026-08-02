package com.unity3d.ads.adplayer;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HandlerType.kt */
/* loaded from: classes14.dex */
public final class HandlerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HandlerType[] $VALUES;
    private final String jsPath;
    public static final HandlerType CALLBACK = new HandlerType("CALLBACK", 0, "handleCallback");
    public static final HandlerType INVOCATION = new HandlerType("INVOCATION", 1, "handleInvocation");
    public static final HandlerType EVENT = new HandlerType("EVENT", 2, "handleEvent");

    private static final /* synthetic */ HandlerType[] $values() {
        return new HandlerType[]{CALLBACK, INVOCATION, EVENT};
    }

    static {
        HandlerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private HandlerType(String str, int i, String str2) {
        this.jsPath = str2;
    }

    public static zrp<HandlerType> getEntries() {
        return $ENTRIES;
    }

    public static HandlerType valueOf(String str) {
        return (HandlerType) Enum.valueOf(HandlerType.class, str);
    }

    public static HandlerType[] values() {
        return (HandlerType[]) $VALUES.clone();
    }

    public final String getJsPath() {
        return this.jsPath;
    }
}
