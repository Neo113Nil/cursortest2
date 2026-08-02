package com.vk.catalog2.common.ui.mvp.holder.sticker;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickersBonusBalance;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import xsna.bym;
import xsna.cn70;
import xsna.d2a;
import xsna.e3m;
import xsna.enj;
import xsna.f4m;
import xsna.io1;
import xsna.j7p0;
import xsna.n15;
import xsna.pgn;
import xsna.qcy;
import xsna.xpm0;

/* compiled from: StickerTopBarBonusBalanceVh.kt */
/* loaded from: classes16.dex */
public final class StickerTopBarBonusBalanceVh implements CatalogViewHolder {
    public final d2a b;
    public final GiftData c;
    public final ContextUser d;
    public TextView e;
    public View f;

    public StickerTopBarBonusBalanceVh(d2a d2aVar, GiftData giftData, ContextUser contextUser) {
        this.b = d2aVar;
        this.c = giftData;
        this.d = contextUser;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        pgn pgnVar = this.b.d;
        qcy<Object>[] qcyVarArr = d2a.e;
        qcy<Object> qcyVar = qcyVarArr[0];
        c cVar = (c) pgnVar.b;
        if (cVar != null) {
            cVar.dispose();
        }
        qcy<Object> qcyVar2 = qcyVarArr[0];
        pgnVar.b(null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockStickersBonusBalance) {
            TextView textView = this.e;
            if (textView == null) {
                textView = null;
            }
            StickersBonusBalance stickersBonusBalance = ((UIBlockStickersBonusBalance) uIBlock).y;
            textView.setText(xpm0.a(stickersBonusBalance.b));
            TextView textView2 = this.e;
            TextView textView3 = textView2 == null ? null : textView2;
            if (textView2 == null) {
                textView2 = null;
            }
            textView3.setContentDescription(enj.f(R.plurals.stickers_catalog_bonus_points_accessibility, stickersBonusBalance.b, textView2.getContext()));
            TextView textView4 = this.e;
            (textView4 != null ? textView4 : null).setVisibility(0);
            d2a d2aVar = this.b;
            c subscribe = d2aVar.c.a().subscribe(new io1(new n15(uIBlock, d2aVar, this, 1), 10));
            pgn pgnVar = d2aVar.d;
            qcy<Object> qcyVar = d2a.e[0];
            pgnVar.b(subscribe);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.f;
        if (view == null) {
            view = null;
        }
        TextView textView = new TextView(view.getContext());
        Context context = textView.getContext();
        Context context2 = textView.getContext();
        e3m.a aVar = e3m.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, enj.c(R.drawable.vk_icon_sticker_energy_product_16, context2.getColor(R.color.vk_white), context), (Drawable) null);
        textView.setCompoundDrawablePadding(cn70.b(4));
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        textView.setBackground(new j7p0(textView.getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_border_radius_promo)));
        textView.setPadding(cn70.b(9), cn70.b(5), cn70.b(6), cn70.b(5));
        textView.setTextAppearance(R.style.VkUiTypography_SubheadSemiBold);
        textView.setTextColor(textView.getContext().getColor(R.color.vk_white));
        textView.setOnClickListener(new bym(4, textView, this));
        this.e = textView;
        f4m.j(textView);
        View view2 = this.f;
        if (view2 == null) {
            view2 = null;
        }
        TextView textView2 = this.e;
        if (textView2 == null) {
            textView2 = null;
        }
        ViewParent parent = view2.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            int indexOfChild = viewGroup2.indexOfChild(view2);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -1;
            textView2.setLayoutParams(layoutParams);
            if (view2.getId() != -1) {
                textView2.setId(view2.getId());
            }
            viewGroup2.removeView(view2);
            viewGroup2.addView(textView2, indexOfChild);
        }
        View view3 = this.f;
        if (view3 == null) {
            return null;
        }
        return view3;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
