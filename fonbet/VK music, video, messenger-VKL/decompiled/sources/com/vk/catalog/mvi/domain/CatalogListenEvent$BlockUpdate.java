package com.vk.catalog.mvi.domain;

import java.io.Serializable;
import xsna.asp;
import xsna.y4a;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogEvent.kt */
/* loaded from: classes16.dex */
public final class CatalogListenEvent$BlockUpdate implements y4a, Serializable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogListenEvent$BlockUpdate[] $VALUES;
    public static final CatalogListenEvent$BlockUpdate AlbumsAdd;
    public static final CatalogListenEvent$BlockUpdate AlbumsRemove;
    public static final a Companion;
    public static final CatalogListenEvent$BlockUpdate VideosAdd;
    public static final CatalogListenEvent$BlockUpdate VideosBookmarksAdd;
    public static final CatalogListenEvent$BlockUpdate VideosBookmarksRemove;
    public static final CatalogListenEvent$BlockUpdate VideosHistoryAdd;
    public static final CatalogListenEvent$BlockUpdate VideosHistoryRemove;
    public static final CatalogListenEvent$BlockUpdate VideosLike;
    public static final CatalogListenEvent$BlockUpdate VideosRemove;
    public static final CatalogListenEvent$BlockUpdate VideosUnlike;
    public static final CatalogListenEvent$BlockUpdate VideosUpdate;
    private final String dtoName;

    /* compiled from: CatalogEvent.kt */
    public static final class a {
    }

    static {
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate = new CatalogListenEvent$BlockUpdate("VideosHistoryAdd", 0, "videos_history_add");
        VideosHistoryAdd = catalogListenEvent$BlockUpdate;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate2 = new CatalogListenEvent$BlockUpdate("VideosHistoryRemove", 1, "videos_history_remove");
        VideosHistoryRemove = catalogListenEvent$BlockUpdate2;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate3 = new CatalogListenEvent$BlockUpdate("AlbumsAdd", 2, "albums_add");
        AlbumsAdd = catalogListenEvent$BlockUpdate3;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate4 = new CatalogListenEvent$BlockUpdate("AlbumsRemove", 3, "albums_remove");
        AlbumsRemove = catalogListenEvent$BlockUpdate4;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate5 = new CatalogListenEvent$BlockUpdate("VideosAdd", 4, "videos_add");
        VideosAdd = catalogListenEvent$BlockUpdate5;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate6 = new CatalogListenEvent$BlockUpdate("VideosRemove", 5, "videos_remove");
        VideosRemove = catalogListenEvent$BlockUpdate6;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate7 = new CatalogListenEvent$BlockUpdate("VideosUpdate", 6, "videos_update");
        VideosUpdate = catalogListenEvent$BlockUpdate7;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate8 = new CatalogListenEvent$BlockUpdate("VideosBookmarksAdd", 7, "videos_bookmarks_add");
        VideosBookmarksAdd = catalogListenEvent$BlockUpdate8;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate9 = new CatalogListenEvent$BlockUpdate("VideosBookmarksRemove", 8, "videos_bookmarks_remove");
        VideosBookmarksRemove = catalogListenEvent$BlockUpdate9;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate10 = new CatalogListenEvent$BlockUpdate("VideosLike", 9, "videos_like");
        VideosLike = catalogListenEvent$BlockUpdate10;
        CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate11 = new CatalogListenEvent$BlockUpdate("VideosUnlike", 10, "videos_unlike");
        VideosUnlike = catalogListenEvent$BlockUpdate11;
        CatalogListenEvent$BlockUpdate[] catalogListenEvent$BlockUpdateArr = {catalogListenEvent$BlockUpdate, catalogListenEvent$BlockUpdate2, catalogListenEvent$BlockUpdate3, catalogListenEvent$BlockUpdate4, catalogListenEvent$BlockUpdate5, catalogListenEvent$BlockUpdate6, catalogListenEvent$BlockUpdate7, catalogListenEvent$BlockUpdate8, catalogListenEvent$BlockUpdate9, catalogListenEvent$BlockUpdate10, catalogListenEvent$BlockUpdate11};
        $VALUES = catalogListenEvent$BlockUpdateArr;
        $ENTRIES = new asp(catalogListenEvent$BlockUpdateArr);
        Companion = new a();
    }

    public CatalogListenEvent$BlockUpdate(String str, int i, String str2) {
        this.dtoName = str2;
    }

    public static zrp<CatalogListenEvent$BlockUpdate> i() {
        return $ENTRIES;
    }

    public static CatalogListenEvent$BlockUpdate valueOf(String str) {
        return (CatalogListenEvent$BlockUpdate) Enum.valueOf(CatalogListenEvent$BlockUpdate.class, str);
    }

    public static CatalogListenEvent$BlockUpdate[] values() {
        return (CatalogListenEvent$BlockUpdate[]) $VALUES.clone();
    }

    public final String h() {
        return this.dtoName;
    }
}
