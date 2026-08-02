package com.vk.voip.ui.calls.presentation.base.view.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.f4m;
import xsna.gzs;
import xsna.m33;
import xsna.og;
import xsna.oyt;
import xsna.qcy;
import xsna.s3q0;

/* compiled from: VoipBanner.kt */
/* loaded from: classes7.dex */
public final class VoipBanner extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final VkButton b;
    public final AppCompatImageView c;

    public VoipBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setCloseClickListener(gzs<s3q0> gzsVar) {
        this.c.setOnClickListener(new og(gzsVar, 11));
    }

    public final void setImportClickListener(gzs<s3q0> gzsVar) {
        this.b.setOnClickListener(new oyt(gzsVar, 12));
    }

    public VoipBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.voip_calls_banner, (ViewGroup) this, true);
        ((AppCompatTextView) findViewById(R.id.middle_description)).setAlpha(0.72f);
        this.b = (VkButton) findViewById(R.id.bottom_button);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.close);
        this.c = appCompatImageView;
        appCompatImageView.setBackground(e3m.e(R.attr.selectableItemBackgroundBorderless, context));
        setBackground(m33.a(R.drawable.voip_banner_bg, context));
        qcy<Object>[] qcyVarArr = bwt0.a;
        int dimension = (int) getResources().getDimension(R.dimen.vk_ui_spacing_size_xl);
        f4m.l(dimension, dimension, this);
        int dimension2 = (int) getResources().getDimension(R.dimen.vk_ui_spacing_size_xl);
        f4m.B(dimension2, dimension2, this);
    }
}
