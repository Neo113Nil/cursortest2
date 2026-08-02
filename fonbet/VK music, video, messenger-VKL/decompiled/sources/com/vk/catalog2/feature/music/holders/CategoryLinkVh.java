package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.style.CategoriesListViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.e3m;
import xsna.eko;
import xsna.f4m;
import xsna.gzs;
import xsna.izs;
import xsna.jla;
import xsna.k1u0;
import xsna.kla;
import xsna.maz;
import xsna.oq;
import xsna.tlo0;
import xsna.x7g;
import xsna.xwk;

/* compiled from: CategoryLinkVh.kt */
/* loaded from: classes16.dex */
public final class CategoryLinkVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final int c;
    public final int d;
    public final int e;
    public final CategoriesListViewStyle.Style f;
    public VkCell g;
    public UIBlockLink h;

    public CategoryLinkVh(b5a b5aVar, int i, CategoriesListViewStyle.Style style, int i2) {
        int i3 = (i2 & 4) != 0 ? 0 : R.dimen.catalog_link_music_category_icon_size;
        int i4 = (i2 & 16) != 0 ? 1 : 2;
        style = (i2 & 32) != 0 ? new CategoriesListViewStyle(CategoriesListViewStyle.Style.None).b : style;
        this.b = b5aVar;
        this.c = i;
        this.d = i3;
        this.e = i4;
        this.f = style;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Drawable d;
        TextUtils.TruncateAt truncateAt;
        UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        if (uIBlockLink == null) {
            return;
        }
        this.h = uIBlockLink;
        CatalogLink catalogLink = uIBlockLink.y;
        Image image = catalogLink.f;
        String str = catalogLink.d;
        boolean isEmpty = image.b.isEmpty();
        CategoriesListViewStyle.Style style = this.f;
        if (isEmpty) {
            VkCell vkCell = this.g;
            if (vkCell == null) {
                vkCell = null;
            }
            vkCell.setLeft((VkCell.Left.b) null);
        } else {
            VkCell vkCell2 = this.g;
            if (vkCell2 == null) {
                vkCell2 = null;
            }
            vkCell2.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new kla(catalogLink), VkCell.Left.Main.Size.Small)));
            if (style == CategoriesListViewStyle.Style.KIDS_MODE) {
                VkCell vkCell3 = this.g;
                VkCell vkCell4 = vkCell3 == null ? null : vkCell3;
                if (vkCell3 == null) {
                    vkCell3 = null;
                }
                f4m.x(e3m.a(R.dimen.vk_ui_spacing_size_xl, vkCell3.getContext()), vkCell4);
            }
        }
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        VkCell vkCell5 = this.g;
        if (vkCell5 == null) {
            vkCell5 = null;
        }
        Context context = vkCell5.getContext();
        Meta meta = catalogLink.g;
        d = VerifyInfoHelper.a.d(context, false, meta != null ? meta.b : null, (r14 & 8) != 0 ? false : false, (r14 & 16) != 0, (r14 & 32) != 0 ? false : false);
        VkCell vkCell6 = this.g;
        if (vkCell6 == null) {
            vkCell6 = null;
        }
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.h d2 = oq.d(tlo0.Companion, catalogLink.c);
        truncateAt = TextUtils.TruncateAt.END;
        vkCell6.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(d2, this.e, truncateAt, (VkCell.Middle.e.b) null, d == null ? null : new VkCell.Middle.e.b.C0817b(new eko(d), (k1u0) null, (tlo0.f) null, (Size) null, 14), 18), str.length() == 0 ? null : new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        VkCell vkCell7 = this.g;
        if (vkCell7 == null) {
            vkCell7 = null;
        }
        vkCell7.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, new k1u0.a(style == CategoriesListViewStyle.Style.KIDS_MODE ? new x7g(R.attr.vk_ui_icon_medium) : new x7g(R.attr.vk_ui_icon_secondary)), 3), 23));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        inflate.setOnClickListener(new c98(this, 1));
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.cell);
        vkCell.setLeftMainPictureController(new jla(this.d));
        this.g = vkCell;
        if (this.f == CategoriesListViewStyle.Style.KIDS_MODE) {
            CardView cardView = inflate instanceof CardView ? (CardView) inflate : null;
            if (cardView != null) {
                cardView.setOutlineSpotShadowColor(cardView.getContext().getColor(R.color.vk_black_alpha60));
                cardView.setOutlineAmbientShadowColor(cardView.getContext().getColor(R.color.vk_black_alpha75));
            }
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        UIBlockLink uIBlockLink = this.h;
        CatalogLink catalogLink = uIBlockLink != null ? uIBlockLink.y : null;
        if (uIBlockLink == null || catalogLink == null) {
            return;
        }
        this.b.a(new cfp0(uIBlockLink, null));
        maz.c(xwk.d().e(), view.getContext(), catalogLink.e, LaunchContext.A, null, null, 24);
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
