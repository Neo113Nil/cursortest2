package ru.ozon.android.messenger.blocks.recommendations.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.databinding.MNouiViewRecommendationProductBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class g extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MNouiViewRecommendationProductBinding f86336a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86336a = MNouiViewRecommendationProductBinding.inflate(LayoutInflater.from(context), this, true);
    }

    public final void a(String str) {
        IconView productImage = this.f86336a.productImage;
        Intrinsics.checkNotNullExpressionValue(productImage, "productImage");
        ImageViewExtKt.loadImageOrGone(productImage, str);
    }

    public final void b(PriceDTO priceDTO) {
        PriceAtomView productPrice = this.f86336a.productPrice;
        Intrinsics.checkNotNullExpressionValue(productPrice, "productPrice");
        PriceAtomHolderKt.bindOrGone$default(productPrice, priceDTO, null, 2, null);
    }

    public final void c(TextDTO textDTO) {
        MNouiViewRecommendationProductBinding mNouiViewRecommendationProductBinding = this.f86336a;
        TextAtomV2View productTitle = mNouiViewRecommendationProductBinding.productTitle;
        Intrinsics.checkNotNullExpressionValue(productTitle, "productTitle");
        TextHolderKt.bindOrGone$default(productTitle, textDTO, null, 2, null);
        mNouiViewRecommendationProductBinding.productTitle.setTextIsSelectable(false);
    }
}
