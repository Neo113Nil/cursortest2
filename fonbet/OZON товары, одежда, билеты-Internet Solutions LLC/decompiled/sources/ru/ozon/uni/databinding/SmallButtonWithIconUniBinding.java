package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.uni.R$id;

/* loaded from: classes4.dex */
public final class SmallButtonWithIconUniBinding implements a {

    @NonNull
    public final ImageView imageView;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView titleTv;

    private SmallButtonWithIconUniBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = view;
        this.imageView = imageView;
        this.titleTv = textView;
    }

    @NonNull
    public static SmallButtonWithIconUniBinding bind(@NonNull View view) {
        int i11 = R$id.imageView;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new SmallButtonWithIconUniBinding(view, imageView, textView);
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
