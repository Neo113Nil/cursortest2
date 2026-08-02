package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.abtool.R$id;

/* loaded from: classes11.dex */
public final class ItemAbVariantBinding implements a {

    @NonNull
    public final AppCompatImageButton removeImageButton;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatTextView variantTextView;

    private ItemAbVariantBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.removeImageButton = appCompatImageButton;
        this.variantTextView = appCompatTextView;
    }

    @NonNull
    public static ItemAbVariantBinding bind(@NonNull View view) {
        int i11 = R$id.removeImageButton;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C2548q.d(i11, view);
        if (appCompatImageButton != null) {
            i11 = R$id.variantTextView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                return new ItemAbVariantBinding((LinearLayout) view, appCompatImageButton, appCompatTextView);
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
