package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSharingStat$TypeModalSharingOpen implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("screen_mode")
    private final ScreenMode screenMode;

    @pmi0("sharing_item_type")
    private final MobileOfficialAppsSharingStat$SharingItemType sharingItemType;

    @pmi0("source_ui")
    private final MobileOfficialAppsSharingStat$TypeEventSource sourceUi;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("modal_sharing_external_open")
        public static final Event MODAL_SHARING_EXTERNAL_OPEN;

        @pmi0("modal_sharing_open")
        public static final Event MODAL_SHARING_OPEN;

        static {
            Event event = new Event("MODAL_SHARING_OPEN", 0);
            MODAL_SHARING_OPEN = event;
            Event event2 = new Event("MODAL_SHARING_EXTERNAL_OPEN", 1);
            MODAL_SHARING_EXTERNAL_OPEN = event2;
            Event[] eventArr = {event, event2};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class ScreenMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenMode[] $VALUES;

        @pmi0("discovery")
        public static final ScreenMode DISCOVERY;

        @pmi0("fullscreen_landscape")
        public static final ScreenMode FULLSCREEN_LANDSCAPE;

        @pmi0("fullscreen_portrait")
        public static final ScreenMode FULLSCREEN_PORTRAIT;

        @pmi0("preview")
        public static final ScreenMode PREVIEW;

        static {
            ScreenMode screenMode = new ScreenMode("DISCOVERY", 0);
            DISCOVERY = screenMode;
            ScreenMode screenMode2 = new ScreenMode("FULLSCREEN_PORTRAIT", 1);
            FULLSCREEN_PORTRAIT = screenMode2;
            ScreenMode screenMode3 = new ScreenMode("FULLSCREEN_LANDSCAPE", 2);
            FULLSCREEN_LANDSCAPE = screenMode3;
            ScreenMode screenMode4 = new ScreenMode("PREVIEW", 3);
            PREVIEW = screenMode4;
            ScreenMode[] screenModeArr = {screenMode, screenMode2, screenMode3, screenMode4};
            $VALUES = screenModeArr;
            $ENTRIES = new asp(screenModeArr);
        }

        private ScreenMode(String str, int i) {
        }

        public static ScreenMode valueOf(String str) {
            return (ScreenMode) Enum.valueOf(ScreenMode.class, str);
        }

        public static ScreenMode[] values() {
            return (ScreenMode[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsSharingStat$TypeModalSharingOpen(Event event, MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType, ScreenMode screenMode, MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource) {
        this.event = event;
        this.sharingItemType = mobileOfficialAppsSharingStat$SharingItemType;
        this.screenMode = screenMode;
        this.sourceUi = mobileOfficialAppsSharingStat$TypeEventSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSharingStat$TypeModalSharingOpen)) {
            return false;
        }
        MobileOfficialAppsSharingStat$TypeModalSharingOpen mobileOfficialAppsSharingStat$TypeModalSharingOpen = (MobileOfficialAppsSharingStat$TypeModalSharingOpen) obj;
        return this.event == mobileOfficialAppsSharingStat$TypeModalSharingOpen.event && this.sharingItemType == mobileOfficialAppsSharingStat$TypeModalSharingOpen.sharingItemType && this.screenMode == mobileOfficialAppsSharingStat$TypeModalSharingOpen.screenMode && this.sourceUi == mobileOfficialAppsSharingStat$TypeModalSharingOpen.sourceUi;
    }

    public final int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType = this.sharingItemType;
        int hashCode2 = (hashCode + (mobileOfficialAppsSharingStat$SharingItemType == null ? 0 : mobileOfficialAppsSharingStat$SharingItemType.hashCode())) * 31;
        ScreenMode screenMode = this.screenMode;
        int hashCode3 = (hashCode2 + (screenMode == null ? 0 : screenMode.hashCode())) * 31;
        MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource = this.sourceUi;
        return hashCode3 + (mobileOfficialAppsSharingStat$TypeEventSource != null ? mobileOfficialAppsSharingStat$TypeEventSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeModalSharingOpen(event=" + this.event + ", sharingItemType=" + this.sharingItemType + ", screenMode=" + this.screenMode + ", sourceUi=" + this.sourceUi + ')';
    }

    public /* synthetic */ MobileOfficialAppsSharingStat$TypeModalSharingOpen(Event event, MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType, ScreenMode screenMode, MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource, int i, zcl zclVar) {
        this(event, (i & 2) != 0 ? null : mobileOfficialAppsSharingStat$SharingItemType, (i & 4) != 0 ? null : screenMode, (i & 8) != 0 ? null : mobileOfficialAppsSharingStat$TypeEventSource);
    }
}
