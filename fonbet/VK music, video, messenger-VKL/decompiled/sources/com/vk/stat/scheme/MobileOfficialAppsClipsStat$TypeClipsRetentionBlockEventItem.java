package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem {

    @pmi0("object_type")
    private final ObjectType objectType;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0("click_to_clip")
        public static final ObjectType CLICK_TO_CLIP;

        @pmi0("click_to_show_all")
        public static final ObjectType CLICK_TO_SHOW_ALL;

        @pmi0("click_to_stub_clip")
        public static final ObjectType CLICK_TO_STUB_CLIP;

        static {
            ObjectType objectType = new ObjectType("CLICK_TO_CLIP", 0);
            CLICK_TO_CLIP = objectType;
            ObjectType objectType2 = new ObjectType("CLICK_TO_SHOW_ALL", 1);
            CLICK_TO_SHOW_ALL = objectType2;
            ObjectType objectType3 = new ObjectType("CLICK_TO_STUB_CLIP", 2);
            CLICK_TO_STUB_CLIP = objectType3;
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

    public MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem(ObjectType objectType, String str) {
        this.objectType = objectType;
        this.trackCode = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem = (MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem) obj;
        return this.objectType == mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem.objectType && epx.f(this.trackCode, mobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.objectType.hashCode() * 31;
        String str = this.trackCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipsRetentionBlockEventItem(objectType=");
        sb.append(this.objectType);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem(ObjectType objectType, String str, int i, zcl zclVar) {
        this(objectType, (i & 2) != 0 ? null : str);
    }
}
