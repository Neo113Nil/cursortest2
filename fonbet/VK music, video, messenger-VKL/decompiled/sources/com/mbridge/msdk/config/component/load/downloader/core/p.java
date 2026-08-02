package com.mbridge.msdk.config.component.load.downloader.core;

/* compiled from: RequestBuilder.java */
/* loaded from: classes13.dex */
public interface p {
    p a(int i);

    p a(com.mbridge.msdk.config.component.load.downloader.f fVar);

    d build();

    p withHttpRetryCounter(int i);

    p withTimeout(long j);
}
