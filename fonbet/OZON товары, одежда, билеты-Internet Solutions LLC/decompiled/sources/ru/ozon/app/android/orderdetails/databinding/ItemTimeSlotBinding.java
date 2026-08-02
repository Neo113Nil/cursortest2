package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.orderdetails.R$id;

/* loaded from: classes13.dex */
public final class ItemTimeSlotBinding implements a {

    @NonNull
    public final ImageView icon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView time;

    private ItemTimeSlotBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.icon = imageView;
        this.time = textView;
    }

    @NonNull
    public static ItemTimeSlotBinding bind(@NonNull View view) {
        int i11 = R$id.icon;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.time;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemTimeSlotBinding((LinearLayout) view, imageView, textView);
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
