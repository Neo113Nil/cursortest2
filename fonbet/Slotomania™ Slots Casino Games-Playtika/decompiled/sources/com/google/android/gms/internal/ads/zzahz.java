package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzahz extends zzafb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzahz(final zzagc zzagcVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r5, Math.max(6, zzagcVar.zzc));
        long j3;
        Objects.requireNonNull(zzagcVar);
        zzaey zzaeyVar = new zzaey() { // from class: com.google.android.gms.internal.ads.zzahx
            @Override // com.google.android.gms.internal.ads.zzaey
            public final /* synthetic */ long zza(long j4) {
                return zzagc.this.zzb(j4);
            }
        };
        zzahy zzahyVar = new zzahy(zzagcVar, i, null);
        long zza = zzagcVar.zza();
        long j4 = zzagcVar.zzj;
        int i2 = zzagcVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzagcVar.zzc) / 2) + 1;
        } else {
            int i3 = zzagcVar.zza;
            int i4 = zzagcVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * zzagcVar.zzg) * zzagcVar.zzh) / 8);
        }
    }
}
