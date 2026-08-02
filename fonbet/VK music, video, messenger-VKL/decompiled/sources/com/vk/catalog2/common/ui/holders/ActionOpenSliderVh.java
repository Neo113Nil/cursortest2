package com.vk.catalog2.common.ui.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import org.chromium.base.version_info.VersionConstants;
import xsna.bwt0;
import xsna.c98;
import xsna.iah0;

/* compiled from: ActionOpenSliderVh.kt */
/* loaded from: classes16.dex */
public abstract class ActionOpenSliderVh implements CatalogViewHolder, View.OnClickListener {
    public final Integer b;
    public TextView c;
    public UIBlock d;

    public ActionOpenSliderVh(Integer num) {
        this.b = num;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.d = uIBlock;
        String a = a(uIBlock);
        if (a == null || a.length() == 0) {
            TextView textView = this.c;
            if (textView != null) {
                bwt0.p0(textView, false);
                return;
            }
            return;
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            bwt0.p0(textView2, true);
        }
        TextView textView3 = this.c;
        if (textView3 != null) {
            textView3.setText(a);
        }
    }

    public abstract String a(UIBlock uIBlock);

    public abstract void b(UIBlock uIBlock, Context context);

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.catalog_slider_action_open_show_all, viewGroup, false);
        frameLayout.findViewById(R.id.button).setOnClickListener(new c98(this, 1));
        this.c = (TextView) frameLayout.findViewById(R.id.button_text);
        int a = iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION);
        Integer num = this.b;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(a, num != null ? num.intValue() : -1));
        return frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlock uIBlock = this.d;
        if (uIBlock == null || view == null || (context = view.getContext()) == null) {
            return;
        }
        b(uIBlock, context);
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
