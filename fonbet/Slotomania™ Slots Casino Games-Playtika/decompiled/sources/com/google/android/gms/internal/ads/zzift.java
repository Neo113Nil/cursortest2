package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzift extends zzicn {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzicn zzd;
    private final zzicn zze;
    private final int zzf;
    private final int zzg;

    private zzift(zzicn zzicnVar, zzicn zzicnVar2) {
        this.zzd = zzicnVar;
        this.zze = zzicnVar2;
        int zzb2 = zzicnVar.zzb();
        this.zzf = zzb2;
        this.zzc = zzb2 + zzicnVar2.zzb();
        this.zzg = Math.max(zzicnVar.zzp(), zzicnVar2.zzp()) + 1;
    }

    /* synthetic */ zzift(zzicn zzicnVar, zzicn zzicnVar2, byte[] bArr) {
        this(zzicnVar, zzicnVar2);
    }

    private static zzicn zzG(zzicn zzicnVar, zzicn zzicnVar2) {
        int zzb2 = zzicnVar.zzb();
        int zzb3 = zzicnVar2.zzb();
        byte[] bArr = new byte[zzb2 + zzb3];
        zzicnVar.zzz(bArr, 0, 0, zzb2);
        zzicnVar2.zzz(bArr, 0, zzb2, zzb3);
        return zzicn.zzv(bArr);
    }

    static zzicn zzk(zzicn zzicnVar, zzicn zzicnVar2) {
        if (zzicnVar2.zzb() == 0) {
            return zzicnVar;
        }
        if (zzicnVar.zzb() == 0) {
            return zzicnVar2;
        }
        int zzb2 = zzicnVar.zzb() + zzicnVar2.zzb();
        if (zzb2 < 128) {
            return zzG(zzicnVar, zzicnVar2);
        }
        if (zzicnVar instanceof zzift) {
            zzift zziftVar = (zzift) zzicnVar;
            zzicn zzicnVar3 = zziftVar.zze;
            if (zzicnVar3.zzb() + zzicnVar2.zzb() < 128) {
                return new zzift(zziftVar.zzd, zzG(zzicnVar3, zzicnVar2));
            }
            zzicn zzicnVar4 = zziftVar.zzd;
            if (zzicnVar4.zzp() > zzicnVar3.zzp() && zziftVar.zzg > zzicnVar2.zzp()) {
                return new zzift(zzicnVar4, new zzift(zzicnVar3, zzicnVar2));
            }
        }
        return zzb2 >= zzn(Math.max(zzicnVar.zzp(), zzicnVar2.zzp()) + 1) ? new zzift(zzicnVar, zzicnVar2) : zzifr.zza(zzicnVar, zzicnVar2, new ArrayDeque());
    }

    static int zzn(int i) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzicn, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzifq(this);
    }

    final /* synthetic */ zzicn zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    final byte zza(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zza(i) : this.zze.zza(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzc(int i, int i2) {
        return zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzd(int i, int i2) {
        int i3 = this.zzc;
        int zzD = zzD(i, i2, i3);
        if (zzD == 0) {
            return zzicn.zza;
        }
        if (zzD == i3) {
            return this;
        }
        int i4 = this.zzf;
        if (i2 <= i4) {
            return this.zzd.zzc(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.zze.zzc(i - i4, i5);
        }
        zzicn zzicnVar = this.zzd;
        return new zzift(zzicnVar.zzc(i, zzicnVar.zzb()), this.zze.zzc(0, i5));
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    final void zzg(zzice zziceVar) throws IOException {
        this.zzd.zzg(zziceVar);
        this.zze.zzg(zziceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final String zzh(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzi() {
        zzifs zzifsVar = new zzifs(this, null);
        while (zzifsVar.hasNext()) {
            if (!zzifsVar.next().zzi()) {
                return zzigt.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzj(zzicn zzicnVar) {
        byte[] bArr = null;
        zzifs zzifsVar = new zzifs(this, bArr);
        zzick next = zzifsVar.next();
        zzifs zzifsVar2 = new zzifs(zzicnVar, bArr);
        zzick next2 = zzifsVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzb2 = next.zzb() - i;
            int zzb3 = next2.zzb() - i2;
            int min = Math.min(zzb2, zzb3);
            if (!(i == 0 ? next.zzk(next2, i2, min) : next2.zzk(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzb2) {
                i = 0;
                next = zzifsVar.next();
            } else {
                i += min;
                next = next;
            }
            if (min == zzb3) {
                next2 = zzifsVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final int zzl(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzl(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzl(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzl(this.zzd.zzl(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicr zzm() {
        ArrayList arrayList = new ArrayList();
        zzifs zzifsVar = new zzifs(this, null);
        while (zzifsVar.hasNext()) {
            arrayList.add(zzifsVar.next().zzf());
        }
        int i = zzicr.zze;
        return zzicr.zzH(new zzieh(arrayList), 4096);
    }

    final /* synthetic */ zzicn zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    /* renamed from: zzr */
    public final zzici iterator() {
        return new zzifq(this);
    }
}
