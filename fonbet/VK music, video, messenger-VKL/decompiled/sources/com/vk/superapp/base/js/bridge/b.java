package com.vk.superapp.base.js.bridge;

import android.webkit.WebView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.superapp.base.js.bridge.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.b9y;
import xsna.bd6;
import xsna.e43;
import xsna.go9;
import xsna.ho8;
import xsna.kmk;
import xsna.n6j;
import xsna.wv4;
import xsna.x9y;
import xsna.xgx0;
import xsna.yok;

/* compiled from: BaseJsBridge.kt */
/* loaded from: classes6.dex */
public abstract class b {
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final a c = new a();
    public final Gson d = new GsonBuilder().registerTypeAdapter(Responses$ClientError.class, VkClientErrorSerializer.a).registerTypeHierarchyAdapter(a.InterfaceC1867a.class, ErrorDataSerializer.a).create();

    /* compiled from: BaseJsBridge.kt */
    public static final class a {
        public final void a(JsMethod jsMethod, x9y x9yVar, boolean z) {
            x9y c = x9yVar.c();
            List<String> list = C1868b.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (c.b.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c.o((String) it.next(), "HIDE");
            }
            String k = x9yVar.q("type").k();
            String str = z ? "send event instantly" : "send event";
            xgx0 xgx0Var = xgx0.a;
            StringBuilder b = ho8.b(str, ": ");
            n6j.b(b, jsMethod.a, ", eventName=", k, " json=");
            b.append(c);
            String sb = b.toString();
            xgx0Var.getClass();
            xgx0.a(sb);
        }
    }

    /* compiled from: BaseJsBridge.kt */
    /* renamed from: com.vk.superapp.base.js.bridge.b$b, reason: collision with other inner class name */
    public static final class C1868b {
        public static final List<String> a = e43.l(SharedKt.PARAM_ACCESS_TOKEN, "token", "secret");
    }

    public static void o(b bVar, JsMethod jsMethod, com.vk.superapp.base.js.bridge.a aVar, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        Gson gson = bVar.d;
        ConcurrentHashMap concurrentHashMap = bVar.b;
        x9y h = gson.toJsonTree(aVar).h();
        b9y q = h.q("data");
        x9y h2 = q != null ? q.h() : null;
        if (str2 == null) {
            str2 = (String) concurrentHashMap.get(jsMethod);
            concurrentHashMap.remove(jsMethod);
        }
        bVar.h(h, jsMethod, str2);
        if (h2 != null) {
            bVar.h(h2, jsMethod, str2);
        }
        if (h2 != null) {
            bVar.m(jsMethod.a, str, new JSONObject(h2.toString()));
        }
        bVar.c.a(jsMethod, h, false);
        WebView r = bVar.r();
        if (r != null) {
            r.post(new wv4(1, bVar, h));
        }
    }

    public static void p(b bVar, JsMethod jsMethod, bd6 bd6Var, yok yokVar, kmk kmkVar, boolean z, String str, int i) {
        Gson gson;
        if ((i & 4) != 0) {
            yokVar = null;
        }
        if ((i & 8) != 0) {
            kmkVar = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if (yokVar != null) {
            bVar.getClass();
            gson = new GsonBuilder().registerTypeAdapter(Responses$ClientError.class, VkClientErrorSerializer.a).registerTypeHierarchyAdapter(a.InterfaceC1867a.class, ErrorDataSerializer.a).registerTypeAdapter(yokVar.a, yokVar.b).create();
        } else {
            gson = bVar.d;
        }
        x9y h = gson.toJsonTree(bd6Var).h();
        b9y q = h.q("data");
        x9y h2 = q != null ? q.h() : null;
        bVar.h(h, jsMethod, null);
        if (h2 != null) {
            bVar.h(h2, jsMethod, null);
        }
        if (kmkVar != null) {
            bVar.l(kmkVar);
        }
        if (h2 != null) {
            bVar.m(jsMethod.a, str, new JSONObject(h2.toString()));
        }
        if (z) {
            bVar.c.a(jsMethod, h, false);
        }
        WebView r = bVar.r();
        if (r != null) {
            r.post(new wv4(1, bVar, h));
        }
        bVar.b.remove(jsMethod);
    }

    public final void h(x9y x9yVar, JsMethod jsMethod, String str) {
        if (str == null) {
            str = (String) this.b.get(jsMethod);
        }
        if (x9yVar.b.containsKey(CommonUrlParts.REQUEST_ID) || str == null) {
            return;
        }
        x9yVar.o(CommonUrlParts.REQUEST_ID, str);
    }

    public final String i(JsMethod jsMethod) {
        return (String) this.b.get(jsMethod);
    }

    public final boolean j(JsMethod jsMethod) {
        return this.b.get(jsMethod) != null;
    }

    public final void k(JsMethod jsMethod, String str) {
        this.b.put(jsMethod, str);
    }

    public final void n(JsMethod jsMethod, bd6 bd6Var) {
        x9y h = this.d.toJsonTree(bd6Var).h();
        b9y q = h.q("data");
        x9y h2 = q != null ? q.h() : null;
        h(h, jsMethod, null);
        if (h2 != null) {
            h(h2, jsMethod, null);
        }
        if (h2 != null) {
            m(jsMethod.a, null, new JSONObject(h.toString()));
        }
        this.c.a(jsMethod, h, true);
        q(h);
        this.b.remove(jsMethod);
    }

    public final void q(x9y x9yVar) {
        x9y x9yVar2 = new x9y();
        x9yVar2.l(x9yVar, "detail");
        String str = "window.dispatchEvent(new CustomEvent('VKWebAppEvent', " + x9yVar2 + "));";
        WebView r = r();
        if (r != null) {
            String b = go9.b("javascript:", str);
            try {
                r.evaluateJavascript(b, null);
            } catch (Exception unused) {
                r.loadUrl("javascript:" + b);
            }
        }
    }

    public abstract WebView r();

    public void l(kmk kmkVar) {
    }

    public void m(String str, String str2, JSONObject jSONObject) {
    }
}
