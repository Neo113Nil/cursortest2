package com.google.android.play.core.integrity;

import Qa.G;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f36602c;

    /* renamed from: d, reason: collision with root package name */
    private final G f36603d;

    /* renamed from: e, reason: collision with root package name */
    private final long f36604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f36602c = bnVar;
        this.f36603d = new G("OnRequestIntegrityTokenCallback");
        this.f36604e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, Qa.y
    public final void c(Bundle bundle) {
        k kVar;
        String str;
        super.c(bundle);
        this.f36603d.d("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.f36602c.f36613f;
        com.google.android.gms.common.api.b a10 = kVar.a(bundle);
        if (a10 != null) {
            this.f36599a.trySetException(a10);
            return;
        }
        long j10 = bundle.getLong("request.token.sid");
        str = this.f36602c.f36610c;
        bj bjVar = new bj(this, str, j10);
        TaskCompletionSource taskCompletionSource = this.f36599a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
