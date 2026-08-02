package ru.ozon.app.android.abtool.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.abtool.R$layout;

/* loaded from: classes11.dex */
public final class FragmentAbVariantsBinding implements a {

    @NonNull
    private final RecyclerView rootView;

    @NonNull
    public final RecyclerView variantsRecyclerView;

    private FragmentAbVariantsBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.variantsRecyclerView = recyclerView2;
    }

    @NonNull
    public static FragmentAbVariantsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new FragmentAbVariantsBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static FragmentAbVariantsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_ab_variants, viewGroup, false);
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
