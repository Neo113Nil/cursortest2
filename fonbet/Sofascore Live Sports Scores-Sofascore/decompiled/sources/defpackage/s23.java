package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s23 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ vy8 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ tc3 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s23(vy8 vy8Var, int i, int i2, tc3 tc3Var, int i3, int i4, int i5) {
        super(2);
        this.i = i5;
        this.j = vy8Var;
        this.k = i;
        this.l = i2;
        this.m = tc3Var;
        this.n = i3;
        this.o = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        int i2 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int i3 = i2 | 1;
                int i4 = this.o;
                rd0.b(this.j, this.k, this.l, this.m, (of3) obj, i3, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int i5 = this.o;
                nq8.g(this.j, this.k, this.l, this.m, (of3) obj, i2 | 1, i5);
                break;
        }
        return Unit.a;
    }
}
