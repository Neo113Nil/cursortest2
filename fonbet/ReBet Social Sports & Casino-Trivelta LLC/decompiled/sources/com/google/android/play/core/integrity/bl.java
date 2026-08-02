package com.google.android.play.core.integrity;

import Qa.G;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f36605c;

    /* renamed from: d, reason: collision with root package name */
    private final G f36606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f36605c = bnVar;
        this.f36606d = new G("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, Qa.y
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.f36606d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.f36605c.f36613f;
        com.google.android.gms.common.api.b a10 = kVar.a(bundle);
        if (a10 != null) {
            this.f36599a.trySetException(a10);
        } else {
            this.f36599a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
