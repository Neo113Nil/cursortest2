package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import xsna.f5o0;
import xsna.ouf0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzbz extends b {
    public static final /* synthetic */ int zza = 0;

    public zzbz(@NonNull Activity activity) {
        super(activity, (a<a.d.c>) zzbp.zzb, a.d.U6, b.a.c);
    }

    public final Task<Void> addGeofences(GeofencingRequest geofencingRequest, final PendingIntent pendingIntent) {
        final GeofencingRequest geofencingRequest2 = new GeofencingRequest(geofencingRequest.c, geofencingRequest.d, getContextAttributionTag(), geofencingRequest.b);
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzbw
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzq(GeofencingRequest.this, pendingIntent, (TaskCompletionSource) obj2);
            }
        };
        a.e = 2424;
        return doWrite(a.a());
    }

    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzby
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzx(pendingIntent, (TaskCompletionSource) obj2);
            }
        };
        a.e = 2425;
        return doWrite(a.a());
    }

    public zzbz(@NonNull Context context) {
        super(context, (a<a.d.c>) zzbp.zzb, a.d.U6, b.a.c);
    }

    public final Task<Void> removeGeofences(final List<String> list) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzy(list, (TaskCompletionSource) obj2);
            }
        };
        a.e = 2425;
        return doWrite(a.a());
    }
}
