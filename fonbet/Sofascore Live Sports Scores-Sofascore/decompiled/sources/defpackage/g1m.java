package defpackage;

import java.util.UUID;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g1m {
    public static final g1m a = new g1m();

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(4:17|18|19|(5:21|22|23|(2:28|(1:30))|27)(5:31|23|(1:25)|28|(1:27)(0))))(1:33))(3:41|(1:43)|30)|34|(4:38|(2:40|30)|19|(0)(0))|22|23|(0)|28|(0)(0)))|49|6|7|(0)(0)|34|(5:36|38|(0)|19|(0)(0))|22|23|(0)|28|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        if ((r8 instanceof defpackage.yga) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        r1 = new com.blaze.blazesdk.shared.results.r0();
        r1.f = r8;
        defpackage.j1m.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r8, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6 A[PHI: r8
      0x00d6: PHI (r8v7 java.lang.String) = (r8v6 java.lang.String), (r8v4 java.lang.String) binds: [B:29:0x00d3, B:26:0x00bd] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #0 {Exception -> 0x0042, blocks: (B:18:0x003e, B:19:0x008c, B:31:0x0091, B:34:0x0065, B:36:0x0074, B:38:0x007a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        qul qulVar;
        Object obj;
        lu3 lu3Var;
        int i;
        Object obj2;
        String str;
        vnm vnmVar;
        vnm vnmVar2;
        String str2;
        e5f J;
        ye4 a2;
        z88 data;
        String str3;
        if (sq3Var instanceof qul) {
            qulVar = (qul) sq3Var;
            int i2 = qulVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qulVar.v = i2 - Integer.MIN_VALUE;
                obj = qulVar.t;
                lu3Var = lu3.a;
                i = qulVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    vnm vnmVar3 = vnm.a;
                    qulVar.r = vnmVar3;
                    qulVar.s = "blaze_data_store_generated_user_id";
                    qulVar.v = 1;
                    if (vnmVar3.c(qulVar) != lu3Var) {
                        vnmVar2 = vnmVar3;
                        str2 = "blaze_data_store_generated_user_id";
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    String str4 = qulVar.s;
                    vnm vnmVar4 = (vnm) qulVar.r;
                    y6a.M(obj);
                    str2 = str4;
                    vnmVar2 = vnmVar4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str5 = (String) qulVar.r;
                        y6a.M(obj);
                        return str5;
                    }
                    vnmVar2 = (vnm) qulVar.r;
                    y6a.M(obj);
                    str3 = (String) obj;
                    if (str3 == null) {
                        obj2 = null;
                        str = (String) obj2;
                        if (str != null || StringsKt.R(str)) {
                            str = UUID.randomUUID().toString();
                            vnmVar = vnm.a;
                            qulVar.r = str;
                            qulVar.s = null;
                            qulVar.v = 3;
                            if (vnmVar.d("blaze_data_store_generated_user_id", str, qulVar) != lu3Var) {
                                return lu3Var;
                            }
                        }
                        return str;
                    }
                    obj2 = vnm.b(vnmVar2).fromJson(str3, (Class<Object>) String.class);
                    str = (String) obj2;
                    if (str != null) {
                    }
                    str = UUID.randomUUID().toString();
                    vnmVar = vnm.a;
                    qulVar.r = str;
                    qulVar.s = null;
                    qulVar.v = 3;
                    if (vnmVar.d("blaze_data_store_generated_user_id", str, qulVar) != lu3Var) {
                        return str;
                    }
                }
                J = f6a.J(str2);
                vnm vnmVar5 = vnm.a;
                vnmVar2.getClass();
                a2 = vnm.a();
                if (a2 != null && (data = a2.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    qulVar.r = vnmVar2;
                    qulVar.s = null;
                    qulVar.v = 2;
                    obj = rd0.y(vdmVar, qulVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    str3 = (String) obj;
                    if (str3 == null) {
                    }
                }
                obj2 = null;
                str = (String) obj2;
                if (str != null) {
                }
                str = UUID.randomUUID().toString();
                vnmVar = vnm.a;
                qulVar.r = str;
                qulVar.s = null;
                qulVar.v = 3;
                if (vnmVar.d("blaze_data_store_generated_user_id", str, qulVar) != lu3Var) {
                }
            }
        }
        qulVar = new qul(this, sq3Var);
        obj = qulVar.t;
        lu3Var = lu3.a;
        i = qulVar.v;
        if (i != 0) {
        }
        J = f6a.J(str2);
        vnm vnmVar52 = vnm.a;
        vnmVar2.getClass();
        a2 = vnm.a();
        if (a2 != null) {
            vdm vdmVar2 = new vdm(data, J);
            qulVar.r = vnmVar2;
            qulVar.s = null;
            qulVar.v = 2;
            obj = rd0.y(vdmVar2, qulVar);
            if (obj == lu3Var) {
            }
            str3 = (String) obj;
            if (str3 == null) {
            }
        }
        obj2 = null;
        str = (String) obj2;
        if (str != null) {
        }
        str = UUID.randomUUID().toString();
        vnmVar = vnm.a;
        qulVar.r = str;
        qulVar.s = null;
        qulVar.v = 3;
        if (vnmVar.d("blaze_data_store_generated_user_id", str, qulVar) != lu3Var) {
        }
    }
}
