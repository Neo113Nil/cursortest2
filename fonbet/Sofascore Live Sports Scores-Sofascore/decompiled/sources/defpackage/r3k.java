package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r3k {
    public final k6g a;
    public final s82 b = new s82(24);
    public final v8c c = new v8c(7);
    public final fp4 d = new fp4(11, new s82(25), new v8c(8));

    public r3k(k6g k6gVar) {
        this.a = k6gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(r3k r3kVar, List list, List list2, sq3 sq3Var) {
        p3k p3kVar;
        Object obj;
        lu3 lu3Var;
        int i;
        int i2;
        if (sq3Var instanceof p3k) {
            p3kVar = (p3k) sq3Var;
            int i3 = p3kVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p3kVar.w = i3 - Integer.MIN_VALUE;
                obj = p3kVar.u;
                lu3Var = lu3.a;
                i = p3kVar.w;
                int i4 = 0;
                int i5 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    p3kVar.r = r3kVar;
                    p3kVar.s = list2;
                    p3kVar.w = 1;
                    obj = gz8.U(p3kVar, r3kVar.a, false, true, new q3k(r3kVar, list, i4));
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = p3kVar.t;
                        y6a.M(obj);
                        return new Integer(((Number) obj).intValue() + i2);
                    }
                    list2 = p3kVar.s;
                    r3kVar = p3kVar.r;
                    y6a.M(obj);
                }
                int length = ((long[]) obj).length;
                p3kVar.r = null;
                p3kVar.s = null;
                p3kVar.t = length;
                p3kVar.w = 2;
                obj = gz8.U(p3kVar, r3kVar.a, false, true, new q3k(r3kVar, list2, i5));
                if (obj != lu3Var) {
                    i2 = length;
                    return new Integer(((Number) obj).intValue() + i2);
                }
                return lu3Var;
            }
        }
        p3kVar = new p3k(r3kVar, sq3Var);
        obj = p3kVar.u;
        lu3Var = lu3.a;
        i = p3kVar.w;
        int i42 = 0;
        int i52 = 1;
        if (i != 0) {
        }
        int length2 = ((long[]) obj).length;
        p3kVar.r = null;
        p3kVar.s = null;
        p3kVar.t = length2;
        p3kVar.w = 2;
        obj = gz8.U(p3kVar, r3kVar.a, false, true, new q3k(r3kVar, list2, i52));
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
