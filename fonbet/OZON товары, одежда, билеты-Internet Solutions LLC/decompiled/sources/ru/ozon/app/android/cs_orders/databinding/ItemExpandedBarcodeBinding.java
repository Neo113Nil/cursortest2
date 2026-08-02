package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class ItemExpandedBarcodeBinding implements a {

    @NonNull
    public final ConstraintLayout barcodeCl;

    @NonNull
    public final AppCompatImageView barcodeIv;

    @NonNull
    public final TextAtomView descriptionTav;

    @NonNull
    public final AppCompatTextView hintTv;

    @NonNull
    public final TextAtomView infoTav;

    @NonNull
    public final AppCompatTextView packageTv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemExpandedBarcodeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView2, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.barcodeCl = constraintLayout2;
        this.barcodeIv = appCompatImageView;
        this.descriptionTav = textAtomView;
        this.hintTv = appCompatTextView;
        this.infoTav = textAtomView2;
        this.packageTv = appCompatTextView2;
    }

    @NonNull
    public static ItemExpandedBarcodeBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.barcodeIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.descriptionTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.hintTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    i11 = R$id.infoTav;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.packageTv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView2 != null) {
                            return new ItemExpandedBarcodeBinding(constraintLayout, constraintLayout, appCompatImageView, textAtomView, appCompatTextView, textAtomView2, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemExpandedBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_expanded_barcode, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
