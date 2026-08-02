package com.vk.catalog2.common.dto.api.video;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.ahn;
import xsna.asp;
import xsna.fxc0;
import xsna.hda;
import xsna.rsg0;
import xsna.wba;
import xsna.zrp;

/* compiled from: CatalogGetVideoPlaylist.kt */
/* loaded from: classes16.dex */
public final class CatalogGetVideoPlaylist extends rsg0<hda> {
    public final wba s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetVideoPlaylist.kt */
    public static final class CatalogType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CatalogType[] $VALUES;
        public static final CatalogType VIDEO_STANDALONE_PROFILE;
        private final String id = "video_standalone_profile";

        static {
            CatalogType catalogType = new CatalogType();
            VIDEO_STANDALONE_PROFILE = catalogType;
            CatalogType[] catalogTypeArr = {catalogType};
            $VALUES = catalogTypeArr;
            $ENTRIES = new asp(catalogTypeArr);
        }

        public static CatalogType valueOf(String str) {
            return (CatalogType) Enum.valueOf(CatalogType.class, str);
        }

        public static CatalogType[] values() {
            return (CatalogType[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }
    }

    public CatalogGetVideoPlaylist(wba wbaVar, int i, UserId userId, String str, boolean z) {
        super("catalog.getVideoAlbum");
        this.s = wbaVar;
        C(1, "need_blocks");
        F(userId, "owner_id");
        C(i, "album_id");
        K("from_trackcode", str);
        if (fxc0.B().J().k()) {
            C(z ? 1 : 0, "sort_album");
        }
        if (BuildInfo.a == BuildInfo.Client.VK_VIDEO) {
            K("catalog_type", CatalogType.VIDEO_STANDALONE_PROFILE.getId());
        }
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
