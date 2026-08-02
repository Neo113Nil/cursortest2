package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class z51 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z51(float f, long j, n29 n29Var) {
        this.d = n29Var;
        this.b = j;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        float f = this.c;
        switch (i) {
            case 0:
                n29 n29Var = (n29) obj2;
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ha5.s0(ymaVar, n29Var, new z51(this.b, f, ymaVar));
                ww9.x(ymaVar, n29Var);
                break;
            default:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                ha5.f0(ha5Var, this.b, 0L, 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), null, 246);
                ((yma) obj2).a();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z51(long j, float f, yma ymaVar) {
        this.b = j;
        this.c = f;
        this.d = ymaVar;
    }
}
