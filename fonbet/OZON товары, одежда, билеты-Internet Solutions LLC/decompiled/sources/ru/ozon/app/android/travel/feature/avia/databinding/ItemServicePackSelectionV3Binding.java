package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemServicePackSelectionV3Binding implements a {

    @NonNull
    public final ImageView benefitIconIV;

    @NonNull
    public final TextAtomView descriptionTAV;

    @NonNull
    public final Guideline guidelineG;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorV;

    @NonNull
    public final ImageView statusIconIV;

    private ItemServicePackSelectionV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView, @NonNull Guideline guideline, @NonNull View view, @NonNull ImageView imageView2) {
        this.rootView = constraintLayout;
        this.benefitIconIV = imageView;
        this.descriptionTAV = textAtomView;
        this.guidelineG = guideline;
        this.separatorV = view;
        this.statusIconIV = imageView2;
    }

    @NonNull
    public static ItemServicePackSelectionV3Binding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.benefitIconIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.descriptionTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.guidelineG;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null && (d11 = C2548q.d((i11 = R$id.separatorV), view)) != null) {
                    i11 = R$id.statusIconIV;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null) {
                        return new ItemServicePackSelectionV3Binding((ConstraintLayout) view, imageView, textAtomView, guideline, d11, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemServicePackSelectionV3Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_service_pack_selection_v3, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
