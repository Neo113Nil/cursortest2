package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class m17 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ m17(int i, Function0 function0, xtc xtcVar, lrh lrhVar, boolean z, boolean z2, boolean z3, int i2, int i3) {
        this.b = i;
        this.c = function0;
        this.d = xtcVar;
        this.j = lrhVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = i2;
        this.i = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                u6h.i((lj7) this.j, this.b, this.e, this.c, this.f, this.d, this.g, (of3) obj, aba.K(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                qha.g(this.b, this.c, this.d, (lrh) this.j, this.e, this.f, this.g, (of3) obj, aba.K(this.h | 1), this.i);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ m17(lj7 lj7Var, int i, boolean z, Function0 function0, boolean z2, xtc xtcVar, boolean z3, int i2, int i3) {
        this.j = lj7Var;
        this.b = i;
        this.e = z;
        this.c = function0;
        this.f = z2;
        this.d = xtcVar;
        this.g = z3;
        this.h = i2;
        this.i = i3;
    }
}
