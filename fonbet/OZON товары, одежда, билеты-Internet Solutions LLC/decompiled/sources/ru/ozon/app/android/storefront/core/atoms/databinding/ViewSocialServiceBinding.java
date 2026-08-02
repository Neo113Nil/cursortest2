package ru.ozon.app.android.storefront.core.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.R$layout;

/* loaded from: classes2.dex */
public final class ViewSocialServiceBinding implements a {

    @NonNull
    public final TextView descriptionView;

    @NonNull
    public final AppCompatImageView imageView;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView titleView;

    private ViewSocialServiceBinding(@NonNull View view, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView2) {
        this.rootView = view;
        this.descriptionView = textView;
        this.imageView = appCompatImageView;
        this.titleView = textView2;
    }

    @NonNull
    public static ViewSocialServiceBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionView;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.imageView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.titleView;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new ViewSocialServiceBinding(view, textView, appCompatImageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewSocialServiceBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_social_service, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
