package com.vk.core.ui.themes;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavigationBarStyle.kt */
/* loaded from: classes.dex */
public final class NavigationBarStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NavigationBarStyle[] $VALUES;
    public static final NavigationBarStyle DARK;
    public static final NavigationBarStyle DYNAMIC;
    public static final NavigationBarStyle LIGHT;

    static {
        NavigationBarStyle navigationBarStyle = new NavigationBarStyle("LIGHT", 0);
        LIGHT = navigationBarStyle;
        NavigationBarStyle navigationBarStyle2 = new NavigationBarStyle("DARK", 1);
        DARK = navigationBarStyle2;
        NavigationBarStyle navigationBarStyle3 = new NavigationBarStyle("DYNAMIC", 2);
        DYNAMIC = navigationBarStyle3;
        NavigationBarStyle[] navigationBarStyleArr = {navigationBarStyle, navigationBarStyle2, navigationBarStyle3};
        $VALUES = navigationBarStyleArr;
        $ENTRIES = new asp(navigationBarStyleArr);
    }

    public NavigationBarStyle() {
        throw null;
    }

    public static NavigationBarStyle valueOf(String str) {
        return (NavigationBarStyle) Enum.valueOf(NavigationBarStyle.class, str);
    }

    public static NavigationBarStyle[] values() {
        return (NavigationBarStyle[]) $VALUES.clone();
    }
}
