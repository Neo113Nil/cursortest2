package com.google.android.gms.internal.ads;

import defpackage.cun;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcxv implements zzbfg {
    public final zzclm a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference();

    public zzcxv(zzclm zzclmVar, Executor executor) {
        this.a = zzclmVar;
        this.b = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized void A(zzbff zzbffVar) {
        zzclm zzclmVar = this.a;
        if (zzclmVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ne)).booleanValue()) {
                boolean z = zzbffVar.j;
                AtomicReference atomicReference = this.c;
                if (z) {
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.b.execute(new cun(zzclmVar, 3));
                    }
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference.getAndSet(bool2))) {
                        this.b.execute(new cun(zzclmVar, 2));
                    }
                }
            }
        }
    }
}
