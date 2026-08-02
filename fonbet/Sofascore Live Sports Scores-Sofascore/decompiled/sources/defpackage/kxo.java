package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzxo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kxo {
    public final zzxo a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public kxo(zzxo zzxoVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        zzguk.a(!z3 || z);
        zzguk.a(!z2 || z);
        this.a = zzxoVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final kxo a(long j, long j2) {
        return (j == this.b && j2 == this.c) ? this : new kxo(this.a, j, j2, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kxo.class != obj.getClass()) {
            return false;
        }
        kxo kxoVar = (kxo) obj;
        return this.b == kxoVar.b && this.d == kxoVar.d && this.e == kxoVar.e && this.f == kxoVar.f && this.g == kxoVar.g && this.h == kxoVar.h && this.a.equals(kxoVar.a);
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 961) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
