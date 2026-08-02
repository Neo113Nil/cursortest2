package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc7;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class yc7 extends q8 {
    public final wi7 e;
    public final int f;
    public final int g;
    public final boolean h;
    public final Integer i;
    public final e1d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc7(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("competitionId");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = ((Number) a).intValue();
        Object a2 = fqgVar.a("roundId");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = ((Number) a2).intValue();
        Boolean bool = (Boolean) fqgVar.a("assetsRestricted");
        int i = 0;
        this.h = bool != null ? bool.booleanValue() : false;
        Integer num = (Integer) fqgVar.a("COMPARISON_PLAYER_ID_EXTRA");
        this.i = num;
        this.j = e.f(new zo6(false, null, null, null, null, null, num == null));
        if (num != null) {
            xw3.L(un0.z(this), null, null, new vc7(this, rq3Var, i), 3);
        }
    }

    public static nc7 l(Float f, Float f2) {
        if (f == null || f2 == null) {
            return null;
        }
        int compare = Float.compare(f.floatValue(), f2.floatValue());
        if (compare < 0) {
            return nc7.b;
        }
        if (compare > 0) {
            return nc7.a;
        }
        return null;
    }

    public final void k() {
        xw3.L(un0.z(this), null, null, new jk(this, (rq3) null, 13), 3);
    }

    public final zo6 m() {
        return (zo6) ((eoh) this.j).getValue();
    }

    public final void n(kc7 kc7Var) {
        zo6 a;
        if (!(kc7Var instanceof ic7)) {
            if (kc7Var instanceof jc7) {
                xw3.L(un0.z(this), null, null, new hs6(this, kc7Var, (rq3) null, 22), 3);
                return;
            }
            return;
        }
        int ordinal = ((ic7) kc7Var).a.ordinal();
        if (ordinal == 0) {
            a = zo6.a(m(), false, null, null, null, null, null, false, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
        } else {
            if (ordinal != 1) {
                zzl.b();
                return;
            }
            a = zo6.a(m(), false, null, null, null, null, null, false, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        }
        e1d e1dVar = this.j;
        ((eoh) e1dVar).setValue(a);
        zo6 m = m();
        if (m.b != null || m.c != null) {
            k();
        } else {
            ((eoh) e1dVar).setValue(zo6.a(m(), false, null, null, null, null, null, true, 7));
        }
    }
}
