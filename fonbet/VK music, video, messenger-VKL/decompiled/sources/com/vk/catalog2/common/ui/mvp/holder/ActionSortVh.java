package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog.design.view.CatalogActionSortView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.d50;
import xsna.eda;
import xsna.i4a;

/* compiled from: ActionSortVh.kt */
/* loaded from: classes16.dex */
public final class ActionSortVh implements CatalogViewHolder, View.OnClickListener {
    public final eda b;
    public final b5a c;
    public c d;
    public UIBlockActionShowFilters e;
    public final ArrayList f = new ArrayList();
    public CatalogActionSortView g;

    public ActionSortVh(eda edaVar, b5a b5aVar) {
        this.b = edaVar;
        this.c = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionShowFilters uIBlockActionShowFilters = uIBlock instanceof UIBlockActionShowFilters ? (UIBlockActionShowFilters) uIBlock : null;
        if (uIBlockActionShowFilters == null) {
            return;
        }
        this.e = uIBlockActionShowFilters;
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(uIBlockActionShowFilters.A);
        a();
    }

    public final void a() {
        Object obj;
        if (this.e == null) {
            return;
        }
        CatalogActionSortView catalogActionSortView = this.g;
        if (catalogActionSortView == null) {
            catalogActionSortView = null;
        }
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((CatalogFilterData) obj).e) {
                    break;
                }
            }
        }
        CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
        catalogActionSortView.setLabel(catalogFilterData != null ? catalogFilterData.c : null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_action_list_item_sort, viewGroup, false);
        CatalogActionSortView catalogActionSortView = (CatalogActionSortView) inflate;
        this.g = catalogActionSortView;
        catalogActionSortView.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        UIBlockActionShowFilters uIBlockActionShowFilters = this.e;
        if (uIBlockActionShowFilters != null) {
            this.c.a(new cfp0(uIBlockActionShowFilters, null));
        }
        i4a.b(context, this.f, null, new d50(0, this, context));
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
