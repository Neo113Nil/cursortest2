package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.app.android.returns.creation.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes13.dex */
public final class PhotoPickerPhotoItemBinding implements a {

    @NonNull
    public final IconButtonV3View deletePhotoIbv;

    @NonNull
    public final View overlayView;

    @NonNull
    public final AppCompatImageView photoIv;

    @NonNull
    public final LoaderView photoLoaderLv;

    @NonNull
    public final IconView retryLoadingIv;

    @NonNull
    private final ConstraintLayout rootView;

    private PhotoPickerPhotoItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull LoaderView loaderView, @NonNull IconView iconView) {
        this.rootView = constraintLayout;
        this.deletePhotoIbv = iconButtonV3View;
        this.overlayView = view;
        this.photoIv = appCompatImageView;
        this.photoLoaderLv = loaderView;
        this.retryLoadingIv = iconView;
    }

    @NonNull
    public static PhotoPickerPhotoItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.deletePhotoIbv;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null && (d11 = C2548q.d((i11 = R$id.overlayView), view)) != null) {
            i11 = R$id.photoIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.photoLoaderLv;
                LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
                if (loaderView != null) {
                    i11 = R$id.retryLoadingIv;
                    IconView iconView = (IconView) C2548q.d(i11, view);
                    if (iconView != null) {
                        return new PhotoPickerPhotoItemBinding((ConstraintLayout) view, iconButtonV3View, d11, appCompatImageView, loaderView, iconView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PhotoPickerPhotoItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PhotoPickerPhotoItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.photo_picker_photo_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
