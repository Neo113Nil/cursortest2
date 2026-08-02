package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.actionProgress.presentation.GradientProgressBar;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetActionProgressBinding implements a {

    @NonNull
    public final GradientProgressBar actionProgressProgressBar;

    @NonNull
    public final TextAtomView actionProgressProgressText;

    @NonNull
    public final TextAtomView actionProgressSubtitle;

    @NonNull
    public final TextAtomView actionProgressTitle;

    @NonNull
    public final CardView cardContainer;

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final Space space;

    private WidgetActionProgressBinding(@NonNull CardView cardView, @NonNull GradientProgressBar gradientProgressBar, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull CardView cardView2, @NonNull ConstraintLayout constraintLayout, @NonNull Space space) {
        this.rootView = cardView;
        this.actionProgressProgressBar = gradientProgressBar;
        this.actionProgressProgressText = textAtomView;
        this.actionProgressSubtitle = textAtomView2;
        this.actionProgressTitle = textAtomView3;
        this.cardContainer = cardView2;
        this.container = constraintLayout;
        this.space = space;
    }

    @NonNull
    public static WidgetActionProgressBinding bind(@NonNull View view) {
        int i11 = R$id.actionProgressProgressBar;
        GradientProgressBar gradientProgressBar = (GradientProgressBar) C2548q.d(i11, view);
        if (gradientProgressBar != null) {
            i11 = R$id.actionProgressProgressText;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.actionProgressSubtitle;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.actionProgressTitle;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        CardView cardView = (CardView) view;
                        i11 = R$id.container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                        if (constraintLayout != null) {
                            i11 = R$id.space;
                            Space space = (Space) C2548q.d(i11, view);
                            if (space != null) {
                                return new WidgetActionProgressBinding(cardView, gradientProgressBar, textAtomView, textAtomView2, textAtomView3, cardView, constraintLayout, space);
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
    public CardView getConstraintLayout() {
        return this.rootView;
    }
}
