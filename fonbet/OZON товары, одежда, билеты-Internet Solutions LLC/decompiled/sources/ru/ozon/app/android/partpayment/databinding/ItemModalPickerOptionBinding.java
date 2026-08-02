package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemModalPickerOptionBinding implements a {

    @NonNull
    public final TextView optionNameTv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View selectorV;

    private ItemModalPickerOptionBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull View view) {
        this.rootView = frameLayout;
        this.optionNameTv = textView;
        this.selectorV = view;
    }

    @NonNull
    public static ItemModalPickerOptionBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.optionNameTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView == null || (d11 = C2548q.d((i11 = R$id.selectorV), view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new ItemModalPickerOptionBinding((FrameLayout) view, textView, d11);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
