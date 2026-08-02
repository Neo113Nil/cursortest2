package com.google.android.gms.internal.ads;

import android.util.Base64;
import defpackage.yhk;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfmm {
    public zzfmm() {
        try {
            zzhfv.a();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().d("CryptoUtils.registerAead", e);
        }
    }

    public static final String a(byte[] bArr, byte[] bArr2, String str, zzeae zzeaeVar) {
        zzhfd zzhfdVar;
        if (str != null) {
            try {
            } catch (GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().d("CryptoUtils.getHandle", e);
                zzhfdVar = null;
            }
            try {
                zzhfdVar = zzhfd.a(new zzhem(new ByteArrayInputStream(Base64.decode(str, 11))).a());
                try {
                    if (zzhfdVar != null) {
                        try {
                        } catch (GeneralSecurityException e2) {
                            try {
                                yhk.q(e2);
                            } catch (GeneralSecurityException e3) {
                                e = e3;
                                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                                com.google.android.gms.ads.internal.zzt.zzh().d("CryptoUtils.decrypt", e);
                                zzeaeVar.a.put("dsf", e.toString());
                                return null;
                            }
                        }
                        if (zzhly.a()) {
                            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
                        }
                        byte[] c = ((zzhek) zzhfdVar.f(zzhfy.a, zzhek.class)).c(bArr, bArr2);
                        zzeaeVar.a.put("ds", "1");
                        return new String(c, StandardCharsets.UTF_8);
                    }
                } catch (UnsupportedOperationException e4) {
                    e = e4;
                }
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        }
        return null;
    }
}
