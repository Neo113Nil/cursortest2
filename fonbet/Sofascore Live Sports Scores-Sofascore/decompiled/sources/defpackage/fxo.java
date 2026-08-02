package defpackage;

import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zznl;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fxo extends zzgd {
    public final /* synthetic */ AtomicReference a;

    public fxo(zznl zznlVar, AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    public final void z(List list) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
