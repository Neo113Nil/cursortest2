package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f12930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f12931b;

    public Th(C0183gi c0183gi, ReporterConfig reporterConfig) {
        this.f12931b = c0183gi;
        this.f12930a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f12931b;
        ReporterConfig reporterConfig = this.f12930a;
        C0642z0 c0642z0 = c0183gi.f13834a;
        Context context = c0183gi.f13837d;
        c0642z0.getClass();
        C0617y0.a(context).f().a(reporterConfig);
    }
}
