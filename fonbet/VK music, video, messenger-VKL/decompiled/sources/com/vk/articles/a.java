package com.vk.articles;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollInfo;
import com.vk.log.L;
import com.vk.movika.sdk.base.observable.g;
import com.vk.movika.sdk.base.observable.m;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.json.JSONObject;
import xsna.bir0;
import xsna.bpn0;
import xsna.bq3;
import xsna.c63;
import xsna.cir0;
import xsna.cq3;
import xsna.dir0;
import xsna.dsw;
import xsna.fgx0;
import xsna.go9;
import xsna.gzs;
import xsna.i0q0;
import xsna.iah0;
import xsna.izs;
import xsna.jgp;
import xsna.jp3;
import xsna.k840;
import xsna.lpj;
import xsna.m05;
import xsna.naz;
import xsna.nr2;
import xsna.otb0;
import xsna.qn3;
import xsna.s3q0;
import xsna.sjx0;
import xsna.u2b0;
import xsna.ujx0;
import xsna.v390;
import xsna.wzs;
import xsna.x93;
import xsna.y390;
import xsna.zhy0;
import xsna.zic;

/* compiled from: ArticleWebView.kt */
/* loaded from: classes15.dex */
public final class a extends WebView {
    public final bir0 b;
    public io.reactivex.rxjava3.disposables.c c;
    public JSONObject d;
    public final com.vk.articles.b e;
    public final LinkedList f;
    public final zic g;
    public final ujx0 h;
    public final u2b0 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    public InterfaceC0377a o;
    public b p;
    public c q;
    public wzs<? super WebView, ? super String, s3q0> r;
    public gzs<s3q0> s;
    public final jp3 t;
    public boolean u;
    public dir0 v;
    public io.reactivex.rxjava3.disposables.c w;
    public final cq3 x;

    /* compiled from: ArticleWebView.kt */
    /* renamed from: com.vk.articles.a$a, reason: collision with other inner class name */
    public interface InterfaceC0377a {
        boolean Ac();

        void R2(Object obj);

        void Vl(String str, JSONObject jSONObject);

        void re(Article article);

        void uj(Article article, boolean z);

        void wl();

        void z2(PollInfo pollInfo);
    }

    /* compiled from: ArticleWebView.kt */
    public interface b {
        void a(a aVar, int i, int i2);
    }

    /* compiled from: ArticleWebView.kt */
    public interface c {
        void a();
    }

