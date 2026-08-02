package com.amplitude.api;

/* loaded from: classes4.dex */
public interface Middleware {
    void run(MiddlewarePayload middlewarePayload, MiddlewareNext middlewareNext);
}
