package ru.ozon.app.android.bank.widgets.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.widgets.aboutInstallment.core.AboutInstallmentConfig;
import ru.ozon.app.android.bank.widgets.aboutInstallment.core.AboutInstallmentViewMapper;
import ru.ozon.app.android.bank.widgets.adBanner.core.AdBannerConfig;
import ru.ozon.app.android.bank.widgets.adBanner.core.AdBannerViewMapper;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.core.BankAccountStatusConfig;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.core.BankAccountStatusViewMapper;
import ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetConfig;
import ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetViewMapper;
import ru.ozon.app.android.bank.widgets.installmentPayment.core.InstallmentPaymentConfig;
import ru.ozon.app.android.bank.widgets.installmentPayment.core.InstallmentPaymentViewMapper;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.core.InstallmentPaymentScheduleConfig;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.core.InstallmentPaymentScheduleViewMapper;
import ru.ozon.app.android.bank.widgets.openBankAccount.core.OpenBankAccountConfig;
import ru.ozon.app.android.bank.widgets.openBankAccount.core.OpenBankAccountViewMapper;
import ru.ozon.app.android.bank.widgets.premiumPoints.core.PremiumPointsConfig;
import ru.ozon.app.android.bank.widgets.premiumPoints.core.PremiumPointsViewMapper;
import ru.ozon.app.android.bank.widgets.productStarsTile.core.ProductStarsTileConfig;
import ru.ozon.app.android.bank.widgets.productStarsTile.core.ProductStarsTileViewMapper;
import ru.ozon.app.android.bank.widgets.starPoints.core.StarPointsConfig;
import ru.ozon.app.android.bank.widgets.starPoints.core.StarPointsViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J³\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/¨\u00060"}, d2 = {"Lru/ozon/app/android/bank/widgets/di/OzonBankWidgetModule;", "", "<init>", "()V", "provideOzonBankWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "openBankConfig", "Lru/ozon/app/android/bank/widgets/openBankAccount/core/OpenBankAccountConfig;", "openBankViewMapper", "Lru/ozon/app/android/bank/widgets/openBankAccount/core/OpenBankAccountViewMapper;", "bankAccountConfig", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/core/BankAccountStatusConfig;", "bankAccountViewMapper", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/core/BankAccountStatusViewMapper;", "premiumPointsConfig", "Lru/ozon/app/android/bank/widgets/premiumPoints/core/PremiumPointsConfig;", "premiumPointsViewMapper", "Lru/ozon/app/android/bank/widgets/premiumPoints/core/PremiumPointsViewMapper;", "starPointsConfig", "Lru/ozon/app/android/bank/widgets/starPoints/core/StarPointsConfig;", "starPointsViewMapper", "Lru/ozon/app/android/bank/widgets/starPoints/core/StarPointsViewMapper;", "installmentPaymentConfig", "Lru/ozon/app/android/bank/widgets/installmentPayment/core/InstallmentPaymentConfig;", "installmentPaymentViewMapper", "Lru/ozon/app/android/bank/widgets/installmentPayment/core/InstallmentPaymentViewMapper;", "aboutInstallmentConfig", "Lru/ozon/app/android/bank/widgets/aboutInstallment/core/AboutInstallmentConfig;", "aboutInstallmentViewMapper", "Lru/ozon/app/android/bank/widgets/aboutInstallment/core/AboutInstallmentViewMapper;", "productStarsTileViewMapper", "Lru/ozon/app/android/bank/widgets/productStarsTile/core/ProductStarsTileViewMapper;", "productStarsTileConfig", "Lru/ozon/app/android/bank/widgets/productStarsTile/core/ProductStarsTileConfig;", "installmentPaymentScheduleConfig", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/core/InstallmentPaymentScheduleConfig;", "installmentPaymentScheduleViewMapper", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/core/InstallmentPaymentScheduleViewMapper;", "cbottomWidgetConfig", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetConfig;", "cbottomWidgetViewMapper", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetViewMapper;", "adBannerConfig", "Lru/ozon/app/android/bank/widgets/adBanner/core/AdBannerConfig;", "adBannerViewMapper", "Lru/ozon/app/android/bank/widgets/adBanner/core/AdBannerViewMapper;", "provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonBankWidgetModule {

    @NotNull
    public static final OzonBankWidgetModule INSTANCE = new OzonBankWidgetModule();

    private OzonBankWidgetModule() {
    }

    @NotNull
    public final Set<Widget2> provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease(@NotNull OpenBankAccountConfig openBankConfig, @NotNull OpenBankAccountViewMapper openBankViewMapper, @NotNull BankAccountStatusConfig bankAccountConfig, @NotNull BankAccountStatusViewMapper bankAccountViewMapper, @NotNull PremiumPointsConfig premiumPointsConfig, @NotNull PremiumPointsViewMapper premiumPointsViewMapper, @NotNull StarPointsConfig starPointsConfig, @NotNull StarPointsViewMapper starPointsViewMapper, @NotNull InstallmentPaymentConfig installmentPaymentConfig, @NotNull InstallmentPaymentViewMapper installmentPaymentViewMapper, @NotNull AboutInstallmentConfig aboutInstallmentConfig, @NotNull AboutInstallmentViewMapper aboutInstallmentViewMapper, @NotNull ProductStarsTileViewMapper productStarsTileViewMapper, @NotNull ProductStarsTileConfig productStarsTileConfig, @NotNull InstallmentPaymentScheduleConfig installmentPaymentScheduleConfig, @NotNull InstallmentPaymentScheduleViewMapper installmentPaymentScheduleViewMapper, @NotNull CbottomWidgetConfig cbottomWidgetConfig, @NotNull CbottomWidgetViewMapper cbottomWidgetViewMapper, @NotNull AdBannerConfig adBannerConfig, @NotNull AdBannerViewMapper adBannerViewMapper) {
        Intrinsics.checkNotNullParameter(openBankConfig, "openBankConfig");
        Intrinsics.checkNotNullParameter(openBankViewMapper, "openBankViewMapper");
        Intrinsics.checkNotNullParameter(bankAccountConfig, "bankAccountConfig");
        Intrinsics.checkNotNullParameter(bankAccountViewMapper, "bankAccountViewMapper");
        Intrinsics.checkNotNullParameter(premiumPointsConfig, "premiumPointsConfig");
        Intrinsics.checkNotNullParameter(premiumPointsViewMapper, "premiumPointsViewMapper");
        Intrinsics.checkNotNullParameter(starPointsConfig, "starPointsConfig");
        Intrinsics.checkNotNullParameter(starPointsViewMapper, "starPointsViewMapper");
        Intrinsics.checkNotNullParameter(installmentPaymentConfig, "installmentPaymentConfig");
        Intrinsics.checkNotNullParameter(installmentPaymentViewMapper, "installmentPaymentViewMapper");
        Intrinsics.checkNotNullParameter(aboutInstallmentConfig, "aboutInstallmentConfig");
        Intrinsics.checkNotNullParameter(aboutInstallmentViewMapper, "aboutInstallmentViewMapper");
        Intrinsics.checkNotNullParameter(productStarsTileViewMapper, "productStarsTileViewMapper");
        Intrinsics.checkNotNullParameter(productStarsTileConfig, "productStarsTileConfig");
        Intrinsics.checkNotNullParameter(installmentPaymentScheduleConfig, "installmentPaymentScheduleConfig");
        Intrinsics.checkNotNullParameter(installmentPaymentScheduleViewMapper, "installmentPaymentScheduleViewMapper");
        Intrinsics.checkNotNullParameter(cbottomWidgetConfig, "cbottomWidgetConfig");
        Intrinsics.checkNotNullParameter(cbottomWidgetViewMapper, "cbottomWidgetViewMapper");
        Intrinsics.checkNotNullParameter(adBannerConfig, "adBannerConfig");
        Intrinsics.checkNotNullParameter(adBannerViewMapper, "adBannerViewMapper");
        Widget2[] elements = {new Widget2("ozonbank", "openBankAccount", openBankConfig, new ViewMapper2[]{openBankViewMapper}), new Widget2("ozonbank", "bankAccountStatus", bankAccountConfig, new ViewMapper2[]{bankAccountViewMapper}), new Widget2("ozonbank", "premiumPoints", premiumPointsConfig, new ViewMapper2[]{premiumPointsViewMapper}), new Widget2("ozonbank", "starPoints", starPointsConfig, new ViewMapper2[]{starPointsViewMapper}), new Widget2("shock", "installmentPaymentSchedule", installmentPaymentConfig, new ViewMapper2[]{installmentPaymentViewMapper}), new Widget2("shock", "aboutInstallment", aboutInstallmentConfig, new ViewMapper2[]{aboutInstallmentViewMapper}), new Widget2("ozonbank", "productStarsTile", productStarsTileConfig, new ViewMapper2[]{productStarsTileViewMapper}), new Widget2("shock", "installmentPaymentSchedule", installmentPaymentScheduleConfig, new ViewMapper2[]{installmentPaymentScheduleViewMapper}), new Widget2("ozonbank", "cbottomWidget", cbottomWidgetConfig, new ViewMapper2[]{cbottomWidgetViewMapper}), new Widget2("ozonbank", "adBanner", adBannerConfig, new ViewMapper2[]{adBannerViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
