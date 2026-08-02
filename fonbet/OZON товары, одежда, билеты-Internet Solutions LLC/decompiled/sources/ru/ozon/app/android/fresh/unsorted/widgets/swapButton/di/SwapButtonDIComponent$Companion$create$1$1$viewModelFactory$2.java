package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.FreshSubscribeRepositoryImpl;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.FreshSubscriptionApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/di/SwapButtonViewModelFactory;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SwapButtonDIComponent$Companion$create$1$1$viewModelFactory$2 extends AbstractC7737t implements Function0<SwapButtonViewModelFactory> {
    final /* synthetic */ SwapButtonDIComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwapButtonDIComponent$Companion$create$1$1$viewModelFactory$2(SwapButtonDIComponent$Companion$create$1$1 swapButtonDIComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = swapButtonDIComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SwapButtonViewModelFactory invoke() {
        NetworkComponentApi networkComponentApi;
        StorageComponentApi storageComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        Object create = networkComponentApi.getRetrofit().create(FreshSubscriptionApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        FreshSubscribeRepositoryImpl freshSubscribeRepositoryImpl = new FreshSubscribeRepositoryImpl((FreshSubscriptionApi) create);
        storageComponentApi = this.this$0.storageComponentApi;
        return new SwapButtonViewModelFactory(freshSubscribeRepositoryImpl, storageComponentApi.getAuthStateStorage());
    }
}
