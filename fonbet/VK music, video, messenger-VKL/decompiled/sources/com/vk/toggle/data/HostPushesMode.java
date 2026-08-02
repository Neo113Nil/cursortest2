package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HostPushesMode.kt */
/* loaded from: classes11.dex */
public final class HostPushesMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HostPushesMode[] $VALUES;
    public static final a Companion;
    public static final HostPushesMode DISABLED;
    public static final HostPushesMode ENABLED;
    public static final HostPushesMode ENABLED_WITHOUT_GOOGLE_SERVICES;
    private final int value;

    /* compiled from: HostPushesMode.kt */
    public static final class a {
    }

    static {
        HostPushesMode hostPushesMode = new HostPushesMode("DISABLED", 0, 0);
        DISABLED = hostPushesMode;
        HostPushesMode hostPushesMode2 = new HostPushesMode("ENABLED", 1, 1);
        ENABLED = hostPushesMode2;
        HostPushesMode hostPushesMode3 = new HostPushesMode("ENABLED_WITHOUT_GOOGLE_SERVICES", 2, 2);
        ENABLED_WITHOUT_GOOGLE_SERVICES = hostPushesMode3;
        HostPushesMode[] hostPushesModeArr = {hostPushesMode, hostPushesMode2, hostPushesMode3};
        $VALUES = hostPushesModeArr;
        $ENTRIES = new asp(hostPushesModeArr);
        Companion = new a();
    }

    public HostPushesMode(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<HostPushesMode> h() {
        return $ENTRIES;
    }

    public static HostPushesMode valueOf(String str) {
        return (HostPushesMode) Enum.valueOf(HostPushesMode.class, str);
    }

    public static HostPushesMode[] values() {
        return (HostPushesMode[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
