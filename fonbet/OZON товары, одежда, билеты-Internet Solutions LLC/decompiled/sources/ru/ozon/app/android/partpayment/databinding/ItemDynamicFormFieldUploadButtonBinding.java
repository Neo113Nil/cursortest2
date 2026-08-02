package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldUploadButtonBinding implements a {

    @NonNull
    public final TextView finishBtn;

    @NonNull
    private final FrameLayout rootView;

    private ItemDynamicFormFieldUploadButtonBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.finishBtn = textView;
    }

    @NonNull
    public static ItemDynamicFormFieldUploadButtonBinding bind(@NonNull View view) {
        int i11 = R$id.finishBtn;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new ItemDynamicFormFieldUploadButtonBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
