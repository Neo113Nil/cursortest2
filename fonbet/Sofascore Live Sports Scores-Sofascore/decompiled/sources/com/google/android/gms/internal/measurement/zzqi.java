package com.google.android.gms.internal.measurement;

import defpackage.f2p;
import defpackage.f35;
import defpackage.gl5;
import defpackage.jcn;
import defpackage.jvc;
import defpackage.lvc;
import defpackage.tmi;
import defpackage.v1k;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqi implements zzqm {
    public static boolean c;
    public final tmi a;
    public final int b = Math.max(5, 10);

    public zzqi(tmi tmiVar) {
        this.a = tmiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final void zza() {
        synchronized (zzqi.class) {
            try {
                if (!c) {
                    gl5 gl5Var = new gl5(this);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    lvc lvcVar = (lvc) this.a.get();
                    jcn jcnVar = new jcn(this, gl5Var, lvcVar, j);
                    lvcVar.getClass();
                    v1k v1kVar = new v1k(Executors.callable(jcnVar, null));
                    jvc jvcVar = new jvc(v1kVar, lvcVar.b.schedule(v1kVar, j, timeUnit));
                    jvcVar.addListener(new f2p(0, jvcVar), f35.a);
                    c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
