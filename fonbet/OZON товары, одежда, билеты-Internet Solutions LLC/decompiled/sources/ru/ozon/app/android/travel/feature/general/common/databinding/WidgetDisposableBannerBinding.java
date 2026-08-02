package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetDisposableBannerBinding implements a {

    @NonNull
    public final SmallIconButtonView disposableBannerButtonSBV;

    @NonNull
    public final TextAtomView disposableBannerDescriptionTAV;

    @NonNull
    public final AppCompatImageView disposableBannerImageACIV;

    @NonNull
    public final TextAtomView disposableBannerTitleTAV;

    @NonNull
    public final Guideline guideline;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetDisposableBannerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView2, @NonNull Guideline guideline) {
        this.rootView = constraintLayout;
        this.disposableBannerButtonSBV = smallIconButtonView;
        this.disposableBannerDescriptionTAV = textAtomView;
        this.disposableBannerImageACIV = appCompatImageView;
        this.disposableBannerTitleTAV = textAtomView2;
        this.guideline = guideline;
    }

    @NonNull
    public static WidgetDisposableBannerBinding bind(@NonNull View view) {
        int i11 = R$id.disposableBannerButtonSBV;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.disposableBannerDescriptionTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.disposableBannerImageACIV;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.disposableBannerTitleTAV;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.guideline;
                        Guideline guideline = (Guideline) C2548q.d(i11, view);
                        if (guideline != null) {
                            return new WidgetDisposableBannerBinding((ConstraintLayout) view, smallIconButtonView, textAtomView, appCompatImageView, textAtomView2, guideline);
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
