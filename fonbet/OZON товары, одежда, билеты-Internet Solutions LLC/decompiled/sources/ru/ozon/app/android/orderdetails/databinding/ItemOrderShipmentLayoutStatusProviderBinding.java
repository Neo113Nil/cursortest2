package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentLayoutStatusProviderBinding implements a {

    @NonNull
    public final ImageView deliveryIconIv;

    @NonNull
    public final TextView deliveryNameTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final BadgeView statusProviderBadge;

    @NonNull
    public final TextView statusProviderTv;

    private ItemOrderShipmentLayoutStatusProviderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull BadgeView badgeView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.deliveryIconIv = imageView;
        this.deliveryNameTv = textView;
        this.statusProviderBadge = badgeView;
        this.statusProviderTv = textView2;
    }

    @NonNull
    public static ItemOrderShipmentLayoutStatusProviderBinding bind(@NonNull View view) {
        int i11 = R$id.deliveryIconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.deliveryNameTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.statusProviderBadge;
                BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                if (badgeView != null) {
                    i11 = R$id.statusProviderTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new ItemOrderShipmentLayoutStatusProviderBinding((ConstraintLayout) view, imageView, textView, badgeView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
