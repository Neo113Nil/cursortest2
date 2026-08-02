package ru.ozon.app.android.marketing.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.marketing.ui.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemSellerTransparencyTagBinding implements a {

    @NonNull
    public final ImageView imageIv;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final CardView tagCv;

    @NonNull
    public final LinearLayout tagLl;

    @NonNull
    public final TextAtomView textTav;

    private ItemSellerTransparencyTagBinding(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull CardView cardView2, @NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = cardView;
        this.imageIv = imageView;
        this.tagCv = cardView2;
        this.tagLl = linearLayout;
        this.textTav = textAtomView;
    }

    @NonNull
    public static ItemSellerTransparencyTagBinding bind(@NonNull View view) {
        int i11 = R$id.imageIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            CardView cardView = (CardView) view;
            i11 = R$id.tagLl;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.textTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new ItemSellerTransparencyTagBinding(cardView, imageView, cardView, linearLayout, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
