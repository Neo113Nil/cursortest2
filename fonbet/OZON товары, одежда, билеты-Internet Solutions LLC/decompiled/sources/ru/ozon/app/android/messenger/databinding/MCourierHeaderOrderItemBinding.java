package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MCourierHeaderOrderItemBinding implements a {

    @NonNull
    public final BadgeView customBadge;

    @NonNull
    public final TextAtomV2View orderTitleTv;

    @NonNull
    public final LinearLayoutCompat productsList;

    @NonNull
    private final ConstraintLayout rootView;

    private MCourierHeaderOrderItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull TextAtomV2View textAtomV2View, @NonNull LinearLayoutCompat linearLayoutCompat) {
        this.rootView = constraintLayout;
        this.customBadge = badgeView;
        this.orderTitleTv = textAtomV2View;
        this.productsList = linearLayoutCompat;
    }

    @NonNull
    public static MCourierHeaderOrderItemBinding bind(@NonNull View view) {
        int i11 = R$id.customBadge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.orderTitleTv;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.productsList;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2548q.d(i11, view);
                if (linearLayoutCompat != null) {
                    return new MCourierHeaderOrderItemBinding((ConstraintLayout) view, badgeView, textAtomV2View, linearLayoutCompat);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MCourierHeaderOrderItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_courier_header_order_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
