package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import B0.A0;
import C.o0;
import Ej.b;
import N3.C3660k;
import T7.E;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes9.dex */
public abstract class zzdf implements Iterable, Serializable {
    public static final zzdf zzb = new zzde(zzep.zzb);
    private int zza = 0;

    static {
        int i11 = zzct.zza;
    }

    zzdf() {
    }

    private static zzdf zzc(Iterator it, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(E.a(i11, "length (", ") must be >= 1"));
        }
        if (i11 == 1) {
            return (zzdf) it.next();
        }
        int i12 = i11 >>> 1;
        zzdf zzc = zzc(it, i12);
        zzdf zzc2 = zzc(it, i11 - i12);
        if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
            return zzgd.zzy(zzc, zzc2);
        }
        throw new IllegalArgumentException(A0.a(zzc.zzd(), zzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    static int zzo(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(E.a(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(A0.a(i11, i12, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A0.a(i12, i13, "End index: ", " >= "));
    }

    public static zzdf zzr(byte[] bArr, int i11, int i12) {
        zzo(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zzde(bArr2);
    }

    public static zzdf zzs(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i11 = 256;
        while (true) {
            byte[] bArr = new byte[i11];
            int i12 = 0;
            while (i12 < i11) {
                int read = inputStream.read(bArr, i12, i11 - i12);
                if (read == -1) {
                    break;
                }
                i12 += read;
            }
            zzdf zzr = i12 == 0 ? null : zzr(bArr, 0, i12);
            if (zzr == null) {
                break;
            }
            arrayList.add(zzr);
            i11 = Math.min(i11 + i11, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    static void zzu(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 >= 0) {
                throw new ArrayIndexOutOfBoundsException(A0.a(i11, i12, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(b.a(i11, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.zza;
        if (i11 == 0) {
            int zzd = zzd();
            i11 = zzi(zzd, 0, zzd);
            if (i11 == 0) {
                i11 = 1;
            }
            this.zza = i11;
        }
        return i11;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o0.c(C3660k.c(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzgq.zza(this) : zzgq.zza(zzk(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i11);

    abstract byte zzb(int i11);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i11, int i12, int i13);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i11, int i12, int i13);

    protected abstract int zzj(int i11, int i12, int i13);

    public abstract zzdf zzk(int i11, int i12);

    protected abstract String zzl(Charset charset);

    abstract void zzm(zzcx zzcxVar) throws IOException;

    public abstract boolean zzn();

    protected final int zzp() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzdb iterator() {
        return new zzcy(this);
    }

    public final String zzt() {
        return zzd() == 0 ? "" : zzl(zzep.zza);
    }

    @Deprecated
    public final void zzv(byte[] bArr, int i11, int i12, int i13) {
        zzo(0, i13, zzd());
        zzo(i12, i12 + i13, bArr.length);
        if (i13 > 0) {
            zze(bArr, 0, i12, i13);
        }
    }

    public final byte[] zzw() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzep.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }
}
