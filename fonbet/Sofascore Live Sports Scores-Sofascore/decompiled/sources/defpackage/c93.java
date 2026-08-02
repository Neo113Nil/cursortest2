package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class c93 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ xtc f;
    public final /* synthetic */ Serializable g;
    public final /* synthetic */ dt8 h;

    public /* synthetic */ c93(Serializable serializable, Integer num, boolean z, boolean z2, boolean z3, dt8 dt8Var, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.g = serializable;
        this.b = num;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.h = dt8Var;
        this.f = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        dt8 dt8Var = this.h;
        Serializable serializable = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                gz8.s((String) serializable, this.b, this.c, this.d, this.e, (Function0) dt8Var, this.f, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                fcp.R((mj7) serializable, this.b, this.c, this.d, this.e, (Function1) dt8Var, this.f, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }
}
