package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem {

    @pmi0("sharing_internal_video")
    private final MobileOfficialAppsSharingStat$SharingInternalVideo sharingInternalVideo;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("sharing_internal_video")
        public static final Type SHARING_INTERNAL_VIDEO;

        static {
            Type type = new Type("SHARING_INTERNAL_VIDEO", 0);
            SHARING_INTERNAL_VIDEO = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem(Type type, MobileOfficialAppsSharingStat$SharingInternalVideo mobileOfficialAppsSharingStat$SharingInternalVideo, zcl zclVar) {
        this(type, mobileOfficialAppsSharingStat$SharingInternalVideo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem)) {
            return false;
        }
        MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem = (MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem) obj;
        return this.type == mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem.type && epx.f(this.sharingInternalVideo, mobileOfficialAppsSharingStat$TypeSharingInternalInfoItem.sharingInternalVideo);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        MobileOfficialAppsSharingStat$SharingInternalVideo mobileOfficialAppsSharingStat$SharingInternalVideo = this.sharingInternalVideo;
        return hashCode + (mobileOfficialAppsSharingStat$SharingInternalVideo != null ? mobileOfficialAppsSharingStat$SharingInternalVideo.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSharingInternalInfoItem(type=" + this.type + ", sharingInternalVideo=" + this.sharingInternalVideo + ')';
    }

    private MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem(Type type, MobileOfficialAppsSharingStat$SharingInternalVideo mobileOfficialAppsSharingStat$SharingInternalVideo) {
        this.type = type;
        this.sharingInternalVideo = mobileOfficialAppsSharingStat$SharingInternalVideo;
    }

    public /* synthetic */ MobileOfficialAppsSharingStat$TypeSharingInternalInfoItem(Type type, MobileOfficialAppsSharingStat$SharingInternalVideo mobileOfficialAppsSharingStat$SharingInternalVideo, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : mobileOfficialAppsSharingStat$SharingInternalVideo);
    }
}
