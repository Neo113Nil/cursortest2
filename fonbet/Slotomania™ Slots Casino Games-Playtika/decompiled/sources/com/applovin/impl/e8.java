package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e8 implements s4 {
    private List a;
    private List b;
    private int c;
    private Uri d;
    private final Set e;
    private x7 f;
    private final Map g;

    private e8() {
        this.a = Collections.emptyList();
        this.b = Collections.emptyList();
        this.e = new HashSet();
        this.g = new HashMap();
    }

    public static e8 a(q8 q8Var, e8 e8Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        q8 c;
        x7 a;
        List a2;
        q8 c2;
        List a3;
        q8 c3;
        int a4;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (v7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (e8Var == null) {
            try {
                e8Var = new e8(v7Var);
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastVideoCreative", "Error occurred while initializing", th);
                }
                lVar.E().a("VastVideoCreative", th);
                return null;
            }
        }
        if (e8Var.c == 0 && (c3 = q8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s)) != null && (a4 = a(c3.d(), lVar)) > 0) {
            e8Var.c = a4;
        }
        q8 c4 = q8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t);
        if (c4 != null && (a3 = a(c4, lVar)) != null && a3.size() > 0) {
            List list = e8Var.a;
            if (list != null) {
                a3.addAll(list);
            }
            e8Var.a = a3;
        }
        q8 c5 = q8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x);
        if (c5 != null) {
            if (e8Var.d == null && (c2 = c5.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y)) != null) {
                String d = c2.d();
                if (StringUtils.isValidString(d)) {
                    e8Var.d = Uri.parse(d);
                }
            }
            d8.a(c5.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z), e8Var.e, v7Var, lVar);
        }
        q8 c6 = q8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B);
        if (c6 != null && (a = x7.a((c = c6.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C)), lVar)) != null) {
            q8 c7 = c.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G);
            if (c7 != null && (a2 = c7.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I)) != null) {
                d8.a(a2, a.a, v7Var, lVar);
            }
            List a5 = c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J);
            if (a5 != null) {
                d8.a(a5, a.b, v7Var, lVar);
            }
            e8Var.f = a;
        }
        d8.a(q8Var, e8Var.g, v7Var, lVar);
        return e8Var;
    }

    public Set b() {
        return this.e;
    }

    public Uri c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    public Map e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        if (this.c != e8Var.c) {
            return false;
        }
        List list = this.a;
        if (list == null ? e8Var.a != null : !list.equals(e8Var.a)) {
            return false;
        }
        Uri uri = this.d;
        if (uri == null ? e8Var.d != null : !uri.equals(e8Var.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? e8Var.e != null : !set.equals(e8Var.e)) {
            return false;
        }
        Map map = this.g;
        Map map2 = e8Var.g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public x7 f() {
        return this.f;
    }

    public List g() {
        return this.a;
    }

    public int hashCode() {
        List list = this.a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.c) * 31;
        Uri uri = this.d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.g;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.a + ", durationSeconds=" + this.c + ", destinationUri=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.g + ", industryIcon=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    private e8(v7 v7Var) {
        this.a = Collections.emptyList();
        this.b = Collections.emptyList();
        this.e = new HashSet();
        this.g = new HashMap();
        this.b = v7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.l lVar) {
        try {
            if (CollectionUtils.explode(str, ":").size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        List a = q8Var.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u);
        ArrayList arrayList = new ArrayList(a.size());
        List<String> explode = CollectionUtils.explode((String) lVar.a(z4.X4));
        List<String> explode2 = CollectionUtils.explode((String) lVar.a(z4.W4));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            f8 a2 = f8.a((q8) it.next(), lVar);
            if (a2 != null) {
                try {
                    String c = a2.c();
                    if (StringUtils.isValidString(c) && !explode.contains(c)) {
                        arrayList.add(a2);
                    } else {
                        if (((Boolean) lVar.a(z4.Y4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a2.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a2);
                            }
                        }
                        lVar.Q();
                        if (com.applovin.impl.sdk.p.a()) {
                            lVar.Q().k("VastVideoCreative", "Video file not supported: " + a2);
                        }
                    }
                } catch (Throwable th) {
                    lVar.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        lVar.Q().a("VastVideoCreative", "Failed to validate video file: " + a2, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public f8 a(long j) {
        List list = this.a;
        f8 f8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<f8> arrayList = new ArrayList(3);
        for (String str : this.b) {
            for (f8 f8Var2 : this.a) {
                String c = f8Var2.c();
                if (StringUtils.isValidString(c) && str.equalsIgnoreCase(c)) {
                    arrayList.add(f8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.a;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.applovin.impl.e8$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a;
                a = e8.a((f8) obj, (f8) obj2);
                return a;
            }
        });
        for (f8 f8Var3 : arrayList) {
            if (f8Var3.b() > j) {
                break;
            }
            f8Var = f8Var3;
        }
        return f8Var != null ? f8Var : (f8) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f8 f8Var, f8 f8Var2) {
        return Long.compare(f8Var.b(), f8Var2.b());
    }

    public static e8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        e8 e8Var = new e8();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "video_files", new JSONArray());
        e8Var.a = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            f8 a = f8.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), lVar);
            if (a != null) {
                e8Var.a.add(a);
            }
        }
        e8Var.b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.emptyList());
        e8Var.c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        e8Var.d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            b8 a2 = b8.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), lVar);
            if (a2 != null) {
                e8Var.e.add(a2);
            }
        }
        e8Var.f = x7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), lVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = keys.next();
            JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, next, new JSONArray());
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                b8 a3 = b8.a(JsonUtils.getJSONObject(jSONArray3, i3, (JSONObject) null), lVar);
                if (a3 != null) {
                    hashSet.add(a3);
                }
            }
            e8Var.g.put(next, hashSet);
        }
        return e8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((f8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.c);
        Uri uri = this.d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((b8) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        x7 x7Var = this.f;
        if (x7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", x7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.g.keySet()) {
            Set set = (Set) this.g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((b8) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
