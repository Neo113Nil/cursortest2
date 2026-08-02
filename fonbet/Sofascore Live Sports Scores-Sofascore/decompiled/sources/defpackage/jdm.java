package defpackage;

import com.blaze.blazesdk.app_configurations.models.AppConfigurationsDto;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jdm {
    public static final jdm a = new jdm();
    public static final wdm b = wdm.a;
    public static long c;
    public static tul d;
    public static String e;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (defpackage.jdm.b.b(r9, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r9.d("blaze_data_store_disable_app_activity_events", r5, r0) != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        if (r9 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        r1m r1mVar;
        int i;
        a9m a9mVar;
        jdm jdmVar;
        tul tulVar;
        if (sq3Var instanceof r1m) {
            r1mVar = (r1m) sq3Var;
            int i2 = r1mVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r1mVar.v = i2 - Integer.MIN_VALUE;
                Object obj = r1mVar.t;
                lu3 lu3Var = lu3.a;
                i = r1mVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    r1mVar.r = this;
                    r1mVar.v = 1;
                    obj = c(r1mVar);
                } else if (i == 1) {
                    this = (jdm) r1mVar.r;
                    y6a.M(obj);
                } else if (i == 2) {
                    tulVar = r1mVar.s;
                    jdmVar = (jdm) r1mVar.r;
                    y6a.M(obj);
                    vnm vnmVar = vnm.a;
                    uul uulVar = tulVar.a;
                    Boolean valueOf = uulVar == null ? Boolean.valueOf(uulVar.h) : null;
                    r1mVar.r = jdmVar;
                    r1mVar.s = tulVar;
                    r1mVar.v = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tulVar = (tul) r1mVar.r;
                        y6a.M(obj);
                        return new qbm(tulVar);
                    }
                    tulVar = r1mVar.s;
                    jdmVar = (jdm) r1mVar.r;
                    y6a.M(obj);
                    q5m q5mVar = tulVar.d;
                    String str = q5mVar != null ? q5mVar.c : null;
                    jdmVar.getClass();
                    e = str;
                    List list = tulVar.f;
                    r1mVar.r = tulVar;
                    r1mVar.s = null;
                    r1mVar.v = 4;
                }
                a9mVar = (a9m) obj;
                if (!(a9mVar instanceof a6m)) {
                    return a9mVar;
                }
                if (!(a9mVar instanceof qbm)) {
                    zzl.b();
                    return null;
                }
                tul tulVar2 = (tul) ((qbm) a9mVar).a;
                this.getClass();
                d = tulVar2;
                vnm vnmVar2 = vnm.a;
                q5m q5mVar2 = tulVar2.d;
                String str2 = q5mVar2 != null ? q5mVar2.c : null;
                r1mVar.r = this;
                r1mVar.s = tulVar2;
                r1mVar.v = 2;
                if (vnmVar2.d("blaze_data_store_sdk_base_domain", str2, r1mVar) != lu3Var) {
                    jdmVar = this;
                    tulVar = tulVar2;
                    vnm vnmVar3 = vnm.a;
                    uul uulVar2 = tulVar.a;
                    if (uulVar2 == null) {
                    }
                    r1mVar.r = jdmVar;
                    r1mVar.s = tulVar;
                    r1mVar.v = 3;
                }
                return lu3Var;
            }
        }
        r1mVar = new r1m(this, sq3Var);
        Object obj2 = r1mVar.t;
        lu3 lu3Var2 = lu3.a;
        i = r1mVar.v;
        if (i != 0) {
        }
        a9mVar = (a9m) obj2;
        if (!(a9mVar instanceof a6m)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, sq3 sq3Var) {
        x4m x4mVar;
        int i;
        uul uulVar;
        Long l;
        a9m a9mVar;
        if (sq3Var instanceof x4m) {
            x4mVar = (x4m) sq3Var;
            int i2 = x4mVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x4mVar.v = i2 - Integer.MIN_VALUE;
                Object obj = x4mVar.t;
                lu3 lu3Var = lu3.a;
                i = x4mVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    tul tulVar = d;
                    if (tulVar != null && (uulVar = tulVar.a) != null && (l = uulVar.o) != null) {
                        if (System.currentTimeMillis() - c < l.longValue()) {
                            return new qbm(d);
                        }
                    }
                    x4mVar.r = this;
                    x4mVar.s = list;
                    x4mVar.v = 1;
                    obj = c(x4mVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = x4mVar.s;
                    this = x4mVar.r;
                    y6a.M(obj);
                }
                a9mVar = (a9m) obj;
                if (!(a9mVar instanceof a6m)) {
                    return a9mVar;
                }
                if (!(a9mVar instanceof qbm)) {
                    zzl.b();
                    return null;
                }
                tul tulVar2 = (tul) ((qbm) a9mVar).a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (sul.a[((spl) it.next()).ordinal()] != 1) {
                        zzl.b();
                        return null;
                    }
                    tul tulVar3 = d;
                    if (tulVar3 != null) {
                        tulVar3.g = tulVar2.g;
                    }
                }
                this.getClass();
                return new qbm(d);
            }
        }
        x4mVar = new x4m(this, sq3Var);
        Object obj2 = x4mVar.t;
        lu3 lu3Var2 = lu3.a;
        i = x4mVar.v;
        if (i != 0) {
        }
        a9mVar = (a9m) obj2;
        if (!(a9mVar instanceof a6m)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0050, B:14:0x0056, B:17:0x005a, B:19:0x005e, B:21:0x0074, B:22:0x0079, B:26:0x0036), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0050, B:14:0x0056, B:17:0x005a, B:19:0x005e, B:21:0x0074, B:22:0x0079, B:26:0x0036), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        d8m d8mVar;
        int i;
        a9m a9mVar;
        try {
            if (sq3Var instanceof d8m) {
                d8mVar = (d8m) sq3Var;
                int i2 = d8mVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    d8mVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = d8mVar.s;
                    lu3 lu3Var = lu3.a;
                    i = d8mVar.u;
                    if (i != 0) {
                        y6a.M(obj);
                        ram ramVar = new ram(null);
                        d8mVar.r = this;
                        d8mVar.u = 1;
                        hs4 hs4Var = z45.a;
                        obj = xw3.R(hq4.c, new xsl(false, ramVar, null), d8mVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = d8mVar.r;
                        y6a.M(obj);
                    }
                    a9mVar = (a9m) obj;
                    if (!(a9mVar instanceof a6m)) {
                        evl.m(this);
                        return a9mVar;
                    }
                    if (!(a9mVar instanceof qbm)) {
                        throw new ndd();
                    }
                    c = System.currentTimeMillis();
                    return new qbm(b2m.a((AppConfigurationsDto) ((qbm) a9mVar).a));
                }
            }
            if (i != 0) {
            }
            a9mVar = (a9m) obj;
            if (!(a9mVar instanceof a6m)) {
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return new bx0(null, null, null, 7, null);
        }
        d8mVar = new d8m(this, sq3Var);
        Object obj2 = d8mVar.s;
        lu3 lu3Var2 = lu3.a;
        i = d8mVar.u;
    }
}
