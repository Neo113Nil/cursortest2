package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmv6;", "Ld50;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class mv6 extends d50 {
    public final wi7 c;
    public final ev6 d;
    public final String e;
    public final fdi f;
    public final jof g;
    public final aeh h;
    public final hof i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv6(wi7 wi7Var, fqg fqgVar, Application application) {
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
        ia0 ia0Var = ia0.q;
        this.e = fc6.e();
        fdi a2 = gdi.a(new lv6(false, false));
        this.f = a2;
        this.g = un0.u(a2);
        aeh b = beh.b(0, 0, null, 7);
        this.h = b;
        this.i = un0.t(b);
    }
}
