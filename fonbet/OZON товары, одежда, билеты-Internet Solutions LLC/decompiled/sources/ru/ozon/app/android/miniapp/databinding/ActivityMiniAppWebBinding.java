package ru.ozon.app.android.miniapp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.miniapp.R$id;
import ru.ozon.app.android.miniapp.R$layout;
import ru.ozon.app.android.miniapp.webview.MiniAppWebView;
import ru.ozon.app.android.uikit.view.refresh.ColoredSwipeRefreshLayout;

/* loaded from: classes12.dex */
public final class ActivityMiniAppWebBinding implements a {

    @NonNull
    public final ImageView backMiniApp;

    @NonNull
    public final ImageView closeMiniApp;

    @NonNull
    public final ConstraintLayout navBar;

    @NonNull
    private final ColoredSwipeRefreshLayout rootView;

    @NonNull
    public final ColoredSwipeRefreshLayout swipeRefreshLayout;

    @NonNull
    public final MiniAppWebView webView;

    private ActivityMiniAppWebBinding(@NonNull ColoredSwipeRefreshLayout coloredSwipeRefreshLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout, @NonNull ColoredSwipeRefreshLayout coloredSwipeRefreshLayout2, @NonNull MiniAppWebView miniAppWebView) {
        this.rootView = coloredSwipeRefreshLayout;
        this.backMiniApp = imageView;
        this.closeMiniApp = imageView2;
        this.navBar = constraintLayout;
        this.swipeRefreshLayout = coloredSwipeRefreshLayout2;
        this.webView = miniAppWebView;
    }

    @NonNull
    public static ActivityMiniAppWebBinding bind(@NonNull View view) {
        int i11 = R$id.backMiniApp;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.closeMiniApp;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.navBar;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    ColoredSwipeRefreshLayout coloredSwipeRefreshLayout = (ColoredSwipeRefreshLayout) view;
                    i11 = R$id.webView;
                    MiniAppWebView miniAppWebView = (MiniAppWebView) C2548q.d(i11, view);
                    if (miniAppWebView != null) {
                        return new ActivityMiniAppWebBinding(coloredSwipeRefreshLayout, imageView, imageView2, constraintLayout, coloredSwipeRefreshLayout, miniAppWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ActivityMiniAppWebBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMiniAppWebBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_mini_app_web, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ColoredSwipeRefreshLayout getRoot() {
        return this.rootView;
    }
}
