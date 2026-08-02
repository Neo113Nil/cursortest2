package defpackage;

import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gwn implements Runnable {
    public final zzcu a;
    public final zzdk b;

    public gwn(zzcu zzcuVar, zzdk zzdkVar) {
        this.a = zzcuVar;
        this.b = zzdkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        zzdk zzdkVar = this.b;
        if (twn.g.S(this.a, this, zzcu.h(zzdkVar))) {
            zzcu.j(this.a);
        }
    }
}
