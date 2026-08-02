package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.ironsource.L6;
import defpackage.ddb;
import defpackage.gsn;
import defpackage.hsn;
import defpackage.q6o;
import defpackage.r6o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzexw implements zzfdi {
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b = new AtomicReference(Boolean.FALSE);
    public final Clock c;
    public final hsn d;
    public final zzfdi e;
    public final long f;
    public final zzeaj g;

    public zzexw(zzfdi zzfdiVar, long j, Clock clock, hsn hsnVar, zzeaj zzeajVar) {
        this.c = clock;
        this.e = zzfdiVar;
        this.f = j;
        this.d = hsnVar;
        this.g = zzeajVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r1.b < r1.c.elapsedRealtime()) goto L8;
     */
    @Override // com.google.android.gms.internal.ads.zzfdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ddb zza() {
        q6o q6oVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.wd)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.vd)).booleanValue() && !((Boolean) this.b.getAndSet(Boolean.TRUE)).booleanValue()) {
                gsn gsnVar = zzcgj.d;
                r6o r6oVar = new r6o(this, 1);
                long j = this.f;
                gsnVar.scheduleWithFixedDelay(r6oVar, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.a;
                    q6oVar = (q6o) atomicReference.get();
                    if (q6oVar == null) {
                        ddb zza = this.e.zza();
                        atomicReference.set(new q6o(zza, this.f, this.c));
                        return zza;
                    }
                    if (!((Boolean) this.b.get()).booleanValue()) {
                        if (q6oVar.b < q6oVar.c.elapsedRealtime()) {
                            ddb ddbVar = q6oVar.a;
                            zzfdi zzfdiVar = this.e;
                            q6o q6oVar2 = new q6o(zzfdiVar.zza(), this.f, this.c);
                            this.a.set(q6oVar2);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.xd)).booleanValue()) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.yd)).booleanValue()) {
                                    zzeai a = this.g.a();
                                    a.b("action", "scs");
                                    a.b(L6.e1, String.valueOf(zzfdiVar.zzb()));
                                    a.c();
                                }
                                return ddbVar;
                            }
                            q6oVar = q6oVar2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.a;
            q6oVar = (q6o) atomicReference2.get();
            if (q6oVar != null) {
            }
            zzfdi zzfdiVar2 = this.e;
            q6o q6oVar3 = new q6o(zzfdiVar2.zza(), this.f, this.c);
            atomicReference2.set(q6oVar3);
            q6oVar = q6oVar3;
        }
        return q6oVar.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return this.e.zzb();
    }
}
