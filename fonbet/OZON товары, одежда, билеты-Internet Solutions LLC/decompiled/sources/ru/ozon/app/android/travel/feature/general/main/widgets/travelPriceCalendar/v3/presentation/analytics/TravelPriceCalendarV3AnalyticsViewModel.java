package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.analytics;

import UZ.a;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.l;
import WZ.t;
import androidx.lifecycle.w0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.calendar.view.vo.DateConfigVO;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.analytics.TravelPriceCalendarV3AnalyticsViewModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel;", "Landroidx/lifecycle/w0;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(LWZ/l;)V", "", "formattedDate", "Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;", "dateConfig", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "getCustomParamsModifier", "(Ljava/lang/String;Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;)LWZ/e;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "trackClick", "(LWZ/t;Ljava/lang/String;Lru/ozon/app/android/travel/calendar/view/vo/DateConfigVO;)V", "LWZ/l;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceCalendarV3AnalyticsViewModel extends w0 {

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel$Companion;", "", "<init>", "()V", "TITLE_KEY", "", "FINAL_PRICE_KEY", "STATUS_KEY", "EMPTY_STRING", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TravelPriceCalendarV3AnalyticsViewModel(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final e getCustomParamsModifier(final String formattedDate, final DateConfigVO dateConfig) {
        return new e() { // from class: KQ.a
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g customParamsModifier$lambda$1;
                customParamsModifier$lambda$1 = TravelPriceCalendarV3AnalyticsViewModel.getCustomParamsModifier$lambda$1(dateConfig, formattedDate, (d) aVar, gVar);
                return customParamsModifier$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g getCustomParamsModifier$lambda$1(DateConfigVO dateConfigVO, String str, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        Indicator indicator = dateConfigVO != null ? dateConfigVO.getIndicator() : null;
        String categoryName = indicator instanceof Indicator.ColorIndicator ? ((Indicator.ColorIndicator) indicator).getCategoryName() : ((indicator instanceof Indicator.PriceIndicator) && ((Indicator.PriceIndicator) indicator).getIsMin()) ? Indicator.ColorIndicator.LOW.getCategoryName() : "";
        LinkedHashMap a11 = h.a(params.b());
        a11.put(SelectionItemFormDTO.TITLE_FIELD_NAME, str);
        Indicator indicator2 = dateConfigVO != null ? dateConfigVO.getIndicator() : null;
        Indicator.PriceIndicator priceIndicator = indicator2 instanceof Indicator.PriceIndicator ? (Indicator.PriceIndicator) indicator2 : null;
        a11.put("finalPrice", Float.valueOf(priceIndicator != null ? priceIndicator.getUnformattedPriceValue() : 0.0f));
        a11.put("status", categoryName);
        return g.a(params, a11, null, 2);
    }

    public final void trackClick(@NotNull t tokenizedEvent, @NotNull String formattedDate, DateConfigVO dateConfig) {
        Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        TokenizedAnalyticsExtensionsKt.processClickEvents(this.tokenizedAnalytics, tokenizedEvent, getCustomParamsModifier(formattedDate, dateConfig));
    }
}
