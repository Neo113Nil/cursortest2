package com.vk.translate.impl.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.s0w0;
import xsna.xus;

/* compiled from: TranslateFailedView.kt */
/* loaded from: classes6.dex */
public final class TranslateFailedView extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public a b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;

    /* compiled from: TranslateFailedView.kt */
    public interface a {
    }

    public TranslateFailedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setImageResource(R.drawable.vk_icon_illustration_confused_man_188h);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        appCompatTextView.setLayoutParams(layoutParams2);
        f4m.u(appCompatTextView, cn70.b(32), cn70.b(24), cn70.b(32), 0);
        abg0 abg0Var = dhr0.t;
        appCompatTextView.setTextColor(abg0Var.c(R.attr.vk_legacy_text_primary));
        appCompatTextView.setTextSize(20.0f);
        this.c = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        appCompatTextView2.setLayoutParams(layoutParams3);
        f4m.u(appCompatTextView2, cn70.b(32), cn70.b(8), cn70.b(32), cn70.b(16));
        appCompatTextView2.setTextColor(abg0Var.c(R.attr.vk_legacy_text_secondary));
        appCompatTextView2.setTextSize(16.0f);
        appCompatTextView2.setGravity(1);
        this.d = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        appCompatTextView3.setLayoutParams(layoutParams4);
        f4m.u(appCompatTextView3, 0, cn70.b(8), 0, cn70.b(16));
        appCompatTextView3.setPadding(cn70.b(16), cn70.b(8), cn70.b(16), cn70.b(8));
        appCompatTextView3.setOutlineProvider(new s0w0(cn70.b(12), 6));
        appCompatTextView3.setClipToOutline(true);
        appCompatTextView3.setBackgroundDrawable(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e3m.f(R.attr.vk_legacy_accent, context), 0, 254));
        appCompatTextView3.setClickable(true);
        appCompatTextView3.setTextColor(-1);
        com.vk.typography.b.k(appCompatTextView3, FontFamily.MEDIUM, Float.valueOf(15.0f), 4);
        this.e = appCompatTextView3;
        setOrientation(1);
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatTextView3);
    }

    public final a getListener() {
        return this.b;
    }

    public final void setListener(a aVar) {
        this.b = aVar;
    }
}
