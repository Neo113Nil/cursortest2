package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a9h {
    public final mah a;
    public final mah b;

    public a9h(mah mahVar, mah mahVar2) {
        mahVar.getClass();
        mahVar2.getClass();
        this.a = mahVar;
        this.b = mahVar2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5.b.a(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.a.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        z8h z8hVar;
        int i;
        if (sq3Var instanceof z8h) {
            z8hVar = (z8h) sq3Var;
            int i2 = z8hVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z8hVar.t = i2 - Integer.MIN_VALUE;
                Object obj = z8hVar.r;
                lu3 lu3Var = lu3.a;
                i = z8hVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    z8hVar.t = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                z8hVar.t = 2;
            }
        }
        z8hVar = new z8h(this, sq3Var);
        Object obj2 = z8hVar.r;
        lu3 lu3Var2 = lu3.a;
        i = z8hVar.t;
        if (i != 0) {
        }
        z8hVar.t = 2;
    }
}
