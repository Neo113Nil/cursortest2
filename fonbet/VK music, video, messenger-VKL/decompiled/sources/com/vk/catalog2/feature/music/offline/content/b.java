package com.vk.catalog2.feature.music.offline.content;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogButtonClearRecent;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudioFromBlock;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.style.AudioBookListItemViewStyle;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.Tensorflow;
import xsna.e43;
import xsna.f870;
import xsna.mt70;
import xsna.ot70;
import xsna.s3q0;

/* compiled from: OfflineCatalogSectionBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class b implements ot70 {
    public final String a;
    public final OfflineCatalogCategories b;

    /* compiled from: OfflineCatalogSectionBlocksFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineCatalogCategories.values().length];
            try {
                iArr[OfflineCatalogCategories.Audiobooks.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineCatalogCategories.All.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineCatalogCategories.Tracks.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OfflineCatalogCategories.Albums.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OfflineCatalogCategories.Playlists.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OfflineCatalogCategories.Podcasts.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OfflineCatalogCategories.AutoDownload.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(String str, OfflineCatalogCategories offlineCatalogCategories) {
        this.a = str;
        this.b = offlineCatalogCategories;
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        List list;
        CatalogBlock catalogBlock;
        boolean z = mt70Var.p;
        OfflineCatalogCategories offlineCatalogCategories = this.b;
        CatalogDataType i = offlineCatalogCategories.i();
        List<String> b = mt70Var.b(offlineCatalogCategories);
        ArrayList arrayList = new ArrayList();
        if (mt70Var.n) {
            if (offlineCatalogCategories == OfflineCatalogCategories.AutoDownload) {
                catalogBlock = new CatalogBlock("synthetic_offline_autodownload_shuffle", CatalogDataType.DATA_TYPE_ACTION, null, null, null, null, null, new CatalogLayout(CatalogViewType.BUTTONS_HORIZONTAL, null, null, null, null, false, null, null, null, 510, null), e43.a(new CatalogButtonPlayAudioFromBlock("play_shuffled_audios_from_block", null, "", mt70Var.a, mt70Var.b(offlineCatalogCategories), true, null, 64, null)), null, null, null, null, null, new Meta(null, null, "", null, null, null, false, z ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null), null, null, null, null, null, null, 2080380, null);
            } else {
                CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_NONE;
                CatalogViewType catalogViewType = CatalogViewType.HEADER_COMPACT;
                Context context = mt70Var.d;
                int size = offlineCatalogCategories == OfflineCatalogCategories.Podcasts ? mt70Var.r : mt70Var.b(offlineCatalogCategories).size();
                catalogBlock = new CatalogBlock("synthetic_offline_playlists_header", catalogDataType, null, this.a, null, null, null, new CatalogLayout(catalogViewType, null, context.getResources().getQuantityString(offlineCatalogCategories.q(), size, Integer.valueOf(size), f870.t(mt70Var.o.a(offlineCatalogCategories), context)), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), e43.a(new CatalogButtonClearRecent("clear_recent_groups", null, "", EmptyList.b, null, null, 32, null)), null, null, null, null, null, null, null, null, null, null, null, null, 2096756, null);
            }
            arrayList.add(catalogBlock);
        }
        String str = mt70Var.a;
        CatalogViewType catalogViewType2 = CatalogViewType.LIST;
        Bundle bundle = new Bundle();
        OfflineCatalogCategories.Companion.getClass();
        String str2 = this.a;
        OfflineCatalogCategories a2 = OfflineCatalogCategories.c.a(str2);
        switch (a2 == null ? -1 : a.$EnumSwitchMapping$0[a2.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                bundle.putString(CatalogCustomAttributes$Keys.STYLE.h(), AudioBookListItemViewStyle.EntityStyle.SYNTHETIC_OFFLINE.h());
                break;
        }
        s3q0 s3q0Var = s3q0.a;
        CatalogLayout catalogLayout = new CatalogLayout(catalogViewType2, null, null, null, null, false, bundle, null, null, 446, null);
        CatalogBlockItemsData catalogBlockItemsData = new CatalogBlockItemsData(i, new ArrayList(b), null, null, null, null, null, null, null, null, null, null, 4092, null);
        Meta meta = new Meta(null, null, "", null, null, null, false, z ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null);
        OfflineCatalogCategories a3 = OfflineCatalogCategories.c.a(str2);
        switch (a3 != null ? a.$EnumSwitchMapping$0[a3.ordinal()] : -1) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
                list = EmptyList.b;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                list = e43.l("audio_books_subscribe", "audio_books_unsubscribe");
                break;
            case 6:
                list = e43.l("podcasts_subscribe", "podcasts_unsubscribe");
                break;
            case 7:
                list = e43.l("music_audios_add", "music_audios_remove");
                break;
        }
        arrayList.add(new CatalogBlock(str, i, null, null, null, null, null, catalogLayout, null, null, list, catalogBlockItemsData, null, null, meta, null, null, null, null, null, null, 2077564, null));
        return arrayList;
    }
}
