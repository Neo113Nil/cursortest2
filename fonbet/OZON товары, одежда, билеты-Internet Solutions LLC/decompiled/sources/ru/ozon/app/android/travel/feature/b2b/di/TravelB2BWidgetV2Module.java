package ru.ozon.app.android.travel.feature.b2b.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
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

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/di/TravelB2BWidgetV2Module;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "travelCompanyDocumentsConfig", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsConfig;", "travelCompanyDocumentsViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/TravelCompanyDocumentsViewMapper;", "promoBannerB2BConfig", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BConfig;", "promoBannerB2BViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/PromoBannerB2BViewMapper;", "travelDocumentsToEmailConfig", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailConfig;", "travelDocumentsToEmailHeaderViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/header/TravelDocumentsToEmailHeaderViewMapper;", "travelDocumentsToEmailListViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListViewMapper;", "travelModalPersonalManagerConfig", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/data/TravelModalPersonalManagerConfig;", "travelModalPersonalManagerViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerViewMapper;", "accountBalanceBarConfig", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceBar/data/AccountBalanceBarConfig;", "accountBalanceBarViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceBar/presentation/AccountBalanceBarViewMapper;", "accountBalanceInfoConfig", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/data/AccountBalanceInfoConfig;", "accountBalanceInfoViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/presentation/AccountBalanceInfoViewMapper;", "b2bContactUsConfig", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsConfig;", "b2bContactUsViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsViewMapper;", "travelPersonalAccountReplenishmentConfig", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentConfig;", "travelPersonalAccountReplenishmentViewMapper", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewMapper;", "provideWidgets$b2b_prodGoogleAllVendorsRelease", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelB2BWidgetV2Module {

    @NotNull
    public static final TravelB2BWidgetV2Module INSTANCE = new TravelB2BWidgetV2Module();

    private TravelB2BWidgetV2Module() {
    }

    @NotNull
    public final Set<Widget2> provideWidgets$b2b_prodGoogleAllVendorsRelease(@NotNull TravelCompanyDocumentsConfig travelCompanyDocumentsConfig, @NotNull TravelCompanyDocumentsViewMapper travelCompanyDocumentsViewMapper, @NotNull PromoBannerB2BConfig promoBannerB2BConfig, @NotNull PromoBannerB2BViewMapper promoBannerB2BViewMapper, @NotNull TravelDocumentsToEmailConfig travelDocumentsToEmailConfig, @NotNull TravelDocumentsToEmailHeaderViewMapper travelDocumentsToEmailHeaderViewMapper, @NotNull TravelDocumentsToEmailListViewMapper travelDocumentsToEmailListViewMapper, @NotNull TravelModalPersonalManagerConfig travelModalPersonalManagerConfig, @NotNull TravelModalPersonalManagerViewMapper travelModalPersonalManagerViewMapper, @NotNull AccountBalanceBarConfig accountBalanceBarConfig, @NotNull AccountBalanceBarViewMapper accountBalanceBarViewMapper, @NotNull AccountBalanceInfoConfig accountBalanceInfoConfig, @NotNull AccountBalanceInfoViewMapper accountBalanceInfoViewMapper, @NotNull B2bContactUsConfig b2bContactUsConfig, @NotNull B2bContactUsViewMapper b2bContactUsViewMapper, @NotNull TravelPersonalAccountReplenishmentConfig travelPersonalAccountReplenishmentConfig, @NotNull TravelPersonalAccountReplenishmentViewMapper travelPersonalAccountReplenishmentViewMapper) {
        Intrinsics.checkNotNullParameter(travelCompanyDocumentsConfig, "travelCompanyDocumentsConfig");
        Intrinsics.checkNotNullParameter(travelCompanyDocumentsViewMapper, "travelCompanyDocumentsViewMapper");
        Intrinsics.checkNotNullParameter(promoBannerB2BConfig, "promoBannerB2BConfig");
        Intrinsics.checkNotNullParameter(promoBannerB2BViewMapper, "promoBannerB2BViewMapper");
        Intrinsics.checkNotNullParameter(travelDocumentsToEmailConfig, "travelDocumentsToEmailConfig");
        Intrinsics.checkNotNullParameter(travelDocumentsToEmailHeaderViewMapper, "travelDocumentsToEmailHeaderViewMapper");
        Intrinsics.checkNotNullParameter(travelDocumentsToEmailListViewMapper, "travelDocumentsToEmailListViewMapper");
        Intrinsics.checkNotNullParameter(travelModalPersonalManagerConfig, "travelModalPersonalManagerConfig");
        Intrinsics.checkNotNullParameter(travelModalPersonalManagerViewMapper, "travelModalPersonalManagerViewMapper");
        Intrinsics.checkNotNullParameter(accountBalanceBarConfig, "accountBalanceBarConfig");
        Intrinsics.checkNotNullParameter(accountBalanceBarViewMapper, "accountBalanceBarViewMapper");
        Intrinsics.checkNotNullParameter(accountBalanceInfoConfig, "accountBalanceInfoConfig");
        Intrinsics.checkNotNullParameter(accountBalanceInfoViewMapper, "accountBalanceInfoViewMapper");
        Intrinsics.checkNotNullParameter(b2bContactUsConfig, "b2bContactUsConfig");
        Intrinsics.checkNotNullParameter(b2bContactUsViewMapper, "b2bContactUsViewMapper");
        Intrinsics.checkNotNullParameter(travelPersonalAccountReplenishmentConfig, "travelPersonalAccountReplenishmentConfig");
        Intrinsics.checkNotNullParameter(travelPersonalAccountReplenishmentViewMapper, "travelPersonalAccountReplenishmentViewMapper");
        Widget2[] elements = {new Widget2("travel", "travelModalPersonalManager", travelModalPersonalManagerConfig, new ViewMapper2[]{travelModalPersonalManagerViewMapper}), new Widget2("travel", "promoBannerB2B", promoBannerB2BConfig, new ViewMapper2[]{promoBannerB2BViewMapper}), new Widget2("travel", "travelCompanyDocuments", travelCompanyDocumentsConfig, new ViewMapper2[]{travelCompanyDocumentsViewMapper}), new Widget2("travel", "travelDocumentsToEmail", travelDocumentsToEmailConfig, new ViewMapper2[]{travelDocumentsToEmailHeaderViewMapper, travelDocumentsToEmailListViewMapper}), new Widget2("travel", "accountBalanceBar", accountBalanceBarConfig, new ViewMapper2[]{accountBalanceBarViewMapper}), new Widget2("travel", "accountBalanceInfo", accountBalanceInfoConfig, new ViewMapper2[]{accountBalanceInfoViewMapper}), new Widget2("travel", "b2bContactUs", b2bContactUsConfig, new ViewMapper2[]{b2bContactUsViewMapper}), new Widget2("travel", "travelPersonalAccountReplenishment", travelPersonalAccountReplenishmentConfig, new ViewMapper2[]{travelPersonalAccountReplenishmentViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
