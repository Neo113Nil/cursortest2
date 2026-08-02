package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.braze.Constants;
import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzanh implements zzahb {
    private final zzahb zza;
    private final zzanc zzb;
    private zzane zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfk.zzb;
    private final zzes zzc = new zzes();

    public zzanh(zzahb zzahbVar, zzanc zzancVar) {
        this.zza = zzahbVar;
        this.zzb = zzancVar;
    }

    private final void zzi(int i) {
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzf;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzA(zzv zzvVar) {
        String str = zzvVar.zzp;
        str.getClass();
        zzgsw.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzanc zzancVar = this.zzb;
            this.zzg = zzancVar.zza(zzvVar) ? zzancVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzA(zzvVar);
            return;
        }
        zzahb zzahbVar = this.zza;
        zzt zza = zzvVar.zza();
        zza.zzo("application/x-media3-cues");
        zza.zzk(str);
        zza.zzt(Long.MAX_VALUE);
        zza.zzM(this.zzb.zzb(zzvVar));
        zzahbVar.zzA(zza.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i, z, 0);
        }
        zzi(i);
        int zza = zzjVar.zza(this.zzf, this.zze, i);
        if (zza != -1) {
            this.zze += zza;
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzd(zzes zzesVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzd(zzesVar, i, i2);
            return;
        }
        zzi(i);
        zzesVar.zzm(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zze(final long j, final int i, int i2, int i3, zzaha zzahaVar) {
        if (this.zzg == null) {
            this.zza.zze(j, i, i2, i3, zzahaVar);
            return;
        }
        zzgsw.zzb(zzahaVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        try {
            this.zzg.zza(this.zzf, i4, i2, zzand.zza(), new zzds() { // from class: com.google.android.gms.internal.ads.zzang
                @Override // com.google.android.gms.internal.ads.zzds
                public final /* synthetic */ void zza(Object obj) {
                    zzanh.this.zzh(j, i, (zzamw) obj);
                }
            });
        } catch (RuntimeException e) {
            if (!this.zzi) {
                throw e;
            }
            zzef.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z) {
        this.zzi = true;
    }

    final /* synthetic */ void zzh(long j, int i, zzamw zzamwVar) {
        this.zzh.getClass();
        zzgvz zzgvzVar = zzamwVar.zza;
        long j2 = zzamwVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgvzVar.size());
        Iterator<E> it = zzgvzVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcx) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzes zzesVar = this.zzc;
        int length = marshall.length;
        zzesVar.zzb(marshall, length);
        zzahb zzahbVar = this.zza;
        zzahbVar.zzc(zzesVar, length);
        long j3 = zzamwVar.zzb;
        if (j3 == C.TIME_UNSET) {
            zzgsw.zzi(this.zzh.zzu == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzu;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        zzahbVar.zze(j, i | 1, length, 0, null);
    }
}
