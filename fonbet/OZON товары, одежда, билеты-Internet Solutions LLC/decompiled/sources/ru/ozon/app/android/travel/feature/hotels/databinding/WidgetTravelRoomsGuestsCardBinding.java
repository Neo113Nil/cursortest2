package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeView;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetTravelRoomsGuestsCardBinding implements a {

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    @NonNull
    public final InfoBadgeView travelHotelRoomDetailsInfoBadge;

    @NonNull
    public final RecyclerView travelHotelRoomDetailsRecyclerView;

    @NonNull
    public final TextAtomView travelHotelRoomDetailsTitleTextView;

    private WidgetTravelRoomsGuestsCardBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull InfoBadgeView infoBadgeView, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayoutWithBorder;
        this.travelHotelRoomDetailsInfoBadge = infoBadgeView;
        this.travelHotelRoomDetailsRecyclerView = recyclerView;
        this.travelHotelRoomDetailsTitleTextView = textAtomView;
    }

    @NonNull
    public static WidgetTravelRoomsGuestsCardBinding bind(@NonNull View view) {
        int i11 = R$id.travelHotelRoomDetailsInfoBadge;
        InfoBadgeView infoBadgeView = (InfoBadgeView) C2548q.d(i11, view);
        if (infoBadgeView != null) {
            i11 = R$id.travelHotelRoomDetailsRecyclerView;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.travelHotelRoomDetailsTitleTextView;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new WidgetTravelRoomsGuestsCardBinding((ConstraintLayoutWithBorder) view, infoBadgeView, recyclerView, textAtomView);
                }
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
