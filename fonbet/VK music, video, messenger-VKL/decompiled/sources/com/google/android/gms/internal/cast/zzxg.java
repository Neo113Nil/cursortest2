package com.google.android.gms.internal.cast;

import java.io.IOException;
import xsna.z23;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzxg extends zzxi {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zzxg(byte[] bArr, int i, int i2) {
        super(null);
        zzxk.zzj(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final byte zza(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(z23.b(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final zzxk zzd(int i, int i2) {
        int zzj = zzxk.zzj(i, i2, this.zzd);
        return zzj == 0 ? zzxk.zza : new zzxg(this.zzb, this.zzc + i, zzj);
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final void zze(zzxd zzxdVar) throws IOException {
        ((zzxn) zzxdVar).zzs(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final boolean zzf(zzxk zzxkVar) {
        boolean z = zzxkVar instanceof zzxj;
        if (!z && !(zzxkVar instanceof zzxg)) {
            return zzxkVar.zzf(this);
        }
        int i = this.zzd;
        if (i > zzxkVar.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= zzxkVar.zzc()) {
            if (z) {
                return zzxk.zzk(this.zzb, this.zzc, ((zzxj) zzxkVar).zzh(), 0, i);
            }
            if (zzxkVar instanceof zzxg) {
                zzxg zzxgVar = (zzxg) zzxkVar;
                return zzxk.zzk(this.zzb, this.zzc, zzxgVar.zzb, zzxgVar.zzc, i);
            }
            zzxk zzd = zzxkVar.zzd(0, i);
            int i2 = this.zzc;
            return zzd.equals(zzd(i2, i + i2));
        }
        int zzc = zzxkVar.zzc();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(zzc).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(zzc);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final int zzg(int i, int i2, int i3) {
        return zzym.zzb(i, this.zzb, this.zzc, i3);
    }

    public final /* synthetic */ byte[] zzh() {
        return this.zzb;
    }

    public final /* synthetic */ int zzi() {
        return this.zzc;
    }
}
