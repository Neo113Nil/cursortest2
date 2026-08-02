package ru.ozon.app.android.storefront.filterWidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.filterWidgets.R$id;

/* loaded from: classes2.dex */
public final class WidgetFiltersTextInputFilterBinding implements a {

    @NonNull
    public final View anchor;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final LinearLayout inputContainerLl;

    @NonNull
    public final AppCompatEditText inputEt;

    @NonNull
    public final AppCompatTextView prefixTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final View titleAnchor;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetFiltersTextInputFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Barrier barrier, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatTextView appCompatTextView, @NonNull View view2, @NonNull View view3, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.anchor = view;
        this.barrier = barrier;
        this.iconIv = imageView;
        this.inputContainerLl = linearLayout;
        this.inputEt = appCompatEditText;
        this.prefixTv = appCompatTextView;
        this.separator = view2;
        this.titleAnchor = view3;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static WidgetFiltersTextInputFilterBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.anchor;
        View d13 = C2548q.d(i11, view);
        if (d13 != null) {
            i11 = R$id.barrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.iconIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.inputContainerLl;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null) {
                        i11 = R$id.inputEt;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
                        if (appCompatEditText != null) {
                            i11 = R$id.prefixTv;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                            if (appCompatTextView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null && (d12 = C2548q.d((i11 = R$id.titleAnchor), view)) != null) {
                                i11 = R$id.titleTv;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                if (appCompatTextView2 != null) {
                                    return new WidgetFiltersTextInputFilterBinding((ConstraintLayout) view, d13, barrier, imageView, linearLayout, appCompatEditText, appCompatTextView, d11, d12, appCompatTextView2);
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
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
