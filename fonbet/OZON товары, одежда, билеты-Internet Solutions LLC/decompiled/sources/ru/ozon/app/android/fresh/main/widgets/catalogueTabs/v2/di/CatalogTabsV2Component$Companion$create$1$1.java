package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import Xv.C4892a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2Mapper;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2UpdateConsumer;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/di/CatalogTabsV2Component$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/di/CatalogTabsV2Component;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2Mapper;", "mapper", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2UpdateConsumer;", "catalogueTabsUpdateConsumer$delegate", "getCatalogueTabsUpdateConsumer", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2UpdateConsumer;", "catalogueTabsUpdateConsumer", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "kotlin.jvm.PlatformType", "catalogTabsSharedViewModelProvider", "LPc/a;", "getCatalogTabsSharedViewModelProvider", "()LPc/a;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2Component$Companion$create$1$1 implements CatalogTabsV2Component {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CatalogTabsV2Component$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: catalogueTabsUpdateConsumer$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j catalogueTabsUpdateConsumer = k.b(CatalogTabsV2Component$Companion$create$1$1$catalogueTabsUpdateConsumer$2.INSTANCE);
    private final a<CatalogTabsSharedViewModel> catalogTabsSharedViewModelProvider = new C4892a(0);

    CatalogTabsV2Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogTabsSharedViewModel catalogTabsSharedViewModelProvider$lambda$0() {
        return new CatalogTabsSharedViewModel();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2Component
    public a<CatalogTabsSharedViewModel> getCatalogTabsSharedViewModelProvider() {
        return this.catalogTabsSharedViewModelProvider;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2Component
    public CatalogTabsV2UpdateConsumer getCatalogueTabsUpdateConsumer() {
        return (CatalogTabsV2UpdateConsumer) this.catalogueTabsUpdateConsumer.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2Component
    public CatalogTabsV2Mapper getMapper() {
        return (CatalogTabsV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2Component
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
