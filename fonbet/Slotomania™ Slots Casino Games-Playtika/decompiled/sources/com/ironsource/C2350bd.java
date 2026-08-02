package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2350bd {
    public static final String a = "com.google.market";
    public static final String b = "com.android.vending";
    public static final String c = "isInstalled";
    private static final String d = "bd";
    private static final ArrayList<String> e = new a();

    /* renamed from: com.ironsource.bd$a */
    class a extends ArrayList<String> {
        a() {
            add("com.android.vending");
            add(C2350bd.a);
        }
    }

    /* renamed from: com.ironsource.bd$b */
    class b extends JSONObject {
        final /* synthetic */ boolean a;

        b(boolean z) throws JSONException {
            this.a = z;
            put("isInstalled", z);
        }
    }

    /* renamed from: com.ironsource.bd$c */
    private enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{C2350bd.a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});

        private static final Map<String, c> h = new HashMap();
        private final int a;
        private final String[] b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    h.put(str, cVar);
                }
            }
        }

        c(int i2, String[] strArr) {
            this.a = i2;
            this.b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<String> b() {
            return new ArrayList<>(h.keySet());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.b;
        }
    }

    private static JSONObject a(Context context) {
        return a(context, e);
    }

    public static String b(Context context) {
        Iterator<String> it = e.iterator();
        while (it.hasNext()) {
            String a2 = a(context, it.next());
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        return "";
    }

    private static ArrayList<String> c(Context context) {
        List<ApplicationInfo> I = Jb.Y().a().I(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : I) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer d(Context context) {
        JSONObject a2 = a(context, (ArrayList<String>) c.b());
        int i = 0;
        for (c cVar : c.values()) {
            String[] d2 = cVar.d();
            int length = d2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                JSONObject optJSONObject = a2.optJSONObject(d2[i2]);
                if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                    i = (int) (i + Math.pow(2.0d, r5.c() - 1));
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static boolean e(Context context) {
        JSONObject a2 = a(context);
        Iterator<String> keys = a2.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a2.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            ArrayList<String> c2 = c(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                jsonObjectInit.put(next, a(c2.contains(next.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            Log.d(d, "Error while extracting packages installation data");
        }
        return jsonObjectInit;
    }

    private static JSONObject a(boolean z) throws JSONException {
        return SafeIronSourceIronsourceBridge.com_ironsource_bd$b_jsonObjectInit(z);
    }
}
