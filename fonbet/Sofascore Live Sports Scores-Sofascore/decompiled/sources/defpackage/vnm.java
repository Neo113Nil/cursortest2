package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vnm {
    public static Application b;
    public static final vnm a = new vnm();
    public static final qa3 c = qx9.c();
    public static final mqi d = ypa.b(new wel(25));

    public static ye4 a() {
        if (BlazeSDK.INSTANCE.isProd$blazesdk_release()) {
            Application application = b;
            if (application != null) {
                return (ye4) kpm.b.getValue(application, kpm.a[0]);
            }
            return null;
        }
        Application application2 = b;
        if (application2 != null) {
            return (ye4) kpm.c.getValue(application2, kpm.a[1]);
        }
        return null;
    }

    public static final Gson b(vnm vnmVar) {
        vnmVar.getClass();
        return (Gson) d.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        dzl dzlVar;
        int i;
        if (sq3Var instanceof dzl) {
            dzlVar = (dzl) sq3Var;
            int i2 = dzlVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dzlVar.t = i2 - Integer.MIN_VALUE;
                Object obj = dzlVar.r;
                lu3 lu3Var = lu3.a;
                i = dzlVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(10, be5.SECONDS);
                    z2m z2mVar = new z2m(null);
                    dzlVar.t = 1;
                    if (wba.U(n4o.R(R), z2mVar, dzlVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        dzlVar = new dzl(this, sq3Var);
        Object obj2 = dzlVar.r;
        lu3 lu3Var2 = lu3.a;
        i = dzlVar.t;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(1:25)|20|(1:22)|13|14))|29|6|7|(0)(0)|20|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (c(r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0070, B:20:0x004f, B:22:0x005c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Serializable serializable, sq3 sq3Var) {
        lkm lkmVar;
        int i;
        Object obj;
        ye4 a2;
        if (sq3Var instanceof lkm) {
            lkmVar = (lkm) sq3Var;
            int i2 = lkmVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lkmVar.w = i2 - Integer.MIN_VALUE;
                Object obj2 = lkmVar.u;
                lu3 lu3Var = lu3.a;
                i = lkmVar.w;
                if (i != 0) {
                    y6a.M(obj2);
                    lkmVar.r = this;
                    lkmVar.s = str;
                    lkmVar.t = serializable;
                    lkmVar.w = 1;
                    obj = serializable;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj2);
                        return Unit.a;
                    }
                    Object obj3 = lkmVar.t;
                    str = lkmVar.s;
                    this = lkmVar.r;
                    y6a.M(obj2);
                    obj = obj3;
                }
                e5f J = f6a.J(str);
                this.getClass();
                a2 = a();
                if (a2 != null) {
                    imm immVar = new imm(obj, J, null);
                    lkmVar.r = null;
                    lkmVar.s = null;
                    lkmVar.t = null;
                    lkmVar.w = 2;
                    obj2 = o6a.x(a2, immVar, lkmVar);
                }
                return Unit.a;
            }
        }
        lkmVar = new lkm(this, sq3Var);
        Object obj22 = lkmVar.u;
        lu3 lu3Var2 = lu3.a;
        i = lkmVar.w;
        if (i != 0) {
        }
        e5f J2 = f6a.J(str);
        this.getClass();
        a2 = a();
        if (a2 != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0177 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:11:0x0030, B:13:0x016f, B:14:0x0173, B:18:0x00e1, B:20:0x00e7, B:22:0x00fd, B:24:0x0106, B:27:0x0112, B:28:0x011f, B:30:0x0125, B:32:0x013e, B:35:0x0147, B:41:0x014b, B:43:0x0151, B:45:0x0159, B:56:0x017c, B:16:0x0177, B:62:0x00d7), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:11:0x0030, B:13:0x016f, B:14:0x0173, B:18:0x00e1, B:20:0x00e7, B:22:0x00fd, B:24:0x0106, B:27:0x0112, B:28:0x011f, B:30:0x0125, B:32:0x013e, B:35:0x0147, B:41:0x014b, B:43:0x0151, B:45:0x0159, B:56:0x017c, B:16:0x0177, B:62:0x00d7), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x016c -> B:13:0x016f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq3 sq3Var) {
        xgm xgmVar;
        int i;
        qa3 qa3Var;
        Map h;
        Iterator it;
        ye4 ye4Var;
        try {
            if (sq3Var instanceof xgm) {
                xgmVar = (xgm) sq3Var;
                int i2 = xgmVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xgmVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = xgmVar.u;
                    lu3 lu3Var = lu3.a;
                    i = xgmVar.w;
                    qa3Var = c;
                    if (i != 0) {
                        y6a.M(obj);
                        Map h2 = tub.h(new Pair("blaze_shared_preferences", new wel(23)), new Pair("blaze_uat_shared_preferences", new wel(24)));
                        h = tub.h(new Pair("blaze_data_store_generated_user_id", "shared_preferences_generated_user_id"), new Pair("blaze_data_store_blaze_user_id", "shared_preferences_blaze_user_id"), new Pair("blaze_data_store_access_token", "shared_preferences_access_token"), new Pair("blaze_data_store_refreshed_token", "shared_preferences_refreshed_token"), new Pair("blaze_data_store_external_user_id", "shared_preferences_external_user_id"), new Pair("blaze_data_store_story_player_visited", "shared_preferences_story_player_visited"), new Pair("blaze_data_store_moment_player_visited", "shared_preferences_moment_player_visited"), new Pair("blaze_data_store_videos_player_visited", "shared_preferences_videos_player_visited"), new Pair("blaze_data_store_cache_version", "shared_preferences_cache_version"), new Pair("blaze_data_store_sdk_base_domain", "shared_preferences_sdk_base_domain"), new Pair("blaze_data_store_disable_app_activity_events", "shared_preferences_disable_app_activity_events"));
                        it = h2.entrySet().iterator();
                        while (it.hasNext()) {
                        }
                        Unit unit = Unit.a;
                        qa3Var.V(unit);
                        return unit;
                    }
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = xgmVar.t;
                    it = xgmVar.s;
                    h = xgmVar.r;
                    y6a.M(obj);
                    Application application = b;
                    if (application != null) {
                        application.deleteSharedPreferences(str);
                    }
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        str = (String) entry.getKey();
                        Function0 function0 = (Function0) entry.getValue();
                        Application application2 = b;
                        SharedPreferences sharedPreferences = application2 != null ? application2.getSharedPreferences(str, 0) : null;
                        if (sharedPreferences != null && !sharedPreferences.getAll().isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry2 : h.entrySet()) {
                                String str2 = (String) entry2.getKey();
                                String string = sharedPreferences.getString((String) entry2.getValue(), null);
                                Pair pair = string != null ? new Pair(str2, string) : null;
                                if (pair != null) {
                                    arrayList.add(pair);
                                }
                            }
                            if (arrayList.isEmpty() || (ye4Var = (ye4) function0.invoke()) == null) {
                                Application application3 = b;
                                if (application3 != null) {
                                }
                                while (it.hasNext()) {
                                }
                            } else {
                                wim wimVar = new wim(arrayList, null);
                                xgmVar.r = h;
                                xgmVar.s = it;
                                xgmVar.t = str;
                                xgmVar.w = 1;
                                obj = o6a.x(ye4Var, wimVar, xgmVar);
                                if (obj == lu3Var) {
                                    return lu3Var;
                                }
                                Application application32 = b;
                                if (application32 != null) {
                                }
                                while (it.hasNext()) {
                                }
                            }
                        }
                    }
                    Unit unit2 = Unit.a;
                    qa3Var.V(unit2);
                    return unit2;
                }
            }
            if (i != 0) {
            }
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            Unit unit3 = Unit.a;
            qa3Var.V(unit3);
            return unit3;
        }
        xgmVar = new xgm(this, sq3Var);
        Object obj2 = xgmVar.u;
        lu3 lu3Var2 = lu3.a;
        i = xgmVar.w;
        qa3Var = c;
    }
}
