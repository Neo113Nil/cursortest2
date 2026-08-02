package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.data;

import Lh.b;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.data.HotelsOrderRoomsDetailsDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.HotelsOrderRoomsDetailsVO;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001e\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010(\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J&\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "stateId", "", "roomIndex", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$RoomDetailsDTO;", "blockDTO", "mapRooms", "(Ljava/lang/String;ILru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$RoomDetailsDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO;", "blockIndex", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$CellBlockDTO;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;", "mapCellBlocks", "(Ljava/lang/String;IILru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$CellBlockDTO;)Ljava/util/List;", "subIndex", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;", "layoutModel", "produceVO", "(Ljava/lang/String;IIILru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins;", "margins", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "blockBackgroundColor", "", "isFirstCellInBlock", "isLastCellInBlock", "produceLayoutModel", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;ZZ)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;", "getEmptyLayoutModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO$CellListVO$LayoutModel;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsOrderRoomsDetailsMapper implements Function2<HotelsOrderRoomsDetailsDTO, d, List<? extends HotelsOrderRoomsDetailsVO>> {

    @NotNull
    private final Context context;

    public HotelsOrderRoomsDetailsMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel getEmptyLayoutModel() {
        return new HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel(0, 0, 0, 0, null);
    }

    private final List<HotelsOrderRoomsDetailsVO.CellListVO> mapCellBlocks(String stateId, int roomIndex, int blockIndex, HotelsOrderRoomsDetailsDTO.CellBlockDTO blockDTO) {
        HotelsOrderRoomsDetailsVO.CellListVO produceVO;
        HotelsOrderRoomsDetailsVO.CellListVO produceVO2;
        ArrayList arrayList = new ArrayList();
        HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel emptyLayoutModel = getEmptyLayoutModel();
        AtomDTO title = blockDTO.getTitle();
        if (title != null && (produceVO2 = produceVO(stateId, roomIndex, blockIndex, -1, title, emptyLayoutModel)) != null) {
            arrayList.add(produceVO2);
        }
        AtomDTO subtitle = blockDTO.getSubtitle();
        if (subtitle != null && (produceVO = produceVO(stateId, roomIndex, blockIndex, -2, subtitle, emptyLayoutModel)) != null) {
            arrayList.add(produceVO);
        }
        int P11 = C7714v.P(blockDTO.getCells());
        int i11 = 0;
        for (Object obj : blockDTO.getCells()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CellDTO m1408unboximpl = ((HotelsOrderRoomsDetailsDTO.DsCell) obj).m1408unboximpl();
            HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel produceLayoutModel = produceLayoutModel(blockDTO.getMargins(), blockDTO.getCornerRadius(), blockDTO.getBackgroundColor(), i11 == 0, i11 == P11);
            m1408unboximpl.setTagSupported(blockDTO.getEnableHtmlTags());
            DsCellExtensionsKt.disableAutoToggle(m1408unboximpl);
            Unit unit = Unit.f71690a;
            arrayList.add(produceVO(stateId, roomIndex, blockIndex, i11, m1408unboximpl, produceLayoutModel));
            i11 = i12;
        }
        return arrayList;
    }

    private final HotelsOrderRoomsDetailsVO mapRooms(String stateId, int roomIndex, HotelsOrderRoomsDetailsDTO.RoomDetailsDTO blockDTO) {
        long a11 = b.a(roomIndex, stateId, "-");
        ImageDTO image = blockDTO.getImage();
        TextDTO title = blockDTO.getTitle();
        BadgeDTO badge = blockDTO.getBadge();
        List<HotelsOrderRoomsDetailsDTO.CellBlockDTO> cellBlocks = blockDTO.getCellBlocks();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : cellBlocks) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            C7714v.p(mapCellBlocks(stateId, roomIndex, i11, (HotelsOrderRoomsDetailsDTO.CellBlockDTO) obj), arrayList);
            i11 = i12;
        }
        return new HotelsOrderRoomsDetailsVO(a11, image, title, badge, arrayList);
    }

    private final HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel produceLayoutModel(HotelsOrderRoomsDetailsDTO.ElementMargins margins, CornerRadius cornerRadius, String blockBackgroundColor, boolean isFirstCellInBlock, boolean isLastCellInBlock) {
        HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel.Background background;
        if (blockBackgroundColor != null) {
            background = new HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel.Background(blockBackgroundColor, isFirstCellInBlock ? ResourceExtKt.toPxF(cornerRadius.getPx(), this.context) : 0.0f, isLastCellInBlock ? ResourceExtKt.toPxF(cornerRadius.getPx(), this.context) : 0.0f);
        } else {
            background = null;
        }
        return new HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel(ResourceExtKt.toPx(margins.getLeading().getPx(), this.context), isFirstCellInBlock ? ResourceExtKt.toPx(margins.getTop().getPx(), this.context) : 0, ResourceExtKt.toPx(margins.getTrailing().getPx(), this.context), isLastCellInBlock ? ResourceExtKt.toPx(margins.getBottom().getPx(), this.context) : 0, background);
    }

    private final HotelsOrderRoomsDetailsVO.CellListVO produceVO(String stateId, int roomIndex, int blockIndex, int subIndex, AtomDTO atom, HotelsOrderRoomsDetailsVO.CellListVO.LayoutModel layoutModel) {
        return new HotelsOrderRoomsDetailsVO.CellListVO((stateId + "-" + roomIndex + "-" + blockIndex + "-" + subIndex).hashCode(), atom, layoutModel);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsOrderRoomsDetailsVO> invoke(@NotNull HotelsOrderRoomsDetailsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<HotelsOrderRoomsDetailsDTO.RoomDetailsDTO> roomsDetails = state.getRoomsDetails();
        ArrayList arrayList = new ArrayList(C7714v.z(roomsDetails, 10));
        int i11 = 0;
        for (Object obj : roomsDetails) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapRooms(widgetInfo.d(), i11, (HotelsOrderRoomsDetailsDTO.RoomDetailsDTO) obj));
            i11 = i12;
        }
        return arrayList;
    }
}
