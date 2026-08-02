package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class t2f implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ t2f(wn1 wn1Var, Function1 function1, float f, float f2, xtc xtcVar, boolean z, int i, int i2) {
        this.h = wn1Var;
        this.i = function1;
        this.b = f;
        this.c = f2;
        this.d = xtcVar;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                tz9.g((u2f) this.h, this.e, this.d, this.b, (dfj) this.i, this.c, (of3) obj, aba.K(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                b0a.f((wn1) this.h, (Function1) this.i, this.b, this.c, this.d, this.e, (of3) obj, aba.K(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t2f(u2f u2fVar, boolean z, xtc xtcVar, float f, dfj dfjVar, float f2, int i, int i2) {
        this.h = u2fVar;
        this.e = z;
        this.d = xtcVar;
        this.b = f;
        this.i = dfjVar;
        this.c = f2;
        this.f = i;
        this.g = i2;
    }
}
