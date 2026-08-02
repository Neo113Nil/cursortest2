package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC2198x extends Service implements InterfaceC2193s {

    /* renamed from: a, reason: collision with root package name */
    public final P f20425a = new P(this);

    @Override // androidx.lifecycle.InterfaceC2193s
    public AbstractC2185j getLifecycle() {
        return this.f20425a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f20425a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f20425a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f20425a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f20425a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
