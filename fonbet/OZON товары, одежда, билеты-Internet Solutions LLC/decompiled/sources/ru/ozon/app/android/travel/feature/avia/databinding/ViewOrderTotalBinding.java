package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ViewOrderTotalBinding implements a {

    @NonNull
    public final TextAtomView orderTotalCaptionTextView;

    @NonNull
    public final SmallIconButtonView orderTotalInfoButton;

    @NonNull
    public final TextAtomView orderTotalPriceTextView;

    @NonNull
    public final LargeButtonView orderTotalSubmitButton;

    @NonNull
    private final View rootView;

    private ViewOrderTotalBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView2, @NonNull LargeButtonView largeButtonView) {
        this.rootView = view;
        this.orderTotalCaptionTextView = textAtomView;
        this.orderTotalInfoButton = smallIconButtonView;
        this.orderTotalPriceTextView = textAtomView2;
        this.orderTotalSubmitButton = largeButtonView;
    }

    @NonNull
    public static ViewOrderTotalBinding bind(@NonNull View view) {
        int i11 = R$id.orderTotalCaptionTextView;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.orderTotalInfoButton;
            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
            if (smallIconButtonView != null) {
                i11 = R$id.orderTotalPriceTextView;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.orderTotalSubmitButton;
                    LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                    if (largeButtonView != null) {
                        return new ViewOrderTotalBinding(view, textAtomView, smallIconButtonView, textAtomView2, largeButtonView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewOrderTotalBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_order_total, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
