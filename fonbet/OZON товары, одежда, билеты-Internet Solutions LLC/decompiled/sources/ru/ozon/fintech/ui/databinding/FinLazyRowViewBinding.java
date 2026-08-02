package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class FinLazyRowViewBinding implements a {

    @NonNull
    public final RecyclerView lazyRowRecycler;

    @NonNull
    private final View rootView;

    private FinLazyRowViewBinding(@NonNull View view, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.lazyRowRecycler = recyclerView;
    }

    @NonNull
    public static FinLazyRowViewBinding bind(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.lazy_row_recycler, view);
        if (recyclerView != null) {
            return new FinLazyRowViewBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.lazy_row_recycler)));
    }

    @NonNull
    public static FinLazyRowViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.fin_lazy_row_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
