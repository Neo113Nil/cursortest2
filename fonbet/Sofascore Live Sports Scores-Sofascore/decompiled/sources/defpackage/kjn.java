package defpackage;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzfm;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kjn implements zzahk {
    public final jjn a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public kjn(jjn jjnVar, int i, long j, long j2) {
        this.a = jjnVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / jjnVar.c;
        this.d = j3;
        this.e = c(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        long j2 = this.b;
        jjn jjnVar = this.a;
        long j3 = (jjnVar.b * j) / (j2 * 1000000);
        String str = zzfm.a;
        long j4 = this.d - 1;
        long max = Math.max(0L, Math.min(j3, j4));
        long j5 = jjnVar.c;
        long c = c(max);
        long j6 = this.c;
        zzahl zzahlVar = new zzahl(c, (max * j5) + j6);
        if (c >= j || max == j4) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        long j7 = max + 1;
        return new zzahi(zzahlVar, new zzahl(c(j7), (j5 * j7) + j6));
    }

    public final long c(long j) {
        return zzfm.w(j * this.b, 1000000L, this.a.b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }
}
