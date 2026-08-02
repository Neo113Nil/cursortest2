package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.app.android.travel.feature.b2b.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemTravelCompanyDocumentBinding implements a {

    @NonNull
    public final ConstraintLayout documentCl;

    @NonNull
    public final SmallButtonView downloadBtn;

    @NonNull
    public final TextAtomView nameTv;

    @NonNull
    private final CardView rootView;

    private ItemTravelCompanyDocumentBinding(@NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull TextAtomView textAtomView) {
        this.rootView = cardView;
        this.documentCl = constraintLayout;
        this.downloadBtn = smallButtonView;
        this.nameTv = textAtomView;
    }

    @NonNull
    public static ItemTravelCompanyDocumentBinding bind(@NonNull View view) {
        int i11 = R$id.documentCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            i11 = R$id.downloadBtn;
            SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
            if (smallButtonView != null) {
                i11 = R$id.nameTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new ItemTravelCompanyDocumentBinding((CardView) view, constraintLayout, smallButtonView, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelCompanyDocumentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_company_document, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
