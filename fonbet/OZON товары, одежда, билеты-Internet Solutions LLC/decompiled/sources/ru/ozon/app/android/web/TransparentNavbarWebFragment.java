package ru.ozon.app.android.web;

import HY.b;
import Ql.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.graphics.d;
import androidx.core.view.C5334o0;
import androidx.core.view.C5353y0;
import androidx.core.view.Q0;
import androidx.core.view.Y;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.feature.common.web.R$layout;
import ru.ozon.app.android.feature.common.web.databinding.FragmentWebNavbarOverlayBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.web.webview.OzonWebView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0016\u0010&\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0014\u00100\u001a\u00020-8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/web/TransparentNavbarWebFragment;", "Lru/ozon/app/android/web/WebFragment;", "<init>", "()V", "", "setupTransparentSystemBars", "restoreSystemBarsColors", "setupWindowInsets", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "setupNavigation", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setToolbarTitle", "(Ljava/lang/String;)V", "Lru/ozon/app/android/feature/common/web/databinding/FragmentWebNavbarOverlayBinding;", "overlayBinding", "Lru/ozon/app/android/feature/common/web/databinding/FragmentWebNavbarOverlayBinding;", "", "transparentColor$delegate", "LSc/j;", "getTransparentColor", "()I", "transparentColor", "backgroundColor$delegate", "getBackgroundColor", "backgroundColor", "originalStatusBarColor", "I", "originalNavigationBarColor", "", "originalIsAppearanceLightNavigationBars", "Z", "systemBarHeight", "Lru/ozon/app/android/web/webview/OzonWebView;", "getWebView", "()Lru/ozon/app/android/web/webview/OzonWebView;", "webView", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransparentNavbarWebFragment extends WebFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int originalNavigationBarColor;
    private int originalStatusBarColor;
    private FragmentWebNavbarOverlayBinding overlayBinding;
    private int systemBarHeight;

    /* renamed from: transparentColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transparentColor = k.b(new TransparentNavbarWebFragment$transparentColor$2(this));

    /* renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColor = k.b(new TransparentNavbarWebFragment$backgroundColor$2(this));
    private boolean originalIsAppearanceLightNavigationBars = true;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jf\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/web/TransparentNavbarWebFragment$Companion;", "", "<init>", "()V", "newInstance", "Lru/ozon/app/android/web/TransparentNavbarWebFragment;", ImagesContract.URL, "", "isInBottomSheet", "", "dismissAndRedirectUrl", "shouldShowNavBar", "isBackStackDisabled", "isFullScreen", "isFullScreenWebView", "isShareEnabled", "isZoomEnabled", "isRegularDrawWebView", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransparentNavbarWebFragment newInstance(@NotNull String url, boolean isInBottomSheet, String dismissAndRedirectUrl, boolean shouldShowNavBar, boolean isBackStackDisabled, boolean isFullScreen, boolean isFullScreenWebView, boolean isShareEnabled, boolean isZoomEnabled, boolean isRegularDrawWebView) {
            Intrinsics.checkNotNullParameter(url, "url");
            TransparentNavbarWebFragment transparentNavbarWebFragment = new TransparentNavbarWebFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_url", url);
            bundle.putString("dismiss_and_redirect_url", dismissAndRedirectUrl);
            bundle.putBoolean("extra_is_in_bottom_sheet", isInBottomSheet);
            bundle.putBoolean("extra_should_show_nav_bar", shouldShowNavBar);
            bundle.putBoolean("EXTRA_IS_BACK_STACK_DISABLED", isBackStackDisabled);
            bundle.putBoolean("EXTRA_IS_SHARE_ENABLED", isShareEnabled);
            bundle.putBoolean("EXTRA_IS_FULL_SCREEN", isFullScreen);
            bundle.putBoolean("EXTRA_IS_FULL_SCREEN_WEB_VIEW", isFullScreenWebView);
            bundle.putBoolean("zoom_enabled", isZoomEnabled);
            bundle.putBoolean("IS_REGULAR_DRAW_WEB_VIEW", isRegularDrawWebView);
            transparentNavbarWebFragment.setArguments(bundle);
            return transparentNavbarWebFragment;
        }

        private Companion() {
        }
    }

    private final int getBackgroundColor() {
        return ((Number) this.backgroundColor.getValue()).intValue();
    }

    private final int getTransparentColor() {
        return ((Number) this.transparentColor.getValue()).intValue();
    }

    private final void restoreSystemBarsColors() {
        Window window = requireActivity().getWindow();
        Q0 q02 = new Q0(window.getDecorView(), window);
        Intrinsics.checkNotNullExpressionValue(q02, "getInsetsController(...)");
        window.setStatusBarColor(this.originalStatusBarColor);
        window.setNavigationBarColor(this.originalNavigationBarColor);
        C5334o0.a(window, true);
        q02.d(this.originalIsAppearanceLightNavigationBars);
    }

    private final void setupTransparentSystemBars() {
        Window window = requireActivity().getWindow();
        Q0 q02 = new Q0(window.getDecorView(), window);
        Intrinsics.checkNotNullExpressionValue(q02, "getInsetsController(...)");
        this.originalStatusBarColor = window.getStatusBarColor();
        this.originalNavigationBarColor = window.getNavigationBarColor();
        this.originalIsAppearanceLightNavigationBars = q02.b();
        window.setStatusBarColor(getTransparentColor());
        window.setNavigationBarColor(getTransparentColor());
        StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, this, StatusBarController.UpdateReason.NewState.INSTANCE, true, false, 8, null);
        C5334o0.a(window, false);
        q02.d(false);
    }

    private final void setupWindowInsets() {
        FragmentWebNavbarOverlayBinding fragmentWebNavbarOverlayBinding = this.overlayBinding;
        if (fragmentWebNavbarOverlayBinding == null) {
            return;
        }
        Y.J(fragmentWebNavbarOverlayBinding.getConstraintLayout(), new HY.a());
        Y.J(fragmentWebNavbarOverlayBinding.webView, new b());
        Y.J(fragmentWebNavbarOverlayBinding.toolbar, new B90.Y(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 setupWindowInsets$lambda$2(View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 setupWindowInsets$lambda$3(View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 setupWindowInsets$lambda$5(TransparentNavbarWebFragment transparentNavbarWebFragment, View view, C5353y0 c5353y0) {
        d a11 = c.a(view, "view", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = a11.f42127b;
        if (i11 > 0) {
            transparentNavbarWebFragment.systemBarHeight = i11;
        }
        marginLayoutParams.topMargin = transparentNavbarWebFragment.systemBarHeight;
        view.setLayoutParams(marginLayoutParams);
        return c5353y0;
    }

    @Override // ru.ozon.app.android.web.WebFragment
    @NotNull
    protected OzonWebView getWebView() {
        OzonWebView ozonWebView;
        FragmentWebNavbarOverlayBinding fragmentWebNavbarOverlayBinding = this.overlayBinding;
        if (fragmentWebNavbarOverlayBinding == null || (ozonWebView = fragmentWebNavbarOverlayBinding.webView) == null) {
            throw new IllegalStateException("Overlay binding not initialized");
        }
        return ozonWebView;
    }

    @Override // ru.ozon.app.android.web.WebFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.overlayBinding = FragmentWebNavbarOverlayBinding.bind(inflater.inflate(R$layout.fragment_web_navbar_overlay, container, false));
        receiveInAppPush(container);
        getWebView().setBlankColor(Integer.valueOf(getBackgroundColor()));
        FragmentWebNavbarOverlayBinding fragmentWebNavbarOverlayBinding = this.overlayBinding;
        if (fragmentWebNavbarOverlayBinding != null) {
            return fragmentWebNavbarOverlayBinding.getConstraintLayout();
        }
        return null;
    }

    @Override // ru.ozon.app.android.web.WebFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        restoreSystemBarsColors();
        super.onDestroyView();
        this.overlayBinding = null;
    }

    @Override // ru.ozon.app.android.web.WebFragment, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupTransparentSystemBars();
        setupWindowInsets();
    }

    @Override // ru.ozon.app.android.web.WebFragment
    protected void setToolbarTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        OnReceiveTitleListener receiveTitleListener = getReceiveTitleListener();
        if (receiveTitleListener != null) {
            receiveTitleListener.receiveTitle(title);
        }
    }

    @Override // ru.ozon.app.android.web.WebFragment
    protected void setupNavigation() {
        FragmentWebNavbarOverlayBinding fragmentWebNavbarOverlayBinding = this.overlayBinding;
        if (fragmentWebNavbarOverlayBinding == null) {
            return;
        }
        if (!getShouldShowNavBar()) {
            fragmentWebNavbarOverlayBinding.toolbar.setVisibility(8);
            return;
        }
        fragmentWebNavbarOverlayBinding.backButton.setOnClickListener(new D90.c(this, 1));
        if (isShareEnabled()) {
            fragmentWebNavbarOverlayBinding.shareBtn.setVisibility(0);
            fragmentWebNavbarOverlayBinding.shareBtn.setOnClickListener(new HY.c(this, 0));
        } else {
            fragmentWebNavbarOverlayBinding.shareBtn.setVisibility(8);
        }
        fragmentWebNavbarOverlayBinding.toolbar.setVisibility(0);
    }
}
