package io.ably.lib.http;

import io.ably.lib.http.HttpCore;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;

/* loaded from: classes9.dex */
public class PaginatedQuery<T> {
    private final BasePaginatedQuery<T> base;

    public PaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.BodyHandler<T> bodyHandler) {
        this(http, str, paramArr, paramArr2, null, bodyHandler);
    }

    public PaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.BodyHandler<T> bodyHandler) {
        this.base = new BasePaginatedQuery<>(http, str, paramArr, paramArr2, requestBody, bodyHandler);
    }

    public PaginatedResult<T> get() throws AblyException {
        return this.base.get().sync();
    }
}
