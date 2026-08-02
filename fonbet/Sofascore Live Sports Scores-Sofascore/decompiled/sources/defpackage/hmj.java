package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hmj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v23 b;
    public final /* synthetic */ gmj c;
    public final /* synthetic */ int d;

    public /* synthetic */ hmj(v23 v23Var, gmj gmjVar, int i, int i2) {
        this.a = i2;
        this.b = v23Var;
        this.c = gmjVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        gmj gmjVar = this.c;
        v23 v23Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c6o.u(v23Var, gmjVar, of3Var, aba.K(i2 | 1));
                break;
            case 1:
                c6o.s(v23Var, gmjVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                c6o.w(v23Var, gmjVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
