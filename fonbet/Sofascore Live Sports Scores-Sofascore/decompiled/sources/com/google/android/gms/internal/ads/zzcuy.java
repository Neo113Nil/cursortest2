package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import defpackage.ddb;
import defpackage.hlo;
import defpackage.hsn;
import defpackage.ilo;
import defpackage.mwn;
import defpackage.nkn;
import defpackage.spn;
import defpackage.tpn;
import defpackage.ue8;
import defpackage.vlo;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcuy implements zzbfg, zzdek, com.google.android.gms.ads.internal.overlay.zzr, zzdej {
    public final zzcut a;
    public final zzcuu b;
    public final zzbvm d;
    public final Executor e;
    public final Clock f;
    public final HashSet c = new HashSet();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final zzcux h = new zzcux();
    public boolean i = false;
    public WeakReference j = new WeakReference(this);

    public zzcuy(zzbvj zzbvjVar, zzcuu zzcuuVar, Executor executor, zzcut zzcutVar, Clock clock) {
        this.a = zzcutVar;
        zzbvjVar.a();
        this.d = new zzbvm(zzbvjVar.b);
        this.b = zzcuuVar;
        this.e = executor;
        this.f = clock;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized void A(zzbff zzbffVar) {
        zzcux zzcuxVar = this.h;
        zzcuxVar.a = zzbffVar.j;
        zzcuxVar.e = zzbffVar;
        h();
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final synchronized void M(Context context) {
        this.h.b = false;
        h();
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final synchronized void c(Context context) {
        this.h.d = "u";
        h();
        n();
        this.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void h() {
        try {
            int i = 1;
            if (this.j.get() == null) {
                synchronized (this) {
                    n();
                    this.i = true;
                }
                return;
            }
            if (this.i || !this.g.get()) {
                return;
            }
            try {
                zzcux zzcuxVar = this.h;
                zzcuxVar.c = this.f.elapsedRealtime();
                JSONObject zzb = this.b.zzb(zzcuxVar);
                Iterator it = this.c.iterator();
                while (true) {
                    boolean z = false;
                    Object[] objArr = 0;
                    if (!it.hasNext()) {
                        zzbvm zzbvmVar = this.d;
                        zzbvmVar.getClass();
                        spn spnVar = new spn(i, zzbvmVar, zzb);
                        ddb ddbVar = zzbvmVar.a;
                        hsn hsnVar = zzcgj.h;
                        hlo h = zzhcy.h(ddbVar, spnVar, hsnVar);
                        h.addListener(new vlo(objArr == true ? 1 : 0, h, new ue8("ActiveViewListener.callActiveViewJs", 2)), hsnVar);
                        return;
                    }
                    this.e.execute(new nkn(zzb, (zzclm) it.next(), z, 11));
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void j() {
        int i = 0;
        if (this.g.compareAndSet(false, true)) {
            zzcut zzcutVar = this.a;
            zzbvj zzbvjVar = zzcutVar.b;
            mwn mwnVar = zzcutVar.e;
            zzbvjVar.a();
            ddb ddbVar = zzbvjVar.b;
            spn spnVar = new spn(i, "/updateActiveView", mwnVar);
            hsn hsnVar = zzcgj.h;
            zzbvjVar.b = zzhcy.h(ddbVar, spnVar, hsnVar);
            mwn mwnVar2 = zzcutVar.f;
            zzbvjVar.a();
            zzbvjVar.b = zzhcy.h(zzbvjVar.b, new spn(i, "/untrackActiveViewUnit", mwnVar2), hsnVar);
            zzcutVar.d = this;
            h();
        }
    }

    public final void n() {
        Iterator it = this.c.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            zzcut zzcutVar = this.a;
            if (!hasNext) {
                zzbvj zzbvjVar = zzcutVar.b;
                mwn mwnVar = zzcutVar.e;
                ddb ddbVar = zzbvjVar.b;
                int i = 0;
                tpn tpnVar = new tpn(i, str2, mwnVar);
                hsn hsnVar = zzcgj.h;
                ilo i2 = zzhcy.i(ddbVar, tpnVar, hsnVar);
                zzbvjVar.b = i2;
                zzbvjVar.b = zzhcy.i(i2, new tpn(i, str, zzcutVar.f), hsnVar);
                return;
            }
            zzclm zzclmVar = (zzclm) it.next();
            zzclmVar.P("/updateActiveView", zzcutVar.e);
            zzclmVar.P("/untrackActiveViewUnit", zzcutVar.f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final synchronized void zza(Context context) {
        this.h.b = true;
        h();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        this.h.b = true;
        h();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        this.h.b = false;
        h();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
    }
}
