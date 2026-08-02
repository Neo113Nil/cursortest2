package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.data;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.format.a;
import org.joda.time.format.b;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation.CalendarVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.vo.TripMode;
import ru.ozon.app.android.travel.molecules.dto.tripKind.TripKind;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/data/CalendarMapper;", "Lkotlin/Function2;", "", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "tripKind", "Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "mapTripKind", "(Ljava/lang/String;)Lru/ozon/app/android/travel/molecules/dto/tripKind/TripKind;", "tripMode", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "mapTripMode", "(Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/view/vo/TripMode;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lkotlin/Unit;Ll20/d;)Ljava/util/List;", "Lorg/joda/time/format/b;", "kotlin.jvm.PlatformType", "dateFormatter", "Lorg/joda/time/format/b;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarMapper implements Function2<Unit, d, List<? extends CalendarVO>> {
    private final b dateFormatter = a.b("yyyy-MM-dd");

    private final TripKind mapTripKind(String tripKind) {
        Object obj;
        if (tripKind == null) {
            return TripKind.AVIA;
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = tripKind.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        Iterator<E> it = TripKind.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(upperCase, ((TripKind) obj).name())) {
                break;
            }
        }
        TripKind tripKind2 = (TripKind) obj;
        return tripKind2 == null ? TripKind.AVIA : tripKind2;
    }

    private final TripMode mapTripMode(String tripMode) {
        Object obj;
        if (tripMode == null) {
            return TripMode.THERE;
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = tripMode.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        Iterator<E> it = TripMode.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(upperCase, h.X(((TripMode) obj).name(), "_", "", false))) {
                break;
            }
        }
        TripMode tripMode2 = (TripMode) obj;
        return tripMode2 == null ? TripMode.THERE : tripMode2;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CalendarVO> invoke(@NotNull Unit state, @NotNull d widgetInfo) {
        String c11;
        Uri parse;
        LocalDate localDate;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        T00.a b11 = widgetInfo.b();
        if (b11 == null || (c11 = b11.c()) == null || (parse = Uri.parse(c11)) == null) {
            return K.f71697a;
        }
        String queryParameter = parse.getQueryParameter("tripKind");
        String queryParameter2 = parse.getQueryParameter("tripMode");
        String queryParameter3 = parse.getQueryParameter("id");
        LocalDate localDate2 = null;
        String str = (queryParameter3 == null || h.K(queryParameter3)) ? null : queryParameter3;
        String queryParameter4 = parse.getQueryParameter("thereDate");
        if (queryParameter4 == null || h.K(queryParameter4)) {
            queryParameter4 = null;
        }
        String queryParameter5 = parse.getQueryParameter("backDate");
        if (queryParameter5 == null || h.K(queryParameter5)) {
            queryParameter5 = null;
        }
        String queryParameter6 = parse.getQueryParameter("action");
        String str2 = (queryParameter6 == null || h.K(queryParameter6)) ? null : queryParameter6;
        String queryParameter7 = parse.getQueryParameter("countDayRound");
        if (queryParameter7 == null || h.K(queryParameter7)) {
            queryParameter7 = null;
        }
        boolean booleanQueryParameter = parse.getBooleanQueryParameter("countDayRoundChecked", false);
        boolean booleanQueryParameter2 = parse.getBooleanQueryParameter("railwayRoundTripEnabled", false);
        long hashCode = widgetInfo.d().hashCode();
        TripKind mapTripKind = mapTripKind(queryParameter);
        TripMode mapTripMode = mapTripMode(queryParameter2);
        if (queryParameter4 != null) {
            b bVar = this.dateFormatter;
            int i11 = LocalDate.f79031c;
            localDate = bVar.e(queryParameter4);
        } else {
            localDate = null;
        }
        if (queryParameter5 != null) {
            b bVar2 = this.dateFormatter;
            int i12 = LocalDate.f79031c;
            localDate2 = bVar2.e(queryParameter5);
        }
        LocalDate localDate3 = localDate2;
        if (queryParameter7 == null) {
            queryParameter7 = "3";
        }
        return C7714v.a0(new CalendarVO(hashCode, mapTripKind, mapTripMode, str, localDate, localDate3, str2, queryParameter7, booleanQueryParameter, booleanQueryParameter2));
    }
}
