package com.vk.id.captcha.sensors;

import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f60551a;

    /* renamed from: b, reason: collision with root package name */
    private volatile HandlerThread f60552b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AtomicInteger f60553c;

    public d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f60551a = str;
        this.f60553c = new AtomicInteger();
    }

    @NotNull
    public final HandlerThread a() {
        HandlerThread handlerThread = this.f60552b;
        if (handlerThread != null) {
            this.f60553c.incrementAndGet();
            return handlerThread;
        }
        synchronized (this) {
            HandlerThread handlerThread2 = this.f60552b;
            if (handlerThread2 != null) {
                this.f60553c.incrementAndGet();
                return handlerThread2;
            }
            HandlerThread handlerThread3 = new HandlerThread(this.f60551a);
            handlerThread3.start();
            this.f60552b = handlerThread3;
            this.f60553c.incrementAndGet();
            return handlerThread3;
        }
    }

    public final void b() {
        if (this.f60552b == null) {
            this.f60553c.decrementAndGet();
            return;
        }
        synchronized (this) {
            try {
                if (this.f60553c.decrementAndGet() == 0) {
                    HandlerThread handlerThread = this.f60552b;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    this.f60552b = null;
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
