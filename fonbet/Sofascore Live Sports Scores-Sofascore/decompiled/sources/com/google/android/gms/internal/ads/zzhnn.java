package com.google.android.gms.internal.ads;

import defpackage.jmo;
import defpackage.sw9;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhnn {
    public static final zzhnn b;
    public final HashMap a = new HashMap();

    static {
        jmo jmoVar = jmo.k;
        zzhnn zzhnnVar = new zzhnn();
        try {
            zzhnnVar.a(jmoVar, zzhnf.class);
            b = zzhnnVar;
        } catch (GeneralSecurityException e) {
            sw9.m("unexpected error.", e);
        }
    }

    public final synchronized void a(zzhmt zzhmtVar, Class cls) {
        try {
            HashMap hashMap = this.a;
            zzhmt zzhmtVar2 = (zzhmt) hashMap.get(cls);
            if (zzhmtVar2 != null && !zzhmtVar2.equals(zzhmtVar)) {
                String obj = cls.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(obj);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            hashMap.put(cls, zzhmtVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzhes b(zzhfj zzhfjVar, Integer num) {
        zzhmt zzhmtVar;
        zzhmtVar = (zzhmt) this.a.get(zzhfjVar.getClass());
        if (zzhmtVar == null) {
            String obj = zzhfjVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(obj);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return zzhmtVar.a(zzhfjVar, num);
    }
}
