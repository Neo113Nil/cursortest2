package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class xi4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj4 b;

    public /* synthetic */ xi4(qj4 qj4Var, int i) {
        this.a = i;
        this.b = qj4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        qj4 qj4Var = this.b;
        switch (i) {
            case 0:
                f55 f55Var = (f55) obj;
                int i2 = f55Var.a;
                Long a = qj4Var.a();
                kg2 kg2Var = qj4Var.c;
                if (a != null) {
                    lg2 b = kg2Var.b(kg2Var.b(a.longValue()).e);
                    if (qj4Var.a.d(b.a)) {
                        ((eoh) qj4Var.e).setValue(b);
                    }
                }
                ((eoh) qj4Var.g).setValue(f55Var);
                break;
            case 1:
                Long l = (Long) obj;
                e1d e1dVar = qj4Var.f;
                if (l != null) {
                    eg2 a2 = qj4Var.c.a(l.longValue());
                    ((eoh) e1dVar).setValue(qj4Var.a.d(a2.a) ? a2 : null);
                } else {
                    ((eoh) e1dVar).setValue(null);
                }
                break;
            default:
                lg2 b2 = qj4Var.c.b(((Long) obj).longValue());
                if (qj4Var.a.d(b2.a)) {
                    ((eoh) qj4Var.e).setValue(b2);
                }
                break;
        }
        return Unit.a;
    }
}
