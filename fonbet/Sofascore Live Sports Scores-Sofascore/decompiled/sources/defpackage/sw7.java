package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class sw7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ sw7(int i, int i2, vy8 vy8Var, tc3 tc3Var, tc3 tc3Var2, tc3 tc3Var3, int i3) {
        this.b = i;
        this.c = i2;
        this.e = vy8Var;
        this.f = tc3Var;
        this.g = tc3Var2;
        this.h = tc3Var3;
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.c | 1);
                l98.u(this.b, (String) obj6, (xtc) obj4, (String) obj5, (Double) obj3, (of3) obj, K, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.d | 1);
                z9.a(this.b, this.c, (vy8) obj6, (tc3) obj5, (tc3) obj4, (tc3) obj3, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sw7(int i, String str, xtc xtcVar, String str2, Double d, int i2, int i3) {
        this.b = i;
        this.e = str;
        this.g = xtcVar;
        this.f = str2;
        this.h = d;
        this.c = i2;
        this.d = i3;
    }
}
