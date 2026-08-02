package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class x9j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ caj b;

    public /* synthetic */ x9j(caj cajVar, int i) {
        this.a = i;
        this.b = cajVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        rq3 rq3Var = null;
        int i2 = 1;
        caj cajVar = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z = cajVar.u;
                if (booleanValue) {
                    if (((h4a) ((eoh) ((j4a) ((i4a) tgj.x(cajVar, dh3.m))).a).getValue()).a != 1) {
                        cajVar.s.v(false);
                    }
                    if (z) {
                        cajVar.t1(false);
                    }
                } else {
                    cajVar.o1();
                    jwj jwjVar = cajVar.q;
                    scj scjVar = jwjVar.a;
                    q4a q4aVar = jwjVar.b;
                    haj hajVar = haj.a;
                    scjVar.b.a().q();
                    l9j l9jVar = scjVar.b;
                    l9jVar.e(null);
                    jwjVar.l(l9jVar);
                    scjVar.b(q4aVar, true, hajVar);
                    scjVar.e(true);
                    cajVar.q.a();
                }
                z1a.R(cajVar, new w9j(cajVar, i2));
                return Unit.a;
            case 1:
                upf.a(cajVar);
                return Unit.a;
            case 2:
                b85 b85Var = new b85();
                cajVar.y.c(b85Var);
                cajVar.C = b85Var;
                upf.a(cajVar);
                return Unit.a;
            case 3:
                cej cejVar = cajVar.r;
                long j = ((dnd) obj).a;
                dma b = cejVar.b();
                if (b != null && b.f()) {
                    j = b.g(j);
                }
                int d = cajVar.r.d(j, true);
                if (d >= 0) {
                    cajVar.q.j(t6a.g(d, d));
                }
                cajVar.s.A(k69.a, j);
                return Unit.a;
            case 4:
                cajVar.p1();
                cajVar.s.b();
                upf.a(cajVar);
                return Unit.a;
            case 5:
                cajVar.p1();
                return Unit.a;
            case 6:
                xw3.L(cajVar.Y0(), null, nu3.d, new vki((ria) obj, cajVar, rq3Var, 11), 1);
                return Unit.a;
            case 7:
                List list = (List) obj;
                aej c = cajVar.r.c();
                return Boolean.valueOf(c != null ? list.add(c) : false);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((eoh) cajVar.s.k).setValue(bool);
                return Unit.a;
        }
    }
}
