package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ftc implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ftc(Object obj, long j, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = j;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                wca.c((Function0) obj6, this.b, (dtc) obj5, (q50) obj4, (tc3) obj3, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                sea.h((gv9) obj6, this.b, (dfj) obj5, (xtc) obj4, (String) obj3, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }
}
