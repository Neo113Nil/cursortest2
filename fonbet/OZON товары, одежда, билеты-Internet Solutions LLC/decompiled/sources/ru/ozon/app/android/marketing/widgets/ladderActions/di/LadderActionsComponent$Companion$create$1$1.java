package ru.ozon.app.android.marketing.widgets.ladderActions.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.marketing.widgets.ladderActions.core.LadderActionsMapper;
import ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/marketing/widgets/ladderActions/di/LadderActionsComponent$Companion$create$1$1", "Lru/ozon/app/android/marketing/widgets/ladderActions/di/LadderActionsComponent;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsMapper;", "mapper", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsViewModel;", "ladderActionsViewModel$delegate", "getLadderActionsViewModel", "()Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsViewModel;", "ladderActionsViewModel", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LadderActionsComponent$Companion$create$1$1 implements LadderActionsComponent {
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final CartServiceApi cartServiceApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(LadderActionsComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: ladderActionsViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j ladderActionsViewModel = k.b(new LadderActionsComponent$Companion$create$1$1$ladderActionsViewModel$2(this));

    LadderActionsComponent$Companion$create$1$1(C7475g c7475g) {
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
    }

    @Override // ru.ozon.app.android.marketing.widgets.ladderActions.di.LadderActionsComponent
    public AppType getAppType() {
        return this.androidPlatformComponentApi.getAppType();
    }

    @Override // ru.ozon.app.android.marketing.widgets.ladderActions.di.LadderActionsComponent
    public LadderActionsViewModel getLadderActionsViewModel() {
        return (LadderActionsViewModel) this.ladderActionsViewModel.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.ladderActions.di.LadderActionsComponent
    public LadderActionsMapper getMapper() {
        return (LadderActionsMapper) this.mapper.getValue();
    }
}
