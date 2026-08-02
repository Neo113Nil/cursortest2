package h6;

import T7.Y;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.appsflyer.AdRevenueScheme;
import g6.C4331C;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f47748c;

    /* renamed from: a, reason: collision with root package name */
    public static final K f47746a = new K();

    /* renamed from: b, reason: collision with root package name */
    public static final String f47747b = K.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f47749d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f47750e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f47751f = new ConcurrentHashMap();

    public static final String c() {
        if (Y7.a.d(K.class)) {
            return null;
        }
        try {
            if (!f47749d.get()) {
                f47746a.e();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f47750e);
            hashMap.putAll(f47746a.d());
            return Y.m0(hashMap);
        } catch (Throwable th2) {
            Y7.a.b(th2, K.class);
            return null;
        }
    }

    public static final void f() {
        if (Y7.a.d(K.class)) {
            return;
        }
        try {
            if (f47749d.get()) {
                return;
            }
            f47746a.e();
        } catch (Throwable th2) {
            Y7.a.b(th2, K.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        r4 = new java.lang.String[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(Map ud2) {
        List<String> split;
        if (Y7.a.d(K.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(ud2, "ud");
            if (!f47749d.get()) {
                f47746a.e();
            }
            for (Map.Entry entry : ud2.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Y y10 = Y.f11042a;
                K k10 = f47746a;
                int i10 = 1;
                int length = str2.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length) {
                    boolean z11 = Intrinsics.compare((int) str2.charAt(!z10 ? i11 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                String I02 = Y.I0(k10.h(str, str2.subSequence(i11, length + 1).toString()));
                ConcurrentHashMap concurrentHashMap = f47751f;
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    String[] strArr = null;
                    if (str3 != null && (split = new Regex(",").split(str3, 0)) != null) {
                        Object[] array = split.toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        strArr = (String[]) array;
                    }
                    Set mutableSetOf = SetsKt.mutableSetOf(Arrays.copyOf(strArr, strArr.length));
                    if (mutableSetOf.contains(I02)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(I02);
                    } else if (strArr.length < 5) {
                        sb2.append(str3);
                        sb2.append(",");
                        sb2.append(I02);
                    } else {
                        while (true) {
                            int i12 = i10 + 1;
                            sb2.append(strArr[i10]);
                            sb2.append(",");
                            if (i12 >= 5) {
                                break;
                            } else {
                                i10 = i12;
                            }
                        }
                        sb2.append(I02);
                        mutableSetOf.remove(strArr[0]);
                    }
                    f47751f.put(str, sb2.toString());
                } else {
                    concurrentHashMap.put(str, I02);
                }
            }
            K k11 = f47746a;
            Y y11 = Y.f11042a;
            k11.n("com.facebook.appevents.UserDataStore.internalUserData", Y.m0(f47751f));
        } catch (Throwable th2) {
            Y7.a.b(th2, K.class);
        }
    }

    public static final void j(final Bundle bundle) {
        if (Y7.a.d(K.class)) {
            return;
        }
        try {
            C4470F.f47729b.c().execute(new Runnable() { // from class: h6.I
                @Override // java.lang.Runnable
                public final void run() {
                    K.l(bundle);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, K.class);
        }
    }

    public static final void k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (Y7.a.d(K.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString("em", str);
            }
            if (str2 != null) {
                bundle.putString("fn", str2);
            }
            if (str3 != null) {
                bundle.putString("ln", str3);
            }
            if (str4 != null) {
                bundle.putString("ph", str4);
            }
            if (str5 != null) {
                bundle.putString("db", str5);
            }
            if (str6 != null) {
                bundle.putString("ge", str6);
            }
            if (str7 != null) {
                bundle.putString("ct", str7);
            }
            if (str8 != null) {
                bundle.putString("st", str8);
            }
            if (str9 != null) {
                bundle.putString("zp", str9);
            }
            if (str10 != null) {
                bundle.putString(AdRevenueScheme.COUNTRY, str10);
            }
            j(bundle);
        } catch (Throwable th2) {
            Y7.a.b(th2, K.class);
        }
    }

    public static final void l(Bundle bundle) {
        if (Y7.a.d(K.class)) {
            return;
        }
        try {
            if (!f47749d.get()) {
                Log.w(f47747b, "initStore should have been called before calling setUserData");
                f47746a.e();
            }
            K k10 = f47746a;
            k10.m(bundle);
            Y y10 = Y.f11042a;
            k10.n("com.facebook.appevents.UserDataStore.userData", Y.m0(f47750e));
            k10.n("com.facebook.appevents.UserDataStore.internalUserData", Y.m0(f47751f));
        } catch (Throwable th2) {
            Y7.a.b(th2, K.class);
        }
    }

    public static final void o(String key, String value) {
        if (Y7.a.d(K.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "$key");
            Intrinsics.checkNotNullParameter(value, "$value");
            if (!f47749d.get()) {
                f47746a.e();
            }
            SharedPreferences sharedPreferences = f47748c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(key, value).apply();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, K.class);
        }
    }

    public final Map d() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set b10 = i6.d.f48124d.b();
            for (String str : f47751f.keySet()) {
                if (b10.contains(str)) {
                    hashMap.put(str, f47751f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final synchronized void e() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f47749d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C4331C.l());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f47748c = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f47748c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f47750e.putAll(Y.i0(string));
            f47751f.putAll(Y.i0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final boolean g(String str) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return new Regex("[A-Fa-f0-9]{64}").matches(str);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final String h(String str, String str2) {
        String str3;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String obj = str2.subSequence(i10, length + 1).toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual("em", str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e(f47747b, "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if (Intrinsics.areEqual("ph", str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.areEqual("ge", str)) {
                    if (lowerCase.length() <= 0) {
                        str3 = "";
                    } else {
                        if (lowerCase == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        str3 = lowerCase.substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    if (!Intrinsics.areEqual("f", str3) && !Intrinsics.areEqual(X9.m.f13664a, str3)) {
                        Log.e(f47747b, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return str3;
                }
            }
            return lowerCase;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void m(Bundle bundle) {
        if (Y7.a.d(this) || bundle == null) {
            return;
        }
        try {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (obj != null) {
                    String obj2 = obj.toString();
                    if (g(obj2)) {
                        ConcurrentHashMap concurrentHashMap = f47750e;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = obj2.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        concurrentHashMap.put(key, lowerCase);
                    } else {
                        Y y10 = Y.f11042a;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        String I02 = Y.I0(h(key, obj2));
                        if (I02 != null) {
                            f47750e.put(key, I02);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void n(final String str, final String str2) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            C4331C.t().execute(new Runnable() { // from class: h6.J
                @Override // java.lang.Runnable
                public final void run() {
                    K.o(str, str2);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
