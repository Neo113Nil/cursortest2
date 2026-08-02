package com.vk.superapp.ui.requests;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WidgetFlags.kt */
/* loaded from: classes6.dex */
public final class WidgetFlags {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WidgetFlags[] $VALUES;
    public static final WidgetFlags HAS_TAB_DOT;
    public static final WidgetFlags IS_ENABLED;
    public static final WidgetFlags IS_SKIP_ANALYTIC;
    public static final WidgetFlags IS_UNREMOVABLE;
    private final long bit;

    static {
        WidgetFlags widgetFlags = new WidgetFlags("IS_ENABLED", 0, 1L);
        IS_ENABLED = widgetFlags;
        WidgetFlags widgetFlags2 = new WidgetFlags("IS_UNREMOVABLE", 1, 2L);
        IS_UNREMOVABLE = widgetFlags2;
        WidgetFlags widgetFlags3 = new WidgetFlags("IS_SKIP_ANALYTIC", 2, 4L);
        IS_SKIP_ANALYTIC = widgetFlags3;
        WidgetFlags widgetFlags4 = new WidgetFlags("HAS_TAB_DOT", 3, 8L);
        HAS_TAB_DOT = widgetFlags4;
        WidgetFlags[] widgetFlagsArr = {widgetFlags, widgetFlags2, widgetFlags3, widgetFlags4};
        $VALUES = widgetFlagsArr;
        $ENTRIES = new asp(widgetFlagsArr);
    }

    public WidgetFlags(String str, int i, long j) {
        this.bit = j;
    }

    public static WidgetFlags valueOf(String str) {
        return (WidgetFlags) Enum.valueOf(WidgetFlags.class, str);
    }

    public static WidgetFlags[] values() {
        return (WidgetFlags[]) $VALUES.clone();
    }

    public final boolean a(long j) {
        return (j & this.bit) > 0;
    }
}
