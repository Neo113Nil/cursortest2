package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.user_management.models.requests.TokenData;
import com.blaze.blazesdk.user_management.models.requests.UserManagementRefreshTokenRequestNew;
import com.blaze.blazesdk.user_management.models.responses.UserManagementResponse;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ssm {
    public static final ssm a = new ssm();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final aeh c = beh.b(0, Integer.MAX_VALUE, null, 4);

    public static /* synthetic */ Object refreshTokenAndLock$default(ssm ssmVar, String str, boolean z, rq3 rq3Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ssmVar.e(str, z, rq3Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(4:11|12|13|(2:15|16)(2:18|19))(2:21|22))(1:23))(1:32)|24|(3:28|(3:31|13|(0)(0))|30)|16))|39|6|7|(0)(0)|24|(4:26|28|(0)|30)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r6.c(r0) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if ((r6 instanceof defpackage.yga) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r7 = new com.blaze.blazesdk.shared.results.r0();
        r7.f = r6;
        defpackage.j1m.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:13:0x007b, B:18:0x0080, B:24:0x0052, B:26:0x0061, B:28:0x0067), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        edm edmVar;
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
        if (sq3Var instanceof edm) {
            edmVar = (edm) sq3Var;
            int i2 = edmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                edmVar.v = i2 - Integer.MIN_VALUE;
                Object obj = edmVar.t;
                lu3Var = lu3.a;
                i = edmVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    vnmVar = vnm.a;
                    edmVar.r = vnmVar;
                    str = "blaze_data_store_access_token";
                    edmVar.s = "blaze_data_store_access_token";
                    edmVar.v = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vnmVar2 = edmVar.r;
                        y6a.M(obj);
                        str2 = (String) obj;
                        if (str2 != null) {
                            return null;
                        }
                        return vnm.b(vnmVar2).fromJson(str2, String.class);
                    }
                    str = edmVar.s;
                    vnm vnmVar3 = edmVar.r;
                    y6a.M(obj);
                    vnmVar = vnmVar3;
                }
                J = f6a.J(str);
                vnm vnmVar4 = vnm.a;
                vnmVar.getClass();
                a2 = vnm.a();
                if (a2 != null && (data = a2.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    edmVar.r = vnmVar;
                    edmVar.s = null;
                    edmVar.v = 2;
                    y = rd0.y(vdmVar, edmVar);
                    if (y != lu3Var) {
                        vnmVar2 = vnmVar;
                        obj = y;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                    }
                    return lu3Var;
                }
                return null;
            }
        }
        edmVar = new edm(this, sq3Var);
        Object obj2 = edmVar.t;
        lu3Var = lu3.a;
        i = edmVar.v;
        if (i != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar42 = vnm.a;
        vnmVar.getClass();
        a2 = vnm.a();
        if (a2 != null) {
            vdm vdmVar2 = new vdm(data, J);
            edmVar.r = vnmVar;
            edmVar.s = null;
            edmVar.v = 2;
            y = rd0.y(vdmVar2, edmVar);
            if (y != lu3Var) {
            }
            return lu3Var;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r6 != r8) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0090, B:19:0x0035, B:20:0x0078, B:25:0x008b, B:27:0x003c, B:29:0x0042, B:31:0x0049, B:33:0x004f, B:36:0x0056, B:38:0x005c, B:41:0x0063), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(c2g c2gVar, sq3 sq3Var) {
        dmm dmmVar;
        lu3 lu3Var;
        int i;
        UserManagementResponse userManagementResponse;
        String accessToken;
        String refreshToken;
        Object d;
        try {
            if (sq3Var instanceof dmm) {
                dmmVar = (dmm) sq3Var;
                int i2 = dmmVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dmmVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = dmmVar.s;
                    lu3Var = lu3.a;
                    i = dmmVar.u;
                    if (i != 0) {
                        y6a.M(obj);
                        if (c2gVar.a.q && (userManagementResponse = (UserManagementResponse) c2gVar.b) != null && (accessToken = userManagementResponse.getAccessToken()) != null && !StringsKt.R(accessToken) && (refreshToken = userManagementResponse.getRefreshToken()) != null && !StringsKt.R(refreshToken)) {
                            ssm ssmVar = a;
                            String accessToken2 = userManagementResponse.getAccessToken();
                            String refreshToken2 = userManagementResponse.getRefreshToken();
                            dmmVar.r = userManagementResponse;
                            dmmVar.u = 1;
                            if (ssmVar.c(accessToken2, refreshToken2, dmmVar) == lu3Var) {
                                return lu3Var;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    userManagementResponse = dmmVar.r;
                    y6a.M(obj);
                    String userId = userManagementResponse.getUserId();
                    dmmVar.r = null;
                    dmmVar.u = 2;
                    d = vnm.a.d("blaze_data_store_blaze_user_id", userId, dmmVar);
                    if (d == lu3Var) {
                        d = Unit.a;
                    }
                }
            }
            if (i != 0) {
            }
            String userId2 = userManagementResponse.getUserId();
            dmmVar.r = null;
            dmmVar.u = 2;
            d = vnm.a.d("blaze_data_store_blaze_user_id", userId2, dmmVar);
            if (d == lu3Var) {
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
        dmmVar = new dmm(this, sq3Var);
        Object obj2 = dmmVar.s;
        lu3Var = lu3.a;
        i = dmmVar.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r5.d("blaze_data_store_refreshed_token", r7, r0) != r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r5.d("blaze_data_store_access_token", r6, r0) == r8) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, sq3 sq3Var) {
        lrm lrmVar;
        int i;
        if (sq3Var instanceof lrm) {
            lrmVar = (lrm) sq3Var;
            int i2 = lrmVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lrmVar.u = i2 - Integer.MIN_VALUE;
                Object obj = lrmVar.s;
                lu3 lu3Var = lu3.a;
                i = lrmVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    vnm vnmVar = vnm.a;
                    lrmVar.r = str2;
                    lrmVar.u = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = lrmVar.r;
                    y6a.M(obj);
                }
                vnm vnmVar2 = vnm.a;
                lrmVar.r = null;
                lrmVar.u = 2;
            }
        }
        lrmVar = new lrm(this, sq3Var);
        Object obj2 = lrmVar.s;
        lu3 lu3Var2 = lu3.a;
        i = lrmVar.u;
        if (i != 0) {
        }
        vnm vnmVar22 = vnm.a;
        lrmVar.r = null;
        lrmVar.u = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, String str3, String str4, sq3 sq3Var) {
        gpm gpmVar;
        int i;
        try {
            if (sq3Var instanceof gpm) {
                gpmVar = (gpm) sq3Var;
                int i2 = gpmVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gpmVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = gpmVar.r;
                    lu3 lu3Var = lu3.a;
                    i = gpmVar.t;
                    if (i != 0) {
                        y6a.M(obj);
                        vsl vslVar = tsl.d;
                        if (vslVar == null) {
                            return null;
                        }
                        UserManagementRefreshTokenRequestNew userManagementRefreshTokenRequestNew = new UserManagementRefreshTokenRequestNew(new TokenData(str, str2, str4), str3);
                        gpmVar.t = 1;
                        obj = vslVar.refreshToken(userManagementRefreshTokenRequestNew, gpmVar);
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
                    return (c2g) obj;
                }
            }
            if (i != 0) {
            }
            return (c2g) obj;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
        gpmVar = new gpm(this, sq3Var);
        Object obj2 = gpmVar.r;
        lu3 lu3Var2 = lu3.a;
        i = gpmVar.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011d, code lost:
    
        if (r11 == r0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x0120, B:16:0x0124, B:18:0x012a, B:20:0x0039, B:23:0x0045, B:27:0x0100, B:32:0x0112, B:35:0x0050, B:36:0x00d6, B:39:0x0059, B:40:0x00bb, B:42:0x00c0, B:45:0x00dc, B:48:0x0061, B:49:0x00ad, B:53:0x006d, B:54:0x0084, B:56:0x008c, B:58:0x0092, B:63:0x00a7, B:64:0x00ea, B:69:0x0074), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x0120, B:16:0x0124, B:18:0x012a, B:20:0x0039, B:23:0x0045, B:27:0x0100, B:32:0x0112, B:35:0x0050, B:36:0x00d6, B:39:0x0059, B:40:0x00bb, B:42:0x00c0, B:45:0x00dc, B:48:0x0061, B:49:0x00ad, B:53:0x006d, B:54:0x0084, B:56:0x008c, B:58:0x0092, B:63:0x00a7, B:64:0x00ea, B:69:0x0074), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x0120, B:16:0x0124, B:18:0x012a, B:20:0x0039, B:23:0x0045, B:27:0x0100, B:32:0x0112, B:35:0x0050, B:36:0x00d6, B:39:0x0059, B:40:0x00bb, B:42:0x00c0, B:45:0x00dc, B:48:0x0061, B:49:0x00ad, B:53:0x006d, B:54:0x0084, B:56:0x008c, B:58:0x0092, B:63:0x00a7, B:64:0x00ea, B:69:0x0074), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x0120, B:16:0x0124, B:18:0x012a, B:20:0x0039, B:23:0x0045, B:27:0x0100, B:32:0x0112, B:35:0x0050, B:36:0x00d6, B:39:0x0059, B:40:0x00bb, B:42:0x00c0, B:45:0x00dc, B:48:0x0061, B:49:0x00ad, B:53:0x006d, B:54:0x0084, B:56:0x008c, B:58:0x0092, B:63:0x00a7, B:64:0x00ea, B:69:0x0074), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x0120, B:16:0x0124, B:18:0x012a, B:20:0x0039, B:23:0x0045, B:27:0x0100, B:32:0x0112, B:35:0x0050, B:36:0x00d6, B:39:0x0059, B:40:0x00bb, B:42:0x00c0, B:45:0x00dc, B:48:0x0061, B:49:0x00ad, B:53:0x006d, B:54:0x0084, B:56:0x008c, B:58:0x0092, B:63:0x00a7, B:64:0x00ea, B:69:0x0074), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x0120, B:16:0x0124, B:18:0x012a, B:20:0x0039, B:23:0x0045, B:27:0x0100, B:32:0x0112, B:35:0x0050, B:36:0x00d6, B:39:0x0059, B:40:0x00bb, B:42:0x00c0, B:45:0x00dc, B:48:0x0061, B:49:0x00ad, B:53:0x006d, B:54:0x0084, B:56:0x008c, B:58:0x0092, B:63:0x00a7, B:64:0x00ea, B:69:0x0074), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008c A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x0120, B:16:0x0124, B:18:0x012a, B:20:0x0039, B:23:0x0045, B:27:0x0100, B:32:0x0112, B:35:0x0050, B:36:0x00d6, B:39:0x0059, B:40:0x00bb, B:42:0x00c0, B:45:0x00dc, B:48:0x0061, B:49:0x00ad, B:53:0x006d, B:54:0x0084, B:56:0x008c, B:58:0x0092, B:63:0x00a7, B:64:0x00ea, B:69:0x0074), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x0120, B:16:0x0124, B:18:0x012a, B:20:0x0039, B:23:0x0045, B:27:0x0100, B:32:0x0112, B:35:0x0050, B:36:0x00d6, B:39:0x0059, B:40:0x00bb, B:42:0x00c0, B:45:0x00dc, B:48:0x0061, B:49:0x00ad, B:53:0x006d, B:54:0x0084, B:56:0x008c, B:58:0x0092, B:63:0x00a7, B:64:0x00ea, B:69:0x0074), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, boolean z, rq3 rq3Var) {
        lqm lqmVar;
        int i;
        ssm ssmVar;
        boolean z2;
        c2g c2gVar;
        try {
            if (rq3Var instanceof lqm) {
                lqmVar = (lqm) rq3Var;
                int i2 = lqmVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lqmVar.w = i2 - Integer.MIN_VALUE;
                    lqm lqmVar2 = lqmVar;
                    Object obj = lqmVar2.u;
                    lu3 lu3Var = lu3.a;
                    i = lqmVar2.w;
                    aeh aehVar = c;
                    AtomicBoolean atomicBoolean = b;
                    switch (i) {
                        case 0:
                            y6a.M(obj);
                            lqmVar2.r = this;
                            lqmVar2.s = str;
                            lqmVar2.t = z;
                            lqmVar2.w = 1;
                            obj = f(lqmVar2);
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                            String str2 = (String) obj;
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                if (!c.o(str2, str, false)) {
                                    lqmVar2.r = this;
                                    lqmVar2.s = null;
                                    lqmVar2.w = 2;
                                    this.getClass();
                                    Object d = vnm.a.d("blaze_data_store_external_user_id", str, lqmVar2);
                                    if (d != lu3Var) {
                                        d = Unit.a;
                                    }
                                    if (d == lu3Var) {
                                    }
                                }
                                lqmVar2.r = this;
                                lqmVar2.s = null;
                                lqmVar2.w = 3;
                                obj = this.i(lqmVar2);
                                if (obj == lu3Var) {
                                }
                                c2gVar = (c2g) obj;
                                if (c2gVar == null) {
                                    atomicBoolean.set(false);
                                    aehVar.b(Unit.a);
                                    return new Pair(null, null);
                                }
                                atomicBoolean.set(false);
                                aehVar.b(Unit.a);
                                ssm ssmVar2 = a;
                                lqmVar2.r = c2gVar;
                                lqmVar2.w = 4;
                                obj = ssmVar2.a(lqmVar2);
                                if (obj == lu3Var) {
                                }
                                return new Pair(obj, c2gVar);
                            }
                            lqmVar2.r = this;
                            lqmVar2.s = str;
                            lqmVar2.t = z;
                            lqmVar2.w = 5;
                            if (rd0.y(aehVar, lqmVar2) != lu3Var) {
                                ssmVar = this;
                                z2 = z;
                                String str3 = str;
                                if (z2) {
                                    lqmVar2.r = null;
                                    lqmVar2.s = null;
                                    lqmVar2.w = 7;
                                    obj = ssmVar.a(lqmVar2);
                                    break;
                                } else {
                                    lqmVar2.r = null;
                                    lqmVar2.s = null;
                                    lqmVar2.w = 6;
                                    Object refreshTokenAndLock$default = refreshTokenAndLock$default(ssmVar, str3, false, lqmVar2, 2, null);
                                    if (refreshTokenAndLock$default != lu3Var) {
                                        return refreshTokenAndLock$default;
                                    }
                                }
                            }
                            return lu3Var;
                        case 1:
                            z = lqmVar2.t;
                            str = lqmVar2.s;
                            this = (ssm) lqmVar2.r;
                            y6a.M(obj);
                            String str22 = (String) obj;
                            if (!atomicBoolean.compareAndSet(false, true)) {
                            }
                            return lu3Var;
                        case 2:
                            this = (ssm) lqmVar2.r;
                            y6a.M(obj);
                            lqmVar2.r = this;
                            lqmVar2.s = null;
                            lqmVar2.w = 3;
                            obj = this.i(lqmVar2);
                            if (obj == lu3Var) {
                            }
                            c2gVar = (c2g) obj;
                            if (c2gVar == null) {
                            }
                            break;
                        case 3:
                            y6a.M(obj);
                            c2gVar = (c2g) obj;
                            if (c2gVar == null) {
                            }
                            break;
                        case 4:
                            c2gVar = (c2g) lqmVar2.r;
                            y6a.M(obj);
                            return new Pair(obj, c2gVar);
                        case 5:
                            z2 = lqmVar2.t;
                            str = lqmVar2.s;
                            ssm ssmVar3 = (ssm) lqmVar2.r;
                            y6a.M(obj);
                            ssmVar = ssmVar3;
                            String str32 = str;
                            if (z2) {
                            }
                            return lu3Var;
                        case 6:
                            y6a.M(obj);
                            return obj;
                        case 7:
                            y6a.M(obj);
                            String str4 = (String) obj;
                            return str4 != null ? new Pair(str4, null) : new Pair(null, null);
                        default:
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i) {
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return new Pair(null, null);
        }
        lqmVar = new lqm(this, rq3Var);
        lqm lqmVar22 = lqmVar;
        Object obj2 = lqmVar22.u;
        lu3 lu3Var2 = lu3.a;
        i = lqmVar22.w;
        aeh aehVar2 = c;
        AtomicBoolean atomicBoolean2 = b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(4:11|12|13|(2:15|16)(2:18|19))(2:21|22))(1:23))(1:32)|24|(3:28|(3:31|13|(0)(0))|30)|16))|39|6|7|(0)(0)|24|(4:26|28|(0)|30)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r6.c(r0) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if ((r6 instanceof defpackage.yga) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r7 = new com.blaze.blazesdk.shared.results.r0();
        r7.f = r6;
        defpackage.j1m.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:13:0x007b, B:18:0x0080, B:24:0x0052, B:26:0x0061, B:28:0x0067), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(sq3 sq3Var) {
        ngm ngmVar;
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
        if (sq3Var instanceof ngm) {
            ngmVar = (ngm) sq3Var;
            int i2 = ngmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ngmVar.v = i2 - Integer.MIN_VALUE;
                Object obj = ngmVar.t;
                lu3Var = lu3.a;
                i = ngmVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    vnmVar = vnm.a;
                    ngmVar.r = vnmVar;
                    str = "blaze_data_store_external_user_id";
                    ngmVar.s = "blaze_data_store_external_user_id";
                    ngmVar.v = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vnmVar2 = ngmVar.r;
                        y6a.M(obj);
                        str2 = (String) obj;
                        if (str2 != null) {
                            return null;
                        }
                        return vnm.b(vnmVar2).fromJson(str2, String.class);
                    }
                    str = ngmVar.s;
                    vnm vnmVar3 = ngmVar.r;
                    y6a.M(obj);
                    vnmVar = vnmVar3;
                }
                J = f6a.J(str);
                vnm vnmVar4 = vnm.a;
                vnmVar.getClass();
                a2 = vnm.a();
                if (a2 != null && (data = a2.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    ngmVar.r = vnmVar;
                    ngmVar.s = null;
                    ngmVar.v = 2;
                    y = rd0.y(vdmVar, ngmVar);
                    if (y != lu3Var) {
                        vnmVar2 = vnmVar;
                        obj = y;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                    }
                    return lu3Var;
                }
                return null;
            }
        }
        ngmVar = new ngm(this, sq3Var);
        Object obj2 = ngmVar.t;
        lu3Var = lu3.a;
        i = ngmVar.v;
        if (i != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar42 = vnm.a;
        vnmVar.getClass();
        a2 = vnm.a();
        if (a2 != null) {
            vdm vdmVar2 = new vdm(data, J);
            ngmVar.r = vnmVar;
            ngmVar.s = null;
            ngmVar.v = 2;
            y = rd0.y(vdmVar2, ngmVar);
            if (y != lu3Var) {
            }
            return lu3Var;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(4:11|12|13|(2:15|16)(2:18|19))(2:21|22))(1:23))(1:32)|24|(3:28|(3:31|13|(0)(0))|30)|16))|39|6|7|(0)(0)|24|(4:26|28|(0)|30)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r6.c(r0) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if ((r6 instanceof defpackage.yga) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r7 = new com.blaze.blazesdk.shared.results.r0();
        r7.f = r6;
        defpackage.j1m.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:13:0x007b, B:18:0x0080, B:24:0x0052, B:26:0x0061, B:28:0x0067), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(sq3 sq3Var) {
        pim pimVar;
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
        if (sq3Var instanceof pim) {
            pimVar = (pim) sq3Var;
            int i2 = pimVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pimVar.v = i2 - Integer.MIN_VALUE;
                Object obj = pimVar.t;
                lu3Var = lu3.a;
                i = pimVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    vnmVar = vnm.a;
                    pimVar.r = vnmVar;
                    str = "blaze_data_store_refreshed_token";
                    pimVar.s = "blaze_data_store_refreshed_token";
                    pimVar.v = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vnmVar2 = pimVar.r;
                        y6a.M(obj);
                        str2 = (String) obj;
                        if (str2 != null) {
                            return null;
                        }
                        return vnm.b(vnmVar2).fromJson(str2, String.class);
                    }
                    str = pimVar.s;
                    vnm vnmVar3 = pimVar.r;
                    y6a.M(obj);
                    vnmVar = vnmVar3;
                }
                J = f6a.J(str);
                vnm vnmVar4 = vnm.a;
                vnmVar.getClass();
                a2 = vnm.a();
                if (a2 != null && (data = a2.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    pimVar.r = vnmVar;
                    pimVar.s = null;
                    pimVar.v = 2;
                    y = rd0.y(vdmVar, pimVar);
                    if (y != lu3Var) {
                        vnmVar2 = vnmVar;
                        obj = y;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                    }
                    return lu3Var;
                }
                return null;
            }
        }
        pimVar = new pim(this, sq3Var);
        Object obj2 = pimVar.t;
        lu3Var = lu3.a;
        i = pimVar.v;
        if (i != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar42 = vnm.a;
        vnmVar.getClass();
        a2 = vnm.a();
        if (a2 != null) {
            vdm vdmVar2 = new vdm(data, J);
            pimVar.r = vnmVar;
            pimVar.s = null;
            pimVar.v = 2;
            y = rd0.y(vdmVar2, pimVar);
            if (y != lu3Var) {
            }
            return lu3Var;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(4:11|12|13|(2:15|16)(2:18|19))(2:21|22))(1:23))(1:32)|24|(3:28|(3:31|13|(0)(0))|30)|16))|39|6|7|(0)(0)|24|(4:26|28|(0)|30)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r6.c(r0) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if ((r6 instanceof defpackage.yga) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r7 = new com.blaze.blazesdk.shared.results.r0();
        r7.f = r6;
        defpackage.j1m.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:13:0x007b, B:18:0x0080, B:24:0x0052, B:26:0x0061, B:28:0x0067), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(sq3 sq3Var) {
        hkm hkmVar;
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
        if (sq3Var instanceof hkm) {
            hkmVar = (hkm) sq3Var;
            int i2 = hkmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hkmVar.v = i2 - Integer.MIN_VALUE;
                Object obj = hkmVar.t;
                lu3Var = lu3.a;
                i = hkmVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    vnmVar = vnm.a;
                    hkmVar.r = vnmVar;
                    str = "blaze_data_store_blaze_user_id";
                    hkmVar.s = "blaze_data_store_blaze_user_id";
                    hkmVar.v = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vnmVar2 = hkmVar.r;
                        y6a.M(obj);
                        str2 = (String) obj;
                        if (str2 != null) {
                            return null;
                        }
                        return vnm.b(vnmVar2).fromJson(str2, String.class);
                    }
                    str = hkmVar.s;
                    vnm vnmVar3 = hkmVar.r;
                    y6a.M(obj);
                    vnmVar = vnmVar3;
                }
                J = f6a.J(str);
                vnm vnmVar4 = vnm.a;
                vnmVar.getClass();
                a2 = vnm.a();
                if (a2 != null && (data = a2.getData()) != null) {
                    vdm vdmVar = new vdm(data, J);
                    hkmVar.r = vnmVar;
                    hkmVar.s = null;
                    hkmVar.v = 2;
                    y = rd0.y(vdmVar, hkmVar);
                    if (y != lu3Var) {
                        vnmVar2 = vnmVar;
                        obj = y;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                    }
                    return lu3Var;
                }
                return null;
            }
        }
        hkmVar = new hkm(this, sq3Var);
        Object obj2 = hkmVar.t;
        lu3Var = lu3.a;
        i = hkmVar.v;
        if (i != 0) {
        }
        J = f6a.J(str);
        vnm vnmVar42 = vnm.a;
        vnmVar.getClass();
        a2 = vnm.a();
        if (a2 != null) {
            vdm vdmVar2 = new vdm(data, J);
            hkmVar.r = vnmVar;
            hkmVar.s = null;
            hkmVar.v = 2;
            y = rd0.y(vdmVar2, hkmVar);
            if (y != lu3Var) {
            }
            return lu3Var;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:75|67|(2:69|33)|50|51|(2:60|(2:62|33)(4:63|43|(4:45|(2:47|33)|23|(1:25))|26))|27|28|29|(3:31|(3:34|15|(1:17)(2:18|19))|33)(1:35)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014e, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r0, null);
        r11 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:15:0x016d, B:22:0x004d, B:23:0x0133, B:27:0x0139, B:31:0x015a, B:39:0x014e, B:41:0x005a, B:43:0x011c, B:45:0x0121, B:49:0x0071, B:51:0x00f4, B:53:0x00f9, B:57:0x0102, B:60:0x0109, B:65:0x0087, B:67:0x00de, B:71:0x0096, B:72:0x00c7, B:77:0x009e, B:78:0x00b2, B:83:0x00a5, B:29:0x013c), top: B:8:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:15:0x016d, B:22:0x004d, B:23:0x0133, B:27:0x0139, B:31:0x015a, B:39:0x014e, B:41:0x005a, B:43:0x011c, B:45:0x0121, B:49:0x0071, B:51:0x00f4, B:53:0x00f9, B:57:0x0102, B:60:0x0109, B:65:0x0087, B:67:0x00de, B:71:0x0096, B:72:0x00c7, B:77:0x009e, B:78:0x00b2, B:83:0x00a5, B:29:0x013c), top: B:8:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:15:0x016d, B:22:0x004d, B:23:0x0133, B:27:0x0139, B:31:0x015a, B:39:0x014e, B:41:0x005a, B:43:0x011c, B:45:0x0121, B:49:0x0071, B:51:0x00f4, B:53:0x00f9, B:57:0x0102, B:60:0x0109, B:65:0x0087, B:67:0x00de, B:71:0x0096, B:72:0x00c7, B:77:0x009e, B:78:0x00b2, B:83:0x00a5, B:29:0x013c), top: B:8:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(sq3 sq3Var) {
        rnm rnmVar;
        int i;
        Object g;
        ssm ssmVar;
        String str;
        Object f;
        ssm ssmVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        ssm ssmVar3;
        String str6;
        String str7;
        String str8;
        String str9;
        c2g c2gVar;
        c2g c2gVar2;
        c2g c2gVar3;
        try {
            if (sq3Var instanceof rnm) {
                rnmVar = (rnm) sq3Var;
                int i2 = rnmVar.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rnmVar.x = i2 - Integer.MIN_VALUE;
                    rnm rnmVar2 = rnmVar;
                    Object obj = rnmVar2.v;
                    lu3 lu3Var = lu3.a;
                    i = rnmVar2.x;
                    ssm ssmVar4 = a;
                    switch (i) {
                        case 0:
                            y6a.M(obj);
                            rnmVar2.r = this;
                            rnmVar2.x = 1;
                            obj = a(rnmVar2);
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                            String str10 = (String) obj;
                            rnmVar2.r = this;
                            rnmVar2.s = str10;
                            rnmVar2.x = 2;
                            g = this.g(rnmVar2);
                            if (g != lu3Var) {
                                return lu3Var;
                            }
                            ssmVar = this;
                            str = str10;
                            obj = g;
                            String str11 = (String) obj;
                            rnmVar2.r = ssmVar;
                            rnmVar2.s = str;
                            rnmVar2.t = str11;
                            rnmVar2.x = 3;
                            f = ssmVar.f(rnmVar2);
                            if (f != lu3Var) {
                                return lu3Var;
                            }
                            ssmVar2 = ssmVar;
                            str2 = str11;
                            obj = f;
                            str3 = str;
                            str4 = (String) obj;
                            rnmVar2.r = ssmVar2;
                            rnmVar2.s = str3;
                            rnmVar2.t = str2;
                            rnmVar2.u = str4;
                            rnmVar2.x = 4;
                            obj = ssmVar2.h(rnmVar2);
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                            ssm ssmVar5 = ssmVar2;
                            str5 = str3;
                            ssmVar3 = ssmVar5;
                            str6 = str4;
                            str7 = str2;
                            str8 = (String) obj;
                            if (str5 != null && !StringsKt.R(str5) && str7 != null && !StringsKt.R(str7)) {
                                rnmVar2.r = ssmVar3;
                                rnmVar2.s = str6;
                                rnmVar2.t = null;
                                rnmVar2.u = null;
                                rnmVar2.x = 5;
                                obj = ssmVar3.d(str5, str7, str6, str8, rnmVar2);
                                if (obj != lu3Var) {
                                    return lu3Var;
                                }
                                str9 = str6;
                                c2gVar = (c2g) obj;
                                if (c2gVar != null) {
                                    rnmVar2.r = ssmVar3;
                                    rnmVar2.s = str9;
                                    rnmVar2.t = c2gVar;
                                    rnmVar2.u = c2gVar;
                                    rnmVar2.x = 6;
                                    obj = ssmVar4.b(c2gVar, rnmVar2);
                                    if (obj == lu3Var) {
                                        return lu3Var;
                                    }
                                    if (((Unit) obj) != null) {
                                        return c2gVar;
                                    }
                                }
                                str6 = str9;
                            }
                            ssmVar3.getClass();
                            hs4 hs4Var = z45.a;
                            c2gVar2 = (c2g) td4.t0(hq4.c, new sam(str6, null));
                            if (c2gVar2 == null) {
                                return null;
                            }
                            rnmVar2.r = c2gVar2;
                            rnmVar2.s = c2gVar2;
                            rnmVar2.t = null;
                            rnmVar2.u = null;
                            rnmVar2.x = 7;
                            obj = ssmVar4.b(c2gVar2, rnmVar2);
                            if (obj != lu3Var) {
                                c2gVar3 = c2gVar2;
                                return ((Unit) obj) == null ? c2gVar2 : c2gVar3;
                            }
                            return lu3Var;
                        case 1:
                            this = (ssm) rnmVar2.r;
                            y6a.M(obj);
                            String str102 = (String) obj;
                            rnmVar2.r = this;
                            rnmVar2.s = str102;
                            rnmVar2.x = 2;
                            g = this.g(rnmVar2);
                            if (g != lu3Var) {
                            }
                            break;
                        case 2:
                            str = (String) rnmVar2.s;
                            ssmVar = (ssm) rnmVar2.r;
                            y6a.M(obj);
                            String str112 = (String) obj;
                            rnmVar2.r = ssmVar;
                            rnmVar2.s = str;
                            rnmVar2.t = str112;
                            rnmVar2.x = 3;
                            f = ssmVar.f(rnmVar2);
                            if (f != lu3Var) {
                            }
                            break;
                        case 3:
                            String str12 = (String) rnmVar2.t;
                            String str13 = (String) rnmVar2.s;
                            ssm ssmVar6 = (ssm) rnmVar2.r;
                            y6a.M(obj);
                            ssmVar2 = ssmVar6;
                            str3 = str13;
                            str2 = str12;
                            str4 = (String) obj;
                            rnmVar2.r = ssmVar2;
                            rnmVar2.s = str3;
                            rnmVar2.t = str2;
                            rnmVar2.u = str4;
                            rnmVar2.x = 4;
                            obj = ssmVar2.h(rnmVar2);
                            if (obj == lu3Var) {
                            }
                            ssm ssmVar52 = ssmVar2;
                            str5 = str3;
                            ssmVar3 = ssmVar52;
                            str6 = str4;
                            str7 = str2;
                            str8 = (String) obj;
                            if (str5 != null) {
                                rnmVar2.r = ssmVar3;
                                rnmVar2.s = str6;
                                rnmVar2.t = null;
                                rnmVar2.u = null;
                                rnmVar2.x = 5;
                                obj = ssmVar3.d(str5, str7, str6, str8, rnmVar2);
                                if (obj != lu3Var) {
                                }
                                break;
                            }
                            ssmVar3.getClass();
                            hs4 hs4Var2 = z45.a;
                            c2gVar2 = (c2g) td4.t0(hq4.c, new sam(str6, null));
                            if (c2gVar2 == null) {
                            }
                            break;
                        case 4:
                            str4 = (String) rnmVar2.u;
                            str2 = (String) rnmVar2.t;
                            str3 = (String) rnmVar2.s;
                            ssmVar2 = (ssm) rnmVar2.r;
                            y6a.M(obj);
                            ssm ssmVar522 = ssmVar2;
                            str5 = str3;
                            ssmVar3 = ssmVar522;
                            str6 = str4;
                            str7 = str2;
                            str8 = (String) obj;
                            if (str5 != null) {
                            }
                            ssmVar3.getClass();
                            hs4 hs4Var22 = z45.a;
                            c2gVar2 = (c2g) td4.t0(hq4.c, new sam(str6, null));
                            if (c2gVar2 == null) {
                            }
                            break;
                        case 5:
                            String str14 = (String) rnmVar2.s;
                            ssm ssmVar7 = (ssm) rnmVar2.r;
                            y6a.M(obj);
                            ssmVar3 = ssmVar7;
                            str9 = str14;
                            c2gVar = (c2g) obj;
                            if (c2gVar != null) {
                            }
                            str6 = str9;
                            ssmVar3.getClass();
                            hs4 hs4Var222 = z45.a;
                            c2gVar2 = (c2g) td4.t0(hq4.c, new sam(str6, null));
                            if (c2gVar2 == null) {
                            }
                            break;
                        case 6:
                            c2gVar = (c2g) rnmVar2.u;
                            str9 = (String) rnmVar2.s;
                            ssmVar3 = (ssm) rnmVar2.r;
                            y6a.M(obj);
                            if (((Unit) obj) != null) {
                            }
                            str6 = str9;
                            ssmVar3.getClass();
                            hs4 hs4Var2222 = z45.a;
                            c2gVar2 = (c2g) td4.t0(hq4.c, new sam(str6, null));
                            if (c2gVar2 == null) {
                            }
                            break;
                        case 7:
                            c2gVar2 = (c2g) rnmVar2.s;
                            c2gVar3 = (c2g) rnmVar2.r;
                            y6a.M(obj);
                            if (((Unit) obj) == null) {
                            }
                            break;
                        default:
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i) {
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
        rnmVar = new rnm(this, sq3Var);
        rnm rnmVar22 = rnmVar;
        Object obj2 = rnmVar22.v;
        lu3 lu3Var2 = lu3.a;
        i = rnmVar22.x;
        ssm ssmVar42 = a;
    }
}
