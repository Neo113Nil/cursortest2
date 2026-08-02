package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.uni.R$id;

/* loaded from: classes4.dex */
public final class PaymentButtonLargeUniBinding implements a {

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private PaymentButtonLargeUniBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.iconIv = imageView;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static PaymentButtonLargeUniBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.subtitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new PaymentButtonLargeUniBinding(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
