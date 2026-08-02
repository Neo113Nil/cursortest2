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
public final class ItemServiceBlockCopyBinding implements a {

    @NonNull
    public final ImageView copyIconIV;

    @NonNull
    public final TextAtomView copyTextTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemServiceBlockCopyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.copyIconIV = imageView;
        this.copyTextTAV = textAtomView;
    }

    @NonNull
    public static ItemServiceBlockCopyBinding bind(@NonNull View view) {
        int i11 = R$id.copyIconIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.copyTextTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new ItemServiceBlockCopyBinding((ConstraintLayout) view, imageView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemServiceBlockCopyBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_service_block_copy, viewGroup, false);
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
