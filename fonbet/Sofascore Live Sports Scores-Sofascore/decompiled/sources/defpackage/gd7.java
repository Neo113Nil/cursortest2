package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gd7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd7 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xtc e;
    public final /* synthetic */ int f;

    public /* synthetic */ gd7(zd7 zd7Var, Function1 function1, boolean z, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = zd7Var;
        this.c = function1;
        this.d = z;
        this.e = xtcVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                z8e.m(this.b, this.c, this.d, this.e, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                z8e.p(this.b, this.c, this.d, this.e, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
