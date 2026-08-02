package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;

/* loaded from: classes13.dex */
public final class FragmentCrossSaleListBinding implements a {

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final Toolbar toolbar;

    private FragmentCrossSaleListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.itemsRv = recyclerView;
        this.titleTv = textView;
        this.toolbar = toolbar;
    }

    @NonNull
    public static FragmentCrossSaleListBinding bind(@NonNull View view) {
        int i11 = R$id.itemsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.toolbar;
                Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                if (toolbar != null) {
                    return new FragmentCrossSaleListBinding((ConstraintLayout) view, recyclerView, textView, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentCrossSaleListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCrossSaleListBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_cross_sale_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
