package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import kb.C;
import lb.C5436o;
import lb.m0;

/* loaded from: classes2.dex */
final class zzacw extends zzaff<C, m0> {
    private final String zzv;
    private final String zzw;

    public zzacw(String str, String str2) {
        super(3);
        AbstractC3191o.h(str, "email cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(new C5436o(this.zzl.zza() == null ? zzah.zzg() : (List) AbstractC3191o.m(this.zzl.zza())));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zze(this.zzv, this.zzw, this.zzb);
    }
}
