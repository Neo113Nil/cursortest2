package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader;

import Ak.C2436a;
import D3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001 B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO;", "placeholders", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "PlaceholderVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsRoomsListV5LoaderVO implements c {
    private final AtomAction action;
    private final long id;

    @NotNull
    private final List<PlaceholderVO> placeholders;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO;", "", "RoomBadge", "Tariff", "Room", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO$Room;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO$RoomBadge;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO$Tariff;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PlaceholderVO {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO$Room;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO$RoomBadge;", "roomBadgePlaceholders", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO$Tariff;", "tariffPlaceholders", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRoomBadgePlaceholders", "()Ljava/util/List;", "getTariffPlaceholders", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Room implements PlaceholderVO {

            @NotNull
            private final List<RoomBadge> roomBadgePlaceholders;

            @NotNull
            private final List<Tariff> tariffPlaceholders;

            public Room(@NotNull List<RoomBadge> roomBadgePlaceholders, @NotNull List<Tariff> tariffPlaceholders) {
                Intrinsics.checkNotNullParameter(roomBadgePlaceholders, "roomBadgePlaceholders");
                Intrinsics.checkNotNullParameter(tariffPlaceholders, "tariffPlaceholders");
                this.roomBadgePlaceholders = roomBadgePlaceholders;
                this.tariffPlaceholders = tariffPlaceholders;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Room)) {
                    return false;
                }
                Room room = (Room) other;
                return Intrinsics.d(this.roomBadgePlaceholders, room.roomBadgePlaceholders) && Intrinsics.d(this.tariffPlaceholders, room.tariffPlaceholders);
            }

            @NotNull
            public final List<RoomBadge> getRoomBadgePlaceholders() {
                return this.roomBadgePlaceholders;
            }

            @NotNull
            public final List<Tariff> getTariffPlaceholders() {
                return this.tariffPlaceholders;
            }

            public int hashCode() {
                return this.tariffPlaceholders.hashCode() + (this.roomBadgePlaceholders.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2436a.b("Room(roomBadgePlaceholders=", this.roomBadgePlaceholders, ", tariffPlaceholders=", ")", this.tariffPlaceholders);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO$RoomBadge;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RoomBadge implements PlaceholderVO {

            @NotNull
            public static final RoomBadge INSTANCE = new RoomBadge();

            private RoomBadge() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RoomBadge);
            }

            public int hashCode() {
                return -1896538302;
            }

            @NotNull
            public String toString() {
                return "RoomBadge";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO$Tariff;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tariff implements PlaceholderVO {

            @NotNull
            public static final Tariff INSTANCE = new Tariff();

            private Tariff() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Tariff);
            }

            public int hashCode() {
                return -1429209174;
            }

            @NotNull
            public String toString() {
                return "Tariff";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsRoomsListV5LoaderVO(long j11, AtomAction atomAction, @NotNull List<? extends PlaceholderVO> placeholders) {
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        this.id = j11;
        this.action = atomAction;
        this.placeholders = placeholders;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsRoomsListV5LoaderVO)) {
            return false;
        }
        HotelsRoomsListV5LoaderVO hotelsRoomsListV5LoaderVO = (HotelsRoomsListV5LoaderVO) other;
        return this.id == hotelsRoomsListV5LoaderVO.id && Intrinsics.d(this.action, hotelsRoomsListV5LoaderVO.action) && Intrinsics.d(this.placeholders, hotelsRoomsListV5LoaderVO.placeholders);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PlaceholderVO> getPlaceholders() {
        return this.placeholders;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        AtomAction atomAction = this.action;
        return this.placeholders.hashCode() + ((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AtomAction atomAction = this.action;
        List<PlaceholderVO> list = this.placeholders;
        StringBuilder sb2 = new StringBuilder("HotelsRoomsListV5LoaderVO(id=");
        sb2.append(j11);
        sb2.append(", action=");
        sb2.append(atomAction);
        return h.c(sb2, ", placeholders=", list, ")");
    }
}
