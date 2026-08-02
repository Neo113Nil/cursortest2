package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewFlightSchemeOrderDetailsBinding implements a {

    @NonNull
    public final Barrier flightSeatsOrderDetailsBarrier;

    @NonNull
    public final TextAtomView flightSeatsOrderDetailsPriceLabelTextView;

    @NonNull
    public final TextAtomView flightSeatsOrderDetailsPriceTextView;

    @NonNull
    public final RecyclerView flightSeatsOrderDetailsRecyclerView;

    @NonNull
    public final View flightSeatsOrderDetailsSeparator;

    @NonNull
    public final LargeButtonView flightSeatsOrderDetailsSubmitButton;

    @NonNull
    public final TextAtomView flightSeatsOrderDetailsTitle;

    @NonNull
    private final View rootView;

    private ViewFlightSchemeOrderDetailsBinding(@NonNull View view, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull RecyclerView recyclerView, @NonNull View view2, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.flightSeatsOrderDetailsBarrier = barrier;
        this.flightSeatsOrderDetailsPriceLabelTextView = textAtomView;
        this.flightSeatsOrderDetailsPriceTextView = textAtomView2;
        this.flightSeatsOrderDetailsRecyclerView = recyclerView;
        this.flightSeatsOrderDetailsSeparator = view2;
        this.flightSeatsOrderDetailsSubmitButton = largeButtonView;
        this.flightSeatsOrderDetailsTitle = textAtomView3;
    }

    @NonNull
    public static ViewFlightSchemeOrderDetailsBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.flightSeatsOrderDetailsBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.flightSeatsOrderDetailsPriceLabelTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.flightSeatsOrderDetailsPriceTextView;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.flightSeatsOrderDetailsRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null && (d11 = C2548q.d((i11 = R$id.flightSeatsOrderDetailsSeparator), view)) != null) {
                        i11 = R$id.flightSeatsOrderDetailsSubmitButton;
                        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                        if (largeButtonView != null) {
                            i11 = R$id.flightSeatsOrderDetailsTitle;
                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView3 != null) {
                                return new ViewFlightSchemeOrderDetailsBinding(view, barrier, textAtomView, textAtomView2, recyclerView, d11, largeButtonView, textAtomView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewFlightSchemeOrderDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_flight_scheme_order_details, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
