package ru.ozon.app.android.search.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.search.R$layout;

/* loaded from: classes7.dex */
public final class ItemMarkwonRecyclerBinding implements a {

    @NonNull
    public final RecyclerView rV;

    @NonNull
    private final RecyclerView rootView;

    private ItemMarkwonRecyclerBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.rV = recyclerView2;
    }

    @NonNull
    public static ItemMarkwonRecyclerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new ItemMarkwonRecyclerBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static ItemMarkwonRecyclerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_markwon_recycler, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
