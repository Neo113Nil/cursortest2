package com.vk.attachpicker.stickers.post.attach;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.newtork.b;
import com.vk.imageloader.view.VKImageView;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.c2;
import xsna.asu0;
import xsna.fsq;
import xsna.gxj0;
import xsna.gzs;
import xsna.hg1;
import xsna.jeq0;
import xsna.ktr;
import xsna.lw30;
import xsna.mau;
import xsna.mcr0;
import xsna.nh40;
import xsna.ptl0;
import xsna.rt10;
import xsna.s3q0;
import xsna.sxl0;
import xsna.u2k0;
import xsna.ut30;
import xsna.xvc0;

/* compiled from: StoryAttachImageView.kt */
/* loaded from: classes15.dex */
public final class StoryAttachImageView extends VKImageView {
    public static final /* synthetic */ int t = 0;
    public c m;
    public boolean n;
    public String o;
    public gzs<s3q0> p;
    public float q;
    public final RectF r;
    public final Path s;

    public StoryAttachImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void T0(String str) {
        this.o = str;
        if (str == null) {
            W();
        } else {
            this.n = true;
            this.m = ktr.c(new c2(mcr0.h(jeq0.g(str)).r0(asu0.a.c()), new nh40(new gxj0(2), 17)).U(new mau(new ut30(this, 22), 14))).subscribe(new fsq(new ptl0(this, 1), 29), new lw30(new u2k0(this, 5), 14));
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.s);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.s);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final float getImageCornerRadius() {
        return this.q;
    }

    public final gzs<s3q0> getOnBindCompleted() {
        return this.p;
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.a.getClass();
        hg1.b(this, b.f().subscribe(new rt10(new sxl0(this, 0), 16)));
        if (this.n) {
            T0(this.o);
        }
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m.dispose();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.r;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        Path path = this.s;
        path.reset();
        float f = this.q;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public final void setImageCornerRadius(float f) {
        this.q = f;
        invalidate();
    }

    public final void setOnBindCompleted(gzs<s3q0> gzsVar) {
        this.p = gzsVar;
    }

    public StoryAttachImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.m = EmptyDisposable.INSTANCE;
        this.p = new xvc0(3);
        this.r = new RectF();
        this.s = new Path();
    }
}
