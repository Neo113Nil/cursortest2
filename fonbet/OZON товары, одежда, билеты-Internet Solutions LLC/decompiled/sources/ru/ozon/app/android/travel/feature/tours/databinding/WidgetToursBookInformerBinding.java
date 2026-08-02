package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetToursBookInformerBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallIconButtonView tourBookInformerInfoButtonSibv;

    @NonNull
    public final AppCompatImageView toursBookInformerIcon;

    @NonNull
    public final TextAtomView toursBookInformerTitleTav;

    private WidgetToursBookInformerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.tourBookInformerInfoButtonSibv = smallIconButtonView;
        this.toursBookInformerIcon = appCompatImageView;
        this.toursBookInformerTitleTav = textAtomView;
    }

    @NonNull
    public static WidgetToursBookInformerBinding bind(@NonNull View view) {
        int i11 = R$id.tourBookInformerInfoButtonSibv;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.toursBookInformerIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.toursBookInformerTitleTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetToursBookInformerBinding((ConstraintLayout) view, smallIconButtonView, appCompatImageView, textAtomView);
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
