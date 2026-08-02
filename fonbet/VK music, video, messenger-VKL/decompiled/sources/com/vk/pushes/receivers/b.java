package com.vk.pushes.receivers;

import android.content.Context;
import android.content.Intent;
import com.vk.pushes.receivers.c;
import xsna.ca70;
import xsna.e43;
import xsna.yp80;

/* compiled from: NotificationActionsProcessor.kt */
/* loaded from: classes5.dex */
public final class b implements yp80 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ Intent c;

    public b(Context context, Intent intent) {
        this.b = context;
        this.c = intent;
    }

    @Override // xsna.yp80
    public final void onError(Throwable th) {
        c.a aVar = c.b;
        c.a.e(this.b, this.c, th);
    }

    @Override // xsna.yp80
    public final void onSuccess() {
        c.a aVar = c.b;
        Intent intent = this.c;
        Context context = this.b;
        c.a.f(context, intent, false);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        if (context2.getApplicationInfo().targetSdkVersion < 31) {
            ca70 ca70Var = ca70.a;
            ca70.c(context);
        }
    }

    @Override // xsna.yp80
    public final void I() {
    }

    @Override // xsna.yp80
    public final void U() {
    }

    @Override // xsna.yp80
    public final void B0(boolean z) {
    }
}
