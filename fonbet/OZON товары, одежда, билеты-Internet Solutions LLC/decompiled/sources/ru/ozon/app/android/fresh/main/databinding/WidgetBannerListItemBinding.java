package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetBannerListItemBinding implements a {

    @NonNull
    public final ConstraintLayout bannerContainer;

    @NonNull
    public final FrameLayout bannerView;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomView titleTv;

    private WidgetBannerListItemBinding(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView) {
        this.rootView = frameLayout;
        this.bannerContainer = constraintLayout;
        this.bannerView = frameLayout2;
        this.imageIv = imageView;
        this.titleTv = textAtomView;
    }

    @NonNull
    public static WidgetBannerListItemBinding bind(@NonNull View view) {
        int i11 = R$id.bannerContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i11 = R$id.imageIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.titleTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetBannerListItemBinding(frameLayout, constraintLayout, frameLayout, imageView, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
