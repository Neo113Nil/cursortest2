package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import xsna.i5s;
import xsna.xy6;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzxk implements Iterable, Serializable {
    public static final zzxk zza = new zzxj(zzym.zzb);
    private int zzb = 0;

    static {
        int i = zzxb.zza;
    }

    public static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static /* synthetic */ boolean zzk(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzj(i, i4, bArr.length);
        zzj(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzxk)) {
            return false;
        }
        zzxk zzxkVar = (zzxk) obj;
        int zzc = zzc();
        if (zzc != zzxkVar.zzc()) {
            return false;
        }
        if (zzc == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzxkVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzf(zzxkVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int zzc = zzc();
            i = zzg(zzc, 0, zzc);
            if (i == 0) {
                i = 1;
            }
            this.zzb = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzxe(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return i5s.a(xy6.b(zzc(), "<ByteString@", hexString, " size=", " contents=\""), zzc() <= 50 ? zzaab.zza(this) : zzaab.zza(zzd(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzxk zzd(int i, int i2);

    public abstract void zze(zzxd zzxdVar) throws IOException;

    public abstract boolean zzf(zzxk zzxkVar);

    public abstract int zzg(int i, int i2, int i3);
}
