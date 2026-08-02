package ru.ozon.app.android.returns.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.ui.R$id;
import ru.ozon.app.android.returns.ui.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class ReturnBalanceTotalRowBinding implements a {

    @NonNull
    public final View clickAreaView;

    @NonNull
    public final IconView leftEndIcon;

    @NonNull
    public final IconView leftStartIcon;

    @NonNull
    public final TextAtomV2View leftText;

    @NonNull
    public final Barrier priceBarrier;

    @NonNull
    public final PriceAtomView priceView;

    @NonNull
    private final ConstraintLayout rootView;

    private ReturnBalanceTotalRowBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull IconView iconView, @NonNull IconView iconView2, @NonNull TextAtomV2View textAtomV2View, @NonNull Barrier barrier, @NonNull PriceAtomView priceAtomView) {
        this.rootView = constraintLayout;
        this.clickAreaView = view;
        this.leftEndIcon = iconView;
        this.leftStartIcon = iconView2;
        this.leftText = textAtomV2View;
        this.priceBarrier = barrier;
        this.priceView = priceAtomView;
    }

    @NonNull
    public static ReturnBalanceTotalRowBinding bind(@NonNull View view) {
        int i11 = R$id.clickAreaView;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.leftEndIcon;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null) {
                i11 = R$id.leftStartIcon;
                IconView iconView2 = (IconView) C2548q.d(i11, view);
                if (iconView2 != null) {
                    i11 = R$id.leftText;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.priceBarrier;
                        Barrier barrier = (Barrier) C2548q.d(i11, view);
                        if (barrier != null) {
                            i11 = R$id.priceView;
                            PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                            if (priceAtomView != null) {
                                return new ReturnBalanceTotalRowBinding((ConstraintLayout) view, d11, iconView, iconView2, textAtomV2View, barrier, priceAtomView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ReturnBalanceTotalRowBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.return_balance_total_row, viewGroup, false);
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
