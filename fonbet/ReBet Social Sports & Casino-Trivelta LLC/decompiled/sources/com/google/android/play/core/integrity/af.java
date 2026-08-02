package com.google.android.play.core.integrity;

import Qa.B;
import Qa.C1517g;
import Qa.G;
import Qa.H;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class af extends H {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f36531a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f36532b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36533c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f36534d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f36535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f36535e = ajVar;
        this.f36531a = bArr;
        this.f36532b = l10;
        this.f36533c = taskCompletionSource2;
        this.f36534d = integrityTokenRequest;
    }

    @Override // Qa.H
    public final void a(Exception exc) {
        if (exc instanceof C1517g) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // Qa.H
    public final void b() {
        G g10;
        try {
            ((B) this.f36535e.f36545a.e()).w(aj.a(this.f36535e, this.f36531a, this.f36532b, null), new ai(this.f36535e, this.f36533c));
        } catch (RemoteException e10) {
            aj ajVar = this.f36535e;
            IntegrityTokenRequest integrityTokenRequest = this.f36534d;
            g10 = ajVar.f36546b;
            g10.c(e10, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.f36533c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
