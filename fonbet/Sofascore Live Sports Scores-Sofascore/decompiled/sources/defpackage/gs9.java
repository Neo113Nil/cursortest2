package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;

    public /* synthetic */ gs9(Integer num, xtc xtcVar, int i, int i2) {
        this.a = 2;
        this.b = num;
        this.c = xtcVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                td4.i(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
            case 1:
                td4.z(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
            default:
                gz8.m(this.b, this.c, of3Var, aba.K(1), this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gs9(Integer num, xtc xtcVar, int i, int i2, byte b) {
        this.a = i2;
        this.b = num;
        this.c = xtcVar;
        this.d = i;
    }
}
