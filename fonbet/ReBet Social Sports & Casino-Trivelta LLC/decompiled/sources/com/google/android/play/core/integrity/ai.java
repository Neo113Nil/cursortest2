package com.google.android.play.core.integrity;

import Qa.C;
import Qa.G;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class ai extends C {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f36542a;

    /* renamed from: b, reason: collision with root package name */
    private final G f36543b = new G("OnRequestIntegrityTokenCallback");

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f36544c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f36542a = ajVar;
        this.f36544c = taskCompletionSource;
    }

    @Override // Qa.D
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.f36542a.f36545a.v(this.f36544c);
        this.f36543b.d("onRequestIntegrityToken", new Object[0]);
        kVar = this.f36542a.f36549e;
        com.google.android.gms.common.api.b a10 = kVar.a(bundle);
        if (a10 != null) {
            this.f36544c.trySetException(a10);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f36544c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j10 = bundle.getLong("request.token.sid");
        str = this.f36542a.f36547c;
        ah ahVar = new ah(this, str, j10);
        TaskCompletionSource taskCompletionSource = this.f36544c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
