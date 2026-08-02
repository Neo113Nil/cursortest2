package com.vk.feed.design.view.newsfeed.reaction;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.rlottie.RLottieDrawable;
import defpackage.s;
import defpackage.z;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.o1;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.a780;
import xsna.an10;
import xsna.asu0;
import xsna.bhh;
import xsna.bpn0;
import xsna.bw;
import xsna.c7r0;
import xsna.dhr0;
import xsna.do3;
import xsna.e40;
import xsna.enh;
import xsna.ez3;
import xsna.f40;
import xsna.il7;
import xsna.izs;
import xsna.jo3;
import xsna.l2k;
import xsna.nm1;
import xsna.o9;
import xsna.ozl;
import xsna.p41;
import xsna.s3q0;
import xsna.swe0;
import xsna.wd3;
import xsna.wn;
import xsna.yvq;

/* compiled from: FeedAnimatedView.kt */
/* loaded from: classes18.dex */
public final class FeedAnimatedView extends View {
    public static final /* synthetic */ int y = 0;
    public a780 b;
    public RLottieDrawable c;
    public RLottieDrawable d;
    public Drawable e;
    public izs<? super Canvas, s3q0> f;
    public int g;
    public int h;
    public int i;
    public String j;
    public final AtomicInteger k;
    public int l;
    public int m;
    public ColorFilter n;
    public boolean o;
    public final b p;
    public final b q;
    public boolean r;
    public final enh s;
    public RLottieDrawable.a t;
    public boolean u;
    public int v;
    public String w;
    public boolean x;

    public FeedAnimatedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static s3q0 a(FeedAnimatedView feedAnimatedView, boolean z, RLottieDrawable rLottieDrawable) {
        feedAnimatedView.r = true;
        feedAnimatedView.setPlaceholderVisible(true);
        RLottieDrawable rLottieDrawable2 = feedAnimatedView.c;
        if (rLottieDrawable2 != null) {
            ez3 ez3Var = rLottieDrawable2.k;
            rLottieDrawable2.i();
            ez3Var.t = null;
            rLottieDrawable2.setCallback(null);
            ez3Var.v = null;
        }
        feedAnimatedView.d = feedAnimatedView.c;
        rLottieDrawable.setBounds(0, 0, feedAnimatedView.g, feedAnimatedView.h);
        enh enhVar = feedAnimatedView.s;
        ez3 ez3Var2 = rLottieDrawable.k;
        ez3Var2.v = enhVar;
        ez3Var2.q = feedAnimatedView.l;
        ez3Var2.t = feedAnimatedView.t;
        ez3Var2.g = rLottieDrawable.g;
        rLottieDrawable.setAlpha(feedAnimatedView.m);
        rLottieDrawable.setColorFilter(feedAnimatedView.n);
        rLottieDrawable.setCallback(feedAnimatedView);
        feedAnimatedView.c = rLottieDrawable;
        a780 a780Var = feedAnimatedView.b;
        if (a780Var != null) {
            a780Var.onSuccess();
        }
        if (z) {
            feedAnimatedView.setAnimating(true);
        }
        feedAnimatedView.invalidate();
        return s3q0.a;
    }

    public static s3q0 b(FeedAnimatedView feedAnimatedView) {
        feedAnimatedView.setPlaceholderVisible(false);
        feedAnimatedView.i();
        return s3q0.a;
    }

    private final void setPlaceholderVisible(boolean z) {
        this.o = z;
        invalidate();
    }

    public final void c(String str) {
        b bVar = this.p;
        bVar.e();
        q h = c7r0.h(str);
        bVar.b(new o1(h, new jo3(new o9(22, this, h), 12)).subscribe(new p41(new wd3(13, str, this), 21), new wn(new l2k(this, 11), 27)));
    }

