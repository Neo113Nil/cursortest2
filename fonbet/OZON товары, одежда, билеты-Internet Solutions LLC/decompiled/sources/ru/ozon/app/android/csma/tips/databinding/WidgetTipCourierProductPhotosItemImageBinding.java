package ru.ozon.app.android.csma.tips.databinding;

import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class WidgetTipCourierProductPhotosItemImageBinding implements a {

    @NonNull
    public final ImageView photoIv;

    @NonNull
    private final ImageView rootView;

    private WidgetTipCourierProductPhotosItemImageBinding(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = imageView;
        this.photoIv = imageView2;
    }

    @NonNull
    public static WidgetTipCourierProductPhotosItemImageBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new WidgetTipCourierProductPhotosItemImageBinding(imageView, imageView);
    }

    @Override // X4.a
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
