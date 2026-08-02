package ru.ozon.app.android.composer.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.pdfviewer.presentation.PinchRecyclerView;
import ru.ozon.app.android.uikit.databinding.ViewProgressbarWhiteBgBinding;

/* loaded from: classes11.dex */
public final class PdfViewerFragmentBinding implements a {

    @NonNull
    public final PinchRecyclerView pdfView;

    @NonNull
    public final FrameLayout pdfViewFl;

    @NonNull
    public final FrameLayout pdfViewParanjaFl;

    @NonNull
    public final ViewProgressbarWhiteBgBinding progress;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    private PdfViewerFragmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull PinchRecyclerView pinchRecyclerView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ViewProgressbarWhiteBgBinding viewProgressbarWhiteBgBinding, @NonNull Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.pdfView = pinchRecyclerView;
        this.pdfViewFl = frameLayout;
        this.pdfViewParanjaFl = frameLayout2;
        this.progress = viewProgressbarWhiteBgBinding;
        this.toolbar = toolbar;
    }

    @NonNull
    public static PdfViewerFragmentBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.pdfView;
        PinchRecyclerView pinchRecyclerView = (PinchRecyclerView) C2548q.d(i11, view);
        if (pinchRecyclerView != null) {
            i11 = R$id.pdfViewFl;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = R$id.pdfViewParanjaFl;
                FrameLayout frameLayout2 = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout2 != null && (d11 = C2548q.d((i11 = R$id.progress), view)) != null) {
                    ViewProgressbarWhiteBgBinding bind = ViewProgressbarWhiteBgBinding.bind(d11);
                    i11 = R$id.toolbar;
                    Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                    if (toolbar != null) {
                        return new PdfViewerFragmentBinding((ConstraintLayout) view, pinchRecyclerView, frameLayout, frameLayout2, bind, toolbar);
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
