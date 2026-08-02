package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import com.ironsource.L6;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.database.DbNatsEvent;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f5d {
    public final Context a;
    public final bfk b;
    public final s5d c;
    public final yea d;
    public final j2d e;
    public final ad2 f;
    public final DateTimeFormatter g;
    public String h;

    public f5d(Context context, bfk bfkVar, s5d s5dVar, yea yeaVar) {
        bfkVar.getClass();
        s5dVar.getClass();
        yeaVar.getClass();
        this.a = context;
        this.b = bfkVar;
        this.c = s5dVar;
        this.d = yeaVar;
        this.e = new j2d();
        hs4 hs4Var = z45.a;
        this.f = s9a.c(hq4.c.f0(1).plus(tz9.o()));
        this.g = DateTimeFormatter.ofPattern("yyyyMMdd", Locale.US).withZone(ZoneOffset.UTC);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, sq3 sq3Var) {
        d5d d5dVar;
        int i;
        Context context2;
        f5d f5dVar;
        String str;
        SharedPreferences sharedPreferences;
        if (sq3Var instanceof d5d) {
            d5dVar = (d5d) sq3Var;
            int i2 = d5dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d5dVar.v = i2 - Integer.MIN_VALUE;
                Object obj = d5dVar.t;
                lu3 lu3Var = lu3.a;
                i = d5dVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    String str2 = this.h;
                    if (str2 != null) {
                        return str2;
                    }
                    d5dVar.r = context;
                    d5dVar.s = this;
                    d5dVar.v = 1;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(hq4.c, new ok(context, null), d5dVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    context2 = context;
                    f5dVar = this;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f5dVar = d5dVar.s;
                    context2 = d5dVar.r;
                    y6a.M(obj);
                }
                f5dVar.h = (String) obj;
                str = this.h;
                context2.getClass();
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context2.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                if (!Intrinsics.c(str, sharedPreferences.getString("ADVERTISING_ID", null))) {
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext2 = context2.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences2 = a5f.d(applicationContext2);
                            uic.j = sharedPreferences2;
                        }
                        sharedPreferences2.getClass();
                    }
                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                    edit.getClass();
                    edit.putString("ADVERTISING_ID", this.h);
                    Unit unit = Unit.a;
                    edit.apply();
                }
                return this.h;
            }
        }
        d5dVar = new d5d(this, sq3Var);
        Object obj2 = d5dVar.t;
        lu3 lu3Var2 = lu3.a;
        i = d5dVar.v;
        if (i != 0) {
        }
        f5dVar.h = (String) obj2;
        str = this.h;
        context2.getClass();
        sharedPreferences = uic.j;
        if (sharedPreferences == null) {
        }
        if (!Intrinsics.c(str, sharedPreferences.getString("ADVERTISING_ID", null))) {
        }
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x02d2, code lost:
    
        if (r0 == r3) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0249  */
    /* JADX WARN: Type inference failed for: r21v0, types: [f5d] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, FirebaseBundle firebaseBundle, sq3 sq3Var) {
        e5d e5dVar;
        int i;
        LinkedHashMap linkedHashMap;
        String str;
        Context context2;
        int i2;
        LinkedHashMap linkedHashMap2;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        SharedPreferences sharedPreferences4;
        Object c;
        Context context3;
        Object obj = lu3.a;
        if (sq3Var instanceof e5d) {
            e5dVar = (e5d) sq3Var;
            int i3 = e5dVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e5dVar.y = i3 - Integer.MIN_VALUE;
                Object obj2 = e5dVar.w;
                i = e5dVar.y;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj2);
                    linkedHashMap = new LinkedHashMap(tub.k(tub.k(firebaseBundle.getLongMap(), firebaseBundle.getDoubleMap()), firebaseBundle.getStringMap()));
                    Object remove = linkedHashMap.remove("turn_off_connection");
                    ?? booleanValue = remove instanceof Boolean ? ((Boolean) remove).booleanValue() : remove instanceof Long ? remove.equals(new Long(1L)) : 0;
                    Calendar calendar = ke0.a;
                    linkedHashMap.put("user_id", ke0.d(context));
                    UserAccount b = this.b.b();
                    linkedHashMap.put("user_account_id", b.getIsLoggedIn() ? b.getId() : null);
                    str = "device_advertising_id";
                    e5dVar.r = context;
                    e5dVar.s = linkedHashMap;
                    e5dVar.t = linkedHashMap;
                    e5dVar.u = "device_advertising_id";
                    e5dVar.v = booleanValue;
                    e5dVar.y = 1;
                    Object a = a(context, e5dVar);
                    if (a != obj) {
                        context2 = context;
                        i2 = booleanValue;
                        obj2 = a;
                        linkedHashMap2 = linkedHashMap;
                    }
                    return obj;
                }
                if (i == 1) {
                    i2 = e5dVar.v;
                    str = e5dVar.u;
                    linkedHashMap = e5dVar.t;
                    linkedHashMap2 = e5dVar.s;
                    context2 = e5dVar.r;
                    y6a.M(obj2);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj2);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = e5dVar.v;
                    context3 = e5dVar.r;
                    y6a.M(obj2);
                    if (i2 != 0) {
                        return Unit.a;
                    }
                    s5d s5dVar = this.c;
                    e5dVar.r = null;
                    e5dVar.s = null;
                    e5dVar.v = i2;
                    e5dVar.y = 3;
                    s5dVar.getClass();
                    Object r = s9a.r(new qa7(context3, s5dVar, rq3Var, 23), e5dVar);
                    if (r != obj) {
                        r = Unit.a;
                    }
                }
                linkedHashMap.put(str, obj2);
                linkedHashMap2.put(L6.H, "ANDROID");
                Configuration configuration = context2.getResources().getConfiguration();
                configuration.getClass();
                linkedHashMap2.put("device_category", (configuration.screenLayout & 15) < 3 ? "tablet" : "mobile");
                linkedHashMap2.put("device_mobile_brand_name", Build.BRAND);
                linkedHashMap2.put("device_mobile_model_name", Build.MODEL);
                linkedHashMap2.put("device_operating_system_version", Build.VERSION.RELEASE);
                linkedHashMap2.put("device_language", dla.h(dla.j(dla.e(context2))));
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context2.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                linkedHashMap2.put("geo_continent", sharedPreferences.getString("REGION_ANALYTICS_CONTINENT", ""));
                sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = context2.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences2 = a5f.d(applicationContext2);
                        uic.j = sharedPreferences2;
                    }
                    sharedPreferences2.getClass();
                }
                linkedHashMap2.put("geo_country", sharedPreferences2.getString("REGION_USER_COUNTRY_ALPHA", null));
                sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = context2.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences3 = a5f.d(applicationContext3);
                        uic.j = sharedPreferences3;
                    }
                    sharedPreferences3.getClass();
                }
                linkedHashMap2.put("geo_region", sharedPreferences3.getString("REGION_ANALYTICS_REGION", ""));
                sharedPreferences4 = uic.j;
                if (sharedPreferences4 == null) {
                    Context applicationContext4 = context2.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences4 = a5f.d(applicationContext4);
                        uic.j = sharedPreferences4;
                    }
                    sharedPreferences4.getClass();
                }
                linkedHashMap2.put("geo_city", sharedPreferences4.getString("REGION_ANALYTICS_CITY", ""));
                linkedHashMap2.put("app_info_version", "26.07.20");
                linkedHashMap2.put("app_language", dla.a());
                linkedHashMap2.put("dispatch_timestamp", new Long(System.currentTimeMillis() * 1000));
                linkedHashMap2.put("device_low_ram", new Long(!y05.a(context2) ? 1L : 0L));
                e5dVar.r = context2;
                e5dVar.s = null;
                e5dVar.t = null;
                e5dVar.u = null;
                e5dVar.v = i2;
                e5dVar.y = 2;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                Calendar calendar2 = ke0.a;
                String concat = "_EVENTS.".concat(ke0.d(context2));
                yea yeaVar = this.d;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(sub.c(linkedHashMap3.size()));
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    Object key = entry2.getKey();
                    Object value = entry2.getValue();
                    linkedHashMap4.put(key, value instanceof Long ? qfa.b((Number) value) : value instanceof Double ? qfa.b((Number) value) : value instanceof String ? qfa.c((String) value) : JsonNull.INSTANCE);
                }
                c cVar = new c(linkedHashMap4);
                yeaVar.getClass();
                c = this.c.c(new DbNatsEvent(0, concat, yeaVar.c(b.Companion.serializer(), cVar), 1, null), !linkedHashMap3.containsKey("geo_country"), e5dVar);
                if (c != lu3.a) {
                    c = Unit.a;
                }
                if (c != obj) {
                    context3 = context2;
                    if (i2 != 0) {
                    }
                }
                return obj;
            }
        }
        e5dVar = new e5d(this, sq3Var);
        Object obj22 = e5dVar.w;
        i = e5dVar.y;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        linkedHashMap.put(str, obj22);
        linkedHashMap2.put(L6.H, "ANDROID");
        Configuration configuration2 = context2.getResources().getConfiguration();
        configuration2.getClass();
        linkedHashMap2.put("device_category", (configuration2.screenLayout & 15) < 3 ? "tablet" : "mobile");
        linkedHashMap2.put("device_mobile_brand_name", Build.BRAND);
        linkedHashMap2.put("device_mobile_model_name", Build.MODEL);
        linkedHashMap2.put("device_operating_system_version", Build.VERSION.RELEASE);
        linkedHashMap2.put("device_language", dla.h(dla.j(dla.e(context2))));
        sharedPreferences = uic.j;
        if (sharedPreferences == null) {
        }
        linkedHashMap2.put("geo_continent", sharedPreferences.getString("REGION_ANALYTICS_CONTINENT", ""));
        sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
        }
        linkedHashMap2.put("geo_country", sharedPreferences2.getString("REGION_USER_COUNTRY_ALPHA", null));
        sharedPreferences3 = uic.j;
        if (sharedPreferences3 == null) {
        }
        linkedHashMap2.put("geo_region", sharedPreferences3.getString("REGION_ANALYTICS_REGION", ""));
        sharedPreferences4 = uic.j;
        if (sharedPreferences4 == null) {
        }
        linkedHashMap2.put("geo_city", sharedPreferences4.getString("REGION_ANALYTICS_CITY", ""));
        linkedHashMap2.put("app_info_version", "26.07.20");
        linkedHashMap2.put("app_language", dla.a());
        linkedHashMap2.put("dispatch_timestamp", new Long(System.currentTimeMillis() * 1000));
        linkedHashMap2.put("device_low_ram", new Long(!y05.a(context2) ? 1L : 0L));
        e5dVar.r = context2;
        e5dVar.s = null;
        e5dVar.t = null;
        e5dVar.u = null;
        e5dVar.v = i2;
        e5dVar.y = 2;
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        while (r5.hasNext()) {
        }
        Calendar calendar22 = ke0.a;
        String concat2 = "_EVENTS.".concat(ke0.d(context2));
        yea yeaVar2 = this.d;
        LinkedHashMap linkedHashMap42 = new LinkedHashMap(sub.c(linkedHashMap32.size()));
        while (r7.hasNext()) {
        }
        c cVar2 = new c(linkedHashMap42);
        yeaVar2.getClass();
        c = this.c.c(new DbNatsEvent(0, concat2, yeaVar2.c(b.Companion.serializer(), cVar2), 1, null), !linkedHashMap32.containsKey("geo_country"), e5dVar);
        if (c != lu3.a) {
        }
        if (c != obj) {
        }
        return obj;
    }

    public final void c(String str, FirebaseBundle firebaseBundle) {
        str.getClass();
        if (Intrinsics.c(this.b.b().getDataSharingOptOut(), Boolean.TRUE)) {
            return;
        }
        firebaseBundle.putString("event_name", str);
        firebaseBundle.putLong("event_timestamp", System.currentTimeMillis() * 1000);
        firebaseBundle.putString("event_date", this.g.format(Instant.now()));
        xw3.L(this.f, null, null, new jr5(this, firebaseBundle, (rq3) null, 8), 3);
    }
}
