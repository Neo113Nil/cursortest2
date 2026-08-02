package ru.ozon.app.android.cscore.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.cscore.R$id;
import ru.ozon.app.android.cscore.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class ItemImageBinding implements a {

    @NonNull
    public final AppCompatImageView adultIv;

    @NonNull
    public final BadgeView counterBadge;

    @NonNull
    public final TextAtomV2View counterTav;

    @NonNull
    public final AppCompatImageView eyeIv;

    @NonNull
    public final Image imageIv;

    @NonNull
    public final View overlay;

    @NonNull
    public final ProductMediaView productMediaPmv;

    @NonNull
    private final FrameLayout rootView;

    private ItemImageBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BadgeView badgeView, @NonNull TextAtomV2View textAtomV2View, @NonNull AppCompatImageView appCompatImageView2, @NonNull Image image, @NonNull View view, @NonNull ProductMediaView productMediaView) {
        this.rootView = frameLayout;
        this.adultIv = appCompatImageView;
        this.counterBadge = badgeView;
        this.counterTav = textAtomV2View;
        this.eyeIv = appCompatImageView2;
        this.imageIv = image;
        this.overlay = view;
        this.productMediaPmv = productMediaView;
    }

    @NonNull
    public static ItemImageBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.adultIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.counterBadge;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.counterTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.eyeIv;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.imageIv;
                        Image image = (Image) C2548q.d(i11, view);
                        if (image != null && (d11 = C2548q.d((i11 = R$id.overlay), view)) != null) {
                            i11 = R$id.productMediaPmv;
                            ProductMediaView productMediaView = (ProductMediaView) C2548q.d(i11, view);
                            if (productMediaView != null) {
                                return new ItemImageBinding((FrameLayout) view, appCompatImageView, badgeView, textAtomV2View, appCompatImageView2, image, d11, productMediaView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemImageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_image, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
