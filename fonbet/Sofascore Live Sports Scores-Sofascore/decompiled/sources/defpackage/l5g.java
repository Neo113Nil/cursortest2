package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l5g extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];
    public gck a;
    public Boolean b;
    public Long c;
    public t4f d;
    public Function0 e;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? f : g;
            gck gckVar = this.a;
            if (gckVar != null) {
                gckVar.setState(iArr);
            }
        } else {
            t4f t4fVar = new t4f(this, 4);
            this.d = t4fVar;
            postDelayed(t4fVar, 50L);
        }
        this.c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(l5g l5gVar) {
        gck gckVar = l5gVar.a;
        if (gckVar != null) {
            gckVar.setState(g);
        }
        l5gVar.d = null;
    }

    public final void b(l6f l6fVar, boolean z, long j, int i, long j2, float f2, Function0 function0) {
        long j3 = l6fVar.a;
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            gck gckVar = new gck(z);
            setBackground(gckVar);
            this.a = gckVar;
            this.b = Boolean.valueOf(z);
        }
        gck gckVar2 = this.a;
        gckVar2.getClass();
        this.e = function0;
        e(f2, j, j2, i);
        if (z) {
            gckVar2.setHotspot(dnd.f(j3), dnd.g(j3));
        } else {
            gckVar2.setHotspot(gckVar2.getBounds().centerX(), gckVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        t4f t4fVar = this.d;
        if (t4fVar != null) {
            removeCallbacks(t4fVar);
            t4f t4fVar2 = this.d;
            t4fVar2.getClass();
            t4fVar2.run();
        } else {
            gck gckVar = this.a;
            if (gckVar != null) {
                gckVar.setState(g);
            }
        }
        gck gckVar2 = this.a;
        if (gckVar2 == null) {
            return;
        }
        gckVar2.setVisible(false, false);
        unscheduleDrawable(gckVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(float f2, long j, long j2, int i) {
        gck gckVar = this.a;
        if (gckVar == null) {
            return;
        }
        if (gckVar.getRadius() != i) {
            gckVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long c = r13.c(j2, f2);
        r13 r13Var = gckVar.b;
        if (!(r13Var == null ? false : e8k.a(r13Var.a, c))) {
            gckVar.b = new r13(c);
            gckVar.setColor(ColorStateList.valueOf(hkg.s0(c)));
        }
        Rect rect = new Rect(0, 0, wzb.b(njh.f(j)), wzb.b(njh.d(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        gckVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
