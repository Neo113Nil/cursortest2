package ru.ozon.app.android.cml.delivery.widgets.regionSearch.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import kotlin.Metadata;
import kq.C7752a;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.data.RegionSearchMapper;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.RegionSearchViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ru/ozon/app/android/cml/delivery/widgets/regionSearch/di/RegionSearchComponent$Companion$create$1$1", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/di/RegionSearchComponent;", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/data/RegionSearchMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/cml/delivery/widgets/regionSearch/data/RegionSearchMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchViewModel;", "regionSearchViewModelProvider", "LPc/a;", "getRegionSearchViewModelProvider", "()LPc/a;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RegionSearchComponent$Companion$create$1$1 implements RegionSearchComponent {
    final /* synthetic */ CustomActionHandlersComponentApi $actionHandlersApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(RegionSearchComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<RegionSearchViewModel> regionSearchViewModelProvider = new C7752a();

    RegionSearchComponent$Companion$create$1$1(CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
        this.$actionHandlersApi = customActionHandlersComponentApi;
        this.$retainComposerApi = retainComposerComponentApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RegionSearchViewModel regionSearchViewModelProvider$lambda$0() {
        return new RegionSearchViewModel();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.regionSearch.di.RegionSearchComponent
    public RegionSearchMapper getMapper() {
        return (RegionSearchMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.regionSearch.di.RegionSearchComponent
    public a<RegionSearchViewModel> getRegionSearchViewModelProvider() {
        return this.regionSearchViewModelProvider;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.regionSearch.di.RegionSearchComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerApi.getTokenizedAnalytics();
    }
}
