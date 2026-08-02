package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewImageBannerBinding implements a {

    @NonNull
    public final AppCompatImageView imageBannerArrowIV;

    @NonNull
    public final AppCompatImageView imageBannerIV;

    @NonNull
    public final TextAtomView imageBannerTitleTV;

    @NonNull
    private final View rootView;

    private ViewImageBannerBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.imageBannerArrowIV = appCompatImageView;
        this.imageBannerIV = appCompatImageView2;
        this.imageBannerTitleTV = textAtomView;
    }

    @NonNull
    public static ViewImageBannerBinding bind(@NonNull View view) {
        int i11 = R$id.imageBannerArrowIV;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.imageBannerIV;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView2 != null) {
                i11 = R$id.imageBannerTitleTV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new ViewImageBannerBinding(view, appCompatImageView, appCompatImageView2, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewImageBannerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_image_banner, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
