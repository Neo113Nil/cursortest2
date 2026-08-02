package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3034s implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30882a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f30883b;

    public C3034s(d0 inputProducer, ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f30882a = inputProducer;
        this.f30883b = scheduledExecutorService;
    }

    public static final void d(C3034s this$0, InterfaceC3030n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.f30882a.b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(final InterfaceC3030n consumer, final e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.imagepipeline.request.b D02 = context.D0();
        ScheduledExecutorService scheduledExecutorService = this.f30883b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.r
                @Override // java.lang.Runnable
                public final void run() {
                    C3034s.d(C3034s.this, consumer, context);
                }
            }, D02.getDelayMs(), TimeUnit.MILLISECONDS);
        } else {
            this.f30882a.b(consumer, context);
        }
    }
}
