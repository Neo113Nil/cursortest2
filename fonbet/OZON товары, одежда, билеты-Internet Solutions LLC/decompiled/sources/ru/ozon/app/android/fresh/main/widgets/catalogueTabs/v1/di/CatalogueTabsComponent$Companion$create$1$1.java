package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper.CatalogueTabsUpdateConsumer;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/di/CatalogueTabsComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/di/CatalogueTabsComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsMapper;", "mapper", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "kotlin.jvm.PlatformType", "catalogTabsSharedViewModelProvider", "LPc/a;", "getCatalogTabsSharedViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/viewMapper/CatalogueTabsUpdateConsumer;", "catalogueTabsUpdateConsumer$delegate", "getCatalogueTabsUpdateConsumer", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/viewMapper/CatalogueTabsUpdateConsumer;", "catalogueTabsUpdateConsumer", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsComponent$Companion$create$1$1 implements CatalogueTabsComponent {
    private final FeatureService featureService;
    private final l tokenizedAnalytics;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CatalogueTabsComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<CatalogTabsSharedViewModel> catalogTabsSharedViewModelProvider = new Wv.a();

    /* renamed from: catalogueTabsUpdateConsumer$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j catalogueTabsUpdateConsumer = k.b(CatalogueTabsComponent$Companion$create$1$1$catalogueTabsUpdateConsumer$2.INSTANCE);

    CatalogueTabsComponent$Companion$create$1$1(C7475g c7475g) {
        this.tokenizedAnalytics = ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
        this.featureService = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getFeatureService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogTabsSharedViewModel catalogTabsSharedViewModelProvider$lambda$0() {
        return new CatalogTabsSharedViewModel();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsComponent
    public a<CatalogTabsSharedViewModel> getCatalogTabsSharedViewModelProvider() {
        return this.catalogTabsSharedViewModelProvider;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsComponent
    public CatalogueTabsUpdateConsumer getCatalogueTabsUpdateConsumer() {
        return (CatalogueTabsUpdateConsumer) this.catalogueTabsUpdateConsumer.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsComponent
    public FeatureService getFeatureService() {
        return this.featureService;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsComponent
    public CatalogueTabsMapper getMapper() {
        return (CatalogueTabsMapper) this.mapper.getValue();
    }
}
