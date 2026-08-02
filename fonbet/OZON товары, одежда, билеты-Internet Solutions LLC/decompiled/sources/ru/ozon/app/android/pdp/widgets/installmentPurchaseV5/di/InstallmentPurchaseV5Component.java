package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di;

import BV.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentV5ProductsListMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentV5SingleProductMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentV5TitleMapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/di/InstallmentPurchaseV5Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5TitleMapper;", "getTitleMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5TitleMapper;", "titleMapper", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5SingleProductMapper;", "getSingleProductMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5SingleProductMapper;", "singleProductMapper", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5ProductsListMapper;", "getProductsListMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/core/InstallmentV5ProductsListMapper;", "productsListMapper", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "getOnboardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onboardingViewModel", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InstallmentPurchaseV5Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/di/InstallmentPurchaseV5Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/di/InstallmentPurchaseV5Component;", "create", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InstallmentPurchaseV5Component create$lambda$0(C7475g c7475g) {
            return new InstallmentPurchaseV5Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<InstallmentPurchaseV5Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(InstallmentPurchaseV5Component.class), new a(storage, 7));
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    BaseOnBoardingViewModel.Default getOnboardingViewModel();

    @NotNull
    InstallmentV5ProductsListMapper getProductsListMapper();

    @NotNull
    InstallmentV5SingleProductMapper getSingleProductMapper();

    @NotNull
    InstallmentV5TitleMapper getTitleMapper();
}
