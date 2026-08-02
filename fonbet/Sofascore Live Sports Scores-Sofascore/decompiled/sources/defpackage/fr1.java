package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fr1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ long d;

    public /* synthetic */ fr1(int i, int i2, long j, xtc xtcVar) {
        this.a = 1;
        this.b = i;
        this.c = xtcVar;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(3073);
                gr1.c(this.b, K, this.d, (of3) obj, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                rd0.h(this.b, K2, this.d, (of3) obj, this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                h5a.s(this.b, K3, this.d, (of3) obj, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int K4 = aba.K(this.b | 1);
                qha.j(this.d, this.c, (of3) obj, K4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fr1(int i, long j, xtc xtcVar, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.d = j;
        this.c = xtcVar;
    }

    public /* synthetic */ fr1(long j, xtc xtcVar, int i) {
        this.a = 3;
        this.d = j;
        this.c = xtcVar;
        this.b = i;
    }
}
