package ru.ozon.app.android.storefront.widgets.cms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.widgets.cms.R$id;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;

/* loaded from: classes7.dex */
public final class ItemComponentBannerBinding implements a {

    @NonNull
    public final FrameLayout bannerFl;

    @NonNull
    public final AspectRatioImageView bannerImageIv;

    @NonNull
    private final FrameLayout rootView;

    private ItemComponentBannerBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull AspectRatioImageView aspectRatioImageView) {
        this.rootView = frameLayout;
        this.bannerFl = frameLayout2;
        this.bannerImageIv = aspectRatioImageView;
    }

    @NonNull
    public static ItemComponentBannerBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.bannerImageIv;
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) C2548q.d(i11, view);
        if (aspectRatioImageView != null) {
            return new ItemComponentBannerBinding(frameLayout, frameLayout, aspectRatioImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
