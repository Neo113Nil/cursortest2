package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.w2n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final w2n a;
    public final /* synthetic */ zap b;

    public f(zap zapVar, w2n w2nVar) {
        this.b = zapVar;
        this.a = w2nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zap zapVar = this.b;
        if (zapVar.a) {
            w2n w2nVar = this.a;
            ConnectionResult connectionResult = w2nVar.b;
            if (!connectionResult.Y0()) {
                zapVar.getActivity();
                throw null;
            }
            LifecycleFragment lifecycleFragment = zapVar.mLifecycleFragment;
            Activity activity = zapVar.getActivity();
            PendingIntent pendingIntent = connectionResult.c;
            Preconditions.i(pendingIntent);
            int i = w2nVar.a;
            int i2 = GoogleApiActivity.b;
            Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
            intent.putExtra("pending_intent", pendingIntent);
            intent.putExtra("failing_client_id", i);
            intent.putExtra("notify_manager", false);
            lifecycleFragment.startActivityForResult(intent, 1);
        }
    }
}
