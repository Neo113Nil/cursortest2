package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u1e implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ boolean b;

    public u1e(b98 b98Var, boolean z) {
        this.a = b98Var;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        t1e t1eVar;
        int i;
        if (rq3Var instanceof t1e) {
            t1eVar = (t1e) rq3Var;
            int i2 = t1eVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t1eVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = t1eVar.r;
                lu3 lu3Var = lu3.a;
                i = t1eVar.s;
                int i3 = 1;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj2);
                    f6e z = g7a.z((f6e) obj, new nh9(this.b, rq3Var2, i3));
                    t1eVar.s = 1;
                    if (this.a.emit(z, t1eVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                return Unit.a;
            }
        }
        t1eVar = new t1e(this, rq3Var);
        Object obj22 = t1eVar.r;
        lu3 lu3Var2 = lu3.a;
        i = t1eVar.s;
        int i32 = 1;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}
