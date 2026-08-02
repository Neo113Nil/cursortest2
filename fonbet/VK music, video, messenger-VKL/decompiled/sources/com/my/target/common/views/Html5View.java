package com.my.target.common.views;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.views.Html5View;
import java.lang.ref.WeakReference;
import xsna.c9z0;
import xsna.gu8;
import xsna.h8z0;
import xsna.mhv;
import xsna.n52;
import xsna.o8z0;
import xsna.oe9;
import xsna.oty0;
import xsna.phv;
import xsna.qhv;
import xsna.qty0;
import xsna.scz0;
import xsna.shv;
import xsna.sj1;
import xsna.sx3;
import xsna.tbz0;
import xsna.z6;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class Html5View extends FrameLayout {
    public final qty0 b;
    public final e c;
    public final c d;
    public int e;
    public String f;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static abstract class a {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b implements qty0.a {
        public final a b;

        public b(a aVar) {
            this.b = aVar;
        }

        @Override // xsna.qty0.a
        public final void a(WebView webView) {
        }

        @Override // xsna.qty0.a
        public final void a(String str) {
            WeakReference weakReference;
            scz0 scz0Var = scz0.this;
            c9z0.a aVar = scz0Var.b;
            if (aVar == null || (weakReference = scz0Var.a) == null) {
                return;
            }
            tbz0 tbz0Var = scz0Var.d;
            View view = (View) weakReference.get();
            c9z0 c9z0Var = aVar.b;
            gu8.c(null, "NativeAdEngine: Click on native html received");
            c9z0Var.d(tbz0Var, str, 1, view, view.getContext());
            h8z0.e(c9z0Var.d.a, "click", 2, null);
        }

        @Override // xsna.qty0.a
        public final void b() {
        }

        @Override // xsna.qty0.a
        public final void f(String str) {
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class c {
        public shv a;
        public a b;

        public c() {
        }

        @JavascriptInterface
        public void onCTAClicked() {
            o8z0.d(new sj1(this, 7));
        }

        @JavascriptInterface
        public void onCustomEvent(@NonNull String str, @Nullable String str2) {
            o8z0.d(new n52(this, str, str2));
        }

        @JavascriptInterface
        public void onInteractiveFailedToLoad(@Nullable final String str) {
            Html5View html5View = Html5View.this;
            final WebView webView = html5View.b.getWebView();
            if (webView == null || html5View.e == 3) {
                return;
            }
            html5View.e = 3;
            o8z0.d(new Runnable() { // from class: xsna.ghv
                @Override // java.lang.Runnable
                public final void run() {
                    shv shvVar = Html5View.c.this.a;
                    if (shvVar != null) {
                        String str2 = str;
                        if (str2 == null) {
                            str2 = "Unknown internal error";
                        }
                        shvVar.a(webView, new shv.a(-1, str2), null);
                    }
                }
            });
        }

        @JavascriptInterface
        public void onInteractiveFinished() {
            o8z0.d(new sx3(this, 6));
        }

        @JavascriptInterface
        public void onInteractiveLoaded() {
            Html5View html5View = Html5View.this;
            WebView webView = html5View.b.getWebView();
            if (webView == null || html5View.e == 3) {
                return;
            }
            html5View.e = 2;
            o8z0.d(new z6(2, this, webView));
        }

        @JavascriptInterface
        public void onInteractiveStarted() {
            o8z0.d(new sx3(this, 6));
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class d implements qty0.e {
        public final phv a;

        public d(phv phvVar) {
            this.a = phvVar;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class e {
        public long a = 5000;
        public final Handler b = o8z0.g;
        public Runnable c = new oe9();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class f implements qty0.g {
        public final shv a;

        public f(shv shvVar) {
            this.a = shvVar;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class g implements qty0.h {
        public final shv a;
        public final e b;

        public g(shv shvVar, e eVar) {
            this.a = shvVar;
            this.b = eVar;
        }
    }

    public Html5View(@NonNull Context context) {
        this(context, null);
    }

    public boolean getIsLoaded() {
        return this.e == 2;
    }

    public void setData(@NonNull String str) {
        this.f = str;
        e eVar = this.c;
        eVar.b.removeCallbacks(eVar.c);
        this.e = 0;
        this.b.setData(str);
    }

    public void setHtmlCustomEventListener(@NonNull mhv mhvVar) {
        this.d.getClass();
    }

    public void setHtmlInteractionListener(@NonNull phv phvVar) {
        this.b.setUserMotionEventListener(new d(phvVar));
    }

    public void setHtmlInteractiveProgressListener(@NonNull qhv qhvVar) {
        this.d.getClass();
    }

    public void setHtmlLoadingListener(@NonNull shv shvVar) {
        g gVar = new g(shvVar, this.c);
        qty0 qty0Var = this.b;
        qty0Var.setWebViewLoadingStartListener(gVar);
        qty0Var.setWebViewLoadingErrorListener(new f(shvVar));
        this.d.a = shvVar;
    }

    public void setLoadingTimeoutMillis(long j) {
        e eVar = this.c;
        if (j > 0) {
            eVar.a = j;
        } else {
            eVar.getClass();
        }
    }

    public void setWebViewBackgroundColor(int i) {
        this.b.setWebViewBackgroundColor(i);
    }

    public void setWebViewClickListener(@NonNull a aVar) {
        this.b.setBannerWebViewListener(new b(aVar));
        this.d.b = aVar;
    }

    public Html5View(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Html5View(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Html5View(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c cVar = new c();
        this.d = cVar;
        this.e = 0;
        this.f = null;
        qty0 qty0Var = new qty0(context);
        this.b = qty0Var;
        this.c = new e();
        WebView webView = qty0Var.getWebView();
        if (webView != null) {
            webView.setOnLongClickListener(new oty0());
        }
        WebView webView2 = qty0Var.b;
        if (webView2 != null) {
            webView2.addJavascriptInterface(cVar, "myTargetPlayableAds");
        }
        addView(qty0Var, new ViewGroup.LayoutParams(-1, -1));
    }
}
