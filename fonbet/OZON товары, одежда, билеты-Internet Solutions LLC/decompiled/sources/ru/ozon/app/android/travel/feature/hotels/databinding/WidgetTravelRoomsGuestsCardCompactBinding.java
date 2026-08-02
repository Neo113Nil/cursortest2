package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetTravelRoomsGuestsCardCompactBinding implements a {

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    @NonNull
    public final RecyclerView travelRoomsGuestsCardCompactRV;

    @NonNull
    public final TextAtomView travelRoomsGuestsCardCompactTitleTV;

    private WidgetTravelRoomsGuestsCardCompactBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayoutWithBorder;
        this.travelRoomsGuestsCardCompactRV = recyclerView;
        this.travelRoomsGuestsCardCompactTitleTV = textAtomView;
    }

    @NonNull
    public static WidgetTravelRoomsGuestsCardCompactBinding bind(@NonNull View view) {
        int i11 = R$id.travelRoomsGuestsCardCompactRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.travelRoomsGuestsCardCompactTitleTV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new WidgetTravelRoomsGuestsCardCompactBinding((ConstraintLayoutWithBorder) view, recyclerView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayoutWithBorder getConstraintLayout() {
        return this.rootView;
    }
}
