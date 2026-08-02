package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class JointPurchaseButtonWithQuantityUniBinding implements a {

    @NonNull
    public final Group addToCartCounterGroup;

    @NonNull
    public final SmallButtonView atomButtonView;

    @NonNull
    public final View minusFadeV;

    @NonNull
    public final SmallIconButtonView minusIconButtonAtom;

    @NonNull
    public final View plusFadeV;

    @NonNull
    public final SmallIconButtonView plusIconButtonAtom;

    @NonNull
    public final TextAtomView quantityTav;

    @NonNull
    private final View rootView;

    private JointPurchaseButtonWithQuantityUniBinding(@NonNull View view, @NonNull Group group, @NonNull SmallButtonView smallButtonView, @NonNull View view2, @NonNull SmallIconButtonView smallIconButtonView, @NonNull View view3, @NonNull SmallIconButtonView smallIconButtonView2, @NonNull TextAtomView textAtomView) {
        this.rootView = view;
        this.addToCartCounterGroup = group;
        this.atomButtonView = smallButtonView;
        this.minusFadeV = view2;
        this.minusIconButtonAtom = smallIconButtonView;
        this.plusFadeV = view3;
        this.plusIconButtonAtom = smallIconButtonView2;
        this.quantityTav = textAtomView;
    }

    @NonNull
    public static JointPurchaseButtonWithQuantityUniBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.addToCartCounterGroup;
        Group group = (Group) C2548q.d(i11, view);
        if (group != null) {
            i11 = R$id.atomButtonView;
            SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
            if (smallButtonView != null && (d11 = C2548q.d((i11 = R$id.minusFadeV), view)) != null) {
                i11 = R$id.minusIconButtonAtom;
                SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                if (smallIconButtonView != null && (d12 = C2548q.d((i11 = R$id.plusFadeV), view)) != null) {
                    i11 = R$id.plusIconButtonAtom;
                    SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
                    if (smallIconButtonView2 != null) {
                        i11 = R$id.quantityTav;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            return new JointPurchaseButtonWithQuantityUniBinding(view, group, smallButtonView, d11, smallIconButtonView, d12, smallIconButtonView2, textAtomView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
