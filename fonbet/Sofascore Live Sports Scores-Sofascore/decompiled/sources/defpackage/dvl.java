package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dvl {
    public static final dvl a = new dvl();

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(8:11|12|13|(1:15)(1:23)|16|(1:18)(1:22)|19|20)(2:25|26))(1:27))(1:36)|28|(3:32|(3:35|13|(0)(0))|34)|16|(0)(0)|19|20))|43|6|7|(0)(0)|28|(4:30|32|(0)|34)|16|(0)(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        if (r6.c(r0) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if ((r6 instanceof defpackage.yga) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r7 = new com.blaze.blazesdk.shared.results.r0();
        r7.f = r6;
        defpackage.j1m.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:13:0x007b, B:23:0x0080, B:28:0x0052, B:30:0x0061, B:32:0x0067), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        xql xqlVar;
        lu3 lu3Var;
        int i;
        vnm vnmVar;
        String str;
        e5f J;
        ye4 a2;
        z88 data;
        Object y;
        vnm vnmVar2;
        String str2;
        if (sq3Var instanceof xql) {
            xqlVar = (xql) sq3Var;
            int i2 = xqlVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xqlVar.v = i2 - Integer.MIN_VALUE;
                Object obj = xqlVar.t;
                lu3Var = lu3.a;
                i = xqlVar.v;
                Object obj2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    vnmVar = vnm.a;
                    xqlVar.r = vnmVar;
                    str = "blaze_data_store_disable_app_activity_events";
                    xqlVar.s = "blaze_data_store_disable_app_activity_events";
                    xqlVar.v = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vnmVar2 = xqlVar.r;
                        y6a.M(obj);
                        str2 = (String) obj;
                        if (str2 == null) {
                            obj2 = vnm.b(vnmVar2).fromJson(str2, (Class<Object>) Boolean.class);
                        }
                        Boolean bool = (Boolean) obj2;
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    }
                    str = xqlVar.s;
                    vnm vnmVar3 = xqlVar.r;
                    y6a.M(obj);
                    vnmVar = vnmVar3;
                }
                J = f6a.J(str);
                vnm vnmVar4 = vnm.a;
                vnmVar.getClass();
                a2 = vnm.a();
                if (a2 != null && (data = a2.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    xqlVar.r = vnmVar;
                    xqlVar.s = null;
                    xqlVar.v = 2;
                    y = rd0.y(vdmVar, xqlVar);
                    if (y != lu3Var) {
                        vnmVar2 = vnmVar;
                        obj = y;
                        str2 = (String) obj;
                        if (str2 == null) {
                        }
                    }
                    return lu3Var;
                }
                Boolean bool2 = (Boolean) obj2;
                return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            }
        }
        xqlVar = new xql(this, sq3Var);
        Object obj3 = xqlVar.t;
        lu3Var = lu3.a;
        i = xqlVar.v;
        Object obj22 = null;
        if (i != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar42 = vnm.a;
        vnmVar.getClass();
        a2 = vnm.a();
        if (a2 != null) {
            vdm vdmVar2 = new vdm(data, J);
            xqlVar.r = vnmVar;
            xqlVar.s = null;
            xqlVar.v = 2;
            y = rd0.y(vdmVar2, xqlVar);
            if (y != lu3Var) {
            }
            return lu3Var;
        }
        Boolean bool22 = (Boolean) obj22;
        return Boolean.valueOf(bool22 != null ? bool22.booleanValue() : false);
    }
}
