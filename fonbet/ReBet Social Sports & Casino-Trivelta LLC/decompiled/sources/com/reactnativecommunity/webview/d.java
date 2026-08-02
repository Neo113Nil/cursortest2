package com.reactnativecommunity.webview;

import O2.f;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.scroll.OnScrollDispatchHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.google.android.gms.measurement.internal.W6;
import com.reactnativecommunity.webview.d;
import com.twilio.voice.EventKeys;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONException;
import org.json.JSONObject;
import pc.C6062b;

/* loaded from: classes4.dex */
public class d extends WebView implements LifecycleEventListener {

    /* renamed from: a, reason: collision with root package name */
    public String f41302a;

    /* renamed from: b, reason: collision with root package name */
    public String f41303b;

    /* renamed from: c, reason: collision with root package name */
    public e f41304c;

    /* renamed from: d, reason: collision with root package name */
    public f.a f41305d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41306e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41307f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41308g;

    /* renamed from: h, reason: collision with root package name */
    public String f41309h;

    /* renamed from: i, reason: collision with root package name */
    public RNCWebViewMessagingModule f41310i;

    /* renamed from: j, reason: collision with root package name */
    public g f41311j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41312k;

    /* renamed from: l, reason: collision with root package name */
    public OnScrollDispatchHelper f41313l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41314m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41315n;

    /* renamed from: o, reason: collision with root package name */
    public C0592d f41316o;

    /* renamed from: p, reason: collision with root package name */
    public List f41317p;

    /* renamed from: q, reason: collision with root package name */
    public WebChromeClient f41318q;

    /* renamed from: r, reason: collision with root package name */
    public String f41319r;

    public class a extends ActionMode.Callback2 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActionMode.Callback f41320a;

        /* renamed from: com.reactnativecommunity.webview.d$a$a, reason: collision with other inner class name */
        public class C0591a implements ValueCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MenuItem f41322a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WritableMap f41323b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ActionMode f41324c;

