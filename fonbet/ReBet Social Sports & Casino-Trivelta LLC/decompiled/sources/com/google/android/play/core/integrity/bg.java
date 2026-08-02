package com.google.android.play.core.integrity;

import Qa.G;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f36589a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f36590b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f36591c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36592d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f36593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f36593e = bnVar;
        this.f36589a = str;
        this.f36590b = j10;
        this.f36591c = j11;
        this.f36592d = taskCompletionSource2;
    }

    @Override // Qa.H
    public final void b() {
        G g10;
        if (bn.k(this.f36593e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f36593e;
            ((Qa.w) bnVar.f36608a.e()).A0(bn.a(bnVar, this.f36589a, this.f36590b, this.f36591c, 0), new bk(this.f36593e, this.f36592d, this.f36590b));
        } catch (RemoteException e10) {
            bn bnVar2 = this.f36593e;
            String str = this.f36589a;
            g10 = bnVar2.f36609b;
            g10.c(e10, "requestExpressIntegrityToken(%s, %s)", str, Long.valueOf(this.f36590b));
            this.f36592d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
