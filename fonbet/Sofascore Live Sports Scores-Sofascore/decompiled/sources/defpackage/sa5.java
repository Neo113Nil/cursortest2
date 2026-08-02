package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sa5 extends d7e implements swf {
    public final Drawable f;
    public final e1d g;
    public final e1d h;
    public final mqi i;

    public sa5(Drawable drawable) {
        drawable.getClass();
        this.f = drawable;
        this.g = e.f(0);
        joa joaVar = ta5.a;
        this.h = e.f(new njh((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : yaa.f(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.i = ypa.b(new h63(this, 18));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.swf
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.i.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.swf
    public final void b() {
        d();
    }

    @Override // defpackage.d7e
    public final boolean c(float f) {
        this.f.setAlpha(llf.c(wzb.b(f * 255.0f), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.swf
    public final void d() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        this.f.setColorFilter(ay1Var != null ? ay1Var.a : null);
        return true;
    }

    @Override // defpackage.d7e
    public final void f(ema emaVar) {
        int i;
        emaVar.getClass();
        int ordinal = emaVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                zzl.b();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    @Override // defpackage.d7e
    public final long i() {
        return ((njh) ((eoh) this.h).getValue()).a;
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        ha5Var.getClass();
        uj2 t = ha5Var.L0().t();
        ((Number) ((eoh) this.g).getValue()).intValue();
        try {
            t.o();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f;
            if (i < 28 || i >= 31 || !zzl.n(drawable)) {
                drawable.setBounds(0, 0, wzb.b(njh.f(ha5Var.n())), wzb.b(njh.d(ha5Var.n())));
            } else {
                t.a(njh.f(ha5Var.n()) / njh.f(i()), njh.d(ha5Var.n()) / njh.d(i()));
            }
            Canvas canvas = xx.a;
            drawable.draw(((wx) t).a);
            t.h();
        } catch (Throwable th) {
            t.h();
            throw th;
        }
    }
}
