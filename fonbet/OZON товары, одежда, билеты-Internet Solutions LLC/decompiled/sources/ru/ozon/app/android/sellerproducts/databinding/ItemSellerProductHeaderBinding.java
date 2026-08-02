package ru.ozon.app.android.sellerproducts.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.sellerproducts.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ItemSellerProductHeaderBinding implements a {

    @NonNull
    public final SmallBorderlessButtonView headerLinkTa;

    @NonNull
    public final TextAtomView headerSubtitleTa;

    @NonNull
    public final TextAtomView headerTitleTa;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemSellerProductHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.headerLinkTa = smallBorderlessButtonView;
        this.headerSubtitleTa = textAtomView;
        this.headerTitleTa = textAtomView2;
    }

    @NonNull
    public static ItemSellerProductHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.headerLinkTa;
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
        if (smallBorderlessButtonView != null) {
            i11 = R$id.headerSubtitleTa;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.headerTitleTa;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new ItemSellerProductHeaderBinding((ConstraintLayout) view, smallBorderlessButtonView, textAtomView, textAtomView2);
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
