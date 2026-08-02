package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcsl;
import com.google.android.gms.internal.ads.zzemo;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zvn implements zzcsl {
    public final zzemo a;

    public zvn(zzemo zzemoVar) {
        this.a = zzemoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void a(HashMap hashMap) {
        wlo b;
        if (((Boolean) zzba.zzc().a(zzbjg.ac)).booleanValue()) {
            try {
                z1a.G(this.a.a);
                b = zzhcy.b(new IllegalStateException());
            } catch (Exception e) {
                b = zzhcy.b(e);
            }
            zzhcy.f(zzhcq.r(b), Throwable.class, yvn.b, zzcgj.a);
        }
    }
}
