package ru.ozon.app.android.product.addToCart.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniGradients;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundGradients;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToCartButtonView$likezoneGradientsMap$2 extends AbstractC7737t implements Function0<Map<AddToCartButtonDTO.Theme.StyleWrapper.Style, ? extends AddToCartButtonView.BackgroundGradients>> {
    public static final AddToCartButtonView$likezoneGradientsMap$2 INSTANCE = new AddToCartButtonView$likezoneGradientsMap$2();

    AddToCartButtonView$likezoneGradientsMap$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<AddToCartButtonDTO.Theme.StyleWrapper.Style, ? extends AddToCartButtonView.BackgroundGradients> invoke() {
        AddToCartButtonDTO.Theme.StyleWrapper.Style style = AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_PRIMARY;
        UniGradient gradient = UniGradients.GR_LIKEZON_OZON_PRIMARY.getGradient();
        UniGradients uniGradients = UniGradients.GR_LIKEZON_OZON_SECONDARY;
        Pair pair = new Pair(style, new AddToCartButtonView.BackgroundGradients(gradient, uniGradients.getGradient()));
        Pair pair2 = new Pair(AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_PRIMARY, new AddToCartButtonView.BackgroundGradients(uniGradients.getGradient(), uniGradients.getGradient()));
        AddToCartButtonDTO.Theme.StyleWrapper.Style style2 = AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_FRESH;
        UniGradient gradient2 = UniGradients.GR_LIKEZON_FRESH_PRIMARY.getGradient();
        UniGradients uniGradients2 = UniGradients.GR_LIKEZON_FRESH_SECONDARY;
        Pair pair3 = new Pair(style2, new AddToCartButtonView.BackgroundGradients(gradient2, uniGradients2.getGradient()));
        Pair pair4 = new Pair(AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_FRESH, new AddToCartButtonView.BackgroundGradients(uniGradients2.getGradient(), uniGradients2.getGradient()));
        AddToCartButtonDTO.Theme.StyleWrapper.Style style3 = AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_EXPRESS;
        UniGradient gradient3 = UniGradients.GR_LIKEZON_EXPRESS_PRIMARY.getGradient();
        UniGradients uniGradients3 = UniGradients.GR_LIKEZON_EXPRESS_SECONDARY;
        return U.j(pair, pair2, pair3, pair4, new Pair(style3, new AddToCartButtonView.BackgroundGradients(gradient3, uniGradients3.getGradient())), new Pair(AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_EXPRESS, new AddToCartButtonView.BackgroundGradients(uniGradients3.getGradient(), uniGradients3.getGradient())));
    }
}
