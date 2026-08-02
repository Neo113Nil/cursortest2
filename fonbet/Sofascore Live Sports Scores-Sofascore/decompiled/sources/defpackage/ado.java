package defpackage;

import com.google.android.gms.internal.ads.zzggu;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ado implements Callable {
    public final /* synthetic */ ddo a;
    public final /* synthetic */ int b;

    public /* synthetic */ ado(ddo ddoVar, int i) {
        this.a = ddoVar;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.b - 1;
        ddo ddoVar = this.a;
        if (i == 1) {
            return (zzggu) ddoVar.a.zzb();
        }
        if (i == 2) {
            return (zzggu) ddoVar.b.zzb();
        }
        if (i == 3) {
            return (zzggu) ddoVar.c.zzb();
        }
        ilg.c();
        return null;
    }
}
