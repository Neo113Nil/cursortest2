package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
public final class zzyx implements zzbe {
    private static final zziv.zza zza = zziv.zza.zza;
    private static final Collection<Integer> zzb = Arrays.asList(64);
    private static final byte[] zzc = new byte[16];
    private static final ThreadLocal<Cipher> zzd = new zzza();
    private final zzsq zze;
    private final byte[] zzf;
    private final byte[] zzg;

    private zzyx(byte[] bArr, zzaaj zzaajVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (zzb.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.zze = zzzz.zza(zzso.zza(zzsr.zza(copyOfRange.length), zzaal.zza(copyOfRange, zzbf.zza())));
            this.zzg = zzaajVar.zzb();
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    public static zzbe zza(zzja zzjaVar) {
        return new zzyx(zzjaVar.zzf().zza(zzbf.zza()), zzjaVar.zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] zza2;
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        if (length >= bArr3.length + 16) {
            if (zzqn.zza(bArr3, bArr)) {
                Cipher cipher = zzd.get();
                byte[] bArr4 = this.zzg;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
                byte[] bArr5 = (byte[]) copyOfRange.clone();
                bArr5[8] = (byte) (bArr5[8] & ByteCompanionObject.MAX_VALUE);
                bArr5[12] = (byte) (bArr5[12] & ByteCompanionObject.MAX_VALUE);
                cipher.init(2, new SecretKeySpec(this.zzf, "AES"), new IvParameterSpec(bArr5));
                int length2 = this.zzg.length + 16;
                int length3 = bArr.length - length2;
                byte[] doFinal = cipher.doFinal(bArr, length2, length3);
                if (length3 == 0 && doFinal == null && zzaaf.zza()) {
                    doFinal = new byte[0];
                }
                byte[][] bArr6 = {bArr2, doFinal};
                byte[] zza3 = this.zze.zza(zzc, 16);
                for (int i10 = 0; i10 <= 0; i10++) {
                    byte[] bArr7 = bArr6[i10];
                    if (bArr7 == null) {
                        bArr7 = new byte[0];
                    }
                    zza3 = zzyz.zza(zzsf.zzb(zza3), this.zze.zza(bArr7, 16));
                }
                byte[] bArr8 = bArr6[1];
                if (bArr8.length >= 16) {
                    if (bArr8.length >= zza3.length) {
                        int length4 = bArr8.length - zza3.length;
                        zza2 = Arrays.copyOf(bArr8, bArr8.length);
                        for (int i11 = 0; i11 < zza3.length; i11++) {
                            int i12 = length4 + i11;
                            zza2[i12] = (byte) (zza2[i12] ^ zza3[i11]);
                        }
                    } else {
                        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                    }
                } else {
                    zza2 = zzyz.zza(zzsf.zza(bArr8), zzsf.zzb(zza3));
                }
                if (MessageDigest.isEqual(copyOfRange, this.zze.zza(zza2, 16))) {
                    return doFinal;
                }
                throw new AEADBadTagException("Integrity check failed.");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
