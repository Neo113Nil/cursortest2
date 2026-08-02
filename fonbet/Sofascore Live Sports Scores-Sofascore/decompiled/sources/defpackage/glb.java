package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class glb extends xka implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int i;
    public final /* synthetic */ plb j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ xtc l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ myf q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ hmb s;
    public final /* synthetic */ io t;
    public final /* synthetic */ op3 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Map x;
    public final /* synthetic */ bl0 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glb(plb plbVar, Function0 function0, xtc xtcVar, boolean z, boolean z2, boolean z3, boolean z4, myf myfVar, boolean z5, hmb hmbVar, io ioVar, op3 op3Var, boolean z6, boolean z7, Map map, bl0 bl0Var, boolean z8, int i, int i2, int i3, int i4) {
        super(2);
        this.i = i4;
        this.j = plbVar;
        this.k = function0;
        this.l = xtcVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = myfVar;
        this.r = z5;
        this.s = hmbVar;
        this.t = ioVar;
        this.u = op3Var;
        this.v = z6;
        this.w = z7;
        this.x = map;
        this.y = bl0Var;
        this.z = z8;
        this.A = i;
        this.B = i2;
        this.C = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        int i2 = this.B;
        int i3 = this.A;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int K = aba.K(i3 | 1);
                int K2 = aba.K(i2);
                int i4 = this.C;
                aba.c(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (of3) obj, K, K2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int K3 = aba.K(i3 | 1);
                int K4 = aba.K(i2);
                int i5 = this.C;
                aba.c(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (of3) obj, K3, K4, i5);
                break;
        }
        return Unit.a;
    }
}
