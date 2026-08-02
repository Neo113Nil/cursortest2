package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import ru.ozon.app.android.orderdetails.R$id;

/* loaded from: classes13.dex */
public final class WidgetDeliveryTimeSelectorBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tabLayout;

    @NonNull
    public final RecyclerView timeRecyclerView;

    private WidgetDeliveryTimeSelectorBinding(@NonNull LinearLayout linearLayout, @NonNull TabLayout tabLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.tabLayout = tabLayout;
        this.timeRecyclerView = recyclerView;
    }

    @NonNull
    public static WidgetDeliveryTimeSelectorBinding bind(@NonNull View view) {
        int i11 = R$id.tabLayout;
        TabLayout tabLayout = (TabLayout) C2548q.d(i11, view);
        if (tabLayout != null) {
            i11 = R$id.timeRecyclerView;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new WidgetDeliveryTimeSelectorBinding((LinearLayout) view, tabLayout, recyclerView);
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
