package ru.ozon.app.android.travel.feature.general.booking.widgets.travelBookingImportantInformation.data;

import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelBookingImportantInformation.presentation.TravelBookingImportantInformationVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelBookingImportantInformation/data/TravelBookingImportantInformationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelBookingImportantInformation/data/TravelBookingImportantInformationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelBookingImportantInformation/presentation/TravelBookingImportantInformationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "item", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelBookingImportantInformation/data/TravelBookingImportantInformationDTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelBookingImportantInformationMapper implements Function2<TravelBookingImportantInformationDTO, d, List<? extends TravelBookingImportantInformationVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelBookingImportantInformationVO> invoke(@NotNull TravelBookingImportantInformationDTO item, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<TextAtom> items = item.getItems();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C7714v.U(items, spannableStringBuilder, "\n\n", null, null, new E() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.travelBookingImportantInformation.data.TravelBookingImportantInformationMapper$invoke$1
            @Override // kotlin.jvm.internal.E, kotlin.reflect.o
            public Object get(Object obj) {
                return ((TextAtom) obj).getText();
            }
        }, 60);
        return C7714v.a0(new TravelBookingImportantInformationVO(widgetInfo.d().hashCode(), spannableStringBuilder));
    }
}
