package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.data.HotelsRoomsDetailsFullDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.HotelsRoomsDetailsFullVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.InfoCardVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/HotelsRoomsDetailsFullVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "", "stateId", "mapRoomsFullDetails", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/HotelsRoomsDetailsFullVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullDTO$InfoCardDTO;", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/InfoCardVO;", "mapRoomDetailsInfoCard", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullDTO$InfoCardDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/InfoCardVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsDetailsFullMapper implements Function2<HotelsRoomsDetailsFullDTO, d, List<? extends HotelsRoomsDetailsFullVO>> {
    private final InfoCardVO mapRoomDetailsInfoCard(HotelsRoomsDetailsFullDTO.InfoCardDTO item) {
        OzonSpannableString text = item.getInfoKey().getText();
        OzonSpannableString text2 = item.getInfoValue().getText();
        return new InfoCardVO((((Object) text) + " " + ((Object) text2)).hashCode(), item.getIcon(), item.getInfoKey(), item.getInfoValue());
    }

    private final HotelsRoomsDetailsFullVO mapRoomsFullDetails(HotelsRoomsDetailsFullDTO dto, String stateId) {
        ArrayList arrayList;
        long hashCode = stateId.hashCode();
        TextAtom title = dto.getTitle();
        TextAtom subtitle = dto.getSubtitle();
        List<String> images = dto.getImages();
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> services = dto.getServices();
        List<HotelsRoomsDetailsFullDTO.InfoCardDTO> infoCards = dto.getInfoCards();
        if (infoCards != null) {
            List<HotelsRoomsDetailsFullDTO.InfoCardDTO> list = infoCards;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapRoomDetailsInfoCard((HotelsRoomsDetailsFullDTO.InfoCardDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new HotelsRoomsDetailsFullVO(hashCode, title, subtitle, images, arrayList, services, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsRoomsDetailsFullVO> invoke(@NotNull HotelsRoomsDetailsFullDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapRoomsFullDetails(state, widgetInfo.d()));
    }
}
