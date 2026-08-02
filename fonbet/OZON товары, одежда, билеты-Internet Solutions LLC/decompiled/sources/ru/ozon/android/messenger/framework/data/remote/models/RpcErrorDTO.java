package ru.ozon.android.messenger.framework.data.remote.models;

import Cm.e;
import G.g;
import T7.E;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/RpcErrorDTO;", "", "code", "", "message", "", "data", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getData", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RpcErrorDTO {
    public static final int $stable = 8;
    private final int code;
    private final Object data;

    @NotNull
    private final String message;

    public RpcErrorDTO(int i11, @NotNull String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i11;
        this.message = message;
        this.data = obj;
    }

    public static /* synthetic */ RpcErrorDTO copy$default(RpcErrorDTO rpcErrorDTO, int i11, String str, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = rpcErrorDTO.code;
        }
        if ((i12 & 2) != 0) {
            str = rpcErrorDTO.message;
        }
        if ((i12 & 4) != 0) {
            obj = rpcErrorDTO.data;
        }
        return rpcErrorDTO.copy(i11, str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final RpcErrorDTO copy(int code, @NotNull String message, Object data) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new RpcErrorDTO(code, message, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RpcErrorDTO)) {
            return false;
        }
        RpcErrorDTO rpcErrorDTO = (RpcErrorDTO) other;
        return this.code == rpcErrorDTO.code && Intrinsics.d(this.message, rpcErrorDTO.message) && Intrinsics.d(this.data, rpcErrorDTO.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int a11 = g.a(Integer.hashCode(this.code) * 31, 31, this.message);
        Object obj = this.data;
        return a11 + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return E.c(this.data, ")", e.g(this.code, "RpcErrorDTO(code=", ", message=", this.message, ", data="));
    }
}
