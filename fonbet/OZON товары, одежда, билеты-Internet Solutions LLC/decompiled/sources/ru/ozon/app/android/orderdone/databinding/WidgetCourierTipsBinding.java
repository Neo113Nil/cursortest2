package ru.ozon.app.android.orderdone.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.orderdone.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes13.dex */
public final class WidgetCourierTipsBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final ButtonV3View buttonSend;

    @NonNull
    public final Barrier checkBoxBarrier;

    @NonNull
    public final CheckBoxView checkbox;

    @NonNull
    public final TextAtomV2View checkboxText;

    @NonNull
    public final ConstraintLayout courierTipsWidget;

    @NonNull
    public final IconButtonV3View infoButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    @NonNull
    public final RecyclerView variantsRecyclerView;

    private WidgetCourierTipsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull ButtonV3View buttonV3View, @NonNull Barrier barrier, @NonNull CheckBoxView checkBoxView, @NonNull TextAtomV2View textAtomV2View, @NonNull ConstraintLayout constraintLayout2, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.badge = badgeView;
        this.buttonSend = buttonV3View;
        this.checkBoxBarrier = barrier;
        this.checkbox = checkBoxView;
        this.checkboxText = textAtomV2View;
        this.courierTipsWidget = constraintLayout2;
        this.infoButton = iconButtonV3View;
        this.subtitle = textAtomV2View2;
        this.title = textAtomV2View3;
        this.variantsRecyclerView = recyclerView;
    }

    @NonNull
    public static WidgetCourierTipsBinding bind(@NonNull View view) {
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.buttonSend;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                i11 = R$id.checkBoxBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.checkbox;
                    CheckBoxView checkBoxView = (CheckBoxView) C2548q.d(i11, view);
                    if (checkBoxView != null) {
                        i11 = R$id.checkboxText;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.infoButton;
                            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                            if (iconButtonV3View != null) {
                                i11 = R$id.subtitle;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View2 != null) {
                                    i11 = R$id.title;
                                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View3 != null) {
                                        i11 = R$id.variantsRecyclerView;
                                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                        if (recyclerView != null) {
                                            return new WidgetCourierTipsBinding(constraintLayout, badgeView, buttonV3View, barrier, checkBoxView, textAtomV2View, constraintLayout, iconButtonV3View, textAtomV2View2, textAtomV2View3, recyclerView);
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
