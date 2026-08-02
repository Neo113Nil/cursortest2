package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import xsna.cv90;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzw {
    public final cv90<Status> removeActivityUpdates(c cVar, PendingIntent pendingIntent) {
        return cVar.b(new zzu(this, cVar, pendingIntent));
    }

    public final cv90<Status> requestActivityUpdates(c cVar, long j, PendingIntent pendingIntent) {
        return cVar.b(new zzt(this, cVar, j, pendingIntent));
    }
}
