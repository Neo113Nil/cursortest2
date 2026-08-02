package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qs9 extends xka implements Function2 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs9(dt9 dt9Var, vy8 vy8Var, int i, t13 t13Var, int i2, int i3) {
        super(2);
        this.m = dt9Var;
        this.n = vy8Var;
        this.j = i;
        this.o = t13Var;
        this.k = i2;
        this.l = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        int i2 = this.k;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int i3 = this.l;
                int i4 = this.j;
                c5n.n((dt9) obj5, (vy8) obj4, i4, (t13) obj3, (of3) obj, i2 | 1, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                hmb hmbVar = (hmb) obj3;
                int K = aba.K(1572913);
                int K2 = aba.K(i2);
                int i5 = this.l;
                aba.b((plb) obj5, (xtc) obj4, this.j, hmbVar, (of3) obj, K, K2, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int i6 = this.l;
                o3a.i((String) obj5, (vy8) obj4, (cfj) obj3, this.j, (of3) obj, i2 | 1, i6);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs9(plb plbVar, xtc xtcVar, int i, hmb hmbVar, int i2, int i3, int i4) {
        super(2);
        this.m = plbVar;
        this.n = xtcVar;
        this.j = i;
        this.o = hmbVar;
        this.k = i3;
        this.l = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs9(String str, vy8 vy8Var, cfj cfjVar, int i, int i2, int i3) {
        super(2);
        this.m = str;
        this.n = vy8Var;
        this.o = cfjVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
    }
}
