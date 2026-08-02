package ru.ozon.app.android.orderdone.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.orderdone.R$id;
import ru.ozon.app.android.orderdone.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetOrderDoneButtonBarBinding implements a {

    @NonNull
    public final View background;

    @NonNull
    public final BadgeView badgeV;

    @NonNull
    public final HorizontalAtomsLayout buttonsHal;

    @NonNull
    public final VerticalAtomsLayout buttonsVal;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTav;

    private WidgetOrderDoneButtonBarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull BadgeView badgeView, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.background = view;
        this.badgeV = badgeView;
        this.buttonsHal = horizontalAtomsLayout;
        this.buttonsVal = verticalAtomsLayout;
        this.subtitleTav = textAtomV2View;
    }

    @NonNull
    public static WidgetOrderDoneButtonBarBinding bind(@NonNull View view) {
        int i11 = R$id.background;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.badgeV;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.buttonsHal;
                HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
                if (horizontalAtomsLayout != null) {
                    i11 = R$id.buttonsVal;
                    VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                    if (verticalAtomsLayout != null) {
                        i11 = R$id.subtitleTav;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            return new WidgetOrderDoneButtonBarBinding((ConstraintLayout) view, d11, badgeView, horizontalAtomsLayout, verticalAtomsLayout, textAtomV2View);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetOrderDoneButtonBarBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_order_done_button_bar, viewGroup, false);
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
