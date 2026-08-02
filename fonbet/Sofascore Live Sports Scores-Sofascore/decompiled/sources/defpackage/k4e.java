package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k4e {
    public final ej a;
    public final k9 b;
    public final z41 c = new z41(14);
    public final z41 d = new z41(14);
    public final z88 e = y6a.K(new gjb(this, null, 26));

    public k4e(ej ejVar, k9 k9Var) {
        this.a = ejVar;
        this.b = k9Var;
    }

    public static void b(k4e k4eVar) {
        k4eVar.c.y(new g4e(true, h4e.h));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a7e a7eVar, sq3 sq3Var) {
        j4e j4eVar;
        int i;
        a7e a7eVar2;
        Object obj;
        a7e a7eVar3;
        if (sq3Var instanceof j4e) {
            j4eVar = (j4e) sq3Var;
            int i2 = j4eVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j4eVar.u = i2 - Integer.MIN_VALUE;
                Object obj2 = j4eVar.s;
                Object obj3 = lu3.a;
                i = j4eVar.u;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj2);
                    ej ejVar = this.a;
                    j4eVar.r = a7eVar;
                    j4eVar.u = 1;
                    Object invoke = ejVar.invoke(j4eVar);
                    if (invoke == obj3) {
                        return obj3;
                    }
                    a7eVar2 = a7eVar;
                    obj = invoke;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a7e a7eVar4 = j4eVar.r;
                    y6a.M(obj2);
                    a7eVar2 = a7eVar4;
                    obj = obj2;
                }
                a7eVar3 = (a7e) obj;
                if (a7eVar3 != a7eVar2) {
                    a70.r("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
                    return null;
                }
                Class<k4e> cls = k4e.class;
                fl8 fl8Var = new fl8(0, this, cls, "invalidate", "invalidate()V", 0, 10);
                a7eVar3.getClass();
                en0 en0Var = a7eVar3.a;
                if (en0Var.b) {
                    ((etd) en0Var.c).invoke(fl8Var);
                } else {
                    synchronized (((v9f) en0Var.d)) {
                        if (!en0Var.b) {
                            ((ArrayList) en0Var.e).add(fl8Var);
                            z = false;
                        }
                    }
                    if (z) {
                        ((etd) en0Var.c).invoke(fl8Var);
                    }
                }
                if (a7eVar2 != null) {
                    fl8 fl8Var2 = new fl8(0, this, cls, "invalidate", "invalidate()V", 0, 11);
                    en0 en0Var2 = a7eVar2.a;
                    synchronized (((v9f) en0Var2.d)) {
                        ((ArrayList) en0Var2.e).remove(fl8Var2);
                    }
                }
                if (a7eVar2 != null) {
                    a7eVar2.b();
                }
                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                    a7eVar3.toString();
                }
                return a7eVar3;
            }
        }
        j4eVar = new j4e(this, sq3Var);
        Object obj22 = j4eVar.s;
        Object obj32 = lu3.a;
        i = j4eVar.u;
        boolean z2 = true;
        if (i != 0) {
        }
        a7eVar3 = (a7e) obj;
        if (a7eVar3 != a7eVar2) {
        }
    }
}
