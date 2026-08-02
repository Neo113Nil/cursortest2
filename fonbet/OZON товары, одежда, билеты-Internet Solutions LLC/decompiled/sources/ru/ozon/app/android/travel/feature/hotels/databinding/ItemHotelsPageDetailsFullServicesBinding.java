package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemHotelsPageDetailsFullServicesBinding implements a {

    @NonNull
    public final TextAtomView headerHotelDetailServicesTAV;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView servicesHotelDetailRV;

    private ItemHotelsPageDetailsFullServicesBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.headerHotelDetailServicesTAV = textAtomView;
        this.servicesHotelDetailRV = recyclerView;
    }

    @NonNull
    public static ItemHotelsPageDetailsFullServicesBinding bind(@NonNull View view) {
        int i11 = R$id.headerHotelDetailServicesTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.servicesHotelDetailRV;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new ItemHotelsPageDetailsFullServicesBinding((LinearLayout) view, textAtomView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsPageDetailsFullServicesBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_page_details_full_services, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
