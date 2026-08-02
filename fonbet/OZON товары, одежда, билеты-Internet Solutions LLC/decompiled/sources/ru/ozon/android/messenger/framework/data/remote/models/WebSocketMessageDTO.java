package ru.ozon.android.messenger.framework.data.remote.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/WebSocketMessageDTO;", "", "namespace", "", "payload", "Lru/ozon/android/messenger/framework/data/remote/models/WebSocketPayloadDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/WebSocketPayloadDTO;)V", "getNamespace", "()Ljava/lang/String;", "getPayload", "()Lru/ozon/android/messenger/framework/data/remote/models/WebSocketPayloadDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WebSocketMessageDTO {
    public static final int $stable = 8;

    @NotNull
    private final String namespace;

    @NotNull
    private final WebSocketPayloadDTO payload;

    public WebSocketMessageDTO(@NotNull String namespace, @NotNull WebSocketPayloadDTO payload) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.namespace = namespace;
        this.payload = payload;
    }

    public static /* synthetic */ WebSocketMessageDTO copy$default(WebSocketMessageDTO webSocketMessageDTO, String str, WebSocketPayloadDTO webSocketPayloadDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = webSocketMessageDTO.namespace;
        }
        if ((i11 & 2) != 0) {
            webSocketPayloadDTO = webSocketMessageDTO.payload;
        }
        return webSocketMessageDTO.copy(str, webSocketPayloadDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final WebSocketPayloadDTO getPayload() {
        return this.payload;
    }

    @NotNull
    public final WebSocketMessageDTO copy(@NotNull String namespace, @NotNull WebSocketPayloadDTO payload) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new WebSocketMessageDTO(namespace, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketMessageDTO)) {
            return false;
        }
        WebSocketMessageDTO webSocketMessageDTO = (WebSocketMessageDTO) other;
        return Intrinsics.d(this.namespace, webSocketMessageDTO.namespace) && Intrinsics.d(this.payload, webSocketMessageDTO.payload);
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    public final WebSocketPayloadDTO getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode() + (this.namespace.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "WebSocketMessageDTO(namespace=" + this.namespace + ", payload=" + this.payload + ")";
    }
}
