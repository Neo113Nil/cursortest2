package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class RadioButtonViewBinding implements a {

    @NonNull
    public final ImageView ivImage;

    @NonNull
    public final RadioButton rbSelector;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvTitle;

    private RadioButtonViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull RadioButton radioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.ivImage = imageView;
        this.rbSelector = radioButton;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static RadioButtonViewBinding bind(@NonNull View view) {
        int i11 = R.id.iv_image;
        ImageView imageView = (ImageView) C2548q.d(R.id.iv_image, view);
        if (imageView != null) {
            i11 = R.id.rb_selector;
            RadioButton radioButton = (RadioButton) C2548q.d(R.id.rb_selector, view);
            if (radioButton != null) {
                i11 = R.id.tv_description;
                TextView textView = (TextView) C2548q.d(R.id.tv_description, view);
                if (textView != null) {
                    i11 = R.id.tv_title;
                    TextView textView2 = (TextView) C2548q.d(R.id.tv_title, view);
                    if (textView2 != null) {
                        return new RadioButtonViewBinding(view, imageView, radioButton, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static RadioButtonViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.radio_button_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
