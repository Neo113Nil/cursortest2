package com.vk.superapp.browser.internal.ui.shortcats;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: ShortcutPendingData.kt */
/* loaded from: classes6.dex */
public final class ShortcutPendingData {
    public final String a;
    public final ShortcutSource b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortcutPendingData.kt */
    public static final class ShortcutSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ShortcutSource[] $VALUES;
        public static final ShortcutSource ACTION_MENU;
        public static final ShortcutSource BRIDGE;
        public static final ShortcutSource REQUEST;

        static {
            ShortcutSource shortcutSource = new ShortcutSource("BRIDGE", 0);
            BRIDGE = shortcutSource;
            ShortcutSource shortcutSource2 = new ShortcutSource("ACTION_MENU", 1);
            ACTION_MENU = shortcutSource2;
            ShortcutSource shortcutSource3 = new ShortcutSource("REQUEST", 2);
            REQUEST = shortcutSource3;
            ShortcutSource[] shortcutSourceArr = {shortcutSource, shortcutSource2, shortcutSource3};
            $VALUES = shortcutSourceArr;
            $ENTRIES = new asp(shortcutSourceArr);
        }

        public ShortcutSource() {
            throw null;
        }

        public static ShortcutSource valueOf(String str) {
            return (ShortcutSource) Enum.valueOf(ShortcutSource.class, str);
        }

        public static ShortcutSource[] values() {
            return (ShortcutSource[]) $VALUES.clone();
        }
    }

    public ShortcutPendingData(String str, ShortcutSource shortcutSource) {
        this.a = str;
        this.b = shortcutSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortcutPendingData)) {
            return false;
        }
        ShortcutPendingData shortcutPendingData = (ShortcutPendingData) obj;
        return epx.f(this.a, shortcutPendingData.a) && this.b == shortcutPendingData.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ShortcutPendingData(pendingIdForShortcut=" + this.a + ", source=" + this.b + ')';
    }
}
