package com.ironsource;

import android.os.Build;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4271qa {
    void a(@NotNull WebView webView);

    void a(@NotNull String str);

    boolean a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.qa$a */
    public static final class a implements InterfaceC4271qa {

        @Nullable
        private WebView a;
        private boolean b;

        public a(int i) {
            this.b = i >= 19;
        }

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

        @Override // com.ironsource.InterfaceC4271qa
        public void a(@NotNull String str) {
            str.getClass();
            try {
                if (this.b) {
                    b(str);
                } else {
                    c(str);
                }
            } catch (Throwable th) {
                C4157k4.d().a(th);
                this.b = false;
                c(str);
            }
        }

        public a() {
            this(0, 1, null);
        }

        public /* synthetic */ a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC4271qa
        public boolean a() {
            return this.a != null;
        }

        @Override // com.ironsource.InterfaceC4271qa
        public void a(@NotNull WebView webView) {
            webView.getClass();
            this.a = webView;
        }
    }
}
