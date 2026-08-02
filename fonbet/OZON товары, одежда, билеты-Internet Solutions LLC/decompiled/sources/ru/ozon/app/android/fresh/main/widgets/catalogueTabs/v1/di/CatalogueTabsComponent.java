package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di;

import BV.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper.CatalogueTabsUpdateConsumer;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/di/CatalogueTabsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsMapper;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "getCatalogTabsSharedViewModelProvider", "()LPc/a;", "catalogTabsSharedViewModelProvider", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/viewMapper/CatalogueTabsUpdateConsumer;", "getCatalogueTabsUpdateConsumer", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/viewMapper/CatalogueTabsUpdateConsumer;", "catalogueTabsUpdateConsumer", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CatalogueTabsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/di/CatalogueTabsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/di/CatalogueTabsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CatalogueTabsComponent create$lambda$0(C7475g c7475g) {
            return new CatalogueTabsComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<CatalogueTabsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CatalogueTabsComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    Pc.a<CatalogTabsSharedViewModel> getCatalogTabsSharedViewModelProvider();

    @NotNull
    CatalogueTabsUpdateConsumer getCatalogueTabsUpdateConsumer();

    @NotNull
    FeatureService getFeatureService();

    @NotNull
    CatalogueTabsMapper getMapper();
}
