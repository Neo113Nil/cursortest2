package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.view.TravelSearchResultsNavTitleViewGroup;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetSearchResultsNavTitleBinding implements a {

    @NonNull
    public final TextAtomView arrivalTav;

    @NonNull
    public final TextAtomView departureTav;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final TextAtomView symbolBetween;

    @NonNull
    public final TravelSearchResultsNavTitleViewGroup travelSearchResultsNavTitleViewGroup;

    private WidgetSearchResultsNavTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TravelSearchResultsNavTitleViewGroup travelSearchResultsNavTitleViewGroup) {
        this.rootView = constraintLayout;
        this.arrivalTav = textAtomView;
        this.departureTav = textAtomView2;
        this.subtitleTav = textAtomView3;
        this.symbolBetween = textAtomView4;
        this.travelSearchResultsNavTitleViewGroup = travelSearchResultsNavTitleViewGroup;
    }

    @NonNull
    public static WidgetSearchResultsNavTitleBinding bind(@NonNull View view) {
        int i11 = R$id.arrivalTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.departureTav;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.subtitleTav;
                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView3 != null) {
                    i11 = R$id.symbolBetween;
                    TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView4 != null) {
                        i11 = R$id.travelSearchResultsNavTitleViewGroup;
                        TravelSearchResultsNavTitleViewGroup travelSearchResultsNavTitleViewGroup = (TravelSearchResultsNavTitleViewGroup) C2548q.d(i11, view);
                        if (travelSearchResultsNavTitleViewGroup != null) {
                            return new WidgetSearchResultsNavTitleBinding((ConstraintLayout) view, textAtomView, textAtomView2, textAtomView3, textAtomView4, travelSearchResultsNavTitleViewGroup);
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
