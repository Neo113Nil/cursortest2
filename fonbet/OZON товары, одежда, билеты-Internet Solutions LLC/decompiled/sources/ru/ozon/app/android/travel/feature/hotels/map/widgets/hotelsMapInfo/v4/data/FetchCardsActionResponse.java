package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchCardsActionResponse;", "", "cards", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/CardInfoDTO;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getCards$annotations", "()V", "getCards", "()Ljava/util/List;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FetchCardsActionResponse {

    @NotNull
    private final List<CardInfoDTO> cards;
    private final NotificationDTO notification;

    public FetchCardsActionResponse(@NotNull List<CardInfoDTO> cards, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.cards = cards;
        this.notification = notificationDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchCardsActionResponse copy$default(FetchCardsActionResponse fetchCardsActionResponse, List list, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = fetchCardsActionResponse.cards;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = fetchCardsActionResponse.notification;
        }
        return fetchCardsActionResponse.copy(list, notificationDTO);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getCards$annotations() {
    }

    @NotNull
    public final List<CardInfoDTO> component1() {
        return this.cards;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final FetchCardsActionResponse copy(@NotNull List<CardInfoDTO> cards, NotificationDTO notification) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        return new FetchCardsActionResponse(cards, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchCardsActionResponse)) {
            return false;
        }
        FetchCardsActionResponse fetchCardsActionResponse = (FetchCardsActionResponse) other;
        return Intrinsics.d(this.cards, fetchCardsActionResponse.cards) && Intrinsics.d(this.notification, fetchCardsActionResponse.notification);
    }

    @NotNull
    public final List<CardInfoDTO> getCards() {
        return this.cards;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode = this.cards.hashCode() * 31;
        NotificationDTO notificationDTO = this.notification;
        return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "FetchCardsActionResponse(cards=" + this.cards + ", notification=" + this.notification + ")";
    }

    public FetchCardsActionResponse(List list, NotificationDTO notificationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, notificationDTO);
    }
}
