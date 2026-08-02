package ru.ozon.app.android.courieronmap.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ru.ozon.app.android.courieronmap.R$id;
import ru.ozon.app.android.courieronmap.R$layout;

/* loaded from: classes11.dex */
public final class WidgetCourierOnMapBinding implements a {

    @NonNull
    public final ImageView backBtn;

    @NonNull
    public final FloatingActionButton locationFab;

    @NonNull
    public final FrameLayout mapContainer;

    @NonNull
    public final BottomSheetCourierOnMapBinding popupContainer;

    @NonNull
    private final CoordinatorLayout rootView;

    private WidgetCourierOnMapBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ImageView imageView, @NonNull FloatingActionButton floatingActionButton, @NonNull FrameLayout frameLayout, @NonNull BottomSheetCourierOnMapBinding bottomSheetCourierOnMapBinding) {
        this.rootView = coordinatorLayout;
        this.backBtn = imageView;
        this.locationFab = floatingActionButton;
        this.mapContainer = frameLayout;
        this.popupContainer = bottomSheetCourierOnMapBinding;
    }

    @NonNull
    public static WidgetCourierOnMapBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.backBtn;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.locationFab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) C2548q.d(i11, view);
            if (floatingActionButton != null) {
                i11 = R$id.mapContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null && (d11 = C2548q.d((i11 = R$id.popupContainer), view)) != null) {
                    return new WidgetCourierOnMapBinding((CoordinatorLayout) view, imageView, floatingActionButton, frameLayout, BottomSheetCourierOnMapBinding.bind(d11));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetCourierOnMapBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_courier_on_map, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CoordinatorLayout getConstraintLayout() {
        return this.rootView;
    }
}
