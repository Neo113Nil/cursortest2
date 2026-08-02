package com.vk.ecomm.catalog.impl.catalog.common;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.util.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.bwt0;
import xsna.e3m;
import xsna.ey2;
import xsna.f4m;
import xsna.iah0;

/* compiled from: MarketPlaceholderVh.kt */
/* loaded from: classes18.dex */
public final class MarketPlaceholderVh implements CatalogViewHolder, View.OnClickListener {
    public final a b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;
    public UIBlockPlaceholder h;
    public UIBlockAction i;

    public MarketPlaceholderVh(a aVar) {
        this.b = aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.f();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        a aVar;
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            this.i = null;
            Iterator<T> it = uIBlockPlaceholder.G.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                aVar = this.b;
                if (!hasNext) {
                    break;
                }
                UIBlockAction uIBlockAction = (UIBlockAction) it.next();
                if (this.i == null) {
                    aVar.getClass();
                    if (a.d(uIBlockAction)) {
                        this.i = uIBlockAction;
                    }
                }
            }
            TextView textView = this.f;
            if (textView == null) {
                textView = null;
            }
            bwt0.p0(textView, true);
            TextView textView2 = this.f;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(uIBlockPlaceholder.D);
            View view = this.g;
            if (view == null) {
                view = null;
            }
            view.setVisibility(0);
            TextView textView3 = this.d;
            if (textView3 == null) {
                textView3 = null;
            }
            ey2.i(textView3, uIBlockPlaceholder.A);
            TextView textView4 = this.e;
            if (textView4 == null) {
                textView4 = null;
            }
            aVar.a(textView4, this.i);
            View view2 = this.g;
            if (view2 == null) {
                view2 = null;
            }
            Context context = view2.getContext();
            LinearLayout linearLayout = this.c;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.measure(0, 0);
            int p = iah0.p(context) - e3m.a(R.dimen.catalog_big_banners_height, context);
            LinearLayout linearLayout2 = this.c;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            if (p >= linearLayout2.getPaddingTop() + linearLayout2.getPaddingBottom() + linearLayout2.getMeasuredHeight()) {
                View view3 = this.g;
                if (view3 == null) {
                    view3 = null;
                }
                f4m.n(p, view3);
            } else {
                View view4 = this.g;
                if (view4 == null) {
                    view4 = null;
                }
                view4.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            }
            View view5 = this.g;
            if (view5 == null) {
                view5 = null;
            }
            view5.requestLayout();
            this.h = uIBlockPlaceholder;
            View view6 = this.g;
            bwt0.Q(view6 != null ? view6 : null, R.id.catalog_ui_test_placeholder, uIBlock.b);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_classified_empty_album, viewGroup, false);
        this.c = (LinearLayout) inflate.findViewById(R.id.catalog_placeholder_layout_inner);
        this.d = (TextView) inflate.findViewById(R.id.catalog_placeholder_view_title);
        this.f = (TextView) inflate.findViewById(R.id.catalog_placeholder_view_description);
        this.e = (TextView) inflate.findViewById(R.id.primary_button);
        inflate.setVisibility(4);
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(this);
        this.g = inflate;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlockPlaceholder uIBlockPlaceholder = this.h;
        if (uIBlockPlaceholder == null || view == null || (context = view.getContext()) == null || view.getId() != R.id.primary_button) {
            return;
        }
        a.e(this.b, context, uIBlockPlaceholder, this.i, null, 56);
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
