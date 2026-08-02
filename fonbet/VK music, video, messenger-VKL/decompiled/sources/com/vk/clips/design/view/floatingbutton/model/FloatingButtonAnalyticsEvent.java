package com.vk.clips.design.view.floatingbutton.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FloatingButtonAnalytics.kt */
/* loaded from: classes16.dex */
public final class FloatingButtonAnalyticsEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FloatingButtonAnalyticsEvent[] $VALUES;
    public static final FloatingButtonAnalyticsEvent BUTTON_CLICK;
    public static final FloatingButtonAnalyticsEvent BUTTON_CLOSE;
    public static final FloatingButtonAnalyticsEvent BUTTON_SHOW;
    public static final FloatingButtonAnalyticsEvent MODAL_CARD_CTA_BUTTON_CLICK;

    static {
        FloatingButtonAnalyticsEvent floatingButtonAnalyticsEvent = new FloatingButtonAnalyticsEvent("BUTTON_SHOW", 0);
        BUTTON_SHOW = floatingButtonAnalyticsEvent;
        FloatingButtonAnalyticsEvent floatingButtonAnalyticsEvent2 = new FloatingButtonAnalyticsEvent("BUTTON_CLICK", 1);
        BUTTON_CLICK = floatingButtonAnalyticsEvent2;
        FloatingButtonAnalyticsEvent floatingButtonAnalyticsEvent3 = new FloatingButtonAnalyticsEvent("BUTTON_CLOSE", 2);
        BUTTON_CLOSE = floatingButtonAnalyticsEvent3;
        FloatingButtonAnalyticsEvent floatingButtonAnalyticsEvent4 = new FloatingButtonAnalyticsEvent("MODAL_CARD_CTA_BUTTON_CLICK", 3);
        MODAL_CARD_CTA_BUTTON_CLICK = floatingButtonAnalyticsEvent4;
        FloatingButtonAnalyticsEvent[] floatingButtonAnalyticsEventArr = {floatingButtonAnalyticsEvent, floatingButtonAnalyticsEvent2, floatingButtonAnalyticsEvent3, floatingButtonAnalyticsEvent4};
        $VALUES = floatingButtonAnalyticsEventArr;
        $ENTRIES = new asp(floatingButtonAnalyticsEventArr);
    }

    public FloatingButtonAnalyticsEvent() {
        throw null;
    }

    public static FloatingButtonAnalyticsEvent valueOf(String str) {
        return (FloatingButtonAnalyticsEvent) Enum.valueOf(FloatingButtonAnalyticsEvent.class, str);
    }

    public static FloatingButtonAnalyticsEvent[] values() {
        return (FloatingButtonAnalyticsEvent[]) $VALUES.clone();
    }
}
