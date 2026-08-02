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
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class RadioButtonV2ViewBinding implements a {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final ImageView ivImage;

    @NonNull
    public final RadioButton rbSelector;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView tvTitle;

    private RadioButtonV2ViewBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull RadioButton radioButton, @NonNull TextView textView) {
        this.rootView = view;
        this.container = constraintLayout;
        this.ivImage = imageView;
        this.rbSelector = radioButton;
        this.tvTitle = textView;
    }

    @NonNull
    public static RadioButtonV2ViewBinding bind(@NonNull View view) {
        int i11 = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(R.id.container, view);
        if (constraintLayout != null) {
            i11 = R.id.iv_image;
            ImageView imageView = (ImageView) C2548q.d(R.id.iv_image, view);
            if (imageView != null) {
                i11 = R.id.rb_selector;
                RadioButton radioButton = (RadioButton) C2548q.d(R.id.rb_selector, view);
                if (radioButton != null) {
                    i11 = R.id.tv_title;
                    TextView textView = (TextView) C2548q.d(R.id.tv_title, view);
                    if (textView != null) {
                        return new RadioButtonV2ViewBinding(view, constraintLayout, imageView, radioButton, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static RadioButtonV2ViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.radio_button_v2_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
