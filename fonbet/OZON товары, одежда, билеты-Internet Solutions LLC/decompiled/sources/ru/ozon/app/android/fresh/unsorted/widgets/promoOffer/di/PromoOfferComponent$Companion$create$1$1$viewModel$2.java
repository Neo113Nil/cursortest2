package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoOfferComponent$Companion$create$1$1$viewModel$2 extends AbstractC7737t implements Function0<PromoOfferViewModel> {
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ PromoOfferComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoOfferComponent$Companion$create$1$1$viewModel$2(C7475g c7475g, PromoOfferComponent$Companion$create$1$1 promoOfferComponent$Companion$create$1$1) {
        super(0);
        this.$storage = c7475g;
        this.this$0 = promoOfferComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PromoOfferViewModel invoke() {
        return new PromoOfferViewModel(((CartServiceApi) this.$storage.getComponent(CartServiceApi.class)).getCartService(), this.this$0.getTokenizedAnalytics());
    }
}
