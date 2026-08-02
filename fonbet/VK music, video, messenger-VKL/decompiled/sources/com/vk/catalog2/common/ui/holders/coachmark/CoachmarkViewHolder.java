package com.vk.catalog2.common.ui.holders.coachmark;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.music.stats.CoachMarkAction;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.ey2;
import xsna.la9;
import xsna.n680;

/* compiled from: CoachmarkViewHolder.kt */
/* loaded from: classes16.dex */
public final class CoachmarkViewHolder implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final la9 c;
    public TextView d;
    public TextView e;
    public View f;
    public UIBlockHint g;

    public CoachmarkViewHolder(b5a b5aVar, la9 la9Var) {
        this.b = b5aVar;
        this.c = la9Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockHint) {
            TextView textView = this.e;
            if (textView == null) {
                textView = null;
            }
            UIBlockHint uIBlockHint = (UIBlockHint) uIBlock;
            ey2.i(textView, uIBlockHint.A);
            TextView textView2 = this.d;
            ey2.i(textView2 != null ? textView2 : null, uIBlockHint.z);
            this.g = uIBlockHint;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_coachmark_view, viewGroup, false);
        this.d = (TextView) inflate.findViewById(R.id.catalog_placeholder_view_title);
        this.e = (TextView) inflate.findViewById(R.id.catalog_placeholder_view_description);
        ((ImageView) inflate.findViewById(R.id.dismiss_button)).setOnClickListener(this);
        inflate.setOnClickListener(this);
        this.f = inflate;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockHint uIBlockHint = this.g;
        if (uIBlockHint == null || view == null) {
            return;
        }
        int id = view.getId();
        b5a b5aVar = this.b;
        if (id == R.id.dismiss_button) {
            b5aVar.a(new n680(uIBlockHint, CoachMarkAction.CLICK_CROSS));
        } else {
            b5aVar.a(new n680(uIBlockHint, CoachMarkAction.CLICK_CONTAINER_AREA));
        }
        this.c.invoke();
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
