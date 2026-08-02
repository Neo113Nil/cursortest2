package ru.ozon.app.android.storefront.widgets.navigationSliderV2.di;

import AL.a;
import Vg.c;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2Mapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2ScrollabilityResolver;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2OnBoardingViewModel;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001!R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010 \u001a\u00060\u001cj\u0002`\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/di/NavigationSliderV2WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2Mapper;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2Mapper;", "mapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollabilityResolver;", "getResolver", "()Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollabilityResolver;", "resolver", "LPc/a;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;", "getOnBoardingViewModelProvider", "()LPc/a;", "onBoardingViewModelProvider", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "getActionHandlersStore", "()LVg/c;", "actionHandlersStore", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NavigationSliderV2WidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/di/NavigationSliderV2WidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/di/NavigationSliderV2WidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavigationSliderV2WidgetComponent create$lambda$0(C7475g c7475g) {
            return new NavigationSliderV2WidgetComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<NavigationSliderV2WidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(NavigationSliderV2WidgetComponent.class), new a(storage, 0));
        }
    }

    @NotNull
    c getActionHandlersStore();

    @NotNull
    AdultHandler getAdultHandler();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    NavigationSliderV2Mapper getMapper();

    @NotNull
    Pc.a<NavigationSliderV2OnBoardingViewModel> getOnBoardingViewModelProvider();

    @NotNull
    NavigationSliderV2ScrollabilityResolver getResolver();

    @NotNull
    l getTokenizedAnalytics();
}
