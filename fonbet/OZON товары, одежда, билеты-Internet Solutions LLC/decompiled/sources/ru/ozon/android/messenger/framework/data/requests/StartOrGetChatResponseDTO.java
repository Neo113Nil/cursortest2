package ru.ozon.android.messenger.framework.data.requests;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/StartOrGetChatResponseDTO;", "", "item", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Ljava/util/Map;)V", "getItem", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class StartOrGetChatResponseDTO {
    public static final int $stable = 8;

    @NotNull
    private final ItemDTO item;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public StartOrGetChatResponseDTO(@NotNull ItemDTO item, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartOrGetChatResponseDTO copy$default(StartOrGetChatResponseDTO startOrGetChatResponseDTO, ItemDTO itemDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            itemDTO = startOrGetChatResponseDTO.item;
        }
        if ((i11 & 2) != 0) {
            map = startOrGetChatResponseDTO.trackingInfo;
        }
        return startOrGetChatResponseDTO.copy(itemDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ItemDTO getItem() {
        return this.item;
    }

    public final Map<String, MessengerTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final StartOrGetChatResponseDTO copy(@NotNull ItemDTO item, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new StartOrGetChatResponseDTO(item, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartOrGetChatResponseDTO)) {
            return false;
        }
        StartOrGetChatResponseDTO startOrGetChatResponseDTO = (StartOrGetChatResponseDTO) other;
        return Intrinsics.d(this.item, startOrGetChatResponseDTO.item) && Intrinsics.d(this.trackingInfo, startOrGetChatResponseDTO.trackingInfo);
    }

    @NotNull
    public final ItemDTO getItem() {
        return this.item;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "StartOrGetChatResponseDTO(item=" + this.item + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
