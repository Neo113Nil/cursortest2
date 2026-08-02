package n6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import g6.C4331C;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f57053a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f57054b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f57055c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final String f57056d = C4331C.l().getPackageName();

    /* renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f57057e = C4331C.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final SharedPreferences f57058f = C4331C.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final Object a(Context context, IBinder iBinder) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            return f57053a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final void b() {
        if (Y7.a.d(i.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f57057e;
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j10 > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
        }
    }

    public static final ArrayList g(Context context, Object obj) {
        i iVar;
        Class d10;
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList arrayList = new ArrayList();
            if (obj != null && (d10 = (iVar = f57053a).d(context, "com.android.vending.billing.IInAppBillingService")) != null && iVar.e(d10, "getPurchaseHistory") != null) {
                return iVar.c(iVar.f(context, obj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final ArrayList i(Context context, Object obj) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            i iVar = f57053a;
            return iVar.c(iVar.h(context, obj, "inapp"));
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final ArrayList j(Context context, Object obj) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            i iVar = f57053a;
            return iVar.c(iVar.h(context, obj, "subs"));
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public static final Map k(Context context, ArrayList skuList, Object obj, boolean z10) {
        if (Y7.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(skuList, "skuList");
            Map p10 = f57053a.p(skuList);
            ArrayList arrayList = new ArrayList();
            Iterator it = skuList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!p10.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            p10.putAll(f57053a.l(context, arrayList, obj, z10));
            return p10;
        } catch (Throwable th2) {
            Y7.a.b(th2, i.class);
            return null;
        }
    }

    public final ArrayList c(ArrayList arrayList) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = f57058f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j10 / 1000) <= 86400 && !Intrinsics.areEqual(f57058f.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final Class d(Context context, String str) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = f57055c;
            Class cls = (Class) hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            Class b10 = m.b(context, str);
            if (b10 == null) {
                return b10;
            }
            hashMap.put(str, b10);
            return b10;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method e(Class cls, String str) {
        Class[] clsArr;
        Method c10;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = f57054b;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            int hashCode = str.hashCode();
            Class TYPE = Integer.TYPE;
            switch (hashCode) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                c10 = m.c(cls, str, null);
            } else {
                m mVar = m.f57074a;
                c10 = m.c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (c10 != null) {
                hashMap.put(str, c10);
            }
            return c10;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final ArrayList f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (o(context, obj, str)) {
                int i10 = 0;
                String str2 = null;
                boolean z10 = false;
                do {
                    Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f57056d, str, str2, new Bundle()});
                    if (n10 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) n10;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z10 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i10++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i10 < 30 || str2 == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i10 < 30) {
                        break;
                    }
                } while (!z10);
            }
            return arrayList;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final ArrayList h(Context context, Object obj, String str) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && o(context, obj, str)) {
                int i10 = 0;
                String str2 = null;
                while (true) {
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object n10 = n(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, f57056d, str, str2});
                        if (n10 != null) {
                            Bundle bundle = (Bundle) n10;
                            if (bundle.getInt("RESPONSE_CODE") == 0) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                if (stringArrayList == null) {
                                    break;
                                }
                                i10 += stringArrayList.size();
                                arrayList.addAll(stringArrayList);
                                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                if (i10 < 30 || str2 == null) {
                                    break;
                                    break;
                                }
                                context = context2;
                                obj = obj2;
                            }
                        }
                        str2 = null;
                        if (i10 < 30) {
                            break;
                        }
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        Y7.a.b(th, this);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final Map l(Context context, ArrayList arrayList, Object obj, boolean z10) {
        int size;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                try {
                    Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, f57056d, z10 ? "subs" : "inapp", bundle});
                    if (n10 != null) {
                        Bundle bundle2 = (Bundle) n10;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    Object obj2 = arrayList.get(i10);
                                    Intrinsics.checkNotNullExpressionValue(obj2, "skuList[i]");
                                    String str = stringArrayList.get(i10);
                                    Intrinsics.checkNotNullExpressionValue(str, "skuDetailsList[i]");
                                    linkedHashMap.put(obj2, str);
                                    if (i11 > size) {
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                            q(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Y7.a.b(th, this);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean m(String skuDetail) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
            try {
                String optString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (optString != null) {
                    if (optString.length() > 0) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e10;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Class d10 = d(context, str);
            if (d10 == null || (e10 = e(d10, str2)) == null) {
                return null;
            }
            m mVar = m.f57074a;
            return m.e(d10, e10, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final boolean o(Context context, Object obj, String str) {
        if (Y7.a.d(this) || obj == null) {
            return false;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f57056d, str});
            if (n10 != null) {
                if (((Integer) n10).intValue() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            Y7.a.b(th, this);
            return false;
        }
    }

    public final Map p(ArrayList arrayList) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = f57057e.getString(sku, null);
                if (string != null) {
                    List split$default = StringsKt.split$default((CharSequence) string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (currentTimeMillis - Long.parseLong((String) split$default.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, split$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void q(Map map) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f57057e.edit();
            for (Map.Entry entry : map.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
