package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xtc d;

    public /* synthetic */ hn1(xtc xtcVar, int i, int i2, int i3) {
        this.a = 0;
        this.d = xtcVar;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                m6k.p(this.b, this.c, aba.K(7), of3Var, this.d);
                break;
            case 1:
                tgj.a(this.b, this.c, aba.K(1), of3Var, this.d);
                break;
            case 2:
                td4.j(this.b, aba.K(this.c | 1), of3Var, this.d);
                break;
            case 3:
                z8e.l(this.b, this.c, aba.K(385), of3Var, this.d);
                break;
            case 4:
                td4.J(this.b, aba.K(this.c | 1), of3Var, this.d);
                break;
            case 5:
                td4.u(this.b, aba.K(this.c | 1), of3Var, this.d);
                break;
            case 6:
                td4.D(this.b, aba.K(this.c | 1), of3Var, this.d);
                break;
            case 7:
                qea.c(aba.K(this.b | 1), this.c, of3Var, this.d);
                break;
            case 8:
                s6a.g(aba.K(this.b | 1), this.c, of3Var, this.d);
                break;
            default:
                h5a.A(this.b, this.c, aba.K(1), of3Var, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hn1(int i, xtc xtcVar, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.d = xtcVar;
        this.c = i2;
    }

    public /* synthetic */ hn1(int i, int i2, xtc xtcVar, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = xtcVar;
    }

    public /* synthetic */ hn1(xtc xtcVar, int i, int i2, int i3, byte b) {
        this.a = i3;
        this.d = xtcVar;
        this.b = i;
        this.c = i2;
    }
}
