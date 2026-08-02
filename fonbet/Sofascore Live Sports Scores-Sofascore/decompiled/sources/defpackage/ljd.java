package defpackage;

import com.blaze.blazesdk.analytics.AnalyticsDoNotTrackLocal;
import com.blaze.blazesdk.analytics.AnalyticsTrackLocal;
import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.logger.AnalyticsLogId;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ljd {
    public static final ljd a = new ljd();
    public static final lxm b;
    public static final m4m c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final qf5 g;

    static {
        String str;
        Integer intOrNull;
        String str2;
        Integer intOrNull2;
        String str3;
        Integer intOrNull3;
        BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
        BlazeDatabase instance = companion.instance();
        b = instance != null ? instance.getAnalyticsTrackDao() : null;
        BlazeDatabase instance2 = companion.instance();
        c = instance2 != null ? instance2.getAnalyticsDoNotTrackDao() : null;
        tul tulVar = jdm.d;
        uul uulVar = tulVar != null ? tulVar.a : null;
        d = (uulVar == null || (str3 = uulVar.c) == null || (intOrNull3 = StringsKt.toIntOrNull(str3)) == null) ? 1 : intOrNull3.intValue();
        tul tulVar2 = jdm.d;
        uul uulVar2 = tulVar2 != null ? tulVar2.a : null;
        e = (uulVar2 == null || (str2 = uulVar2.b) == null || (intOrNull2 = StringsKt.toIntOrNull(str2)) == null) ? 80 : intOrNull2.intValue();
        tul tulVar3 = jdm.d;
        uul uulVar3 = tulVar3 != null ? tulVar3.a : null;
        f = (uulVar3 == null || (str = uulVar3.a) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 3 : intOrNull.intValue();
        g = new qf5(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r7.Z(r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r8.Z(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ku3 ku3Var, sq3 sq3Var) {
        bm6 bm6Var;
        int i;
        g9i L;
        if (sq3Var instanceof bm6) {
            bm6Var = (bm6) sq3Var;
            int i2 = bm6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bm6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = bm6Var.s;
                lu3 lu3Var = lu3.a;
                i = bm6Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    if (BlazeSDK.INSTANCE.getDisableAnalytics()) {
                        return Unit.a;
                    }
                    g9i L2 = xw3.L(ku3Var, null, null, new r59(null), 3);
                    L = xw3.L(ku3Var, null, null, new hu8(null), 3);
                    bm6Var.r = L;
                    bm6Var.t = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    L = bm6Var.r;
                    y6a.M(obj);
                }
                bm6Var.r = null;
                bm6Var.t = 2;
            }
        }
        bm6Var = new bm6(sq3Var);
        Object obj2 = bm6Var.s;
        lu3 lu3Var2 = lu3.a;
        i = bm6Var.t;
        if (i != 0) {
        }
        bm6Var.r = null;
        bm6Var.t = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x009f, code lost:
    
        if (r5 == r2) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Type inference failed for: r3v13, types: [a9m] */
    /* JADX WARN: Type inference failed for: r3v19, types: [qbm] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [asf] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, boolean z, sq3 sq3Var) {
        hnb hnbVar;
        ?? r5;
        m4m m4mVar;
        List list;
        asf asfVar;
        a6m a6mVar;
        asf asfVar2;
        asf asfVar3;
        m4m m4mVar2;
        boolean z2;
        Object a2;
        List list2;
        m4m m4mVar3;
        asf asfVar4;
        boolean z3;
        m4m m4mVar4;
        int i2;
        ljd ljdVar = this;
        if (!(sq3Var instanceof hnb) || (r5 = (i2 = (hnbVar = (hnb) sq3Var).y) & Integer.MIN_VALUE) == 0) {
            hnbVar = new hnb(ljdVar, sq3Var);
        } else {
            hnbVar.y = i2 - Integer.MIN_VALUE;
        }
        hnb hnbVar2 = hnbVar;
        Object obj = hnbVar2.w;
        lu3 lu3Var = lu3.a;
        int i3 = hnbVar2.y;
        int i4 = 4;
        ?? r4 = 2;
        try {
        } catch (Throwable th) {
            lwl.b(AnalyticsLogId.DO_NOT_TRACK_LOCAL_STORAGE_DELETION_ERROR, new c10(1, th));
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            a6mVar = i3;
            asfVar = r4;
            list = r5;
            m4mVar = m4mVar4;
        }
        if (i3 == 0) {
            y6a.M(obj);
            m4mVar2 = c;
            if (m4mVar2 == null) {
                return Boolean.FALSE;
            }
            hnbVar2.r = ljdVar;
            hnbVar2.s = m4mVar2;
            z2 = z;
            hnbVar2.v = z2;
            hnbVar2.y = 1;
            a2 = m4mVar2.a(i, hnbVar2);
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    asf asfVar5 = hnbVar2.t;
                    List list3 = (List) hnbVar2.s;
                    m4m m4mVar5 = (m4m) hnbVar2.r;
                    y6a.M(obj);
                    list2 = list3;
                    m4mVar3 = m4mVar5;
                    asfVar4 = asfVar5;
                    ?? r3 = (a9m) obj;
                    z3 = r3 instanceof qbm;
                    a6mVar = r3;
                    asfVar = asfVar4;
                    list = list2;
                    m4mVar = m4mVar3;
                    if (z3) {
                        hnbVar2.r = m4mVar3;
                        hnbVar2.s = list2;
                        hnbVar2.t = asfVar4;
                        hnbVar2.u = (qbm) r3;
                        hnbVar2.y = 3;
                        Object c2 = m4mVar3.c(list2, hnbVar2);
                        i3 = r3;
                        r4 = asfVar4;
                        r5 = list2;
                        m4mVar4 = m4mVar3;
                        if (c2 == lu3Var) {
                            return lu3Var;
                        }
                        r4.a = true;
                        a6mVar = i3;
                        asfVar = r4;
                        list = r5;
                        m4mVar = m4mVar4;
                    }
                    asfVar3 = asfVar;
                    if (a6mVar instanceof a6m) {
                    }
                    return Boolean.valueOf(asfVar3.a);
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    asfVar2 = (asf) hnbVar2.r;
                    try {
                        y6a.M(obj);
                        asfVar2.a = true;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            lwl.b(AnalyticsLogId.DO_NOT_TRACK_LOCAL_STORAGE_DELETION_ERROR, new c10(1, th));
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                            asfVar3 = asfVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            asfVar = asfVar2;
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                            asfVar3 = asfVar;
                            return Boolean.valueOf(asfVar3.a);
                        }
                        return Boolean.valueOf(asfVar3.a);
                    }
                    asfVar3 = asfVar2;
                    return Boolean.valueOf(asfVar3.a);
                }
                ?? r32 = hnbVar2.u;
                asf asfVar6 = hnbVar2.t;
                List list4 = (List) hnbVar2.s;
                m4m m4mVar6 = (m4m) hnbVar2.r;
                y6a.M(obj);
                i3 = r32;
                r4 = asfVar6;
                r5 = list4;
                m4mVar4 = m4mVar6;
                r4.a = true;
                a6mVar = i3;
                asfVar = r4;
                list = r5;
                m4mVar = m4mVar4;
                asfVar3 = asfVar;
                if (a6mVar instanceof a6m) {
                    a6m a6mVar2 = a6mVar;
                    try {
                        if (a6mVar2 instanceof mc2) {
                            lwl.b(AnalyticsLogId.DO_NOT_TRACK_UNPROCESSABLE_ENTITY, new djd((mc2) a6mVar2, 0));
                            try {
                                hnbVar2.r = asfVar;
                                hnbVar2.s = a6mVar;
                                hnbVar2.t = null;
                                hnbVar2.u = null;
                                hnbVar2.y = 4;
                            } catch (Throwable th4) {
                                th = th4;
                                asfVar2 = asfVar;
                                lwl.b(AnalyticsLogId.DO_NOT_TRACK_LOCAL_STORAGE_DELETION_ERROR, new c10(1, th));
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                asfVar3 = asfVar2;
                                return Boolean.valueOf(asfVar3.a);
                            }
                            if (m4mVar.c(list, hnbVar2) != lu3Var) {
                                asfVar2 = asfVar;
                                asfVar2.a = true;
                                asfVar3 = asfVar2;
                            }
                            return lu3Var;
                        }
                        lwl.b(AnalyticsLogId.DO_NOT_TRACK_BULK_REMOTE_ERROR, new ejd(a6mVar2, 0));
                        asfVar3 = asfVar;
                    } catch (Throwable th5) {
                        th = th5;
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        asfVar3 = asfVar;
                        return Boolean.valueOf(asfVar3.a);
                    }
                }
                return Boolean.valueOf(asfVar3.a);
            }
            boolean z4 = hnbVar2.v;
            m4mVar2 = (m4m) hnbVar2.s;
            ljd ljdVar2 = (ljd) hnbVar2.r;
            y6a.M(obj);
            z2 = z4;
            ljdVar = ljdVar2;
            a2 = obj;
        }
        m4m m4mVar7 = m4mVar2;
        List list5 = (List) a2;
        if (list5.isEmpty()) {
            return Boolean.FALSE;
        }
        if (z2) {
            AnalyticsLogId analyticsLogId = AnalyticsLogId.FLUSH_EVENTS;
            el2 el2Var = new el2(list5, i4);
            analyticsLogId.getClass();
            lwl.a(analyticsLogId, vul.INFO, el2Var);
        }
        ArrayList arrayList = new ArrayList(k13.r(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(new Long(((AnalyticsDoNotTrackLocal) it.next()).getId()));
        }
        ArrayList arrayList2 = new ArrayList(k13.r(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList2.add((iga) new Gson().fromJson(((AnalyticsDoNotTrackLocal) it2.next()).getRequest(), iga.class));
        }
        asf asfVar7 = new asf();
        ljdVar.getClass();
        hnbVar2.r = m4mVar7;
        hnbVar2.s = arrayList;
        hnbVar2.t = asfVar7;
        hnbVar2.y = 2;
        Object safeApiCall$default = rwl.safeApiCall$default(rwl.a, false, new vqm(arrayList2, null), hnbVar2, 1, null);
        if (safeApiCall$default != lu3Var) {
            list2 = arrayList;
            m4mVar3 = m4mVar7;
            asfVar4 = asfVar7;
            obj = safeApiCall$default;
            ?? r33 = (a9m) obj;
            z3 = r33 instanceof qbm;
            a6mVar = r33;
            asfVar = asfVar4;
            list = list2;
            m4mVar = m4mVar3;
            if (z3) {
            }
            asfVar3 = asfVar;
            if (a6mVar instanceof a6m) {
            }
            return Boolean.valueOf(asfVar3.a);
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x009f, code lost:
    
        if (r5 == r2) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Type inference failed for: r3v13, types: [a9m] */
    /* JADX WARN: Type inference failed for: r3v19, types: [qbm] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [asf] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, boolean z, sq3 sq3Var) {
        s2d s2dVar;
        ?? r5;
        lxm lxmVar;
        List list;
        asf asfVar;
        a6m a6mVar;
        asf asfVar2;
        asf asfVar3;
        lxm lxmVar2;
        boolean z2;
        Object a2;
        List list2;
        lxm lxmVar3;
        asf asfVar4;
        boolean z3;
        lxm lxmVar4;
        int i2;
        ljd ljdVar = this;
        if (!(sq3Var instanceof s2d) || (r5 = (i2 = (s2dVar = (s2d) sq3Var).y) & Integer.MIN_VALUE) == 0) {
            s2dVar = new s2d(ljdVar, sq3Var);
        } else {
            s2dVar.y = i2 - Integer.MIN_VALUE;
        }
        s2d s2dVar2 = s2dVar;
        Object obj = s2dVar2.w;
        lu3 lu3Var = lu3.a;
        int i3 = s2dVar2.y;
        int i4 = 3;
        ?? r4 = 2;
        try {
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            a6mVar = i3;
            asfVar = r4;
            list = r5;
            lxmVar = lxmVar4;
        }
        if (i3 == 0) {
            y6a.M(obj);
            lxmVar2 = b;
            if (lxmVar2 == null) {
                return Boolean.FALSE;
            }
            s2dVar2.r = ljdVar;
            s2dVar2.s = lxmVar2;
            z2 = z;
            s2dVar2.v = z2;
            s2dVar2.y = 1;
            a2 = lxmVar2.a(i, s2dVar2);
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    asf asfVar5 = s2dVar2.t;
                    List list3 = (List) s2dVar2.s;
                    lxm lxmVar5 = (lxm) s2dVar2.r;
                    y6a.M(obj);
                    list2 = list3;
                    lxmVar3 = lxmVar5;
                    asfVar4 = asfVar5;
                    ?? r3 = (a9m) obj;
                    z3 = r3 instanceof qbm;
                    a6mVar = r3;
                    asfVar = asfVar4;
                    list = list2;
                    lxmVar = lxmVar3;
                    if (z3) {
                        s2dVar2.r = lxmVar3;
                        s2dVar2.s = list2;
                        s2dVar2.t = asfVar4;
                        s2dVar2.u = (qbm) r3;
                        s2dVar2.y = 3;
                        Object c2 = lxmVar3.c(list2, s2dVar2);
                        i3 = r3;
                        r4 = asfVar4;
                        r5 = list2;
                        lxmVar4 = lxmVar3;
                        if (c2 == lu3Var) {
                            return lu3Var;
                        }
                        r4.a = true;
                        a6mVar = i3;
                        asfVar = r4;
                        list = r5;
                        lxmVar = lxmVar4;
                    }
                    asfVar3 = asfVar;
                    if (a6mVar instanceof a6m) {
                    }
                    return Boolean.valueOf(asfVar3.a);
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    asfVar2 = (asf) s2dVar2.r;
                    try {
                        y6a.M(obj);
                        asfVar2.a = true;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            lwl.b(AnalyticsLogId.TRACK_LOCAL_STORAGE_DELETION_ERROR, new c10(1, th));
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                            asfVar3 = asfVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            asfVar = asfVar2;
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                            asfVar3 = asfVar;
                            return Boolean.valueOf(asfVar3.a);
                        }
                        return Boolean.valueOf(asfVar3.a);
                    }
                    asfVar3 = asfVar2;
                    return Boolean.valueOf(asfVar3.a);
                }
                ?? r32 = s2dVar2.u;
                asf asfVar6 = s2dVar2.t;
                List list4 = (List) s2dVar2.s;
                lxm lxmVar6 = (lxm) s2dVar2.r;
                y6a.M(obj);
                i3 = r32;
                r4 = asfVar6;
                r5 = list4;
                lxmVar4 = lxmVar6;
                r4.a = true;
                a6mVar = i3;
                asfVar = r4;
                list = r5;
                lxmVar = lxmVar4;
                asfVar3 = asfVar;
                if (a6mVar instanceof a6m) {
                    a6m a6mVar2 = a6mVar;
                    try {
                        if (a6mVar2 instanceof mc2) {
                            lwl.b(AnalyticsLogId.TRACK_UNPROCESSABLE_ENTITY, new djd((mc2) a6mVar2, 0));
                            try {
                                s2dVar2.r = asfVar;
                                s2dVar2.s = a6mVar;
                                s2dVar2.t = null;
                                s2dVar2.u = null;
                                s2dVar2.y = 4;
                            } catch (Throwable th4) {
                                th = th4;
                                asfVar2 = asfVar;
                                lwl.b(AnalyticsLogId.TRACK_LOCAL_STORAGE_DELETION_ERROR, new c10(1, th));
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                                asfVar3 = asfVar2;
                                return Boolean.valueOf(asfVar3.a);
                            }
                            if (lxmVar.c(list, s2dVar2) != lu3Var) {
                                asfVar2 = asfVar;
                                asfVar2.a = true;
                                asfVar3 = asfVar2;
                            }
                            return lu3Var;
                        }
                        lwl.b(AnalyticsLogId.TRACK_BULK_REMOTE_ERROR, new ejd(a6mVar2, 0));
                        asfVar3 = asfVar;
                    } catch (Throwable th5) {
                        th = th5;
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        asfVar3 = asfVar;
                        return Boolean.valueOf(asfVar3.a);
                    }
                }
                return Boolean.valueOf(asfVar3.a);
            }
            boolean z4 = s2dVar2.v;
            lxmVar2 = (lxm) s2dVar2.s;
            ljd ljdVar2 = (ljd) s2dVar2.r;
            y6a.M(obj);
            z2 = z4;
            ljdVar = ljdVar2;
            a2 = obj;
        }
        lxm lxmVar7 = lxmVar2;
        List list5 = (List) a2;
        if (list5.isEmpty()) {
            return Boolean.FALSE;
        }
        if (z2) {
            AnalyticsLogId analyticsLogId = AnalyticsLogId.FLUSH_EVENTS;
            el2 el2Var = new el2(list5, i4);
            analyticsLogId.getClass();
            lwl.a(analyticsLogId, vul.INFO, el2Var);
        }
        ArrayList arrayList = new ArrayList(k13.r(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(new Long(((AnalyticsTrackLocal) it.next()).getId()));
        }
        ArrayList arrayList2 = new ArrayList(k13.r(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList2.add((iga) new Gson().fromJson(((AnalyticsTrackLocal) it2.next()).getRequest(), iga.class));
        }
        asf asfVar7 = new asf();
        ljdVar.getClass();
        s2dVar2.r = lxmVar7;
        s2dVar2.s = arrayList;
        s2dVar2.t = asfVar7;
        s2dVar2.y = 2;
        Object safeApiCall$default = rwl.safeApiCall$default(rwl.a, false, new jvm(arrayList2, null), s2dVar2, 1, null);
        if (safeApiCall$default != lu3Var) {
            list2 = arrayList;
            lxmVar3 = lxmVar7;
            asfVar4 = asfVar7;
            obj = safeApiCall$default;
            ?? r33 = (a9m) obj;
            z3 = r33 instanceof qbm;
            a6mVar = r33;
            asfVar = asfVar4;
            list = list2;
            lxmVar = lxmVar3;
            if (z3) {
            }
            asfVar3 = asfVar;
            if (a6mVar instanceof a6m) {
            }
            return Boolean.valueOf(asfVar3.a);
        }
        return lu3Var;
    }
}
