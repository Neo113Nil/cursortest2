package com.vk.stickers.views.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.movika.sdk.base.observable.m;
import com.vk.movika.sdk.base.observable.o;
import com.vk.rlottie.RLottieDrawable;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import xsna.bwt0;
import xsna.dhr0;
import xsna.epx;
import xsna.gv;
import xsna.gzs;
import xsna.hv;
import xsna.icl0;
import xsna.s3q0;
import xsna.tj2;
import xsna.uj2;
import xsna.xse0;
import xsna.y8l0;
import xsna.zk2;

/* compiled from: AnimatedGiftView.kt */
/* loaded from: classes6.dex */
public final class AnimatedGiftView extends ViewGroup {
    public static final /* synthetic */ int g = 0;
    public final xse0 b;
    public final b c;
    public zk2 d;
    public boolean e;
    public boolean f;

    public AnimatedGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        xse0 xse0Var = new xse0(context);
        this.b = xse0Var;
        this.c = new b();
        zk2.d7.getClass();
        this.d = zk2.a.b;
        addView(xse0Var.getView());
        xse0Var.setInvisible(true);
        xse0Var.setRepeatCount(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(AnimatedGiftView animatedGiftView, zk2 zk2Var, boolean z, gzs gzsVar, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            gzsVar = new tj2(0);
        }
        animatedGiftView.a(zk2Var, z, gzsVar);
    }

    public final void a(zk2 zk2Var, boolean z, gzs<s3q0> gzsVar) {
        if (zk2Var.equals(this.d)) {
            gzsVar.invoke();
            c();
            return;
        }
        zk2 zk2Var2 = this.d;
        zk2.d7.getClass();
        if (!epx.f(zk2Var2, zk2.a.b)) {
            this.b.setVisible(false);
        }
        this.d = zk2Var;
        this.e = z;
        boolean M = dhr0.M();
        uj2 uj2Var = new uj2(gzsVar, this);
        xse0 xse0Var = this.b;
        xse0Var.b = z;
        xse0Var.setAnimatedItem(zk2Var);
        xse0Var.f = uj2Var;
        xse0Var.h = Boolean.valueOf(M);
        if (xse0Var.g) {
            xse0Var.l0(Boolean.valueOf(M));
        }
        c();
    }

    public final void c() {
        boolean V0 = this.d.V0();
        xse0 xse0Var = this.b;
        if (V0 && xse0Var.getDrawable() != null && (xse0Var.getDrawable() instanceof RLottieDrawable)) {
            xse0Var.s0();
            xse0Var.getClass();
            if (bwt0.K(xse0Var)) {
                return;
            }
            xse0Var.setVisible(true);
            return;
        }
        xse0Var.getClass();
        if (bwt0.K(xse0Var)) {
            xse0Var.p0();
            xse0Var.setInvisible(true);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (bwt0.K(this) || this.f) {
            b(this, this.d, this.e, null, 4);
            this.b.m0();
            f<icl0> fVar = y8l0.a.a;
            gv gvVar = new gv(new m(this, 5), 1);
            fVar.getClass();
            this.c.b(new i0(fVar, gvVar).a0(a.b()).subscribe(new hv(new o(this, 4), 2)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.o0();
        this.c.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.getView().layout(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (mode != Integer.MIN_VALUE && (mode == 0 || mode != 1073741824)) {
            size = Integer.MAX_VALUE;
        }
        if (mode2 != Integer.MIN_VALUE && (mode2 == 0 || mode2 != 1073741824)) {
            size2 = Integer.MAX_VALUE;
        }
        int max = Math.max(0, Math.min(size, size2));
        int max2 = Math.max(0, Math.min(size - paddingRight, size2 - paddingBottom));
        this.b.getView().measure(View.MeasureSpec.makeMeasureSpec(max2, 1073741824), View.MeasureSpec.makeMeasureSpec(max2, 1073741824));
        setMeasuredDimension(max, max);
    }

    public final void setGiftPreview(boolean z) {
        this.f = z;
    }
}
