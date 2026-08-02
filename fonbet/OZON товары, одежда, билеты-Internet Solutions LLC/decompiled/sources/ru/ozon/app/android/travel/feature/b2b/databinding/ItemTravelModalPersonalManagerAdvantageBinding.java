package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.app.android.travel.feature.b2b.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemTravelModalPersonalManagerAdvantageBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView travelModalPersonalBulletTV;

    @NonNull
    public final TextAtomView travelModalPersonalTextTAV;

    private ItemTravelModalPersonalManagerAdvantageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.travelModalPersonalBulletTV = appCompatTextView;
        this.travelModalPersonalTextTAV = textAtomView;
    }

    @NonNull
    public static ItemTravelModalPersonalManagerAdvantageBinding bind(@NonNull View view) {
        int i11 = R$id.travelModalPersonalBulletTV;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.travelModalPersonalTextTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ItemTravelModalPersonalManagerAdvantageBinding((ConstraintLayout) view, appCompatTextView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelModalPersonalManagerAdvantageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_modal_personal_manager_advantage, viewGroup, false);
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
