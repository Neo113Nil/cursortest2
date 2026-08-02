package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import u9.InterfaceC6532b;
import u9.c;
import u9.f;

/* loaded from: classes2.dex */
public final class zzp extends e implements InterfaceC6532b {
    private static final C3117a.g zza;
    private static final C3117a.AbstractC0488a zzb;
    private static final C3117a zzc;
    private final Context zzd;
    private final C3171d zze;

    static {
        C3117a.g gVar = new C3117a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new C3117a("AppSet.API", zznVar, gVar);
    }

    public zzp(Context context, C3171d c3171d) {
        super(context, zzc, C3117a.d.f32289J4, e.a.f32290c);
        this.zzd = context;
        this.zze = c3171d;
    }

    @Override // u9.InterfaceC6532b
    public final Task<c> getAppSetIdInfo() {
        return this.zze.j(this.zzd, 212800000) == 0 ? doRead(AbstractC3163x.a().d(f.f66227a).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new com.google.android.gms.appset.zza(null, null), new zzo(zzp.this, (TaskCompletionSource) obj2));
            }
        }).c(false).e(27601).a()) : Tasks.forException(new b(new Status(17)));
    }
}
