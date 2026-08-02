package com.vk.clips.design.view.sidecontrols.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvailabilityConfig.kt */
/* loaded from: classes16.dex */
public final class AvailabilityConfig {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AvailabilityConfig[] $VALUES;
    public static final AvailabilityConfig AVAILABLE;
    public static final a Companion;
    public static final AvailabilityConfig UNAVAILABLE;
    private final boolean isAvailable;

    /* compiled from: AvailabilityConfig.kt */
    public static final class a {
    }

    static {
        AvailabilityConfig availabilityConfig = new AvailabilityConfig("AVAILABLE", 0, true);
        AVAILABLE = availabilityConfig;
        AvailabilityConfig availabilityConfig2 = new AvailabilityConfig("UNAVAILABLE", 1, false);
        UNAVAILABLE = availabilityConfig2;
        AvailabilityConfig[] availabilityConfigArr = {availabilityConfig, availabilityConfig2};
        $VALUES = availabilityConfigArr;
        $ENTRIES = new asp(availabilityConfigArr);
        Companion = new a();
    }

    public AvailabilityConfig(String str, int i, boolean z) {
        this.isAvailable = z;
    }

    public static AvailabilityConfig valueOf(String str) {
        return (AvailabilityConfig) Enum.valueOf(AvailabilityConfig.class, str);
    }

    public static AvailabilityConfig[] values() {
        return (AvailabilityConfig[]) $VALUES.clone();
    }

    public final boolean h() {
        return this.isAvailable;
    }
}
