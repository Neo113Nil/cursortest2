package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.github.chrisbanes.photoview.PhotoView;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class PdfPreviewListItemBinding implements a {

    @NonNull
    public final PhotoView pvPdf;

    @NonNull
    private final FrameLayout rootView;

    private PdfPreviewListItemBinding(@NonNull FrameLayout frameLayout, @NonNull PhotoView photoView) {
        this.rootView = frameLayout;
        this.pvPdf = photoView;
    }

    @NonNull
    public static PdfPreviewListItemBinding bind(@NonNull View view) {
        PhotoView photoView = (PhotoView) C2548q.d(R.id.pv_pdf, view);
        if (photoView != null) {
            return new PdfPreviewListItemBinding((FrameLayout) view, photoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.pv_pdf)));
    }

    @NonNull
    public static PdfPreviewListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PdfPreviewListItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.pdf_preview_list_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
