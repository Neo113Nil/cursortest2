package com.vk.tabbar.settings.impl.mvi;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabbarSettingsMvi.kt */
/* loaded from: classes6.dex */
public final class InteractSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InteractSource[] $VALUES;
    public static final InteractSource NOT_USER_INTERACT;
    public static final InteractSource USER_INTERACT_WITH_BOTTOM_PANEL;
    public static final InteractSource USER_INTERACT_WITH_MAIN_PANEL;

    static {
        InteractSource interactSource = new InteractSource("USER_INTERACT_WITH_MAIN_PANEL", 0);
        USER_INTERACT_WITH_MAIN_PANEL = interactSource;
        InteractSource interactSource2 = new InteractSource("USER_INTERACT_WITH_BOTTOM_PANEL", 1);
        USER_INTERACT_WITH_BOTTOM_PANEL = interactSource2;
        InteractSource interactSource3 = new InteractSource("NOT_USER_INTERACT", 2);
        NOT_USER_INTERACT = interactSource3;
        InteractSource[] interactSourceArr = {interactSource, interactSource2, interactSource3};
        $VALUES = interactSourceArr;
        $ENTRIES = new asp(interactSourceArr);
    }

    public InteractSource() {
        throw null;
    }

    public static InteractSource valueOf(String str) {
        return (InteractSource) Enum.valueOf(InteractSource.class, str);
    }

    public static InteractSource[] values() {
        return (InteractSource[]) $VALUES.clone();
    }
}
