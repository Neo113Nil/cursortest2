package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m00 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        int i = this.a;
        int i2 = 0;
        int i3 = 12;
        rq3 rq3Var2 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object s = oyn.s(qzeVar, new l00((n00) obj, rq3Var2, i2), rq3Var);
                if (s != lu3.a) {
                    break;
                }
                break;
            case 1:
                Object r = s9a.r(new yp7(qzeVar, (a6e) obj, (rq3) null), rq3Var);
                if (r != lu3.a) {
                    break;
                }
                break;
            case 2:
                Object d = rti.d(qzeVar, null, new ma0(i3, (Function0) obj), rq3Var, 7);
                if (d != lu3.a) {
                    break;
                }
                break;
            case 3:
                o85 o85Var = (o85) obj;
                mme mmeVar = new mme(o85Var, 23);
                yyf yyfVar = new yyf(o85Var, 0);
                yyf yyfVar2 = new yyf(o85Var, 1);
                t1d t1dVar = new t1d(o85Var, 26);
                float f = e95.a;
                Object s2 = oyn.s(qzeVar, new a95(mmeVar, yyfVar, yyfVar2, t1dVar, null), rq3Var);
                lu3 lu3Var = lu3.a;
                if (s2 != lu3Var) {
                    s2 = Unit.a;
                }
                if (s2 != lu3Var) {
                    break;
                }
                break;
            case 4:
                Object k1 = ((ooi) qzeVar).k1(new l00((gt3) obj, rq3Var2, 3), rq3Var);
                if (k1 != lu3.a) {
                    break;
                }
                break;
            case 5:
                Object s3 = oyn.s(qzeVar, new qp1((nji) obj, rq3Var2, 4), rq3Var);
                if (s3 != lu3.a) {
                    break;
                }
                break;
            case 6:
                Object s4 = oyn.s(qzeVar, new l00(new chf(1, (k8j) obj, k8j.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 24), rq3Var2, 2), rq3Var);
                lu3 lu3Var2 = lu3.a;
                if (s4 != lu3Var2) {
                    s4 = Unit.a;
                }
                if (s4 != lu3Var2) {
                    break;
                }
                break;
            case 7:
                Object r2 = s9a.r(new k50((caj) obj, qzeVar, rq3Var2, 29), rq3Var);
                if (r2 != lu3.a) {
                    break;
                }
                break;
            case 8:
                tbj tbjVar = (tbj) obj;
                Object r3 = kda.r(qzeVar, tbjVar.z, tbjVar.y, rq3Var);
                if (r3 != lu3.a) {
                    break;
                }
                break;
            default:
                Object r4 = s9a.r(new k50(qzeVar, (b9j) obj, rq3Var2, i3), rq3Var);
                lu3 lu3Var3 = lu3.a;
                if (r4 != lu3Var3) {
                    r4 = Unit.a;
                }
                if (r4 != lu3Var3) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
