package com.vk.catalog2.common.ui.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.view.CatalogErrorView;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.b00;
import xsna.gzs;
import xsna.j03;
import xsna.qqe;
import xsna.s3q0;

/* compiled from: ErrorStateVh.kt */
/* loaded from: classes16.dex */
public class ErrorStateVh implements CatalogViewHolder {
    public final CatalogStatesViewHolder b;
    public final gzs<s3q0> c;
    public CatalogErrorView d;
    public io.reactivex.rxjava3.disposables.c e;

    public ErrorStateVh(CatalogStatesViewHolder catalogStatesViewHolder, gzs<s3q0> gzsVar) {
        this.b = catalogStatesViewHolder;
        this.c = gzsVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        try {
            io.reactivex.rxjava3.disposables.c cVar = this.e;
            if (cVar != null) {
                cVar.dispose();
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        com.vk.core.utils.newtork.b.a.getClass();
        this.e = com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new b00(new qqe(this, 16), 25));
    }

    public void b(Throwable th) {
        CatalogErrorView catalogErrorView = this.d;
        if (catalogErrorView == null) {
            catalogErrorView = null;
        }
        catalogErrorView.setVisibility(0);
        CatalogErrorView catalogErrorView2 = this.d;
        (catalogErrorView2 != null ? catalogErrorView2 : null).a(j03.g((catalogErrorView2 != null ? catalogErrorView2 : null).getContext(), th, R.string.error), true);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a();
        View inflate = layoutInflater.inflate(R.layout.catalog_error_layout, viewGroup, false);
        inflate.getContext();
        CatalogErrorView catalogErrorView = (CatalogErrorView) inflate.findViewById(R.id.error_view);
        catalogErrorView.setOnRetryClickListener(this.c);
        this.d = catalogErrorView;
        return inflate;
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
    public void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
