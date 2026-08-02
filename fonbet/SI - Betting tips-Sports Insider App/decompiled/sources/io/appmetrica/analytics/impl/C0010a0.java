package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010a0 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0036b0 f13323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13324b;

    public C0010a0(C0036b0 c0036b0, Context context) {
        this.f13323a = c0036b0;
        this.f13324b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0036b0 c0036b0 = this.f13323a;
        Context context = this.f13324b;
        c0036b0.getClass();
        c0036b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
