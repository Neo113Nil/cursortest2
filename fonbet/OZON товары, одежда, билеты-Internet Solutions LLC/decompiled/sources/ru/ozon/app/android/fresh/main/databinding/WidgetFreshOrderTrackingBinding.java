package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.main.R$id;

/* loaded from: classes12.dex */
public final class WidgetFreshOrderTrackingBinding implements a {

    @NonNull
    public final RecyclerView ordersTrackingRv;

    @NonNull
    private final FrameLayout rootView;

    private WidgetFreshOrderTrackingBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.ordersTrackingRv = recyclerView;
    }

    @NonNull
    public static WidgetFreshOrderTrackingBinding bind(@NonNull View view) {
        int i11 = R$id.ordersTrackingRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetFreshOrderTrackingBinding((FrameLayout) view, recyclerView);
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
