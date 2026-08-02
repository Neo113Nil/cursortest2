package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzflw {
    public final com.google.android.gms.ads.internal.client.zzfw a;
    public final zzbst b;
    public final zzeua c;
    public final com.google.android.gms.ads.internal.client.zzm d;
    public final Bundle e;
    public final com.google.android.gms.ads.internal.client.zzr f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;
    public final zzbmk j;
    public final com.google.android.gms.ads.internal.client.zzx k;
    public final int l;
    public final AdManagerAdViewOptions m;
    public final PublisherAdViewOptions n;
    public final com.google.android.gms.ads.internal.client.zzcl o;
    public final zzflk p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Bundle t;
    public final AtomicLong u;
    public final boolean v;
    public final JSONArray w;
    public final com.google.android.gms.ads.internal.client.zzcp x;

    public /* synthetic */ zzflw(zzflv zzflvVar) {
        this.f = zzflvVar.b;
        this.g = zzflvVar.c;
        this.x = zzflvVar.x;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflvVar.a;
        this.e = zzmVar.zzC;
        int i = zzmVar.zza;
        long j = zzmVar.zzb;
        Bundle bundle = zzmVar.zzc;
        int i2 = zzmVar.zzd;
        List list = zzmVar.zze;
        boolean z = zzmVar.zzf;
        int i3 = zzmVar.zzg;
        boolean z2 = true;
        if (!zzmVar.zzh && !zzflvVar.e) {
            z2 = false;
        }
        boolean z3 = z2;
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzflvVar.a;
        String str = zzmVar2.zzi;
        com.google.android.gms.ads.internal.client.zzft zzftVar = zzmVar2.zzj;
        Location location = zzmVar2.zzk;
        String str2 = zzmVar2.zzl;
        Bundle bundle2 = zzmVar2.zzm;
        Bundle bundle3 = zzmVar2.zzn;
        List list2 = zzmVar2.zzo;
        String str3 = zzmVar2.zzp;
        String str4 = zzmVar2.zzq;
        boolean z4 = zzmVar2.zzr;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar2.zzs;
        int i4 = zzmVar2.zzt;
        String str5 = zzmVar2.zzu;
        List list3 = zzmVar2.zzv;
        int zza = com.google.android.gms.ads.internal.util.zzs.zza(zzmVar2.zzw);
        com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzflvVar.a;
        com.google.android.gms.ads.internal.client.zzm zzmVar4 = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z3, str, zzftVar, location, str2, bundle2, bundle3, list2, str3, str4, z4, zzcVar, i4, str5, list3, zza, zzmVar3.zzx, zzmVar3.zzy, zzmVar3.zzz, zzmVar3.zzA, zzmVar3.zzB);
        this.d = zzmVar4;
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzflvVar.d;
        zzbmk zzbmkVar = null;
        if (zzfwVar == null) {
            zzbmk zzbmkVar2 = zzflvVar.h;
            zzfwVar = zzbmkVar2 != null ? zzbmkVar2.f : null;
        }
        this.a = zzfwVar;
        ArrayList arrayList = zzflvVar.f;
        this.h = arrayList;
        this.i = zzflvVar.g;
        if (arrayList != null && (zzbmkVar = zzflvVar.h) == null) {
            zzbmkVar = new zzbmk(new NativeAdOptions.Builder().build());
        }
        this.j = zzbmkVar;
        this.k = zzflvVar.i;
        this.l = zzflvVar.m;
        this.m = zzflvVar.j;
        this.n = zzflvVar.k;
        this.o = zzflvVar.l;
        this.b = zzflvVar.n;
        this.p = new zzflk(zzflvVar.o);
        this.q = zzflvVar.p;
        this.r = zzflvVar.q;
        this.c = zzflvVar.r;
        this.s = zzflvVar.s;
        this.t = zzflvVar.t;
        this.u = zzmVar4.zzA != 0 ? new AtomicLong(zzmVar4.zzA) : zzflvVar.u;
        this.v = zzflvVar.v;
        this.w = zzflvVar.w;
    }
}
