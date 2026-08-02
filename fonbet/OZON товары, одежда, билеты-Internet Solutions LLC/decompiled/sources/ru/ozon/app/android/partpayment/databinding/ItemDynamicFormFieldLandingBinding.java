package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldLandingBinding implements a {

    @NonNull
    public final AppCompatTextView descriptionTv;

    @NonNull
    public final ImageView logoIv;

    @NonNull
    public final AppCompatTextView maxValueHintTv;

    @NonNull
    public final AppCompatTextView maxValueTv;

    @NonNull
    public final AppCompatTextView periodHintTv;

    @NonNull
    public final AppCompatTextView periodTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatTextView titleTv;

    private ItemDynamicFormFieldLandingBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6) {
        this.rootView = linearLayout;
        this.descriptionTv = appCompatTextView;
        this.logoIv = imageView;
        this.maxValueHintTv = appCompatTextView2;
        this.maxValueTv = appCompatTextView3;
        this.periodHintTv = appCompatTextView4;
        this.periodTv = appCompatTextView5;
        this.titleTv = appCompatTextView6;
    }

    @NonNull
    public static ItemDynamicFormFieldLandingBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.logoIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.maxValueHintTv;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView2 != null) {
                    i11 = R$id.maxValueTv;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView3 != null) {
                        i11 = R$id.periodHintTv;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView4 != null) {
                            i11 = R$id.periodTv;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) C2548q.d(i11, view);
                            if (appCompatTextView5 != null) {
                                i11 = R$id.titleTv;
                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) C2548q.d(i11, view);
                                if (appCompatTextView6 != null) {
                                    return new ItemDynamicFormFieldLandingBinding((LinearLayout) view, appCompatTextView, imageView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
