package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewFooterBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvComponents;

    @NonNull
    public final SingleAtom saAnnotation;

    @NonNull
    public final SingleAtom saSendBtn;

    private ItemDeliveryReviewFooterBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = linearLayout;
        this.rvComponents = recyclerView;
        this.saAnnotation = singleAtom;
        this.saSendBtn = singleAtom2;
    }

    @NonNull
    public static ItemDeliveryReviewFooterBinding bind(@NonNull View view) {
        int i11 = R$id.rvComponents;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.saAnnotation;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                i11 = R$id.saSendBtn;
                SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                if (singleAtom2 != null) {
                    return new ItemDeliveryReviewFooterBinding((LinearLayout) view, recyclerView, singleAtom, singleAtom2);
                }
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
