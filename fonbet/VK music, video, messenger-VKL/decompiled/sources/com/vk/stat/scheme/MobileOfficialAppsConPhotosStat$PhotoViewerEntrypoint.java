package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint[] $VALUES;

    @pmi0("news_item")
    public static final MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint NEWS_ITEM;

    static {
        MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint = new MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint("NEWS_ITEM", 0);
        NEWS_ITEM = mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
        MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint[] mobileOfficialAppsConPhotosStat$PhotoViewerEntrypointArr = {mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint};
        $VALUES = mobileOfficialAppsConPhotosStat$PhotoViewerEntrypointArr;
        $ENTRIES = new asp(mobileOfficialAppsConPhotosStat$PhotoViewerEntrypointArr);
    }

    private MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint(String str, int i) {
    }

    public static MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint valueOf(String str) {
        return (MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint) Enum.valueOf(MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.class, str);
    }

    public static MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint[] values() {
        return (MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint[]) $VALUES.clone();
    }
}
