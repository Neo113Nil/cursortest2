package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class SmallButtonViewBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView smallButtonIcon;

    @NonNull
    public final TextView smallButtonTitle;

    private SmallButtonViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = view;
        this.smallButtonIcon = imageView;
        this.smallButtonTitle = textView;
    }

    @NonNull
    public static SmallButtonViewBinding bind(@NonNull View view) {
        int i11 = R.id.small_button_icon;
        ImageView imageView = (ImageView) C2548q.d(R.id.small_button_icon, view);
        if (imageView != null) {
            i11 = R.id.small_button_title;
            TextView textView = (TextView) C2548q.d(R.id.small_button_title, view);
            if (textView != null) {
                return new SmallButtonViewBinding(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SmallButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.small_button_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
