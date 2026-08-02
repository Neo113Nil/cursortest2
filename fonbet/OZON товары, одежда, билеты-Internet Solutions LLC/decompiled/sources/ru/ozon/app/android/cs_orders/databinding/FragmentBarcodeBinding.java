package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.uikit.databinding.ViewProgressbarBgBinding;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.uikit.view.refresh.ColoredSwipeRefreshLayout;

/* loaded from: classes11.dex */
public final class FragmentBarcodeBinding implements a {

    @NonNull
    public final ComposeView barcodeComposeView;

    @NonNull
    public final FragmentContainerView composerContainer;

    @NonNull
    public final FrameLayout frameL;

    @NonNull
    public final ViewProgressbarBgBinding progressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ScreenStateViewWidget screenStateView;

    @NonNull
    public final ColoredSwipeRefreshLayout swipeRefreshLayout;

    @NonNull
    public final LinearLayout toolbar;

    @NonNull
    public final AppCompatImageView toolbarBack;

    @NonNull
    public final AppCompatTextView toolbarTitle;

    private FragmentBarcodeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull FragmentContainerView fragmentContainerView, @NonNull FrameLayout frameLayout, @NonNull ViewProgressbarBgBinding viewProgressbarBgBinding, @NonNull ScreenStateViewWidget screenStateViewWidget, @NonNull ColoredSwipeRefreshLayout coloredSwipeRefreshLayout, @NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.barcodeComposeView = composeView;
        this.composerContainer = fragmentContainerView;
        this.frameL = frameLayout;
        this.progressBar = viewProgressbarBgBinding;
        this.screenStateView = screenStateViewWidget;
        this.swipeRefreshLayout = coloredSwipeRefreshLayout;
        this.toolbar = linearLayout;
        this.toolbarBack = appCompatImageView;
        this.toolbarTitle = appCompatTextView;
    }

    @NonNull
    public static FragmentBarcodeBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.barcodeComposeView;
        ComposeView composeView = (ComposeView) C2548q.d(i11, view);
        if (composeView != null) {
            i11 = R$id.composerContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C2548q.d(i11, view);
            if (fragmentContainerView != null) {
                i11 = R$id.frameL;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null && (d11 = C2548q.d((i11 = R$id.progressBar), view)) != null) {
                    ViewProgressbarBgBinding bind = ViewProgressbarBgBinding.bind(d11);
                    i11 = R$id.screenStateView;
                    ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                    if (screenStateViewWidget != null) {
                        i11 = R$id.swipeRefreshLayout;
                        ColoredSwipeRefreshLayout coloredSwipeRefreshLayout = (ColoredSwipeRefreshLayout) C2548q.d(i11, view);
                        if (coloredSwipeRefreshLayout != null) {
                            i11 = R$id.toolbar;
                            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                            if (linearLayout != null) {
                                i11 = R$id.toolbarBack;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                                if (appCompatImageView != null) {
                                    i11 = R$id.toolbarTitle;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                                    if (appCompatTextView != null) {
                                        return new FragmentBarcodeBinding((ConstraintLayout) view, composeView, fragmentContainerView, frameLayout, bind, screenStateViewWidget, coloredSwipeRefreshLayout, linearLayout, appCompatImageView, appCompatTextView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
