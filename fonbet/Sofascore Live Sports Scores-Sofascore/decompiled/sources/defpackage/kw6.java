package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkw6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class kw6 extends q8 {
    public final wi7 e;
    public final int f;
    public final e1d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw6(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("competitionId");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = ((Number) a).intValue();
        this.g = e.f(null);
        xw3.L(un0.z(this), null, null, new q3(this, rq3Var, 26), 3);
    }
}
