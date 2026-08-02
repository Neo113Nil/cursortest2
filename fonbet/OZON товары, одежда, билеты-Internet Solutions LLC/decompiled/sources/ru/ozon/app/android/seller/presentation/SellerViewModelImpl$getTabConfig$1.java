package ru.ozon.app.android.seller.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.miniapp.seller.SellerTabConfigMapper;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/tabbar/data/TabConfigResponse;)Lru/ozon/app/android/tabbar/data/RemoteTabConfig;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SellerViewModelImpl$getTabConfig$1 extends AbstractC7737t implements Function1<TabConfigResponse, RemoteTabConfig> {
    final /* synthetic */ SellerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerViewModelImpl$getTabConfig$1(SellerViewModelImpl sellerViewModelImpl) {
        super(1);
        this.this$0 = sellerViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final RemoteTabConfig invoke(TabConfigResponse it) {
        SellerTabConfigMapper sellerTabConfigMapper;
        Intrinsics.checkNotNullParameter(it, "it");
        sellerTabConfigMapper = this.this$0.mapper;
        return sellerTabConfigMapper.mapTabConfig(it);
    }
}
