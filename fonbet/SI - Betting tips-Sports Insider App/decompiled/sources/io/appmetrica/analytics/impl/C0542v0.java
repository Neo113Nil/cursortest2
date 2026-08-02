package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542v0 implements Ba {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14762a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f14763b;

    /* renamed from: c, reason: collision with root package name */
    public final C0117e4 f14764c;

    public C0542v0() {
        IHandlerExecutor a7 = C0040b4.l().g().a();
        this.f14763b = a7;
        this.f14762a = a7.getHandler();
        this.f14764c = new C0117e4();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final void a(AppMetricaConfig appMetricaConfig, @NonNull Ta ta2) {
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NonNull
    public final Handler b() {
        return this.f14762a;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NonNull
    public final S1 c() {
        return new S1();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NonNull
    public final C0279kb d() {
        return new C0279kb();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.f14763b;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NonNull
    public final C0117e4 a() {
        return this.f14764c;
    }
}
