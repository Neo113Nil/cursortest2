package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;

/* loaded from: classes3.dex */
public final class WidgetPassengersDirectoryV2Binding implements a {

    @NonNull
    public final RecyclerView passengersListRV;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CommonTextInputView searchInputCTIV;

    @NonNull
    public final FrameLayout searchInputContainer;

    private WidgetPassengersDirectoryV2Binding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull CommonTextInputView commonTextInputView, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.passengersListRV = recyclerView;
        this.searchInputCTIV = commonTextInputView;
        this.searchInputContainer = frameLayout;
    }

    @NonNull
    public static WidgetPassengersDirectoryV2Binding bind(@NonNull View view) {
        int i11 = R$id.passengersListRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.searchInputCTIV;
            CommonTextInputView commonTextInputView = (CommonTextInputView) C2548q.d(i11, view);
            if (commonTextInputView != null) {
                i11 = R$id.searchInputContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    return new WidgetPassengersDirectoryV2Binding((LinearLayout) view, recyclerView, commonTextInputView, frameLayout);
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
