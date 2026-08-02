package com.vk.catalog2.common.ui.holders;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarExpandableControllerBehaviour;
import com.vk.core.view.AppBarShadowView;
import com.vkontakte.android.R;
import defpackage.z;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.utils.Logger;
import xsna.bn40;
import xsna.g0c;
import xsna.g380;
import xsna.hg1;
import xsna.izs;
import xsna.lwh;
import xsna.o4v;
import xsna.p4v;
import xsna.q3a;
import xsna.ru4;
import xsna.s3q0;
import xsna.xz;

/* compiled from: HidingToolbarVh.kt */
/* loaded from: classes16.dex */
public class HidingToolbarVh implements CatalogViewHolder, g380 {
    public final q3a b;
    public final List<CatalogViewHolder> c;
    public final CatalogViewHolder d;
    public final AppBarExpandableControllerBehaviour e;
    public AppBarLayout f;
    public AppBarShadowView g;
    public io.reactivex.rxjava3.disposables.c h;
    public boolean i = true;
    public boolean j;

    /* compiled from: HidingToolbarVh.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HidingToolbarVh(q3a q3aVar, List<? extends CatalogViewHolder> list, CatalogViewHolder catalogViewHolder, AppBarExpandableControllerBehaviour appBarExpandableControllerBehaviour) {
        this.b = q3aVar;
        this.c = list;
        this.d = catalogViewHolder;
        this.e = appBarExpandableControllerBehaviour;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            ((CatalogViewHolder) it.next()).L();
        }
        this.d.L();
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            ((CatalogViewHolder) it.next()).N6(uIBlock);
        }
        this.d.N6(uIBlock);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        boolean z = uIBlockList != null ? uIBlockList.J : false;
        this.i = z;
        if (this.j) {
            a(z);
        }
    }

    public final void a(boolean z) {
        super.Se(this.g, "Call method \"hideSeparator(..)\" only after \"createView(..)\"", new p4v(z, 0));
    }

    public final void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_root_vh_layout, viewGroup, false);
        viewGroup2.addView(this.d.k5(layoutInflater, viewGroup2, bundle));
        viewGroup.addView(viewGroup2);
        this.f = (AppBarLayout) viewGroup.findViewById(R.id.vk_app_bar);
        this.g = (AppBarShadowView) viewGroup.findViewById(R.id.shadow_view);
        for (CatalogViewHolder catalogViewHolder : this.c) {
            AppBarLayout appBarLayout = this.f;
            if (appBarLayout != null) {
                appBarLayout.addView(catalogViewHolder.k5(layoutInflater, appBarLayout, bundle));
            }
        }
        AppBarExpandableControllerBehaviour appBarExpandableControllerBehaviour = this.e;
        if (appBarExpandableControllerBehaviour != null) {
            AppBarLayout appBarLayout2 = this.f;
            ViewGroup.LayoutParams layoutParams = appBarLayout2 != null ? appBarLayout2.getLayoutParams() : null;
            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
            if (fVar != null) {
                fVar.c(appBarExpandableControllerBehaviour);
            }
        }
        this.h = hg1.c(this.b.a(), o4v.class).subscribe(new xz(new lwh(this, 18), 26), new z(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 27));
    }

    public final void c(boolean z) {
        super.Se(this.f, "Call method \"setExpandable(..)\" only after \"createView(..)\"", new ru4(this, z, 1));
    }

    public final void d(boolean z, boolean z2) {
        super.Se(this.f, "Call method \"setExpanded(..)\" only after \"createView(..)\"", new g0c(z, z2, 1));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_media_layout, viewGroup, false);
        b(layoutInflater, (ViewGroup) inflate, bundle);
        return inflate;
    }

    @Override // xsna.g380
    public void onConfigurationChanged(Configuration configuration) {
        g380 g380Var;
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CatalogViewHolder catalogViewHolder = (CatalogViewHolder) it.next();
            g380Var = catalogViewHolder instanceof g380 ? (g380) catalogViewHolder : null;
            if (g380Var != null) {
                g380Var.onConfigurationChanged(configuration);
            }
        }
        CatalogViewHolder catalogViewHolder2 = this.d;
        g380Var = catalogViewHolder2 instanceof g380 ? (g380) catalogViewHolder2 : null;
        if (g380Var != null) {
            g380Var.onConfigurationChanged(configuration);
        }
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
