package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ghk {
    public final k6g a;
    public final s82 b = new s82(27);

    public ghk(k6g k6gVar) {
        this.a = k6gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(ghk ghkVar, List list, sq3 sq3Var) {
        fhk fhkVar;
        int i;
        if (sq3Var instanceof fhk) {
            fhkVar = (fhk) sq3Var;
            int i2 = fhkVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fhkVar.w = i2 - Integer.MIN_VALUE;
                Object obj = fhkVar.u;
                Object obj2 = lu3.a;
                i = fhkVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    fhkVar.r = ghkVar;
                    fhkVar.s = list;
                    fhkVar.w = 1;
                    Object U = gz8.U(fhkVar, ghkVar.a, false, true, new sbk(4));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = fhkVar.s;
                    ghkVar = fhkVar.r;
                    y6a.M(obj);
                }
                if (list != null) {
                    fhkVar.r = null;
                    fhkVar.s = null;
                    fhkVar.t = list;
                    fhkVar.w = 2;
                    Object U2 = gz8.U(fhkVar, ghkVar.a, false, true, new mwj(19, ghkVar, list));
                    if (U2 != obj2) {
                        U2 = Unit.a;
                    }
                }
                return Unit.a;
            }
        }
        fhkVar = new fhk(ghkVar, sq3Var);
        Object obj3 = fhkVar.u;
        Object obj22 = lu3.a;
        i = fhkVar.w;
        if (i != 0) {
        }
        if (list != null) {
        }
        return Unit.a;
    }
}
