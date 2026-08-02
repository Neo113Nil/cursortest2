package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class sn2 extends rn2 {
    public final /* synthetic */ int d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn2(Object obj, CoroutineContext coroutineContext, int i, a62 a62Var, int i2) {
        super(coroutineContext, i, a62Var);
        this.d = i2;
        this.e = obj;
    }

    @Override // defpackage.rn2
    public Object g(k8f k8fVar, rq3 rq3Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Object invoke = ((Function2) obj).invoke(k8fVar, rq3Var);
                if (invoke != lu3.a) {
                    break;
                }
                break;
            default:
                n4h n4hVar = new n4h(k8fVar);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    xw3.L(k8fVar, null, null, new hy1((z88) it.next(), n4hVar, null, 7), 3);
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.rn2
    public rn2 h(CoroutineContext coroutineContext, int i, a62 a62Var) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                return new sn2((Function2) obj, coroutineContext, i, a62Var, 0);
            default:
                return new sn2((Iterable) obj, coroutineContext, i, a62Var, 1);
        }
    }

    @Override // defpackage.rn2
    public ln2 j(ku3 ku3Var) {
        switch (this.d) {
            case 1:
                Function2 hy1Var = new hy1(this, (rq3) null, 5);
                a62 a62Var = a62.a;
                nu3 nu3Var = nu3.a;
                j8f j8fVar = new j8f(yt3.b(ku3Var, this.a), ml4.g(this.b, 4, a62Var));
                j8fVar.l0(nu3Var, j8fVar, hy1Var);
                return j8fVar;
            default:
                return super.j(ku3Var);
        }
    }

    @Override // defpackage.rn2
    public String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((Function2) this.e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
