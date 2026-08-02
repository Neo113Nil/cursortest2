package ru.ozon.app.android.cart.domain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.TokenizedAnalyticsActionEvents;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "dto", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartDomainInteractorImpl$addProductsWithTokenizedAnalytics$2 extends AbstractC7737t implements Function1<CartAddItemDTO, Unit> {
    final /* synthetic */ AddProductsWithTokenizedAnalytics $params;
    final /* synthetic */ CartDomainInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartDomainInteractorImpl$addProductsWithTokenizedAnalytics$2(AddProductsWithTokenizedAnalytics addProductsWithTokenizedAnalytics, CartDomainInteractorImpl cartDomainInteractorImpl) {
        super(1);
        this.$params = addProductsWithTokenizedAnalytics;
        this.this$0 = cartDomainInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartAddItemDTO cartAddItemDTO) {
        invoke2(cartAddItemDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartAddItemDTO cartAddItemDTO) {
        TokenizedAnalyticsActionEvents tokenizedAnalyticsActionEvents = new TokenizedAnalyticsActionEvents(this.$params.getAnalyticsEvent(), this.$params.getAdditionalAnalyticsEvent());
        CartDomainInteractorImpl cartDomainInteractorImpl = this.this$0;
        Intrinsics.f(cartAddItemDTO);
        cartDomainInteractorImpl.sendPreToCartAnalytics(cartAddItemDTO, this.$params);
        this.this$0.sendCartActionAnalytics(cartAddItemDTO, this.$params.getItems(), tokenizedAnalyticsActionEvents);
    }
}
