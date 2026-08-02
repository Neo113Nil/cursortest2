package com.facebook;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C4227o2;
import com.ironsource.U3;
import com.moloco.sdk.acm.db.MetricsDb;
import defpackage.i9a;
import defpackage.km5;
import defpackage.tub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements com.facebook.internal.j0 {
    public final /* synthetic */ int a;

    public b(b bVar) {
        this.a = 13;
    }

    public static FrameLayout c(Context context, WebView webView) {
        context.getClass();
        webView.getClass();
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(webView, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static List d(JSONArray jSONArray) {
        com.moloco.sdk.internal.publisher.nativead.model.e cVar;
        com.moloco.sdk.internal.publisher.nativead.model.e bVar;
        if (jSONArray == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("id")) {
                int i2 = jSONObject.getInt("id");
                boolean z = jSONObject.optInt("required", 0) == 1;
                JSONObject optJSONObject = jSONObject.optJSONObject("title");
                com.moloco.sdk.internal.publisher.nativead.model.e eVar = null;
                if (optJSONObject == null) {
                    cVar = null;
                } else {
                    String string = optJSONObject.getString("text");
                    string.getClass();
                    if (optJSONObject.has("len")) {
                        optJSONObject.getInt("len");
                    }
                    cVar = new com.moloco.sdk.internal.publisher.nativead.model.c(i2, string, z);
                }
                if (cVar == null) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("img");
                    if (optJSONObject2 == null) {
                        bVar = null;
                    } else {
                        if (optJSONObject2.has("type")) {
                            optJSONObject2.getInt("type");
                        }
                        String string2 = optJSONObject2.getString("url");
                        string2.getClass();
                        if (optJSONObject2.has("w")) {
                            optJSONObject2.getInt("w");
                        }
                        if (optJSONObject2.has(com.mbridge.msdk.foundation.same.report.h.b)) {
                            optJSONObject2.getInt(com.mbridge.msdk.foundation.same.report.h.b);
                        }
                        bVar = new com.moloco.sdk.internal.publisher.nativead.model.b(i2, string2, z);
                    }
                    if (bVar == null) {
                        JSONObject optJSONObject3 = jSONObject.optJSONObject("video");
                        if (optJSONObject3 == null) {
                            bVar = null;
                        } else {
                            String string3 = optJSONObject3.getString("vasttag");
                            string3.getClass();
                            bVar = new com.moloco.sdk.internal.publisher.nativead.model.d(i2, string3, z);
                        }
                        if (bVar == null) {
                            JSONObject optJSONObject4 = jSONObject.optJSONObject("data");
                            if (optJSONObject4 != null) {
                                if (optJSONObject4.has("type")) {
                                    optJSONObject4.getInt("type");
                                }
                                if (optJSONObject4.has("len")) {
                                    optJSONObject4.getInt("len");
                                }
                                String string4 = optJSONObject4.getString(U3.i.X);
                                string4.getClass();
                                eVar = new com.moloco.sdk.internal.publisher.nativead.model.a(i2, string4, z);
                            }
                            cVar = eVar;
                        }
                    }
                    cVar = bVar;
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
        }
        return arrayList;
    }

    public static List f(JSONArray jSONArray) {
        if (jSONArray == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new com.moloco.sdk.internal.publisher.nativead.model.f(jSONObject.getInt("event"), jSONObject.getInt("method"), jSONObject.has("url") ? jSONObject.getString("url") : null));
        }
        return arrayList;
    }

    public static com.facebook.internal.k g() {
        return new com.facebook.internal.k(null, tub.f(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), tub.f(new Pair(102, null), new Pair(190, null), new Pair(Integer.valueOf(TTAdConstant.IMAGE_URL_CODE), null)), null, null, null);
    }

    public static void k(i0 i0Var, String str, String str2, Object... objArr) {
        str.getClass();
        synchronized (w.b) {
        }
    }

    public static HashMap l(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    int length2 = optJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        int optInt2 = optJSONArray2.optInt(i2);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    @Override // com.facebook.internal.j0
    public void a(JSONObject jSONObject) {
        String optString = jSONObject != null ? jSONObject.optString("id") : null;
        if (optString == null) {
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        k.f.j().a(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null), true);
    }

    @Override // com.facebook.internal.j0
    public void b(q qVar) {
        Objects.toString(qVar);
    }

    public MetricsDb e(Context context) {
        MetricsDb metricsDb;
        context.getClass();
        MetricsDb metricsDb2 = MetricsDb.b;
        if (metricsDb2 != null) {
            return metricsDb2;
        }
        synchronized (this) {
            try {
                metricsDb = MetricsDb.b;
                if (metricsDb == null) {
                    try {
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        metricsDb = (MetricsDb) i9a.w(applicationContext, MetricsDb.class, "metrics-db").b();
                        MetricsDb.b = metricsDb;
                    } catch (Exception e) {
                        throw new IllegalStateException("Database creation failed", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return metricsDb;
    }

    public synchronized com.facebook.internal.k h() {
        com.facebook.internal.k kVar;
        try {
            com.facebook.internal.u b = com.facebook.internal.x.b(w.b());
            if (b != null) {
                return b.e;
            }
            synchronized (com.facebook.internal.k.d) {
                kVar = com.facebook.internal.k.e;
                if (kVar == null) {
                    kVar = g();
                    com.facebook.internal.k.e = kVar;
                }
            }
            return kVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public i i() {
        i iVar;
        i iVar2 = i.g;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            iVar = i.g;
            if (iVar == null) {
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(w.a());
                localBroadcastManager.getClass();
                i iVar3 = new i(localBroadcastManager, new c(0));
                i.g = iVar3;
                iVar = iVar3;
            }
        }
        return iVar;
    }

    public synchronized k j() {
        k kVar;
        try {
            if (k.g == null) {
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(w.a());
                localBroadcastManager.getClass();
                k.g = new k(localBroadcastManager, new c(2), false);
            }
            kVar = k.g;
            if (kVar == null) {
                Intrinsics.i(C4227o2.p);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return kVar;
    }

    public synchronized void m(String str) {
        str.getClass();
        synchronized (w.b) {
        }
        synchronized (this) {
            str.getClass();
            com.facebook.internal.a0.b.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }

    public /* synthetic */ b(int i) {
        this.a = i;
    }
}
