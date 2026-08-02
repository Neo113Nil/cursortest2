package defpackage;

import android.app.Application;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lif7;", "Ld50;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class if7 extends d50 {
    public final wi7 c;
    public final int d;
    public List e;
    public final fdi f;
    public final jof g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if7(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.c = wi7Var;
        Object a = fqgVar.a("competitionId");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.d = ((Number) a).intValue();
        Boolean bool = (Boolean) fqgVar.a("assetsRestricted");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        this.e = km5.a;
        fdi a2 = gdi.a(new gf7(booleanValue));
        this.f = a2;
        this.g = un0.K(new v98(new ip1(this, rq3Var, 20), a2), un0.z(this), new uci(5000L, Long.MAX_VALUE), new gf7(booleanValue));
        fcp.m0(new v98(hkg.I(a2, new e87(19), hkg.q), new qa7(this, rq3Var, 3), 3), un0.z(this));
    }
}
