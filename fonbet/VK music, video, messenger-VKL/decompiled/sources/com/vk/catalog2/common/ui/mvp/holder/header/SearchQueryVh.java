package com.vk.catalog2.common.ui.mvp.holder.header;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.ModernSearchView;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.bwt0;
import xsna.ca10;
import xsna.dml;
import xsna.duh0;
import xsna.e15;
import xsna.f4m;
import xsna.fnj;
import xsna.fs00;
import xsna.fy0;
import xsna.gda0;
import xsna.gz30;
import xsna.gzs;
import xsna.gzw;
import xsna.h94;
import xsna.iah0;
import xsna.lew;
import xsna.n2q;
import xsna.qno0;
import xsna.s3q0;
import xsna.vg;
import xsna.w2o0;
import xsna.waf0;
import xsna.wzs;
import xsna.xb20;

/* compiled from: SearchQueryVh.kt */
/* loaded from: classes16.dex */
public final class SearchQueryVh implements CatalogSearchQueryViewHolder {
    public final int b;
    public gzs<Boolean> c;
    public final gzs<s3q0> d;
    public final gzs<s3q0> e;
    public final duh0 f;
    public final boolean g;
    public final boolean h;
    public io.reactivex.rxjava3.disposables.c i;
    public io.reactivex.rxjava3.disposables.c j;
    public ModernSearchView k;

    public /* synthetic */ SearchQueryVh(int i, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, dml dmlVar, int i2) {
        this(i, gzsVar, gzsVar2, gzsVar3, dmlVar, true, (i2 & 64) != 0);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Fb() {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.c(0L);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void K6(boolean z) {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.p.c(true);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Kf(gzs<s3q0> gzsVar) {
        throw null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Km(long j) {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.b(j);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.f.getClass();
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        this.i = null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ml(int i, int i2) {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            h94 a = w2o0.a.a(i, i2);
            ImageView imageView = modernSearchView.g;
            if (imageView != null) {
                modernSearchView.g(imageView, a);
            }
            modernSearchView.setThirdIconCounter(0);
            modernSearchView.setThirdIconVisibility(true);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void P1(String str) {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.setHint(str);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ta() {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.f();
        }
    }

    public final io.reactivex.rxjava3.disposables.c a(ModernSearchView modernSearchView, long j, wzs<? super String, ? super SearchInputMethod, s3q0> wzsVar) {
        q U = new gzw.a(new qno0(modernSearchView.j)).U(new xb20(new waf0(this, 5), 13));
        if (j > 0) {
            U = U.z(j, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b());
        }
        return U.subscribe(new fs00(new gda0(wzsVar, 13), 20), new ca10(new gz30(17), 19));
    }

    public final void b(final ModernSearchView modernSearchView) {
        gzs<Boolean> gzsVar = this.c;
        gzs<s3q0> gzsVar2 = this.d;
        if (gzsVar != null) {
            Context context = modernSearchView.getContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                modernSearchView.e(this.c, gzsVar2);
                modernSearchView.setOnActionSearchQueryClick(new n2q(3, this, modernSearchView));
                return;
            }
        }
        modernSearchView.setBackArrowAllowedInEditMode(true);
        modernSearchView.e(new fy0(18, this, modernSearchView), gzsVar2);
        modernSearchView.setBackArrowAllowedInEditMode(false);
        modernSearchView.setOnActionSearchQueryClick(new View.OnClickListener() { // from class: xsna.zxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchQueryVh searchQueryVh = SearchQueryVh.this;
                gzs<Boolean> gzsVar3 = searchQueryVh.c;
                ModernSearchView modernSearchView2 = modernSearchView;
                if (gzsVar3 != null) {
                    ImageView imageView = modernSearchView2.b;
                    if (imageView != null) {
                        d3m.b(imageView, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    }
                    if (imageView != null) {
                        modernSearchView2.g(imageView, ModernSearchView.y);
                    }
                }
                searchQueryVh.f.a3(modernSearchView2.getQuery());
            }
        });
        modernSearchView.findViewById(R.id.iv_icon_left).setOnClickListener(new vg(modernSearchView, 5));
        modernSearchView.h();
    }

    public final void c(ModernSearchView modernSearchView) {
        this.k = modernSearchView;
        duh0 duh0Var = this.f;
        Pair<Long, wzs<String, SearchInputMethod, s3q0>> c3 = duh0Var.c3();
        long longValue = c3.d().longValue();
        wzs<String, SearchInputMethod, s3q0> g = c3.g();
        b(modernSearchView);
        this.i = a(modernSearchView, longValue, g);
        this.j = a(modernSearchView, 0L, duh0Var.b3());
        modernSearchView.setOnActionSearchListener(new e15(duh0Var, 10));
        modernSearchView.setOnActionClearListener(new lew(duh0Var));
        modernSearchView.setHint(this.b);
        modernSearchView.setParamsClickListener(this.e);
        int a = iah0.a(4);
        modernSearchView.setPadding(0, a, a, a);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final Boolean c9() {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            return Boolean.valueOf(modernSearchView.getFocused());
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            f4m.j(modernSearchView);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final String i() {
        String query;
        ModernSearchView modernSearchView = this.k;
        return (modernSearchView == null || (query = modernSearchView.getQuery()) == null) ? "" : query;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void k3() {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.a();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            return modernSearchView;
        }
        ModernSearchView modernSearchView2 = (ModernSearchView) layoutInflater.inflate(R.layout.catalog_search_query_view, viewGroup, false);
        c(modernSearchView2);
        return modernSearchView2;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void om(boolean z) {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.p.a(true);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final ModernSearchView pi() {
        return this.k;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void setEnabled(boolean z) {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.setEnabled(z);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            modernSearchView.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void y8() {
        this.c = null;
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView != null) {
            b(modernSearchView);
            ImageView imageView = modernSearchView.b;
            if (imageView != null) {
                bwt0.p0(imageView, false);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void zf(String str, boolean z) {
        ModernSearchView modernSearchView = this.k;
        if (modernSearchView == null || str.equals(i())) {
            return;
        }
        if (!z) {
            modernSearchView.setQuery(str);
            return;
        }
        Pair<Long, wzs<String, SearchInputMethod, s3q0>> c3 = this.f.c3();
        long longValue = c3.d().longValue();
        wzs<String, SearchInputMethod, s3q0> g = c3.g();
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        modernSearchView.setQuery(str);
        this.i = a(modernSearchView, longValue, g);
    }

    public SearchQueryVh(int i, gzs<Boolean> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3, duh0 duh0Var, boolean z, boolean z2) {
        this.b = i;
        this.c = gzsVar;
        this.d = gzsVar2;
        this.e = gzsVar3;
        this.f = duh0Var;
        this.g = z;
        this.h = z2;
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
