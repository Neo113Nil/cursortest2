package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzxj extends zzxi {
    private final byte[] zzb;

    public zzxj(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final int zzc() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final zzxk zzd(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzj = zzxk.zzj(0, i2, bArr.length);
        return zzj == 0 ? zzxk.zza : new zzxg(bArr, 0, zzj);
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final void zze(zzxd zzxdVar) throws IOException {
        byte[] bArr = this.zzb;
        ((zzxn) zzxdVar).zzs(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final boolean zzf(zzxk zzxkVar) {
        boolean z = zzxkVar instanceof zzxj;
        if (z) {
            return Arrays.equals(this.zzb, ((zzxj) zzxkVar).zzb);
        }
        boolean z2 = zzxkVar instanceof zzxg;
        if (!z2) {
            return zzxkVar.zzf(this);
        }
        byte[] bArr = this.zzb;
        int zzc = zzxkVar.zzc();
        int length = bArr.length;
        if (length > zzc) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= zzxkVar.zzc()) {
            if (z) {
                return zzxk.zzk(bArr, 0, ((zzxj) zzxkVar).zzb, 0, length);
            }
            if (!z2) {
                return zzxkVar.zzd(0, length).equals(zzd(0, length));
            }
            zzxg zzxgVar = (zzxg) zzxkVar;
            return zzxk.zzk(bArr, 0, zzxgVar.zzh(), zzxgVar.zzi(), length);
        }
        int zzc2 = zzxkVar.zzc();
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(zzc2).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(zzc2);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final int zzg(int i, int i2, int i3) {
        return zzym.zzb(i, this.zzb, 0, i3);
    }

    public final /* synthetic */ byte[] zzh() {
        return this.zzb;
    }
}
