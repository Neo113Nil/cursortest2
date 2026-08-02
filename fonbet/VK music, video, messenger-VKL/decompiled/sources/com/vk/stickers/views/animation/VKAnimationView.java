package com.vk.stickers.views.animation;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.metrics.eventtracking.b;
import xsna.a780;
import xsna.c7r0;
import xsna.ca10;
import xsna.d7r0;
import xsna.glo0;
import xsna.j990;

/* compiled from: VKAnimationView.kt */
/* loaded from: classes6.dex */
public final class VKAnimationView extends LottieAnimationView {
    public static final /* synthetic */ int w = 0;
    public a780 p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public IndexOutOfBoundsException u;
    public int v;

    public VKAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.v = -1;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void m0() {
        this.r = true;
        super.m0();
    }

    @Override // com.airbnb.lottie.LottieAnimationView, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        if (this.t) {
            if (this.s) {
                p0();
                this.s = false;
            }
            super.onAttachedToWindow();
            return;
        }
        super.onAttachedToWindow();
        if (this.s) {
            m0();
            this.s = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (this.f.m()) {
            this.s = true;
        }
        if (this.t) {
            l0();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.u != null) {
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            this.u = new IndexOutOfBoundsException("Can't play lottie animation" + this.v);
            b.a.a(this.u);
        }
    }

    public final void setOnLoadAnimationCallback(a780 a780Var) {
        this.p = a780Var;
    }

    public final void setResumeOnAttached(boolean z) {
        this.t = z;
    }

    public final void v0(int i, String str, boolean z) {
        if (!str.equals(this.q)) {
            if (this.q != null && !z) {
                l0();
            }
            this.r = false;
            this.v = i;
            c7r0.g(str, i != -1 ? String.valueOf(i) : null, false).subscribe(new ca10(new glo0(this, z, 1), 29), new j990(new d7r0(i, this, z), 13));
            this.q = str;
            return;
        }
        if (!z || this.f.m()) {
            if (!z) {
                l0();
            }
        } else if (this.r) {
            p0();
        } else {
            m0();
        }
        a780 a780Var = this.p;
        if (a780Var != null) {
            a780Var.onSuccess();
        }
    }
}
