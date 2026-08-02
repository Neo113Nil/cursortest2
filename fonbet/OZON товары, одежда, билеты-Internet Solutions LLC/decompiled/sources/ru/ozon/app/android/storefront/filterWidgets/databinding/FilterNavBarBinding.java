package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.filterWidgets.curtain.CurtainNavBarLabelTextView;
import ru.ozon.app.android.storefront.filterWidgets.R$id;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes2.dex */
public final class FilterNavBarBinding implements a {

    @NonNull
    public final SmallIconButtonView actionLeftIv;

    @NonNull
    public final AppCompatTextView actionRightTv;

    @NonNull
    public final Barrier endBarrier;

    @NonNull
    public final LargeBorderlessButtonView filterValuesSelectionNavBarButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Barrier startBarrier;

    @NonNull
    public final CurtainNavBarLabelTextView titleTv;

    private FilterNavBarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull AppCompatTextView appCompatTextView, @NonNull Barrier barrier, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull Barrier barrier2, @NonNull CurtainNavBarLabelTextView curtainNavBarLabelTextView) {
        this.rootView = constraintLayout;
        this.actionLeftIv = smallIconButtonView;
        this.actionRightTv = appCompatTextView;
        this.endBarrier = barrier;
        this.filterValuesSelectionNavBarButton = largeBorderlessButtonView;
        this.startBarrier = barrier2;
        this.titleTv = curtainNavBarLabelTextView;
    }

    @NonNull
    public static FilterNavBarBinding bind(@NonNull View view) {
        int i11 = R$id.actionLeftIv;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.actionRightTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.endBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.filterValuesSelectionNavBarButton;
                    LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
                    if (largeBorderlessButtonView != null) {
                        i11 = R$id.startBarrier;
                        Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                        if (barrier2 != null) {
                            i11 = R$id.titleTv;
                            CurtainNavBarLabelTextView curtainNavBarLabelTextView = (CurtainNavBarLabelTextView) C2548q.d(i11, view);
                            if (curtainNavBarLabelTextView != null) {
                                return new FilterNavBarBinding((ConstraintLayout) view, smallIconButtonView, appCompatTextView, barrier, largeBorderlessButtonView, barrier2, curtainNavBarLabelTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FilterNavBarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.filter_nav_bar, viewGroup, false);
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
