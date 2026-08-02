package com.google.android.gms.internal.location;

import V9.InterfaceC1753i;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbz extends e implements InterfaceC1753i {
    public static final /* synthetic */ int zza = 0;

    public zzbz(@NonNull Activity activity) {
        super(activity, zzbp.zzb, (C3117a.d) C3117a.d.f32289J4, e.a.f32290c);
    }

    @Override // V9.InterfaceC1753i
    public final Task<Void> addGeofences(GeofencingRequest geofencingRequest, final PendingIntent pendingIntent) {
        final GeofencingRequest h10 = geofencingRequest.h(getContextAttributionTag());
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzbw
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzq(GeofencingRequest.this, pendingIntent, (TaskCompletionSource) obj2);
            }
        }).e(2424).a());
    }

    @Override // V9.InterfaceC1753i
    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzby
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzx(pendingIntent, (TaskCompletionSource) obj2);
            }
        }).e(2425).a());
    }

    public zzbz(@NonNull Context context) {
        super(context, zzbp.zzb, C3117a.d.f32289J4, e.a.f32290c);
    }

    @Override // V9.InterfaceC1753i
    public final Task<Void> removeGeofences(final List<String> list) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzy(list, (TaskCompletionSource) obj2);
            }
        }).e(2425).a());
    }
}
