package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Event;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lp06;", "Lx21;", "Lf06;", "Lzz5;", "k06", "j06", "i06", "h06", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p06 extends x21 {
    public final s96 o;
    public final g39 p;
    public final wi7 q;
    public final j0j r;
    public final bfk s;
    public final LinkedHashMap t;
    public Integer u;
    public boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p06(Application application, s96 s96Var, g39 g39Var, wi7 wi7Var, j0j j0jVar, bfk bfkVar) {
        super(application);
        s96Var.getClass();
        g39Var.getClass();
        wi7Var.getClass();
        j0jVar.getClass();
        bfkVar.getClass();
        this.o = s96Var;
        this.p = g39Var;
        this.q = wi7Var;
        this.r = j0jVar;
        this.s = bfkVar;
        this.t = new LinkedHashMap();
    }

    @Override // defpackage.x21
    public final Object u(Event event, rq3 rq3Var) {
        this.u = new Integer(event.getId());
        Object r = s9a.r(new o06(null, this, event), rq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    @Override // defpackage.x21
    public final void x(boolean z) {
        n(null, new c31(z, 4));
    }
}
