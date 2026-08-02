package io.sentry.android.core;

import android.net.TrafficStats;
import io.sentry.InterfaceC4775l0;

/* loaded from: classes3.dex */
public final class P implements InterfaceC4775l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P f50769a = new P();

    public static P c() {
        return f50769a;
    }

    @Override // io.sentry.InterfaceC4775l0
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.InterfaceC4775l0
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
