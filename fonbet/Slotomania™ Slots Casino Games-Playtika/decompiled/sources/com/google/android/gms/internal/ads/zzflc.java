package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzflc {
    public zzflc() {
        try {
            zzheb.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] bArr;
        try {
            zzhdn zzg = zzhdn.zzg(zzhdf.zzb(zzhmf.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzhcy.zzb(zzg, zzhcx.zzb(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, @Nullable String str, zzdyu zzdyuVar) {
        zzhdn zzc;
        if (str != null && (zzc = zzc(str)) != null) {
            try {
                byte[] zza = ((zzhcu) zzc.zzh(zzhkj.zza(), zzhcu.class)).zza(bArr, bArr2);
                zzdyuVar.zzc().put("ds", "1");
                return new String(zza, StandardCharsets.UTF_8);
            } catch (UnsupportedOperationException | GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.decrypt");
                zzdyuVar.zzc().put("dsf", e.toString());
            }
        }
        return null;
    }

    @Nullable
    private static final zzhdn zzc(String str) {
        try {
            try {
                return zzhcy.zza(zzhcw.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
