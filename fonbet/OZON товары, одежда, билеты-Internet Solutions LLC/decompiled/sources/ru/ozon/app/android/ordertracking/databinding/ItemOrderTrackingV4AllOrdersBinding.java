package ru.ozon.app.android.ordertracking.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ordertracking.R$id;
import ru.ozon.app.android.ordertracking.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class ItemOrderTrackingV4AllOrdersBinding implements a {

    @NonNull
    public final IconView allOrdersIv;

    @NonNull
    public final TextAtomV2View allOrdersTav;

    @NonNull
    public final LinearLayout orderTrackingV4RightSideButton;

    @NonNull
    private final LinearLayout rootView;

    private ItemOrderTrackingV4AllOrdersBinding(@NonNull LinearLayout linearLayout, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.allOrdersIv = iconView;
        this.allOrdersTav = textAtomV2View;
        this.orderTrackingV4RightSideButton = linearLayout2;
    }

    @NonNull
    public static ItemOrderTrackingV4AllOrdersBinding bind(@NonNull View view) {
        int i11 = R$id.allOrdersIv;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.allOrdersTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new ItemOrderTrackingV4AllOrdersBinding(linearLayout, iconView, textAtomV2View, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemOrderTrackingV4AllOrdersBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_tracking_v4_all_orders, viewGroup, false);
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
