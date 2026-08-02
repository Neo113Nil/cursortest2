package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import ru.ozon.app.android.abtool.R$id;

/* loaded from: classes11.dex */
public final class ItemAddVariantBinding implements a {

    @NonNull
    public final Button addVariantsButton;

    @NonNull
    public final LinearLayout addVariantsContainer;

    @NonNull
    public final AppCompatImageButton clearInputImageButton;

    @NonNull
    public final TextView errorTextView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatEditText variantsEditText;

    private ItemAddVariantBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageButton appCompatImageButton, @NonNull TextView textView, @NonNull AppCompatEditText appCompatEditText) {
        this.rootView = linearLayout;
        this.addVariantsButton = button;
        this.addVariantsContainer = linearLayout2;
        this.clearInputImageButton = appCompatImageButton;
        this.errorTextView = textView;
        this.variantsEditText = appCompatEditText;
    }

    @NonNull
    public static ItemAddVariantBinding bind(@NonNull View view) {
        int i11 = R$id.addVariantsButton;
        Button button = (Button) C2548q.d(i11, view);
        if (button != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.clearInputImageButton;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C2548q.d(i11, view);
            if (appCompatImageButton != null) {
                i11 = R$id.errorTextView;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.variantsEditText;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
                    if (appCompatEditText != null) {
                        return new ItemAddVariantBinding(linearLayout, button, linearLayout, appCompatImageButton, textView, appCompatEditText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
