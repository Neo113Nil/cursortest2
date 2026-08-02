package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.d0;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.w;
import com.moloco.sdk.internal.publisher.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class stc {
    public static final stc a = new stc();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final List c = b.j("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
    public static final List d = b.j("none", "address", "health");

    public static final File d() {
        if (!cw3.a.contains(stc.class)) {
            try {
                rtc rtcVar = (rtc) b.get(lnb.b(2));
                if (rtcVar != null) {
                    return rtcVar.f;
                }
            } catch (Throwable th) {
                cw3.a(stc.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String[] f(int i, float[][] fArr, String[] strArr) {
        ktc ktcVar;
        if (!cw3.a.contains(stc.class)) {
            try {
                if (i == 0) {
                    throw null;
                }
                rtc rtcVar = (rtc) b.get(lnb.b(i));
                if (rtcVar != null && (ktcVar = rtcVar.g) != null) {
                    float[] fArr2 = rtcVar.e;
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    knb knbVar = new knb(new int[]{length, length2});
                    for (int i2 = 0; i2 < length; i2++) {
                        System.arraycopy(fArr[i2], 0, knbVar.c, i2 * length2, length2);
                    }
                    knb a2 = ktcVar.a(knbVar, strArr, lnb.a(i));
                    if (a2 != null && fArr2 != null && a2.c.length != 0 && fArr2.length != 0) {
                        int C = wt3.C(i);
                        stc stcVar = a;
                        if (C == 0) {
                            return stcVar.g(a2, fArr2);
                        }
                        if (C == 1) {
                            return stcVar.h(a2, fArr2);
                        }
                        throw new ndd();
                    }
                }
            } catch (Throwable th) {
                cw3.a(stc.class, th);
                return null;
            }
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    rtc q = hda.q(jSONObject.getJSONObject(keys.next()));
                    if (q != null) {
                        b.put(q.a, q);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (kotlin.text.StringsKt.J(r0, "en", false) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Locale locale;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            String str = null;
            for (Map.Entry entry : b.entrySet()) {
                String str2 = (String) entry.getKey();
                rtc rtcVar = (rtc) entry.getValue();
                if (Intrinsics.c(str2, lnb.b(2))) {
                    str = rtcVar.b;
                    i = Math.max(i, rtcVar.d);
                    if (q.b(o.SuggestedEvents) && !cw3.a.contains(this)) {
                        try {
                            try {
                                locale = w.a().getResources().getConfiguration().locale;
                            } catch (Exception unused) {
                                locale = null;
                            }
                            if (locale != null) {
                                String language = locale.getLanguage();
                                language.getClass();
                            }
                            rtcVar.h = new x(20);
                            arrayList.add(rtcVar);
                        } catch (Throwable th) {
                            cw3.a(this, th);
                        }
                    }
                }
                if (Intrinsics.c(str2, lnb.b(1))) {
                    str = rtcVar.b;
                    i = Math.max(i, rtcVar.d);
                    if (q.b(o.IntelligentIntegrity)) {
                        rtcVar.h = new x(21);
                        arrayList.add(rtcVar);
                    }
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            hda.w(new rtc("MTML", str, null, i, null), arrayList);
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    public final JSONObject c() {
        if (!cw3.a.contains(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                String str = d0.j;
                d0 B = h0.B(null, "app/model_asset", null);
                B.d = bundle;
                JSONObject jSONObject = B.c().b;
                if (jSONObject != null) {
                    return e(jSONObject);
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final String[] g(knb knbVar, float[] fArr) {
        if (!cw3.a.contains(this)) {
            try {
                int[] iArr = knbVar.a;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr2 = knbVar.c;
                if (i2 == fArr.length) {
                    IntRange j = llf.j(0, i);
                    ArrayList arrayList = new ArrayList(k13.r(j, 10));
                    v6a it = j.iterator();
                    while (it.c) {
                        int nextInt = it.nextInt();
                        Object obj = "none";
                        int length = fArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                                obj = d.get(i4);
                            }
                            i3++;
                            i4 = i5;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final String[] h(knb knbVar, float[] fArr) {
        if (!cw3.a.contains(this)) {
            try {
                int[] iArr = knbVar.a;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr2 = knbVar.c;
                if (i2 == fArr.length) {
                    IntRange j = llf.j(0, i);
                    ArrayList arrayList = new ArrayList(k13.r(j, 10));
                    v6a it = j.iterator();
                    while (it.c) {
                        int nextInt = it.nextInt();
                        Object obj = "other";
                        int length = fArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                                obj = c.get(i4);
                            }
                            i3++;
                            i4 = i5;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }
}
