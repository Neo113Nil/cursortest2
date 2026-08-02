package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MLayoutFlexButtonBinding implements a {

    @NonNull
    public final ImageView flexButtonIV;

    @NonNull
    public final LinearLayout flexButtonTextLL;

    @NonNull
    private final View rootView;

    private MLayoutFlexButtonBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout) {
        this.rootView = view;
        this.flexButtonIV = imageView;
        this.flexButtonTextLL = linearLayout;
    }

    @NonNull
    public static MLayoutFlexButtonBinding bind(@NonNull View view) {
        int i11 = R$id.flexButtonIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.flexButtonTextLL;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                return new MLayoutFlexButtonBinding(view, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MLayoutFlexButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.m_layout_flex_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
