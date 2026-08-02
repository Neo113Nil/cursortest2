package com.ironsource;

import android.os.Build;
import android.webkit.WebView;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2616qa {

    /* renamed from: com.ironsource.qa$a */
    public static final class a implements InterfaceC2616qa {
        private WebView a;
        private boolean b;

        public a() {
            this(0, 1, null);
        }

        private final void b(String str) {
            WebView webView = this.a;
            if (webView != null) {
                IronSourceNetworkBridge.webViewEvaluateJavaScript(webView, str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.a;
            if (webView != null) {
                IronSourceNetworkBridge.webviewLoadUrl(webView, "javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC2616qa
        public boolean a() {
            return this.a != null;
        }

        public a(int i) {
            this.b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC2616qa
        public void a(String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th) {
                C2556n4.d().a(th);
                this.b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC2616qa
        public void a(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.a = webView;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
