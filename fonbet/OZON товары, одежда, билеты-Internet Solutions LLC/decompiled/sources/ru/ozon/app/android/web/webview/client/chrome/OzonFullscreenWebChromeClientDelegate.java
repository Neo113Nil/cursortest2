package ru.ozon.app.android.web.webview.client.chrome;

import E0.RunnableC2930k;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.C5334o0;
import androidx.core.view.Q0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0012\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/web/webview/client/chrome/OzonFullscreenWebChromeClientDelegate;", "", "activity", "Landroid/app/Activity;", "webView", "Landroid/webkit/WebView;", "<init>", "(Landroid/app/Activity;Landroid/webkit/WebView;)V", "customView", "Landroid/view/View;", "originalOrientation", "", "isAppearanceLightNavigationBars", "", "xScrollPosition", "yScrollPosition", "onShowCustomView", "", "view", "onHideCustomView", "hideSystemUI", "showSystemUI", "saveScrollPosition", "recoverScrollPosition", "attempt", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OzonFullscreenWebChromeClientDelegate {

    @NotNull
    private final Activity activity;
    private View customView;
    private boolean isAppearanceLightNavigationBars;
    private int originalOrientation;

    @NotNull
    private final WebView webView;
    private int xScrollPosition;
    private int yScrollPosition;

    public OzonFullscreenWebChromeClientDelegate(@NotNull Activity activity, @NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.activity = activity;
        this.webView = webView;
    }

    private final void hideSystemUI() {
        C5334o0.a(this.activity.getWindow(), false);
        Q0 q02 = new Q0(this.activity.getWindow().getDecorView(), this.activity.getWindow());
        q02.a(7);
        q02.f();
        this.isAppearanceLightNavigationBars = q02.b();
    }

    private final void recoverScrollPosition(int attempt) {
        this.webView.postDelayed(new RunnableC2930k(attempt, 1, this), 100L);
    }

    static /* synthetic */ void recoverScrollPosition$default(OzonFullscreenWebChromeClientDelegate ozonFullscreenWebChromeClientDelegate, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        ozonFullscreenWebChromeClientDelegate.recoverScrollPosition(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recoverScrollPosition$lambda$3(OzonFullscreenWebChromeClientDelegate ozonFullscreenWebChromeClientDelegate, int i11) {
        if (!(ozonFullscreenWebChromeClientDelegate.webView.getScrollY() == ozonFullscreenWebChromeClientDelegate.yScrollPosition && ozonFullscreenWebChromeClientDelegate.webView.getScrollX() == ozonFullscreenWebChromeClientDelegate.xScrollPosition) && i11 < 10) {
            ozonFullscreenWebChromeClientDelegate.webView.scrollTo(ozonFullscreenWebChromeClientDelegate.xScrollPosition, ozonFullscreenWebChromeClientDelegate.yScrollPosition);
            ozonFullscreenWebChromeClientDelegate.recoverScrollPosition(i11 + 1);
        }
    }

    private final void saveScrollPosition() {
        this.xScrollPosition = this.webView.getScrollX();
        this.yScrollPosition = this.webView.getScrollY();
    }

    private final void showSystemUI() {
        C5334o0.a(this.activity.getWindow(), true);
        Q0 q02 = new Q0(this.activity.getWindow().getDecorView(), this.activity.getWindow());
        q02.g(7);
        q02.d(this.isAppearanceLightNavigationBars);
    }

    public final void onHideCustomView() {
        View decorView = this.activity.getWindow().getDecorView();
        Intrinsics.g(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) decorView).removeView(this.customView);
        this.activity.setRequestedOrientation(this.originalOrientation);
        this.customView = null;
        showSystemUI();
        recoverScrollPosition$default(this, 0, 1, null);
    }

    public final void onShowCustomView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.customView != null) {
            onHideCustomView();
            return;
        }
        saveScrollPosition();
        view.setBackgroundColor(-16777216);
        this.customView = view;
        this.originalOrientation = this.activity.getRequestedOrientation();
        View decorView = this.activity.getWindow().getDecorView();
        Intrinsics.g(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) decorView).addView(this.customView, new FrameLayout.LayoutParams(-1, -1));
        this.activity.setRequestedOrientation(0);
        hideSystemUI();
    }
}
