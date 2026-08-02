package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzfm;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rgn implements vgn {
    public final long[] a;
    public final long[] b;
    public final long c;

    public rgn(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == C.TIME_UNSET ? zzfm.u(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair c(long[] jArr, long[] jArr2, long j) {
        int s = zzfm.s(jArr, j, true);
        long j2 = jArr[s];
        long j3 = jArr2[s];
        int i = s + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.vgn
    public final long a(long j) {
        return zzfm.u(((Long) c(this.a, this.b, j).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        String str = zzfm.a;
        Pair c = c(this.b, this.a, zzfm.t(Math.max(0L, Math.min(j, this.c))));
        zzahl zzahlVar = new zzahl(zzfm.u(((Long) c.first).longValue()), ((Long) c.second).longValue());
        return new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // defpackage.vgn
    public final long zzg() {
        return -1L;
    }

    @Override // defpackage.vgn
    public final int zzh() {
        return -2147483647;
    }
}
