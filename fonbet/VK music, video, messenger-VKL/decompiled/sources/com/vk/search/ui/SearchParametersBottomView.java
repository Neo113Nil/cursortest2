package com.vk.search.ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import xsna.e3m;

/* compiled from: SearchParametersBottomView.kt */
/* loaded from: classes5.dex */
public final class SearchParametersBottomView extends LinearLayout {
    public final int b;
    public final TextView c;
    public final View d;

    public SearchParametersBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.b = e3m.d(R.attr.actionBarSize, context);
        LayoutInflater.from(context).inflate(com.vkontakte.android.R.layout.catalog_video_search_parameters_view, (ViewGroup) this, true);
        this.c = (TextView) findViewById(com.vkontakte.android.R.id.subtitle);
        this.d = findViewById(com.vkontakte.android.R.id.close);
    }

    public final int getPanelHeight() {
        return this.b;
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public final void setParameters(String str) {
        this.c.setText(str);
    }
}
