package com.vk.catalog.mvi.domain;

import java.io.Serializable;
import xsna.asp;
import xsna.y4a;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogEvent.kt */
/* loaded from: classes16.dex */
public final class CatalogListenEvent$SectionUpdate implements y4a, Serializable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogListenEvent$SectionUpdate[] $VALUES;
    public static final CatalogListenEvent$SectionUpdate AlbumsAdd;
    public static final CatalogListenEvent$SectionUpdate AlbumsRemove;
    public static final CatalogListenEvent$SectionUpdate ClipDraftsAdd;
    public static final CatalogListenEvent$SectionUpdate ClipDraftsRemove;
    public static final a Companion;
    public static final CatalogListenEvent$SectionUpdate VideosAdd;
    public static final CatalogListenEvent$SectionUpdate VideosRemove;
    public static final CatalogListenEvent$SectionUpdate VideosUpdate;
    private final String dtoName;

    /* compiled from: CatalogEvent.kt */
    public static final class a {
    }

    static {
        CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate = new CatalogListenEvent$SectionUpdate("AlbumsAdd", 0, "albums_add");
        AlbumsAdd = catalogListenEvent$SectionUpdate;
        CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate2 = new CatalogListenEvent$SectionUpdate("AlbumsRemove", 1, "albums_remove");
        AlbumsRemove = catalogListenEvent$SectionUpdate2;
        CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate3 = new CatalogListenEvent$SectionUpdate("VideosAdd", 2, "videos_add");
        VideosAdd = catalogListenEvent$SectionUpdate3;
        CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate4 = new CatalogListenEvent$SectionUpdate("VideosRemove", 3, "videos_remove");
        VideosRemove = catalogListenEvent$SectionUpdate4;
        CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate5 = new CatalogListenEvent$SectionUpdate("VideosUpdate", 4, "videos_update");
        VideosUpdate = catalogListenEvent$SectionUpdate5;
        CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate6 = new CatalogListenEvent$SectionUpdate("ClipDraftsAdd", 5, "clip_drafts_add");
        ClipDraftsAdd = catalogListenEvent$SectionUpdate6;
        CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate7 = new CatalogListenEvent$SectionUpdate("ClipDraftsRemove", 6, "clip_drafts_remove");
        ClipDraftsRemove = catalogListenEvent$SectionUpdate7;
        CatalogListenEvent$SectionUpdate[] catalogListenEvent$SectionUpdateArr = {catalogListenEvent$SectionUpdate, catalogListenEvent$SectionUpdate2, catalogListenEvent$SectionUpdate3, catalogListenEvent$SectionUpdate4, catalogListenEvent$SectionUpdate5, catalogListenEvent$SectionUpdate6, catalogListenEvent$SectionUpdate7};
        $VALUES = catalogListenEvent$SectionUpdateArr;
        $ENTRIES = new asp(catalogListenEvent$SectionUpdateArr);
        Companion = new a();
    }

    public CatalogListenEvent$SectionUpdate(String str, int i, String str2) {
        this.dtoName = str2;
    }

    public static zrp<CatalogListenEvent$SectionUpdate> i() {
        return $ENTRIES;
    }

    public static CatalogListenEvent$SectionUpdate valueOf(String str) {
        return (CatalogListenEvent$SectionUpdate) Enum.valueOf(CatalogListenEvent$SectionUpdate.class, str);
    }

    public static CatalogListenEvent$SectionUpdate[] values() {
        return (CatalogListenEvent$SectionUpdate[]) $VALUES.clone();
    }

    public final String h() {
        return this.dtoName;
    }
}
