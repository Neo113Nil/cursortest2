package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.core.UniversalObjectScrollMapper;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"ru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/di/UniversalObjectScrollWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/di/UniversalObjectScrollWidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "LSc/j;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/core/UniversalObjectScrollMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/core/UniversalObjectScrollMapper;", "mapper", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler$delegate", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectScrollWidgetComponent$Companion$create$1$1 implements UniversalObjectScrollWidgetComponent {
    private final AccountComponentApi accountComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j featureChecker = k.b(new UniversalObjectScrollWidgetComponent$Companion$create$1$1$featureChecker$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new UniversalObjectScrollWidgetComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: adultHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultHandler = LazyUtilsKt.unsafeLazy(new UniversalObjectScrollWidgetComponent$Companion$create$1$1$adultHandler$2(this));

    UniversalObjectScrollWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di.UniversalObjectScrollWidgetComponent
    public AdultHandler getAdultHandler() {
        return (AdultHandler) this.adultHandler.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di.UniversalObjectScrollWidgetComponent
    public FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di.UniversalObjectScrollWidgetComponent
    public UniversalObjectScrollMapper getMapper() {
        return (UniversalObjectScrollMapper) this.mapper.getValue();
    }
}
