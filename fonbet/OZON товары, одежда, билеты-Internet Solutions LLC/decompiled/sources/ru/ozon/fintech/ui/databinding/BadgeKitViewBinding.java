package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class BadgeKitViewBinding implements a {

    @NonNull
    public final ImageView iconLeft;

    @NonNull
    public final ImageView iconRight;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView text;

    private BadgeKitViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.iconLeft = imageView;
        this.iconRight = imageView2;
        this.text = appCompatTextView;
    }

    @NonNull
    public static BadgeKitViewBinding bind(@NonNull View view) {
        int i11 = R.id.icon_left;
        ImageView imageView = (ImageView) C2548q.d(R.id.icon_left, view);
        if (imageView != null) {
            i11 = R.id.icon_right;
            ImageView imageView2 = (ImageView) C2548q.d(R.id.icon_right, view);
            if (imageView2 != null) {
                i11 = R.id.text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.text, view);
                if (appCompatTextView != null) {
                    return new BadgeKitViewBinding(view, imageView, imageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static BadgeKitViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.badge_kit_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
