package com.giphy.sdk.core.network.response;

import com.giphy.sdk.core.models.Meta;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/giphy/sdk/core/network/response/ErrorResponse;", "Lcom/giphy/sdk/core/network/response/GenericResponse;", "serverStatus", "", "message", "", "(ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "meta", "Lcom/giphy/sdk/core/models/Meta;", "getMeta", "()Lcom/giphy/sdk/core/models/Meta;", "setMeta", "(Lcom/giphy/sdk/core/models/Meta;)V", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorResponse implements GenericResponse {

    @Nullable
    private final String message;

    @Nullable
    private Meta meta;

    public ErrorResponse(int i10, @Nullable String str) {
        this.meta = new Meta(i10, str, null, 4, null);
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Meta getMeta() {
        return this.meta;
    }

    public final void setMeta(@Nullable Meta meta) {
        this.meta = meta;
    }
}
