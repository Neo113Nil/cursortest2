package ru.ozon.app.android.feature.common.web.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.feature.common.web.R$id;
import ru.ozon.app.android.uikit.view.button.ShadowImageButton;
import ru.ozon.app.android.web.webview.OzonWebView;

/* loaded from: classes12.dex */
public final class FragmentWebNavbarOverlayBinding implements a {

    @NonNull
    public final ShadowImageButton backButton;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ShadowImageButton shareBtn;

    @NonNull
    public final LinearLayout toolbar;

    @NonNull
    public final OzonWebView webView;

    private FragmentWebNavbarOverlayBinding(@NonNull FrameLayout frameLayout, @NonNull ShadowImageButton shadowImageButton, @NonNull ShadowImageButton shadowImageButton2, @NonNull LinearLayout linearLayout, @NonNull OzonWebView ozonWebView) {
        this.rootView = frameLayout;
        this.backButton = shadowImageButton;
        this.shareBtn = shadowImageButton2;
        this.toolbar = linearLayout;
        this.webView = ozonWebView;
    }

    @NonNull
    public static FragmentWebNavbarOverlayBinding bind(@NonNull View view) {
        int i11 = R$id.backButton;
        ShadowImageButton shadowImageButton = (ShadowImageButton) C2548q.d(i11, view);
        if (shadowImageButton != null) {
            i11 = R$id.shareBtn;
            ShadowImageButton shadowImageButton2 = (ShadowImageButton) C2548q.d(i11, view);
            if (shadowImageButton2 != null) {
                i11 = R$id.toolbar;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.webView;
                    OzonWebView ozonWebView = (OzonWebView) C2548q.d(i11, view);
                    if (ozonWebView != null) {
                        return new FragmentWebNavbarOverlayBinding((FrameLayout) view, shadowImageButton, shadowImageButton2, linearLayout, ozonWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
