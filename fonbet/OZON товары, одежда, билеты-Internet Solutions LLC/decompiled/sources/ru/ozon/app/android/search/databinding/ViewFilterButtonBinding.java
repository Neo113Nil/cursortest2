package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;

/* loaded from: classes7.dex */
public final class ViewFilterButtonBinding implements a {

    @NonNull
    public final AppCompatTextView badgeTv;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final View rootView;

    private ViewFilterButtonBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView) {
        this.rootView = view;
        this.badgeTv = appCompatTextView;
        this.iconIv = imageView;
    }

    @NonNull
    public static ViewFilterButtonBinding bind(@NonNull View view) {
        int i11 = R$id.badgeTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new ViewFilterButtonBinding(view, appCompatTextView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewFilterButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_filter_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
