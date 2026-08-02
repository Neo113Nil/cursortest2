package com.vk.superapp.pip.impl.overlay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.os.Binder;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.movika.sdk.base.logic.processor.actions.e;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import com.vk.superapp.pip.impl.overlay.MiniAppPiPOverlayService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bjc;
import xsna.ce3;
import xsna.cq20;
import xsna.gz80;
import xsna.iah0;
import xsna.j3;
import xsna.jgn0;
import xsna.l7s;
import xsna.nr2;
import xsna.swe0;
import xsna.u13;
import xsna.uzp0;
import xsna.zja0;

/* compiled from: MiniAppPiPOverlayManager.kt */
/* loaded from: classes6.dex */
public final class b {
    public final l7s a;
    public final WindowManager b;
    public FrameLayout c;
    public Long d;

    /* compiled from: MiniAppPiPOverlayManager.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), iah0.a(8.0f));
        }
    }

    public b(l7s l7sVar) {
        this.a = l7sVar;
        this.b = (WindowManager) l7sVar.getSystemService("window");
    }

    public static void c(SchemeStat$TypeMiniAppItem.Type type, long j) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MINI_APP, Long.valueOf(j), null, null, null, null, 60, null), new SchemeStat$TypeMiniAppItem(type, null, null, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public final void a(boolean z) {
        WebView webView;
        Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            u13 b = jgn0.b().b(longValue);
            if (b != null && (webView = b.a) != null) {
                nr2.J(webView, "document.documentElement.style.removeProperty('min-height')");
                nr2.J(webView, "document.documentElement.style.removeProperty('transform')");
                nr2.J(webView, "document.documentElement.style.removeProperty('transform-origin')");
            }
            jgn0.b().d(longValue);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                this.b.removeView(frameLayout);
            }
            this.d = null;
            if (z) {
                Long l2 = MiniAppPiPOverlayService.f;
                MiniAppPiPOverlayService.b.a(this.a);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility", "InlinedApi"})
    public final void b(WebApiApplication webApiApplication, int i, int i2) {
        double d;
        double d2;
        int i3;
        l7s l7sVar = this.a;
        if (!Settings.canDrawOverlays(l7sVar) || i2 == 0 || i == 0) {
            return;
        }
        cq20 cq20Var = new cq20(l7sVar, new e(12, this, webApiApplication), new j3(17, webApiApplication, this));
        int g = swe0.g((i2 * 120) / i, 160, 300);
        Pair pair = i2 > i ? new Pair(Integer.valueOf(iah0.a(120)), Integer.valueOf(iah0.a(g))) : new Pair(Integer.valueOf(iah0.a(g)), Integer.valueOf(iah0.a(120)));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        if (i2 > i) {
            d = intValue * 1.0d;
            d2 = i;
        } else {
            d = intValue2 * 1.0d;
            d2 = i2;
        }
        double d3 = d / d2;
        ce3 b = jgn0.b();
        long j = webApiApplication.b;
        u13 b2 = b.b(j);
        WebView webView = b2 != null ? b2.a : null;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.setLayoutParams(new ConstraintLayout.b(-1, -1));
            cq20Var.e.addView(webView);
            webView.getLayoutParams().height = i2;
            webView.getLayoutParams().width = i;
            webView.requestLayout();
            webView.onResume();
            nr2.J(webView, "document.documentElement.style.minHeight = '100%';");
            nr2.J(webView, "document.documentElement.style.transform = 'scale(" + d3 + ")';");
            nr2.J(webView, "document.documentElement.style.transformOrigin = 'top left';");
        }
        jgn0.b().a(j);
        boolean a2 = gz80.a(26);
        if (a2) {
            i3 = 2038;
        } else {
            if (a2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 2002;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i3);
        layoutParams.width = intValue;
        layoutParams.height = intValue2;
        layoutParams.gravity = 8388693;
        float f = 48;
        layoutParams.x = iah0.a(f);
        layoutParams.y = iah0.a(f);
        layoutParams.type = i3;
        layoutParams.format = -3;
        layoutParams.token = new Binder();
        layoutParams.flags = 16777384;
        FrameLayout frameLayout = new FrameLayout(l7sVar);
        frameLayout.setElevation(iah0.a(4));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new a());
        Context context = frameLayout.getContext();
        WindowManager windowManager = this.b;
        frameLayout.setOnTouchListener(new zja0(context, frameLayout, windowManager, layoutParams));
        frameLayout.addView(cq20Var.c);
        frameLayout.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1903b(frameLayout, this));
        this.c = frameLayout;
        windowManager.addView(frameLayout, layoutParams);
        this.d = Long.valueOf(j);
    }

    /* compiled from: MiniAppPiPOverlayManager.kt */
    /* renamed from: com.vk.superapp.pip.impl.overlay.b$b, reason: collision with other inner class name */
    public static final class ViewOnAttachStateChangeListenerC1903b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ FrameLayout b;
        public final /* synthetic */ b c;

        public ViewOnAttachStateChangeListenerC1903b(FrameLayout frameLayout, b bVar) {
            this.b = frameLayout;
            this.c = bVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            b bVar = this.c;
            if (Settings.canDrawOverlays(bVar.a)) {
                return;
            }
            try {
                bVar.a(true);
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.q(th);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
