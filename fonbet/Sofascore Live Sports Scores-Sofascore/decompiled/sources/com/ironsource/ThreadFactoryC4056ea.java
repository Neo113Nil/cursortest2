package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ThreadFactoryC4056ea implements ThreadFactory {

    @NotNull
    private final AtomicInteger a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable runnable) {
        runnable.getClass();
        return new Thread(runnable, String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.a.incrementAndGet())}, 2)));
    }
}
