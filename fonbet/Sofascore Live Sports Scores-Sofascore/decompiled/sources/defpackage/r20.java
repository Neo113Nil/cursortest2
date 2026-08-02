package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r20 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r20(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        super(2);
        this.i = i3;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        Object obj3 = this.l;
        int i2 = this.j;
        Object obj4 = this.o;
        Object obj5 = this.n;
        Object obj6 = this.m;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                t20.a((f2f) obj3, (Function0) obj6, (g2f) obj5, (tc3) obj4, (of3) obj, aba.K(i2 | 1), this.k);
                break;
            case 1:
                ((Number) obj2).intValue();
                gvd.a((ot9) obj3, (bpf) obj6, (xtc) obj5, (op3) obj4, (of3) obj, i2 | 1, this.k);
                break;
            default:
                ((Number) obj2).intValue();
                int K = aba.K(i2 | 1);
                int i3 = this.k;
                Object obj7 = this.l;
                wnn.c(obj7, (xtc) obj6, (j38) obj5, (tc3) obj4, (of3) obj, K, i3);
                break;
        }
        return Unit.a;
    }
}
