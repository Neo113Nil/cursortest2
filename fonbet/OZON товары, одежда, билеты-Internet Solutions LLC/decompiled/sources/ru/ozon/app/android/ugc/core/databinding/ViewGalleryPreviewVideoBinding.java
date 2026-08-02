package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.common.StatusableMediaPreviewView;

/* loaded from: classes2.dex */
public final class ViewGalleryPreviewVideoBinding implements a {

    @NonNull
    public final View overlayView;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ImageView thumbnailIconIv;

    @NonNull
    public final StatusableMediaPreviewView thumbnailPv;

    private ViewGalleryPreviewVideoBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull StatusableMediaPreviewView statusableMediaPreviewView) {
        this.rootView = frameLayout;
        this.overlayView = view;
        this.thumbnailIconIv = imageView;
        this.thumbnailPv = statusableMediaPreviewView;
    }

    @NonNull
    public static ViewGalleryPreviewVideoBinding bind(@NonNull View view) {
        int i11 = R$id.overlayView;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.thumbnailIconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.thumbnailPv;
                StatusableMediaPreviewView statusableMediaPreviewView = (StatusableMediaPreviewView) C2548q.d(i11, view);
                if (statusableMediaPreviewView != null) {
                    return new ViewGalleryPreviewVideoBinding((FrameLayout) view, d11, imageView, statusableMediaPreviewView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
