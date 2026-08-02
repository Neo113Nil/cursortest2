package ru.ozon.android.messenger.framework.data.remote.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/WebSocketRequestDTO;", "", "namespace", "", "request", "Lru/ozon/android/messenger/framework/data/remote/models/RpcRequestDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/RpcRequestDTO;)V", "getNamespace", "()Ljava/lang/String;", "getRequest", "()Lru/ozon/android/messenger/framework/data/remote/models/RpcRequestDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WebSocketRequestDTO {
    public static final int $stable = 8;
    private final String namespace;

    @NotNull
    private final RpcRequestDTO request;

    public WebSocketRequestDTO(String str, @NotNull RpcRequestDTO request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.namespace = str;
        this.request = request;
    }

    public static /* synthetic */ WebSocketRequestDTO copy$default(WebSocketRequestDTO webSocketRequestDTO, String str, RpcRequestDTO rpcRequestDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = webSocketRequestDTO.namespace;
        }
        if ((i11 & 2) != 0) {
            rpcRequestDTO = webSocketRequestDTO.request;
        }
        return webSocketRequestDTO.copy(str, rpcRequestDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RpcRequestDTO getRequest() {
        return this.request;
    }

    @NotNull
    public final WebSocketRequestDTO copy(String namespace, @NotNull RpcRequestDTO request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new WebSocketRequestDTO(namespace, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketRequestDTO)) {
            return false;
        }
        WebSocketRequestDTO webSocketRequestDTO = (WebSocketRequestDTO) other;
        return Intrinsics.d(this.namespace, webSocketRequestDTO.namespace) && Intrinsics.d(this.request, webSocketRequestDTO.request);
    }

    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    public final RpcRequestDTO getRequest() {
        return this.request;
    }

    public int hashCode() {
        String str = this.namespace;
        return this.request.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "WebSocketRequestDTO(namespace=" + this.namespace + ", request=" + this.request + ")";
    }
}
