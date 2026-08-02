package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Qh implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0642z0 f12778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f12780c;

    public Qh(C0642z0 c0642z0, Context context, ReporterConfig reporterConfig) {
        this.f12778a = c0642z0;
        this.f12779b = context;
        this.f12780c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C0642z0 c0642z0 = this.f12778a;
        Context context = this.f12779b;
        ReporterConfig reporterConfig = this.f12780c;
        c0642z0.getClass();
        return C0617y0.a(context).f().c(reporterConfig);
    }
}
