package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yjk {
    public static final yjk a = new yjk();
    public static final Set b = ph0.a0(new String[]{"fb_content_ids", "fb_content_id"});
    public static boolean c;
    public static volatile xjk d;

    public static final void f(Bundle bundle, String str) {
        xjk xjkVar;
        Pattern pattern;
        Matcher matcher;
        String obj;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        if (cw3.a.contains(yjk.class)) {
            return;
        }
        try {
            str.getClass();
            if (c && bundle != null && !bundle.isEmpty() && (xjkVar = d) != null) {
                Set set = xjkVar.c;
                if (set == null || set.isEmpty() || set.contains(str)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    boolean z = false;
                    for (wjk wjkVar : xjkVar.a) {
                        int i = wjkVar.a;
                        if (i == 1) {
                            Set<String> keySet = bundle.keySet();
                            keySet.getClass();
                            for (String str2 : CollectionsKt.S0(keySet)) {
                                Object obj2 = bundle.get(str2);
                                if (obj2 != null && (obj = obj2.toString()) != null) {
                                    Pattern pattern2 = wjkVar.b;
                                    boolean find = (pattern2 == null || (matcher4 = pattern2.matcher(str2)) == null) ? true : matcher4.find();
                                    Pattern pattern3 = wjkVar.c;
                                    boolean z2 = find && !((pattern3 == null || (matcher3 = pattern3.matcher(str2)) == null) ? false : matcher3.find());
                                    Pattern pattern4 = wjkVar.d;
                                    boolean find2 = (pattern4 == null || (matcher2 = pattern4.matcher(obj)) == null) ? true : matcher2.find();
                                    if (z2 && find2) {
                                        linkedHashSet.add(str2);
                                        z = true;
                                    }
                                }
                            }
                        } else if (i == 3 && (pattern = wjkVar.b) != null && pattern.matcher(str).find()) {
                            Pattern pattern5 = wjkVar.c;
                            if (!((pattern5 == null || (matcher = pattern5.matcher(str)) == null) ? false : matcher.find())) {
                                linkedHashSet2.add("1");
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        if (!xjkVar.d && !xjkVar.b.isEmpty()) {
                            Set<String> keySet2 = bundle.keySet();
                            keySet2.getClass();
                            for (String str3 : CollectionsKt.S0(keySet2)) {
                                if (!xjkVar.b.contains(str3)) {
                                    if (b.contains(str3)) {
                                        bundle.putString(str3, "_removed_");
                                    } else {
                                        bundle.remove(str3);
                                    }
                                }
                            }
                            a.g(bundle);
                        }
                        bundle.putString("vvp", "1");
                        if (linkedHashSet.isEmpty() && linkedHashSet2.isEmpty()) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (!linkedHashSet.isEmpty()) {
                            jSONObject.put("vp_rp", new JSONArray((Collection) CollectionsKt.S0(linkedHashSet)));
                        }
                        if (!linkedHashSet2.isEmpty()) {
                            jSONObject.put("vp_rp_ev", new JSONArray((Collection) CollectionsKt.S0(linkedHashSet2)));
                        }
                        bundle.putString("vvp_md", jSONObject.toString());
                    }
                }
            }
        } catch (Throwable th) {
            cw3.a(yjk.class, th);
        }
    }

    public final Pattern a(String str, JSONObject jSONObject) {
        if (!cw3.a.contains(this)) {
            try {
                if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                    String optString = jSONObject.optString(str, "");
                    optString.getClass();
                    if (optString.length() != 0) {
                        try {
                            return Pattern.compile(optString, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final xjk b(String str) {
        if (!cw3.a.contains(this)) {
            try {
                str.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.optBoolean("enabled", false)) {
                        List d2 = d(jSONObject);
                        if (!d2.isEmpty()) {
                            return new xjk(d2, e(jSONObject), c(jSONObject), jSONObject.optBoolean("isShadowEnabled", true));
                        }
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final HashSet c(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (!cw3.a.contains(this)) {
            try {
                if (jSONObject.has("inScopeEventNames") && !jSONObject.isNull("inScopeEventNames") && (optJSONArray = jSONObject.optJSONArray("inScopeEventNames")) != null) {
                    HashSet hashSet = new HashSet();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray.optString(i, "");
                        optString.getClass();
                        if (optString.length() > 0) {
                            hashSet.add(optString);
                        }
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:6:0x000a, B:8:0x0012, B:10:0x0017, B:12:0x0023, B:17:0x002a, B:23:0x0067, B:38:0x0060, B:26:0x0034, B:31:0x0042, B:35:0x0059), top: B:5:0x000a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d(JSONObject jSONObject) {
        int optInt;
        wjk wjkVar;
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("rules");
            if (optJSONArray == null) {
                return km5.a;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    if (!cw3.a.contains(this)) {
                        try {
                            optInt = optJSONObject.optInt("place", -1);
                        } catch (Throwable th) {
                            cw3.a(this, th);
                        }
                        if (optInt == 1 || optInt == 3) {
                            Pattern a2 = a("keyRegex", optJSONObject);
                            Pattern a3 = a("keyNegativeRegex", optJSONObject);
                            Pattern a4 = a("valueRegex", optJSONObject);
                            if (a2 != null || a4 != null) {
                                wjkVar = new wjk(optInt, a2, a3, a4);
                                if (wjkVar == null) {
                                    arrayList.add(wjkVar);
                                }
                            }
                        }
                    }
                    wjkVar = null;
                    if (wjkVar == null) {
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            cw3.a(this, th2);
            return null;
        }
    }

    public final Set e(JSONObject jSONObject) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("standardParams");
            if (optJSONObject == null) {
                return rm5.a;
            }
            HashSet hashSet = new HashSet();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.optBoolean(next, false)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final void g(Bundle bundle) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            bundle.getClass();
            String string = bundle.getString("fb_content");
            if (string == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && optJSONObject.has("id")) {
                        optJSONObject.put("id", "_removed_");
                        z = true;
                    }
                }
                if (z) {
                    bundle.putString("fb_content", jSONArray.toString());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
