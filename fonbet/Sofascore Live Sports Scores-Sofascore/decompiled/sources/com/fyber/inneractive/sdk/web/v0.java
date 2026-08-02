package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v0 implements com.fyber.inneractive.sdk.ignite.r {
    public boolean B;
    public final WebView a;
    public final com.fyber.inneractive.sdk.ignite.h b;
    public final String c;
    public com.fyber.inneractive.sdk.ignite.m d;
    public final String e;
    public final String f;
    public final String g;
    public final com.fyber.inneractive.sdk.flow.v h;
    public t0 i;
    public String k;
    public final com.fyber.inneractive.sdk.config.global.r m;
    public long o;
    public n0 p;
    public WeakReference q;
    public String j = "invalid_task_id";
    public boolean l = false;
    public long n = 10;
    public boolean r = false;
    public boolean s = false;
    public final AtomicInteger t = new AtomicInteger(0);
    public final AtomicBoolean u = new AtomicBoolean(false);
    public final AtomicBoolean v = new AtomicBoolean(false);
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final m0 E = new m0(this);

    public v0(w0 w0Var) {
        this.c = w0Var.a;
        this.d = w0Var.b;
        this.e = w0Var.c;
        this.m = w0Var.d;
        this.f = w0Var.e;
        this.g = w0Var.f;
        this.h = w0Var.g;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.N.D;
        this.b = hVar;
        hVar.h.add(this);
        this.a = new WebView(com.fyber.inneractive.sdk.util.o.a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.D) {
            this.z = false;
            if (this.j.equals(str)) {
                this.b.m();
                if (!this.v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    d("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str2.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a()))) || !this.b.n()) {
                int andIncrement = this.t.getAndIncrement();
                com.fyber.inneractive.sdk.ignite.h hVar = this.b;
                if (andIncrement < 2) {
                    hVar.a(new p0(this, str2, str3));
                    return;
                }
                hVar.m();
                d("onInstallationFailed();");
                com.fyber.inneractive.sdk.ignite.h hVar2 = this.b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar2.p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar2.b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar3 = this.b;
                    if (!hVar3.i && (vVar = this.h) != null) {
                        hVar3.i = true;
                        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                    }
                }
            } else if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.j.DOWNLOAD_IS_CANCELLED.a())) {
                this.b.m();
                d("onInstallationFailed();");
            }
            com.fyber.inneractive.sdk.ignite.m mVar = this.d;
            if (mVar != null) {
                this.h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, mVar);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        this.z = false;
        this.A = true;
        if (this.j.equals(str)) {
            this.b.m();
            d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.v.get() && str != null) {
            if (str.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a())) {
                int andIncrement = this.t.getAndIncrement();
                com.fyber.inneractive.sdk.ignite.h hVar = this.b;
                if (andIncrement < 2) {
                    hVar.a(new q0(this));
                    return;
                }
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.b;
                    if (hVar2.i || (vVar = this.h) == null) {
                        return;
                    }
                    hVar2.i = true;
                    vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                }
            }
        }
    }

    public final void d(String str) {
        com.fyber.inneractive.sdk.util.r.b.post(new o0(this, str));
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.k = str;
        WebSettings settings = this.a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        this.a.setInitialScale(1);
        this.a.setBackgroundColor(-1);
        this.a.setWebViewClient(this.E);
        WebView webView = this.a;
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        this.a.addJavascriptInterface(new u0(this), "nativeInterface");
        this.a.loadUrl(str);
        com.fyber.inneractive.sdk.config.global.r rVar = this.m;
        if (rVar != null) {
            Integer a = ((com.fyber.inneractive.sdk.config.global.features.r) rVar.a(com.fyber.inneractive.sdk.config.global.features.r.class)).a("load_timeout");
            int i = 10;
            int intValue = a != null ? a.intValue() : 10;
            if (intValue < 30 && intValue > 2) {
                i = intValue;
            }
            long millis = TimeUnit.SECONDS.toMillis(i);
            this.n = millis;
            IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
        }
        this.o = System.currentTimeMillis();
        n0 n0Var = new n0(this);
        this.p = n0Var;
        com.fyber.inneractive.sdk.util.r.b.postDelayed(n0Var, this.n);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        this.z = true;
        if (this.j.equals(str)) {
            this.b.m();
            d("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i, double d) {
        if (this.j.equals(str)) {
            if (i == 0) {
                d(String.format("onDownloadProgress(%f);", Double.valueOf(d)));
            } else {
                if (i != 1) {
                    return;
                }
                d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.c)) {
            return;
        }
        this.j = str;
    }
}
