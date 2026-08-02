package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhqr implements zzhpn {
    public static zzhqr a(zzhpf zzhpfVar, Provider provider) {
        zzhqr zzhqrVar = new zzhqr();
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhpfVar.c.b();
            zzicj zzicjVar = zzhpfVar.b;
            zzhfr zzhfrVar = zzhfr.a;
            new SecretKeySpec(zzicjVar.a.b(), "AES");
            return zzhqrVar;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
