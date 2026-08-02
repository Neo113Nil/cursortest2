package com.google.android.gms.internal.p002firebaseauthapi;

import G9.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzagh extends zzael {
    private final String zza;
    private final /* synthetic */ zzagc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagh(zzagc zzagcVar, zzael zzaelVar, String str) {
        super(zzaelVar);
        Objects.requireNonNull(zzagcVar);
        this.zzb = zzagcVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael, com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status) {
        a aVar;
        HashMap hashMap;
        aVar = zzagc.zza;
        int i10 = 0;
        aVar.c("SMS verification code request failed: " + c.getStatusCodeString(status.i()) + " " + status.j(), new Object[0]);
        hashMap = this.zzb.zzd;
        zzagj zzagjVar = (zzagj) hashMap.get(this.zza);
        if (zzagjVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(zzagjVar.zzb);
        this.zzb.zzb(this.zza);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((zzael) obj).zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael, com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb(String str) {
        a aVar;
        HashMap hashMap;
        aVar = zzagc.zza;
        aVar.a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzagj zzagjVar = (zzagj) hashMap.get(this.zza);
        if (zzagjVar == null) {
            return;
        }
        Iterator<zzael> it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzagjVar.zzg = true;
        zzagjVar.zzd = str;
        if (zzagjVar.zza <= 0) {
            this.zzb.zze(this.zza);
        } else if (!zzagjVar.zzc) {
            this.zzb.zzd(this.zza);
        } else {
            if (zzac.zzc(zzagjVar.zze)) {
                return;
            }
            zzagc.zzb(this.zzb, this.zza);
        }
    }
}
