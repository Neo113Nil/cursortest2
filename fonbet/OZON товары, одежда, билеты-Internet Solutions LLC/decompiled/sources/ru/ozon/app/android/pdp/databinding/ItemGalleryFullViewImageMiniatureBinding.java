package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;

/* loaded from: classes13.dex */
public final class ItemGalleryFullViewImageMiniatureBinding implements a {

    @NonNull
    public final MaterialCardView previewGroup;

    @NonNull
    public final AppCompatImageView previewIv;

    @NonNull
    private final MaterialCardView rootView;

    private ItemGalleryFullViewImageMiniatureBinding(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = materialCardView;
        this.previewGroup = materialCardView2;
        this.previewIv = appCompatImageView;
    }

    @NonNull
    public static ItemGalleryFullViewImageMiniatureBinding bind(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i11 = R$id.previewIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            return new ItemGalleryFullViewImageMiniatureBinding(materialCardView, materialCardView, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemGalleryFullViewImageMiniatureBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_gallery_full_view_image_miniature, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
