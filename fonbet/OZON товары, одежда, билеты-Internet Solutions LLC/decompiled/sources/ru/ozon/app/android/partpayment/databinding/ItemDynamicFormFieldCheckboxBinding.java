package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldCheckboxBinding implements a {

    @NonNull
    public final ConstraintLayout agreementContainerCl;

    @NonNull
    public final View checkbox;

    @NonNull
    public final FrameLayout checkboxContainer;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemDynamicFormFieldCheckboxBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.agreementContainerCl = constraintLayout2;
        this.checkbox = view;
        this.checkboxContainer = frameLayout;
        this.descriptionTv = textView;
    }

    @NonNull
    public static ItemDynamicFormFieldCheckboxBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.checkbox;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.checkboxContainer;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = R$id.descriptionTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new ItemDynamicFormFieldCheckboxBinding(constraintLayout, constraintLayout, d11, frameLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
