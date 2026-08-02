package defpackage;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzfm;
import java.math.BigInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qhn implements zzahk {
    public final /* synthetic */ lr4 a;

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        lr4 lr4Var = this.a;
        BigInteger valueOf = BigInteger.valueOf((((qgi) lr4Var.m).f * j) / 1000000);
        long j2 = lr4Var.c;
        long j3 = lr4Var.b;
        long longValue = valueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(lr4Var.e)).longValue() + j3;
        String str = zzfm.a;
        zzahl zzahlVar = new zzahl(j, Math.max(j3, Math.min(longValue - 30000, j2 - 1)));
        return new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        lr4 lr4Var = this.a;
        qgi qgiVar = (qgi) lr4Var.m;
        return (lr4Var.e * 1000000) / qgiVar.f;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }
}
