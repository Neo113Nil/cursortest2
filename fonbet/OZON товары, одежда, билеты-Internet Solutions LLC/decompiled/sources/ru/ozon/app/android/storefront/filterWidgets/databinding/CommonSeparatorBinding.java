package ru.ozon.app.android.storefront.filterWidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class CommonSeparatorBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    private CommonSeparatorBinding(@NonNull View view, @NonNull View view2) {
        this.rootView = view;
        this.separator = view2;
    }

    @NonNull
    public static CommonSeparatorBinding bind(@NonNull View view) {
        if (view != null) {
            return new CommonSeparatorBinding(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
