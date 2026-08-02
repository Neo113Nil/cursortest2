package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.wh0;
import defpackage.wjn;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdvg extends zzbol {
    public final String a;
    public final zzdqm b;
    public final zzdqr c;
    public final zzeaj d;

    public zzdvg(String str, zzdqm zzdqmVar, zzdqr zzdqrVar, zzeaj zzeajVar) {
        this.a = str;
        this.b = zzdqmVar;
        this.c = zzdqrVar;
        this.d = zzeajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void C2(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdqmVar.n.m(zzdcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void E2(long j) {
        zzdck zzdckVar;
        zzdqm zzdqmVar = this.b;
        if (zzdqmVar == null || (zzdckVar = zzdqmVar.j) == null) {
            return;
        }
        zzdckVar.a(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void Q(zzboj zzbojVar) {
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdqmVar.n.h(zzbojVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void V3(Bundle bundle) {
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdqmVar.n.u(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final long b() {
        zzdck zzdckVar;
        zzdqm zzdqmVar = this.b;
        if (zzdqmVar == null || (zzdckVar = zzdqmVar.j) == null) {
            return 0L;
        }
        return zzdckVar.a.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void g1(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oe)).booleanValue()) {
            zzdqm zzdqmVar = this.b;
            zzclm h = zzdqmVar.m.h();
            if (h == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                zzdqmVar.l.execute(new wjn(12, h, jSONObject));
            } catch (JSONException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error reading event signals", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void h3(Bundle bundle) {
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdqmVar.n.f(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void j() {
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdqmVar.n.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void l1(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        try {
            if (!zzdqVar.zzf()) {
                this.d.b();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdqmVar.G.a.set(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void m1(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdqmVar.n.i(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean o() {
        boolean zzh;
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzh = zzdqmVar.n.zzh();
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean y3(Bundle bundle) {
        return this.b.n(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzA() {
        List list;
        zzew zzewVar;
        zzdqr zzdqrVar = this.c;
        synchronized (zzdqrVar) {
            list = zzdqrVar.f;
        }
        if (list.isEmpty()) {
            return false;
        }
        synchronized (zzdqrVar) {
            zzewVar = zzdqrVar.g;
        }
        return zzewVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzD() {
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdqmVar.n.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzE() {
        zzdqm zzdqmVar = this.b;
        synchronized (zzdqmVar) {
            zzdso zzdsoVar = zzdqmVar.w;
            if (zzdsoVar != null) {
                zzdqmVar.l.execute(new wh0(zzdqmVar, zzdsoVar instanceof zzdrk, 6));
            } else {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbms zzF() {
        zzbms zzbmsVar;
        zzdqo zzdqoVar = this.b.F;
        synchronized (zzdqoVar) {
            zzbmsVar = zzdqoVar.a;
        }
        return zzbmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final com.google.android.gms.ads.internal.client.zzdx zzH() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O7)).booleanValue()) {
            return this.b.f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zze() {
        return this.c.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final List zzf() {
        List list;
        zzdqr zzdqrVar = this.c;
        synchronized (zzdqrVar) {
            list = zzdqrVar.e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzg() {
        return this.c.c();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbmv zzh() {
        zzbmv zzbmvVar;
        zzdqr zzdqrVar = this.c;
        synchronized (zzdqrVar) {
            zzbmvVar = zzdqrVar.s;
        }
        return zzbmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzi() {
        return this.c.e();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzj() {
        return this.c.f();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final double zzk() {
        double d;
        zzdqr zzdqrVar = this.c;
        synchronized (zzdqrVar) {
            d = zzdqrVar.r;
        }
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzl() {
        String p;
        zzdqr zzdqrVar = this.c;
        synchronized (zzdqrVar) {
            p = zzdqrVar.p("store");
        }
        return p;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzm() {
        String p;
        zzdqr zzdqrVar = this.c;
        synchronized (zzdqrVar) {
            p = zzdqrVar.p("price");
        }
        return p;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final com.google.android.gms.ads.internal.client.zzea zzn() {
        return this.c.r();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzp() {
        this.b.m();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbmo zzq() {
        return this.c.s();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zzu() {
        return new ObjectWrapper(this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zzv() {
        IObjectWrapper iObjectWrapper;
        zzdqr zzdqrVar = this.c;
        synchronized (zzdqrVar) {
            iObjectWrapper = zzdqrVar.q;
        }
        return iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final Bundle zzw() {
        return this.c.d();
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final List zzz() {
        List list;
        if (!zzA()) {
            return Collections.EMPTY_LIST;
        }
        zzdqr zzdqrVar = this.c;
        synchronized (zzdqrVar) {
            list = zzdqrVar.f;
        }
        return list;
    }
}
