package Q8;

import O8.r;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9526a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f9527b;

    /* renamed from: c, reason: collision with root package name */
    public ValueAnimator f9528c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9529d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9530e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f9531f;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9526a = context;
        Drawable drawable = AbstractC5338c.getDrawable(context, r.f8414b);
        Intrinsics.checkNotNull(drawable);
        Drawable mutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "getDrawable(context, R.d…_gif_branding)!!.mutate()");
        this.f9527b = mutate;
        this.f9528c = ValueAnimator.ofInt(255, 0);
        this.f9529d = U8.f.a(10);
        this.f9530e = U8.f.a(12);
        this.f9531f = new Rect();
        mutate.setAlpha(0);
        this.f9528c.setDuration(800L);
        this.f9528c.setStartDelay(1000L);
    }

    public static final void d(b this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Drawable drawable = this$0.f9527b;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        drawable.setAlpha(((Integer) animatedValue).intValue());
    }

    public final void b(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f9531f.left = (canvas.getClipBounds().right - this.f9529d) - ((this.f9527b.getIntrinsicWidth() / this.f9527b.getIntrinsicHeight()) * this.f9530e);
        this.f9531f.top = (canvas.getClipBounds().bottom - this.f9530e) - this.f9529d;
        this.f9531f.right = canvas.getClipBounds().right - this.f9529d;
        this.f9531f.bottom = canvas.getClipBounds().bottom - this.f9529d;
        this.f9527b.setBounds(this.f9531f);
        this.f9527b.draw(canvas);
    }

    public final void c() {
        timber.log.a.a("startAnimation", new Object[0]);
        this.f9527b.setAlpha(255);
        ValueAnimator valueAnimator = this.f9528c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f9528c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Q8.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.d(b.this, valueAnimator2);
            }
        });
        this.f9528c.start();
    }
}
