package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g70 implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g70(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((k70) obj).invalidateSelf();
                break;
            default:
                drawable.getClass();
                sa5 sa5Var = (sa5) obj;
                e1d e1dVar = sa5Var.g;
                ((eoh) e1dVar).setValue(Integer.valueOf(((Number) ((eoh) e1dVar).getValue()).intValue() + 1));
                Drawable drawable2 = sa5Var.f;
                joa joaVar = ta5.a;
                ((eoh) sa5Var.h).setValue(new njh((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : yaa.f(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((k70) this.b).scheduleSelf(runnable, j);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) ta5.a.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((k70) this.b).unscheduleSelf(runnable);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) ta5.a.getValue()).removeCallbacks(runnable);
                break;
        }
    }
}
