package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_type")
    private final String objectType;

    @pmi0("photo_orientation")
    private final PhotoOrientation photoOrientation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("apply_photo")
        public static final EventType APPLY_PHOTO;

        @pmi0("apply_photo_edit")
        public static final EventType APPLY_PHOTO_EDIT;

        static {
            EventType eventType = new EventType("APPLY_PHOTO", 0);
            APPLY_PHOTO = eventType;
            EventType eventType2 = new EventType("APPLY_PHOTO_EDIT", 1);
            APPLY_PHOTO_EDIT = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class PhotoOrientation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhotoOrientation[] $VALUES;

        @pmi0("horizontal")
        public static final PhotoOrientation HORIZONTAL;

        @pmi0("vertical")
        public static final PhotoOrientation VERTICAL;

        static {
            PhotoOrientation photoOrientation = new PhotoOrientation("HORIZONTAL", 0);
            HORIZONTAL = photoOrientation;
            PhotoOrientation photoOrientation2 = new PhotoOrientation("VERTICAL", 1);
            VERTICAL = photoOrientation2;
            PhotoOrientation[] photoOrientationArr = {photoOrientation, photoOrientation2};
            $VALUES = photoOrientationArr;
            $ENTRIES = new asp(photoOrientationArr);
        }

        private PhotoOrientation(String str, int i) {
        }

        public static PhotoOrientation valueOf(String str) {
            return (PhotoOrientation) Enum.valueOf(PhotoOrientation.class, str);
        }

        public static PhotoOrientation[] values() {
            return (PhotoOrientation[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto(EventType eventType, PhotoOrientation photoOrientation, String str) {
        this.eventType = eventType;
        this.photoOrientation = photoOrientation;
        this.objectType = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto = (MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto.eventType && this.photoOrientation == mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto.photoOrientation && epx.f(this.objectType, mobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto.objectType);
    }

    public final int hashCode() {
        return this.objectType.hashCode() + ((this.photoOrientation.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoUploadCoverApplyPhoto(eventType=");
        sb.append(this.eventType);
        sb.append(", photoOrientation=");
        sb.append(this.photoOrientation);
        sb.append(", objectType=");
        return ho8.a(sb, this.objectType, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoUploadCoverApplyPhoto(EventType eventType, PhotoOrientation photoOrientation, String str, int i, zcl zclVar) {
        this(eventType, photoOrientation, (i & 4) != 0 ? "photo" : str);
    }
}
