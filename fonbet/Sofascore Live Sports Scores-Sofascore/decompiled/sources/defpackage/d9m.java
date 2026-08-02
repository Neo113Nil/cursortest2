package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d9m implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ e5f b;

    public d9m(b98 b98Var, e5f e5fVar) {
        this.a = b98Var;
        this.b = e5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        e6m e6mVar;
        int i;
        if (rq3Var instanceof e6m) {
            e6mVar = (e6m) rq3Var;
            int i2 = e6mVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e6mVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = e6mVar.r;
                lu3 lu3Var = lu3.a;
                i = e6mVar.s;
                if (i != 0) {
                    y6a.M(obj2);
                    Object c = ((p0d) obj).c(this.b);
                    e6mVar.s = 1;
                    if (this.a.emit(c, e6mVar) == lu3Var) {
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
        e6mVar = new e6m(this, rq3Var);
        Object obj22 = e6mVar.r;
        lu3 lu3Var2 = lu3.a;
        i = e6mVar.s;
        if (i != 0) {
        }
        return Unit.a;
    }
}
