package com.google.android.play.core.integrity;

import Qa.C1516f;
import Qa.G;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f36594a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f36595b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36596c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f36597d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f36598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f36598e = bnVar;
        this.f36594a = bundle;
        this.f36595b = activity;
        this.f36596c = taskCompletionSource2;
        this.f36597d = i10;
    }

    @Override // Qa.H
    public final void b() {
        G g10;
        at atVar;
        if (bn.k(this.f36598e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f36598e;
            C1516f c1516f = bnVar.f36608a;
            Qa.w wVar = (Qa.w) c1516f.e();
            Bundle bundle = this.f36594a;
            atVar = bnVar.f36612e;
            wVar.b(bundle, atVar.a(this.f36595b, this.f36596c, c1516f));
        } catch (RemoteException e10) {
            bn bnVar2 = this.f36598e;
            int i10 = this.f36597d;
            g10 = bnVar2.f36609b;
            g10.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(i10));
            this.f36596c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
