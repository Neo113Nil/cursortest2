package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln87;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n87 extends q8 {
    public final wi7 e;
    public final ev6 f;
    public final fdi g;
    public final jof h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n87(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("competition");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = (ev6) a;
        fdi a2 = gdi.a(new m87());
        this.g = a2;
        this.h = un0.K(new v98(new ip1(this, rq3Var, 15), a2), un0.z(this), new uci(5000L, Long.MAX_VALUE), new m87());
    }
}
