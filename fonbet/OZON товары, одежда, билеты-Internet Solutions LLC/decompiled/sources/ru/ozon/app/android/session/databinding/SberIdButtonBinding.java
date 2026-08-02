package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$layout;

/* loaded from: classes2.dex */
public final class SberIdButtonBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView sberImg;

    @NonNull
    public final TextView sberText;

    private SberIdButtonBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = view;
        this.sberImg = imageView;
        this.sberText = textView;
    }

    @NonNull
    public static SberIdButtonBinding bind(@NonNull View view) {
        int i11 = R$id.sberImg;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.sberText;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new SberIdButtonBinding(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SberIdButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.sber_id_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
