package com.vk.catalog2.feature.music.offline.content;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.e43;
import xsna.mt70;
import xsna.ot70;

/* compiled from: EmptyOfflineCatalogContentBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class a implements ot70 {
    public final String a;
    public final boolean b;

    /* compiled from: EmptyOfflineCatalogContentBlocksFactoryImpl.kt */
    /* renamed from: com.vk.catalog2.feature.music.offline.content.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0523a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineCatalogCategories.values().length];
            try {
                iArr[OfflineCatalogCategories.Podcasts.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineCatalogCategories.Audiobooks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineCatalogCategories.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OfflineCatalogCategories.Tracks.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OfflineCatalogCategories.Albums.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OfflineCatalogCategories.Playlists.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OfflineCatalogCategories.AutoDownload.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        CatalogViewType catalogViewType;
        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_PLACEHOLDER;
        boolean z = this.b;
        String str = this.a;
        if (!z) {
            OfflineCatalogCategories.Companion.getClass();
            OfflineCatalogCategories a = OfflineCatalogCategories.c.a(str);
            switch (a == null ? -1 : C0523a.$EnumSwitchMapping$0[a.ordinal()]) {
                case -1:
                case 4:
                case 5:
                case 6:
                case 7:
                    catalogViewType = CatalogViewType.PLACEHOLDER_SMALL;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    catalogViewType = CatalogViewType.SYNTHETIC_OFFLINE_PODCASTS_SECTION_PLACEHOLDER;
                    break;
                case 2:
                    catalogViewType = CatalogViewType.SYNTHETIC_OFFLINE_AUDIO_BOOKS_SECTION_PLACEHOLDER;
                    break;
                case 3:
                    catalogViewType = CatalogViewType.SYNTHETIC_OFFLINE_MAIN_TRACKS_SECTION_PLACEHOLDER;
                    break;
            }
        } else {
            catalogViewType = CatalogViewType.MUSIC_PLACEHOLDER_OFFLINE_SYNC;
        }
        CatalogLayout catalogLayout = new CatalogLayout(catalogViewType, null, null, null, null, false, null, null, null, 510, null);
        OfflineCatalogCategories.Companion.getClass();
        OfflineCatalogCategories a2 = OfflineCatalogCategories.c.a(str);
        int i = a2 != null ? C0523a.$EnumSwitchMapping$0[a2.ordinal()] : -1;
        String str2 = "empty_placeholder_tracks";
        switch (i) {
            case -1:
                str2 = "empty_placeholder";
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                str2 = "empty_podcasts_placeholder";
                break;
            case 2:
                str2 = "empty_audio_books_placeholder";
                break;
            case 3:
            case 4:
                break;
            case 5:
                str2 = "empty_placeholder_albums";
                break;
            case 6:
                str2 = "empty_placeholder_playlists";
                break;
            case 7:
                str2 = "empty_autodownload_placeholder";
                break;
        }
        return e43.o(new CatalogBlock("synthetic_offline_empty_placeholder", catalogDataType, null, null, null, null, null, catalogLayout, null, null, null, new CatalogBlockItemsData(catalogDataType, e43.o(str2), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094972, null));
    }
}
