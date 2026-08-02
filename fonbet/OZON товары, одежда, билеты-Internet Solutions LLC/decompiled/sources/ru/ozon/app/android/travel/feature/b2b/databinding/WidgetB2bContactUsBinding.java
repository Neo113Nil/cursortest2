package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetB2bContactUsBinding implements a {

    @NonNull
    public final VerticalAtomsLayout b2bContactUsBannerCells;

    @NonNull
    public final AppCompatImageView b2bContactUsBannerLogo;

    @NonNull
    public final ConstraintLayout b2bContactUsBannerRoot;

    @NonNull
    public final TextAtomView b2bContactUsBannerSubtitle;

    @NonNull
    public final TextAtomView b2bContactUsBannerTitle;

    @NonNull
    public final TextAtomView b2bContactUsTitle;

    @NonNull
    private final LinearLayout rootView;

    private WidgetB2bContactUsBinding(@NonNull LinearLayout linearLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = linearLayout;
        this.b2bContactUsBannerCells = verticalAtomsLayout;
        this.b2bContactUsBannerLogo = appCompatImageView;
        this.b2bContactUsBannerRoot = constraintLayout;
        this.b2bContactUsBannerSubtitle = textAtomView;
        this.b2bContactUsBannerTitle = textAtomView2;
        this.b2bContactUsTitle = textAtomView3;
    }

    @NonNull
    public static WidgetB2bContactUsBinding bind(@NonNull View view) {
        int i11 = R$id.b2bContactUsBannerCells;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.b2bContactUsBannerLogo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.b2bContactUsBannerRoot;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.b2bContactUsBannerSubtitle;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.b2bContactUsBannerTitle;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            i11 = R$id.b2bContactUsTitle;
                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView3 != null) {
                                return new WidgetB2bContactUsBinding((LinearLayout) view, verticalAtomsLayout, appCompatImageView, constraintLayout, textAtomView, textAtomView2, textAtomView3);
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
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
