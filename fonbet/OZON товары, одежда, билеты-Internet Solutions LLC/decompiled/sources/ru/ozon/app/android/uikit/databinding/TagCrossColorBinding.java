package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.R$id;

/* loaded from: classes2.dex */
public final class TagCrossColorBinding implements a {

    @NonNull
    public final View colorView;

    @NonNull
    public final ImageView crossCircleIv;

    @NonNull
    private final View rootView;

    private TagCrossColorBinding(@NonNull View view, @NonNull View view2, @NonNull ImageView imageView) {
        this.rootView = view;
        this.colorView = view2;
        this.crossCircleIv = imageView;
    }

    @NonNull
    public static TagCrossColorBinding bind(@NonNull View view) {
        int i11 = R$id.colorView;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.crossCircleIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new TagCrossColorBinding(view, d11, imageView);
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
