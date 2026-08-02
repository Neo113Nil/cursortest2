package ru.ozon.android.messenger.blocks.recommendations.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.databinding.MViewRecommendationProductBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class h extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MViewRecommendationProductBinding f86337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86337a = MViewRecommendationProductBinding.inflate(LayoutInflater.from(context), this, true);
    }

    public final void a(IconButtonDTO iconButtonDTO, Function1<? super AtomAction, Unit> function1) {
        IconButtonView productCart = this.f86337a.productCart;
        Intrinsics.checkNotNullExpressionValue(productCart, "productCart");
        IconButtonHolderKt.bindOrGone(productCart, iconButtonDTO, function1);
    }

    public final void b(IconDTO iconDTO) {
        IconView productCartApplay = this.f86337a.productCartApplay;
        Intrinsics.checkNotNullExpressionValue(productCartApplay, "productCartApplay");
        IconHolderKt.bindOrGone$default(productCartApplay, iconDTO, null, 2, null);
    }

    public final void c(String str) {
        IconView productImage = this.f86337a.productImage;
        Intrinsics.checkNotNullExpressionValue(productImage, "productImage");
        ImageViewExtKt.loadImageOrGone(productImage, str);
    }

    public final void d(PriceDTO priceDTO) {
        PriceAtomView productPrice = this.f86337a.productPrice;
        Intrinsics.checkNotNullExpressionValue(productPrice, "productPrice");
        PriceAtomHolderKt.bindOrGone$default(productPrice, priceDTO, null, 2, null);
    }

    public final void e(TextDTO textDTO) {
        MViewRecommendationProductBinding mViewRecommendationProductBinding = this.f86337a;
        TextAtomV2View productTitle = mViewRecommendationProductBinding.productTitle;
        Intrinsics.checkNotNullExpressionValue(productTitle, "productTitle");
        TextHolderKt.bindOrGone$default(productTitle, textDTO, null, 2, null);
        mViewRecommendationProductBinding.productTitle.setTextIsSelectable(false);
    }
}
