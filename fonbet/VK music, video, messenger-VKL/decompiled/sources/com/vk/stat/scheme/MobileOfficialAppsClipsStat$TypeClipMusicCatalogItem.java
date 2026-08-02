package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem implements SchemeStat$TypeAction.b {

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("audio_owner_id")
    private final Long audioOwnerId;

    @pmi0("banner_id")
    private final Integer bannerId;

    @pmi0("clips_create_context")
    private final MobileOfficialAppsClipsStat$ClipsCreateContext clipsCreateContext;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("hashtags")
    private final List<String> hashtags;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("playlist_owner_id")
    private final Long playlistOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("banner_open")
        public static final EventType BANNER_OPEN;

        @pmi0("banner_play")
        public static final EventType BANNER_PLAY;

        @pmi0("banner_shown")
        public static final EventType BANNER_SHOWN;

        @pmi0("banner_use_audio")
        public static final EventType BANNER_USE_AUDIO;

        @pmi0("import_audio_from_gallery")
        public static final EventType IMPORT_AUDIO_FROM_GALLERY;

        @pmi0("playlist_open")
        public static final EventType PLAYLIST_OPEN;

        @pmi0("use_audio")
        public static final EventType USE_AUDIO;

        static {
            EventType eventType = new EventType("BANNER_SHOWN", 0);
            BANNER_SHOWN = eventType;
            EventType eventType2 = new EventType("BANNER_OPEN", 1);
            BANNER_OPEN = eventType2;
            EventType eventType3 = new EventType("BANNER_PLAY", 2);
            BANNER_PLAY = eventType3;
            EventType eventType4 = new EventType("BANNER_USE_AUDIO", 3);
            BANNER_USE_AUDIO = eventType4;
            EventType eventType5 = new EventType("USE_AUDIO", 4);
            USE_AUDIO = eventType5;
            EventType eventType6 = new EventType("PLAYLIST_OPEN", 5);
            PLAYLIST_OPEN = eventType6;
            EventType eventType7 = new EventType("IMPORT_AUDIO_FROM_GALLERY", 6);
            IMPORT_AUDIO_FROM_GALLERY = eventType7;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem(EventType eventType, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, Integer num, List<String> list, Integer num2, Long l, Integer num3, Long l2) {
        this.eventType = eventType;
        this.clipsCreateContext = mobileOfficialAppsClipsStat$ClipsCreateContext;
        this.bannerId = num;
        this.hashtags = list;
        this.audioId = num2;
        this.audioOwnerId = l;
        this.playlistId = num3;
        this.playlistOwnerId = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem = (MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.eventType && epx.f(this.clipsCreateContext, mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.clipsCreateContext) && epx.f(this.bannerId, mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.bannerId) && epx.f(this.hashtags, mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.hashtags) && epx.f(this.audioId, mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.audioId) && epx.f(this.audioOwnerId, mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.audioOwnerId) && epx.f(this.playlistId, mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.playlistId) && epx.f(this.playlistOwnerId, mobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.playlistOwnerId);
    }

    public final int hashCode() {
        int hashCode = (this.clipsCreateContext.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        Integer num = this.bannerId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.hashtags;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.audioId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.audioOwnerId;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.playlistId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.playlistOwnerId;
        return hashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipMusicCatalogItem(eventType=");
        sb.append(this.eventType);
        sb.append(", clipsCreateContext=");
        sb.append(this.clipsCreateContext);
        sb.append(", bannerId=");
        sb.append(this.bannerId);
        sb.append(", hashtags=");
        sb.append(this.hashtags);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", playlistOwnerId=");
        return iq.b(sb, this.playlistOwnerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem(EventType eventType, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, Integer num, List list, Integer num2, Long l, Integer num3, Long l2, int i, zcl zclVar) {
        this(eventType, mobileOfficialAppsClipsStat$ClipsCreateContext, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : l2);
    }
}
