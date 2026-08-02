package com.vk.catalog2.common.ui.holders.sticker;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.TabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.utils.Logger;
import xsna.bn40;
import xsna.e43;
import xsna.g380;
import xsna.hg1;
import xsna.izs;
import xsna.j4l0;
import xsna.l4l0;
import xsna.n3t;
import xsna.o4v;
import xsna.q3a;
import xsna.r6i0;
import xsna.s3q0;
import xsna.w250;

/* compiled from: StickerHidingToolbarVh.kt */
/* loaded from: classes16.dex */
public final class StickerHidingToolbarVh implements CatalogViewHolder, g380 {
    public final q3a b;
    public final VkSearchQueryVh c;
    public final CatalogViewHolder d;
    public final TabLayoutVh e;
    public final SwitchCatalogVh f;
    public final ArrayList g;
    public ViewGroup h;
    public AppBarLayout i;
    public AppBarShadowView j;
    public LinearLayout k;
    public c l;
    public final SparseArray<Parcelable> m = new SparseArray<>(1);

    /* compiled from: StickerHidingToolbarVh.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public StickerHidingToolbarVh(q3a q3aVar, VkSearchQueryVh vkSearchQueryVh, CatalogViewHolder catalogViewHolder, TabLayoutVh tabLayoutVh, SwitchCatalogVh switchCatalogVh) {
        this.b = q3aVar;
        this.c = vkSearchQueryVh;
        this.d = catalogViewHolder;
        this.e = tabLayoutVh;
        this.f = switchCatalogVh;
        this.g = e43.o(vkSearchQueryVh, catalogViewHolder, tabLayoutVh);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((CatalogViewHolder) it.next()).L();
        }
        this.f.L();
        c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.e.N6(uIBlock);
        this.f.N6(uIBlock);
    }

    public final void a(boolean z) {
        super.Se(this.j, "Call method \"hideSeparator(..)\" only after \"createView(..)\"", new j4l0(z, 0));
    }

    public final void b(final boolean z, final boolean z2) {
        super.Se(this.i, "Call method \"setExpanded(..)\" only after \"createView(..)\"", new izs() { // from class: xsna.k4l0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ((AppBarLayout) obj).g(z, z2, true);
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_media_layout, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_root_vh_layout, viewGroup2, false);
        viewGroup3.addView(this.f.k5(layoutInflater, viewGroup3, bundle));
        viewGroup2.addView(viewGroup3);
        this.h = viewGroup2;
        this.i = (AppBarLayout) viewGroup2.findViewById(R.id.vk_app_bar);
        this.j = (AppBarShadowView) viewGroup2.findViewById(R.id.shadow_view);
        AppBarLayout appBarLayout = this.i;
        View k5 = this.c.k5(layoutInflater, appBarLayout, bundle);
        View k52 = this.d.k5(layoutInflater, appBarLayout, bundle);
        View k53 = this.e.k5(layoutInflater, appBarLayout, bundle);
        LinearLayout linearLayout = new LinearLayout(k52.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(k52);
        appBarLayout.addView(linearLayout);
        appBarLayout.addView(k5);
        appBarLayout.addView(k53);
        appBarLayout.a(new l4l0(linearLayout, k5));
        this.k = linearLayout;
        this.l = hg1.c(this.b.a(), o4v.class).subscribe(new w250(new r6i0(this, 3), 17), new n3t(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 23));
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            CatalogViewHolder catalogViewHolder = (CatalogViewHolder) it.next();
            g380 g380Var = catalogViewHolder instanceof g380 ? (g380) catalogViewHolder : null;
            if (g380Var != null) {
                g380Var.onConfigurationChanged(configuration);
            }
        }
        this.f.onConfigurationChanged(configuration);
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
