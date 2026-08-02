package ru.ozon.app.android.cart.domain.network;

import Nc.C3668b;
import Sc.v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.data.SummaryV2Response;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.local.LocalCartDataStorage;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062<\u0010\u0005\u001a8\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003 \u0004*\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LSc/v;", "", "Lru/ozon/app/android/cart/common/data/SummaryV2Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "<destruct>", "", "invoke", "(LSc/v;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CartSyncService$executeCartUpdateRequests$3 extends AbstractC7737t implements Function1<v<? extends Long, ? extends Long, ? extends SummaryV2Response>, Unit> {
    final /* synthetic */ CartSyncService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSyncService$executeCartUpdateRequests$3(CartSyncService cartSyncService) {
        super(1);
        this.this$0 = cartSyncService;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(v<? extends Long, ? extends Long, ? extends SummaryV2Response> vVar) {
        invoke2((v<Long, Long, SummaryV2Response>) vVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(v<Long, Long, SummaryV2Response> vVar) {
        LocalCartDataStorage localCartDataStorage;
        LocalCartDataStorage localCartDataStorage2;
        C3668b c3668b;
        long longValue = vVar.a().longValue();
        long longValue2 = vVar.b().longValue();
        SummaryV2Response d11 = vVar.d();
        Intrinsics.checkNotNullExpressionValue(d11, "component3(...)");
        SummaryV2Response summaryV2Response = d11;
        localCartDataStorage = this.this$0.localCartDataStorage;
        Map<Long, CartItemInfo> mainCartItemsMap = summaryV2Response.getMainCartItemsMap();
        CartSource cartSource = CartSource.REMOTE;
        CartChangeSource cartChangeSource = CartChangeSource.SUMMARY;
        localCartDataStorage.setCartItems(mainCartItemsMap, longValue, cartSource, cartChangeSource);
        localCartDataStorage2 = this.this$0.localFamilyCartDataStorage;
        localCartDataStorage2.setCartItems(summaryV2Response.getFamilyCartItemsMap(), longValue2, cartSource, cartChangeSource);
        c3668b = this.this$0.requestCartUpdateCompleteSubject;
        c3668b.onComplete();
    }
}
