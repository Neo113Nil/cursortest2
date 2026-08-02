package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z4a extends qo2 implements Runnable, kpd, View.OnAttachStateChangeListener {
    public final cal c;
    public boolean d;
    public boolean e;
    public x9l f;

    public z4a(cal calVar) {
        super(!calVar.t ? 1 : 0);
        this.c = calVar;
    }

    @Override // defpackage.kpd
    public final x9l L(View view, x9l x9lVar) {
        this.f = x9lVar;
        cal calVar = this.c;
        kkk kkkVar = calVar.r;
        u9l u9lVar = x9lVar.a;
        kkkVar.f(ufa.G(u9lVar.i(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            calVar.s.f(ufa.G(u9lVar.i(8)));
            cal.b(calVar, x9lVar);
        }
        return calVar.t ? x9l.b : x9lVar;
    }

    @Override // defpackage.qo2
    public final void d(d9l d9lVar) {
        this.d = false;
        this.e = false;
        x9l x9lVar = this.f;
        if (d9lVar.a.b() > 0 && x9lVar != null) {
            u9l u9lVar = x9lVar.a;
            cal calVar = this.c;
            calVar.s.f(ufa.G(u9lVar.i(8)));
            calVar.r.f(ufa.G(u9lVar.i(8)));
            cal.b(calVar, x9lVar);
        }
        this.f = null;
    }

    @Override // defpackage.qo2
    public final void e(d9l d9lVar) {
        this.d = true;
        this.e = true;
    }

    @Override // defpackage.qo2
    public final x9l f(x9l x9lVar, List list) {
        cal calVar = this.c;
        cal.b(calVar, x9lVar);
        return calVar.t ? x9l.b : x9lVar;
    }

    @Override // defpackage.qo2
    public final c0l g(d9l d9lVar, c0l c0lVar) {
        this.d = false;
        return c0lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            x9l x9lVar = this.f;
            if (x9lVar != null) {
                cal calVar = this.c;
                calVar.s.f(ufa.G(x9lVar.a.i(8)));
                cal.b(calVar, x9lVar);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
