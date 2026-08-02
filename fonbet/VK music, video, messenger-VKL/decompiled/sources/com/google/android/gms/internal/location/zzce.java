package com.google.android.gms.internal.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.exc0;
import xsna.f1j0;
import xsna.f5o0;
import xsna.ouf0;
import xsna.xyz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzce extends b implements f1j0 {
    public static final /* synthetic */ int zza = 0;

    public zzce(@NonNull Activity activity) {
        super(activity, (a<a.d.c>) zzbp.zzb, a.d.U6, b.a.c);
    }

    @Override // xsna.f1j0
    public final Task<xyz> checkLocationSettings(final LocationSettingsRequest locationSettingsRequest) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzcd
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                LocationSettingsRequest locationSettingsRequest2 = LocationSettingsRequest.this;
                zzda zzdaVar = (zzda) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                exc0.a("locationSettingsRequest can't be null", locationSettingsRequest2 != null);
                ((zzo) zzdaVar.getService()).zzh(locationSettingsRequest2, new zzcq(taskCompletionSource), null);
            }
        };
        a.e = 2426;
        return doRead(a.a());
    }

    public zzce(@NonNull Context context) {
        super(context, (a<a.d.c>) zzbp.zzb, a.d.U6, b.a.c);
    }
}
