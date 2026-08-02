package com.google.android.gms.measurement;

import U0.a;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.P2;
import com.google.android.gms.measurement.internal.Q2;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends a implements P2 {

    /* renamed from: c, reason: collision with root package name */
    public Q2 f33259c;

    @Override // com.google.android.gms.measurement.internal.P2
    public void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f33259c == null) {
            this.f33259c = new Q2(this);
        }
        this.f33259c.a(context, intent);
    }
}
