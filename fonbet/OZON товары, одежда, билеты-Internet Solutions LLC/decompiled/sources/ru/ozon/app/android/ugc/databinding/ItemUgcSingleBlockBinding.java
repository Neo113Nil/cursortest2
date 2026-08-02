package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class ItemUgcSingleBlockBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView ugcBlockIconIv;

    @NonNull
    public final ConstraintLayout ugcBlockRootCl;

    @NonNull
    public final TextAtomV2View ugcBlockSubtitleTav;

    @NonNull
    public final TextAtomV2View ugcBlockTitleTav;

    private ItemUgcSingleBlockBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.ugcBlockIconIv = imageView;
        this.ugcBlockRootCl = constraintLayout2;
        this.ugcBlockSubtitleTav = textAtomV2View;
        this.ugcBlockTitleTav = textAtomV2View2;
    }

    @NonNull
    public static ItemUgcSingleBlockBinding bind(@NonNull View view) {
        int i11 = R$id.ugcBlockIconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.ugcBlockSubtitleTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.ugcBlockTitleTav;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    return new ItemUgcSingleBlockBinding(constraintLayout, imageView, constraintLayout, textAtomV2View, textAtomV2View2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemUgcSingleBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_ugc_single_block, viewGroup, false);
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
