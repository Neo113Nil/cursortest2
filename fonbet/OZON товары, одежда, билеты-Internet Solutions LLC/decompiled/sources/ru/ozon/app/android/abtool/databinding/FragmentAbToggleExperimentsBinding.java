package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.abtool.R$id;
import ru.ozon.app.android.abtool.R$layout;

/* loaded from: classes11.dex */
public final class FragmentAbToggleExperimentsBinding implements a {

    @NonNull
    public final RecyclerView abExperimentsRv;

    @NonNull
    private final FrameLayout rootView;

    private FragmentAbToggleExperimentsBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.abExperimentsRv = recyclerView;
    }

    @NonNull
    public static FragmentAbToggleExperimentsBinding bind(@NonNull View view) {
        int i11 = R$id.abExperimentsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new FragmentAbToggleExperimentsBinding((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentAbToggleExperimentsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_ab_toggle_experiments, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
