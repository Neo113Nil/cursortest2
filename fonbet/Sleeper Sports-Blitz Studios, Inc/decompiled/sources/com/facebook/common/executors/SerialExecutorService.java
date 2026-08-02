package com.facebook.common.executors;

import java.util.concurrent.ExecutorService;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* loaded from: classes6.dex */
public interface SerialExecutorService extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        UByte$$ExternalSyntheticBackport0.m((ExecutorService) this);
    }
}
