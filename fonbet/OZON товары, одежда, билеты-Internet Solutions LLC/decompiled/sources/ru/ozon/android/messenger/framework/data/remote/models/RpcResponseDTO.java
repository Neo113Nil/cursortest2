package ru.ozon.android.messenger.framework.data.remote.models;

import G.g;
import I0.C3173b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.parser.DataString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/RpcResponseDTO;", "", "result", "", "error", "Lru/ozon/android/messenger/framework/data/remote/models/RpcErrorDTO;", "id", "jsonrpc", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/RpcErrorDTO;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getError", "()Lru/ozon/android/messenger/framework/data/remote/models/RpcErrorDTO;", "getId", "getJsonrpc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RpcResponseDTO {
    public static final int $stable = 8;
    private final RpcErrorDTO error;

    @NotNull
    private final String id;

    @NotNull
    private final String jsonrpc;
    private final String result;

    public RpcResponseDTO(@DataString String str, RpcErrorDTO rpcErrorDTO, @NotNull String id2, @NotNull String jsonrpc) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(jsonrpc, "jsonrpc");
        this.result = str;
        this.error = rpcErrorDTO;
        this.id = id2;
        this.jsonrpc = jsonrpc;
    }

    public static /* synthetic */ RpcResponseDTO copy$default(RpcResponseDTO rpcResponseDTO, String str, RpcErrorDTO rpcErrorDTO, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rpcResponseDTO.result;
        }
        if ((i11 & 2) != 0) {
            rpcErrorDTO = rpcResponseDTO.error;
        }
        if ((i11 & 4) != 0) {
            str2 = rpcResponseDTO.id;
        }
        if ((i11 & 8) != 0) {
            str3 = rpcResponseDTO.jsonrpc;
        }
        return rpcResponseDTO.copy(str, rpcErrorDTO, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final RpcErrorDTO getError() {
        return this.error;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    @NotNull
    public final RpcResponseDTO copy(@DataString String result, RpcErrorDTO error, @NotNull String id2, @NotNull String jsonrpc) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(jsonrpc, "jsonrpc");
        return new RpcResponseDTO(result, error, id2, jsonrpc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RpcResponseDTO)) {
            return false;
        }
        RpcResponseDTO rpcResponseDTO = (RpcResponseDTO) other;
        return Intrinsics.d(this.result, rpcResponseDTO.result) && Intrinsics.d(this.error, rpcResponseDTO.error) && Intrinsics.d(this.id, rpcResponseDTO.id) && Intrinsics.d(this.jsonrpc, rpcResponseDTO.jsonrpc);
    }

    public final RpcErrorDTO getError() {
        return this.error;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        RpcErrorDTO rpcErrorDTO = this.error;
        return this.jsonrpc.hashCode() + g.a((hashCode + (rpcErrorDTO != null ? rpcErrorDTO.hashCode() : 0)) * 31, 31, this.id);
    }

    @NotNull
    public String toString() {
        String str = this.result;
        RpcErrorDTO rpcErrorDTO = this.error;
        String str2 = this.id;
        String str3 = this.jsonrpc;
        StringBuilder sb2 = new StringBuilder("RpcResponseDTO(result=");
        sb2.append(str);
        sb2.append(", error=");
        sb2.append(rpcErrorDTO);
        sb2.append(", id=");
        return C3173b.c(sb2, str2, ", jsonrpc=", str3, ")");
    }
}
