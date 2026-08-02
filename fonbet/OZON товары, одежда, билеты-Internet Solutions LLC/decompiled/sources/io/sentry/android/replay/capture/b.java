package io.sentry.android.replay.capture;

import io.sentry.W2;
import io.sentry.android.replay.capture.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<io.sentry.android.replay.util.h> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f67465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar) {
        super(0);
        this.f67465b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final io.sentry.android.replay.util.h invoke() {
        W2 w22;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new a.ThreadFactoryC1106a());
        Intrinsics.f(newSingleThreadScheduledExecutor);
        w22 = this.f67465b.f67448a;
        return new io.sentry.android.replay.util.h(newSingleThreadScheduledExecutor, w22);
    }
}
