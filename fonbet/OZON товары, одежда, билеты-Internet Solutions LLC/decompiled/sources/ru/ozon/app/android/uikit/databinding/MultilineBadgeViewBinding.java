package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;

/* loaded from: classes2.dex */
public final class MultilineBadgeViewBinding implements a {

    @NonNull
    public final ImageView multilineBadgeImage;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView textTv;

    private MultilineBadgeViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = view;
        this.multilineBadgeImage = imageView;
        this.textTv = textView;
    }

    @NonNull
    public static MultilineBadgeViewBinding bind(@NonNull View view) {
        int i11 = R$id.multilineBadgeImage;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.textTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new MultilineBadgeViewBinding(view, imageView, textView);
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
