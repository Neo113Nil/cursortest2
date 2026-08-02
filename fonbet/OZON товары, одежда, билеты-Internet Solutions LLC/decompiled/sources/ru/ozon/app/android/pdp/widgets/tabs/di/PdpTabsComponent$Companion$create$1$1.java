package ru.ozon.app.android.pdp.widgets.tabs.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.tabs.core.PdpTabsMapper;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"ru/ozon/app/android/pdp/widgets/tabs/di/PdpTabsComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/tabs/di/PdpTabsComponent;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/utils/AppType;", "appType$delegate", "LSc/j;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/pdp/widgets/tabs/core/PdpTabsMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/pdp/widgets/tabs/core/PdpTabsMapper;", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpTabsComponent$Companion$create$1$1 implements PdpTabsComponent {
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;

    /* renamed from: appType$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appType = DelegatesKt.lazyUnsafe(new PdpTabsComponent$Companion$create$1$1$appType$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new PdpTabsComponent$Companion$create$1$1$mapper$2(this));

    PdpTabsComponent$Companion$create$1$1(C7475g c7475g) {
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    public AppType getAppType() {
        return (AppType) this.appType.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.tabs.di.PdpTabsComponent
    public PdpTabsMapper getMapper() {
        return (PdpTabsMapper) this.mapper.getValue();
    }
}
