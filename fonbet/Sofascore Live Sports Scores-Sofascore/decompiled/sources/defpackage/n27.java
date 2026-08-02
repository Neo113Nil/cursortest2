package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln27;", "Ld50;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n27 extends d50 {
    public final wi7 c;
    public final ev6 d;
    public final String e;
    public final fdi f;
    public final jof g;
    public final aeh h;
    public final hof i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n27(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.c = wi7Var;
        Object a = fqgVar.a("FANTASY_COMPETITION_EXTRA");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.d = (ev6) a;
        Object a2 = fqgVar.a("FANTASY_JOINED_RANDOM_LEAGUES_COUNT");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        int intValue = ((Number) a2).intValue();
        ia0 ia0Var = ia0.q;
        this.e = fc6.e();
        fdi a3 = gdi.a(new j47(false, false, false, intValue));
        this.f = a3;
        this.g = un0.u(a3);
        aeh b = beh.b(0, 0, null, 7);
        this.h = b;
        this.i = un0.t(b);
    }
}
