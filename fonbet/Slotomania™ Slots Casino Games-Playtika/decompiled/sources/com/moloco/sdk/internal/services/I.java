package com.moloco.sdk.internal.services;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class I implements DefaultLifecycleObserver {
    public static final int e = 8;
    public final com.moloco.sdk.internal.services.analytics.a a;
    public final J b;
    public Long c;
    public boolean d;

    public I(com.moloco.sdk.internal.services.analytics.a analyticsService, J timeProviderService) {
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.a = analyticsService;
        this.b = timeProviderService;
    }

    public final void a() {
        this.d = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, C2813h.a, "Application onStart", false, 4, null);
        Long l = this.c;
        if (l != null) {
            MolocoLogger.debug$default(molocoLogger, C2813h.a, "Background event has been recorded, recording foreground", false, 4, null);
            this.a.a(this.b.invoke(), l.longValue());
            this.c = null;
            this.d = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, C2813h.a, "Application onStop", false, 4, null);
        if (this.d) {
            MolocoLogger.debug$default(molocoLogger, C2813h.a, "Tracking of event is true. Recording background", false, 4, null);
            long invoke = this.b.invoke();
            this.c = Long.valueOf(invoke);
            this.a.a(invoke);
        }
    }
}
