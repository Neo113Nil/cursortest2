package com.facebook.common.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* loaded from: classes6.dex */
public interface HandlerExecutorService extends ScheduledExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        UByte$$ExternalSyntheticBackport0.m((ExecutorService) this);
    }

    boolean isHandlerThread();

    void quit();
}
