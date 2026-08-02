package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzv extends e {
    private static final C3117a.g zza;
    private static final C3117a.AbstractC0488a zzb;
    private static final C3117a zzc;

    static {
        C3117a.g gVar = new C3117a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new C3117a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, (C3117a.d) C3117a.d.f32289J4, e.a.f32290c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC3163x.a().d(zzac.zzb).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        }).e(1566).a());
    }

    public zzv(Context context) {
        super(context, zzc, C3117a.d.f32289J4, e.a.f32290c);
    }
}
