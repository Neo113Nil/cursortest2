package ru.ozon.app.android.travel.feature.b2b.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceBar.data.AccountBalanceBarConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceBar.presentation.AccountBalanceBarViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.data.AccountBalanceInfoConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.AccountBalanceInfoViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.data.B2bContactUsConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.presentation.B2bContactUsViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.data.PromoBannerB2BConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.PromoBannerB2BViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data.TravelCompanyDocumentsConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.presentation.TravelCompanyDocumentsViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data.TravelDocumentsToEmailConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.header.TravelDocumentsToEmailHeaderViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.TravelDocumentsToEmailListViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.data.TravelModalPersonalManagerConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.TravelModalPersonalManagerViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewMapper;

/* loaded from: classes7.dex */
public final class TravelB2BWidgetV2Module_ProvideWidgets$b2b_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$b2b_prodGoogleAllVendorsRelease(TravelCompanyDocumentsConfig travelCompanyDocumentsConfig, TravelCompanyDocumentsViewMapper travelCompanyDocumentsViewMapper, PromoBannerB2BConfig promoBannerB2BConfig, PromoBannerB2BViewMapper promoBannerB2BViewMapper, TravelDocumentsToEmailConfig travelDocumentsToEmailConfig, TravelDocumentsToEmailHeaderViewMapper travelDocumentsToEmailHeaderViewMapper, TravelDocumentsToEmailListViewMapper travelDocumentsToEmailListViewMapper, TravelModalPersonalManagerConfig travelModalPersonalManagerConfig, TravelModalPersonalManagerViewMapper travelModalPersonalManagerViewMapper, AccountBalanceBarConfig accountBalanceBarConfig, AccountBalanceBarViewMapper accountBalanceBarViewMapper, AccountBalanceInfoConfig accountBalanceInfoConfig, AccountBalanceInfoViewMapper accountBalanceInfoViewMapper, B2bContactUsConfig b2bContactUsConfig, B2bContactUsViewMapper b2bContactUsViewMapper, TravelPersonalAccountReplenishmentConfig travelPersonalAccountReplenishmentConfig, TravelPersonalAccountReplenishmentViewMapper travelPersonalAccountReplenishmentViewMapper) {
        Set<Widget2> provideWidgets$b2b_prodGoogleAllVendorsRelease = TravelB2BWidgetV2Module.INSTANCE.provideWidgets$b2b_prodGoogleAllVendorsRelease(travelCompanyDocumentsConfig, travelCompanyDocumentsViewMapper, promoBannerB2BConfig, promoBannerB2BViewMapper, travelDocumentsToEmailConfig, travelDocumentsToEmailHeaderViewMapper, travelDocumentsToEmailListViewMapper, travelModalPersonalManagerConfig, travelModalPersonalManagerViewMapper, accountBalanceBarConfig, accountBalanceBarViewMapper, accountBalanceInfoConfig, accountBalanceInfoViewMapper, b2bContactUsConfig, b2bContactUsViewMapper, travelPersonalAccountReplenishmentConfig, travelPersonalAccountReplenishmentViewMapper);
        j.d(provideWidgets$b2b_prodGoogleAllVendorsRelease);
        return provideWidgets$b2b_prodGoogleAllVendorsRelease;
    }
}