    /* compiled from: ArticleWebView.kt */
    public static final /* synthetic */ class d extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((a) this.receiver).v;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((a) this.receiver).v = (dir0) obj;
        }
    }

    public a(lpj lpjVar) {
        super(lpjVar);
        bir0 bir0Var = new bir0();
        this.b = bir0Var;
        this.e = new com.vk.articles.b(this, Looper.getMainLooper());
        this.f = new LinkedList();
        this.g = new zic();
        this.i = k840.a.g().b();
        this.t = new jp3(this);
        this.x = new cq3(0, this, lpjVar);
        setHorizontalScrollBarEnabled(false);
        this.h = new ujx0(this);
        setWebChromeClient(bir0Var);
        getSettings().setAllowFileAccess(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(1);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
    }

    public static final void d(a aVar) {
        L.p("ArticleWebView", "sendWebViewShowEvent() called");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = aVar.d;
        if (jSONObject2 != null) {
            jSONObject.put("deviceInfo", jSONObject2);
        }
        s3q0 s3q0Var = s3q0.a;
        aVar.f("articleWebViewShow", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, android.webkit.WebView, com.vk.articles.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [xsna.qn3, xsna.v1y] */
    private final void setJavascriptBridge(boolean z) {
        bq3 bq3Var;
        L.p("ArticleWebView", zhy0.a("setJavascriptBridge() called with: enableComposite = ", z));
        if (z) {
            ?? qn3Var = new qn3(this, new bq3(this), new m05(getContext()), new otb0(getContext(), new g(this, 5)));
            dir0 dir0Var = this.v;
            bq3Var = qn3Var;
            if (dir0Var != null) {
                qn3Var.G(new fgx0(this, dir0Var));
                bq3Var = qn3Var;
            }
        } else {
            bq3Var = new bq3(this);
        }
        Object invoke = this.x.invoke(this.h);
        new d(this, a.class, "webViewClient", "getWebViewClient()Lcom/vk/superapp/browser/internal/utils/VKWebViewClient;", 0).set((dir0) invoke);
        cir0 cir0Var = (cir0) invoke;
        addJavascriptInterface(bq3Var, "AndroidBridge");
        setWebViewClient(cir0Var);
        bq3Var.e = cir0Var.b.a;
    }

    private final void setWebViewBottomPadding(int i) {
        e("var el = document.createElement(\"div\"); el.style.height = '" + i + "px'; document.body.appendChild(el);");
    }

    private final void setWebViewTopPadding(int i) {
        e("document.body.style.paddingTop = '" + i + "px';");
    }

    public final void a() {
        L.p("ArticleWebView", "cancelLoading() called");
        setPageError(true);
        setLoading(false);
        gzs<s3q0> gzsVar = this.s;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.webkit.WebView, com.vk.articles.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [xsna.jgp] */
    public final void b(String str, boolean z, HashMap hashMap) {
        String b2;
        String str2;
        boolean z2;
        if (str.length() == 0) {
            b2 = str;
        } else {
            dsw<UserId, v390> dswVar = y390.a;
            v390 a = y390.a.a();
            b2 = v390.b(str, a.c(a.b));
        }
        L.p("ArticleWebView", "loadArticle() called with: url = " + b2 + ", isLongRead = " + z + ", headers = " + ((Object) hashMap));
        setPageLoaded(false);
        setPageError(false);
        if (str.length() == 0) {
            L.l("ArticleWebView", "Article url is ".concat("empty"));
            return;
        }
        Uri parse = Uri.parse(b2);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (!(queryParameterNames instanceof Collection) || !queryParameterNames.isEmpty()) {
            Iterator it = queryParameterNames.iterator();
            while (it.hasNext()) {
                if ("audio_bridge".equals((String) it.next())) {
                    try {
                        str2 = parse.getQueryParameter("audio_bridge");
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    if ("1".equals(str2)) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        setJavascriptBridge(z || z2);
        if (b2 != null) {
            setLastRequestedUrl(b2);
            setLoading(true);
            if (hashMap == 0 && naz.A(b2)) {
                this.h.c(b2, true);
                return;
            }
            if (hashMap == 0) {
                hashMap = jgp.b;
            }
            loadUrl(b2, hashMap);
        }
    }

    public final void c() {
        bpn0 bpn0Var = i0q0.a;
        L.p("ArticleWebView", "onWebPageLoadingFinished() called isLoading=" + this.k + " isPageLoaded=" + this.j);
        if (this.k || !this.j) {
            setPageLoaded(true);
            setLoading(false);
            g();
            wzs<? super WebView, ? super String, s3q0> wzsVar = this.r;
            if (wzsVar != null) {
                wzsVar.invoke(this, getUrl());
            }
        }
    }

    public final void e(String str) {
        bpn0 bpn0Var = i0q0.a;
        L.p("ArticleWebView", "runJavaScript() called with: js = ".concat(str));
        L.p("ArticleWebView", "isPageLoaded =  " + this.j);
        if (this.j) {
            nr2.J(this, str);
        } else {
            this.f.offer(str);
        }
    }

    public final void f(String str, JSONObject jSONObject) {
        L.p("ArticleWebView", "sendEvent() called with: type = " + str + ", json = " + jSONObject);
        jSONObject.put("type", str);
        StringBuilder sb = new StringBuilder("window.dispatchEvent(new CustomEvent('VKWebAppEvent', ");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("detail", jSONObject);
        s3q0 s3q0Var = s3q0.a;
        sb.append(jSONObject2);
        sb.append("));");
        e(sb.toString());
    }

    public final void g() {
        InterfaceC0377a interfaceC0377a = this.o;
        if (interfaceC0377a == null || !interfaceC0377a.Ac()) {
            setWebViewTopPadding(0);
            setWebViewBottomPadding(0);
        } else {
            setWebViewTopPadding(iah0.t((int) getResources().getDimension(R.dimen.article_top_panel)));
            setWebViewBottomPadding(iah0.t((int) getResources().getDimension(R.dimen.article_bottom_panel)));
        }
    }

    public final Activity getActivity$app_shared_armRelease() {
        Handler handler = x93.a;
        c63 c63Var = c63.a;
        return c63.b();
    }

    public final InterfaceC0377a getCallback() {
        return this.o;
    }

    @Override // android.webkit.WebView
    public int getContentHeight() {
        return computeVerticalScrollRange();
    }

    public final String getLastRequestedUrl() {
        return this.m;
    }

    public final gzs<s3q0> getOnPageErrorListener() {
        return this.s;
    }

    public final wzs<WebView, String, s3q0> getOnPageFinishedListener() {
        return this.r;
    }

    public final b getOnScrollChangeListener() {
        return this.p;
    }

    public final c getOnScrollEndListener() {
        return this.q;
    }

    public final String getTrackCode() {
        return this.n;
    }

    public final izs<sjx0, dir0> getWebViewClientProvider() {
        return this.x;
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        L.p("ArticleWebView", "onPause() called");
        super.onPause();
        this.i.n0(this.t);
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.w;
        if (cVar2 != null) {
            cVar2.dispose();
        }
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        L.p("ArticleWebView", "onResume() called");
        super.onResume();
        this.i.P0(this.t, true);
        com.vk.core.utils.newtork.b.a.getClass();
        this.w = com.vk.core.utils.newtork.b.d.subscribe(new defpackage.d(new m(this, 8), 4));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.p != null && getContentHeight() != 0) {
            this.p.a(this, i2, i4);
        }
        com.vk.articles.b bVar = this.e;
        bVar.removeMessages(0);
        if (this.u) {
            return;
        }
        bVar.sendMessageDelayed(Message.obtain(bVar, 0), 50L);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zic zicVar = this.g;
        zicVar.getClass();
        if (motionEvent.getAction() == 0) {
            zicVar.c = motionEvent.getX();
            zicVar.d = motionEvent.getY();
            zicVar.e = SystemClock.elapsedRealtime();
        } else if (motionEvent.getAction() == 1) {
            zicVar.f = motionEvent.getX();
            zicVar.g = motionEvent.getY();
            zicVar.h = SystemClock.elapsedRealtime();
        }
        com.vk.articles.b bVar = this.e;
        bVar.removeMessages(0);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            bVar.sendMessageDelayed(Message.obtain(bVar, 0), 50L);
            this.u = false;
        } else {
            this.u = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCallback(InterfaceC0377a interfaceC0377a) {
        this.o = interfaceC0377a;
    }

    public final void setLastRequestedUrl(String str) {
        L.p("ArticleWebView", go9.b("lastRequested url set to ", str));
        this.m = str;
    }

    public final void setLoading(boolean z) {
        L.p("ArticleWebView", zhy0.a("isLoading set to ", z));
        this.k = z;
    }

    public final void setOnPageErrorListener(gzs<s3q0> gzsVar) {
        this.s = gzsVar;
    }

    public final void setOnPageFinishedListener(wzs<? super WebView, ? super String, s3q0> wzsVar) {
        this.r = wzsVar;
    }

    public final void setOnScrollChangeListener(b bVar) {
        this.p = bVar;
    }

    public final void setOnScrollEndListener(c cVar) {
        this.q = cVar;
    }

    public final void setPageError(boolean z) {
        L.p("ArticleWebView", zhy0.a("isPageError set to ", z));
        this.l = z;
    }

    public final void setPageLoaded(boolean z) {
        L.p("ArticleWebView", zhy0.a("isPageLoaded set to ", z));
        this.j = z;
        if (!z) {
            return;
        }
        while (true) {
            LinkedList linkedList = this.f;
            if (linkedList.isEmpty()) {
                return;
            } else {
                e((String) linkedList.poll());
            }
        }
    }

    public final void setTrackCode(String str) {
        this.n = str;
    }
}
