package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cs_orders.R$id;

/* loaded from: classes11.dex */
public final class WidgetOrderFiltersBinding implements a {

    @NonNull
    public final View divider;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView sortTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final RecyclerView yearsRv;

    private WidgetOrderFiltersBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.divider = view;
        this.sortTv = textView;
        this.titleTv = textView2;
        this.yearsRv = recyclerView;
    }

    @NonNull
    public static WidgetOrderFiltersBinding bind(@NonNull View view) {
        int i11 = R$id.divider;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.sortTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.yearsRv;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        return new WidgetOrderFiltersBinding((ConstraintLayout) view, d11, textView, textView2, recyclerView);
                    }
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
