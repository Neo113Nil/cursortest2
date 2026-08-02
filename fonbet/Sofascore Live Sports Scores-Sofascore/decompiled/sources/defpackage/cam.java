package defpackage;

import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.logger.LoggerLogId;
import com.blaze.blazesdk.logger.local.BlazeLogLocal;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cam {
    public static final cam a = new cam();
    public static final psl b;
    public static final k7m c;

    static {
        BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
        b = instance != null ? instance.getLoggerDao() : null;
        c = new k7m(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0195, code lost:
    
        if (r8.b(r0, r2, true, r4) == r13) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015c, code lost:
    
        if (r8.b(r0, r2, true, r4) == r13) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0170, code lost:
    
        if (r8.b(r0, r2, false, r4) == r13) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e3, code lost:
    
        if (r8.b(r11, r0, false, r4) == r13) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0082, code lost:
    
        if (r12 == r13) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        owl owlVar;
        int i;
        psl pslVar;
        psl pslVar2;
        List list;
        a9m a9mVar;
        if (sq3Var instanceof owl) {
            owlVar = (owl) sq3Var;
            int i2 = owlVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                owlVar.w = i2 - Integer.MIN_VALUE;
                owl owlVar2 = owlVar;
                Object obj = owlVar2.u;
                lu3 lu3Var = lu3.a;
                i = owlVar2.w;
                cam camVar = a;
                switch (i) {
                    case 0:
                        y6a.M(obj);
                        pslVar = b;
                        if (pslVar != null) {
                            tul tulVar = jdm.d;
                            e8m e8mVar = tulVar != null ? tulVar.g : null;
                            int i3 = e8mVar != null ? e8mVar.c : 80;
                            owlVar2.r = pslVar;
                            owlVar2.w = 1;
                            obj = pslVar.a(i3, owlVar2);
                            break;
                        } else {
                            return Unit.a;
                        }
                    case 1:
                        pslVar = (psl) owlVar2.r;
                        y6a.M(obj);
                        List list2 = (List) obj;
                        int size = list2.size();
                        tul tulVar2 = jdm.d;
                        e8m e8mVar2 = tulVar2 != null ? tulVar2.g : null;
                        if (size < (e8mVar2 != null ? e8mVar2.d : 1) || list2.isEmpty()) {
                            obj = null;
                        }
                        List list3 = (List) obj;
                        if (list3 != null) {
                            ArrayList arrayList = new ArrayList(k13.r(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((BlazeLogLocal) it.next()).getId());
                            }
                            tul tulVar3 = jdm.d;
                            e8m e8mVar3 = tulVar3 != null ? tulVar3.g : null;
                            if (e8mVar3 != null && !e8mVar3.a) {
                                owlVar2.r = null;
                                owlVar2.w = 2;
                                break;
                            } else {
                                ArrayList arrayList2 = new ArrayList(k13.r(list3, 10));
                                Iterator it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add((iga) new Gson().fromJson(((BlazeLogLocal) it2.next()).getRequest(), iga.class));
                                }
                                owlVar2.r = pslVar;
                                owlVar2.s = arrayList;
                                owlVar2.w = 3;
                                Objects.toString(arrayList2);
                                obj = rwl.safeApiCall$default(rwl.a, false, new r0m(arrayList2, null), owlVar2, 1, null);
                                if (obj != lu3Var) {
                                    pslVar2 = pslVar;
                                    list = arrayList;
                                    a9mVar = (a9m) obj;
                                    if (a9mVar instanceof a6m) {
                                        a6m a6mVar = (a6m) a9mVar;
                                        if (a6mVar instanceof mc2) {
                                            lwl.b(LoggerLogId.UNPROCESSABLE_ENTITY, new djd((mc2) a6mVar, 1));
                                            owlVar2.r = pslVar2;
                                            owlVar2.s = a9mVar;
                                            owlVar2.t = list;
                                            owlVar2.w = 4;
                                            break;
                                        } else if (a6mVar instanceof hsm) {
                                            owlVar2.r = pslVar2;
                                            owlVar2.s = a9mVar;
                                            owlVar2.t = list;
                                            owlVar2.w = 5;
                                            break;
                                        } else {
                                            lwl.b(LoggerLogId.BULK_REMOTE_ERROR, new ejd(a6mVar, 1));
                                        }
                                    }
                                    if (a9mVar instanceof qbm) {
                                        owlVar2.r = a9mVar;
                                        owlVar2.s = null;
                                        owlVar2.t = null;
                                        owlVar2.w = 6;
                                        break;
                                    }
                                }
                            }
                            return lu3Var;
                        }
                        return Unit.a;
                    case 2:
                        y6a.M(obj);
                        return Unit.a;
                    case 3:
                        list = (List) owlVar2.s;
                        psl pslVar3 = (psl) owlVar2.r;
                        y6a.M(obj);
                        pslVar2 = pslVar3;
                        a9mVar = (a9m) obj;
                        if (a9mVar instanceof a6m) {
                        }
                        if (a9mVar instanceof qbm) {
                        }
                        return Unit.a;
                    case 4:
                    case 5:
                        list = owlVar2.t;
                        a9mVar = (a9m) owlVar2.s;
                        pslVar2 = (psl) owlVar2.r;
                        y6a.M(obj);
                        if (a9mVar instanceof qbm) {
                        }
                        return Unit.a;
                    case 6:
                        y6a.M(obj);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        owlVar = new owl(this, sq3Var);
        owl owlVar22 = owlVar;
        Object obj2 = owlVar22.u;
        lu3 lu3Var2 = lu3.a;
        i = owlVar22.w;
        cam camVar2 = a;
        switch (i) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|13|(2:(1:16)|17)|18|19))|30|6|7|(0)(0)|12|13|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        r5 = defpackage.w2g.b;
        r4 = new defpackage.u2g(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, psl pslVar, boolean z, sq3 sq3Var) {
        rsl rslVar;
        int i;
        Throwable a2;
        if (sq3Var instanceof rsl) {
            rslVar = (rsl) sq3Var;
            int i2 = rslVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rslVar.u = i2 - Integer.MIN_VALUE;
                Object obj = rslVar.s;
                lu3 lu3Var = lu3.a;
                i = rslVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    rslVar.r = z;
                    rslVar.u = 1;
                    if (pslVar.b(list, rslVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = rslVar.r;
                    y6a.M(obj);
                }
                Object u2gVar = Unit.a;
                p2g p2gVar2 = w2g.b;
                a2 = w2g.a(u2gVar);
                if (a2 != null) {
                    if (z) {
                        lwl.b(LoggerLogId.LOCAL_STORAGE_DELETION_ERROR, new c10(2, a2));
                    }
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(a2, null);
                }
                return Unit.a;
            }
        }
        rslVar = new rsl(this, sq3Var);
        Object obj2 = rslVar.s;
        lu3 lu3Var2 = lu3.a;
        i = rslVar.u;
        if (i != 0) {
        }
        Object u2gVar2 = Unit.a;
        p2g p2gVar22 = w2g.b;
        a2 = w2g.a(u2gVar2);
        if (a2 != null) {
        }
        return Unit.a;
    }
}
