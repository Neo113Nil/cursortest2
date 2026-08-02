package com.vk.stickers.views.sticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.stickers.StickerItem;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stickers.R$styleable;
import defpackage.x;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b04;
import xsna.bl2;
import xsna.bwt0;
import xsna.cn70;
import xsna.d9j;
import xsna.dhr0;
import xsna.dlo;
import xsna.do3;
import xsna.e3m;
import xsna.en2;
import xsna.epx;
import xsna.f4m;
import xsna.gzs;
import xsna.icl0;
import xsna.idw;
import xsna.ifg;
import xsna.izs;
import xsna.jdw;
import xsna.kdw;
import xsna.n1l0;
import xsna.s3q0;
import xsna.tv4;
import xsna.u01;
import xsna.wr0;
import xsna.xse0;
import xsna.y8l0;
import xsna.zk2;

/* compiled from: ImStickerView.kt */
/* loaded from: classes6.dex */
public final class ImStickerView extends ViewGroup {
    public static final /* synthetic */ int p = 0;
    public final jdw b;
    public final idw c;
    public final xse0 d;
    public final b e;
    public final io.reactivex.rxjava3.disposables.b f;
    public n1l0 g;
    public boolean h;
    public StickerAnimationState i;
    public Drawable j;
    public int k;
    public ColorFilter l;
    public Boolean m;
    public boolean n;
    public izs<? super n1l0, s3q0> o;

