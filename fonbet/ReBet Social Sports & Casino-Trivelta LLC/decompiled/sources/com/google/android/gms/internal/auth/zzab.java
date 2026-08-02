package com.google.android.gms.internal.auth;

import G9.a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import v9.AbstractC6672g;
import v9.AbstractC6673h;

/* loaded from: classes2.dex */
final class zzab extends e implements zzg {
    private static final C3117a.g zza;
    private static final C3117a.AbstractC0488a zzb;
    private static final C3117a zzc;
    private static final a zzd;
    private final Context zze;

    static {
        C3117a.g gVar = new C3117a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new C3117a("GoogleAuthService.API", zzvVar, gVar);
        zzd = AbstractC6672g.a("GoogleAuthServiceClient");
    }

    public zzab(@NonNull Context context) {
        super(context, zzc, C3117a.d.f32289J4, e.a.f32290c);
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (AbstractC3165y.c(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.h("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        return doWrite(AbstractC3163x.a().d(AbstractC6673h.f67111l).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        }).e(1513).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(@NonNull final AccountChangeEventsRequest accountChangeEventsRequest) {
        AbstractC3191o.n(accountChangeEventsRequest, "request cannot be null.");
        return doWrite(AbstractC3163x.a().d(AbstractC6673h.f67110k).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), accountChangeEventsRequest2);
            }
        }).e(1515).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(@NonNull final Account account, @NonNull final String str, final Bundle bundle) {
        AbstractC3191o.n(account, "Account name cannot be null!");
        AbstractC3191o.h(str, "Scope cannot be null!");
        return doWrite(AbstractC3163x.a().d(AbstractC6673h.f67111l).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        }).e(1512).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(@NonNull final Account account) {
        AbstractC3191o.n(account, "account cannot be null.");
        return doWrite(AbstractC3163x.a().d(AbstractC6673h.f67110k).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        }).e(1517).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(@NonNull final String str) {
        AbstractC3191o.n(str, "Client package name cannot be null!");
        return doWrite(AbstractC3163x.a().d(AbstractC6673h.f67110k).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        }).e(1514).a());
    }
}
