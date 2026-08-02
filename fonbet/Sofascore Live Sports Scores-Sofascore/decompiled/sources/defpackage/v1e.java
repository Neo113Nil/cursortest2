package defpackage;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lv1e;", "Lynb;", "Lq1e;", "Lw0e;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class v1e extends ynb {
    public final lue l;
    public final g62 m;
    public final hof n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1e(Application application, lue lueVar) {
        super(application, tnb.a);
        lueVar.getClass();
        this.l = lueVar;
        rq3 rq3Var = null;
        g62 g = ml4.g(0, 7, null);
        this.m = g;
        int i = 3;
        this.n = pco.w(la8.a(hkg.I(new yf4(f5p.J(g), this.k, new zy1(i, rq3Var, i), 1), new etd(5), hkg.q), new tl(rq3Var, this, 18)), un0.z(this));
    }

    public final void t(final w0e w0eVar) {
        if (w0eVar instanceof t0e) {
            ynb.m(this, new r3(this, null, 17));
            return;
        }
        if (w0eVar instanceof v0e) {
            final int i = 0;
            n(null, new Function1() { // from class: r1e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    w0e w0eVar2 = w0eVar;
                    q1e q1eVar = (q1e) obj;
                    switch (i2) {
                        case 0:
                            q1eVar.getClass();
                            return q1e.a(q1eVar, null, ((v0e) w0eVar2).a, null, 5);
                        default:
                            q1eVar.getClass();
                            return q1e.a(q1eVar, null, null, ((s0e) w0eVar2).a, 3);
                    }
                }
            });
        } else if (w0eVar instanceof s0e) {
            final int i2 = 1;
            n(null, new Function1() { // from class: r1e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    w0e w0eVar2 = w0eVar;
                    q1e q1eVar = (q1e) obj;
                    switch (i22) {
                        case 0:
                            q1eVar.getClass();
                            return q1e.a(q1eVar, null, ((v0e) w0eVar2).a, null, 5);
                        default:
                            q1eVar.getClass();
                            return q1e.a(q1eVar, null, null, ((s0e) w0eVar2).a, 3);
                    }
                }
            });
        }
    }
}
