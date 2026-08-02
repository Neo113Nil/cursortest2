package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data;

import WZ.t;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.prefetch.HotelsRoomsListImagePrefetchKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.HotelsRoomsListV5RoomVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.ImageVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.ServiceVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffBadge;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0011\u0010\u001aJ\u0013\u0010\u0011\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u0011\u0010\u001dJ\u001b\u0010!\u001a\u00020 *\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b%\u0010&J+\u0010\u0011\u001a\u00020\u0019*\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5RoomsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;", "hotelsRoomsListImagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Room;", "", "stateId", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Room;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;", ImagesContract.URL, "mapImage", "(Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariffs;", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariffs;J)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Service;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ServiceVO;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Service;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ServiceVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariff;", "id", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffBadge;", "mapBadge", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariff;J)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffBadge;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;Ll20/d;)Ljava/util/List;", "", "isCompactWidth", "isSpecialBadgeHeight", "toVO$hotels_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariff;ZZJ)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5RoomsMapper implements Function2<HotelsRoomsListV5DTO, d, List<? extends HotelsRoomsListV5RoomVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<ImageVO> hotelsRoomsListImagePrefetcher;

    public HotelsRoomsListV5RoomsMapper(@NotNull Context context, @NotNull ImagePrefetcher<ImageVO> hotelsRoomsListImagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hotelsRoomsListImagePrefetcher, "hotelsRoomsListImagePrefetcher");
        this.context = context;
        this.hotelsRoomsListImagePrefetcher = hotelsRoomsListImagePrefetcher;
    }

    private final TariffBadge mapBadge(HotelsRoomsListV5DTO.Tariff tariff, long j11) {
        return tariff.getMilesBadge() != null ? new TariffBadge.MilesBadge(tariff.getMilesBadge()) : tariff.getStarsBadge() != null ? new TariffBadge.StarsBadge(MapperExtKt.toVI(tariff.getStarsBadge(), j11)) : TariffBadge.None.INSTANCE;
    }

    private final ImageVO mapImage(String url) {
        return new ImageVO(url.hashCode(), url);
    }

    private final HotelsRoomsListV5RoomVO toVO(HotelsRoomsListV5DTO.Room room, String str) {
        List<TariffVO> list;
        long j11;
        t tVar;
        CommonControlSettings common;
        AtomActionDTO action;
        long hashCode = (((Object) room.getName().getText()) + str).hashCode();
        List<String> images = room.getImages();
        ArrayList arrayList = new ArrayList(C7714v.z(images, 10));
        Iterator<T> it = images.iterator();
        while (it.hasNext()) {
            arrayList.add(mapImage((String) it.next()));
        }
        List<BadgeDTO> tags = room.getTags();
        boolean z11 = !room.getTags().isEmpty();
        TextDTO name = room.getName();
        BadgeDTO detailBadge = room.getDetailBadge();
        List<TextDTO> accommodation = room.getAccommodation();
        boolean z12 = !room.getAccommodation().isEmpty();
        List<BadgeDTO> roomBadges = room.getRoomBadges();
        boolean z13 = !room.getRoomBadges().isEmpty();
        HotelsRoomsListV5DTO.Tariffs tariffs = room.getTariffs();
        if (tariffs == null || (list = toVO(tariffs, hashCode)) == null) {
            list = K.f71697a;
        }
        List<TariffVO> list2 = list;
        ButtonV3DTO button = room.getButton();
        boolean d11 = Intrinsics.d(room.isLoading(), Boolean.TRUE);
        Map<String, TokenizedTrackingInfo> galleryTrackingInfo = room.getGalleryTrackingInfo();
        AtomAction atomAction = null;
        atomAction = null;
        atomAction = null;
        if (galleryTrackingInfo != null) {
            j11 = hashCode;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(galleryTrackingInfo, Long.valueOf(hashCode), null, 2, null);
        } else {
            j11 = hashCode;
            tVar = null;
        }
        BadgeDTO detailBadge2 = room.getDetailBadge();
        if (detailBadge2 != null && (common = detailBadge2.getCommon()) != null && (action = common.getAction()) != null) {
            CommonControlSettings common2 = room.getDetailBadge().getCommon();
            atomAction = AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
        }
        return new HotelsRoomsListV5RoomVO(j11, arrayList, tags, z11, name, detailBadge, accommodation, z12, roomBadges, z13, list2, button, d11, tVar, atomAction, room.getRoomsLeftBadge());
    }

    @NotNull
    public final TariffVO toVO$hotels_prodGoogleAllVendorsRelease(@NotNull HotelsRoomsListV5DTO.Tariff tariff, boolean z11, boolean z12, long j11) {
        Intrinsics.checkNotNullParameter(tariff, "<this>");
        int hashCode = tariff.getPrice().hashCode();
        List<HotelsRoomsListV5DTO.Service> services = tariff.getServices();
        ArrayList arrayList = new ArrayList(C7714v.z(services, 10));
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((HotelsRoomsListV5DTO.Service) it.next()));
        }
        BadgeDTO specialTariffBadge = tariff.getSpecialTariffBadge();
        BadgeDTO serviceBadge = tariff.getServiceBadge();
        TariffBadge mapBadge = mapBadge(tariff, j11);
        PriceDTO price = tariff.getPrice();
        Object actionButton = tariff.getActionButton();
        String borderColor = tariff.getBorderColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = tariff.getTrackingInfo();
        return new TariffVO(hashCode, arrayList, specialTariffBadge, serviceBadge, mapBadge, price, actionButton, borderColor, z11, z12, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, tariff.getRoomsAvailable());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsRoomsListV5RoomVO> invoke(@NotNull HotelsRoomsListV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<HotelsRoomsListV5DTO.Room> rooms = state.getRooms();
        ArrayList arrayList = new ArrayList(C7714v.z(rooms, 10));
        Iterator<T> it = rooms.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((HotelsRoomsListV5DTO.Room) it.next(), widgetInfo.d()));
        }
        HotelsRoomsListImagePrefetchKt.prefetchFirstRoomImages(this.context, this.hotelsRoomsListImagePrefetcher, arrayList);
        return arrayList;
    }

    private final List<TariffVO> toVO(HotelsRoomsListV5DTO.Tariffs tariffs, long j11) {
        boolean z11;
        HotelsRoomsListV5RoomsMapper hotelsRoomsListV5RoomsMapper;
        long j12;
        boolean z12;
        List<HotelsRoomsListV5DTO.Tariff> tariffs2 = tariffs.getTariffs();
        ArrayList arrayList = new ArrayList(C7714v.z(tariffs2, 10));
        for (HotelsRoomsListV5DTO.Tariff tariff : tariffs2) {
            boolean z13 = true;
            if (tariffs.getTariffs().size() > 1) {
                z11 = true;
            } else {
                z11 = true;
                z13 = false;
            }
            List<HotelsRoomsListV5DTO.Tariff> tariffs3 = tariffs.getTariffs();
            if (!(tariffs3 instanceof Collection) || !tariffs3.isEmpty()) {
                Iterator<T> it = tariffs3.iterator();
                while (it.hasNext()) {
                    if (((HotelsRoomsListV5DTO.Tariff) it.next()).getSpecialTariffBadge() != null) {
                        hotelsRoomsListV5RoomsMapper = this;
                        j12 = j11;
                        z12 = z11;
                        break;
                    }
                }
            }
            j12 = j11;
            z12 = false;
            hotelsRoomsListV5RoomsMapper = this;
            arrayList.add(hotelsRoomsListV5RoomsMapper.toVO$hotels_prodGoogleAllVendorsRelease(tariff, z13, z12, j12));
            j11 = j12;
        }
        return arrayList;
    }

    private final ServiceVO toVO(HotelsRoomsListV5DTO.Service service) {
        return new ServiceVO(service.getText().hashCode(), service.getIcon(), service.getText(), service.getInfoButton(), service.getSaleBadge());
    }
}
