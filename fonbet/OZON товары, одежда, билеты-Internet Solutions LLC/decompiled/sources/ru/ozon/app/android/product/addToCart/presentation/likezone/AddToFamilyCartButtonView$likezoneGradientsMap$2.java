package ru.ozon.app.android.product.addToCart.presentation.likezone;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.FamilyButtonDTO;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniGradients;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme$StyleWrapper$Style;", "Lru/ozon/uni/core/UniGradient;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToFamilyCartButtonView$likezoneGradientsMap$2 extends AbstractC7737t implements Function0<Map<FamilyButtonDTO.Theme.StyleWrapper.Style, ? extends UniGradient>> {
    public static final AddToFamilyCartButtonView$likezoneGradientsMap$2 INSTANCE = new AddToFamilyCartButtonView$likezoneGradientsMap$2();

    AddToFamilyCartButtonView$likezoneGradientsMap$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<FamilyButtonDTO.Theme.StyleWrapper.Style, ? extends UniGradient> invoke() {
        return U.j(new Pair(FamilyButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_PRIMARY, UniGradients.GR_LIKEZON_OZON_PRIMARY.getGradient()), new Pair(FamilyButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_FRESH, UniGradients.GR_LIKEZON_FRESH_PRIMARY.getGradient()), new Pair(FamilyButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_EXPRESS, UniGradients.GR_LIKEZON_EXPRESS_PRIMARY.getGradient()));
    }
}
