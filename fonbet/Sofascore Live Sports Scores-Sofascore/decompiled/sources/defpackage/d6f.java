package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d6f {
    public final e1d a = e.f(null);
    public final e1d b = e.f(Boolean.TRUE);
    public Object c;

    static {
        i6c.a("media3.ui.compose");
    }

    public static njh a(ale aleVar) {
        if (aleVar == null) {
            return null;
        }
        long f = yaa.f(aleVar.v().a, aleVar.v().b);
        if (njh.f(f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || njh.d(f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return null;
        }
        float f2 = aleVar.v().c;
        double d = f2;
        if (d < 1.0d) {
            f = njh.b(f, njh.f(f) * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        } else if (d > 1.0d) {
            f = njh.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, njh.d(f) / f2, 1);
        }
        return new njh(f);
    }

    public final void b(ale aleVar) {
        e1d e1dVar = this.b;
        if (aleVar == null) {
            ((Boolean) ((eoh) e1dVar).getValue()).booleanValue();
            ((eoh) e1dVar).setValue(true);
            return;
        }
        boolean z = aleVar.k(30) && !aleVar.i().a.isEmpty();
        if (!z) {
            ((eoh) e1dVar).setValue(Boolean.TRUE);
        }
        if (z) {
            if (aleVar.k(30) && aleVar.i().a(2)) {
                return;
            }
            ((eoh) e1dVar).setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ale aleVar, sq3 sq3Var) {
        c6f c6fVar;
        int i;
        try {
            if (sq3Var instanceof c6f) {
                c6fVar = (c6f) sq3Var;
                int i2 = c6fVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c6fVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = c6fVar.s;
                    lu3 lu3Var = lu3.a;
                    i = c6fVar.u;
                    if (i == 0) {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d6f d6fVar = c6fVar.r;
                        y6a.M(obj);
                        throw new fka();
                    }
                    y6a.M(obj);
                    ((eoh) this.a).setValue(a(aleVar));
                    b(aleVar);
                    if (aleVar == null) {
                        return Unit.a;
                    }
                    gme gmeVar = new gme(12, this, aleVar);
                    c6fVar.r = this;
                    c6fVar.u = 1;
                    t6a.y(aleVar, gmeVar, c6fVar);
                    return lu3Var;
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            getClass();
            throw th;
        }
        c6fVar = new c6f(this, sq3Var);
        Object obj2 = c6fVar.s;
        lu3 lu3Var2 = lu3.a;
        i = c6fVar.u;
    }
}
