package com.vk.catalog2.common.ui.mvp.holder.header;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.movika.sdk.base.observable.m;
import com.vkontakte.android.R;
import defpackage.r;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.concurrent.TimeUnit;
import xsna.a34;
import xsna.af2;
import xsna.bf2;
import xsna.bwt0;
import xsna.e5;
import xsna.fg1;
import xsna.in0;
import xsna.nz;
import xsna.oz;
import xsna.p60;
import xsna.pz;
import xsna.qz;
import xsna.z24;

/* compiled from: AnimSearchQueryVh.kt */
/* loaded from: classes16.dex */
public final class AnimSearchQueryVh implements CatalogViewHolder {
    public final a34 b;
    public final in0 c;
    public final z24 d;
    public final m e;
    public io.reactivex.rxjava3.disposables.c f;
    public AnimStartSearchView g;

    public AnimSearchQueryVh(a34 a34Var, in0 in0Var, z24 z24Var, m mVar) {
        this.b = a34Var;
        this.c = in0Var;
        this.d = z24Var;
        this.e = mVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
    }

    public final io.reactivex.rxjava3.disposables.c a(AnimStartSearchView animStartSearchView) {
        j1 U = bwt0.f(animStartSearchView.b).U(new nz(new p60(2), 2));
        oz ozVar = new oz(new e5(animStartSearchView, 3), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(ozVar, lVar, kVar, kVar).y(500L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qz(new pz(this, 3), 2), new bf2(new af2(0), 0));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_anim_search_view, viewGroup, false);
        AnimStartSearchView animStartSearchView = null;
        AnimStartSearchView animStartSearchView2 = inflate instanceof AnimStartSearchView ? (AnimStartSearchView) inflate : null;
        if (animStartSearchView2 != null) {
            animStartSearchView2.setBackButtonAction(new r(this, 5));
            this.f = a(animStartSearchView2);
            animStartSearchView2.setVoiceButtonAction(this.d);
            animStartSearchView2.setSearchClickedAction(this.b);
            animStartSearchView2.setCancelButtonAction(new fg1(1, animStartSearchView2, this));
            animStartSearchView2.setFilterButtonAction(null);
            animStartSearchView2.setEnterButtonAction(null);
            animStartSearchView = animStartSearchView2;
        }
        this.g = animStartSearchView;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
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
