package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class plh implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ plh(int i, int i2, long j, xtc xtcVar, Function1 function1, boolean z) {
        this.b = z;
        this.g = function1;
        this.c = xtcVar;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                jca.s((wn1) this.g, this.d, this.b, this.c, (of3) obj, aba.K(this.e | 1), this.f);
                break;
            default:
                Function1 function1 = (Function1) this.g;
                ((Integer) obj2).getClass();
                h5a.v(aba.K(this.e | 1), this.f, this.d, (of3) obj, this.c, function1, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ plh(wn1 wn1Var, long j, boolean z, xtc xtcVar, int i, int i2) {
        this.g = wn1Var;
        this.d = j;
        this.b = z;
        this.c = xtcVar;
        this.e = i;
        this.f = i2;
    }
}
