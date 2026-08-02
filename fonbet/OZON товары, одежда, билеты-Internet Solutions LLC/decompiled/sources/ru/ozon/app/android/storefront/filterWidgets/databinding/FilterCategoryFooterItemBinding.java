package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

/* loaded from: classes2.dex */
public final class FilterCategoryFooterItemBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView filterCategoryButton;

    @NonNull
    private final LargeBorderlessButtonView rootView;

    private FilterCategoryFooterItemBinding(@NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull LargeBorderlessButtonView largeBorderlessButtonView2) {
        this.rootView = largeBorderlessButtonView;
        this.filterCategoryButton = largeBorderlessButtonView2;
    }

    @NonNull
    public static FilterCategoryFooterItemBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) view;
        return new FilterCategoryFooterItemBinding(largeBorderlessButtonView, largeBorderlessButtonView);
    }

    @Override // X4.a
    @NonNull
    public LargeBorderlessButtonView getRoot() {
        return this.rootView;
    }
}
