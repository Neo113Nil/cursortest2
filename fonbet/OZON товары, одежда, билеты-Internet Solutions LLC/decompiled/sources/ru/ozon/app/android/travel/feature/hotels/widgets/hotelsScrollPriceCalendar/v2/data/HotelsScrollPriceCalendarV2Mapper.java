package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.data.HotelsScrollPriceCalendarV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.HotelsScrollPriceCalendarV2VI;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0014\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0014\u0010\u0018J\u0013\u0010\u0014\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u0014\u0010\u001bJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;", "Landroid/content/Context;", "context", "", "defaultCornerRadius", "<init>", "(Landroid/content/Context;F)V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "toVI", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background$Stroke;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Stroke;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO$DatePriceItem$Background$Stroke;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Stroke;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "F", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarV2Mapper implements Function2<HotelsScrollPriceCalendarV2DTO, d, List<? extends HotelsScrollPriceCalendarV2VI>>, AsyncWidgetStateMapper<HotelsScrollPriceCalendarV2DTO, HotelsScrollPriceCalendarV2VI.State> {

    @NotNull
    private final Context context;
    private final float defaultCornerRadius;

    public HotelsScrollPriceCalendarV2Mapper(@NotNull Context context, float f7) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.defaultCornerRadius = f7;
    }

    private final HotelsScrollPriceCalendarV2VI.State extractState(HotelsScrollPriceCalendarV2DTO state) {
        List list;
        TextDTO title = state.getTitle();
        List<HotelsScrollPriceCalendarV2DTO.DatePriceItem> datePrices = state.getDatePrices();
        if (datePrices != null) {
            List<HotelsScrollPriceCalendarV2DTO.DatePriceItem> list2 = datePrices;
            list = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                list.add(toVI((HotelsScrollPriceCalendarV2DTO.DatePriceItem) it.next()));
            }
        } else {
            list = K.f71697a;
        }
        return new HotelsScrollPriceCalendarV2VI.State(title, list, state.getAutoScrollIndex(), state.isUpdateRequired(), state.getAsyncParameters(), state.getTrackingInfo());
    }

    private final HotelsScrollPriceCalendarV2VI.DatePriceItem toVI(HotelsScrollPriceCalendarV2DTO.DatePriceItem datePriceItem) {
        int hashCode = datePriceItem.getDateInterval().getText().hashCode();
        TextDTO weekdaysInterval = datePriceItem.getWeekdaysInterval();
        TextDTO dateInterval = datePriceItem.getDateInterval();
        TextDTO price = datePriceItem.getPrice();
        Boolean isLoading = datePriceItem.isLoading();
        boolean booleanValue = isLoading != null ? isLoading.booleanValue() : false;
        HotelsScrollPriceCalendarV2VI.Background vi2 = toVI(datePriceItem.getBackground());
        BadgeDTO badge = datePriceItem.getBadge();
        CommonControlSettings common = datePriceItem.getCommon();
        AtomAction atomAction = common != null ? common.toAtomAction() : null;
        CommonControlSettings common2 = datePriceItem.getCommon();
        return new HotelsScrollPriceCalendarV2VI.DatePriceItem(hashCode, weekdaysInterval, dateInterval, price, booleanValue, vi2, badge, atomAction, common2 != null ? common2.getTrackingInfo() : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsScrollPriceCalendarV2VI> invoke(@NotNull HotelsScrollPriceCalendarV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new HotelsScrollPriceCalendarV2VI(widgetInfo.d().hashCode(), extractState(state), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public HotelsScrollPriceCalendarV2VI.State mapAsyncState(@NotNull HotelsScrollPriceCalendarV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }

    private final HotelsScrollPriceCalendarV2VI.Background toVI(HotelsScrollPriceCalendarV2DTO.DatePriceItem.Background background) {
        String backgroundColor = background.getBackgroundColor();
        CornerRadius cornerRadius = background.getCornerRadius();
        float pxF = cornerRadius != null ? ResourceExtKt.toPxF(cornerRadius.getPx(), this.context) : this.defaultCornerRadius;
        HotelsScrollPriceCalendarV2DTO.DatePriceItem.Background.Stroke stroke = background.getStroke();
        return new HotelsScrollPriceCalendarV2VI.Background(backgroundColor, pxF, stroke != null ? toVI(stroke) : null);
    }

    private final HotelsScrollPriceCalendarV2VI.Stroke toVI(HotelsScrollPriceCalendarV2DTO.DatePriceItem.Background.Stroke stroke) {
        return new HotelsScrollPriceCalendarV2VI.Stroke(stroke.getColor(), ResourceExtKt.toPx(stroke.getWidth(), this.context));
    }
}
