package ru.ozon.app.android.fresh.main.widgets.header.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import cw.C5978a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.HeaderMapper;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/header/di/HeaderComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/header/di/HeaderComponent;", "Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "kotlin.jvm.PlatformType", "catalogTabsSharedViewModel", "LPc/a;", "getCatalogTabsSharedViewModel", "()LPc/a;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HeaderComponent$Companion$create$1$1 implements HeaderComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(HeaderComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<CatalogTabsSharedViewModel> catalogTabsSharedViewModel = new C5978a(1);

    HeaderComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogTabsSharedViewModel catalogTabsSharedViewModel$lambda$0() {
        return new CatalogTabsSharedViewModel();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.header.di.HeaderComponent
    public a<CatalogTabsSharedViewModel> getCatalogTabsSharedViewModel() {
        return this.catalogTabsSharedViewModel;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.header.di.HeaderComponent
    public HeaderMapper getMapper() {
        return (HeaderMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.header.di.HeaderComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
