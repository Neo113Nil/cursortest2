package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;

/* loaded from: classes2.dex */
public final class TagCrossBinding implements a {

    @NonNull
    public final ImageView crossCircleIv;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView tagImage;

    @NonNull
    public final TextView tagTv;

    private TagCrossBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.rootView = view;
        this.crossCircleIv = imageView;
        this.tagImage = imageView2;
        this.tagTv = textView;
    }

    @NonNull
    public static TagCrossBinding bind(@NonNull View view) {
        int i11 = R$id.crossCircleIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.tagImage;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.tagTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new TagCrossBinding(view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static TagCrossBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.tag_cross, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
