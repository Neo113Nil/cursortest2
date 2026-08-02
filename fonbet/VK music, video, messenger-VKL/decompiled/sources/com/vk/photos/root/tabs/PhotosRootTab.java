package com.vk.photos.root.tabs;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotosRootTab.kt */
/* loaded from: classes4.dex */
public final class PhotosRootTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotosRootTab[] $VALUES;
    public static final PhotosRootTab ALBUMS;
    public static final a Companion;
    public static final PhotosRootTab PHOTO_FLOW;
    private final int position;
    private final int titleRes;

    /* compiled from: PhotosRootTab.kt */
    public static final class a {
    }

    static {
        PhotosRootTab photosRootTab = new PhotosRootTab("PHOTO_FLOW", 0, 0, R.string.photos_root_tab_photo_flow);
        PHOTO_FLOW = photosRootTab;
        PhotosRootTab photosRootTab2 = new PhotosRootTab("ALBUMS", 1, 1, R.string.photos_root_tab_albums);
        ALBUMS = photosRootTab2;
        PhotosRootTab[] photosRootTabArr = {photosRootTab, photosRootTab2};
        $VALUES = photosRootTabArr;
        $ENTRIES = new asp(photosRootTabArr);
        Companion = new a();
    }

    public PhotosRootTab(String str, int i, int i2, int i3) {
        this.position = i2;
        this.titleRes = i3;
    }

    public static PhotosRootTab valueOf(String str) {
        return (PhotosRootTab) Enum.valueOf(PhotosRootTab.class, str);
    }

    public static PhotosRootTab[] values() {
        return (PhotosRootTab[]) $VALUES.clone();
    }

    public final int h() {
        return this.position;
    }

    public final int i() {
        return this.titleRes;
    }
}
