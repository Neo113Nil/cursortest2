package defpackage;

import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hxo extends zzgg {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zznl b;

    public hxo(zznl zznlVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void P3(zzoq zzoqVar) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            zzgu zzguVar = ((zzic) this.b.b).f;
            zzic.m(zzguVar);
            zzguVar.o.b(Integer.valueOf(zzoqVar.a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
