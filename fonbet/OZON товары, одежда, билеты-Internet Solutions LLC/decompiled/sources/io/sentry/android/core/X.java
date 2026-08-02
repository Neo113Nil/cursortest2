package io.sentry.android.core;

import io.sentry.A1;
import java.util.TimerTask;

/* loaded from: classes10.dex */
final class X extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Y f67032a;

    X(Y y11) {
        this.f67032a = y11;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean z11;
        io.sentry.W w11;
        io.sentry.W w12;
        io.sentry.W w13;
        Y y11 = this.f67032a;
        z11 = y11.f67039g;
        if (z11) {
            w13 = y11.f67038f;
            ((A1) w13).n();
        }
        w11 = y11.f67038f;
        ((A1) w11).getOptions().getReplayController().stop();
        w12 = y11.f67038f;
        ((A1) w12).getOptions().getContinuousProfiler().a(false);
    }
}
