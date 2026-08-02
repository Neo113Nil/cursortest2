package defpackage;

import android.os.Looper;
import com.google.android.gms.internal.cast.zzaw;
import com.google.android.gms.internal.cast.zzbq;
import com.google.android.gms.internal.cast.zzby;
import com.google.android.gms.internal.cast.zzfk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xnn implements zzaw {
    public final /* synthetic */ zzbq a;

    public xnn(zzbq zzbqVar) {
        this.a = zzbqVar;
    }

    @Override // com.google.android.gms.internal.cast.zzaw
    public final void zza() {
        this.a.p();
    }

    @Override // com.google.android.gms.internal.cast.zzaw
    public final void zzb() {
        zzbq.f.a("Stopping RouteDiscovery.", new Object[0]);
        zzbq zzbqVar = this.a;
        zzbqVar.c.clear();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new zzfk(Looper.getMainLooper()).post(new con(zzbqVar, 1));
            return;
        }
        zzby zzbyVar = zzbqVar.e;
        pbc pbcVar = zzbyVar.b;
        if (pbcVar == null) {
            pbcVar = pbc.d(zzbyVar.a);
            zzbyVar.b = pbcVar;
        }
        pbcVar.h(zzbqVar);
    }
}
