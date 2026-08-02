package ru.ozon.app.android.fresh.main.widgets.catalogShelf.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.header.CatalogShelfHeaderMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfRowMapper;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/catalogShelf/di/CatalogShelfComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/di/CatalogShelfComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "kotlin.jvm.PlatformType", "catalogTabsSharedViewModel", "LPc/a;", "getCatalogTabsSharedViewModel", "()LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowMapper;", "catalogShelfRowMapper$delegate", "LSc/j;", "getCatalogShelfRowMapper", "()Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowMapper;", "catalogShelfRowMapper", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/header/CatalogShelfHeaderMapper;", "catalogShelfHeaderMapper$delegate", "getCatalogShelfHeaderMapper", "()Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/header/CatalogShelfHeaderMapper;", "catalogShelfHeaderMapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfComponent$Companion$create$1$1 implements CatalogShelfComponent {
    final /* synthetic */ C7475g $storage;
    private final a<CatalogTabsSharedViewModel> catalogTabsSharedViewModel = new Pv.a(0);

    /* renamed from: catalogShelfRowMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j catalogShelfRowMapper = k.b(CatalogShelfComponent$Companion$create$1$1$catalogShelfRowMapper$2.INSTANCE);

    /* renamed from: catalogShelfHeaderMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j catalogShelfHeaderMapper = k.b(CatalogShelfComponent$Companion$create$1$1$catalogShelfHeaderMapper$2.INSTANCE);

    CatalogShelfComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogTabsSharedViewModel catalogTabsSharedViewModel$lambda$0() {
        return new CatalogTabsSharedViewModel();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfComponent
    public CatalogShelfHeaderMapper getCatalogShelfHeaderMapper() {
        return (CatalogShelfHeaderMapper) this.catalogShelfHeaderMapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfComponent
    public CatalogShelfRowMapper getCatalogShelfRowMapper() {
        return (CatalogShelfRowMapper) this.catalogShelfRowMapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfComponent
    public a<CatalogTabsSharedViewModel> getCatalogTabsSharedViewModel() {
        return this.catalogTabsSharedViewModel;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfComponent
    public FeatureChecker getFeatureChecker() {
        return ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getFeatureChecker();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
