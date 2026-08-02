package defpackage;

import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class imh {
    public final j2d a = new j2d();
    public final e1d b = e.f(null);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0, types: [imh] */
    /* JADX WARN: Type inference failed for: r7v1, types: [h2d] */
    /* JADX WARN: Type inference failed for: r7v4, types: [h2d] */
    /* JADX WARN: Type inference failed for: r7v5, types: [h2d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(efi efiVar, sq3 sq3Var) {
        hmh hmhVar;
        int i;
        e1d e1dVar;
        j2d j2dVar;
        try {
            try {
                if (sq3Var instanceof hmh) {
                    hmhVar = (hmh) sq3Var;
                    int i2 = hmhVar.v;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        hmhVar.v = i2 - Integer.MIN_VALUE;
                        Object obj = hmhVar.t;
                        lu3 lu3Var = lu3.a;
                        i = hmhVar.v;
                        e1dVar = this.b;
                        if (i != 0) {
                            y6a.M(obj);
                            hmhVar.r = efiVar;
                            j2d j2dVar2 = this.a;
                            hmhVar.s = j2dVar2;
                            hmhVar.v = 1;
                            Object e = j2dVar2.e(hmhVar);
                            j2dVar = j2dVar2;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                h2d h2dVar = hmhVar.s;
                                y6a.M(obj);
                                this = h2dVar;
                                return obj;
                            }
                            ?? r7 = hmhVar.s;
                            efiVar = hmhVar.r;
                            y6a.M(obj);
                            j2dVar = r7;
                        }
                        hmhVar.r = efiVar;
                        hmhVar.s = j2dVar;
                        hmhVar.v = 2;
                        lj2 lj2Var = new lj2(1, z9a.b(hmhVar));
                        lj2Var.t();
                        ((eoh) e1dVar).setValue(new gmh(efiVar, lj2Var));
                        obj = lj2Var.q();
                        this = j2dVar;
                    }
                }
                if (i != 0) {
                }
                hmhVar.r = efiVar;
                hmhVar.s = j2dVar;
                hmhVar.v = 2;
                lj2 lj2Var2 = new lj2(1, z9a.b(hmhVar));
                lj2Var2.t();
                ((eoh) e1dVar).setValue(new gmh(efiVar, lj2Var2));
                obj = lj2Var2.q();
                this = j2dVar;
            } finally {
                ((eoh) e1dVar).setValue(null);
            }
        } finally {
            this.f(null);
        }
        hmhVar = new hmh(this, sq3Var);
        Object obj2 = hmhVar.t;
        lu3 lu3Var2 = lu3.a;
        i = hmhVar.v;
        e1dVar = this.b;
    }
}
