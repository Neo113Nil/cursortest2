package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wdm {
    public static final wdm a = new wdm();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final j2d c = new j2d();

    static {
        evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new wtl(null), 1, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:23|24))(4:25|26|27|(6:29|30|31|(2:33|(1:36)(4:35|13|14|15))|16|17)(5:37|31|(0)|16|17)))(1:39))(2:48|(1:51)(1:50))|40|(4:44|(2:46|47)|27|(0)(0))|30|31|(0)|16|17))|57|6|7|(0)(0)|40|(5:42|44|(0)|27|(0)(0))|30|31|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0045, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a6, code lost:
    
        if ((r9 instanceof defpackage.yga) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
    
        r2 = new com.blaze.blazesdk.shared.results.r0();
        r2.f = r9;
        defpackage.j1m.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b3, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r9, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #1 {Exception -> 0x0045, blocks: (B:26:0x0041, B:27:0x0094, B:37:0x0099, B:40:0x006d, B:42:0x007c, B:44:0x0082), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(sq3 sq3Var) {
        r8m r8mVar;
        Object obj;
        lu3 lu3Var;
        int i;
        Object obj2;
        Map map;
        Map map2;
        h2d h2dVar;
        vnm vnmVar;
        String str;
        e5f J;
        ye4 a2;
        z88 data;
        String str2;
        if (sq3Var instanceof r8m) {
            r8mVar = (r8m) sq3Var;
            int i2 = r8mVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r8mVar.u = i2 - Integer.MIN_VALUE;
                obj = r8mVar.t;
                lu3Var = lu3.a;
                i = r8mVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    vnm vnmVar2 = vnm.a;
                    r8mVar.r = vnmVar2;
                    r8mVar.s = "blaze_data_store_sdk_experiments";
                    r8mVar.u = 1;
                    if (vnmVar2.c(r8mVar) == lu3Var) {
                        return lu3Var;
                    }
                    vnmVar = vnmVar2;
                    str = "blaze_data_store_sdk_experiments";
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar = (h2d) r8mVar.s;
                            map2 = (Map) r8mVar.r;
                            y6a.M(obj);
                            try {
                                LinkedHashMap linkedHashMap = b;
                                linkedHashMap.clear();
                                linkedHashMap.putAll(map2);
                                Unit unit = Unit.a;
                                return Unit.a;
                            } finally {
                                h2dVar.f(null);
                            }
                        }
                        vnmVar = (vnm) r8mVar.r;
                        y6a.M(obj);
                        str2 = (String) obj;
                        if (str2 != null) {
                            obj2 = vnm.b(vnmVar).fromJson(str2, (Class<Object>) Map.class);
                            map = (Map) obj2;
                            if (map != null) {
                            }
                            return Unit.a;
                        }
                        obj2 = null;
                        map = (Map) obj2;
                        if (map != null) {
                            r8mVar.r = map;
                            j2d j2dVar = c;
                            r8mVar.s = j2dVar;
                            r8mVar.u = 3;
                            if (j2dVar.e(r8mVar) == lu3Var) {
                                return lu3Var;
                            }
                            map2 = map;
                            h2dVar = j2dVar;
                            LinkedHashMap linkedHashMap2 = b;
                            linkedHashMap2.clear();
                            linkedHashMap2.putAll(map2);
                            Unit unit2 = Unit.a;
                        }
                        return Unit.a;
                    }
                    String str3 = (String) r8mVar.s;
                    vnm vnmVar3 = (vnm) r8mVar.r;
                    y6a.M(obj);
                    str = str3;
                    vnmVar = vnmVar3;
                }
                J = f6a.J(str);
                vnm vnmVar4 = vnm.a;
                vnmVar.getClass();
                a2 = vnm.a();
                if (a2 != null && (data = a2.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    r8mVar.r = vnmVar;
                    r8mVar.s = null;
                    r8mVar.u = 2;
                    obj = rd0.y(vdmVar, r8mVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    str2 = (String) obj;
                    if (str2 != null) {
                    }
                }
                obj2 = null;
                map = (Map) obj2;
                if (map != null) {
                }
                return Unit.a;
            }
        }
        r8mVar = new r8m(sq3Var);
        obj = r8mVar.t;
        lu3Var = lu3.a;
        i = r8mVar.u;
        if (i != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar42 = vnm.a;
        vnmVar.getClass();
        a2 = vnm.a();
        if (a2 != null) {
            vdm vdmVar2 = new vdm(data, J);
            r8mVar.r = vnmVar;
            r8mVar.s = null;
            r8mVar.u = 2;
            obj = rd0.y(vdmVar2, r8mVar);
            if (obj == lu3Var) {
            }
            str2 = (String) obj;
            if (str2 != null) {
            }
        }
        obj2 = null;
        map = (Map) obj2;
        if (map != null) {
        }
        return Unit.a;
    }

    public static boolean c(List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((mql) it.next()).a);
        }
        Set W0 = CollectionsKt.W0(arrayList);
        LinkedHashMap linkedHashMap = b;
        Iterator it2 = y9h.e(linkedHashMap.keySet(), W0).iterator();
        boolean z = false;
        while (it2.hasNext()) {
            linkedHashMap.remove((String) it2.next());
            z = true;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            mql mqlVar = (mql) it3.next();
            String str = mqlVar.a;
            Map map = mqlVar.c;
            if (!linkedHashMap.containsKey(str)) {
                int size = linkedHashMap.size();
                double J0 = CollectionsKt.J0(map.values());
                glf.a.getClass();
                double nextDouble = glf.b.j().nextDouble() * J0;
                Iterator it4 = map.entrySet().iterator();
                double d = 0.0d;
                while (true) {
                    if (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        String str2 = (String) entry.getKey();
                        d += ((Number) entry.getValue()).doubleValue();
                        if (nextDouble < d) {
                            linkedHashMap.put(str, str2);
                            break;
                        }
                    } else {
                        String str3 = (String) CollectionsKt.Z(map.keySet());
                        if (str3 != null) {
                            linkedHashMap.put(str, str3);
                        }
                    }
                }
                if (linkedHashMap.size() > size) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(6:21|22|(3:24|(1:26)(1:30)|(2:28|29))|14|15|16))(3:31|32|33))(3:34|(1:40)(1:38)|29)|42|43|44))|45|6|7|(0)(0)|42|43|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        if (r9 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (d(r0) == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [wdm] */
    /* JADX WARN: Type inference failed for: r7v1, types: [h2d] */
    /* JADX WARN: Type inference failed for: r7v10, types: [h2d] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, sq3 sq3Var) {
        jbm jbmVar;
        int i;
        if (sq3Var instanceof jbm) {
            jbmVar = (jbm) sq3Var;
            int i2 = jbmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jbmVar.v = i2 - Integer.MIN_VALUE;
                Object obj = jbmVar.t;
                lu3 lu3Var = lu3.a;
                i = jbmVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    if (list == null || list.isEmpty()) {
                        jbmVar.v = 1;
                    } else {
                        jbmVar.r = list;
                        j2d j2dVar = c;
                        jbmVar.s = j2dVar;
                        jbmVar.v = 2;
                        Object e = j2dVar.e(jbmVar);
                        this = j2dVar;
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    y6a.M(obj);
                    return Unit.a;
                }
                if (i != 2) {
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (h2d) jbmVar.r;
                    y6a.M(obj);
                    return Unit.a;
                }
                j2d j2dVar2 = jbmVar.s;
                list = (List) jbmVar.r;
                y6a.M(obj);
                this = j2dVar2;
                if (c(list)) {
                    jbmVar.r = this;
                    jbmVar.s = null;
                    jbmVar.v = 3;
                    Object d = vnm.a.d("blaze_data_store_sdk_experiments", b, jbmVar);
                    if (d != lu3Var) {
                        d = Unit.a;
                    }
                    if (d == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
                this.f(null);
            }
        }
        jbmVar = new jbm(this, sq3Var);
        Object obj2 = jbmVar.t;
        lu3 lu3Var2 = lu3.a;
        i = jbmVar.v;
        if (i != 0) {
        }
        this.f(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (r6.e(r0) == r7) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:25:0x004c, B:31:0x0060), top: B:24:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r1v3, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        eyl eylVar;
        lu3 lu3Var;
        int i;
        j2d j2dVar;
        h2d h2dVar;
        Throwable th;
        Object d;
        try {
            if (sq3Var instanceof eyl) {
                eylVar = (eyl) sq3Var;
                int i2 = eylVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eylVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = eylVar.s;
                    lu3Var = lu3.a;
                    i = eylVar.u;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = c;
                        eylVar.r = j2dVar;
                        eylVar.u = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar = eylVar.r;
                            try {
                                y6a.M(obj);
                                Unit unit = Unit.a;
                                h2dVar.f(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        ?? r1 = eylVar.r;
                        y6a.M(obj);
                        j2dVar = r1;
                    }
                    LinkedHashMap linkedHashMap = b;
                    linkedHashMap.clear();
                    eylVar.r = j2dVar;
                    eylVar.u = 2;
                    d = vnm.a.d("blaze_data_store_sdk_experiments", linkedHashMap, eylVar);
                    if (d == lu3Var) {
                        d = Unit.a;
                    }
                    if (d != lu3Var) {
                        h2dVar = j2dVar;
                        Unit unit2 = Unit.a;
                        h2dVar.f(null);
                        return unit2;
                    }
                    return lu3Var;
                }
            }
            LinkedHashMap linkedHashMap2 = b;
            linkedHashMap2.clear();
            eylVar.r = j2dVar;
            eylVar.u = 2;
            d = vnm.a.d("blaze_data_store_sdk_experiments", linkedHashMap2, eylVar);
            if (d == lu3Var) {
            }
            if (d != lu3Var) {
            }
            return lu3Var;
        } catch (Throwable th3) {
            h2dVar = j2dVar;
            th = th3;
            h2dVar.f(null);
            throw th;
        }
        eylVar = new eyl(this, sq3Var);
        Object obj2 = eylVar.s;
        lu3Var = lu3.a;
        i = eylVar.u;
        if (i != 0) {
        }
    }
}
