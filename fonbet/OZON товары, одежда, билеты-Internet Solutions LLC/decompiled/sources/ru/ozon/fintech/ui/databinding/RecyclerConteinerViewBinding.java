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
public final class RecyclerConteinerViewBinding implements a {

    @NonNull
    public final RecyclerView recyclerContainerRecycler;

    @NonNull
    private final View rootView;

    private RecyclerConteinerViewBinding(@NonNull View view, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.recyclerContainerRecycler = recyclerView;
    }

    @NonNull
    public static RecyclerConteinerViewBinding bind(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.recycler_container_recycler, view);
        if (recyclerView != null) {
            return new RecyclerConteinerViewBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.recycler_container_recycler)));
    }

    @NonNull
    public static RecyclerConteinerViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.recycler_conteiner_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
