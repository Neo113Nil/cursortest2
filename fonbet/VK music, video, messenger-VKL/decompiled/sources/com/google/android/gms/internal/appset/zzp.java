package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import xsna.f5o0;
import xsna.ouf0;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzp extends b<a.d.c> implements AppSetIdClient {
    private static final a.g<zzd> zza;
    private static final a.AbstractC0111a<zzd, a.d.c> zzb;
    private static final a<a.d.c> zzc;
    private final Context zzd;
    private final com.google.android.gms.common.a zze;

    static {
        a.g<zzd> gVar = new a.g<>();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a<>("AppSet.API", zznVar, gVar);
    }

    public zzp(Context context, com.google.android.gms.common.a aVar) {
        super(context, zzc, a.d.U6, b.a.c);
        this.zzd = context;
        this.zze = aVar;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        if (this.zze.c(this.zzd, 212800000) != 0) {
            return Tasks.forException(new ApiException(new Status(17)));
        }
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{com.google.android.gms.appset.zze.zza};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.appset.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new com.google.android.gms.appset.zza(null, null), new zzo(zzp.this, (TaskCompletionSource) obj2));
            }
        };
        a.c = true;
        a.b = false;
        a.e = 27601;
        return doRead(a.a());
    }
}
