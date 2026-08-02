package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ThreadFactoryC2401ea implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.a.incrementAndGet())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return new Thread(r, format);
    }
}
