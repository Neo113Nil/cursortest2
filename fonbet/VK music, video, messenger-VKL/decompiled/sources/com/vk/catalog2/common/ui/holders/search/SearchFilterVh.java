package com.vk.catalog2.common.ui.holders.search;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchFilter;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchFilterAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.epx;
import xsna.ho8;
import xsna.l3a;
import xsna.m3a;

/* compiled from: SearchFilterVh.kt */
/* loaded from: classes16.dex */
public final class SearchFilterVh implements CatalogViewHolder, View.OnClickListener {
    public final m3a b;
    public final b5a c;
    public TextView d;
    public View e;
    public UIBlockSearchFilter f;

    /* compiled from: SearchFilterVh.kt */
    public static abstract class a implements l3a {

        /* compiled from: SearchFilterVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.holders.search.SearchFilterVh$a$a, reason: collision with other inner class name */
        public static final class C0488a extends a {
            public final String a;

            public C0488a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0488a) && epx.f(this.a, ((C0488a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("RemoveFilter(filterParameter="), this.a, ')');
            }
        }
    }

    public SearchFilterVh(m3a m3aVar, b5a b5aVar) {
        this.b = m3aVar;
        this.c = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockSearchFilter uIBlockSearchFilter = uIBlock instanceof UIBlockSearchFilter ? (UIBlockSearchFilter) uIBlock : null;
        if (uIBlockSearchFilter == null) {
            return;
        }
        TextView textView = this.d;
        (textView != null ? textView : null).setText(uIBlockSearchFilter.z);
        this.f = uIBlockSearchFilter;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_search_category_chips, viewGroup, false);
        this.d = (TextView) inflate.findViewById(R.id.tvCategoryChipTitle);
        View findViewById = inflate.findViewById(R.id.ivCategoryChipClose);
        this.e = findViewById;
        findViewById.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockSearchFilter uIBlockSearchFilter = this.f;
        if (uIBlockSearchFilter != null) {
            this.b.j(new a.C0488a(uIBlockSearchFilter.A));
            this.c.a(new cfp0(uIBlockSearchFilter, new SearchFilterAnalyticsInfo(SearchFilterAnalyticsInfo.ClickTarget.Tap)));
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
