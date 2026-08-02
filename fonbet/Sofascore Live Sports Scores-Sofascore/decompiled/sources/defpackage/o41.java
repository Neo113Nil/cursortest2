package defpackage;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class o41 {
    public final l41 c;
    public wj9 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public o41(List list) {
        l41 n41Var;
        if (list.isEmpty()) {
            n41Var = new kpg(16);
        } else {
            n41Var = list.size() == 1 ? new n41(list) : new m41(list);
        }
        this.c = n41Var;
    }

    public final void a(k41 k41Var) {
        this.a.add(k41Var);
    }

    public float b() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float n = this.c.n();
        this.h = n;
        return n;
    }

    public final float c() {
        Interpolator interpolator;
        nja i = this.c.i();
        return (i == null || i.c() || (interpolator = i.d) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        nja i = this.c.i();
        return i.c() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.d - i.b()) / (i.a() - i.b());
    }

    public Object e() {
        float d = d();
        wj9 wj9Var = this.e;
        l41 l41Var = this.c;
        if (wj9Var == null && l41Var.h(d) && !k()) {
            return this.f;
        }
        nja i = l41Var.i();
        Interpolator interpolator = i.e;
        Interpolator interpolator2 = i.f;
        Object f = (interpolator == null || interpolator2 == null) ? f(i, c()) : g(i, d, interpolator.getInterpolation(d), interpolator2.getInterpolation(d));
        this.f = f;
        return f;
    }

    public abstract Object f(nja njaVar, float f);

    public Object g(nja njaVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((k41) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        l41 l41Var = this.c;
        if (l41Var.isEmpty()) {
            return;
        }
        float f2 = this.g;
        if (f2 == -1.0f) {
            f2 = l41Var.l();
            this.g = f2;
        }
        float f3 = f2;
        if (f < f2) {
            if (f3 == -1.0f) {
                f = l41Var.l();
                this.g = f;
            } else {
                f = f3;
            }
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (l41Var.j(f)) {
            h();
        }
    }

    public final void j(wj9 wj9Var) {
        wj9 wj9Var2 = this.e;
        if (wj9Var2 != null) {
            wj9Var2.getClass();
        }
        this.e = wj9Var;
    }

    public boolean k() {
        return false;
    }
}
