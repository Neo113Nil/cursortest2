package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipViewerDescriptionItem {

    @pmi0("object_type")
    private final ObjectType objectType;

    @pmi0("object_value")
    private final String objectValue;

    @pmi0("video_id")
    private final int videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0("hashtag")
        public static final ObjectType HASHTAG;

        @pmi0("link")
        public static final ObjectType LINK;

        @pmi0("mention")
        public static final ObjectType MENTION;

        static {
            ObjectType objectType = new ObjectType("HASHTAG", 0);
            HASHTAG = objectType;
            ObjectType objectType2 = new ObjectType("MENTION", 1);
            MENTION = objectType2;
            ObjectType objectType3 = new ObjectType("LINK", 2);
            LINK = objectType3;
            ObjectType[] objectTypeArr = {objectType, objectType2, objectType3};
            $VALUES = objectTypeArr;
            $ENTRIES = new asp(objectTypeArr);
        }

        private ObjectType(String str, int i) {
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$ClipViewerDescriptionItem(long j, int i, ObjectType objectType, String str) {
        this.videoOwnerId = j;
        this.videoId = i;
        this.objectType = objectType;
        this.objectValue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipViewerDescriptionItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipViewerDescriptionItem mobileOfficialAppsClipsStat$ClipViewerDescriptionItem = (MobileOfficialAppsClipsStat$ClipViewerDescriptionItem) obj;
        return this.videoOwnerId == mobileOfficialAppsClipsStat$ClipViewerDescriptionItem.videoOwnerId && this.videoId == mobileOfficialAppsClipsStat$ClipViewerDescriptionItem.videoId && this.objectType == mobileOfficialAppsClipsStat$ClipViewerDescriptionItem.objectType && epx.f(this.objectValue, mobileOfficialAppsClipsStat$ClipViewerDescriptionItem.objectValue);
    }

    public final int hashCode() {
        int hashCode = (this.objectType.hashCode() + shy.a(this.videoId, Long.hashCode(this.videoOwnerId) * 31, 31)) * 31;
        String str = this.objectValue;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipViewerDescriptionItem(videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", objectType=");
        sb.append(this.objectType);
        sb.append(", objectValue=");
        return ho8.a(sb, this.objectValue, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ClipViewerDescriptionItem(long j, int i, ObjectType objectType, String str, int i2, zcl zclVar) {
        this(j, i, objectType, (i2 & 8) != 0 ? null : str);
    }
}
