package ru.ozon.app.android.travel.feature.oldwidgets.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.data.TravelModalPriceDetailInformationConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.header.TravelModalPriceDetailInformationHeaderViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.sections.TravelModalPriceDetailInformationViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.data.TravelPriceDetailInformationConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.TravelPriceDetailInformationViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky.TravelPriceDetailInformationNoUiViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data.TravelScrollPriceCalendarConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2Config;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2ViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelSorting.data.TravelSortingConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelSorting.presentation.TravelSortingViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/di/TravelOldWidgetsWidgetV2Module;", "", "Companion", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TravelOldWidgetsWidgetV2Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0083\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/di/TravelOldWidgetsWidgetV2Module$Companion;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "reportDocumentConfig", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentConfig;", "reportDocumentViewMapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentViewMapper;", "travelModalPriceDetailInformationConfig", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationConfig;", "travelModalPriceDetailInformationHeaderViewMapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/header/TravelModalPriceDetailInformationHeaderViewMapper;", "travelModalPriceDetailInformationViewMapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationViewMapper;", "scrollPriceCalendarV2Config", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2Config;", "scrollPriceCalendarV2ViewMapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2ViewMapper;", "travelPriceDetailInformationConfig", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationConfig;", "travelPriceDetailInformationViewMapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationViewMapper;", "travelPriceDetailInformationNoUiViewMapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationNoUiViewMapper;", "travelSortingConfig", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelSorting/data/TravelSortingConfig;", "travelSortingViewMapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelSorting/presentation/TravelSortingViewMapper;", "scrollPriceCalendarConfig", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarConfig;", "scrollPriceCalendarViewMapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarViewMapper;", "provideWidgets$old_widgets_prodGoogleAllVendorsRelease", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Widget2> provideWidgets$old_widgets_prodGoogleAllVendorsRelease(@NotNull ReportDocumentConfig reportDocumentConfig, @NotNull ReportDocumentViewMapper reportDocumentViewMapper, @NotNull TravelModalPriceDetailInformationConfig travelModalPriceDetailInformationConfig, @NotNull TravelModalPriceDetailInformationHeaderViewMapper travelModalPriceDetailInformationHeaderViewMapper, @NotNull TravelModalPriceDetailInformationViewMapper travelModalPriceDetailInformationViewMapper, @NotNull TravelScrollPriceCalendarV2Config scrollPriceCalendarV2Config, @NotNull TravelScrollPriceCalendarV2ViewMapper scrollPriceCalendarV2ViewMapper, @NotNull TravelPriceDetailInformationConfig travelPriceDetailInformationConfig, @NotNull TravelPriceDetailInformationViewMapper travelPriceDetailInformationViewMapper, @NotNull TravelPriceDetailInformationNoUiViewMapper travelPriceDetailInformationNoUiViewMapper, @NotNull TravelSortingConfig travelSortingConfig, @NotNull TravelSortingViewMapper travelSortingViewMapper, @NotNull TravelScrollPriceCalendarConfig scrollPriceCalendarConfig, @NotNull TravelScrollPriceCalendarViewMapper scrollPriceCalendarViewMapper) {
            Intrinsics.checkNotNullParameter(reportDocumentConfig, "reportDocumentConfig");
            Intrinsics.checkNotNullParameter(reportDocumentViewMapper, "reportDocumentViewMapper");
            Intrinsics.checkNotNullParameter(travelModalPriceDetailInformationConfig, "travelModalPriceDetailInformationConfig");
            Intrinsics.checkNotNullParameter(travelModalPriceDetailInformationHeaderViewMapper, "travelModalPriceDetailInformationHeaderViewMapper");
            Intrinsics.checkNotNullParameter(travelModalPriceDetailInformationViewMapper, "travelModalPriceDetailInformationViewMapper");
            Intrinsics.checkNotNullParameter(scrollPriceCalendarV2Config, "scrollPriceCalendarV2Config");
            Intrinsics.checkNotNullParameter(scrollPriceCalendarV2ViewMapper, "scrollPriceCalendarV2ViewMapper");
            Intrinsics.checkNotNullParameter(travelPriceDetailInformationConfig, "travelPriceDetailInformationConfig");
            Intrinsics.checkNotNullParameter(travelPriceDetailInformationViewMapper, "travelPriceDetailInformationViewMapper");
            Intrinsics.checkNotNullParameter(travelPriceDetailInformationNoUiViewMapper, "travelPriceDetailInformationNoUiViewMapper");
            Intrinsics.checkNotNullParameter(travelSortingConfig, "travelSortingConfig");
            Intrinsics.checkNotNullParameter(travelSortingViewMapper, "travelSortingViewMapper");
            Intrinsics.checkNotNullParameter(scrollPriceCalendarConfig, "scrollPriceCalendarConfig");
            Intrinsics.checkNotNullParameter(scrollPriceCalendarViewMapper, "scrollPriceCalendarViewMapper");
            Widget2[] elements = {new Widget2("travel", "reportDocument", reportDocumentConfig, new ViewMapper2[]{reportDocumentViewMapper}), new Widget2("travel", "travelModalPriceDetailInformation", travelModalPriceDetailInformationConfig, new ViewMapper2[]{travelModalPriceDetailInformationHeaderViewMapper, travelModalPriceDetailInformationViewMapper}), new Widget2("travel", "travelScrollPriceCalendar", scrollPriceCalendarV2Config, new ViewMapper2[]{scrollPriceCalendarV2ViewMapper}), new Widget2("travel", "travelPriceDetailInformation", travelPriceDetailInformationConfig, new ViewMapper2[]{travelPriceDetailInformationViewMapper, travelPriceDetailInformationNoUiViewMapper}), new Widget2("travel", "travelSorting", travelSortingConfig, new ViewMapper2[]{travelSortingViewMapper}), new Widget2("travel", "travelScrollPriceCalendar", scrollPriceCalendarConfig, new ViewMapper2[]{scrollPriceCalendarViewMapper})};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }
}
