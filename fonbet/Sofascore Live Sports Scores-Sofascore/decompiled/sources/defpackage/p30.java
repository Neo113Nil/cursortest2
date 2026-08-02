package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class p30 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t30 b;
    public final /* synthetic */ g8j c;

    public /* synthetic */ p30(t30 t30Var, g8j g8jVar, int i) {
        this.a = i;
        this.b = t30Var;
        this.c = g8jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 6;
        g8j g8jVar = this.c;
        t30 t30Var = this.b;
        switch (i) {
            case 0:
                o30 o30Var = t30Var.f;
                z0 z0Var = new z0(g8jVar, 15);
                fsf fsfVar = new fsf();
                t30Var.e.i("dataBuilder", o30Var, new j4(i2, fsfVar, z0Var));
                Object obj = fsfVar.a;
                if (obj != null) {
                    return (f8j) obj;
                }
                Intrinsics.i("result");
                throw null;
            case 1:
                o30 o30Var2 = t30Var.g;
                p30 p30Var = new p30(t30Var, g8jVar, 2);
                fsf fsfVar2 = new fsf();
                t30Var.e.i("positioner", o30Var2, new j4(i2, fsfVar2, p30Var));
                Object obj2 = fsfVar2.a;
                if (obj2 != null) {
                    return (oqf) obj2;
                }
                Intrinsics.i("result");
                throw null;
            default:
                Object invoke = t30Var.c.invoke();
                dma dmaVar = (dma) (((dma) invoke).f() ? invoke : null);
                return dmaVar == null ? oqf.e : g8jVar.p0(dmaVar).k(dmaVar.P(0L));
        }
    }
}
