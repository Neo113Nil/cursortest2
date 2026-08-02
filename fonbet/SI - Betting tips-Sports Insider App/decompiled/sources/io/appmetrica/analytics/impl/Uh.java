package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Uh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f12982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f12983b;

    public Uh(C0183gi c0183gi, ReporterConfig reporterConfig) {
        this.f12983b = c0183gi;
        this.f12982a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f12983b;
        ReporterConfig reporterConfig = this.f12982a;
        C0642z0 c0642z0 = c0183gi.f13834a;
        Context context = c0183gi.f13837d;
        c0642z0.getClass();
        C0617y0.a(context).f().a(reporterConfig);
    }
}
