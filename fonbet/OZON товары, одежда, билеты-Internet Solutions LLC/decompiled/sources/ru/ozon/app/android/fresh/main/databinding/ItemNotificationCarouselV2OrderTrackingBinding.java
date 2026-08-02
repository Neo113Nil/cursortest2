package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews.OrderProgressView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ItemNotificationCarouselV2OrderTrackingBinding implements a {

    @NonNull
    public final OrderProgressView orderProgress;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final IconView star1;

    @NonNull
    public final IconView star2;

    @NonNull
    public final IconView star3;

    @NonNull
    public final IconView star4;

    @NonNull
    public final IconView star5;

    @NonNull
    public final Group stars;

    @NonNull
    public final TextAtomV2View subtitle;

    @NonNull
    public final TextAtomV2View title;

    @NonNull
    public final IconView titleIcon;

    private ItemNotificationCarouselV2OrderTrackingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull OrderProgressView orderProgressView, @NonNull IconView iconView, @NonNull IconView iconView2, @NonNull IconView iconView3, @NonNull IconView iconView4, @NonNull IconView iconView5, @NonNull Group group, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull IconView iconView6) {
        this.rootView = constraintLayout;
        this.orderProgress = orderProgressView;
        this.star1 = iconView;
        this.star2 = iconView2;
        this.star3 = iconView3;
        this.star4 = iconView4;
        this.star5 = iconView5;
        this.stars = group;
        this.subtitle = textAtomV2View;
        this.title = textAtomV2View2;
        this.titleIcon = iconView6;
    }

    @NonNull
    public static ItemNotificationCarouselV2OrderTrackingBinding bind(@NonNull View view) {
        int i11 = R$id.orderProgress;
        OrderProgressView orderProgressView = (OrderProgressView) C2548q.d(i11, view);
        if (orderProgressView != null) {
            i11 = R$id.star1;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null) {
                i11 = R$id.star2;
                IconView iconView2 = (IconView) C2548q.d(i11, view);
                if (iconView2 != null) {
                    i11 = R$id.star3;
                    IconView iconView3 = (IconView) C2548q.d(i11, view);
                    if (iconView3 != null) {
                        i11 = R$id.star4;
                        IconView iconView4 = (IconView) C2548q.d(i11, view);
                        if (iconView4 != null) {
                            i11 = R$id.star5;
                            IconView iconView5 = (IconView) C2548q.d(i11, view);
                            if (iconView5 != null) {
                                i11 = R$id.stars;
                                Group group = (Group) C2548q.d(i11, view);
                                if (group != null) {
                                    i11 = R$id.subtitle;
                                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View != null) {
                                        i11 = R$id.title;
                                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                        if (textAtomV2View2 != null) {
                                            i11 = R$id.titleIcon;
                                            IconView iconView6 = (IconView) C2548q.d(i11, view);
                                            if (iconView6 != null) {
                                                return new ItemNotificationCarouselV2OrderTrackingBinding((ConstraintLayout) view, orderProgressView, iconView, iconView2, iconView3, iconView4, iconView5, group, textAtomV2View, textAtomV2View2, iconView6);
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
    public static ItemNotificationCarouselV2OrderTrackingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemNotificationCarouselV2OrderTrackingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_notification_carousel_v2_order_tracking, viewGroup, false);
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
