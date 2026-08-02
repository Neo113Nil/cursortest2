package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class s27 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ xtc d;

    public /* synthetic */ s27(int i, xtc xtcVar, Function0 function0, boolean z) {
        this.a = 2;
        this.c = function0;
        this.d = xtcVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c6o.f(aba.K(1), of3Var, this.d, this.c, this.b);
                break;
            case 1:
                ktm.g(aba.K(1), of3Var, this.d, this.c, this.b);
                break;
            case 2:
                pco.k(aba.K(3073), of3Var, this.d, this.c, this.b);
                break;
            case 3:
                wca.j(aba.K(1), of3Var, this.d, this.c, this.b);
                break;
            default:
                gz8.t(aba.K(1), of3Var, this.d, this.c, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s27(int i, int i2, xtc xtcVar, Function0 function0, boolean z) {
        this.a = i2;
        this.b = z;
        this.c = function0;
        this.d = xtcVar;
    }
}
