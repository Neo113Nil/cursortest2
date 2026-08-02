package ru.ozon.app.android.cart.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.feature.R$layout;

/* loaded from: classes11.dex */
public final class ItemMarketingDetailActionBinding implements a {

    @NonNull
    public final Barrier firstLineBarrier;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView subValueTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final TextView valueTv;

    private ItemMarketingDetailActionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = constraintLayout;
        this.firstLineBarrier = barrier;
        this.subTitleTv = textView;
        this.subValueTv = textView2;
        this.titleTv = textView3;
        this.valueTv = textView4;
    }

    @NonNull
    public static ItemMarketingDetailActionBinding bind(@NonNull View view) {
        int i11 = R$id.firstLineBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.subTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.subValueTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.titleTv;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        i11 = R$id.valueTv;
                        TextView textView4 = (TextView) C2548q.d(i11, view);
                        if (textView4 != null) {
                            return new ItemMarketingDetailActionBinding((ConstraintLayout) view, barrier, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemMarketingDetailActionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_marketing_detail_action, viewGroup, false);
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
