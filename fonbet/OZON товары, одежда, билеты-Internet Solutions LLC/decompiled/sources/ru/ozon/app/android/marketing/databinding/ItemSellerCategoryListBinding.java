package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemSellerCategoryListBinding implements a {

    @NonNull
    public final ImageView adultEyeIv;

    @NonNull
    public final ImageView categoryIconIv;

    @NonNull
    public final TextAtomView categoryNameTv;

    @NonNull
    private final CardView rootView;

    private ItemSellerCategoryListBinding(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextAtomView textAtomView) {
        this.rootView = cardView;
        this.adultEyeIv = imageView;
        this.categoryIconIv = imageView2;
        this.categoryNameTv = textAtomView;
    }

    @NonNull
    public static ItemSellerCategoryListBinding bind(@NonNull View view) {
        int i11 = R$id.adultEyeIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.categoryIconIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.categoryNameTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    return new ItemSellerCategoryListBinding((CardView) view, imageView, imageView2, textAtomView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemSellerCategoryListBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_seller_category_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
