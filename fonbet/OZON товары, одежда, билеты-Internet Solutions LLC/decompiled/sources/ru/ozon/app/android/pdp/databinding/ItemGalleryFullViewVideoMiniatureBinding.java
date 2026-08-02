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
public final class ItemGalleryFullViewVideoMiniatureBinding implements a {

    @NonNull
    public final View play;

    @NonNull
    public final MaterialCardView previewGroup;

    @NonNull
    public final AppCompatImageView previewIv;

    @NonNull
    private final MaterialCardView rootView;

    private ItemGalleryFullViewVideoMiniatureBinding(@NonNull MaterialCardView materialCardView, @NonNull View view, @NonNull MaterialCardView materialCardView2, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = materialCardView;
        this.play = view;
        this.previewGroup = materialCardView2;
        this.previewIv = appCompatImageView;
    }

    @NonNull
    public static ItemGalleryFullViewVideoMiniatureBinding bind(@NonNull View view) {
        int i11 = R$id.play;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            int i12 = R$id.previewIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i12, view);
            if (appCompatImageView != null) {
                return new ItemGalleryFullViewVideoMiniatureBinding(materialCardView, d11, materialCardView, appCompatImageView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemGalleryFullViewVideoMiniatureBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_gallery_full_view_video_miniature, viewGroup, false);
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
