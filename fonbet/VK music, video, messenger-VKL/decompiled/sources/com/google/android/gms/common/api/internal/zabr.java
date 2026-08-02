package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import xsna.de;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class zabr extends BroadcastReceiver {

    @Nullable
    public Context a;
    public final de b;

    public zabr(de deVar) {
        this.b = deVar;
    }

    public final void a(Context context) {
        this.a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.p0();
            b();
        }
    }
}
