package com.google.android.gms.internal.ads;

import defpackage.bf3;
import defpackage.mz1;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhmu {
    public static final Logger c = Logger.getLogger(zzhmu.class.getName());
    public static final zzhmu d = new zzhmu();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final synchronized void a(zzhet zzhetVar, boolean z) {
        c(zzhetVar, 1, z);
    }

    public final zzhet b(Class cls, String str) {
        zzhet d2 = d(str);
        if (d2.zzc().equals(cls)) {
            return d2;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d2.getClass());
        String obj = d2.zzc().toString();
        StringBuilder sb = new StringBuilder(mz1.d(name.length() + 53, 23, valueOf) + obj.length());
        bf3.v(sb, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(mz1.o(sb, ", which only supports: ", obj));
    }

    public final synchronized void c(zzhet zzhetVar, int i, boolean z) {
        if (!zzhlx.a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(zzhetVar, z);
    }

    public final synchronized zzhet d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhet) concurrentHashMap.get(str);
    }

    public final synchronized void e(zzhet zzhetVar, boolean z) {
        try {
            String zzb = zzhetVar.zzb();
            if (z) {
                ConcurrentHashMap concurrentHashMap = this.b;
                if (concurrentHashMap.containsKey(zzb) && !((Boolean) concurrentHashMap.get(zzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(zzb));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.a;
            zzhet zzhetVar2 = (zzhet) concurrentHashMap2.get(zzb);
            if (zzhetVar2 != null && !zzhetVar2.getClass().equals(zzhetVar.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(zzb));
                throw new GeneralSecurityException("typeUrl (" + zzb + ") is already registered with " + zzhetVar2.getClass().getName() + ", cannot be re-registered with " + zzhetVar.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(zzb, zzhetVar);
            this.b.put(zzb, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
