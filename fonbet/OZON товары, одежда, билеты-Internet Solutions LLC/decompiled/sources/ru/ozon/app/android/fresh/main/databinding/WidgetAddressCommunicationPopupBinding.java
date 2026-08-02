package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetAddressCommunicationPopupBinding implements a {

    @NonNull
    public final SmallButtonView btnNo;

    @NonNull
    public final SmallButtonView btnYes;

    @NonNull
    public final CardView cardContainer;

    @NonNull
    public final ConstraintLayout popUpCommunication;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView tvSubtitle;

    @NonNull
    public final TextAtomView tvTitle;

    private WidgetAddressCommunicationPopupBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull SmallButtonView smallButtonView2, @NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.btnNo = smallButtonView;
        this.btnYes = smallButtonView2;
        this.cardContainer = cardView;
        this.popUpCommunication = constraintLayout2;
        this.tvSubtitle = textAtomView;
        this.tvTitle = textAtomView2;
    }

    @NonNull
    public static WidgetAddressCommunicationPopupBinding bind(@NonNull View view) {
        int i11 = R$id.btnNo;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.btnYes;
            SmallButtonView smallButtonView2 = (SmallButtonView) C2548q.d(i11, view);
            if (smallButtonView2 != null) {
                i11 = R$id.cardContainer;
                CardView cardView = (CardView) C2548q.d(i11, view);
                if (cardView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.tvSubtitle;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.tvTitle;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new WidgetAddressCommunicationPopupBinding(constraintLayout, smallButtonView, smallButtonView2, cardView, constraintLayout, textAtomView, textAtomView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetAddressCommunicationPopupBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WidgetAddressCommunicationPopupBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_address_communication_popup, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
