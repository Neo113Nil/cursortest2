package defpackage;

import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.logger.local.BlazeLogLocal;
import com.blaze.blazesdk.logger.models.BlazeLog;
import com.google.gson.Gson;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g4m {
    public static final g4m a = new g4m();

    public static Object b(BlazeLog blazeLog, boolean z, sq3 sq3Var) {
        BlazeLogLocal blazeLogLocal;
        String str;
        BlazeDatabase instance;
        psl loggerDao;
        blazeLog.getClass();
        String q = y6a.q(blazeLog);
        if (q == null) {
            blazeLogLocal = null;
        } else {
            vul level = blazeLog.getLevel();
            Map<String, Object> metadata = blazeLog.getMetadata();
            BlazeLog.INSTANCE.getClass();
            str = BlazeLog.REPORTING_TIMESTAMP;
            Object obj = metadata.get(str);
            blazeLogLocal = new BlazeLogLocal(null, q, level, obj instanceof String ? (String) obj : null, z, blazeLog.getApiSchemeVersion(), 1, null);
        }
        if (blazeLogLocal != null && (instance = BlazeDatabase.INSTANCE.instance()) != null && (loggerDao = instance.getLoggerDao()) != null) {
            Object c = loggerDao.c(new BlazeLogLocal[]{blazeLogLocal}, sq3Var);
            if (c == lu3.a) {
                return c;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (b(r10, true, r4) != r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r9 == r11) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BlazeLog blazeLog, sq3 sq3Var) {
        nwl nwlVar;
        nwl nwlVar2;
        int i;
        a9m a9mVar;
        if (sq3Var instanceof nwl) {
            nwlVar = (nwl) sq3Var;
            int i2 = nwlVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nwlVar.u = i2 - Integer.MIN_VALUE;
                nwlVar2 = nwlVar;
                Object obj = nwlVar2.s;
                lu3 lu3Var = lu3.a;
                i = nwlVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    List c = a.c((iga) new Gson().fromJson(y6a.q(blazeLog), iga.class));
                    nwlVar2.r = blazeLog;
                    nwlVar2.u = 1;
                    Objects.toString(c);
                    obj = rwl.safeApiCall$default(rwl.a, false, new r0m(c, null), nwlVar2, 1, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        return Unit.a;
                    }
                    blazeLog = (BlazeLog) nwlVar2.r;
                    y6a.M(obj);
                }
                a9mVar = (a9m) obj;
                if (a9mVar instanceof qbm) {
                }
                if ((a9mVar instanceof a6m) && !(((a6m) a9mVar) instanceof mc2)) {
                    nwlVar2.r = a9mVar;
                    nwlVar2.u = 2;
                }
                return Unit.a;
            }
        }
        nwlVar = new nwl(this, sq3Var);
        nwlVar2 = nwlVar;
        Object obj2 = nwlVar2.s;
        lu3 lu3Var2 = lu3.a;
        i = nwlVar2.u;
        if (i != 0) {
        }
        a9mVar = (a9m) obj2;
        if (a9mVar instanceof qbm) {
        }
        if (a9mVar instanceof a6m) {
            nwlVar2.r = a9mVar;
            nwlVar2.u = 2;
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:10:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(BlazeLog[] blazeLogArr, sq3 sq3Var) {
        qsl qslVar;
        int i;
        int length;
        BlazeLog[] blazeLogArr2;
        int i2;
        Object b;
        if (sq3Var instanceof qsl) {
            qslVar = (qsl) sq3Var;
            int i3 = qslVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qslVar.w = i3 - Integer.MIN_VALUE;
                Object obj = qslVar.u;
                lu3 lu3Var = lu3.a;
                i = qslVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    length = blazeLogArr.length;
                    blazeLogArr2 = blazeLogArr;
                    i2 = 0;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = qslVar.t;
                    i2 = qslVar.s;
                    BlazeLog[] blazeLogArr3 = qslVar.r;
                    y6a.M(obj);
                    blazeLogArr2 = blazeLogArr3;
                    i2++;
                    if (i2 < length) {
                        BlazeLog blazeLog = blazeLogArr2[i2];
                        qslVar.r = blazeLogArr2;
                        qslVar.s = i2;
                        qslVar.t = length;
                        qslVar.w = 1;
                        tul tulVar = jdm.d;
                        e8m e8mVar = tulVar != null ? tulVar.g : null;
                        vul vulVar = e8mVar != null ? e8mVar.f : null;
                        if (vulVar == null || blazeLog.getLevel().ordinal() < vulVar.ordinal()) {
                            Objects.toString(blazeLog);
                            b = b(blazeLog, false, qslVar);
                            if (b != lu3.a) {
                                b = Unit.a;
                            }
                        } else {
                            b = a.a(blazeLog, qslVar);
                            if (b != lu3.a) {
                                b = Unit.a;
                            }
                        }
                        if (b == lu3Var) {
                            return lu3Var;
                        }
                        i2++;
                        if (i2 < length) {
                            return Unit.a;
                        }
                    }
                }
            }
        }
        qslVar = new qsl(this, sq3Var);
        Object obj2 = qslVar.u;
        lu3 lu3Var2 = lu3.a;
        i = qslVar.w;
        if (i != 0) {
        }
    }
}
