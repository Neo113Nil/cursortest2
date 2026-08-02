package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.app.android.travel.feature.b2b.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemTravelDocumentsToEmailEmailBinding implements a {

    @NonNull
    public final SmallIconButtonView emailIcon;

    @NonNull
    public final TextAtomView emailTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemTravelDocumentsToEmailEmailBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.emailIcon = smallIconButtonView;
        this.emailTitle = textAtomView;
    }

    @NonNull
    public static ItemTravelDocumentsToEmailEmailBinding bind(@NonNull View view) {
        int i11 = R$id.emailIcon;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.emailTitle;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ItemTravelDocumentsToEmailEmailBinding((ConstraintLayout) view, smallIconButtonView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelDocumentsToEmailEmailBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_documents_to_email_email, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
