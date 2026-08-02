package com.vk.rlottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.vk.metrics.eventtracking.b;
import com.vk.rlottie.RLottieDrawable;
import com.vk.rlottie.RLottieView;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.concurrent.Callable;
import xsna.asu0;
import xsna.cte0;
import xsna.cx00;
import xsna.ox80;
import xsna.ppa;
import xsna.quz;

/* compiled from: RLottieView.kt */
/* loaded from: classes5.dex */
public final class RLottieView extends View {
    public static final /* synthetic */ int i = 0;
    public c b;
    public int c;
    public final int d;
    public int e;
    public String f;
    public RLottieDrawable g;
    public boolean h;

    public RLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            this.d = obtainStyledAttributes.getResourceId(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final x<RLottieDrawable> getLoadDrawableSingle() {
        final String str = this.f;
        return (this.e != this.d || str == null) ? new v(new ppa(this, 1)) : new v(new Callable() { // from class: xsna.bte0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = RLottieView.i;
                StringBuilder sb = new StringBuilder("res-");
                RLottieView rLottieView = RLottieView.this;
                sb.append(rLottieView.d);
                sb.append('-');
                sb.append(SystemClock.elapsedRealtimeNanos());
                return new RLottieDrawable(str, sb.toString(), rLottieView.getWidth(), rLottieView.getHeight(), null, false, false, null, 496);
            }
        });
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RLottieDrawable rLottieDrawable = this.g;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.h) {
                return;
            }
            rLottieDrawable.j();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RLottieDrawable rLottieDrawable = this.g;
        if (rLottieDrawable != null) {
            rLottieDrawable.i();
        }
        this.b = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RLottieDrawable rLottieDrawable = this.g;
        if (rLottieDrawable != null) {
            rLottieDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        c cVar;
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 || i3 == i5 || this.d == 0) {
            return;
        }
        if (getHeight() * getWidth() == 0) {
            return;
        }
        c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        try {
            x<RLottieDrawable> loadDrawableSingle = getLoadDrawableSingle();
            asu0 asu0Var = asu0.a;
            cVar = loadDrawableSingle.q(asu0Var.c()).m(asu0Var.d()).subscribe(new ox80(new cte0(this, i2, i3), 8), new cx00(new quz(19), 19));
        } catch (Exception e) {
            b.a.a(e);
            cVar = null;
        }
        this.b = cVar;
    }

    public final void setFrame(int i2) {
        this.c = i2;
        if (i2 == -1) {
            RLottieDrawable rLottieDrawable = this.g;
            i2 = (rLottieDrawable != null ? rLottieDrawable.k.b[1] : 1) - 1;
        }
        RLottieDrawable rLottieDrawable2 = this.g;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.n(i2);
        }
    }

    public final void setStatic(boolean z) {
        this.h = z;
        if (z) {
            RLottieDrawable rLottieDrawable = this.g;
            if (rLottieDrawable != null) {
                rLottieDrawable.i();
                return;
            }
            return;
        }
        RLottieDrawable rLottieDrawable2 = this.g;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.j();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.g || super.verifyDrawable(drawable);
    }
}
