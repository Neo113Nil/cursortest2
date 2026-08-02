package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class be7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae7 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ be7(ae7 ae7Var, boolean z, xtc xtcVar, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = ae7Var;
        this.c = z;
        this.d = xtcVar;
        this.e = j;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                u6h.l(this.b, this.c, this.d, this.e, (of3) obj, aba.K(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                u6h.k(this.b, this.c, this.d, this.e, (of3) obj, aba.K(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }
}
