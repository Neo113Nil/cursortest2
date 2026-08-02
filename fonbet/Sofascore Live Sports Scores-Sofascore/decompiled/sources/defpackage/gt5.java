package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class gt5 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gt5(int i, int i2, String str, Integer num, int i3, xtc xtcVar, int i4) {
        this.c = i;
        this.e = i2;
        this.b = str;
        this.g = num;
        this.f = i3;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                gvd.f(this.c, this.e, this.b, (Integer) obj3, this.f, this.d, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.e | 1);
                String str = this.b;
                int i2 = this.c;
                xtc xtcVar = this.d;
                s02.u(str, i2, xtcVar, (Boolean) obj3, (of3) obj, K2, this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gt5(String str, int i, xtc xtcVar, Boolean bool, int i2, int i3) {
        this.b = str;
        this.c = i;
        this.d = xtcVar;
        this.g = bool;
        this.e = i2;
        this.f = i3;
    }
}