    /* compiled from: ImStickerView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ImStickerView imStickerView = (ImStickerView) this.receiver;
            int i = ImStickerView.p;
            imStickerView.e();
            return s3q0.a;
        }
    }

    public ImStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(ImStickerView imStickerView, n1l0 n1l0Var, izs izsVar, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            izsVar = new wr0(25);
        }
        imStickerView.a(n1l0Var, z, izsVar);
    }

    public static View c(View view) {
        if (e3m.h(view.getContext()) != null) {
            return view;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        return view2 != null ? c(view2) : view;
    }

    public final void a(n1l0 n1l0Var, boolean z, izs<? super n1l0, s3q0> izsVar) {
        if (n1l0Var.equals(this.g)) {
            e();
            return;
        }
        if (!epx.f(this.g, StickerItem.l)) {
            bwt0.p0(this.b, false);
            this.d.setVisible(false);
            bwt0.p0(this.c, false);
        }
        removeCallbacks(new b04(this.e, 7));
        this.g = n1l0Var;
        this.n = z;
        this.o = izsVar;
        d(false);
        e();
    }

    public final void d(boolean z) {
        Boolean bool = this.m;
        boolean booleanValue = bool != null ? bool.booleanValue() : dhr0.M();
        n1l0 n1l0Var = this.g;
        jdw jdwVar = this.b;
        if (!epx.f(jdwVar.k, n1l0Var) || z) {
            jdwVar.k = n1l0Var;
            jdwVar.j = Boolean.valueOf(booleanValue);
            if (jdwVar.l) {
                jdwVar.d(Boolean.valueOf(booleanValue));
            }
        }
        if (this.h) {
            n1l0 n1l0Var2 = this.g;
            StickerItem stickerItem = n1l0Var2 instanceof StickerItem ? (StickerItem) n1l0Var2 : null;
            if (stickerItem == null) {
                stickerItem = StickerItem.l;
            }
            boolean z2 = this.n;
            a aVar = new a();
            xse0 xse0Var = this.d;
            xse0Var.b = z2;
            xse0Var.setAnimatedItem(stickerItem);
            xse0Var.f = aVar;
            xse0Var.h = Boolean.valueOf(booleanValue);
            if (xse0Var.g) {
                xse0Var.l0(Boolean.valueOf(booleanValue));
            }
        }
    }

    public final void e() {
        StickerAnimationState stickerAnimationState;
        jdw jdwVar = this.b;
        boolean f = epx.f(jdwVar.getSticker$sticker_release(), StickerItem.l);
        xse0 xse0Var = this.d;
        if (!f) {
            zk2 animatedItem = xse0Var.getAnimatedItem();
            zk2.d7.getClass();
            if (!epx.f(animatedItem, zk2.a.b)) {
                n1l0 sticker$sticker_release = jdwVar.getSticker$sticker_release();
                zk2 animatedItem2 = xse0Var.getAnimatedItem();
                if (sticker$sticker_release != (animatedItem2 instanceof StickerItem ? (StickerItem) animatedItem2 : null) && this.g.V0() && this.h) {
                    tv4.b("Different stickers for static and animation view!", com.vk.metrics.eventtracking.b.a);
                }
            }
        }
        boolean B = this.g.B();
        idw idwVar = this.c;
        if (B) {
            idwVar.setRestrictionState(this.g.O());
            xse0Var.p0();
            bwt0.p0(idwVar, true);
            bwt0.p0(jdwVar, false);
            xse0Var.setVisible(false);
            return;
        }
        if (!this.g.V0() || xse0Var.getDrawable() == null || !(xse0Var.getDrawable() instanceof RLottieDrawable) || (stickerAnimationState = this.i) == StickerAnimationState.DISABLE || !this.h) {
            if (bwt0.K(jdwVar)) {
                xse0Var.getClass();
                if (!bwt0.K(xse0Var)) {
                    return;
                }
            }
            xse0Var.p0();
            xse0Var.setInvisible(true);
            bwt0.p0(jdwVar, true);
            bwt0.d0(idwVar, true);
            return;
        }
        if (stickerAnimationState == StickerAnimationState.PLAY) {
            xse0Var.s0();
        } else {
            xse0Var.p0();
        }
        xse0Var.getClass();
        if (!bwt0.K(xse0Var) || bwt0.K(jdwVar)) {
            xse0Var.setVisible(true);
            bwt0.d0(jdwVar, true);
            bwt0.d0(idwVar, true);
        }
    }

    public final StickerAnimationState getAnimationState() {
        return this.i;
    }

    public final ColorFilter getColorFilter() {
        return this.l;
    }

    public final int getFadeDuration() {
        return this.k;
    }

    public final boolean getLimitFps() {
        return this.n;
    }

    public final Drawable getPlaceholder() {
        return this.j;
    }

    public final izs<n1l0, s3q0> getUpdateUrl() {
        return this.o;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.g, this.n, this.o);
        this.d.m0();
        f<icl0> fVar = y8l0.a.a;
        do3 do3Var = new do3(new d9j(this, 18), 20);
        fVar.getClass();
        this.f.b(new i0(fVar, do3Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new x(new ifg(this, 24), 29)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.o0();
        jdw jdwVar = this.b;
        jdwVar.getHierarchy().reset();
        dlo controller = jdwVar.getController();
        if (controller != null) {
            controller.c();
        }
        this.f.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.d.getView().layout(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.c.layout(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
        this.b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.d.getView().measure(makeMeasureSpec, makeMeasureSpec2);
        this.c.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(max, max);
    }

    public final void setAnimationAllowed(boolean z) {
        this.h = z;
        xse0 xse0Var = this.d;
        jdw jdwVar = this.b;
        if (z && this.g.V0()) {
            bwt0.p0(jdwVar, false);
            xse0Var.setVisible(true);
        } else {
            bwt0.p0(jdwVar, true);
            xse0Var.setVisible(false);
        }
        requestLayout();
        invalidate();
    }

    public final void setAnimationState(StickerAnimationState stickerAnimationState) {
        this.i = stickerAnimationState;
        e();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.l = colorFilter;
        this.b.setColorFilter(colorFilter);
        ColorFilter colorFilter2 = this.l;
        xse0 xse0Var = this.d;
        if (colorFilter2 != null) {
            xse0Var.W(colorFilter2);
        } else {
            xse0Var.b0();
        }
        e();
    }

    public final void setDarkTheme(Boolean bool) {
        this.m = bool;
        requestLayout();
        invalidate();
    }

    public final void setFadeDuration(int i) {
        this.k = i;
        this.b.setFadeDuration(i);
    }

    public final void setLimitFps(boolean z) {
        this.n = z;
    }

    public final void setPlaceholder(Drawable drawable) {
        this.j = drawable;
        this.b.setPlaceholder(drawable);
    }

    public final void setUpdateUrl(izs<? super n1l0, s3q0> izsVar) {
        this.o = izsVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImStickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        this.e = new b(0, this, ImStickerView.class, "showSuitableView", "showSuitableView()V", 0);
        this.f = new io.reactivex.rxjava3.disposables.b();
        this.g = StickerItem.l;
        this.h = true;
        this.i = StickerAnimationState.PLAY;
        this.o = new kdw(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        setPlaceholder(obtainStyledAttributes.getDrawable(3));
        setFadeDuration(obtainStyledAttributes.getInt(2, 300));
        obtainStyledAttributes.recycle();
        addView(jdwVar);
        idw idwVar = new idw(context);
        this.c = idwVar;
        xse0 xse0Var = new xse0(context);
        this.d = xse0Var;
        addView(xse0Var.getView());
        addView(idwVar);
        bwt0.r0(cn70.b(168), idwVar);
        bwt0.c0(cn70.b(168), idwVar);
        f4m.m(8388693, idwVar);
        f4m.q(cn70.b(2), idwVar);
        xse0Var.setInvisible(true);
        bwt0.p0(jdwVar, true);
        bwt0.p0(idwVar, false);
        xse0Var.setRepeatCount(-1);
        idwVar.setOnClickListener(new u01(this, 4));
    }

    /* compiled from: ImStickerView.kt */
    public static final class a implements en2 {
        public a() {
        }

        @Override // xsna.en2
        public final void a() {
            ImStickerView imStickerView = ImStickerView.this;
            imStickerView.b.setSticker$sticker_release(StickerItem.l);
            xse0 xse0Var = imStickerView.d;
            zk2.d7.getClass();
            xse0Var.setAnimatedItem(zk2.a.b);
            imStickerView.e();
        }

        @Override // xsna.en2
        public final void b(bl2 bl2Var) {
            int i = ImStickerView.p;
            ImStickerView.this.e();
        }

        @Override // xsna.en2
        public final void onCancel() {
        }
    }
}
