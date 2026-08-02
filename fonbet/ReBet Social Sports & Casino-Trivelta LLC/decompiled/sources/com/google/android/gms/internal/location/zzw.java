package com.google.android.gms.internal.location;

import V9.InterfaceC1746b;
import android.app.PendingIntent;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;

/* loaded from: classes2.dex */
public final class zzw implements InterfaceC1746b {
    public final h removeActivityUpdates(f fVar, PendingIntent pendingIntent) {
        return fVar.h(new zzu(this, fVar, pendingIntent));
    }

    public final h requestActivityUpdates(f fVar, long j10, PendingIntent pendingIntent) {
        return fVar.h(new zzt(this, fVar, j10, pendingIntent));
    }
}
