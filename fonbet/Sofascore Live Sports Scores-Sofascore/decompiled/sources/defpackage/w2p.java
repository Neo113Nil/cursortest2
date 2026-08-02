package defpackage;

import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.internal.measurement.zzqc;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.internal.measurement.zzqm;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w2p implements zzpm {
    public final zzqm a;
    public final /* synthetic */ zzqe b;

    public w2p(zzqe zzqeVar, zzqm zzqmVar) {
        this.b = zzqeVar;
        this.a = zzqmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final void a(zzpl zzplVar) {
        Iterator it = this.b.f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((zzqc) it.next()).a((zzaef) zzplVar.y()) && !z) {
                this.a.zza();
                z = true;
            }
        }
    }
}
