package com.vk.catalog2.common.ui.holders.sticker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPack;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.stickers.Badge;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackBadge;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.btz;
import xsna.bwt0;
import xsna.dgr0;
import xsna.e3m;
import xsna.eo6;
import xsna.epx;
import xsna.f4m;
import xsna.f9l0;
import xsna.p5l0;
import xsna.vd6;

/* compiled from: BaseStickerPackVh.kt */
/* loaded from: classes16.dex */
public abstract class BaseStickerPackVh implements CatalogViewHolder {
    public final int b;
    public final f9l0 c;
    public final String d;
    public final GiftData e;
    public final ContextUser f;
    public final b5a g;
    public final SearchStatInfoProvider h;
    public Context i;
    public View j;
    public VKStickerPackView k;
    public TextView l;
    public TextView m;
    public TextView n;

    public BaseStickerPackVh(int i, f9l0 f9l0Var, String str, GiftData giftData, ContextUser contextUser, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this.b = i;
        this.c = f9l0Var;
        this.d = str;
        this.e = giftData;
        this.f = contextUser;
        this.g = b5aVar;
        this.h = searchStatInfoProvider;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockStickerPack) {
            a(uIBlock, ((UIBlockStickerPack) uIBlock).y);
        } else if (uIBlock instanceof UIBlockStickerPackPreview) {
            b(uIBlock, ((UIBlockStickerPackPreview) uIBlock).y);
        }
    }

    public void a(UIBlock uIBlock, StickerStockItem stickerStockItem) {
        View view = this.j;
        if (view == null) {
            view = null;
        }
        bwt0.i0(view, new eo6(this, uIBlock, stickerStockItem, 0));
        VKStickerPackView vKStickerPackView = this.k;
        if (vKStickerPackView == null) {
            vKStickerPackView = null;
        }
        dgr0.a(vKStickerPackView, stickerStockItem);
        TextView textView = this.l;
        (textView != null ? textView : null).setText(stickerStockItem.d);
        TextView textView2 = this.n;
        if (textView2 != null) {
            Badge badge = stickerStockItem.E;
            if (badge == null) {
                f4m.j(textView2);
                return;
            }
            textView2.setVisibility(0);
            textView2.setText(badge.getText());
            Context context = textView2.getContext();
            textView2.setBackgroundTintList(p5l0.a.$EnumSwitchMapping$0[badge.zb().ordinal()] == 1 ? e3m.c(R.attr.vk_ui_background_accent, context) : e3m.c(R.attr.vk_ui_accent_red, context));
        }
    }

    public void b(UIBlock uIBlock, StickerPackPreview stickerPackPreview) {
        View view = this.j;
        if (view == null) {
            view = null;
        }
        bwt0.i0(view, new vd6(this, uIBlock, stickerPackPreview, 1));
        VKStickerPackView vKStickerPackView = this.k;
        if (vKStickerPackView == null) {
            vKStickerPackView = null;
        }
        vKStickerPackView.a(new btz(stickerPackPreview, stickerPackPreview.b, 2), stickerPackPreview.f, epx.f(stickerPackPreview.s, Boolean.TRUE));
        TextView textView = this.l;
        (textView != null ? textView : null).setText(stickerPackPreview.c);
        TextView textView2 = this.n;
        if (textView2 != null) {
            StickerPackBadge stickerPackBadge = stickerPackPreview.n;
            if (stickerPackBadge == null) {
                f4m.j(textView2);
                return;
            }
            Context context = textView2.getContext();
            ColorStateList c = stickerPackBadge instanceof StickerPackBadge.New ? e3m.c(R.attr.vk_ui_background_accent, context) : e3m.c(R.attr.vk_ui_accent_red, context);
            textView2.setText(stickerPackBadge.getText());
            textView2.setBackgroundTintList(c);
            textView2.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.i = inflate.getContext();
        this.k = (VKStickerPackView) inflate.findViewById(R.id.pack_image);
        this.l = (TextView) inflate.findViewById(R.id.pack_title);
        this.m = (TextView) inflate.findViewById(R.id.pack_subtitle);
        this.n = (TextView) inflate.findViewById(R.id.badge);
        this.j = inflate;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
