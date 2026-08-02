package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxu6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class xu6 extends q8 {
    public final ru6 e;
    public final wi7 f;
    public final e1d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu6(Application application, fqg fqgVar, ru6 ru6Var, wi7 wi7Var) {
        super(application);
        fqgVar.getClass();
        ru6Var.getClass();
        wi7Var.getClass();
        this.e = ru6Var;
        this.f = wi7Var;
        Object a = fqgVar.a("competitionId");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        int intValue = ((Number) a).intValue();
        rlh rlhVar = rlh.b;
        this.g = e.f(new wu6(intValue, rlhVar, rlhVar, true));
        ia0 ia0Var = ia0.q;
        xw3.L(un0.z(this), null, null, new jk(this, ok3.p().e(), dv3.c(), (rq3) null), 3);
    }
}
