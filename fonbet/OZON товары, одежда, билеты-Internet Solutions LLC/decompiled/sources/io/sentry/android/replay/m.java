package io.sentry.android.replay;

import io.sentry.W2;
import io.sentry.android.replay.ReplayIntegration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class m extends AbstractC7737t implements Function0<io.sentry.android.replay.util.h> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReplayIntegration f67597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(ReplayIntegration replayIntegration) {
        super(0);
        this.f67597b = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function0
    public final io.sentry.android.replay.util.h invoke() {
        W2 w22;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ReplayIntegration.b());
        Intrinsics.f(newSingleThreadScheduledExecutor);
        w22 = this.f67597b.f67421d;
        if (w22 != null) {
            return new io.sentry.android.replay.util.h(newSingleThreadScheduledExecutor, w22);
        }
        Intrinsics.n("options");
        throw null;
    }
}
