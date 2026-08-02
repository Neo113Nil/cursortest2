package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gki implements xdh {
    public final xdh a;
    public final Function2 b;

    public gki(xdh xdhVar, Function2 function2) {
        this.a = xdhVar;
        this.b = function2;
    }

    @Override // defpackage.xdh
    public final List a() {
        return this.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        fki fkiVar;
        int i;
        if (rq3Var instanceof fki) {
            fkiVar = (fki) rq3Var;
            int i2 = fkiVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fkiVar.t = i2 - Integer.MIN_VALUE;
                Object obj = fkiVar.r;
                lu3 lu3Var = lu3.a;
                i = fkiVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    eki ekiVar = new eki(b98Var, this.b);
                    fkiVar.t = 1;
                    if (this.a.collect(ekiVar, fkiVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            }
        }
        fkiVar = new fki(this, rq3Var);
        Object obj2 = fkiVar.r;
        lu3 lu3Var2 = lu3.a;
        i = fkiVar.t;
        if (i != 0) {
        }
        pvd.x();
        return null;
    }
}
