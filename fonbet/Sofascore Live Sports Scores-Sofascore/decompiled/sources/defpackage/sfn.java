package defpackage;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzaic;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sfn implements zzahk {
    public final long a;
    public final /* synthetic */ zzaic b;

    public sfn(zzaic zzaicVar, long j) {
        this.b = zzaicVar;
        this.a = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi b(long j) {
        zzaic zzaicVar = this.b;
        zzahi a = zzaicVar.i[0].a(j);
        int i = 1;
        while (true) {
            vfn[] vfnVarArr = zzaicVar.i;
            if (i >= vfnVarArr.length) {
                return a;
            }
            zzahi a2 = vfnVarArr[i].a(j);
            if (a2.a.b < a.a.b) {
                a = a2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }
}
