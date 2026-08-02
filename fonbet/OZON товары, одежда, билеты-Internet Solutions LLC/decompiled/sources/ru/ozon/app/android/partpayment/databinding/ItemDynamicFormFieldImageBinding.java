package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldImageBinding implements a {

    @NonNull
    public final AppCompatTextView descriptionTv;

    @NonNull
    public final ImageView logoIv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemDynamicFormFieldImageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.descriptionTv = appCompatTextView;
        this.logoIv = imageView;
    }

    @NonNull
    public static ItemDynamicFormFieldImageBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.logoIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new ItemDynamicFormFieldImageBinding((ConstraintLayout) view, appCompatTextView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
