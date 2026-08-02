package defpackage;

import com.sofascore.model.database.DbSavedSearches;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gwg {
    public final k6g a;
    public final s82 b = new s82(18);

    public gwg(k6g k6gVar) {
        this.a = k6gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r7 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(gwg gwgVar, String str, DbSavedSearches dbSavedSearches, Integer num, sq3 sq3Var) {
        fwg fwgVar;
        Object obj;
        int i;
        Object U;
        if (sq3Var instanceof fwg) {
            fwgVar = (fwg) sq3Var;
            int i2 = fwgVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fwgVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = fwgVar.t;
                obj = lu3.a;
                i = fwgVar.v;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj2);
                    if (num != null) {
                        int intValue = num.intValue();
                        fwgVar.r = gwgVar;
                        fwgVar.s = dbSavedSearches;
                        fwgVar.v = 1;
                        Object U2 = gz8.U(fwgVar, gwgVar.a, false, true, new pu9(intValue, str, i3));
                        if (U2 != obj) {
                            U2 = Unit.a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj2);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dbSavedSearches = fwgVar.s;
                    gwgVar = fwgVar.r;
                    y6a.M(obj2);
                }
                fwgVar.r = null;
                fwgVar.s = null;
                fwgVar.v = 2;
                U = gz8.U(fwgVar, gwgVar.a, false, true, new aaf(13, gwgVar, dbSavedSearches));
                if (U != obj) {
                    U = Unit.a;
                }
            }
        }
        fwgVar = new fwg(gwgVar, sq3Var);
        Object obj22 = fwgVar.t;
        obj = lu3.a;
        i = fwgVar.v;
        int i32 = 1;
        if (i != 0) {
        }
        fwgVar.r = null;
        fwgVar.s = null;
        fwgVar.v = 2;
        U = gz8.U(fwgVar, gwgVar.a, false, true, new aaf(13, gwgVar, dbSavedSearches));
        if (U != obj) {
        }
    }
}
