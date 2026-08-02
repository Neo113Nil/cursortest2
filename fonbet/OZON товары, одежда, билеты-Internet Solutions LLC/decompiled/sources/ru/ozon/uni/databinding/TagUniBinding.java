package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.uni.R$id;

/* loaded from: classes8.dex */
public final class TagUniBinding implements a {

    @NonNull
    public final TextView countTv;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView tagImage;

    @NonNull
    public final TextView tagTv;

    private TagUniBinding(@NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.rootView = view;
        this.countTv = textView;
        this.tagImage = imageView;
        this.tagTv = textView2;
    }

    @NonNull
    public static TagUniBinding bind(@NonNull View view) {
        int i11 = R$id.countTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.tagImage;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.tagTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new TagUniBinding(view, textView, imageView, textView2);
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
