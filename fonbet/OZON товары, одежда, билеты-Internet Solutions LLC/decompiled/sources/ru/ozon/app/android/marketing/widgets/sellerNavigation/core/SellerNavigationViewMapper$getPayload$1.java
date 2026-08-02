package ru.ozon.app.android.marketing.widgets.sellerNavigation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.presentation.SellerNavigationVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "index", "", "dto", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/presentation/SellerNavigationVO$Item;", "invoke", "(ILru/ozon/app/android/marketing/widgets/sellerNavigation/presentation/SellerNavigationVO$Item;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerNavigationViewMapper$getPayload$1 extends AbstractC7737t implements Function2<Integer, SellerNavigationVO.Item, Boolean> {
    final /* synthetic */ SellerNavigationVO $newItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerNavigationViewMapper$getPayload$1(SellerNavigationVO sellerNavigationVO) {
        super(2);
        this.$newItem = sellerNavigationVO;
    }

    public final Boolean invoke(int i11, SellerNavigationVO.Item dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return Boolean.valueOf(Intrinsics.d(dto.getDeeplink(), this.$newItem.getItems().get(i11).getDeeplink()));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, SellerNavigationVO.Item item) {
        return invoke(num.intValue(), item);
    }
}
