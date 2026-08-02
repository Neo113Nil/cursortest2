package com.mbridge.msdk.config.component.wei;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.U3;
import com.ironsource.Ua;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.r5l;
import defpackage.s5l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class WeiCpt extends com.mbridge.msdk.config.component.base.a implements d {
    ComponentWebView m;
    boolean n;
    boolean o;
    com.mbridge.msdk.config.component.wei.monitor.b p;
    com.mbridge.msdk.config.component.wei.monitor.a q;
    WebMessagePort r;
    final String h = "1100001";
    final String i = "1100002";
    final String j = "1100003";
    final String k = "1100004";
    final String l = "SenderPortKey_";
    HashMap<String, WebMessagePort> s = new HashMap<>();
    ConcurrentLinkedQueue<com.mbridge.msdk.config.component.wei.model.a> t = new ConcurrentLinkedQueue<>();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b extends WebMessagePort.WebMessageCallback {
        public b() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WeiCpt.this.a(webMessage);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        final /* synthetic */ WebMessagePort a;

        public c(WebMessagePort webMessagePort) {
            this.a = webMessagePort;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (!TextUtils.isEmpty(aVar.b())) {
            if (com.mbridge.msdk.config.component.common.util.c.c("320").equals(aVar.b())) {
                c(aVar);
                b(aVar);
            } else if (com.mbridge.msdk.config.component.common.util.c.c("322").equals(aVar.b())) {
                this.m.reload();
            } else if (com.mbridge.msdk.config.component.common.util.c.c("319").equals(aVar.b())) {
                if (this.m.getVisibility() != 0) {
                    this.m.setVisibility(0);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.c("325").equals(aVar.b())) {
                this.m.setVisibility(8);
            } else if (com.mbridge.msdk.config.component.common.util.c.c("321").equals(aVar.b())) {
                String a2 = com.mbridge.msdk.config.dynamic.baseview.webview.util.a.a(aVar.c());
                if (!TextUtils.isEmpty(a2)) {
                    d(a2);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.c("307").equals(aVar.b())) {
                if (this.m.getParent() != null && (this.m.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.m.getParent()).removeView(this.m);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.c("323").equals(aVar.b())) {
                if (this.m.canGoForward()) {
                    this.m.goForward();
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.c("324").equals(aVar.b()) && this.m.canGoBack()) {
                this.m.goBack();
            }
        }
        if (aVar.e() == null || aVar.e().isEmpty()) {
            return;
        }
        a(this.m, aVar.e());
    }

    private void b(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (TextUtils.isEmpty(aVar.g()) && TextUtils.isEmpty(aVar.d())) {
            if (this.m.hasXmlUrl()) {
                this.m.loadXMLUrl();
                return;
            } else {
                a("905004", "1100001", "Input parameter error");
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.g())) {
            if (TextUtils.isEmpty(aVar.d())) {
                return;
            }
            this.m.loadDataWithBaseURL("", aVar.d(), "text/html", C.UTF8_NAME, null);
            return;
        }
        String f = aVar.f();
        boolean isEmpty = TextUtils.isEmpty(f);
        ComponentWebView componentWebView = this.m;
        if (isEmpty) {
            componentWebView.loadUrl(aVar.g());
        } else {
            componentWebView.loadUrl(f);
        }
    }

    private void c(com.mbridge.msdk.config.component.wei.model.a aVar) {
        this.q = new com.mbridge.msdk.config.component.wei.monitor.a();
        this.p = new com.mbridge.msdk.config.component.wei.monitor.b(aVar.a());
        this.m.setWebViewEventListener(new a());
        if (aVar.i()) {
            this.p.a(this.m);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.m != null) {
            while (!this.t.isEmpty()) {
                com.mbridge.msdk.config.component.wei.model.a poll = this.t.poll();
                if (poll != null) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new s5l(0, this, poll));
                }
            }
        }
        a("905007", (HashMap<String, Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(String str) {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements com.mbridge.msdk.config.dynamic.baseview.webview.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageFinished(WebView webView, String str) {
            WeiCpt.this.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.n || weiCpt.o) {
                return;
            }
            weiCpt.o = true;
            weiCpt.a(weiCpt.a("905003", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WeiCpt.this.q.b(webView);
            WeiCpt.this.q.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905002", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.o || weiCpt.n) {
                return;
            }
            weiCpt.n = true;
            weiCpt.a("905004", String.valueOf(i), str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onRenderProcessGone(WebView webView) {
            WeiCpt.this.a("905005", "1100003", "WebView did crash");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND), "redirect");
            HashMap hashMap2 = new HashMap();
            hashMap2.put(com.mbridge.msdk.config.component.common.util.c.c("url"), str);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("data"), hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(com.mbridge.msdk.config.component.common.util.c.c("js_interaction"), hashMap);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905006", (Map<String, Object>) hashMap3));
            return false;
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onProgressChanged(WebView webView, int i) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }
    }

    public void d(String str) {
        try {
            ComponentWebView componentWebView = this.m;
            if (componentWebView == null || componentWebView.isDestroyed()) {
                return;
            }
            this.m.evaluateJavascript(str, new r5l(0));
        } catch (Throwable th) {
            q0.b("WeiCpt", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public synchronized void b(Map<String, Object> map) {
        try {
            this.f = "905001";
            com.mbridge.msdk.config.component.wei.model.a aVar = new com.mbridge.msdk.config.component.wei.model.a(map);
            this.t.add(aVar);
            ViewGroup e = e();
            if (e == null) {
                return;
            }
            if (!TextUtils.isEmpty(aVar.h())) {
                View findViewWithTag = e.findViewWithTag(aVar.h());
                if (findViewWithTag instanceof WebView) {
                    this.m = (ComponentWebView) findViewWithTag;
                }
            } else {
                this.m = (ComponentWebView) com.mbridge.msdk.config.dynamic.utils.d.a(e, ComponentWebView.class);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        String str;
        String str2;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = this.a.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
                str = "";
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("116"));
                    Object obj3 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("125"));
                    String valueOf = obj2 instanceof String ? String.valueOf(obj2) : "";
                    str2 = obj3 instanceof String ? String.valueOf(obj3) : "";
                    str = valueOf;
                } else {
                    str2 = "";
                }
                Object obj4 = map.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
                if (obj4 instanceof Map) {
                    Object obj5 = ((Map) obj4).get(com.mbridge.msdk.config.component.common.util.c.c("116"));
                    Object obj6 = ((Map) obj4).get(com.mbridge.msdk.config.component.common.util.c.c("125"));
                    if (obj5 instanceof String) {
                        String str3 = (String) obj5;
                        if (!TextUtils.isEmpty(str3)) {
                            return str3.equals(str);
                        }
                    }
                    if (obj6 instanceof String) {
                        String str4 = (String) obj6;
                        return !TextUtils.isEmpty(str4) && str4.hashCode() == str2.hashCode();
                    }
                }
            } catch (Throwable th) {
                q0.b("WeiCpt", th.getMessage(), th);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WebView webView) {
        WebMessagePort[] createWebMessageChannel = webView.createWebMessageChannel();
        this.r = createWebMessageChannel[0];
        webView.postWebMessage(new WebMessage("port_ready", new WebMessagePort[]{createWebMessageChannel[1]}), Uri.EMPTY);
        this.r.setWebMessageCallback(new b());
    }

    public void a(WebMessage webMessage) {
        if (webMessage == null) {
            return;
        }
        String data = webMessage.getData();
        if (TextUtils.isEmpty(data)) {
            return;
        }
        try {
            Map<String, Object> a2 = new e().a(data);
            String valueOf = String.valueOf(a2.get(com.mbridge.msdk.config.component.common.util.c.c("action")));
            String str = "SenderPortKey_" + System.currentTimeMillis() + "_" + valueOf;
            WebMessagePort[] ports = webMessage.getPorts();
            if (ports != null && ports.length > 0) {
                this.s.put(str, ports[0]);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(U3.i.K, this.m);
            hashMap.put("superview", this.m.getParent());
            HashMap hashMap2 = new HashMap();
            hashMap2.put(com.mbridge.msdk.config.component.common.util.c.c("action"), valueOf);
            hashMap2.put(com.mbridge.msdk.config.component.common.util.c.c("reply_name"), str);
            Object obj = a2.get(com.mbridge.msdk.config.component.common.util.c.c("data"));
            String c2 = com.mbridge.msdk.config.component.common.util.c.c("data");
            if (obj == null) {
                obj = "";
            }
            hashMap2.put(c2, obj);
            hashMap2.put(com.mbridge.msdk.config.component.common.util.c.c("type"), "mv");
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("js_interaction"), hashMap2);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("click_x"), String.valueOf(this.m.getxInScreen()));
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("click_y"), String.valueOf(this.m.getyInScreen()));
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("click_time"), String.valueOf(this.m.getClickTimeStamp()));
            a(a("905006", (Map<String, Object>) hashMap));
        } catch (Throwable th) {
            q0.b("WeiCpt", th.getMessage(), th);
        }
    }

    public void a(WebView webView, List<Map<String, Object>> list) {
        String valueOf;
        WebMessage webMessage;
        WebMessagePort webMessagePort;
        for (Map<String, Object> map : list) {
            try {
                valueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND)));
                Map<String, Object> a2 = com.mbridge.msdk.config.component.common.util.c.a(map);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                if (a2.containsKey(com.mbridge.msdk.config.component.common.util.c.c("128"))) {
                    try {
                        jSONObject2 = new JSONObject((Map) a2.get(com.mbridge.msdk.config.component.common.util.c.c("128")));
                    } catch (Exception e) {
                        q0.b("WeiCpt", e.getMessage(), e);
                    }
                }
                jSONObject.put(com.mbridge.msdk.config.component.common.util.c.c("action"), valueOf);
                jSONObject.put(com.mbridge.msdk.config.component.common.util.c.c("data"), jSONObject2);
                webMessage = new WebMessage(jSONObject.toString());
            } catch (Throwable th) {
                q0.b("WeiCpt", th.getMessage(), th);
            }
            if (this.s.containsKey(valueOf) && (webMessagePort = this.s.get(valueOf)) != null) {
                webMessagePort.postMessage(webMessage);
                this.s.remove(valueOf);
                this.m.postDelayed(new c(webMessagePort), Ua.C);
                return;
            } else {
                WebMessagePort webMessagePort2 = this.r;
                if (webMessagePort2 != null) {
                    webMessagePort2.postMessage(webMessage);
                } else {
                    webView.postWebMessage(webMessage, Uri.EMPTY);
                }
            }
        }
    }
}
