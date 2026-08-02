package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$ContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsConPhotosStat$ContentType[] $VALUES;

    @pmi0("album")
    public static final MobileOfficialAppsConPhotosStat$ContentType ALBUM;

    @pmi0("photo")
    public static final MobileOfficialAppsConPhotosStat$ContentType PHOTO;

    static {
        MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType = new MobileOfficialAppsConPhotosStat$ContentType("ALBUM", 0);
        ALBUM = mobileOfficialAppsConPhotosStat$ContentType;
        MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType2 = new MobileOfficialAppsConPhotosStat$ContentType("PHOTO", 1);
        PHOTO = mobileOfficialAppsConPhotosStat$ContentType2;
        MobileOfficialAppsConPhotosStat$ContentType[] mobileOfficialAppsConPhotosStat$ContentTypeArr = {mobileOfficialAppsConPhotosStat$ContentType, mobileOfficialAppsConPhotosStat$ContentType2};
        $VALUES = mobileOfficialAppsConPhotosStat$ContentTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsConPhotosStat$ContentTypeArr);
    }

    private MobileOfficialAppsConPhotosStat$ContentType(String str, int i) {
    }

    public static MobileOfficialAppsConPhotosStat$ContentType valueOf(String str) {
        return (MobileOfficialAppsConPhotosStat$ContentType) Enum.valueOf(MobileOfficialAppsConPhotosStat$ContentType.class, str);
    }

    public static MobileOfficialAppsConPhotosStat$ContentType[] values() {
        return (MobileOfficialAppsConPhotosStat$ContentType[]) $VALUES.clone();
    }
}
