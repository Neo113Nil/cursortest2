package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class FinImageViewBinding implements a {

    @NonNull
    public final ImageView finImageView;

    @NonNull
    private final View rootView;

    private FinImageViewBinding(@NonNull View view, @NonNull ImageView imageView) {
        this.rootView = view;
        this.finImageView = imageView;
    }

    @NonNull
    public static FinImageViewBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView) C2548q.d(R.id.fin_image_view, view);
        if (imageView != null) {
            return new FinImageViewBinding(view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.fin_image_view)));
    }

    @NonNull
    public static FinImageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.fin_image_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
