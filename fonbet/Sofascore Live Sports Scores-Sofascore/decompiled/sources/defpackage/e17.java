package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le17;", "Ld50;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e17 extends d50 {
    public final wi7 c;
    public final int d;
    public final String e;
    public final e1d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e17(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.c = wi7Var;
        Object a = fqgVar.a("competitionId");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        ((Number) a).intValue();
        Object a2 = fqgVar.a("roundId");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.d = ((Number) a2).intValue();
        ia0 ia0Var = ia0.q;
        this.e = fc6.e();
        this.f = e.f(new c17(null, km5.a, true));
        xw3.L(un0.z(this), null, null, new d17(this, rq3Var, 0), 3);
    }
}
