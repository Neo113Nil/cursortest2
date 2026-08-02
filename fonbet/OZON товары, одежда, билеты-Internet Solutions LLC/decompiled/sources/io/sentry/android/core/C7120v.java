package io.sentry.android.core;

import android.net.TrafficStats;
import io.sentry.InterfaceC7130c0;

/* renamed from: io.sentry.android.core.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7120v implements InterfaceC7130c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C7120v f67380a = new C7120v();

    public static C7120v c() {
        return f67380a;
    }

    @Override // io.sentry.InterfaceC7130c0
    public final void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.InterfaceC7130c0
    public final void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
