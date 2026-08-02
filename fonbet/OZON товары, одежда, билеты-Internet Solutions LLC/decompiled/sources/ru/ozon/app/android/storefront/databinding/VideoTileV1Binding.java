package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class VideoTileV1Binding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final AspectRatioImageView ivImage;

    @NonNull
    public final AppCompatImageView ivStart;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView tvSubtitle;

    @NonNull
    public final TextAtomView tvTitle;

    @NonNull
    public final ConstraintLayout videoTileCl;

    private VideoTileV1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull AspectRatioImageView aspectRatioImageView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.badge = badgeView;
        this.ivImage = aspectRatioImageView;
        this.ivStart = appCompatImageView;
        this.tvSubtitle = textAtomView;
        this.tvTitle = textAtomView2;
        this.videoTileCl = constraintLayout2;
    }

    @NonNull
    public static VideoTileV1Binding bind(@NonNull View view) {
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.ivImage;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) C2548q.d(i11, view);
            if (aspectRatioImageView != null) {
                i11 = R$id.ivStart;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.tvSubtitle;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.tvTitle;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new VideoTileV1Binding(constraintLayout, badgeView, aspectRatioImageView, appCompatImageView, textAtomView, textAtomView2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
