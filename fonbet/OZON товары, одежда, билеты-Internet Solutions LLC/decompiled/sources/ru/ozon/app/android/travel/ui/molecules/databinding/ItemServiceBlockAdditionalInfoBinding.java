package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ItemServiceBlockAdditionalInfoBinding implements a {

    @NonNull
    public final TextAtomView descriptionTAV;

    @NonNull
    public final ImageView iconIV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemServiceBlockAdditionalInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.descriptionTAV = textAtomView;
        this.iconIV = imageView;
    }

    @NonNull
    public static ItemServiceBlockAdditionalInfoBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.iconIV;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new ItemServiceBlockAdditionalInfoBinding((ConstraintLayout) view, textAtomView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemServiceBlockAdditionalInfoBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_service_block_additional_info, viewGroup, false);
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
