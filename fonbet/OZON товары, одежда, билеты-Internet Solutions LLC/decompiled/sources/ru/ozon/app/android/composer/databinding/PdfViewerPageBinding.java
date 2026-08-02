package ru.ozon.app.android.composer.databinding;

import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class PdfViewerPageBinding implements a {

    @NonNull
    public final ImageView pdfPageView;

    @NonNull
    private final ImageView rootView;

    private PdfViewerPageBinding(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = imageView;
        this.pdfPageView = imageView2;
    }

    @NonNull
    public static PdfViewerPageBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new PdfViewerPageBinding(imageView, imageView);
    }

    @Override // X4.a
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
