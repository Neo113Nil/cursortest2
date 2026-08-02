package com.vk.catalog2.common.ui.holders.sticker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.utils.StickerPackButtonUtils;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.vas.design.view.VkDiscountTextView;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import xsna.b5a;
import xsna.bhu;
import xsna.bwt0;
import xsna.f4m;
import xsna.f9l0;
import xsna.kdg;
import xsna.oh3;
import xsna.ri0;
import xsna.ufg0;

/* compiled from: StickerPackVerticalListItemVh.kt */
/* loaded from: classes16.dex */
public final class StickerPackVerticalListItemVh extends BaseStickerPackVh {
    public VkDiscountTextView o;
    public VkImageSimple p;
    public VkText q;
    public VKImageView r;
    public View s;

    public StickerPackVerticalListItemVh(f9l0 f9l0Var, String str, GiftData giftData, ContextUser contextUser, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(R.layout.catalog_stickers_vertical_list_item, f9l0Var, str, giftData, contextUser, b5aVar, searchStatInfoProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a8  */
    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(UIBlock uIBlock, StickerStockItem stickerStockItem) {
        VKImageView vKImageView;
        View view;
        VkDiscountTextView vkDiscountTextView;
        Collection<Integer> collection;
        super.a(uIBlock, stickerStockItem);
        TextView textView = this.m;
        if (textView == null) {
            textView = null;
        }
        textView.setText(stickerStockItem.e);
        Context context = this.i;
        if (context == null) {
            context = null;
        }
        VkDiscountTextView vkDiscountTextView2 = this.o;
        if (vkDiscountTextView2 == null) {
            vkDiscountTextView2 = null;
        }
        VkText vkText = this.q;
        if (vkText == null) {
            vkText = null;
        }
        StickerPackButtonUtils.c(context, stickerStockItem, vkDiscountTextView2, vkText);
        boolean b = StickerPackButtonUtils.b(stickerStockItem);
        boolean z = true;
        boolean z2 = (!stickerStockItem.A || stickerStockItem.m || b) ? false : true;
        VkImageSimple vkImageSimple = this.p;
        if (vkImageSimple == null) {
            vkImageSimple = null;
        }
        bwt0.p0(vkImageSimple, z2);
        Collection<UserId> collection2 = this.e.b;
        boolean z3 = collection2 != null && collection2.size() == 1;
        ContextUser contextUser = this.f;
        if (contextUser != null && (collection = contextUser.e) != null) {
            Collection<Integer> collection3 = collection;
            if (!collection3.isEmpty()) {
                Iterator<T> it = collection3.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() == stickerStockItem.b) {
                    }
                }
            }
            if (contextUser == null && z2 && z3 && z) {
                VKImageView vKImageView2 = this.r;
                if (vKImageView2 == null) {
                    vKImageView2 = null;
                }
                vKImageView2.setVisibility(0);
                View view2 = this.s;
                if (view2 == null) {
                    view2 = null;
                }
                view2.setVisibility(0);
                VKImageView vKImageView3 = this.r;
                if (vKImageView3 == null) {
                    vKImageView3 = null;
                }
                vKImageView3.load(contextUser.d);
            } else {
                vKImageView = this.r;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                f4m.j(vKImageView);
                view = this.s;
                if (view == null) {
                    view = null;
                }
                f4m.j(view);
            }
            vkDiscountTextView = this.o;
            if (vkDiscountTextView == null) {
                vkDiscountTextView = null;
            }
            bwt0.i0(vkDiscountTextView, new kdg(b, this, stickerStockItem));
            VkImageSimple vkImageSimple2 = this.p;
            bwt0.i0(vkImageSimple2 != null ? vkImageSimple2 : null, new ri0(28, this, stickerStockItem));
        }
        z = false;
        if (contextUser == null) {
        }
        vKImageView = this.r;
        if (vKImageView == null) {
        }
        f4m.j(vKImageView);
        view = this.s;
        if (view == null) {
        }
        f4m.j(view);
        vkDiscountTextView = this.o;
        if (vkDiscountTextView == null) {
        }
        bwt0.i0(vkDiscountTextView, new kdg(b, this, stickerStockItem));
        VkImageSimple vkImageSimple22 = this.p;
        bwt0.i0(vkImageSimple22 != null ? vkImageSimple22 : null, new ri0(28, this, stickerStockItem));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00aa  */
    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(UIBlock uIBlock, StickerPackPreview stickerPackPreview) {
        VKImageView vKImageView;
        View view;
        VkDiscountTextView vkDiscountTextView;
        Collection<Integer> collection;
        super.b(uIBlock, stickerPackPreview);
        TextView textView = this.m;
        if (textView == null) {
            textView = null;
        }
        textView.setText(stickerPackPreview.e);
        Context context = this.i;
        if (context == null) {
            context = null;
        }
        VkDiscountTextView vkDiscountTextView2 = this.o;
        if (vkDiscountTextView2 == null) {
            vkDiscountTextView2 = null;
        }
        VkText vkText = this.q;
        if (vkText == null) {
            vkText = null;
        }
        StickerPackButtonUtils.d(context, stickerPackPreview, vkDiscountTextView2, vkText);
        boolean z = true;
        boolean z2 = stickerPackPreview.j && !bhu.f(stickerPackPreview) && bhu.g(stickerPackPreview);
        VkImageSimple vkImageSimple = this.p;
        if (vkImageSimple == null) {
            vkImageSimple = null;
        }
        bwt0.p0(vkImageSimple, z2);
        Collection<UserId> collection2 = this.e.b;
        boolean z3 = collection2 != null && collection2.size() == 1;
        ContextUser contextUser = this.f;
        if (contextUser != null && (collection = contextUser.e) != null) {
            Collection<Integer> collection3 = collection;
            if (!collection3.isEmpty()) {
                Iterator<T> it = collection3.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() == stickerPackPreview.b) {
                    }
                }
            }
            if (contextUser == null && z2 && z3 && z) {
                VKImageView vKImageView2 = this.r;
                if (vKImageView2 == null) {
                    vKImageView2 = null;
                }
                vKImageView2.setVisibility(0);
                View view2 = this.s;
                if (view2 == null) {
                    view2 = null;
                }
                view2.setVisibility(0);
                VKImageView vKImageView3 = this.r;
                if (vKImageView3 == null) {
                    vKImageView3 = null;
                }
                vKImageView3.load(contextUser.d);
            } else {
                vKImageView = this.r;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                f4m.j(vKImageView);
                view = this.s;
                if (view == null) {
                    view = null;
                }
                f4m.j(view);
            }
            vkDiscountTextView = this.o;
            if (vkDiscountTextView == null) {
                vkDiscountTextView = null;
            }
            bwt0.i0(vkDiscountTextView, new oh3(27, stickerPackPreview, this));
            VkImageSimple vkImageSimple2 = this.p;
            bwt0.i0(vkImageSimple2 != null ? vkImageSimple2 : null, new ufg0(5, this, stickerPackPreview));
        }
        z = false;
        if (contextUser == null) {
        }
        vKImageView = this.r;
        if (vKImageView == null) {
        }
        f4m.j(vKImageView);
        view = this.s;
        if (view == null) {
        }
        f4m.j(view);
        vkDiscountTextView = this.o;
        if (vkDiscountTextView == null) {
        }
        bwt0.i0(vkDiscountTextView, new oh3(27, stickerPackPreview, this));
        VkImageSimple vkImageSimple22 = this.p;
        bwt0.i0(vkImageSimple22 != null ? vkImageSimple22 : null, new ufg0(5, this, stickerPackPreview));
    }

    @Override // com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        this.o = (VkDiscountTextView) k5.findViewById(R.id.pack_buy);
        this.p = (VkImageSimple) k5.findViewById(R.id.pack_gift);
        this.q = (VkText) k5.findViewById(R.id.discount_note);
        this.r = (VKImageView) k5.findViewById(R.id.context_user_avatar);
        this.s = k5.findViewById(R.id.context_user_check);
        return k5;
    }
}
