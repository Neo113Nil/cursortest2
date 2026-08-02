package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzk;
import com.google.android.gms.internal.measurement.zzv;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzc {
    public final zzf a;
    public zzg b;
    public final zzab c;
    public final zzz d;

    public zzc() {
        zzf zzfVar = new zzf();
        this.a = zzfVar;
        this.b = zzfVar.b.c();
        this.c = new zzab();
        this.d = new zzz();
        final int i = 1;
        Callable callable = new Callable(this) { // from class: u3n
            public final /* synthetic */ zzc b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = i;
                zzc zzcVar = this.b;
                switch (i2) {
                    case 0:
                        return new zzk(zzcVar.c);
                    default:
                        return new zzv(zzcVar.d);
                }
            }
        };
        zzj zzjVar = zzfVar.d;
        zzjVar.a.put("internal.registerCallback", callable);
        final int i2 = 0;
        zzjVar.a.put("internal.eventLogger", new Callable(this) { // from class: u3n
            public final /* synthetic */ zzc b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i22 = i2;
                zzc zzcVar = this.b;
                switch (i22) {
                    case 0:
                        return new zzk(zzcVar.c);
                    default:
                        return new zzv(zzcVar.d);
                }
            }
        });
    }

    public final boolean a(zzaa zzaaVar) {
        zzab zzabVar = this.c;
        try {
            zzabVar.a = zzaaVar;
            zzabVar.b = zzaaVar.clone();
            zzabVar.c.clear();
            this.a.c.e("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.d.a(this.b.c(), zzabVar);
            if (zzabVar.b.equals(zzabVar.a)) {
                return !zzabVar.c.isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void b(zzja zzjaVar) {
        zzai zzaiVar;
        try {
            zzf zzfVar = this.a;
            this.b = zzfVar.b.c();
            if (zzfVar.a(this.b, (zzje[]) zzjaVar.y().toArray(new zzje[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zziy zziyVar : zzjaVar.z().y()) {
                List z = zziyVar.z();
                String y = zziyVar.y();
                Iterator it = z.iterator();
                while (it.hasNext()) {
                    zzao a = zzfVar.a(this.b, (zzje) it.next());
                    if (!(a instanceof zzal)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzgVar = this.b;
                    if (zzgVar.d(y)) {
                        zzao g = zzgVar.g(y);
                        if (!(g instanceof zzai)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(y)));
                        }
                        zzaiVar = (zzai) g;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(y)));
                    }
                    zzaiVar.d(this.b, Collections.singletonList(a));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
