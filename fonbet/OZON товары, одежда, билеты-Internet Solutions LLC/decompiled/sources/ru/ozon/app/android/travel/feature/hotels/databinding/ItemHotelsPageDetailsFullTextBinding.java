package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemHotelsPageDetailsFullTextBinding implements a {

    @NonNull
    public final TextAtomView descriptionHotelDetailTAV;

    @NonNull
    public final TextAtomView headerHotelDetailTAV;

    @NonNull
    private final LinearLayout rootView;

    private ItemHotelsPageDetailsFullTextBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.descriptionHotelDetailTAV = textAtomView;
        this.headerHotelDetailTAV = textAtomView2;
    }

    @NonNull
    public static ItemHotelsPageDetailsFullTextBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionHotelDetailTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.headerHotelDetailTAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new ItemHotelsPageDetailsFullTextBinding((LinearLayout) view, textAtomView, textAtomView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsPageDetailsFullTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_page_details_full_text, viewGroup, false);
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
