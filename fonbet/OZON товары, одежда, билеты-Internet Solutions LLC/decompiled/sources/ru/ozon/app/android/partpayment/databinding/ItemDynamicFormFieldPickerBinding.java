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
public final class ItemDynamicFormFieldPickerBinding implements a {

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final AppCompatTextView subtitleTv;

    @NonNull
    public final AppCompatTextView titleTv;

    private ItemDynamicFormFieldPickerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.disclosureIv = imageView;
        this.separator = view;
        this.subtitleTv = appCompatTextView;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static ItemDynamicFormFieldPickerBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.disclosureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
            i11 = R$id.subtitleTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.titleTv;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView2 != null) {
                    return new ItemDynamicFormFieldPickerBinding((ConstraintLayout) view, imageView, d11, appCompatTextView, appCompatTextView2);
                }
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
