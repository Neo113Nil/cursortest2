package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes2.dex */
public final class zznd implements zzbx {
    private static final Object zza = new Object();

    public static final class zza {
        public zza() {
            zznd.zza();
        }
    }

    public zznd() {
        this(new zza());
    }

    public static /* synthetic */ boolean zza() {
        return true;
    }

    public static boolean zzc(String str) {
        synchronized (zza) {
            try {
                String zza2 = zzaai.zza("android-keystore://", str);
                if (zzmz.zzb(zza2)) {
                    return false;
                }
                KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(build);
                keyGenerator.generateKey();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbx
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    private zznd(zza zzaVar) {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbx
    public final zzba zza(String str) {
        zznb zznbVar;
        try {
            synchronized (zza) {
                try {
                    zznbVar = new zznb(zzaai.zza("android-keystore://", str));
                    byte[] zza2 = zzqd.zza(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(zza2, zznbVar.zza(zznbVar.zzb(zza2, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zznbVar;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
