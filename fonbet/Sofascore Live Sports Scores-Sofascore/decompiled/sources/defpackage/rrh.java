package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class rrh implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rrh(gv9 gv9Var, Object obj, lrh lrhVar, Function1 function1, boolean z, boolean z2) {
        this.d = gv9Var;
        this.e = obj;
        this.f = lrhVar;
        this.g = function1;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mvh mvhVar;
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                gv9 gv9Var = (gv9) obj4;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esaVar.a(gv9Var.size(), null, new wsd(9, new z1h(16), gv9Var), new tc3(802480018, new srh(gv9Var, this.e, (lrh) obj3, (Function1) obj2, this.b, this.c), true));
                break;
            default:
                q5b q5bVar = (q5b) obj4;
                ce8 ce8Var = (ce8) this.e;
                tbj tbjVar = (tbj) obj3;
                nnd nndVar = (nnd) obj2;
                dnd dndVar = (dnd) obj;
                if (!q5bVar.b()) {
                    ce8.a(ce8Var);
                } else if (!this.b && (mvhVar = q5bVar.c) != null) {
                    ((lw4) mvhVar).b();
                }
                if (q5bVar.b() && this.c) {
                    if (q5bVar.a() != p69.b) {
                        bej d = q5bVar.d();
                        if (d != null) {
                            long j = dndVar.a;
                            fp4 fp4Var = q5bVar.d;
                            gt3 gt3Var = q5bVar.v;
                            int i2 = nndVar.i(d.b(j, true));
                            gt3Var.invoke(wcj.a((wcj) fp4Var.b, null, t6a.g(i2, i2), 5));
                            if (((q80) q5bVar.a.b).b.length() > 0) {
                                ((eoh) q5bVar.k).setValue(p69.c);
                            }
                        }
                    } else {
                        tbjVar.d(dndVar);
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rrh(q5b q5bVar, ce8 ce8Var, boolean z, boolean z2, tbj tbjVar, nnd nndVar) {
        this.d = q5bVar;
        this.e = ce8Var;
        this.b = z;
        this.c = z2;
        this.f = tbjVar;
        this.g = nndVar;
    }
}
