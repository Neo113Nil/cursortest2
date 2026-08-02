package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class ItemBarcodeBinding implements a {

    @NonNull
    public final DisclaimerContainer annotationDc;

    @NonNull
    public final ConstraintLayout barcodeCv;

    @NonNull
    public final AppCompatImageView barcodeIv;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final Barrier codeBarrier;

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

    @NonNull
    public final IconButtonV3View shareBtn;

    private ItemBarcodeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull DisclaimerContainer disclaimerContainer, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull TextAtomView textAtomView, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView2, @NonNull AppCompatTextView appCompatTextView2, @NonNull IconButtonV3View iconButtonV3View) {
        this.rootView = constraintLayout;
        this.annotationDc = disclaimerContainer;
        this.barcodeCv = constraintLayout2;
        this.barcodeIv = appCompatImageView;
        this.barrier = barrier;
        this.codeBarrier = barrier2;
        this.descriptionTav = textAtomView;
        this.hintTv = appCompatTextView;
        this.infoTav = textAtomView2;
        this.packageTv = appCompatTextView2;
        this.shareBtn = iconButtonV3View;
    }

    @NonNull
    public static ItemBarcodeBinding bind(@NonNull View view) {
        int i11 = R$id.annotationDc;
        DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
        if (disclaimerContainer != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.barcodeIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.barrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.codeBarrier;
                    Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                    if (barrier2 != null) {
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
                                        i11 = R$id.shareBtn;
                                        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                                        if (iconButtonV3View != null) {
                                            return new ItemBarcodeBinding(constraintLayout, disclaimerContainer, constraintLayout, appCompatImageView, barrier, barrier2, textAtomView, appCompatTextView, textAtomView2, appCompatTextView2, iconButtonV3View);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_barcode, viewGroup, false);
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
