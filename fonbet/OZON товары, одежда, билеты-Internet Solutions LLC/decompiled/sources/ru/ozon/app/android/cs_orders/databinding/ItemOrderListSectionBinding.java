package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.uikit.view.recycler.UntouchableRecyclerView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class ItemOrderListSectionBinding implements a {

    @NonNull
    public final HorizontalFlexAtomsLayout buttonsHFAL;

    @NonNull
    public final TextView communicationTitleTv;

    @NonNull
    public final VerticalAtomsLayout communicationsVAL;

    @NonNull
    public final AppCompatImageView deliveryIconIv;

    @NonNull
    public final TextAtomV2View deliveryInfoTv;

    @NonNull
    public final TextView deliveryNameTv;

    @NonNull
    public final UntouchableRecyclerView orderItemsRv;

    @NonNull
    public final View orderListDivider;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout sectionRootCl;

    @NonNull
    public final BadgeView statusContainer;

    @NonNull
    public final BadgeView statusDeliveryBadge;

    @NonNull
    public final Group statusDeliveryContainer;

    @NonNull
    public final TextView timerTitleTv;

    @NonNull
    public final TextView timerTv;

    @NonNull
    public final TextView titleDeliveryTv;

    private ItemOrderListSectionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull TextView textView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextView textView2, @NonNull UntouchableRecyclerView untouchableRecyclerView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull BadgeView badgeView, @NonNull BadgeView badgeView2, @NonNull Group group, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = constraintLayout;
        this.buttonsHFAL = horizontalFlexAtomsLayout;
        this.communicationTitleTv = textView;
        this.communicationsVAL = verticalAtomsLayout;
        this.deliveryIconIv = appCompatImageView;
        this.deliveryInfoTv = textAtomV2View;
        this.deliveryNameTv = textView2;
        this.orderItemsRv = untouchableRecyclerView;
        this.orderListDivider = view;
        this.sectionRootCl = constraintLayout2;
        this.statusContainer = badgeView;
        this.statusDeliveryBadge = badgeView2;
        this.statusDeliveryContainer = group;
        this.timerTitleTv = textView3;
        this.timerTv = textView4;
        this.titleDeliveryTv = textView5;
    }

    @NonNull
    public static ItemOrderListSectionBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.buttonsHFAL;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
        if (horizontalFlexAtomsLayout != null) {
            i11 = R$id.communicationTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.communicationsVAL;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    i11 = R$id.deliveryIconIv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.deliveryInfoTv;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.deliveryNameTv;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                i11 = R$id.orderItemsRv;
                                UntouchableRecyclerView untouchableRecyclerView = (UntouchableRecyclerView) C2548q.d(i11, view);
                                if (untouchableRecyclerView != null && (d11 = C2548q.d((i11 = R$id.orderListDivider), view)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i11 = R$id.statusContainer;
                                    BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                    if (badgeView != null) {
                                        i11 = R$id.statusDeliveryBadge;
                                        BadgeView badgeView2 = (BadgeView) C2548q.d(i11, view);
                                        if (badgeView2 != null) {
                                            i11 = R$id.statusDeliveryContainer;
                                            Group group = (Group) C2548q.d(i11, view);
                                            if (group != null) {
                                                i11 = R$id.timerTitleTv;
                                                TextView textView3 = (TextView) C2548q.d(i11, view);
                                                if (textView3 != null) {
                                                    i11 = R$id.timerTv;
                                                    TextView textView4 = (TextView) C2548q.d(i11, view);
                                                    if (textView4 != null) {
                                                        i11 = R$id.titleDeliveryTv;
                                                        TextView textView5 = (TextView) C2548q.d(i11, view);
                                                        if (textView5 != null) {
                                                            return new ItemOrderListSectionBinding(constraintLayout, horizontalFlexAtomsLayout, textView, verticalAtomsLayout, appCompatImageView, textAtomV2View, textView2, untouchableRecyclerView, d11, constraintLayout, badgeView, badgeView2, group, textView3, textView4, textView5);
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
    public static ItemOrderListSectionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_list_section, viewGroup, false);
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
