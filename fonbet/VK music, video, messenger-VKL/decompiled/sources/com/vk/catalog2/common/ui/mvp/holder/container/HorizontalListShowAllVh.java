package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.lists.c;
import com.vkontakte.android.R;
import xsna.b9s0;
import xsna.bwt0;
import xsna.c98;
import xsna.cn70;
import xsna.dhr0;
import xsna.drm0;
import xsna.izs;
import xsna.lpg0;
import xsna.mev;
import xsna.o9;
import xsna.s3q0;
import xsna.u4a;
import xsna.y1a;

/* compiled from: HorizontalListShowAllVh.kt */
/* loaded from: classes16.dex */
public final class HorizontalListShowAllVh extends HorizontalListVh implements View.OnClickListener {
    public static final int B = cn70.b(64);
    public izs<? super Context, s3q0> A;
    public final lpg0 w;
    public VkText x;
    public Guideline y;
    public View z;

    public HorizontalListShowAllVh(b9s0 b9s0Var, c.h hVar, y1a y1aVar, u4a u4aVar, lpg0 lpg0Var) {
        super(b9s0Var, hVar, y1aVar, u4aVar, null, b9s0Var.A(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar));
        this.w = lpg0Var;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList != null) {
            w(uIBlockList);
        }
        super.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.catalog_horizontal_list_show_all, viewGroup, false);
        this.x = (VkText) inflate.findViewById(R.id.show_all_textview);
        this.y = (Guideline) inflate.findViewById(R.id.show_all_guideline);
        this.z = inflate.findViewById(R.id.gradient_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.horizontal_vh_container);
        View view = this.z;
        if (view == null) {
            view = null;
        }
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, dhr0.t.c(R.attr.vk_ui_background_content)}));
        k5.setId(View.generateViewId());
        k5.getLayoutParams().width = 0;
        constraintLayout.addView(k5, 0);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.l(k5.getId(), 3, constraintLayout.getId(), 3, 0);
        bVar.l(k5.getId(), 6, constraintLayout.getId(), 6, 0);
        int id = k5.getId();
        View view2 = this.z;
        bVar.l(id, 7, (view2 != null ? view2 : null).getId(), 7, 0);
        bVar.b(constraintLayout);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        izs<? super Context, s3q0> izsVar;
        if (view == null || (context = view.getContext()) == null || (izsVar = this.A) == null) {
            return;
        }
        izsVar.invoke(context);
    }

    public final void w(UIBlockList uIBlockList) {
        ActionOpenUrl actionOpenUrl;
        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockList.G;
        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockList.F;
        String str = (uIBlockActionOpenUrl == null || (actionOpenUrl = uIBlockActionOpenUrl.A) == null) ? null : actionOpenUrl.c;
        int i = B;
        if (uIBlockActionOpenSection != null) {
            View view = this.z;
            if (view == null) {
                view = null;
            }
            bwt0.p0(view, true);
            VkText vkText = this.x;
            if (vkText == null) {
                vkText = null;
            }
            bwt0.p0(vkText, true);
            VkText vkText2 = this.x;
            if (vkText2 == null) {
                vkText2 = null;
            }
            vkText2.setText(uIBlockActionOpenSection.z);
            VkText vkText3 = this.x;
            if (vkText3 == null) {
                vkText3 = null;
            }
            vkText3.setOnClickListener(new c98(this, 1));
            Guideline guideline = this.y;
            (guideline != null ? guideline : null).setGuidelineBegin(i);
            this.A = new o9(27, this, uIBlockList);
            return;
        }
        if (str == null || drm0.N(str)) {
            View view2 = this.z;
            if (view2 == null) {
                view2 = null;
            }
            bwt0.p0(view2, false);
            VkText vkText4 = this.x;
            if (vkText4 == null) {
                vkText4 = null;
            }
            bwt0.p0(vkText4, false);
            VkText vkText5 = this.x;
            if (vkText5 == null) {
                vkText5 = null;
            }
            vkText5.setOnClickListener(null);
            Guideline guideline2 = this.y;
            (guideline2 != null ? guideline2 : null).setGuidelineBegin(0);
            return;
        }
        View view3 = this.z;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.p0(view3, true);
        VkText vkText6 = this.x;
        if (vkText6 == null) {
            vkText6 = null;
        }
        bwt0.p0(vkText6, true);
        VkText vkText7 = this.x;
        if (vkText7 == null) {
            vkText7 = null;
        }
        vkText7.setText(uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.z : null);
        VkText vkText8 = this.x;
        if (vkText8 == null) {
            vkText8 = null;
        }
        vkText8.setOnClickListener(new c98(this, 1));
        Guideline guideline3 = this.y;
        (guideline3 != null ? guideline3 : null).setGuidelineBegin(i);
        this.A = new mev(str, 0);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList != null) {
            w(uIBlockList);
        }
        N6(uIBlock);
    }
}
