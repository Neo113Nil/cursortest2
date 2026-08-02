package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzyw implements zzba {
    private static final zziv.zza zza = zziv.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzyv();
    private final byte[] zzc;
    private final zzsq zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    private zzyw(byte[] bArr, int i10, byte[] bArr2) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzf = i10;
        zzaai.zza(bArr.length);
        this.zze = new SecretKeySpec(bArr, "AES");
        this.zzd = zzzz.zza(zzso.zza(zzsr.zza(bArr.length), zzaal.zza(bArr, zzbf.zza())));
        this.zzc = bArr2;
    }

    public static zzba zza(zzdl zzdlVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (((zzdq) ((zzcy) zzdlVar.zza())).zzd() == 16) {
            return new zzyw(zzdlVar.zzf().zza(zzbf.zza()), ((zzdq) ((zzcy) zzdlVar.zza())).zzb(), zzdlVar.zzd().zzb());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + ((zzdq) ((zzcy) zzdlVar.zza())).zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i10 = this.zzf;
        if (length > (length2 - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i10 + bArr.length + 16);
        byte[] zza2 = zzqd.zza(this.zzf);
        System.arraycopy(zza2, 0, copyOf, this.zzc.length, this.zzf);
        byte[] zza3 = zza(0, zza2, 0, zza2.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] zza4 = zza(1, bArr2, 0, bArr2.length);
        Cipher cipher = zzb.get();
        cipher.init(1, this.zze, new IvParameterSpec(zza3));
        cipher.doFinal(bArr, 0, bArr.length, copyOf, this.zzc.length + this.zzf);
        byte[] zza5 = zza(2, copyOf, this.zzc.length + this.zzf, bArr.length);
        int length3 = this.zzc.length + bArr.length + this.zzf;
        for (int i11 = 0; i11 < 16; i11++) {
            copyOf[length3 + i11] = (byte) ((zza4[i11] ^ zza3[i11]) ^ zza5[i11]);
        }
        return copyOf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        int length2 = ((length - bArr3.length) - this.zzf) - 16;
        if (length2 >= 0) {
            if (zzqn.zza(bArr3, bArr)) {
                byte[] zza2 = zza(0, bArr, this.zzc.length, this.zzf);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] zza3 = zza(1, bArr2, 0, bArr2.length);
                byte[] zza4 = zza(2, bArr, this.zzc.length + this.zzf, length2);
                int length3 = bArr.length - 16;
                byte b10 = 0;
                for (int i10 = 0; i10 < 16; i10++) {
                    b10 = (byte) (b10 | (((bArr[length3 + i10] ^ zza3[i10]) ^ zza2[i10]) ^ zza4[i10]));
                }
                if (b10 == 0) {
                    Cipher cipher = zzb.get();
                    cipher.init(1, this.zze, new IvParameterSpec(zza2));
                    return cipher.doFinal(bArr, this.zzc.length + this.zzf, length2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private final byte[] zza(int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12 + 16];
        bArr2[15] = (byte) i10;
        System.arraycopy(bArr, i11, bArr2, 16, i12);
        return this.zzd.zza(bArr2, 16);
    }
}
