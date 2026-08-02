package ru.ozon.app.android.geo.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.geo.R$layout;

/* loaded from: classes12.dex */
public final class SplitShortImageItemBinding implements a {

    @NonNull
    private final ImageView rootView;

    @NonNull
    public final ImageView splitShortIV;

    private SplitShortImageItemBinding(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = imageView;
        this.splitShortIV = imageView2;
    }

    @NonNull
    public static SplitShortImageItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new SplitShortImageItemBinding(imageView, imageView);
    }

    @NonNull
    public static SplitShortImageItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.split_short_image_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
