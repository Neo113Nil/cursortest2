package defpackage;

import com.google.android.gms.internal.ads.zzgfo;
import com.google.android.gms.internal.ads.zzgni;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgpx;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class meo {
    public final zzgpx a;
    public final zzgni b;
    public final zzgnz c;
    public final zzgrh d;
    public final zzgfo e;
    public final boolean f;
    public final long g;
    public final long h;

    public meo(zzgpx zzgpxVar, zzgni zzgniVar, zzgnz zzgnzVar, zzgrh zzgrhVar, zzgfo zzgfoVar, boolean z, long j, long j2) {
        this.a = zzgpxVar;
        this.b = zzgniVar;
        this.c = zzgnzVar;
        this.d = zzgrhVar;
        this.e = zzgfoVar;
        this.f = z;
        this.g = j;
        this.h = j2;
    }

    public final zzhcq a() {
        zzhcq r = zzhcq.r(this.c.zzb());
        ahn ahnVar = ahn.x;
        slo sloVar = slo.a;
        uko e = zzhcy.e(r, Throwable.class, ahnVar, sloVar);
        zzgpx zzgpxVar = this.a;
        Objects.requireNonNull(zzgpxVar);
        return zzhcy.h(zzhcy.i(e, new lrn(zzgpxVar, 10), sloVar), new jeo(this, 0), sloVar);
    }

    public final zzhcq b(final int i) {
        zzhcq r = zzhcq.r(this.b.zza());
        lrn lrnVar = new lrn(this, 11);
        slo sloVar = slo.a;
        uko e = zzhcy.e(zzhcy.e(zzhcy.e(zzhcy.i(zzhcy.h(zzhcy.i(r, lrnVar, sloVar), new jeo(this, 1), sloVar), ahn.y, sloVar), heo.class, ahn.z, sloVar), ieo.class, ahn.A, sloVar), geo.class, new zzgub() { // from class: keo
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                meo meoVar = meo.this;
                if (meoVar.f) {
                    int i2 = i;
                    if (i2 < meoVar.g) {
                        meoVar.e.a(meoVar.h * ((long) Math.pow(2.0d, i2)), new q61(meoVar, i2, 10));
                    }
                }
                return leo.f;
            }
        }, sloVar);
        this.d.e(1002, e);
        return e;
    }
}
