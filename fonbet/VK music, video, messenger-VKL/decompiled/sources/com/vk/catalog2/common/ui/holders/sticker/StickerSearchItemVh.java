package com.vk.catalog2.common.ui.holders.sticker;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockSticker;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPreview;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.f9l0;
import xsna.qed;
import xsna.xf4;

/* compiled from: StickerSearchItemVh.kt */
/* loaded from: classes16.dex */
public final class StickerSearchItemVh extends StickerPackSliderSmallItemVh {
    public StickerSearchItemVh(f9l0 f9l0Var, String str, GiftData giftData, ContextUser contextUser, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(R.layout.catalog_stickers_search_item, f9l0Var, str, giftData, contextUser, b5aVar, searchStatInfoProvider);
    }

    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VKStickerPackView vKStickerPackView;
        VKStickerPackView vKStickerPackView2 = this.k;
        if (vKStickerPackView2 == null) {
            vKStickerPackView2 = null;
        }
        vKStickerPackView2.setPlaceHolder(null);
        if (uIBlock instanceof UIBlockSticker) {
            VKStickerPackView vKStickerPackView3 = this.k;
            vKStickerPackView = vKStickerPackView3 != null ? vKStickerPackView3 : null;
            StickerStockItemWithStickerId stickerStockItemWithStickerId = ((UIBlockSticker) uIBlock).y;
            vKStickerPackView.setSticker(new xf4(13, stickerStockItemWithStickerId, vKStickerPackView));
            a(uIBlock, stickerStockItemWithStickerId.b);
            return;
        }
        if (uIBlock instanceof UIBlockStickerPreview) {
            VKStickerPackView vKStickerPackView4 = this.k;
            vKStickerPackView = vKStickerPackView4 != null ? vKStickerPackView4 : null;
            StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId = ((UIBlockStickerPreview) uIBlock).y;
            vKStickerPackView.setSticker(new qed(12, stickerPackPreviewWithStickerId, vKStickerPackView));
            b(uIBlock, stickerPackPreviewWithStickerId.b);
        }
    }
}
