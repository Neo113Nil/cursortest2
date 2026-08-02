package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltm7;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class tm7 extends q8 {
    public final wi7 e;
    public final int f;
    public final String g;
    public final e1d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm7(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("competitionId");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        int intValue = ((Number) a).intValue();
        this.f = intValue;
        Object a2 = fqgVar.a("USER_ID_EXTRA");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        String str = (String) a2;
        this.g = str;
        this.h = e.f(new rm7(intValue, rlh.b, null, true, false));
        ia0 ia0Var = ia0.q;
        xw3.L(un0.z(this), null, null, new hj(this, str.equals(ok3.p().e().getId()), (rq3) null), 3);
    }
}
