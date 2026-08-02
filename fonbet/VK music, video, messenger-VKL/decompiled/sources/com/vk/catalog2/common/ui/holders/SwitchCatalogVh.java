package com.vk.catalog2.common.ui.holders;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.alj;
import xsna.bnn0;
import xsna.bwt0;
import xsna.g380;
import xsna.gzs;
import xsna.hha;
import xsna.lhp;
import xsna.ltz;
import xsna.mzp0;
import xsna.n0q0;
import xsna.swp;
import xsna.vyh0;
import xsna.zx90;

/* compiled from: SwitchCatalogVh.kt */
/* loaded from: classes16.dex */
public final class SwitchCatalogVh implements CatalogStatesViewHolder, g380 {
    public final CatalogViewHolder b;
    public final CatalogViewHolder c;
    public final ErrorStateVh d;
    public final ProgressVh e;
    public final b f;
    public final int g;
    public final n0q0 h;
    public final EmptyScreenWithTextVh i;
    public final boolean j;
    public final boolean k;
    public final mzp0 l;
    public a m;
    public View n;
    public View o;
    public a p;
    public View q;
    public bnn0 r;
    public bnn0 s;

    /* compiled from: SwitchCatalogVh.kt */
    public static final class a {
        public final gzs<View> a;
        public View b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, gzs<? extends View> gzsVar) {
            this.a = gzsVar;
            if (z) {
                return;
            }
            a();
        }

