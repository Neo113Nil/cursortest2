package com.vk.superapp.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WidgetSettingsModalOpenSource.kt */
/* loaded from: classes6.dex */
public final class WidgetSettingsModalOpenSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WidgetSettingsModalOpenSource[] $VALUES;
    public static final a Companion;
    public static final WidgetSettingsModalOpenSource ERROR_DIALOG;
    public static final WidgetSettingsModalOpenSource MINI_WIDGET_LONG_TAP;
    public static final WidgetSettingsModalOpenSource MINI_WIDGET_SETTINGS;
    public static final WidgetSettingsModalOpenSource ONBOARDING_MODAL;
    public static final WidgetSettingsModalOpenSource RETURN_WIDGETS_ONBOARDING_MODAL;
    public static final WidgetSettingsModalOpenSource SETTINGS_BUTTON_WIDGET;
    public static final WidgetSettingsModalOpenSource WIDGET_RIGHT_MENU;
    private final int sourceId;

    /* compiled from: WidgetSettingsModalOpenSource.kt */
    public static final class a {
    }

    static {
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource = new WidgetSettingsModalOpenSource("MINI_WIDGET_SETTINGS", 0, 1);
        MINI_WIDGET_SETTINGS = widgetSettingsModalOpenSource;
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource2 = new WidgetSettingsModalOpenSource("MINI_WIDGET_LONG_TAP", 1, 2);
        MINI_WIDGET_LONG_TAP = widgetSettingsModalOpenSource2;
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource3 = new WidgetSettingsModalOpenSource("WIDGET_RIGHT_MENU", 2, 3);
        WIDGET_RIGHT_MENU = widgetSettingsModalOpenSource3;
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource4 = new WidgetSettingsModalOpenSource("SETTINGS_BUTTON_WIDGET", 3, 4);
        SETTINGS_BUTTON_WIDGET = widgetSettingsModalOpenSource4;
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource5 = new WidgetSettingsModalOpenSource("ONBOARDING_MODAL", 4, 5);
        ONBOARDING_MODAL = widgetSettingsModalOpenSource5;
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource6 = new WidgetSettingsModalOpenSource("RETURN_WIDGETS_ONBOARDING_MODAL", 5, 6);
        RETURN_WIDGETS_ONBOARDING_MODAL = widgetSettingsModalOpenSource6;
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource7 = new WidgetSettingsModalOpenSource("ERROR_DIALOG", 6, 7);
        ERROR_DIALOG = widgetSettingsModalOpenSource7;
        WidgetSettingsModalOpenSource[] widgetSettingsModalOpenSourceArr = {widgetSettingsModalOpenSource, widgetSettingsModalOpenSource2, widgetSettingsModalOpenSource3, widgetSettingsModalOpenSource4, widgetSettingsModalOpenSource5, widgetSettingsModalOpenSource6, widgetSettingsModalOpenSource7};
        $VALUES = widgetSettingsModalOpenSourceArr;
        $ENTRIES = new asp(widgetSettingsModalOpenSourceArr);
        Companion = new a();
    }

    public WidgetSettingsModalOpenSource(String str, int i, int i2) {
        this.sourceId = i2;
    }

    public static WidgetSettingsModalOpenSource valueOf(String str) {
        return (WidgetSettingsModalOpenSource) Enum.valueOf(WidgetSettingsModalOpenSource.class, str);
    }

    public static WidgetSettingsModalOpenSource[] values() {
        return (WidgetSettingsModalOpenSource[]) $VALUES.clone();
    }

    public final int h() {
        return this.sourceId;
    }
}
