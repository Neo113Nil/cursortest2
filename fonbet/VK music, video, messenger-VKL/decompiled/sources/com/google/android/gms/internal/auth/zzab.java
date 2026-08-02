package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.d901;
import xsna.exc0;
import xsna.f5o0;
import xsna.i7o0;
import xsna.ouf0;
import xsna.p100;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
final class zzab extends b implements zzg {
    private static final a.g zza;
    private static final a.AbstractC0111a zzb;
    private static final a zzc;
    private static final p100 zzd;
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new a("GoogleAuthService.API", zzvVar, gVar);
        zzd = new p100("Auth", "GoogleAuthServiceClient");
    }

    public zzab(@NonNull Context context) {
        super(context, (a<a.d.c>) zzc, a.d.U6, b.a.c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (i7o0.k(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.b("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{d901.c};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        a.e = 1513;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(@NonNull final AccountChangeEventsRequest accountChangeEventsRequest) {
        exc0.j(accountChangeEventsRequest, "request cannot be null.");
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{d901.b};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), accountChangeEventsRequest2);
            }
        };
        a.e = 1515;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(@NonNull final Account account, @NonNull final String str, final Bundle bundle) {
        exc0.j(account, "Account name cannot be null!");
        exc0.g(str, "Scope cannot be null!");
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{d901.c};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        a.e = 1512;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(@NonNull final Account account) {
        exc0.j(account, "account cannot be null.");
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{d901.b};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        a.e = 1517;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(@NonNull final String str) {
        exc0.j(str, "Client package name cannot be null!");
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{d901.b};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        a.e = 1514;
        return doWrite(a.a());
    }
}
