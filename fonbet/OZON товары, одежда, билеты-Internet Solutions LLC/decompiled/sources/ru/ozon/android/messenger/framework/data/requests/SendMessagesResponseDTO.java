package ru.ozon.android.messenger.framework.data.requests;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/SendMessagesResponseDTO;", "", "item", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "status", "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "retryToken", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getItem", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "getStatus", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getRetryToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SendMessagesResponseDTO {
    public static final int $stable = 8;

    @NotNull
    private final ItemDTO item;
    private final String retryToken;

    @NotNull
    private final String status;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public SendMessagesResponseDTO(@NotNull ItemDTO item, @NotNull String status, Map<String, MessengerTrackingInfo> map, @com.squareup.moshi.i(name = "token") String str) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(status, "status");
        this.item = item;
        this.status = status;
        this.trackingInfo = map;
        this.retryToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendMessagesResponseDTO copy$default(SendMessagesResponseDTO sendMessagesResponseDTO, ItemDTO itemDTO, String str, Map map, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            itemDTO = sendMessagesResponseDTO.item;
        }
        if ((i11 & 2) != 0) {
            str = sendMessagesResponseDTO.status;
        }
        if ((i11 & 4) != 0) {
            map = sendMessagesResponseDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            str2 = sendMessagesResponseDTO.retryToken;
        }
        return sendMessagesResponseDTO.copy(itemDTO, str, map, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ItemDTO getItem() {
        return this.item;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final Map<String, MessengerTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRetryToken() {
        return this.retryToken;
    }

    @NotNull
    public final SendMessagesResponseDTO copy(@NotNull ItemDTO item, @NotNull String status, Map<String, MessengerTrackingInfo> trackingInfo, @com.squareup.moshi.i(name = "token") String retryToken) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(status, "status");
        return new SendMessagesResponseDTO(item, status, trackingInfo, retryToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessagesResponseDTO)) {
            return false;
        }
        SendMessagesResponseDTO sendMessagesResponseDTO = (SendMessagesResponseDTO) other;
        return Intrinsics.d(this.item, sendMessagesResponseDTO.item) && Intrinsics.d(this.status, sendMessagesResponseDTO.status) && Intrinsics.d(this.trackingInfo, sendMessagesResponseDTO.trackingInfo) && Intrinsics.d(this.retryToken, sendMessagesResponseDTO.retryToken);
    }

    @NotNull
    public final ItemDTO getItem() {
        return this.item;
    }

    public final String getRetryToken() {
        return this.retryToken;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = G.g.a(this.item.hashCode() * 31, 31, this.status);
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.retryToken;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SendMessagesResponseDTO(item=" + this.item + ", status=" + this.status + ", trackingInfo=" + this.trackingInfo + ", retryToken=" + this.retryToken + ")";
    }
}
