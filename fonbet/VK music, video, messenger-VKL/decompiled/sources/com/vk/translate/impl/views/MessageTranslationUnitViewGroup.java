package com.vk.translate.impl.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.f4m;
import xsna.fz80;
import xsna.gzs;
import xsna.h2s;
import xsna.jjc;
import xsna.s0w0;
import xsna.s3q0;
import xsna.xb20;
import xsna.xus;

/* compiled from: MessageTranslationUnitViewGroup.kt */
/* loaded from: classes6.dex */
public final class MessageTranslationUnitViewGroup extends LinearLayout {
    public a b;
    public final fz80 c;
    public final c d;

    /* compiled from: MessageTranslationUnitViewGroup.kt */
    public interface a {
        void a();

        void b();
    }

    public MessageTranslationUnitViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        fz80 fz80Var = new fz80(context);
        fz80Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f4m.u(fz80Var, cn70.b(20), cn70.b(24), cn70.b(20), 0);
        this.c = fz80Var;
        c cVar = new c(context);
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        abg0 abg0Var = dhr0.t;
        cVar.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, abg0Var.c(R.attr.vk_legacy_content_tint_background), 0, 254));
        cVar.setClickable(true);
        cVar.setListener(new xb20(this, 0));
        jjc.g(cVar, new h2s(this, 14));
        this.d = cVar;
        setOrientation(1);
        addView(fz80Var);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, cn70.b(1)));
        view.setBackgroundColor(abg0Var.c(R.attr.vk_legacy_separator_common));
        bwt0.f0(view, 0, cn70.b(12), 0, 0, 13);
        addView(view);
        addView(cVar);
        setBackgroundColor(abg0Var.c(R.attr.vk_legacy_content_tint_background));
        setOutlineProvider(new s0w0(cn70.b(12), 6));
        setClipToOutline(true);
    }

    public final a getListener() {
        return this.b;
    }

    public final void setListener(a aVar) {
        this.b = aVar;
    }

    public final void setMaxLinesForCollapsedOriginalText(int i) {
        this.c.setMaxLinesForCollapsedText(i);
    }

    public final void setOnExpandListener(gzs<s3q0> gzsVar) {
        this.c.setExpandListener(gzsVar);
    }

    public final void setOriginalExpandText(CharSequence charSequence) {
        this.c.setExpandText(charSequence);
    }

    public final void setOriginalSubtitle(CharSequence charSequence) {
        this.c.setSubtitle(charSequence);
    }

    public final void setOriginalText(CharSequence charSequence) {
        this.c.setOriginalText(charSequence);
    }

    public final void setOriginalTitle(CharSequence charSequence) {
        this.c.setTitle(charSequence);
    }

    public final void setTranslatedAudioPlayingState(boolean z) {
        this.d.setAudioPlayState(z);
    }

    public final void setTranslatedText(CharSequence charSequence) {
        this.d.setTranslatedText(charSequence);
    }

    public final void setTranslatedTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }
}
