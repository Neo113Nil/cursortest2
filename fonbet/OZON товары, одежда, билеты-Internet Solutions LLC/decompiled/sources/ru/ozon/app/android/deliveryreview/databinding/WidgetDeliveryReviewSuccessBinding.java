package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes11.dex */
public final class WidgetDeliveryReviewSuccessBinding implements a {

    @NonNull
    public final LargeButtonView buttonAtom;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetDeliveryReviewSuccessBinding(@NonNull LinearLayout linearLayout, @NonNull LargeButtonView largeButtonView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.buttonAtom = largeButtonView;
        this.imageIv = imageView;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetDeliveryReviewSuccessBinding bind(@NonNull View view) {
        int i11 = R$id.buttonAtom;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.imageIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.subtitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.titleTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new WidgetDeliveryReviewSuccessBinding((LinearLayout) view, largeButtonView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
