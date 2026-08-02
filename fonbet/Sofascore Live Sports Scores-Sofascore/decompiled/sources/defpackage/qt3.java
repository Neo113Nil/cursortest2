package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class qt3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ st3 b;

    public /* synthetic */ qt3(st3 st3Var, int i) {
        this.a = i;
        this.b = st3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mvh mvhVar;
        int i = this.a;
        st3 st3Var = this.b;
        switch (i) {
            case 0:
                c6o.Z(st3Var);
                break;
            case 1:
                st3Var.w.e(true);
                break;
            case 2:
                st3Var.w.a(true);
                break;
            case 3:
                st3Var.w.c();
                break;
            case 4:
                c6o.Z(st3Var);
                break;
            case 5:
                st3Var.w.o();
                break;
            case 6:
                st3Var.s.w.b.r.b(st3Var.x.e);
                Unit unit = Unit.a;
                break;
            default:
                q5b q5bVar = st3Var.s;
                ce8 ce8Var = st3Var.y;
                boolean z = st3Var.t;
                if (!q5bVar.b()) {
                    ce8.a(ce8Var);
                } else if (!z && (mvhVar = q5bVar.c) != null) {
                    ((lw4) mvhVar).b();
                }
                break;
        }
        return Boolean.TRUE;
    }
}
