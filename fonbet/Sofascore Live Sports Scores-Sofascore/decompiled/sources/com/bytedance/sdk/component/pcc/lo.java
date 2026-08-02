package com.bytedance.sdk.component.pcc;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import defpackage.a70;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.ogj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo extends pcc {
    static final /* synthetic */ boolean ork = true;
    protected String kj;
    protected WebView vy;

    public void gm() {
        if (ork || this.vy != null) {
            this.vy.addJavascriptInterface(this, this.kj);
        } else {
            ogj.b();
        }
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    public void oo() {
        this.vy.removeJavascriptInterface(this.kj);
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    public void pcc(String str, gbb gbbVar) {
        if (gbbVar == null || TextUtils.isEmpty(gbbVar.kj)) {
            super.pcc(str, gbbVar);
            return;
        }
        String str2 = gbbVar.kj;
        pcc(str, mz1.o(mz1.s("javascript:(function(){   const iframe = document.querySelector(atob('", Base64.encodeToString(("iframe[src=\"" + str2 + "\"").getBytes(), 2), "'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(", str, ", atob('"), Base64.encodeToString(str2.getBytes(), 2), "'));   }})()"));
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    public void sf(vy vyVar) {
        this.vy = vyVar.pcc;
        this.kj = vyVar.gm;
        if (vyVar.hc) {
            return;
        }
        gm();
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    public void sf() {
        super.sf();
        oo();
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    public String pcc() {
        return this.vy.getUrl();
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    public Context pcc(vy vyVar) {
        Context context = vyVar.vj;
        if (context != null) {
            return context;
        }
        WebView webView = vyVar.pcc;
        if (webView != null) {
            return webView.getContext();
        }
        a70.r("WebView cannot be null!");
        return null;
    }

    @Override // com.bytedance.sdk.component.pcc.pcc
    public void pcc(String str) {
        pcc(str, fc6.o(new StringBuilder("javascript:"), this.kj, "._handleMessageFromToutiao(", str, ")"));
    }

    private void pcc(String str, final String str2) {
        if (this.wh || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.pcc.lo.1
            @Override // java.lang.Runnable
            public void run() {
                if (lo.this.wh) {
                    return;
                }
                try {
                    lo.this.vy.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.oo.post(runnable);
        } else {
            runnable.run();
        }
    }
}
