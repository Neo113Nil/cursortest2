package ru.ozon.app.android.travel.feature.railway.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetRailwayStepsHeaderBinding implements a {

    @NonNull
    public final SmallIconButtonView railwayStepsHeaderEditSibv;

    @NonNull
    public final TextAtomView railwayStepsHeaderSubtitleTav;

    @NonNull
    public final TextAtomView railwayStepsHeaderTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetRailwayStepsHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.railwayStepsHeaderEditSibv = smallIconButtonView;
        this.railwayStepsHeaderSubtitleTav = textAtomView;
        this.railwayStepsHeaderTitleTav = textAtomView2;
    }

    @NonNull
    public static WidgetRailwayStepsHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.railwayStepsHeaderEditSibv;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.railwayStepsHeaderSubtitleTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.railwayStepsHeaderTitleTav;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new WidgetRailwayStepsHeaderBinding((ConstraintLayout) view, smallIconButtonView, textAtomView, textAtomView2);
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
