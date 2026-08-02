package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$PhotoAdditionalInfo {

    @pmi0("photo_sizes")
    private final MobileOfficialAppsConPostingStat$PhotoSizes photoSizes;

    @pmi0("photo_type")
    private final PhotoType photoType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class PhotoType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PhotoType[] $VALUES;

        @pmi0("non_standart")
        public static final PhotoType NON_STANDART;

        @pmi0("standart")
        public static final PhotoType STANDART;

        static {
            PhotoType photoType = new PhotoType("STANDART", 0);
            STANDART = photoType;
            PhotoType photoType2 = new PhotoType("NON_STANDART", 1);
            NON_STANDART = photoType2;
            PhotoType[] photoTypeArr = {photoType, photoType2};
            $VALUES = photoTypeArr;
            $ENTRIES = new asp(photoTypeArr);
        }

        private PhotoType(String str, int i) {
        }

        public static PhotoType valueOf(String str) {
            return (PhotoType) Enum.valueOf(PhotoType.class, str);
        }

        public static PhotoType[] values() {
            return (PhotoType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$PhotoAdditionalInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$PhotoAdditionalInfo)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo = (MobileOfficialAppsConPostingStat$PhotoAdditionalInfo) obj;
        return epx.f(this.photoSizes, mobileOfficialAppsConPostingStat$PhotoAdditionalInfo.photoSizes) && this.photoType == mobileOfficialAppsConPostingStat$PhotoAdditionalInfo.photoType;
    }

    public final int hashCode() {
        MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes = this.photoSizes;
        int hashCode = (mobileOfficialAppsConPostingStat$PhotoSizes == null ? 0 : mobileOfficialAppsConPostingStat$PhotoSizes.hashCode()) * 31;
        PhotoType photoType = this.photoType;
        return hashCode + (photoType != null ? photoType.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoAdditionalInfo(photoSizes=" + this.photoSizes + ", photoType=" + this.photoType + ')';
    }

    public MobileOfficialAppsConPostingStat$PhotoAdditionalInfo(MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes, PhotoType photoType) {
        this.photoSizes = mobileOfficialAppsConPostingStat$PhotoSizes;
        this.photoType = photoType;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$PhotoAdditionalInfo(MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes, PhotoType photoType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsConPostingStat$PhotoSizes, (i & 2) != 0 ? null : photoType);
    }
}
