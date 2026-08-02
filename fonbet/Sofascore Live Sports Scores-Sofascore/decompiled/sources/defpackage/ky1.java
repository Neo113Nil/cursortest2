package defpackage;

import android.app.Activity;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ky1 extends of {
    public final hcd f;
    public final mqi g;
    public int h;
    public of i;
    public boolean j;
    public int k;

    public ky1(hcd hcdVar, int i, int i2) {
        hcdVar.getClass();
        this.f = hcdVar;
        this.g = ypa.b(new jy1(this, i, i2));
        this.k = 3;
    }

    @Override // defpackage.of
    public final void a() {
        if (this.a == 5) {
            return;
        }
        b(zf.j);
        try {
            p2g p2gVar = w2g.b;
            of ofVar = this.i;
            if (ofVar != null) {
                ofVar.a();
            }
            this.i = null;
            if (this.j) {
                ((ncd) this.g.getValue()).dismiss();
            }
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    @Override // defpackage.of
    public final float e() {
        of ofVar = this.i;
        return ofVar != null ? ofVar.e() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.of
    public final View f() {
        of ofVar = this.i;
        if (ofVar != null) {
            return ofVar.f();
        }
        return null;
    }

    @Override // defpackage.of
    public final int g() {
        of ofVar = this.i;
        return ofVar != null ? ofVar.g() : this.h;
    }

    @Override // defpackage.of
    public final void k(int i) {
        this.h = i;
        of ofVar = this.i;
        if (ofVar == null) {
            return;
        }
        ofVar.k(i);
    }

    @Override // defpackage.of
    public final void l() {
        Object u2gVar;
        if (this.a == 5) {
            return;
        }
        of ofVar = this.i;
        if (ofVar != null) {
            ofVar.l();
            return;
        }
        rq3 rq3Var = null;
        if (this.k == 0) {
            c(new qcd(5, "Error showing interstitial ad", null));
            a();
            return;
        }
        Activity activity = (Activity) iie.e.get();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            try {
                p2g p2gVar = w2g.b;
                ((ncd) this.g.getValue()).show();
                u2gVar = Unit.a;
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (!(u2gVar instanceof u2g)) {
                this.j = true;
                return;
            }
        }
        xw3.L(oc3.a, null, null, new q3(this, rq3Var, 11), 3);
    }

    @Override // defpackage.of
    public final void m() {
        of ofVar = this.i;
        if (ofVar != null) {
            ofVar.m();
        }
    }
}
