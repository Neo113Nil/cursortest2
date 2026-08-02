package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wto implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ zzlj c;

    public wto(zzlj zzljVar, AtomicReference atomicReference, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = atomicReference;
                Objects.requireNonNull(zzljVar);
                this.c = zzljVar;
                break;
            default:
                this.b = atomicReference;
                Objects.requireNonNull(zzljVar);
                this.c = zzljVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.b;
                synchronized (atomicReference) {
                    try {
                        try {
                            zzic zzicVar = (zzic) this.c.b;
                            atomicReference.set(Boolean.valueOf(zzicVar.d.b0(zzicVar.q().W(), zzfy.a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zzic zzicVar2 = (zzic) this.c.b;
                            atomicReference2.set(Integer.valueOf(zzicVar2.d.Z(zzicVar2.q().W(), zzfy.d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                zzlj zzljVar = this.c;
                lmo lmoVar = ((zzic) zzljVar.b).e;
                zzic.k(lmoVar);
                Bundle a = lmoVar.o.a();
                zznl o = ((zzic) zzljVar.b).o();
                AtomicReference atomicReference3 = this.b;
                o.Q();
                o.R();
                o.e0(new n2(16, o, atomicReference3, o.g0(false), a, false));
                return;
            default:
                zznl o2 = ((zzic) this.c.b).o();
                zzoo Y0 = zzoo.Y0(zzls.SGTM_CLIENT);
                AtomicReference atomicReference4 = this.b;
                o2.Q();
                o2.R();
                o2.e0(new n2(17, o2, atomicReference4, o2.g0(false), Y0, false));
                return;
        }
    }

    public /* synthetic */ wto(zzlj zzljVar, AtomicReference atomicReference, int i, boolean z) {
        this.a = i;
        this.c = zzljVar;
        this.b = atomicReference;
    }
}
