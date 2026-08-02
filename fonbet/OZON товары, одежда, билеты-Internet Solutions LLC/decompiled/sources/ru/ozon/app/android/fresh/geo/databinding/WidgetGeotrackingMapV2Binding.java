package ru.ozon.app.android.fresh.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.uni.android.controls.button.IconButtonView;

/* loaded from: classes12.dex */
public final class WidgetGeotrackingMapV2Binding implements a {

    @NonNull
    public final IconButtonView backBtn;

    @NonNull
    public final ConstraintLayout containerLayout;

    @NonNull
    public final IconButtonView locationBtn;

    @NonNull
    public final FrameLayout mapContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View statusBarBackground;

    private WidgetGeotrackingMapV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull IconButtonView iconButtonView, @NonNull ConstraintLayout constraintLayout2, @NonNull IconButtonView iconButtonView2, @NonNull FrameLayout frameLayout, @NonNull View view) {
        this.rootView = constraintLayout;
        this.backBtn = iconButtonView;
        this.containerLayout = constraintLayout2;
        this.locationBtn = iconButtonView2;
        this.mapContainer = frameLayout;
        this.statusBarBackground = view;
    }

    @NonNull
    public static WidgetGeotrackingMapV2Binding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.backBtn;
        IconButtonView iconButtonView = (IconButtonView) C2548q.d(i11, view);
        if (iconButtonView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.locationBtn;
            IconButtonView iconButtonView2 = (IconButtonView) C2548q.d(i11, view);
            if (iconButtonView2 != null) {
                i11 = R$id.mapContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null && (d11 = C2548q.d((i11 = R$id.statusBarBackground), view)) != null) {
                    return new WidgetGeotrackingMapV2Binding(constraintLayout, iconButtonView, constraintLayout, iconButtonView2, frameLayout, d11);
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
