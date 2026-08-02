package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di;

import As.C2444a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.header.ExpressNavigationSliderV2HeaderMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items.ExpressNavigationSliderV2ItemsMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.separator.ExpressNavigationSliderV2SeparatorMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.header.NavigationSliderV3HeaderMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3RowMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.separator.NavigationSliderV3SeparatorMapper;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 (2\u00060\u0001j\u0002`\u0002:\u0001(R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010#\u001a\u00060\u001fj\u0002` 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/di/ExpressNavigationSliderItemsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/header/ExpressNavigationSliderV2HeaderMapper;", "getNavSliderV2HeaderMapper", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/header/ExpressNavigationSliderV2HeaderMapper;", "navSliderV2HeaderMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemsMapper;", "getNavSliderV2ItemsMapper", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemsMapper;", "navSliderV2ItemsMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/separator/ExpressNavigationSliderV2SeparatorMapper;", "getNavSliderV2SeparatorMapper", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/separator/ExpressNavigationSliderV2SeparatorMapper;", "navSliderV2SeparatorMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/header/NavigationSliderV3HeaderMapper;", "getNavSliderV3HeaderMapper", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/header/NavigationSliderV3HeaderMapper;", "navSliderV3HeaderMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowMapper;", "getNavSliderV3RowMapper", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowMapper;", "navSliderV3RowMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/separator/NavigationSliderV3SeparatorMapper;", "getNavSliderV3SeparatorMapper", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/separator/NavigationSliderV3SeparatorMapper;", "navSliderV3SeparatorMapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ExpressNavigationSliderItemsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/di/ExpressNavigationSliderItemsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/di/ExpressNavigationSliderItemsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExpressNavigationSliderItemsComponent create$lambda$0(final C7475g c7475g) {
            return new ExpressNavigationSliderItemsComponent() { // from class: ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent$Companion$create$1$1

                /* renamed from: navSliderV2HeaderMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j navSliderV2HeaderMapper = k.b(ExpressNavigationSliderItemsComponent$Companion$create$1$1$navSliderV2HeaderMapper$2.INSTANCE);

                /* renamed from: navSliderV2ItemsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j navSliderV2ItemsMapper = k.b(ExpressNavigationSliderItemsComponent$Companion$create$1$1$navSliderV2ItemsMapper$2.INSTANCE);

                /* renamed from: navSliderV2SeparatorMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j navSliderV2SeparatorMapper = k.b(ExpressNavigationSliderItemsComponent$Companion$create$1$1$navSliderV2SeparatorMapper$2.INSTANCE);

                /* renamed from: navSliderV3HeaderMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j navSliderV3HeaderMapper = k.b(ExpressNavigationSliderItemsComponent$Companion$create$1$1$navSliderV3HeaderMapper$2.INSTANCE);

                /* renamed from: navSliderV3RowMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j navSliderV3RowMapper = k.b(ExpressNavigationSliderItemsComponent$Companion$create$1$1$navSliderV3RowMapper$2.INSTANCE);

                /* renamed from: navSliderV3SeparatorMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j navSliderV3SeparatorMapper = k.b(ExpressNavigationSliderItemsComponent$Companion$create$1$1$navSliderV3SeparatorMapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public AdultHandler getAdultHandler() {
                    return ((AccountComponentApi) C7475g.this.getComponent(AccountComponentApi.class)).getAdultHandler();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public FeatureChecker getFeatureChecker() {
                    return ((NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class)).getFeatureChecker();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public ExpressNavigationSliderV2HeaderMapper getNavSliderV2HeaderMapper() {
                    return (ExpressNavigationSliderV2HeaderMapper) this.navSliderV2HeaderMapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public ExpressNavigationSliderV2ItemsMapper getNavSliderV2ItemsMapper() {
                    return (ExpressNavigationSliderV2ItemsMapper) this.navSliderV2ItemsMapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public ExpressNavigationSliderV2SeparatorMapper getNavSliderV2SeparatorMapper() {
                    return (ExpressNavigationSliderV2SeparatorMapper) this.navSliderV2SeparatorMapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public NavigationSliderV3HeaderMapper getNavSliderV3HeaderMapper() {
                    return (NavigationSliderV3HeaderMapper) this.navSliderV3HeaderMapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public NavigationSliderV3RowMapper getNavSliderV3RowMapper() {
                    return (NavigationSliderV3RowMapper) this.navSliderV3RowMapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public NavigationSliderV3SeparatorMapper getNavSliderV3SeparatorMapper() {
                    return (NavigationSliderV3SeparatorMapper) this.navSliderV3SeparatorMapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<ExpressNavigationSliderItemsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ExpressNavigationSliderItemsComponent.class), new C2444a(storage, 9));
        }
    }

    @NotNull
    AdultHandler getAdultHandler();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    ExpressNavigationSliderV2HeaderMapper getNavSliderV2HeaderMapper();

    @NotNull
    ExpressNavigationSliderV2ItemsMapper getNavSliderV2ItemsMapper();

    @NotNull
    ExpressNavigationSliderV2SeparatorMapper getNavSliderV2SeparatorMapper();

    @NotNull
    NavigationSliderV3HeaderMapper getNavSliderV3HeaderMapper();

    @NotNull
    NavigationSliderV3RowMapper getNavSliderV3RowMapper();

    @NotNull
    NavigationSliderV3SeparatorMapper getNavSliderV3SeparatorMapper();

    @NotNull
    l getTokenizedAnalytics();
}
