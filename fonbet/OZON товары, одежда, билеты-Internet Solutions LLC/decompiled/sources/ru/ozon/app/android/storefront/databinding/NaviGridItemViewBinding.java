package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class NaviGridItemViewBinding implements a {

    @NonNull
    public final View itemBgView;

    @NonNull
    public final Image itemImage;

    @NonNull
    public final TextAtomV2View itemTitleView;

    @NonNull
    public final ConstraintLayout pairItemCL;

    @NonNull
    private final ConstraintLayout rootView;

    private NaviGridItemViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.itemBgView = view;
        this.itemImage = image;
        this.itemTitleView = textAtomV2View;
        this.pairItemCL = constraintLayout2;
    }

    @NonNull
    public static NaviGridItemViewBinding bind(@NonNull View view) {
        int i11 = R$id.itemBgView;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.itemImage;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                i11 = R$id.itemTitleView;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new NaviGridItemViewBinding(constraintLayout, d11, image, textAtomV2View, constraintLayout);
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
