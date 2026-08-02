package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetPassengersMatcherV2Binding implements a {

    @NonNull
    public final RecyclerView passengerMatcherV2CategoriesRV;

    @NonNull
    public final TextAtomView passengerMatcherV2SubtitleTAV;

    @NonNull
    public final TextAtomView passengerMatcherV2TitleTAV;

    @NonNull
    private final LinearLayout rootView;

    private WidgetPassengersMatcherV2Binding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.passengerMatcherV2CategoriesRV = recyclerView;
        this.passengerMatcherV2SubtitleTAV = textAtomView;
        this.passengerMatcherV2TitleTAV = textAtomView2;
    }

    @NonNull
    public static WidgetPassengersMatcherV2Binding bind(@NonNull View view) {
        int i11 = R$id.passengerMatcherV2CategoriesRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.passengerMatcherV2SubtitleTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.passengerMatcherV2TitleTAV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new WidgetPassengersMatcherV2Binding((LinearLayout) view, recyclerView, textAtomView, textAtomView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
