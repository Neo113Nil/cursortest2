package ru.ozon.android.messenger.framework.data.remote.models;

import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/WebSocketPayloadDTO;", "", "events", "", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "response", "Lru/ozon/android/messenger/framework/data/remote/models/RpcResponseDTO;", "trackingPayloads", "", "", "<init>", "(Ljava/util/List;Lru/ozon/android/messenger/framework/data/remote/models/RpcResponseDTO;Ljava/util/Map;)V", "getEvents", "()Ljava/util/List;", "getResponse", "()Lru/ozon/android/messenger/framework/data/remote/models/RpcResponseDTO;", "getTrackingPayloads", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WebSocketPayloadDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SocketEventDTO> events;
    private final RpcResponseDTO response;
    private final Map<String, String> trackingPayloads;

    /* JADX WARN: Multi-variable type inference failed */
    public WebSocketPayloadDTO(@NotNull List<? extends SocketEventDTO> events, RpcResponseDTO rpcResponseDTO, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.events = events;
        this.response = rpcResponseDTO;
        this.trackingPayloads = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebSocketPayloadDTO copy$default(WebSocketPayloadDTO webSocketPayloadDTO, List list, RpcResponseDTO rpcResponseDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = webSocketPayloadDTO.events;
        }
        if ((i11 & 2) != 0) {
            rpcResponseDTO = webSocketPayloadDTO.response;
        }
        if ((i11 & 4) != 0) {
            map = webSocketPayloadDTO.trackingPayloads;
        }
        return webSocketPayloadDTO.copy(list, rpcResponseDTO, map);
    }

    @NotNull
    public final List<SocketEventDTO> component1() {
        return this.events;
    }

    /* renamed from: component2, reason: from getter */
    public final RpcResponseDTO getResponse() {
        return this.response;
    }

    public final Map<String, String> component3() {
        return this.trackingPayloads;
    }

    @NotNull
    public final WebSocketPayloadDTO copy(@NotNull List<? extends SocketEventDTO> events, RpcResponseDTO response, Map<String, String> trackingPayloads) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new WebSocketPayloadDTO(events, response, trackingPayloads);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketPayloadDTO)) {
            return false;
        }
        WebSocketPayloadDTO webSocketPayloadDTO = (WebSocketPayloadDTO) other;
        return Intrinsics.d(this.events, webSocketPayloadDTO.events) && Intrinsics.d(this.response, webSocketPayloadDTO.response) && Intrinsics.d(this.trackingPayloads, webSocketPayloadDTO.trackingPayloads);
    }

    @NotNull
    public final List<SocketEventDTO> getEvents() {
        return this.events;
    }

    public final RpcResponseDTO getResponse() {
        return this.response;
    }

    public final Map<String, String> getTrackingPayloads() {
        return this.trackingPayloads;
    }

    public int hashCode() {
        int hashCode = this.events.hashCode() * 31;
        RpcResponseDTO rpcResponseDTO = this.response;
        int hashCode2 = (hashCode + (rpcResponseDTO == null ? 0 : rpcResponseDTO.hashCode())) * 31;
        Map<String, String> map = this.trackingPayloads;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<SocketEventDTO> list = this.events;
        RpcResponseDTO rpcResponseDTO = this.response;
        Map<String, String> map = this.trackingPayloads;
        StringBuilder sb2 = new StringBuilder("WebSocketPayloadDTO(events=");
        sb2.append(list);
        sb2.append(", response=");
        sb2.append(rpcResponseDTO);
        sb2.append(", trackingPayloads=");
        return P.f(sb2, map, ")");
    }

    public WebSocketPayloadDTO(List list, RpcResponseDTO rpcResponseDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, rpcResponseDTO, (i11 & 4) != 0 ? null : map);
    }
}
