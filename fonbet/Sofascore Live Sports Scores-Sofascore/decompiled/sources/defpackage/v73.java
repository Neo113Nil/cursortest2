package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class v73 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ xtc e;

    public /* synthetic */ v73(gv9 gv9Var, boolean z, Function0 function0, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = gv9Var;
        this.c = z;
        this.d = function0;
        this.e = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                ml4.E(this.b, this.c, this.d, this.e, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                ml4.x(this.b, this.c, this.d, this.e, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }
}
