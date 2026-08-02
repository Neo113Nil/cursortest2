package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.uun;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzetc extends com.google.android.gms.ads.internal.client.zzbm {
    public final zzeul a;

    public zzetc(Context context, uun uunVar, zzflv zzflvVar, zzdrb zzdrbVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzeun zzeunVar = new zzeun(zzdrbVar, uunVar.u());
        zzeunVar.b.a.set(zzbhVar);
        this.a = new zzeul(new zzeux(uunVar, context, zzeunVar, zzflvVar), zzflvVar.c);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.a.a(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        String str;
        zzeul zzeulVar = this.a;
        synchronized (zzeulVar) {
            try {
                zzddi zzddiVar = zzeulVar.c;
                str = zzddiVar != null ? zzddiVar.a : null;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzg() {
        boolean z;
        zzeul zzeulVar = this.a;
        synchronized (zzeulVar) {
            zzcza zzczaVar = zzeulVar.a.f;
            if (zzczaVar != null) {
                z = zzczaVar.c;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzh() {
        String str;
        zzeul zzeulVar = this.a;
        synchronized (zzeulVar) {
            try {
                zzddi zzddiVar = zzeulVar.c;
                str = zzddiVar != null ? zzddiVar.a : null;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) {
        this.a.a(zzmVar, i);
    }
}
