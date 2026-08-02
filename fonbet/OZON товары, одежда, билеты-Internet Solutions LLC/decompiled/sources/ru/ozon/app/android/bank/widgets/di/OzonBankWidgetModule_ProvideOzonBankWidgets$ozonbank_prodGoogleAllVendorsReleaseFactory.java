package ru.ozon.app.android.bank.widgets.di;

import Jb.e;
import Jb.j;
import java.util.Set;
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
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OzonBankWidgetModule_ProvideOzonBankWidgets$ozonbank_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease(OpenBankAccountConfig openBankAccountConfig, OpenBankAccountViewMapper openBankAccountViewMapper, BankAccountStatusConfig bankAccountStatusConfig, BankAccountStatusViewMapper bankAccountStatusViewMapper, PremiumPointsConfig premiumPointsConfig, PremiumPointsViewMapper premiumPointsViewMapper, StarPointsConfig starPointsConfig, StarPointsViewMapper starPointsViewMapper, InstallmentPaymentConfig installmentPaymentConfig, InstallmentPaymentViewMapper installmentPaymentViewMapper, AboutInstallmentConfig aboutInstallmentConfig, AboutInstallmentViewMapper aboutInstallmentViewMapper, ProductStarsTileViewMapper productStarsTileViewMapper, ProductStarsTileConfig productStarsTileConfig, InstallmentPaymentScheduleConfig installmentPaymentScheduleConfig, InstallmentPaymentScheduleViewMapper installmentPaymentScheduleViewMapper, CbottomWidgetConfig cbottomWidgetConfig, CbottomWidgetViewMapper cbottomWidgetViewMapper, AdBannerConfig adBannerConfig, AdBannerViewMapper adBannerViewMapper) {
        Set<Widget2> provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease = OzonBankWidgetModule.INSTANCE.provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease(openBankAccountConfig, openBankAccountViewMapper, bankAccountStatusConfig, bankAccountStatusViewMapper, premiumPointsConfig, premiumPointsViewMapper, starPointsConfig, starPointsViewMapper, installmentPaymentConfig, installmentPaymentViewMapper, aboutInstallmentConfig, aboutInstallmentViewMapper, productStarsTileViewMapper, productStarsTileConfig, installmentPaymentScheduleConfig, installmentPaymentScheduleViewMapper, cbottomWidgetConfig, cbottomWidgetViewMapper, adBannerConfig, adBannerViewMapper);
        j.d(provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease);
        return provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease;
    }
}
