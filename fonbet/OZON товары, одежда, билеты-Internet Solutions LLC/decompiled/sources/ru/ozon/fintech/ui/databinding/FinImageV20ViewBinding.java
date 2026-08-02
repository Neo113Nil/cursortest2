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
public final class FinImageV20ViewBinding implements a {

    @NonNull
    public final ImageView finImageViewV20;

    @NonNull
    private final View rootView;

    private FinImageV20ViewBinding(@NonNull View view, @NonNull ImageView imageView) {
        this.rootView = view;
        this.finImageViewV20 = imageView;
    }

    @NonNull
    public static FinImageV20ViewBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView) C2548q.d(R.id.fin_image_view_v20, view);
        if (imageView != null) {
            return new FinImageV20ViewBinding(view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.fin_image_view_v20)));
    }

    @NonNull
    public static FinImageV20ViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.fin_image_v20_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
