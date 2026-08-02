package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class ItemSplitDetailHorizontalBinding implements a {

    @NonNull
    public final RecyclerView carouselRV;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SingleAtom titleSA;

    private ItemSplitDetailHorizontalBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull SingleAtom singleAtom) {
        this.rootView = linearLayout;
        this.carouselRV = recyclerView;
        this.titleSA = singleAtom;
    }

    @NonNull
    public static ItemSplitDetailHorizontalBinding bind(@NonNull View view) {
        int i11 = R$id.carouselRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.titleSA;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                return new ItemSplitDetailHorizontalBinding((LinearLayout) view, recyclerView, singleAtom);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemSplitDetailHorizontalBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_split_detail_horizontal, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
