package com.google.android.play.core.integrity;

import Qa.G;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f36586a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36587b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f36588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f36588c = bnVar;
        this.f36586a = j10;
        this.f36587b = taskCompletionSource2;
    }

    @Override // Qa.H
    public final void b() {
        G g10;
        if (bn.k(this.f36588c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f36588c;
            ((Qa.w) bnVar.f36608a.e()).u(bn.b(bnVar, this.f36586a, 0), new bl(this.f36588c, this.f36587b));
        } catch (RemoteException e10) {
            bn bnVar2 = this.f36588c;
            long j10 = this.f36586a;
            g10 = bnVar2.f36609b;
            g10.c(e10, "warmUpIntegrityToken(%s)", Long.valueOf(j10));
            this.f36587b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
