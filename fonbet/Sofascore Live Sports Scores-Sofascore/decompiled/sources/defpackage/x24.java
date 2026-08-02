package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x24 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey4 b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ x24(ey4 ey4Var, xtc xtcVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = ey4Var;
        this.c = xtcVar;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a34.b(this.b, this.c, of3Var, aba.K(this.d | 1), this.e);
                break;
            default:
                a34.c(this.b, this.c, of3Var, aba.K(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }
}