        public final View a() {
            if (this.b == null) {
                this.b = this.a.invoke();
            }
            return this.b;
        }
    }

    /* compiled from: SwitchCatalogVh.kt */
    public interface b {
        void j(bnn0 bnn0Var);
    }

    public SwitchCatalogVh(CatalogViewHolder catalogViewHolder, CatalogViewHolder catalogViewHolder2, ErrorStateVh errorStateVh, ProgressVh progressVh, b bVar, int i, n0q0 n0q0Var, EmptyScreenWithTextVh emptyScreenWithTextVh, boolean z, boolean z2, mzp0 mzp0Var, int i2) {
        catalogViewHolder2 = (i2 & 2) != 0 ? null : catalogViewHolder2;
        progressVh = (i2 & 8) != 0 ? new ProgressVh((Object) null) : progressVh;
        bVar = (i2 & 16) != 0 ? null : bVar;
        i = (i2 & 32) != 0 ? R.layout.catalog_root_vh_layout : i;
        n0q0Var = (i2 & 64) != 0 ? null : n0q0Var;
        emptyScreenWithTextVh = (i2 & 128) != 0 ? null : emptyScreenWithTextVh;
        z = (i2 & 256) != 0 ? false : z;
        z2 = (i2 & 512) != 0 ? false : z2;
        mzp0Var = (i2 & 1024) != 0 ? null : mzp0Var;
        this.b = catalogViewHolder;
        this.c = catalogViewHolder2;
        this.d = errorStateVh;
        this.e = progressVh;
        this.f = bVar;
        this.g = i;
        this.h = n0q0Var;
        this.i = emptyScreenWithTextVh;
        this.j = z;
        this.k = z2;
        this.l = mzp0Var;
        bnn0 bnn0Var = emptyScreenWithTextVh != null ? lhp.a : alj.a;
        this.r = bnn0Var;
        this.s = bnn0Var;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        if (!(this.r instanceof alj)) {
            return false;
        }
        CatalogViewHolder catalogViewHolder = this.b;
        hha hhaVar = catalogViewHolder instanceof hha ? (hha) catalogViewHolder : null;
        if (hhaVar != null) {
            return hhaVar.A(str);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        CatalogViewHolder catalogViewHolder = this.b;
        if (catalogViewHolder != null) {
            catalogViewHolder.L();
        }
        CatalogViewHolder catalogViewHolder2 = this.c;
        if (catalogViewHolder2 != null) {
            catalogViewHolder2.L();
        }
        this.d.L();
        this.e.c = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        CatalogViewHolder catalogViewHolder;
        bnn0 bnn0Var = this.s;
        boolean z = bnn0Var instanceof alj;
        CatalogViewHolder catalogViewHolder2 = this.b;
        if ((z || (bnn0Var instanceof lhp)) && this.n != null) {
            if (catalogViewHolder2 != null) {
                catalogViewHolder2.N6(uIBlock);
            }
            i8(alj.a);
            mzp0 mzp0Var = this.l;
            if (mzp0Var != null) {
                mzp0Var.d(this.n);
                return;
            }
            return;
        }
        if ((bnn0Var instanceof vyh0) && this.n != null) {
            if (catalogViewHolder2 != null) {
                catalogViewHolder2.N6(uIBlock);
            }
            i8(vyh0.a);
            return;
        }
        a aVar = this.m;
        if (aVar != null) {
            if (aVar != null && aVar.a() != null && (catalogViewHolder = this.c) != null) {
                catalogViewHolder.N6(uIBlock);
            }
            i8(vyh0.a);
        }
    }

    public final void a(bnn0 bnn0Var) {
        View view = this.n;
        if (view != null) {
            bwt0.p0(view, bnn0Var instanceof alj);
        }
        a aVar = this.p;
        if (aVar == null) {
            aVar = null;
        }
        boolean z = bnn0Var instanceof swp;
        if (z) {
            aVar.a();
        }
        View view2 = aVar.b;
        if (view2 != null) {
            bwt0.p0(view2, z);
        }
        View view3 = this.q;
        bwt0.p0(view3 != null ? view3 : null, bnn0Var instanceof ltz);
        a aVar2 = this.m;
        if (aVar2 != null) {
            boolean z2 = bnn0Var instanceof vyh0;
            if (z2) {
                aVar2.a();
            }
            View view4 = aVar2.b;
            if (view4 != null) {
                bwt0.p0(view4, z2);
            }
        }
        View view5 = this.o;
        if (view5 != null) {
            bwt0.p0(view5, bnn0Var instanceof lhp);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i8(bnn0 bnn0Var) {
        n0q0 n0q0Var;
        b bVar;
        boolean z = bnn0Var instanceof alj;
        if (z) {
            if (!(this.n == null)) {
                this.s = bnn0Var;
                bnn0 bnn0Var2 = this.r;
                n0q0Var = this.h;
                if (n0q0Var != null) {
                    if (((bnn0Var2 instanceof alj) || (bnn0Var2 instanceof ltz) || (bnn0Var2 instanceof lhp)) && (bnn0Var instanceof vyh0)) {
                        UiTracker.h(n0q0Var);
                    } else if ((bnn0Var2 instanceof vyh0) && z) {
                        UiTracker uiTracker = UiTracker.a;
                        UiTracker.i.g();
                    }
                }
                this.r = bnn0Var;
                bVar = this.f;
                if (bVar != null) {
                    bVar.j(bnn0Var);
                }
                a(bnn0Var);
            }
        }
        if (bnn0Var instanceof vyh0) {
            if (!(this.m == null)) {
                this.s = bnn0Var;
                bnn0 bnn0Var22 = this.r;
                n0q0Var = this.h;
                if (n0q0Var != null) {
                }
                this.r = bnn0Var;
                bVar = this.f;
                if (bVar != null) {
                }
                a(bnn0Var);
            }
        }
        if (bnn0Var instanceof lhp) {
            if (!(this.o == null)) {
                this.s = bnn0Var;
                bnn0 bnn0Var222 = this.r;
                n0q0Var = this.h;
                if (n0q0Var != null) {
                }
                this.r = bnn0Var;
                bVar = this.f;
                if (bVar != null) {
                }
                a(bnn0Var);
            }
        }
        boolean z2 = bnn0Var instanceof swp;
        mzp0 mzp0Var = this.l;
        if (z2) {
            if (mzp0Var != null) {
                mzp0Var.f();
            }
            a aVar = this.p;
            if (aVar == null) {
                aVar = null;
            }
            if (aVar.a() != null) {
                this.d.b(((swp) bnn0Var).a);
            }
        } else {
            if (!(bnn0Var instanceof ltz)) {
                return;
            }
            if (mzp0Var != null) {
                mzp0Var.a();
            }
        }
        bnn0 bnn0Var2222 = this.r;
        n0q0Var = this.h;
        if (n0q0Var != null) {
        }
        this.r = bnn0Var;
        bVar = this.f;
        if (bVar != null) {
        }
        a(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(final LayoutInflater layoutInflater, ViewGroup viewGroup, final Bundle bundle) {
        View view;
        View inflate = layoutInflater.inflate(this.g, viewGroup, false);
        View view2 = null;
        final ViewGroup viewGroup2 = inflate instanceof ViewGroup ? (ViewGroup) inflate : null;
        if (viewGroup2 == null) {
            return inflate;
        }
        View k5 = this.e.k5(layoutInflater, viewGroup2, bundle);
        viewGroup2.addView(k5);
        this.q = k5;
        this.p = new a(this.k, new zx90(this, layoutInflater, viewGroup2, bundle));
        CatalogViewHolder catalogViewHolder = this.b;
        if (catalogViewHolder == null || (view = catalogViewHolder.k5(layoutInflater, viewGroup2, bundle)) == null) {
            view = null;
        } else {
            viewGroup2.addView(view);
        }
        this.n = view;
        final CatalogViewHolder catalogViewHolder2 = this.c;
        this.m = catalogViewHolder2 != null ? new a(this.j, new gzs() { // from class: xsna.ann0
            @Override // xsna.gzs
            public final Object invoke() {
                Bundle bundle2 = bundle;
                CatalogViewHolder catalogViewHolder3 = CatalogViewHolder.this;
                LayoutInflater layoutInflater2 = layoutInflater;
                ViewGroup viewGroup3 = viewGroup2;
                View k52 = catalogViewHolder3.k5(layoutInflater2, viewGroup3, bundle2);
                viewGroup3.addView(k52);
                return k52;
            }
        }) : null;
        EmptyScreenWithTextVh emptyScreenWithTextVh = this.i;
        if (emptyScreenWithTextVh != null) {
            view2 = emptyScreenWithTextVh.k5(layoutInflater, viewGroup2, bundle);
            viewGroup2.addView(view2);
        }
        this.o = view2;
        a(this.r);
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        CatalogViewHolder catalogViewHolder = this.c;
        g380 g380Var = catalogViewHolder instanceof g380 ? (g380) catalogViewHolder : null;
        if (g380Var != null) {
            g380Var.onConfigurationChanged(configuration);
        }
        CatalogViewHolder catalogViewHolder2 = this.b;
        g380 g380Var2 = catalogViewHolder2 instanceof g380 ? (g380) catalogViewHolder2 : null;
        if (g380Var2 != null) {
            g380Var2.onConfigurationChanged(configuration);
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
