package ru.ozon.app.android.cscore.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class WidgetOrderDetailCopyItemBinding implements a {

    @NonNull
    public final View ivCopyButton;

    @NonNull
    private final View rootView;

    private WidgetOrderDetailCopyItemBinding(@NonNull View view, @NonNull View view2) {
        this.rootView = view;
        this.ivCopyButton = view2;
    }

    @NonNull
    public static WidgetOrderDetailCopyItemBinding bind(@NonNull View view) {
        if (view != null) {
            return new WidgetOrderDetailCopyItemBinding(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
