package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.dynamic;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.format.a;
import org.joda.time.format.b;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data.TravelPriceCalendarV3DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data.TravelPriceCalendarV3Mapper;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicBehaviorWidgetViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3DTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicUpdateVO;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3Mapper;", "mapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3Mapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "asyncData", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "fetchWidgetWithNewDates", "(Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "Lorg/joda/time/format/b;", "kotlin.jvm.PlatformType", "formatter", "Lorg/joda/time/format/b;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceCalendarV3DynamicBehaviorWidgetViewModel extends AbstractAsyncWidgetViewModel<TravelPriceCalendarV3DTO, TravelPriceCalendarV3DynamicUpdateVO> {
    private final b formatter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicBehaviorWidgetViewModel$Companion;", "", "<init>", "()V", "KEY_START_DATE", "", "KEY_END_DATE", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceCalendarV3DynamicBehaviorWidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull TravelPriceCalendarV3Mapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        super(asyncWidgetRepository, mapper, dispatcherProvider, null, 8, null);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.formatter = a.b("yyyy-MM-dd");
    }

    public final void fetchWidgetWithNewDates(@NotNull String asyncData, LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        String f7 = startDate != null ? startDate.f(this.formatter) : null;
        if (f7 == null) {
            f7 = "";
        }
        Pair pair = new Pair("startDate", f7);
        String f11 = endDate != null ? endDate.f(this.formatter) : null;
        fetchWidget(TravelPriceCalendarV3DTO.class, asyncData, U.j(pair, new Pair("endDate", f11 != null ? f11 : "")));
    }
}
