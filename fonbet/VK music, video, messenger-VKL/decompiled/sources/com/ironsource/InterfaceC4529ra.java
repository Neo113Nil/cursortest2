package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
import xsna.zcl;

/* renamed from: com.ironsource.ra, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4529ra {

    /* renamed from: com.ironsource.ra$a */
    public static final class a implements InterfaceC4529ra {
        private WebView a;
        private boolean b;

        public a() {
            this(0, 1, null);
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC4529ra
        public boolean a() {
            return this.a != null;
        }

        public a(int i) {
            this.b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC4529ra
        public void a(String str) {
            try {
                if (this.b) {
                    b(str);
                } else {
                    c(str);
                }
            } catch (Throwable th) {
                C4452n4.d().a(th);
                this.b = false;
                c(str);
            }
        }

        public /* synthetic */ a(int i, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC4529ra
        public void a(WebView webView) {
            this.a = webView;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
