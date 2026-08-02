package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class BrandFilterTitleItemBinding implements a {

    @NonNull
    public final AppCompatTextView brandTitle;

    @NonNull
    private final AppCompatTextView rootView;

    private BrandFilterTitleItemBinding(@NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = appCompatTextView;
        this.brandTitle = appCompatTextView2;
    }

    @NonNull
    public static BrandFilterTitleItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new BrandFilterTitleItemBinding(appCompatTextView, appCompatTextView);
    }

    @Override // X4.a
    @NonNull
    public AppCompatTextView getRoot() {
        return this.rootView;
    }
}
