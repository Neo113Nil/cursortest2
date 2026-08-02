package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.progressivemolecula.view.ProgressiveTextView;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.app.android.uikit.view.recycler.UntouchableRecyclerView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentLayoutPostingBinding implements a {

    @NonNull
    public final UntouchableRecyclerView productsPackageRv;

    @NonNull
    public final ProgressiveTextView progressiveTextV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallBorderlessButtonView shareBtn;

    @NonNull
    public final TextView textTv;

    @NonNull
    public final TextView trackDeliveryTitleTv;

    private ItemOrderShipmentLayoutPostingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull UntouchableRecyclerView untouchableRecyclerView, @NonNull ProgressiveTextView progressiveTextView, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.productsPackageRv = untouchableRecyclerView;
        this.progressiveTextV = progressiveTextView;
        this.shareBtn = smallBorderlessButtonView;
        this.textTv = textView;
        this.trackDeliveryTitleTv = textView2;
    }

    @NonNull
    public static ItemOrderShipmentLayoutPostingBinding bind(@NonNull View view) {
        int i11 = R$id.productsPackageRv;
        UntouchableRecyclerView untouchableRecyclerView = (UntouchableRecyclerView) C2548q.d(i11, view);
        if (untouchableRecyclerView != null) {
            i11 = R$id.progressiveTextV;
            ProgressiveTextView progressiveTextView = (ProgressiveTextView) C2548q.d(i11, view);
            if (progressiveTextView != null) {
                i11 = R$id.shareBtn;
                SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
                if (smallBorderlessButtonView != null) {
                    i11 = R$id.textTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.trackDeliveryTitleTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            return new ItemOrderShipmentLayoutPostingBinding((ConstraintLayout) view, untouchableRecyclerView, progressiveTextView, smallBorderlessButtonView, textView, textView2);
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
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
