package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld47;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d47 extends q8 {
    public final wi7 e;
    public final ev6 f;
    public final j67 g;
    public final e1d h;
    public final g62 i;
    public final nn2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d47(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("FANTASY_COMPETITION_EXTRA");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = (ev6) a;
        Object a2 = fqgVar.a("FANTASY_LEAGUE_EXTRA");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        j67 j67Var = (j67) a2;
        this.g = j67Var;
        String str = j67Var.d;
        ia0 ia0Var = ia0.q;
        this.h = e.f(new c47(Intrinsics.c(str, ok3.p().e().getId()), false));
        g62 g = ml4.g(0, 7, null);
        this.i = g;
        this.j = f5p.J(g);
    }
}
