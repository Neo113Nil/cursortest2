package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lax6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ax6 extends q8 {
    public final ky6 e;
    public final int f;
    public final int g;
    public final e1d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax6(fqg fqgVar, Application application, ky6 ky6Var) {
        super(application);
        fqgVar.getClass();
        ky6Var.getClass();
        this.e = ky6Var;
        Object a = fqgVar.a("competition");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        Object a2 = fqgVar.a("roundId");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = ((Number) a2).intValue();
        Object a3 = fqgVar.a("roundSequence");
        if (a3 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = ((Number) a3).intValue();
        this.h = e.f(new rj5(km5.a, true));
        xw3.L(un0.z(this), null, null, new q3(this, rq3Var, 27), 3);
    }

    public final rj5 k() {
        return (rj5) ((eoh) this.h).getValue();
    }
}
