package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.dh0;
import defpackage.fun;
import defpackage.wjn;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcms extends com.google.android.gms.ads.internal.client.zzdz {
    public final zzcif a;
    public final boolean c;
    public final boolean d;
    public int e;
    public zzed f;
    public boolean g;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public zzboa n;
    public final Object b = new Object();
    public boolean h = true;

    public zzcms(zzcif zzcifVar, float f, boolean z, boolean z2) {
        this.a = zzcifVar;
        this.i = f;
        this.c = z;
        this.d = z2;
    }

    public final void E4(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        Object obj = this.b;
        boolean z = zzfwVar.zzb;
        boolean z2 = zzfwVar.zzc;
        synchronized (obj) {
            this.l = z;
            this.m = z2;
        }
        boolean z3 = zzfwVar.zza;
        String str = true != z ? "0" : "1";
        String str2 = true != z2 ? "0" : "1";
        String str3 = true != z3 ? "0" : "1";
        dh0 dh0Var = new dh0(3);
        dh0Var.put("muteStart", str3);
        dh0Var.put("customControlsRequested", str);
        dh0Var.put("clickToExpandRequested", str2);
        G4("initialState", Collections.unmodifiableMap(dh0Var));
    }

    public final void F4(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.b) {
            try {
                z2 = true;
                if (f2 == this.i && f3 == this.k) {
                    z2 = false;
                }
                this.i = f2;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.xe)).booleanValue()) {
                    this.j = f;
                }
                z3 = this.h;
                this.h = z;
                i2 = this.e;
                this.e = i;
                float f4 = this.k;
                this.k = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.a.zzE().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                zzboa zzboaVar = this.n;
                if (zzboaVar != null) {
                    zzboaVar.Z1(zzboaVar.J(), 2);
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzcgj.f.execute(new fun(this, i2, i, z3, z));
    }

    public final void G4(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzcgj.f.execute(new wjn(7, this, hashMap));
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() {
        G4("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() {
        G4(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) {
        G4(true != z ? CampaignEx.JSON_NATIVE_VIDEO_UNMUTE : CampaignEx.JSON_NATIVE_VIDEO_MUTE, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() {
        boolean z;
        synchronized (this.b) {
            z = this.h;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() {
        int i;
        synchronized (this.b) {
            i = this.e;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        float f;
        synchronized (this.b) {
            f = this.i;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        float f;
        synchronized (this.b) {
            f = this.j;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(zzed zzedVar) {
        synchronized (this.b) {
            this.f = zzedVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() {
        float f;
        synchronized (this.b) {
            f = this.k;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() {
        boolean z;
        synchronized (this.b) {
            try {
                z = false;
                if (this.c && this.l) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed zzo() {
        zzed zzedVar;
        synchronized (this.b) {
            zzedVar = this.f;
        }
        return zzedVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() {
        boolean z;
        Object obj = this.b;
        boolean zzn = zzn();
        synchronized (obj) {
            z = false;
            if (!zzn) {
                try {
                    if (this.m && this.d) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() {
        G4("stop", null);
    }
}
