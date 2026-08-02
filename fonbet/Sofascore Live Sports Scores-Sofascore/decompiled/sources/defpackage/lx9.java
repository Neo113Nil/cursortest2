package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.android.billingclient.api.BillingClient;
import com.facebook.w;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lx9 {
    public static final lx9 a = new lx9();
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final String d = w.a().getPackageName();
    public static final SharedPreferences e = w.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    public static final SharedPreferences f = w.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (cw3.a.contains(lx9.class)) {
            return null;
        }
        try {
            lx9 lx9Var = a;
            return lx9Var.a(lx9Var.e(context, BillingClient.ProductType.INAPP, obj));
        } catch (Throwable th) {
            cw3.a(lx9.class, th);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        SharedPreferences sharedPreferences = f;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !Intrinsics.c(sharedPreferences.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:6:0x000c, B:9:0x0015, B:13:0x002f, B:21:0x0029, B:17:0x001f), top: B:5:0x000c, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class b(Context context, String str) {
        Class<?> loadClass;
        HashMap hashMap = c;
        Set set = cw3.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            Class cls = (Class) hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            if (!set.contains(qx9.class)) {
                try {
                    loadClass = context.getClassLoader().loadClass(str);
                } catch (ClassNotFoundException unused) {
                } catch (Throwable th) {
                    cw3.a(qx9.class, th);
                }
                if (loadClass != null) {
                    hashMap.put(str, loadClass);
                }
                return loadClass;
            }
            loadClass = null;
            if (loadClass != null) {
            }
            return loadClass;
        } catch (Throwable th2) {
            cw3.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method c(Class cls, String str) {
        Class[] clsArr;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            HashMap hashMap = b;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            int hashCode = str.hashCode();
            Class cls2 = Integer.TYPE;
            switch (hashCode) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        cls2.getClass();
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        cls2.getClass();
                        clsArr = new Class[]{cls2, String.class, String.class};
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
                        cls2.getClass();
                        clsArr = new Class[]{cls2, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        cls2.getClass();
                        clsArr = new Class[]{cls2, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            Method y = clsArr == null ? qx9.y(cls, str, null) : qx9.y(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (y != null) {
                hashMap.put(str, y);
            }
            return y;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final ArrayList d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Context context2 = context;
            Object obj2 = obj;
            if (i(context2, BillingClient.ProductType.INAPP, obj2)) {
                int i = 0;
                boolean z = false;
                String str = null;
                while (true) {
                    Object h = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj2, new Object[]{6, d, BillingClient.ProductType.INAPP, str, new Bundle()});
                    if (h != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i < 30 || str == null || z) {
                                break;
                                break;
                            }
                            context2 = context;
                            obj2 = obj;
                        }
                    }
                    str = null;
                    if (i < 30) {
                        break;
                    }
                    context2 = context;
                    obj2 = obj;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final ArrayList e(Context context, String str, Object obj) {
        lx9 lx9Var;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && i(context, str, obj)) {
                int i = 0;
                String str2 = null;
                while (true) {
                    lx9Var = this;
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object h = lx9Var.h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, d, str, str2});
                        if (h != null) {
                            Bundle bundle = (Bundle) h;
                            if (bundle.getInt("RESPONSE_CODE") == 0) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                if (stringArrayList == null) {
                                    break;
                                }
                                i += stringArrayList.size();
                                arrayList.addAll(stringArrayList);
                                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                if (i < 30 || str2 == null) {
                                    break;
                                    break;
                                }
                                this = lx9Var;
                                context = context2;
                                obj = obj2;
                            }
                        }
                        str2 = null;
                        if (i < 30) {
                            break;
                        }
                        this = lx9Var;
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th) {
                        th = th;
                        cw3.a(lx9Var, th);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            lx9Var = this;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z) {
        lx9 lx9Var;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                lx9Var = this;
                try {
                    Object h = lx9Var.h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, d, z ? BillingClient.ProductType.SUBS : BillingClient.ProductType.INAPP, bundle});
                    if (h != null) {
                        Bundle bundle2 = (Bundle) h;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    Object obj2 = arrayList.get(i);
                                    obj2.getClass();
                                    String str = stringArrayList.get(i);
                                    str.getClass();
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            lx9Var.k(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cw3.a(lx9Var, th);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
            lx9Var = this;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c2;
        if (!cw3.a.contains(this)) {
            try {
                Class b2 = b(context, str);
                if (b2 != null && (c2 = c(b2, str2)) != null) {
                    return qx9.B(b2, obj, c2, Arrays.copyOf(objArr, objArr.length));
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final boolean i(Context context, String str, Object obj) {
        lx9 lx9Var;
        if (!cw3.a.contains(this) && obj != null) {
            try {
                lx9Var = this;
            } catch (Throwable th) {
                th = th;
                lx9Var = this;
            }
            try {
                Object h = lx9Var.h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, d, str});
                if (h != null) {
                    if (((Integer) h).intValue() == 0) {
                        return true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                cw3.a(lx9Var, th);
                return false;
            }
        }
        return false;
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        List split$default;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = e.getString(str, null);
                if (string != null) {
                    split$default = StringsKt__StringsKt.split$default(string, new String[]{";"}, false, 2, 2, null);
                    if (currentTimeMillis - Long.parseLong((String) split$default.get(0)) < 43200) {
                        str.getClass();
                        linkedHashMap.put(str, split$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
