package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class i30 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ xtc e;

    public /* synthetic */ i30(int i, int i2, xtc xtcVar, Function0 function0, boolean z) {
        this.b = i;
        this.c = z;
        this.d = function0;
        this.e = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                fcp.Z(aba.K(this.b | 1), (of3) obj, this.e, this.d, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                wba.j(this.b, this.c, this.d, this.e, (of3) obj, K);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i30(int i, xtc xtcVar, Function0 function0, boolean z) {
        this.e = xtcVar;
        this.d = function0;
        this.c = z;
        this.b = i;
    }
}
