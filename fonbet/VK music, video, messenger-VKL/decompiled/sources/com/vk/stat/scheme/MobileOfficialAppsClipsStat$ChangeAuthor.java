package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ChangeAuthor {

    @pmi0("nav_screen")
    private final NavScreen navScreen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class NavScreen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NavScreen[] $VALUES;

        @pmi0("clips_camera")
        public static final NavScreen CLIPS_CAMERA;

        @pmi0("clips_editor")
        public static final NavScreen CLIPS_EDITOR;

        @pmi0("clips_publish")
        public static final NavScreen CLIPS_PUBLISH;

        static {
            NavScreen navScreen = new NavScreen("CLIPS_CAMERA", 0);
            CLIPS_CAMERA = navScreen;
            NavScreen navScreen2 = new NavScreen("CLIPS_EDITOR", 1);
            CLIPS_EDITOR = navScreen2;
            NavScreen navScreen3 = new NavScreen("CLIPS_PUBLISH", 2);
            CLIPS_PUBLISH = navScreen3;
            NavScreen[] navScreenArr = {navScreen, navScreen2, navScreen3};
            $VALUES = navScreenArr;
            $ENTRIES = new asp(navScreenArr);
        }

        private NavScreen(String str, int i) {
        }

        public static NavScreen valueOf(String str) {
            return (NavScreen) Enum.valueOf(NavScreen.class, str);
        }

        public static NavScreen[] values() {
            return (NavScreen[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$ChangeAuthor(NavScreen navScreen) {
        this.navScreen = navScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$ChangeAuthor) && this.navScreen == ((MobileOfficialAppsClipsStat$ChangeAuthor) obj).navScreen;
    }

    public final int hashCode() {
        return this.navScreen.hashCode();
    }

    public final String toString() {
        return "ChangeAuthor(navScreen=" + this.navScreen + ')';
    }
}
