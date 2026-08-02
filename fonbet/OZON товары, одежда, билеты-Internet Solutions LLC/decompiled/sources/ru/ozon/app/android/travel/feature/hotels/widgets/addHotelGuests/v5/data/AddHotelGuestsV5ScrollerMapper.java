package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data;

import Kk.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5DTO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.utils.scroller.ScrollerVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5ScrollerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/utils/scroller/ScrollerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "", "getIndexOfRoomWithErrorField", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;)Ljava/lang/Integer;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5ScrollerMapper implements Function2<AddHotelGuestsV5DTO, d, List<? extends ScrollerVO>> {
    private final Integer getIndexOfRoomWithErrorField(AddHotelGuestsV5DTO state) {
        Iterator<AddHotelGuestsV5DTO.RoomDTO> it = state.getRooms().iterator();
        int i11 = 0;
        loop0: while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            List<AddHotelGuestsV5DTO.GuestFormDTO> forms = it.next().getForms();
            if (!(forms instanceof Collection) || !forms.isEmpty()) {
                Iterator<T> it2 = forms.iterator();
                while (it2.hasNext()) {
                    List<CommonInputDTO> inputs = ((AddHotelGuestsV5DTO.GuestFormDTO) it2.next()).getInputs();
                    if (!(inputs instanceof Collection) || !inputs.isEmpty()) {
                        Iterator<T> it3 = inputs.iterator();
                        while (it3.hasNext()) {
                            if (((CommonInputDTO) it3.next()).getScrollOnMount()) {
                                break loop0;
                            }
                        }
                    }
                }
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ScrollerVO> invoke(@NotNull AddHotelGuestsV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new ScrollerVO(c.a(widgetInfo.d(), "-scroller"), (getIndexOfRoomWithErrorField(state) + "-" + widgetInfo.d()).hashCode()));
    }
}
