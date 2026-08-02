package ru.ozon.app.android.fresh.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ru.ozon.app.android.fresh.geo.R$id;

/* loaded from: classes12.dex */
public final class GeotrackingV2BottomSheetBinding implements a {

    @NonNull
    public final CoordinatorLayout bottomSheet;

    @NonNull
    public final LinearLayout bottomSheetRv;

    @NonNull
    public final View handlerV;

    @NonNull
    private final CoordinatorLayout rootView;

    private GeotrackingV2BottomSheetBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull LinearLayout linearLayout, @NonNull View view) {
        this.rootView = coordinatorLayout;
        this.bottomSheet = coordinatorLayout2;
        this.bottomSheetRv = linearLayout;
        this.handlerV = view;
    }

    @NonNull
    public static GeotrackingV2BottomSheetBinding bind(@NonNull View view) {
        View d11;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i11 = R$id.bottomSheetRv;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout == null || (d11 = C2548q.d((i11 = R$id.handlerV), view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new GeotrackingV2BottomSheetBinding(coordinatorLayout, coordinatorLayout, linearLayout, d11);
    }

    @Override // X4.a
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
