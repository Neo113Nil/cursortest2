package ru.ozon.app.android.pdp.widgets.installmentPurchase.di;

import BD.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.periods.InstallmentPeriodsMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase.InstallmentPurchaseMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.title.InstallmentTitleMapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0001 R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/di/InstallmentPurchaseWidgetsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseMapper;", "getInstallmentPurchaseMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseMapper;", "installmentPurchaseMapper", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/periods/InstallmentPeriodsMapper;", "getInstallmentPeriodsMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/periods/InstallmentPeriodsMapper;", "installmentPeriodsMapper", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/title/InstallmentTitleMapper;", "getInstallmentTitleMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/title/InstallmentTitleMapper;", "installmentTitleMapper", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "getOnboardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onboardingViewModel", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "getSaleBlockViewModel", "()Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "saleBlockViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InstallmentPurchaseWidgetsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/di/InstallmentPurchaseWidgetsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/di/InstallmentPurchaseWidgetsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InstallmentPurchaseWidgetsComponent getInstance$lambda$0(C7475g c7475g) {
            return new InstallmentPurchaseWidgetsComponent$Companion$getInstance$1$1(c7475g);
        }

        @NotNull
        public final C7473e<InstallmentPurchaseWidgetsComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(InstallmentPurchaseWidgetsComponent.class), new a(storage, 14));
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    InstallmentPeriodsMapper getInstallmentPeriodsMapper();

    @NotNull
    InstallmentPurchaseMapper getInstallmentPurchaseMapper();

    @NotNull
    InstallmentTitleMapper getInstallmentTitleMapper();

    @NotNull
    BaseOnBoardingViewModel.Default getOnboardingViewModel();

    @NotNull
    SaleBlockViewModel getSaleBlockViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
