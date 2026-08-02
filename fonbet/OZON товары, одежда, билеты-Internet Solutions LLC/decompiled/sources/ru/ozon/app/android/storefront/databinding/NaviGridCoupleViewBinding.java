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
public final class NaviGridCoupleViewBinding implements a {

    @NonNull
    public final View bottomBgView;

    @NonNull
    public final Image bottomImage;

    @NonNull
    public final TextAtomV2View bottomTitleView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View topBgView;

    @NonNull
    public final View topClickAreaView;

    @NonNull
    public final Image topImage;

    @NonNull
    public final TextAtomV2View topTitleView;

    private NaviGridCoupleViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View, @NonNull View view2, @NonNull View view3, @NonNull Image image2, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.bottomBgView = view;
        this.bottomImage = image;
        this.bottomTitleView = textAtomV2View;
        this.topBgView = view2;
        this.topClickAreaView = view3;
        this.topImage = image2;
        this.topTitleView = textAtomV2View2;
    }

    @NonNull
    public static NaviGridCoupleViewBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.bottomBgView;
        View d13 = C2548q.d(i11, view);
        if (d13 != null) {
            i11 = R$id.bottomImage;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                i11 = R$id.bottomTitleView;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.topBgView), view)) != null && (d12 = C2548q.d((i11 = R$id.topClickAreaView), view)) != null) {
                    i11 = R$id.topImage;
                    Image image2 = (Image) C2548q.d(i11, view);
                    if (image2 != null) {
                        i11 = R$id.topTitleView;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            return new NaviGridCoupleViewBinding((ConstraintLayout) view, d13, image, textAtomV2View, d11, d12, image2, textAtomV2View2);
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
