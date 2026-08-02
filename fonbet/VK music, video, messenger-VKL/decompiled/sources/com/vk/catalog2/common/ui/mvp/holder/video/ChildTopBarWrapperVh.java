package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.aac;
import xsna.awt0;
import xsna.b0u0;
import xsna.bpn0;
import xsna.f4m;
import xsna.i70;
import xsna.iut0;
import xsna.j70;
import xsna.z9c;

/* compiled from: ChildTopBarWrapperVh.kt */
/* loaded from: classes16.dex */
public final class ChildTopBarWrapperVh implements CatalogViewHolder {
    public final Activity b;
    public final VkTopBarSearchQueryVh c;
    public final bpn0 d = new bpn0(new i70(this, 16));
    public final bpn0 e = new bpn0(new j70(this, 15));
    public VkImage f;

    public ChildTopBarWrapperVh(Activity activity, VkTopBarSearchQueryVh vkTopBarSearchQueryVh) {
        this.b = activity;
        this.c = vkTopBarSearchQueryVh;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.catalog_child_topbar_wrapper, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.wrapper);
        View k5 = this.c.k5(layoutInflater, constraintLayout, bundle);
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.background_image);
        Drawable drawable = vkImage.getContext().getDrawable(R.drawable.top_bar_kids_background);
        if (drawable != null) {
            vkImage.setImageDrawable(drawable);
            vkImage.setBackgroundResource(R.drawable.top_bar_kids_gradient);
            vkImage.setScaleType(ImageView.ScaleType.MATRIX);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = vkImage.getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = vkImage.getMeasuredHeight();
            f4m.a(vkImage, new aac(vkImage, ref$IntRef, ref$IntRef2, vkImage, drawable));
            awt0.u(vkImage, ((Boolean) this.e.getValue()).booleanValue());
            this.f = vkImage;
        }
        z9c z9cVar = new z9c(k5, i);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(inflate, z9cVar);
        constraintLayout.addView(k5, new ConstraintLayout.b(-1, -2));
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.k(k5.getId(), 3, 0, 3);
        bVar.b(constraintLayout);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
