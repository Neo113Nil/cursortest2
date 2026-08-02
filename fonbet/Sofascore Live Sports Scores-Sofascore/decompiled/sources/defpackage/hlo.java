package defpackage;

import com.google.android.gms.internal.ads.zzgvb;
import com.google.android.gms.internal.ads.zzhcg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hlo extends jlo {
    @Override // defpackage.jlo
    public final /* synthetic */ void s(Object obj) {
        m((ddb) obj);
    }

    @Override // defpackage.jlo
    public final Object t(Object obj, Object obj2) {
        zzhcg zzhcgVar = (zzhcg) obj;
        ddb zza = zzhcgVar.zza(obj2);
        if (zza != null) {
            return zza;
        }
        yhk.s(zzgvb.a("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhcgVar));
        return null;
    }
}
