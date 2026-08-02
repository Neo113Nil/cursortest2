package com.google.android.play.core.integrity;

import Qa.B;
import Qa.G;
import Qa.H;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class ag extends H {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f36536a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f36537b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36538c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f36539d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f36540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f36540e = ajVar;
        this.f36536a = bundle;
        this.f36537b = activity;
        this.f36538c = taskCompletionSource2;
        this.f36539d = i10;
    }

    @Override // Qa.H
    public final void b() {
        G g10;
        at atVar;
        try {
            B b10 = (B) this.f36540e.f36545a.e();
            Bundle bundle = this.f36536a;
            aj ajVar = this.f36540e;
            atVar = ajVar.f36548d;
            b10.b(bundle, atVar.a(this.f36537b, this.f36538c, ajVar.f36545a));
        } catch (RemoteException e10) {
            aj ajVar2 = this.f36540e;
            int i10 = this.f36539d;
            g10 = ajVar2.f36546b;
            g10.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(i10));
            this.f36538c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
