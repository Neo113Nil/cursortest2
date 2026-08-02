package defpackage;

import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ouo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ zzlj c;

    public ouo(zzlj zzljVar, AtomicReference atomicReference, int i) {
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
                            atomicReference.set(zzicVar.d.X(zzicVar.q().W(), zzfy.b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                AtomicReference atomicReference2 = this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zzic zzicVar2 = (zzic) this.c.b;
                            atomicReference2.set(Double.valueOf(zzicVar2.d.a0(zzicVar2.q().W(), zzfy.e0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
