package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data.ToursRoomsListV2DTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.ToursRoomsListV2RoomVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2RoomMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/ToursRoomsListV2RoomVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursRoomsListV2RoomMapper implements Function2<ToursRoomsListV2DTO, d, List<? extends ToursRoomsListV2RoomVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursRoomsListV2RoomVO> invoke(@NotNull ToursRoomsListV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ToursRoomsListV2DTO.Room> rooms = state.getRooms();
        ArrayList arrayList = new ArrayList(C7714v.z(rooms, 10));
        for (ToursRoomsListV2DTO.Room room : rooms) {
            OzonSpannableString text = room.getTitle().getText();
            PriceDTO.Component component = (PriceDTO.Component) C7714v.M(room.getPrice().getPrice());
            long hashCode = (((Object) text) + (component != null ? component.getText() : null)).hashCode();
            List<String> images = room.getImages();
            boolean z11 = !room.getImages().isEmpty();
            TextDTO title = room.getTitle();
            BadgeDTO detailBadge = room.getDetailBadge();
            List<CellDTO> details = room.getDetails();
            boolean z12 = !room.getDetails().isEmpty();
            PriceDTO price = room.getPrice();
            TextDTO priceDescription = room.getPriceDescription();
            AtomAction atomAction = null;
            ButtonV3DTO selectButton = room.getSelectButton();
            CommonControlSettings common = room.getSelectButton().getCommon();
            if (common != null) {
                atomAction = common.toAtomAction();
            }
            arrayList.add(new ToursRoomsListV2RoomVO(hashCode, images, z11, title, detailBadge, details, z12, price, priceDescription, selectButton, atomAction));
        }
        return arrayList;
    }
}
