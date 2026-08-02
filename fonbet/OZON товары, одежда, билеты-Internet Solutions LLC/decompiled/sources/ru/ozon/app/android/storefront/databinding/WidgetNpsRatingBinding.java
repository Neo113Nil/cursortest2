package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingSelectorView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class WidgetNpsRatingBinding implements a {

    @NonNull
    public final LargeButtonView buttonNext;

    @NonNull
    public final TextAtomView leftSelectorDescription;

    @NonNull
    public final NavbarWidgetNpsBinding navbar;

    @NonNull
    public final View partialBackground;

    @NonNull
    public final AppCompatImageView ratingImage;

    @NonNull
    public final TextAtomView rightSelectorDescription;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final NpsRatingSelectorView selector;

    @NonNull
    public final TextAtomView subtitle;

    @NonNull
    public final TextAtomView title;

    private WidgetNpsRatingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull NavbarWidgetNpsBinding navbarWidgetNpsBinding, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView2, @NonNull NpsRatingSelectorView npsRatingSelectorView, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4) {
        this.rootView = constraintLayout;
        this.buttonNext = largeButtonView;
        this.leftSelectorDescription = textAtomView;
        this.navbar = navbarWidgetNpsBinding;
        this.partialBackground = view;
        this.ratingImage = appCompatImageView;
        this.rightSelectorDescription = textAtomView2;
        this.selector = npsRatingSelectorView;
        this.subtitle = textAtomView3;
        this.title = textAtomView4;
    }

    @NonNull
    public static WidgetNpsRatingBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.buttonNext;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.leftSelectorDescription;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null && (d11 = C2548q.d((i11 = R$id.navbar), view)) != null) {
                NavbarWidgetNpsBinding bind = NavbarWidgetNpsBinding.bind(d11);
                i11 = R$id.partialBackground;
                View d12 = C2548q.d(i11, view);
                if (d12 != null) {
                    i11 = R$id.ratingImage;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.rightSelectorDescription;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            i11 = R$id.selector;
                            NpsRatingSelectorView npsRatingSelectorView = (NpsRatingSelectorView) C2548q.d(i11, view);
                            if (npsRatingSelectorView != null) {
                                i11 = R$id.subtitle;
                                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView3 != null) {
                                    i11 = R$id.title;
                                    TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView4 != null) {
                                        return new WidgetNpsRatingBinding((ConstraintLayout) view, largeButtonView, textAtomView, bind, d12, appCompatImageView, textAtomView2, npsRatingSelectorView, textAtomView3, textAtomView4);
                                    }
                                }
                            }
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
