package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class FinanceHeaderBinding implements a {

    @NonNull
    public final Image badgeImage;

    @NonNull
    public final LinearLayout badgeLL;

    @NonNull
    public final TextAtomV2View badgeTv;

    @NonNull
    public final View clickableArea;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View titleTv;

    private FinanceHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Image image, @NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull View view, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.badgeImage = image;
        this.badgeLL = linearLayout;
        this.badgeTv = textAtomV2View;
        this.clickableArea = view;
        this.titleTv = textAtomV2View2;
    }

    @NonNull
    public static FinanceHeaderBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgeImage;
        Image image = (Image) C2548q.d(i11, view);
        if (image != null) {
            i11 = R$id.badgeLL;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.badgeTv;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.clickableArea), view)) != null) {
                    i11 = R$id.titleTv;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new FinanceHeaderBinding((ConstraintLayout) view, image, linearLayout, textAtomV2View, d11, textAtomV2View2);
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
