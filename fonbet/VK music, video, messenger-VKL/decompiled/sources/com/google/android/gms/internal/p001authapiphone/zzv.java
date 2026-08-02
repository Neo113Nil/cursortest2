package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.f5o0;
import xsna.ouf0;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes12.dex */
public final class zzv extends b {
    private static final a.g zza;
    private static final a.AbstractC0111a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.U6, b.a.c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzac.zzb};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        };
        a.e = 1566;
        return doWrite(a.a());
    }

    public zzv(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.U6, b.a.c);
    }
}
