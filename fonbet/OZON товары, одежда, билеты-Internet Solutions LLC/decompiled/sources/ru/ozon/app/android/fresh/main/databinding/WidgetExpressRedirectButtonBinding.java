package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.fresh.main.R$id;

/* loaded from: classes12.dex */
public final class WidgetExpressRedirectButtonBinding implements a {

    @NonNull
    public final CardView cardView;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetExpressRedirectButtonBinding(@NonNull FrameLayout frameLayout, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.cardView = cardView;
        this.iconIv = imageView;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetExpressRedirectButtonBinding bind(@NonNull View view) {
        int i11 = R$id.cardView;
        CardView cardView = (CardView) C2548q.d(i11, view);
        if (cardView != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.titleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetExpressRedirectButtonBinding((FrameLayout) view, cardView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
