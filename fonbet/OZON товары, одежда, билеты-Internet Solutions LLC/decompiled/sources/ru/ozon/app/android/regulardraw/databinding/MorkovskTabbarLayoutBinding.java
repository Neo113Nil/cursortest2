package ru.ozon.app.android.regulardraw.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.regulardraw.R$layout;

/* loaded from: classes13.dex */
public final class MorkovskTabbarLayoutBinding implements a {

    @NonNull
    public final RecyclerView morkovskTabbarRv;

    @NonNull
    private final RecyclerView rootView;

    private MorkovskTabbarLayoutBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.morkovskTabbarRv = recyclerView2;
    }

    @NonNull
    public static MorkovskTabbarLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new MorkovskTabbarLayoutBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static MorkovskTabbarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.morkovsk_tabbar_layout, viewGroup, false);
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
