package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di;

import Pc.a;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.core.WannaDiscountDecisionMapper;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core.WannaDiscountV2Mapper;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModelImpl;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\rJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/di/WannaDiscountComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/core/WannaDiscountV2Mapper;", "getWannaDiscountV2Mapper", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/core/WannaDiscountV2Mapper;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/core/WannaDiscountDecisionMapper;", "getWannaDiscountDecisionMapper", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/core/WannaDiscountDecisionMapper;", "LPc/a;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewModelImpl;", "getWannaDiscountV2ViewModelProvider", "()LPc/a;", "Factory", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WannaDiscountComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/di/WannaDiscountComponent$Factory;", "", "create", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/di/WannaDiscountComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface Factory {
        @NotNull
        WannaDiscountComponent create(@NotNull NetworkComponentApi networkComponentApi);
    }

    @NotNull
    WannaDiscountDecisionMapper getWannaDiscountDecisionMapper();

    @NotNull
    WannaDiscountV2Mapper getWannaDiscountV2Mapper();

    @NotNull
    a<WannaDiscountV2ViewModelImpl> getWannaDiscountV2ViewModelProvider();
}
