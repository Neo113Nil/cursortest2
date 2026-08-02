package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class dv5 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ dv5(boolean z, boolean z2, int i, xtc xtcVar, int i2) {
        this.b = z;
        this.c = z2;
        this.e = i;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(49);
                z8e.n(this.e, K, (of3) obj, this.d, this.b, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                gz8.q(aba.K(this.e | 1), (of3) obj, this.d, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                uaa.k(aba.K(55), this.e, (of3) obj, this.d, this.b, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dv5(boolean z, boolean z2, xtc xtcVar, int i) {
        this.b = z;
        this.c = z2;
        this.d = xtcVar;
        this.e = i;
    }

    public /* synthetic */ dv5(boolean z, boolean z2, xtc xtcVar, int i, int i2) {
        this.b = z;
        this.c = z2;
        this.d = xtcVar;
        this.e = i2;
    }
}
