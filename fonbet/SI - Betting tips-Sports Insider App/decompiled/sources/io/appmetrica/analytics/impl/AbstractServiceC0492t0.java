package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0492t0 extends Service {

    /* renamed from: a, reason: collision with root package name */
    public L1 f14653a;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        L1 l12 = this.f14653a;
        if (l12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            l12 = null;
        }
        return l12.a(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L1 l12 = this.f14653a;
        if (l12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            l12 = null;
        }
        l12.a(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.f14653a == null) {
            this.f14653a = new L1(this, new C0517u0(this));
        }
        L1 l12 = this.f14653a;
        if (l12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            l12 = null;
        }
        l12.b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        L1 l12 = this.f14653a;
        if (l12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            l12 = null;
        }
        l12.c();
    }

    @Override // android.app.Service
    public void onRebind(@NotNull Intent intent) {
        super.onRebind(intent);
        L1 l12 = this.f14653a;
        if (l12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            l12 = null;
        }
        l12.b(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@NotNull Intent intent, int i5, int i10) {
        L1 l12 = this.f14653a;
        if (l12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            l12 = null;
        }
        return l12.a(intent, i5, i10);
    }

    @Override // android.app.Service
    public boolean onUnbind(@NotNull Intent intent) {
        L1 l12 = this.f14653a;
        if (l12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            l12 = null;
        }
        return l12.c(intent);
    }
}
