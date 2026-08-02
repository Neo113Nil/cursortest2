package ru.ozon.app.android.csma.tips.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.csma.tips.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

/* loaded from: classes11.dex */
public final class WidgetTipCourierDetailsLayoutBinding implements a {

    @NonNull
    public final SmallBorderlessButtonView changePaymentActionButton;

    @NonNull
    public final TextView paymentSubtitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout tipsPickerContainer;

    @NonNull
    public final RecyclerView tipsPickerRecycler;

    private WidgetTipCourierDetailsLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.changePaymentActionButton = smallBorderlessButtonView;
        this.paymentSubtitle = textView;
        this.tipsPickerContainer = linearLayout2;
        this.tipsPickerRecycler = recyclerView;
    }

    @NonNull
    public static WidgetTipCourierDetailsLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.changePaymentActionButton;
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
        if (smallBorderlessButtonView != null) {
            i11 = R$id.paymentSubtitle;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = R$id.tipsPickerRecycler;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    return new WidgetTipCourierDetailsLayoutBinding(linearLayout, smallBorderlessButtonView, textView, linearLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
