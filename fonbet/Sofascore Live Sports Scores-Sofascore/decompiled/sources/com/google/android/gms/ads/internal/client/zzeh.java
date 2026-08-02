package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeh {
    public final String a;
    public final ArrayList b;
    public final Set c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final int g;
    public final Set h;
    public final Bundle i;
    public final Set j;
    public final boolean k;
    public final String l;
    public final int m;
    public long n = 0;
    public final long o;

    public zzeh(zzeg zzegVar) {
        this.o = 0L;
        this.a = zzegVar.g;
        this.b = zzegVar.h;
        this.c = Collections.unmodifiableSet(zzegVar.a);
        this.d = zzegVar.b;
        Collections.unmodifiableMap(zzegVar.c);
        this.e = zzegVar.i;
        this.f = zzegVar.j;
        this.g = zzegVar.k;
        this.h = Collections.unmodifiableSet(zzegVar.d);
        this.i = zzegVar.e;
        this.j = Collections.unmodifiableSet(zzegVar.f);
        this.k = zzegVar.l;
        this.l = zzegVar.m;
        this.m = zzegVar.n;
        this.o = zzegVar.o;
    }

    public final String zza() {
        return this.a;
    }

    public final List zzb() {
        return new ArrayList(this.b);
    }

    public final Set zzc() {
        return this.c;
    }

    @Nullable
    public final Bundle zzd(Class cls) {
        return this.d.getBundle(cls.getName());
    }

    @Nullable
    public final Bundle zze(Class cls) {
        Bundle bundle = this.d.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String zzf() {
        return this.e;
    }

    public final String zzg() {
        return this.f;
    }

    public final boolean zzh(Context context) {
        RequestConfiguration zzp = zzeu.zzb().zzp();
        zzay.zza();
        String zzF = com.google.android.gms.ads.internal.util.client.zzf.zzF(context);
        return this.h.contains(zzF) || zzp.getTestDeviceIds().contains(zzF);
    }

    public final Bundle zzi() {
        return this.d;
    }

    public final int zzj() {
        return this.g;
    }

    public final Bundle zzk() {
        return this.i;
    }

    public final Set zzl() {
        return this.j;
    }

    @Deprecated
    public final boolean zzm() {
        return this.k;
    }

    @Nullable
    public final String zzn() {
        return this.l;
    }

    public final int zzo() {
        return this.m;
    }

    public final void zzp(long j) {
        this.n = j;
    }

    public final long zzq() {
        return this.n;
    }

    public final long zzr() {
        return this.o;
    }
}
