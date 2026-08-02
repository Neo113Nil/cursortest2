package ru.ozon.android.messenger.framework.data.remote.models;

import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/RpcRequestDTO;", "", "id", "", "method", "params", "", "jsonrpc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMethod", "getParams", "()Ljava/util/Map;", "getJsonrpc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RpcRequestDTO {
    public static final int $stable = 8;

    @NotNull
    private final String id;

    @NotNull
    private final String jsonrpc;

    @NotNull
    private final String method;

    @NotNull
    private final Map<String, Object> params;

    public RpcRequestDTO(@NotNull String id2, @NotNull String method, @NotNull Map<String, ? extends Object> params, @NotNull String jsonrpc) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(jsonrpc, "jsonrpc");
        this.id = id2;
        this.method = method;
        this.params = params;
        this.jsonrpc = jsonrpc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RpcRequestDTO copy$default(RpcRequestDTO rpcRequestDTO, String str, String str2, Map map, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rpcRequestDTO.id;
        }
        if ((i11 & 2) != 0) {
            str2 = rpcRequestDTO.method;
        }
        if ((i11 & 4) != 0) {
            map = rpcRequestDTO.params;
        }
        if ((i11 & 8) != 0) {
            str3 = rpcRequestDTO.jsonrpc;
        }
        return rpcRequestDTO.copy(str, str2, map, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.params;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    @NotNull
    public final RpcRequestDTO copy(@NotNull String id2, @NotNull String method, @NotNull Map<String, ? extends Object> params, @NotNull String jsonrpc) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(jsonrpc, "jsonrpc");
        return new RpcRequestDTO(id2, method, params, jsonrpc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RpcRequestDTO)) {
            return false;
        }
        RpcRequestDTO rpcRequestDTO = (RpcRequestDTO) other;
        return Intrinsics.d(this.id, rpcRequestDTO.id) && Intrinsics.d(this.method, rpcRequestDTO.method) && Intrinsics.d(this.params, rpcRequestDTO.params) && Intrinsics.d(this.jsonrpc, rpcRequestDTO.jsonrpc);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.jsonrpc.hashCode() + D40.c.a(this.params, g.a(this.id.hashCode() * 31, 31, this.method), 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.method;
        Map<String, Object> map = this.params;
        String str3 = this.jsonrpc;
        StringBuilder d11 = C3660k.d("RpcRequestDTO(id=", str, ", method=", str2, ", params=");
        d11.append(map);
        d11.append(", jsonrpc=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ RpcRequestDTO(String str, String str2, Map map, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i11 & 8) != 0 ? "2.0" : str3);
    }
}
