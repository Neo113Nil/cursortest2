package com.vk.translate.impl.views;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.f4m;
import xsna.jjc;
import xsna.lyl0;
import xsna.ryj0;

/* compiled from: TranslatedTextViewGroup.kt */
/* loaded from: classes6.dex */
public final class c extends LinearLayout {
    public a b;
    public final AppCompatTextView c;
    public final AppCompatImageView d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final ryj0 g;
    public final ShimmerFrameLayout h;

    /* compiled from: TranslatedTextViewGroup.kt */
    public interface a {
    }

    public c(Context context) {
        super(context, null, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        appCompatTextView.setLayoutParams(layoutParams);
        f4m.u(appCompatTextView, cn70.b(20), cn70.b(16), cn70.b(20), cn70.b(12));
        abg0 abg0Var = dhr0.t;
        appCompatTextView.setTextColor(abg0Var.c(R.attr.vk_legacy_text_primary));
        com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, Float.valueOf(16.0f), 4);
        this.c = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(cn70.b(24), cn70.b(24));
        layoutParams2.gravity = 8388629;
        appCompatImageView.setLayoutParams(layoutParams2);
        f4m.u(appCompatImageView, 0, cn70.b(16), cn70.b(20), cn70.b(12));
        appCompatImageView.setImageResource(R.drawable.vk_icon_play_circle_24);
        appCompatImageView.setColorFilter(abg0Var.c(R.attr.vk_legacy_accent));
        appCompatImageView.setContentDescription(context.getString(R.string.vkim_translate_speech_start_text_button_talk_back));
        appCompatImageView.setClickable(true);
        jjc.g(appCompatImageView, new lyl0(this, 6));
        this.d = appCompatImageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.addView(appCompatTextView);
        frameLayout.addView(appCompatImageView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setTextColor(abg0Var.c(R.attr.vk_legacy_text_primary));
        FontFamily fontFamily = FontFamily.REGULAR;
        Float valueOf = Float.valueOf(15.0f);
        com.vk.typography.b.k(appCompatTextView2, fontFamily, valueOf, 4);
        this.e = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView3.setTextColor(abg0Var.c(R.attr.vk_legacy_text_tertiary));
        com.vk.typography.b.k(appCompatTextView3, fontFamily, valueOf, 4);
        this.f = appCompatTextView3;
        ryj0 ryj0Var = new ryj0(context, null, 0);
        ryj0Var.setOrientation(1);
        ryj0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ryj0Var.setLinesCount(2);
        this.g = ryj0Var;
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(context, null, 6);
        shimmerFrameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        shimmerFrameLayout.a();
        f4m.u(shimmerFrameLayout, cn70.b(20), cn70.b(6), cn70.b(20), cn70.b(24));
        shimmerFrameLayout.addView(appCompatTextView2);
        shimmerFrameLayout.addView(appCompatTextView3);
        shimmerFrameLayout.addView(ryj0Var);
        this.h = shimmerFrameLayout;
        setOrientation(1);
        addView(frameLayout);
        addView(shimmerFrameLayout);
    }

    public final a getListener() {
        return this.b;
    }

    public final void setAudioPlayState(boolean z) {
        AppCompatImageView appCompatImageView = this.d;
        if (z) {
            appCompatImageView.setImageResource(R.drawable.vk_icon_pause_24);
            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(R.string.vkim_translate_speech_stop_text_button_talk_back));
        } else {
            appCompatImageView.setImageResource(R.drawable.vk_icon_play_circle_24);
            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(R.string.vkim_translate_speech_start_text_button_talk_back));
        }
    }

    public final void setListener(a aVar) {
        this.b = aVar;
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setTranslatedText(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.e;
        appCompatTextView.setText(charSequence);
        bwt0.p0(appCompatTextView, true);
        bwt0.p0(this.f, false);
        this.h.a();
        bwt0.p0(this.g, false);
        setClickable(true);
        AppCompatImageView appCompatImageView = this.d;
        bwt0.p0(appCompatImageView, true);
        appCompatImageView.setImageResource(R.drawable.vk_icon_play_circle_24);
    }
}
