package ru.ozon.app.android.csma.tips.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.csma.tips.R$id;
import ru.ozon.app.android.csma.tips.R$layout;

/* loaded from: classes11.dex */
public final class WidgetTipCourierProductPhotosBinding implements a {

    @NonNull
    public final RecyclerView photosRv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetTipCourierProductPhotosBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.photosRv = recyclerView;
    }

    @NonNull
    public static WidgetTipCourierProductPhotosBinding bind(@NonNull View view) {
        int i11 = R$id.photosRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetTipCourierProductPhotosBinding((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetTipCourierProductPhotosBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_tip_courier_product_photos, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
