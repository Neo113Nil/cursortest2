package ru.ozon.app.android.ordertracking.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;
import ru.ozon.app.android.ordertracking.R$id;
import ru.ozon.app.android.ordertracking.R$layout;
import ru.ozon.app.android.ordertracking.v4.presentation.util.PercentageConstraintLayout;
import ru.ozon.app.android.ordertracking.v4.presentation.view.OrderTrackingAddressView;
import ru.ozon.app.android.ordertracking.v4.presentation.view.OrderTrackingMarqueeView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes13.dex */
public final class ItemOrderTrackingV4OrderBinding implements a {

    @NonNull
    public final BadgeView actionBadge;

    @NonNull
    public final FrameLayout actionButtonContainer;

    @NonNull
    public final FrameLayout addressContainer;

    @NonNull
    public final OrderTrackingAddressView addressView;

    @NonNull
    public final ButtonView button;

    @NonNull
    public final BadgeView countBV;

    @NonNull
    public final TextView descriptionTav;

    @NonNull
    public final Barrier imageBarrier;

    @NonNull
    public final DeliveryAdultImageView imageIV;

    @NonNull
    public final OrderTrackingMarqueeView marqueeAddressView;

    @NonNull
    public final PercentageConstraintLayout orderCard;

    @NonNull
    private final PercentageConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTav;

    @NonNull
    public final AppCompatTextView timerTv;

    @NonNull
    public final IconView titleIconIv;

    @NonNull
    public final TextView titleTav;

    private ItemOrderTrackingV4OrderBinding(@NonNull PercentageConstraintLayout percentageConstraintLayout, @NonNull BadgeView badgeView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull OrderTrackingAddressView orderTrackingAddressView, @NonNull ButtonView buttonView, @NonNull BadgeView badgeView2, @NonNull TextView textView, @NonNull Barrier barrier, @NonNull DeliveryAdultImageView deliveryAdultImageView, @NonNull OrderTrackingMarqueeView orderTrackingMarqueeView, @NonNull PercentageConstraintLayout percentageConstraintLayout2, @NonNull TextView textView2, @NonNull AppCompatTextView appCompatTextView, @NonNull IconView iconView, @NonNull TextView textView3) {
        this.rootView = percentageConstraintLayout;
        this.actionBadge = badgeView;
        this.actionButtonContainer = frameLayout;
        this.addressContainer = frameLayout2;
        this.addressView = orderTrackingAddressView;
        this.button = buttonView;
        this.countBV = badgeView2;
        this.descriptionTav = textView;
        this.imageBarrier = barrier;
        this.imageIV = deliveryAdultImageView;
        this.marqueeAddressView = orderTrackingMarqueeView;
        this.orderCard = percentageConstraintLayout2;
        this.subtitleTav = textView2;
        this.timerTv = appCompatTextView;
        this.titleIconIv = iconView;
        this.titleTav = textView3;
    }

    @NonNull
    public static ItemOrderTrackingV4OrderBinding bind(@NonNull View view) {
        int i11 = R$id.actionBadge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.actionButtonContainer;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = R$id.addressContainer;
                FrameLayout frameLayout2 = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout2 != null) {
                    i11 = R$id.addressView;
                    OrderTrackingAddressView orderTrackingAddressView = (OrderTrackingAddressView) C2548q.d(i11, view);
                    if (orderTrackingAddressView != null) {
                        i11 = R$id.button;
                        ButtonView buttonView = (ButtonView) C2548q.d(i11, view);
                        if (buttonView != null) {
                            i11 = R$id.countBV;
                            BadgeView badgeView2 = (BadgeView) C2548q.d(i11, view);
                            if (badgeView2 != null) {
                                i11 = R$id.descriptionTav;
                                TextView textView = (TextView) C2548q.d(i11, view);
                                if (textView != null) {
                                    i11 = R$id.imageBarrier;
                                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                                    if (barrier != null) {
                                        i11 = R$id.imageIV;
                                        DeliveryAdultImageView deliveryAdultImageView = (DeliveryAdultImageView) C2548q.d(i11, view);
                                        if (deliveryAdultImageView != null) {
                                            i11 = R$id.marqueeAddressView;
                                            OrderTrackingMarqueeView orderTrackingMarqueeView = (OrderTrackingMarqueeView) C2548q.d(i11, view);
                                            if (orderTrackingMarqueeView != null) {
                                                PercentageConstraintLayout percentageConstraintLayout = (PercentageConstraintLayout) view;
                                                i11 = R$id.subtitleTav;
                                                TextView textView2 = (TextView) C2548q.d(i11, view);
                                                if (textView2 != null) {
                                                    i11 = R$id.timerTv;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                                                    if (appCompatTextView != null) {
                                                        i11 = R$id.titleIconIv;
                                                        IconView iconView = (IconView) C2548q.d(i11, view);
                                                        if (iconView != null) {
                                                            i11 = R$id.titleTav;
                                                            TextView textView3 = (TextView) C2548q.d(i11, view);
                                                            if (textView3 != null) {
                                                                return new ItemOrderTrackingV4OrderBinding(percentageConstraintLayout, badgeView, frameLayout, frameLayout2, orderTrackingAddressView, buttonView, badgeView2, textView, barrier, deliveryAdultImageView, orderTrackingMarqueeView, percentageConstraintLayout, textView2, appCompatTextView, iconView, textView3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemOrderTrackingV4OrderBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_tracking_v4_order, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public PercentageConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
