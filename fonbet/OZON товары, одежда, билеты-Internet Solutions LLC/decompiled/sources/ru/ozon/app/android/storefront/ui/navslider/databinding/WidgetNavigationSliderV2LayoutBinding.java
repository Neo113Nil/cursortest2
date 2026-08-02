package ru.ozon.app.android.storefront.ui.navslider.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.ui.navslider.R$id;

/* loaded from: classes7.dex */
public final class WidgetNavigationSliderV2LayoutBinding implements a {

    @NonNull
    public final LinearLayout containerLl;

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetNavigationSliderV2LayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.containerLl = linearLayout2;
        this.itemsRv = recyclerView;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetNavigationSliderV2LayoutBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.itemsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new WidgetNavigationSliderV2LayoutBinding(linearLayout, linearLayout, recyclerView, textView);
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
