package defpackage;

import com.google.android.gms.internal.ads.zzbd;
import com.google.android.gms.internal.ads.zzbe;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzc;
import com.google.android.gms.internal.ads.zzxc;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class syo extends zzxc {
    public final zzbe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syo(tyo tyoVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(tyoVar);
        this.c = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.b;
        zzbd d = zzbfVar.d(i, zzbdVar, z);
        if (!zzbfVar.b(d.c, this.c, 0L).b()) {
            d.e = true;
            return d;
        }
        Object obj = zzbdVar.a;
        Object obj2 = zzbdVar.b;
        int i2 = zzbdVar.c;
        long j = zzbdVar.d;
        zzc zzcVar = zzc.b;
        d.a(obj, obj2, i2, j, true);
        return d;
    }
}
