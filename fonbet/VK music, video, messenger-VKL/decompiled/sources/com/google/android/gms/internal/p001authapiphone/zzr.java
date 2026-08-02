package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.exc0;
import xsna.f5o0;
import xsna.ouf0;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes12.dex */
public final class zzr extends b {
    private static final a.g zza;
    private static final a.AbstractC0111a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.U6, b.a.c);
    }

    public final Task<Integer> checkPermissionState() {
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzac.zza};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a.e = 1564;
        return doRead(a.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        exc0.i(str);
        exc0.a("The package name cannot be empty.", !str.isEmpty());
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzac.zza};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a.e = 1565;
        return doRead(a.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzac.zza};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a.e = 1563;
        return doWrite(a.a());
    }

    public zzr(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.U6, b.a.c);
    }
}
