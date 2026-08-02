package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.f6;
import defpackage.joa;
import defpackage.p2g;
import defpackage.w2g;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k extends RelativeLayout {
    public final String a;
    public WebView b;
    public final joa c;
    public h d;
    public f e;
    public i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String str) {
        super(context);
        context.getClass();
        this.a = str;
        this.c = ypa.a(ysa.a, new j(context));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView a = a0.a(context, str);
        this.b = a;
        if (a != null) {
            a.setLayoutParams(layoutParams);
        }
        WebView webView = this.b;
        if (webView != null) {
            webView.setTag("VungleWebView");
        }
        addView(this.b, layoutParams);
        a();
        c();
    }

    private final com.vungle.ads.internal.platform.f getPlatform() {
        return (com.vungle.ads.internal.platform.f) this.c.getValue();
    }

    public final void a(long j) {
        try {
            p2g p2gVar = w2g.b;
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
        try {
            removeAllViews();
            Unit unit2 = Unit.a;
        } catch (Throwable unused2) {
            p2g p2gVar3 = w2g.b;
        }
        if (j <= 0) {
            new g(this).run();
        } else {
            new com.vungle.ads.internal.util.o().a(new g(this), j);
        }
    }

    public final void b() {
        WebView webView = this.b;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void c() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setLayerType(((com.vungle.ads.internal.platform.c) getPlatform()).m() ? 0 : 2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void d() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.b;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    @Nullable
    public final f getCloseDelegate$vungle_ads_release() {
        return this.e;
    }

    @Nullable
    public final String getEventId() {
        return this.a;
    }

    @Nullable
    public final h getOnViewTouchListener$vungle_ads_release() {
        return this.d;
    }

    @Nullable
    public final i getOrientationDelegate$vungle_ads_release() {
        return this.f;
    }

    @Nullable
    public final String getUrl() {
        WebView webView = this.b;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.b;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void setCloseDelegate(@NotNull f fVar) {
        fVar.getClass();
        this.e = fVar;
    }

    public final void setCloseDelegate$vungle_ads_release(@Nullable f fVar) {
        this.e = fVar;
    }

    public final void setOnViewTouchListener(@Nullable h hVar) {
        this.d = hVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(@Nullable h hVar) {
        this.d = hVar;
    }

    public final void setOrientation(int i) {
        i iVar = this.f;
        if (iVar != null) {
            ((com.vungle.ads.internal.ui.j) iVar).a.setRequestedOrientation(i);
        }
    }

    public final void setOrientationDelegate(@Nullable i iVar) {
        this.f = iVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(@Nullable i iVar) {
        this.f = iVar;
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    public final void a() {
        WebView webView = this.b;
        if (webView != null) {
            webView.setOnTouchListener(new f6(this, 7));
        }
    }

    public static final boolean a(k kVar, View view, MotionEvent motionEvent) {
        kVar.getClass();
        h hVar = kVar.d;
        if (hVar != null) {
            return hVar.onTouch(motionEvent);
        }
        return false;
    }

    public final void a(z zVar, f0 f0Var) {
        zVar.getClass();
        WebView webView = this.b;
        if (webView != null) {
            com.vungle.ads.internal.platform.g.a(webView, f0Var);
            webView.setWebViewClient(zVar);
        }
    }

    public /* synthetic */ k(Context context) {
        this(context, null);
    }

    public final void a(String str) {
        str.getClass();
        boolean z = u.a;
        t.a("MRAIDAdWidget", "loadUrl: " + str);
        WebView webView = this.b;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }
}
