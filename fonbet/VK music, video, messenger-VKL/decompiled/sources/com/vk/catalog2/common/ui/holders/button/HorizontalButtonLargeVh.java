package com.vk.catalog2.common.ui.holders.button;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.subscriptions.UIBlockHorizontalButtonLarge;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.f4m;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.k1u0;
import xsna.lmb;
import xsna.oq;
import xsna.qdz;
import xsna.tlo0;
import xsna.x7g;

/* compiled from: HorizontalButtonLargeVh.kt */
/* loaded from: classes16.dex */
public final class HorizontalButtonLargeVh implements CatalogViewHolder {
    public final qdz b;
    public final boolean c;
    public VkCell d;

    public HorizontalButtonLargeVh(qdz qdzVar, boolean z) {
        this.b = qdzVar;
        this.c = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        if (uIBlock instanceof UIBlockHorizontalButtonLarge) {
            UIBlockHorizontalButtonLarge uIBlockHorizontalButtonLarge = (UIBlockHorizontalButtonLarge) uIBlock;
            CatalogButtonOpenUrl catalogButtonOpenUrl = (CatalogButtonOpenUrl) j5g.b0(0, uIBlockHorizontalButtonLarge.y);
            if (catalogButtonOpenUrl == null) {
                VkCell vkCell = this.d;
                (vkCell != null ? vkCell : null).setVisibility(8);
                return;
            }
            VkCell vkCell2 = this.d;
            if (vkCell2 == null) {
                vkCell2 = null;
            }
            vkCell2.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(R.drawable.vk_icon_users_outline_24, VkCell.Left.Main.Size.Small, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), (tlo0.h) null, 8), null));
            VkCell vkCell3 = this.d;
            if (vkCell3 == null) {
                vkCell3 = null;
            }
            vkCell3.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, catalogButtonOpenUrl.e), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
            VkCell vkCell4 = this.d;
            if (vkCell4 == null) {
                vkCell4 = null;
            }
            vkCell4.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
            ActionOpenUrl actionOpenUrl = catalogButtonOpenUrl.f;
            if (actionOpenUrl == null || (str = actionOpenUrl.c) == null) {
                return;
            }
            VkCell vkCell5 = this.d;
            (vkCell5 != null ? vkCell5 : null).setOnClickListener(new lmb(this, str, uIBlockHorizontalButtonLarge, 1));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        float f = 12;
        int a = iah0.a(f);
        f4m.B(a, a, frameLayout);
        if (this.c) {
            int a2 = iah0.a(36);
            f4m.l(a2, a2, frameLayout);
        } else {
            int a3 = iah0.a(f);
            f4m.l(a3, a3, frameLayout);
        }
        VkCell vkCell = new VkCell(layoutInflater.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int a4 = iah0.a(4);
        f4m.B(a4, a4, vkCell);
        vkCell.setId(R.id.btn_change_author);
        bwt0.d(vkCell, iah0.b(16.0f), (r4 & 2) != 0, (r4 & 4) != 0);
        vkCell.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
        this.d = vkCell;
        frameLayout.addView(vkCell);
        return frameLayout;
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
