package defpackage;

import android.os.Bundle;
import com.facebook.internal.k0;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ffi {
    public static boolean b;
    public static final ffi a = new ffi();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();

    public static final void d(Bundle bundle) {
        ffi ffiVar = a;
        HashMap hashMap = d;
        if (cw3.a.contains(ffi.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    String valueOf = String.valueOf(bundle.get(str));
                    HashMap hashMap2 = c;
                    boolean z = false;
                    boolean z2 = hashMap2.get(str) != null;
                    boolean z3 = hashMap.get(str) != null;
                    if (z2 || z3) {
                        Set set = (Set) hashMap2.get(str);
                        if (!cw3.a.contains(ffiVar) && set != null) {
                            try {
                                Set set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (new Regex((String) it.next()).f(valueOf)) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                cw3.a(ffiVar, th);
                            }
                        }
                        boolean b2 = ffiVar.b(valueOf, (Set) hashMap.get(str));
                        if (!z && !b2) {
                            str.getClass();
                            arrayList.add(str);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bundle.remove((String) it2.next());
                }
            }
        } catch (Throwable th2) {
            cw3.a(ffi.class, th2);
        }
    }

    public final void a(JSONArray jSONArray) {
        HashMap hashMap = c;
        HashMap hashMap2 = d;
        if (cw3.a.contains(this) || jSONArray == null) {
            return;
        }
        try {
            if (b) {
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(U3.i.W);
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray(U3.i.X);
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray2.getJSONObject(i2).getBoolean("require_exact_match");
                            HashSet c2 = c(jSONArray2.getJSONObject(i2).getJSONArray("potential_matches"));
                            if (z) {
                                HashSet hashSet = (HashSet) hashMap2.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(c2);
                                    c2 = hashSet;
                                }
                                hashMap2.put(string, c2);
                            } else {
                                HashSet hashSet2 = (HashSet) hashMap.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(c2);
                                    c2 = hashSet2;
                                }
                                hashMap.put(string, c2);
                            }
                        }
                    } catch (Exception unused) {
                        hashMap2.remove(string);
                        hashMap.remove(string);
                    }
                }
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final boolean b(String str, Set set) {
        if (!cw3.a.contains(this) && set != null) {
            try {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        Locale locale = Locale.ROOT;
                        String lowerCase = str2.toLowerCase(locale);
                        lowerCase.getClass();
                        String lowerCase2 = str.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (lowerCase.equals(lowerCase2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        }
        return false;
    }

    public final HashSet c(JSONArray jSONArray) {
        try {
            if (cw3.a.contains(this)) {
                return null;
            }
            try {
                HashSet e = k0.e(jSONArray);
                return e == null ? new HashSet() : e;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }
}