    public final void d(final int i, String str) {
        q a0;
        this.v = i;
        this.w = str;
        bpn0 bpn0Var = c7r0.a;
        final Resources resources = getResources();
        final String valueOf = String.valueOf(i);
        String str2 = (String) c7r0.c().get(valueOf);
        if (str2 != null) {
            a0 = q.T(str2);
        } else {
            s0 s0Var = new s0(new Callable() { // from class: xsna.a7r0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i), emb.b), 8192);
                    try {
                        String b = a0a.b(bufferedReader);
                        bufferedReader.close();
                        bpn0 bpn0Var2 = c7r0.a;
                        c7r0.c().put(valueOf, b);
                        return b;
                    } finally {
                    }
                }
            });
            asu0 asu0Var = asu0.a;
            a0 = s0Var.r0(asu0Var.c()).a0(asu0Var.d());
        }
        this.q.b(a0.subscribe(new bw(new s(13, this, str), 24)));
    }

    public final void e(String str, boolean z) {
        this.j = str;
        this.k.set(0);
        f(str, z);
    }

    public final void f(String str, boolean z) {
        b bVar = this.p;
        bVar.e();
        q h = c7r0.h(str);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        m1 a0 = h.a0(asu0.i()).U(new do3(new il7(4, str, this), 14)).a0(asu0Var.d());
        bVar.b(new o1(a0, new e40(new nm1(11, this, a0), 12)).subscribe(new z(new yvq(this, z), 23), new f40(new bhh(this, 15), 19)));
    }

    public final void g() {
        this.p.e();
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.i();
        }
        RLottieDrawable rLottieDrawable2 = this.c;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.k();
        }
        this.c = null;
        RLottieDrawable rLottieDrawable3 = this.d;
        if (rLottieDrawable3 != null) {
            rLottieDrawable3.i();
        }
        RLottieDrawable rLottieDrawable4 = this.d;
        if (rLottieDrawable4 != null) {
            rLottieDrawable4.k();
        }
        this.d = null;
    }

    @ozl
    public final void h(String str, String str2) {
        this.r = true;
        setPlaceholderVisible(true);
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            ez3 ez3Var = rLottieDrawable.k;
            rLottieDrawable.i();
            ez3Var.t = null;
            rLottieDrawable.setCallback(null);
            ez3Var.v = null;
        }
        this.d = this.c;
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(str, str2, this.g, this.h, null, false, false, this.f, PsExtractor.VIDEO_STREAM_MASK);
        rLottieDrawable2.setBounds(0, 0, this.g, this.h);
        ez3 ez3Var2 = rLottieDrawable2.k;
        ez3Var2.v = this.s;
        ez3Var2.q = this.l;
        ez3Var2.t = this.t;
        rLottieDrawable2.setAlpha(this.m);
        rLottieDrawable2.setColorFilter(this.n);
        rLottieDrawable2.setCallback(this);
        this.c = rLottieDrawable2;
        a780 a780Var = this.b;
        if (a780Var != null) {
            a780Var.onSuccess();
        }
        invalidate();
    }

    public final void i() {
        if (!this.u && this.x && this.r) {
            RLottieDrawable rLottieDrawable = this.c;
            if (rLottieDrawable != null) {
                rLottieDrawable.j();
                return;
            }
            return;
        }
        RLottieDrawable rLottieDrawable2 = this.c;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.i();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = false;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable == null) {
            return;
        }
        rLottieDrawable.setCallback(this);
        i();
        int i = this.v;
        if (i != 0) {
            d(i, this.w);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.u = true;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.i();
        }
        this.q.e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RLottieDrawable rLottieDrawable;
        RLottieDrawable rLottieDrawable2;
        boolean z = this.o;
        if (z && (rLottieDrawable2 = this.d) != null) {
            rLottieDrawable2.draw(canvas);
        } else if (z) {
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        } else {
            RLottieDrawable rLottieDrawable3 = this.d;
            if (rLottieDrawable3 != null) {
                rLottieDrawable3.k();
            }
            this.d = null;
        }
        if (!this.r || (rLottieDrawable = this.c) == null) {
            return;
        }
        rLottieDrawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.u = false;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable == null) {
            return;
        }
        rLottieDrawable.setCallback(this);
        i();
        int i = this.v;
        if (i != 0) {
            d(i, this.w);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 || i2 == i4) {
            return;
        }
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(0, 0, i, i2);
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            int i5 = this.i;
            drawable.setBounds(i5, i5, i - i5, i2 - i5);
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.u = true;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.i();
        }
        this.q.e();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        int g = swe0.g(an10.b(255 * f), 0, 255);
        this.m = g;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.setAlpha(g);
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(this.m);
        }
        RLottieDrawable rLottieDrawable2 = this.d;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.setAlpha(this.m);
        }
    }

    public final void setAnimating(boolean z) {
        this.x = z;
        i();
    }

    public final void setAnimationHeight(int i) {
        this.h = i;
    }

    public final void setAnimationListener(RLottieDrawable.a aVar) {
        this.t = aVar;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.k.t = aVar;
        }
    }

    public final void setAnimationSize(int i) {
        setAnimationWidth(i);
        setAnimationHeight(i);
    }

    public final void setAnimationWidth(int i) {
        this.g = i;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.n = colorFilter;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.setColorFilter(colorFilter);
        }
        RLottieDrawable rLottieDrawable2 = this.d;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.setColorFilter(colorFilter);
        }
    }

    public final void setDrawOnBitmap(izs<? super Canvas, s3q0> izsVar) {
        this.f = izsVar;
    }

    public final void setOnLoadAnimationCallback(a780 a780Var) {
        this.b = a780Var;
    }

    public final void setPlaceholderColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final void setPlaceholderImage(Drawable drawable) {
        this.e = drawable;
        if (drawable != null) {
            int i = this.i;
            drawable.setBounds(i, i, getWidth() - this.i, getHeight() - this.i);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setAlpha(this.m);
        }
        invalidate();
    }

    public final void setPlayCount(int i) {
        this.l = i;
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.k.q = i;
        }
    }

    public final void setSafeZoneSize(int i) {
        this.i = i;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(i, i, getWidth() - i, getHeight() - i);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c || super.verifyDrawable(drawable);
    }

    public FeedAnimatedView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.k = new AtomicInteger(0);
        this.l = -1;
        this.m = 255;
        this.o = true;
        this.p = new b();
        this.q = new b();
        this.s = new enh(this, 13);
        this.w = "";
    }

    public final void setPlaceholderImage(int i) {
        setPlaceholderImage(dhr0.t.a(i));
    }
}
