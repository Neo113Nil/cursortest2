package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lia7;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ia7 extends q8 {
    public final wi7 e;
    public final int f;
    public final fdi g;
    public final jof h;
    public final aeh i;
    public final hof j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia7(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("competitionId");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = ((Number) a).intValue();
        fdi a2 = gdi.a(new ha7(null, false));
        this.g = a2;
        this.h = un0.u(a2);
        aeh b = beh.b(0, 0, null, 7);
        this.i = b;
        this.j = un0.t(b);
    }

    public final void k(aa7 aa7Var) {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.g;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, ha7.a((ha7) value, aa7Var, false, 2)));
    }
}
