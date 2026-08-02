package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoViewerItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("type_screen")
    private final TypeScreen typeScreen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class TypeScreen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeScreen[] $VALUES;

        @pmi0("type_video_about")
        public static final TypeScreen TYPE_VIDEO_ABOUT;

        @pmi0("type_video_discovery")
        public static final TypeScreen TYPE_VIDEO_DISCOVERY;

        static {
            TypeScreen typeScreen = new TypeScreen("TYPE_VIDEO_ABOUT", 0);
            TYPE_VIDEO_ABOUT = typeScreen;
            TypeScreen typeScreen2 = new TypeScreen("TYPE_VIDEO_DISCOVERY", 1);
            TYPE_VIDEO_DISCOVERY = typeScreen2;
            TypeScreen[] typeScreenArr = {typeScreen, typeScreen2};
            $VALUES = typeScreenArr;
            $ENTRIES = new asp(typeScreenArr);
        }

        private TypeScreen(String str, int i) {
        }

        public static TypeScreen valueOf(String str) {
            return (TypeScreen) Enum.valueOf(TypeScreen.class, str);
        }

        public static TypeScreen[] values() {
            return (TypeScreen[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoViewerItem(TypeScreen typeScreen) {
        this.typeScreen = typeScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoViewerItem) && this.typeScreen == ((MobileOfficialAppsVideoStat$TypeVideoViewerItem) obj).typeScreen;
    }

    public final int hashCode() {
        return this.typeScreen.hashCode();
    }

    public final String toString() {
        return "TypeVideoViewerItem(typeScreen=" + this.typeScreen + ')';
    }
}
