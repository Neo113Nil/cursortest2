package com.vk.clips.design.view.sidecontrols.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VisibilityConfig.kt */
/* loaded from: classes16.dex */
public final class VisibilityConfig {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VisibilityConfig[] $VALUES;
    public static final a Companion;
    public static final VisibilityConfig HIDE;
    public static final VisibilityConfig SHOW;
    private final boolean isVisible;

    /* compiled from: VisibilityConfig.kt */
    public static final class a {
    }

    static {
        VisibilityConfig visibilityConfig = new VisibilityConfig("SHOW", 0, true);
        SHOW = visibilityConfig;
        VisibilityConfig visibilityConfig2 = new VisibilityConfig("HIDE", 1, false);
        HIDE = visibilityConfig2;
        VisibilityConfig[] visibilityConfigArr = {visibilityConfig, visibilityConfig2};
        $VALUES = visibilityConfigArr;
        $ENTRIES = new asp(visibilityConfigArr);
        Companion = new a();
    }

    public VisibilityConfig(String str, int i, boolean z) {
        this.isVisible = z;
    }

    public static VisibilityConfig valueOf(String str) {
        return (VisibilityConfig) Enum.valueOf(VisibilityConfig.class, str);
    }

    public static VisibilityConfig[] values() {
        return (VisibilityConfig[]) $VALUES.clone();
    }

    public final boolean h() {
        return this.isVisible;
    }
}
