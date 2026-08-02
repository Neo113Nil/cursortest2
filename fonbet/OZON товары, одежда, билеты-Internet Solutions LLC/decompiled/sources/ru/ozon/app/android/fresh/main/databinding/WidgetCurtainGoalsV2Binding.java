package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetCurtainGoalsV2Binding implements a {

    @NonNull
    public final TextAtomV2View curtainGoalDescription;

    @NonNull
    public final ImageView curtainGoalsIv;

    @NonNull
    public final ButtonV3View curtainGoalsLargeButton;

    @NonNull
    public final ProgressBar curtainGoalsProgress;

    @NonNull
    public final ConstraintLayout curtainGoalsProgressBg;

    @NonNull
    public final TextAtomV2View curtainGoalsProgressTa;

    @NonNull
    public final BadgeView curtainGoalsSingleBadge;

    @NonNull
    public final ButtonV3View curtainGoalsTermButton;

    @NonNull
    public final TextAtomV2View curtainGoalsTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetCurtainGoalsV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull ImageView imageView, @NonNull ButtonV3View buttonV3View, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View2, @NonNull BadgeView badgeView, @NonNull ButtonV3View buttonV3View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.curtainGoalDescription = textAtomV2View;
        this.curtainGoalsIv = imageView;
        this.curtainGoalsLargeButton = buttonV3View;
        this.curtainGoalsProgress = progressBar;
        this.curtainGoalsProgressBg = constraintLayout2;
        this.curtainGoalsProgressTa = textAtomV2View2;
        this.curtainGoalsSingleBadge = badgeView;
        this.curtainGoalsTermButton = buttonV3View2;
        this.curtainGoalsTitle = textAtomV2View3;
    }

    @NonNull
    public static WidgetCurtainGoalsV2Binding bind(@NonNull View view) {
        int i11 = R$id.curtainGoalDescription;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.curtainGoalsIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.curtainGoalsLargeButton;
                ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                if (buttonV3View != null) {
                    i11 = R$id.curtainGoalsProgress;
                    ProgressBar progressBar = (ProgressBar) C2548q.d(i11, view);
                    if (progressBar != null) {
                        i11 = R$id.curtainGoalsProgressBg;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                        if (constraintLayout != null) {
                            i11 = R$id.curtainGoalsProgressTa;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                i11 = R$id.curtainGoalsSingleBadge;
                                BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                if (badgeView != null) {
                                    i11 = R$id.curtainGoalsTermButton;
                                    ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
                                    if (buttonV3View2 != null) {
                                        i11 = R$id.curtainGoalsTitle;
                                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                        if (textAtomV2View3 != null) {
                                            return new WidgetCurtainGoalsV2Binding((ConstraintLayout) view, textAtomV2View, imageView, buttonV3View, progressBar, constraintLayout, textAtomV2View2, badgeView, buttonV3View2, textAtomV2View3);
                                        }
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
