package com.google.android.gms.internal.gtm;

import C.o0;
import N3.C3660k;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes9.dex */
public abstract class zztd implements Iterable<Byte>, Serializable {
    private static final Comparator<zztd> zza;
    public static final zztd zzb = new zzta(zzvi.zzc);
    private static final zztc zzd;
    private int zzc = 0;

    static {
        int i11 = zzsk.zza;
        zzd = new zztc(null);
        zza = new zzsv();
    }

    zztd() {
    }

    static int zzk(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i11);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < i11) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i12);
        sb4.append(" >= ");
        sb4.append(i13);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static zztd zzm(byte[] bArr) {
        return zzn(bArr, 0, bArr.length);
    }

    public static zztd zzn(byte[] bArr, int i11, int i12) {
        zzk(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzta(bArr2);
    }

    public static zztd zzo(String str) {
        return new zzta(str.getBytes(zzvi.zza));
    }

    static zztd zzp(byte[] bArr) {
        return new zzta(bArr);
    }

    static zztd zzq(byte[] bArr, int i11, int i12) {
        return new zzsx(bArr, i11, i12);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.zzc;
        if (i11 == 0) {
            int zzd2 = zzd();
            i11 = zzf(zzd2, 0, zzd2);
            if (i11 == 0) {
                i11 = 1;
            }
            this.zzc = i11;
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new zzst(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o0.c(C3660k.c(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzxm.zza(this) : String.valueOf(zzxm.zza(zzg(0, 47))).concat("..."), "\">");
    }

    public abstract byte zza(int i11);

    abstract byte zzb(int i11);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i11, int i12, int i13);

    protected abstract int zzf(int i11, int i12, int i13);

    public abstract zztd zzg(int i11, int i12);

    protected abstract String zzh(Charset charset);

    abstract void zzi(zzss zzssVar) throws IOException;

    public abstract boolean zzj();

    protected final int zzl() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }
}
