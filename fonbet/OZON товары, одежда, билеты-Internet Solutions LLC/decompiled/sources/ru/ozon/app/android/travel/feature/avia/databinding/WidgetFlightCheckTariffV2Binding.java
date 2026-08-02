package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;

/* loaded from: classes8.dex */
public final class WidgetFlightCheckTariffV2Binding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final RecyclerView travelFlightCheckTariffV2RecyclerView;

    private WidgetFlightCheckTariffV2Binding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.travelFlightCheckTariffV2RecyclerView = recyclerView;
    }

    @NonNull
    public static WidgetFlightCheckTariffV2Binding bind(@NonNull View view) {
        int i11 = R$id.travelFlightCheckTariffV2RecyclerView;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetFlightCheckTariffV2Binding((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
