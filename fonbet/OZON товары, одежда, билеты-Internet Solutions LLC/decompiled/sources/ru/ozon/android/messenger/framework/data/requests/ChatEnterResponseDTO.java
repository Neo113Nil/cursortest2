package ru.ozon.android.messenger.framework.data.requests;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/ChatEnterResponseDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/util/Map;)V", "getTrackingInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChatEnterResponseDTO {
    public static final int $stable = 8;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public ChatEnterResponseDTO(Map<String, MessengerTrackingInfo> map) {
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatEnterResponseDTO copy$default(ChatEnterResponseDTO chatEnterResponseDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = chatEnterResponseDTO.trackingInfo;
        }
        return chatEnterResponseDTO.copy(map);
    }

    public final Map<String, MessengerTrackingInfo> component1() {
        return this.trackingInfo;
    }

    @NotNull
    public final ChatEnterResponseDTO copy(Map<String, MessengerTrackingInfo> trackingInfo) {
        return new ChatEnterResponseDTO(trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChatEnterResponseDTO) && Intrinsics.d(this.trackingInfo, ((ChatEnterResponseDTO) other).trackingInfo);
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @NotNull
    public String toString() {
        return HY.b.b("ChatEnterResponseDTO(trackingInfo=", ")", this.trackingInfo);
    }
}
