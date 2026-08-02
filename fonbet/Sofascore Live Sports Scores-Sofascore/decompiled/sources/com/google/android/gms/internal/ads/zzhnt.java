package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhnt {
    public static final zzhnt b = new zzhnt();
    public final AtomicReference a = new AtomicReference(new zzhoo(new zzhol(0)));

    public final synchronized void a(zzhok zzhokVar) {
        AtomicReference atomicReference = this.a;
        zzhol zzholVar = new zzhol((zzhoo) atomicReference.get());
        zzholVar.a(zzhokVar);
        atomicReference.set(new zzhoo(zzholVar));
    }

    public final synchronized void b(zzhoq zzhoqVar) {
        AtomicReference atomicReference = this.a;
        zzhol zzholVar = new zzhol((zzhoo) atomicReference.get());
        HashMap hashMap = zzholVar.b;
        Class zza = zzhoqVar.zza();
        if (hashMap.containsKey(zza)) {
            zzhoq zzhoqVar2 = (zzhoq) hashMap.get(zza);
            if (!zzhoqVar2.equals(zzhoqVar) || !zzhoqVar.equals(zzhoqVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zza.toString()));
            }
        } else {
            hashMap.put(zza, zzhoqVar);
        }
        atomicReference.set(new zzhoo(zzholVar));
    }
}
