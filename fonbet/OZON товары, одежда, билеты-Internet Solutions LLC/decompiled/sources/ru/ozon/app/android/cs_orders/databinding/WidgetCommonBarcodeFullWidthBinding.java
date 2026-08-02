package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetCommonBarcodeFullWidthBinding implements a {

    @NonNull
    public final ConstraintLayout barcodeCl;

    @NonNull
    public final AppCompatImageView barcodeIv;

    @NonNull
    public final Barrier barrierHeader;

    @NonNull
    public final AppCompatTextView codeTv;

    @NonNull
    public final TextAtomView descriptionTav;

    @NonNull
    public final AppCompatImageView expandBarcodeIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetCommonBarcodeFullWidthBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull Barrier barrier, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.barcodeCl = constraintLayout2;
        this.barcodeIv = appCompatImageView;
        this.barrierHeader = barrier;
        this.codeTv = appCompatTextView;
        this.descriptionTav = textAtomView;
        this.expandBarcodeIv = appCompatImageView2;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static WidgetCommonBarcodeFullWidthBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.barcodeIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.barrierHeader;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.codeTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    i11 = R$id.descriptionTav;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.expandBarcodeIv;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.titleTv;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                            if (appCompatTextView2 != null) {
                                return new WidgetCommonBarcodeFullWidthBinding(constraintLayout, constraintLayout, appCompatImageView, barrier, appCompatTextView, textAtomView, appCompatImageView2, appCompatTextView2);
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
