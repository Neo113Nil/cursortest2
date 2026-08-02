package ru.ozon.app.android.csma.tips.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.csma.tips.R$id;

/* loaded from: classes11.dex */
public final class WidgetTipCourierHeaderLayoutBinding implements a {

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView subtextTv;

    @NonNull
    public final TextView titleTv;

    private WidgetTipCourierHeaderLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.iconIv = imageView;
        this.subtextTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetTipCourierHeaderLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.subtextTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new WidgetTipCourierHeaderLayoutBinding((LinearLayout) view, imageView, textView, textView2);
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
