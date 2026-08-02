package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.mapper.LargeOrdersLiftingV2Mapper;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.util.FloorInputFilter;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.util.KeyboardVisibilityHelper;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.viewmodel.LargeOrdersLiftingV2ViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"ru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/di/LargeOrdersLiftingV2Component$Companion$create$1$1", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/di/LargeOrdersLiftingV2Component;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/mapper/LargeOrdersLiftingV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/mapper/LargeOrdersLiftingV2Mapper;", "mapper", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/viewmodel/LargeOrdersLiftingV2ViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/viewmodel/LargeOrdersLiftingV2ViewModel;", "viewModel", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/KeyboardVisibilityHelper;", "keyboardVisibilityHelper$delegate", "getKeyboardVisibilityHelper", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/KeyboardVisibilityHelper;", "keyboardVisibilityHelper", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/FloorInputFilter;", "floorInputFilter$delegate", "getFloorInputFilter", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/FloorInputFilter;", "floorInputFilter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeOrdersLiftingV2Component$Companion$create$1$1 implements LargeOrdersLiftingV2Component {
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(LargeOrdersLiftingV2Component$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(new LargeOrdersLiftingV2Component$Companion$create$1$1$viewModel$2(this));

    /* renamed from: keyboardVisibilityHelper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j keyboardVisibilityHelper = k.b(LargeOrdersLiftingV2Component$Companion$create$1$1$keyboardVisibilityHelper$2.INSTANCE);

    /* renamed from: floorInputFilter$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j floorInputFilter = k.b(LargeOrdersLiftingV2Component$Companion$create$1$1$floorInputFilter$2.INSTANCE);

    LargeOrdersLiftingV2Component$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di.LargeOrdersLiftingV2Component
    public FloorInputFilter getFloorInputFilter() {
        return (FloorInputFilter) this.floorInputFilter.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di.LargeOrdersLiftingV2Component
    public KeyboardVisibilityHelper getKeyboardVisibilityHelper() {
        return (KeyboardVisibilityHelper) this.keyboardVisibilityHelper.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di.LargeOrdersLiftingV2Component
    public LargeOrdersLiftingV2Mapper getMapper() {
        return (LargeOrdersLiftingV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di.LargeOrdersLiftingV2Component
    public LargeOrdersLiftingV2ViewModel getViewModel() {
        return (LargeOrdersLiftingV2ViewModel) this.viewModel.getValue();
    }
}
