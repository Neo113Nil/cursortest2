package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x1d implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x1d(long j, Function1 function1, Function0 function0, int i) {
        this.b = j;
        this.c = function1;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                b0a.k(this.b, (Function1) this.c, (Function0) this.d, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(385);
                bhf.a((ghf) this.c, this.b, (xtc) this.d, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x1d(ghf ghfVar, long j, xtc xtcVar, int i) {
        this.c = ghfVar;
        this.b = j;
        this.d = xtcVar;
    }
}
