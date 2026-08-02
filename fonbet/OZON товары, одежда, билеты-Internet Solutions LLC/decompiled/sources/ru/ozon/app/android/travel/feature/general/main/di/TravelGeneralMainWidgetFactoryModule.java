package ru.ozon.app.android.travel.feature.general.main.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.CalendarHeaderInformerWidgetKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.CellHorizontalListWidgetKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.ReferralMilesBannerWidgetKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.SearchFormV5WidgetKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/di/TravelGeneralMainWidgetFactoryModule;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets$main_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgets", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelGeneralMainWidgetFactoryModule {

    @NotNull
    public static final TravelGeneralMainWidgetFactoryModule INSTANCE = new TravelGeneralMainWidgetFactoryModule();

    private TravelGeneralMainWidgetFactoryModule() {
    }

    @NotNull
    public final Set<i> provideWidgets$main_prodGoogleAllVendorsRelease() {
        i[] elements = {ReferralMilesBannerWidgetKt.ReferralMilesBannerWidget(), CellHorizontalListWidgetKt.CellHorizontalListWidget(), SearchFormV5WidgetKt.SearchFormV5Widget(), CalendarHeaderInformerWidgetKt.CalendarHeaderInformerWidget()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
