package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.appevents.u;
import com.facebook.internal.c;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.k0;
import com.facebook.w;
import com.ironsource.V3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class zd0 {
    public static final HashMap a = tub.f(new Pair(yd0.a, "MOBILE_APP_INSTALL"), new Pair(yd0.b, "CUSTOM_APP_EVENTS"));

    /* JADX WARN: Can't wrap try/catch for region: R(23:5|6|7|(1:9)|10|(1:12)|13|(3:96|97|(2:99|(2:101|(15:103|(3:17|(1:19)(1:21)|20)|(10:23|(2:25|(1:32)(2:29|(1:31)))|33|(2:35|(2:37|(1:44)(2:41|(1:43)))(1:45))|46|(1:48)|49|(5:51|(6:57|58|(1:60)|61|54|(1:56))|53|54|(0))|66|(1:68))|69|(1:71)(1:95)|(1:73)|74|(1:76)|(1:78)|79|80|81|(3:83|(2:86|84)|87)|88|89)(2:104|105)))(2:106|107))|15|(0)|(0)|69|(0)(0)|(0)|74|(0)|(0)|79|80|81|(0)|88|89) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0178, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0179, code lost:
    
        r10 = com.facebook.internal.a0.a;
        r9.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0180, code lost:
    
        monitor-enter(com.facebook.w.b);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JSONObject a(yd0 yd0Var, c cVar, String str, boolean z, Context context) {
        SharedPreferences sharedPreferences;
        Boolean valueOf;
        String u;
        String u2;
        JSONObject n;
        String E;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(yd0Var));
        if (!com.facebook.appevents.c.c) {
            com.facebook.appevents.c.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = com.facebook.appevents.c.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = com.facebook.appevents.c.b;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            o oVar = o.ServiceUpdateCompliance;
            if (!q.b(oVar)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z);
            w wVar = w.a;
            jSONObject.put("advertiser_id_collection_enabled", k0.b());
            if (!cw3.a.contains(k0.class)) {
                try {
                    k0.a.e();
                    sharedPreferences = k0.i;
                } catch (Throwable th) {
                    cw3.a(k0.class, th);
                }
                if (sharedPreferences == null) {
                    Intrinsics.i("userSettingPref");
                    throw null;
                }
                if (sharedPreferences.contains("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp")) {
                    SharedPreferences sharedPreferences2 = k0.i;
                    if (sharedPreferences2 == null) {
                        Intrinsics.i("userSettingPref");
                        throw null;
                    }
                    valueOf = Boolean.valueOf(sharedPreferences2.getBoolean("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp", false));
                    if (valueOf != null) {
                        jSONObject.put("add_to_messaging_customer_base_for_whatsapp", valueOf.booleanValue() ? "1" : "0");
                    }
                    if (cVar != null) {
                        if (q.b(oVar)) {
                            if (Build.VERSION.SDK_INT < 31 || !com.facebook.internal.k0.z(context)) {
                                jSONObject.put("anon_id", str);
                            } else if (!cVar.e) {
                                jSONObject.put("anon_id", str);
                            }
                        }
                        if (cVar.c != null) {
                            if (!q.b(oVar)) {
                                jSONObject.put(V3.c, cVar.c);
                            } else if (Build.VERSION.SDK_INT < 31 || !com.facebook.internal.k0.z(context)) {
                                jSONObject.put(V3.c, cVar.c);
                            } else if (!cVar.e) {
                                jSONObject.put(V3.c, cVar.c);
                            }
                        }
                        if (cVar.a() != null) {
                            jSONObject.put("advertiser_id", cVar.a());
                            jSONObject.put("advertiser_tracking_enabled", !cVar.e);
                        }
                        if (!cVar.e) {
                            u uVar = u.a;
                            if (!cw3.a.contains(u.class)) {
                                try {
                                    if (!u.c.get()) {
                                        uVar.b();
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.putAll(u.d);
                                    hashMap.putAll(uVar.a());
                                    E = com.facebook.internal.k0.E(hashMap);
                                } catch (Throwable th2) {
                                    cw3.a(u.class, th2);
                                }
                                if (E.length() != 0) {
                                    jSONObject.put("ud", E);
                                }
                            }
                            E = null;
                            if (E.length() != 0) {
                            }
                        }
                        String str3 = cVar.d;
                        if (str3 != null) {
                            jSONObject.put("installer_package", str3);
                        }
                    }
                    k03 k03Var = de0.c;
                    de0 n2 = k03Var.n();
                    u = n2 == null ? n2.u("campaign_ids") : null;
                    if (u != null) {
                        jSONObject.put("campaign_ids", u);
                    }
                    de0 n3 = k03Var.n();
                    u2 = n3 != null ? n3.u("click_id") : null;
                    if (u2 != null) {
                        jSONObject.put("click_id", u2);
                    }
                    com.facebook.internal.k0.J(jSONObject, context);
                    n = com.facebook.internal.k0.n();
                    if (n != null) {
                        Iterator<String> keys = n.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject.put(next, n.get(next));
                        }
                    }
                    jSONObject.put("application_package_name", context.getPackageName());
                    return jSONObject;
                }
            }
            valueOf = null;
            if (valueOf != null) {
            }
            if (cVar != null) {
            }
            k03 k03Var2 = de0.c;
            de0 n22 = k03Var2.n();
            if (n22 == null) {
            }
            if (u != null) {
            }
            de0 n32 = k03Var2.n();
            if (n32 != null) {
            }
            if (u2 != null) {
            }
            com.facebook.internal.k0.J(jSONObject, context);
            n = com.facebook.internal.k0.n();
            if (n != null) {
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th3) {
            com.facebook.appevents.c.a.readLock().unlock();
            throw th3;
        }
    }
}
