package ru.ozon.android.messenger.framework.data.requests;

import C.o0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/UpdateMessageResponseDTO;", "", "item", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "status", "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "retryToken", "errorDescription", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getItem", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "getStatus", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getRetryToken", "getErrorDescription", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UpdateMessageResponseDTO {
    public static final int $stable = 8;
    private final String errorDescription;
    private final ItemDTO item;
    private final String retryToken;

    @NotNull
    private final String status;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public UpdateMessageResponseDTO(ItemDTO itemDTO, @NotNull String status, Map<String, MessengerTrackingInfo> map, @com.squareup.moshi.i(name = "token") String str, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.item = itemDTO;
        this.status = status;
        this.trackingInfo = map;
        this.retryToken = str;
        this.errorDescription = str2;
    }

    public static /* synthetic */ UpdateMessageResponseDTO copy$default(UpdateMessageResponseDTO updateMessageResponseDTO, ItemDTO itemDTO, String str, Map map, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            itemDTO = updateMessageResponseDTO.item;
        }
        if ((i11 & 2) != 0) {
            str = updateMessageResponseDTO.status;
        }
        if ((i11 & 4) != 0) {
            map = updateMessageResponseDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            str2 = updateMessageResponseDTO.retryToken;
        }
        if ((i11 & 16) != 0) {
            str3 = updateMessageResponseDTO.errorDescription;
        }
        String str4 = str3;
        Map map2 = map;
        return updateMessageResponseDTO.copy(itemDTO, str, map2, str2, str4);
    }

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

    /* renamed from: component5, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    @NotNull
    public final UpdateMessageResponseDTO copy(ItemDTO item, @NotNull String status, Map<String, MessengerTrackingInfo> trackingInfo, @com.squareup.moshi.i(name = "token") String retryToken, String errorDescription) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new UpdateMessageResponseDTO(item, status, trackingInfo, retryToken, errorDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateMessageResponseDTO)) {
            return false;
        }
        UpdateMessageResponseDTO updateMessageResponseDTO = (UpdateMessageResponseDTO) other;
        return Intrinsics.d(this.item, updateMessageResponseDTO.item) && Intrinsics.d(this.status, updateMessageResponseDTO.status) && Intrinsics.d(this.trackingInfo, updateMessageResponseDTO.trackingInfo) && Intrinsics.d(this.retryToken, updateMessageResponseDTO.retryToken) && Intrinsics.d(this.errorDescription, updateMessageResponseDTO.errorDescription);
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

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
        ItemDTO itemDTO = this.item;
        int a11 = G.g.a((itemDTO == null ? 0 : itemDTO.hashCode()) * 31, 31, this.status);
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.retryToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDescription;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ItemDTO itemDTO = this.item;
        String str = this.status;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        String str2 = this.retryToken;
        String str3 = this.errorDescription;
        StringBuilder sb2 = new StringBuilder("UpdateMessageResponseDTO(item=");
        sb2.append(itemDTO);
        sb2.append(", status=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", retryToken=");
        sb2.append(str2);
        sb2.append(", errorDescription=");
        return o0.c(sb2, str3, ")");
    }

    public /* synthetic */ UpdateMessageResponseDTO(ItemDTO itemDTO, String str, Map map, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : itemDTO, str, map, str2, str3);
    }
}
