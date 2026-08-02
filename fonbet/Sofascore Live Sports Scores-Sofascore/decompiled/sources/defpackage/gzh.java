package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gzh {
    public final zyh a;
    public final NetworkCoroutineAPI b;

    public gzh(zyh zyhVar, NetworkCoroutineAPI networkCoroutineAPI) {
        zyhVar.getClass();
        networkCoroutineAPI.getClass();
        this.a = zyhVar;
        this.b = networkCoroutineAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        azh azhVar;
        int i;
        if (sq3Var instanceof azh) {
            azhVar = (azh) sq3Var;
            int i2 = azhVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                azhVar.t = i2 - Integer.MIN_VALUE;
                Object obj = azhVar.r;
                lu3 lu3Var = lu3.a;
                i = azhVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    r3 r3Var = new r3(this, rq3Var, 20);
                    azhVar.t = 1;
                    obj = yaa.P(r3Var, azhVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        azhVar = new azh(this, sq3Var);
        Object obj2 = azhVar.r;
        lu3 lu3Var2 = lu3.a;
        i = azhVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        bzh bzhVar;
        int i;
        if (sq3Var instanceof bzh) {
            bzhVar = (bzh) sq3Var;
            int i2 = bzhVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bzhVar.t = i2 - Integer.MIN_VALUE;
                Object obj = bzhVar.r;
                lu3 lu3Var = lu3.a;
                i = bzhVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    bzhVar.t = 1;
                    obj = gz8.U(bzhVar, this.a.a, true, false, new z1h(21));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) (((List) obj).isEmpty() ? null : obj);
                return list != null ? oea.l(ke0.c, Sports.INSTANCE.getEntries()) : list;
            }
        }
        bzhVar = new bzh(this, sq3Var);
        Object obj2 = bzhVar.r;
        lu3 lu3Var2 = lu3.a;
        i = bzhVar.t;
        if (i != 0) {
        }
        List list2 = (List) (((List) obj2).isEmpty() ? null : obj2);
        if (list2 != null) {
        }
    }

    public final Object c(ArrayList arrayList, sq3 sq3Var) {
        zyh zyhVar = this.a;
        Object U = gz8.U(sq3Var, zyhVar.a, false, true, new yyh(zyhVar, arrayList, 1));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }
}
