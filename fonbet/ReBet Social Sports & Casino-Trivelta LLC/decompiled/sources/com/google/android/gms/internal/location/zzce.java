package com.google.android.gms.internal.location;

import V9.C1757m;
import V9.InterfaceC1759o;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzce extends e implements InterfaceC1759o {
    public static final /* synthetic */ int zza = 0;

    public zzce(@NonNull Activity activity) {
        super(activity, zzbp.zzb, (C3117a.d) C3117a.d.f32289J4, e.a.f32290c);
    }

    @Override // V9.InterfaceC1759o
    public final Task<C1757m> checkLocationSettings(final LocationSettingsRequest locationSettingsRequest) {
        return doRead(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzcd
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                LocationSettingsRequest locationSettingsRequest2 = LocationSettingsRequest.this;
                zzda zzdaVar = (zzda) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                AbstractC3191o.b(locationSettingsRequest2 != null, "locationSettingsRequest can't be null");
                ((zzo) zzdaVar.getService()).zzh(locationSettingsRequest2, new zzcq(taskCompletionSource), null);
            }
        }).e(2426).a());
    }

    public zzce(@NonNull Context context) {
        super(context, zzbp.zzb, C3117a.d.f32289J4, e.a.f32290c);
    }
}
