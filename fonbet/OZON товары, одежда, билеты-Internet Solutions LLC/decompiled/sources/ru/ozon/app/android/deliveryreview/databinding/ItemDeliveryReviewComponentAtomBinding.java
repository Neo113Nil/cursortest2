package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.app.android.deliveryreview.R$layout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewComponentAtomBinding implements a {

    @NonNull
    public final SingleAtom atomSA;

    @NonNull
    private final FrameLayout rootView;

    private ItemDeliveryReviewComponentAtomBinding(@NonNull FrameLayout frameLayout, @NonNull SingleAtom singleAtom) {
        this.rootView = frameLayout;
        this.atomSA = singleAtom;
    }

    @NonNull
    public static ItemDeliveryReviewComponentAtomBinding bind(@NonNull View view) {
        int i11 = R$id.atomSA;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            return new ItemDeliveryReviewComponentAtomBinding((FrameLayout) view, singleAtom);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewComponentAtomBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_component_atom, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
