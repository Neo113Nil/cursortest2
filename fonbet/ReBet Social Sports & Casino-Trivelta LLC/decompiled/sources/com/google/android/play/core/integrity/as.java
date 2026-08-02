package com.google.android.play.core.integrity;

import Qa.C1516f;
import Qa.E;
import Qa.G;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
final class as extends E {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f36563a;

    /* renamed from: b, reason: collision with root package name */
    final C1516f f36564b;

    /* renamed from: c, reason: collision with root package name */
    private final G f36565c = new G("RequestDialogCallbackImpl");

    /* renamed from: d, reason: collision with root package name */
    private final String f36566d;

    /* renamed from: e, reason: collision with root package name */
    private final k f36567e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f36568f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C1516f c1516f) {
        this.f36566d = context.getPackageName();
        this.f36567e = kVar;
        this.f36563a = taskCompletionSource;
        this.f36568f = activity;
        this.f36564b = c1516f;
    }

    @Override // Qa.F
    public final void b(Bundle bundle) {
        this.f36564b.v(this.f36563a);
        this.f36565c.d("onRequestDialog(%s)", this.f36566d);
        com.google.android.gms.common.api.b a10 = this.f36567e.a(bundle);
        if (a10 != null) {
            this.f36563a.trySetException(a10);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f36565c.b("onRequestDialog(%s): got null dialog intent", this.f36566d);
            this.f36563a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f36568f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(PKIFailureInfo.duplicateCertReq);
        intent.putExtra("result_receiver", new ar(this, this.f36564b.c()));
        this.f36565c.a("Starting dialog intent...", new Object[0]);
        this.f36568f.startActivityForResult(intent, 0);
    }
}