            public C0591a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.f41322a = menuItem;
                this.f41323b = writableMap;
                this.f41324c = actionMode;
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                String str2;
                Map map = (Map) d.this.f41317p.get(this.f41322a.getItemId());
                this.f41323b.putString(AnnotatedPrivateKey.LABEL, (String) map.get(AnnotatedPrivateKey.LABEL));
                this.f41323b.putString("key", (String) map.get("key"));
                try {
                    str2 = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    str2 = "";
                }
                this.f41323b.putString("selectedText", str2);
                d dVar = d.this;
                dVar.g(dVar, new C6062b(p.a(d.this), this.f41323b));
                this.f41324c.finish();
            }
        }

        public a(ActionMode.Callback callback) {
            this.f41320a = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            d.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C0591a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i10 = 0; i10 < d.this.f41317p.size(); i10++) {
                menu.add(0, i10, i10, (CharSequence) ((Map) d.this.f41317p.get(i10)).get(AnnotatedPrivateKey.LABEL));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback2
        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.f41320a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public class b implements f.a {
        public b() {
        }

        @Override // O2.f.a
        public void a(WebView webView, O2.b bVar, Uri uri, boolean z10, O2.a aVar) {
            d.this.j(bVar.b(), uri.toString());
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f41327a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41328b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f41329c;

        public c(WebView webView, String str, String str2) {
            this.f41327a = webView;
            this.f41328b = str;
            this.f41329c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = d.this.f41311j;
            if (gVar == null) {
                return;
            }
            WritableMap a10 = gVar.a(this.f41327a, this.f41328b);
            a10.putString(EventKeys.DATA, this.f41329c);
            d dVar = d.this;
            if (dVar.f41310i != null) {
                dVar.e(a10);
            } else {
                dVar.g(this.f41327a, new pc.h(p.a(this.f41327a), a10));
            }
        }
    }

    /* renamed from: com.reactnativecommunity.webview.d$d, reason: collision with other inner class name */
    public static class C0592d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f41331a = false;

        public boolean a() {
            return this.f41331a;
        }

        public void b(boolean z10) {
            this.f41331a = z10;
        }
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public String f41332a = "RNCWebViewBridge";

        /* renamed from: b, reason: collision with root package name */
        public d f41333b;

        public e(d dVar) {
            this.f41333b = dVar;
        }

        public final /* synthetic */ void b(String str) {
            d dVar = this.f41333b;
            dVar.j(str, dVar.getUrl());
        }

        @JavascriptInterface
        public void postMessage(final String str) {
            if (this.f41333b.getMessagingEnabled()) {
                this.f41333b.post(new Runnable() { // from class: com.reactnativecommunity.webview.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.e.this.b(str);
                    }
                });
            } else {
                E6.a.K(this.f41332a, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public d(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f41305d = null;
        this.f41306e = true;
        this.f41307f = true;
        this.f41308g = false;
        this.f41312k = false;
        this.f41314m = false;
        this.f41315n = false;
        this.f41319r = null;
        this.f41310i = (RNCWebViewMessagingModule) ((ThemedReactContext) getContext()).getReactApplicationContext().getJSModule(RNCWebViewMessagingModule.class);
        this.f41316o = new C0592d();
    }

    public void a() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f41302a) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f41302a + ";\n})();");
        i();
    }

    public void b() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.f41303b) == null || TextUtils.isEmpty(str)) {
            return;
        }
        h("(function() {\n" + this.f41303b + ";\n})();");
        i();
    }

    public void c() {
        setWebViewClient(null);
        destroy();
    }

    public void d(d dVar) {
        Set a10;
        if (O2.g.a("WEB_MESSAGE_LISTENER")) {
            if (this.f41305d == null) {
                this.f41305d = new b();
                a10 = W6.a(new Object[]{"*"});
                O2.f.a(dVar, "ReactNativeWebView", a10, this.f41305d);
            }
        } else if (this.f41304c == null) {
            e eVar = new e(dVar);
            this.f41304c = eVar;
            addJavascriptInterface(eVar, "ReactNativeWebView");
        }
        i();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebChromeClient webChromeClient = this.f41318q;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    public void e(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f41309h);
        this.f41310i.onMessage(writableNativeMap);
    }

    public boolean f(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f41309h);
        this.f41310i.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    public void g(WebView webView, Event event) {
        UIManagerHelper.getEventDispatcherForReactTag(getThemedReactContext(), p.a(webView)).dispatchEvent(event);
    }

    public boolean getMessagingEnabled() {
        return this.f41308g;
    }

    public g getRNCWebViewClient() {
        return this.f41311j;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().getReactApplicationContext();
    }

    public ThemedReactContext getThemedReactContext() {
        return (ThemedReactContext) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f41318q;
    }

    public void h(String str) {
        evaluateJavascript(str, null);
    }

    public final void i() {
        String str;
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            if (this.f41319r == null) {
                str = null;
            } else {
                str = "`" + this.f41319r + "`";
            }
            sb2.append(str);
            sb2.append("; };\n})();");
            h(sb2.toString());
        }
    }

    public void j(String str, String str2) {
        getThemedReactContext();
        if (this.f41311j != null) {
            post(new c(this, str2, str));
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString(EventKeys.DATA, str);
        if (this.f41310i != null) {
            e(createMap);
        } else {
            g(this, new pc.h(p.a(this), createMap));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f41314m) {
            if (this.f41313l == null) {
                this.f41313l = new OnScrollDispatchHelper();
            }
            if (this.f41313l.onScrollChanged(i10, i11)) {
                g(this, ScrollEvent.obtain(p.a(this), ScrollEventType.SCROLL, i10, i11, this.f41313l.getXFlingVelocity(), this.f41313l.getYFlingVelocity(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f41312k) {
            g(this, new ContentSizeChangeEvent(p.a(this), i10, i11));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41315n) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(com.reactnativecommunity.webview.a aVar) {
        this.f41311j.d(aVar);
    }

    public void setHasScrollEvent(boolean z10) {
        this.f41314m = z10;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.f41319r = str;
        i();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f41317p = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z10) {
        if (this.f41308g == z10) {
            return;
        }
        this.f41308g = z10;
        if (z10) {
            d(this);
        }
    }

    public void setNestedScrollEnabled(boolean z10) {
        this.f41315n = z10;
    }

    public void setSendContentSizeChangeEvents(boolean z10) {
        this.f41312k = z10;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f41318q = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof com.reactnativecommunity.webview.c) {
            ((com.reactnativecommunity.webview.c) webChromeClient).h(this.f41316o);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof g) {
            g gVar = (g) webViewClient;
            this.f41311j = gVar;
            gVar.e(this.f41316o);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        return this.f41317p == null ? super.startActionMode(callback, i10) : super.startActionMode(new a(callback), i10);
    }
}
