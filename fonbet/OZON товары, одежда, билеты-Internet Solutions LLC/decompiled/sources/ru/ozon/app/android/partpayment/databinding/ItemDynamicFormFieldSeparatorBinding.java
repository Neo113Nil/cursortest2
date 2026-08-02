package ru.ozon.app.android.partpayment.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldSeparatorBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    private ItemDynamicFormFieldSeparatorBinding(@NonNull View view, @NonNull View view2) {
        this.rootView = view;
        this.separator = view2;
    }

    @NonNull
    public static ItemDynamicFormFieldSeparatorBinding bind(@NonNull View view) {
        if (view != null) {
            return new ItemDynamicFormFieldSeparatorBinding(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
