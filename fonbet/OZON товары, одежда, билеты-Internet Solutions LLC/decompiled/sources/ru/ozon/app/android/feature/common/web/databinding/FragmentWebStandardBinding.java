package ru.ozon.app.android.feature.common.web.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.feature.common.web.R$id;
import ru.ozon.app.android.uikit.view.toolbar.ToolbarWithTeeth;
import ru.ozon.app.android.web.webview.OzonWebView;

/* loaded from: classes12.dex */
public final class FragmentWebStandardBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ToolbarWithTeeth toolbar;

    @NonNull
    public final OzonWebView webView;

    private FragmentWebStandardBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ToolbarWithTeeth toolbarWithTeeth, @NonNull OzonWebView ozonWebView) {
        this.rootView = constraintLayout;
        this.toolbar = toolbarWithTeeth;
        this.webView = ozonWebView;
    }

    @NonNull
    public static FragmentWebStandardBinding bind(@NonNull View view) {
        int i11 = R$id.toolbar;
        ToolbarWithTeeth toolbarWithTeeth = (ToolbarWithTeeth) C2548q.d(i11, view);
        if (toolbarWithTeeth != null) {
            i11 = R$id.webView;
            OzonWebView ozonWebView = (OzonWebView) C2548q.d(i11, view);
            if (ozonWebView != null) {
                return new FragmentWebStandardBinding((ConstraintLayout) view, toolbarWithTeeth, ozonWebView);
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
