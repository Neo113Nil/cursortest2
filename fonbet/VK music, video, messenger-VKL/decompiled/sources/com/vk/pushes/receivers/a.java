package com.vk.pushes.receivers;

import android.content.Context;
import android.content.Intent;
import com.vk.pushes.receivers.c;
import xsna.izs;
import xsna.s3q0;
import xsna.z4g;

/* compiled from: NotificationActionsProcessor.kt */
/* loaded from: classes5.dex */
public final class a implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ Intent c;

    public a(Context context, Intent intent) {
        this.b = context;
        this.c = intent;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        z4g.d().l();
        c.a aVar = c.b;
        c.a.f(this.b, this.c, true);
        return s3q0.a;
    }
}
