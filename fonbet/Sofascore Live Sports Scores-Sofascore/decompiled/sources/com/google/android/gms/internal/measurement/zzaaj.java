package com.google.android.gms.internal.measurement;

import android.os.Build;
import dalvik.system.VMStack;
import defpackage.b5n;
import defpackage.c5n;
import defpackage.j5n;
import defpackage.p5n;
import defpackage.r5n;
import defpackage.u5n;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaaj extends zzaad {
    public static final b5n b;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            c5n.class.getName().equals(d());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        b = new b5n();
    }

    public static String d() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final b5n a() {
        return b;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final zzzf b() {
        zzzf zzzfVar;
        AtomicReference atomicReference = p5n.f;
        String str = "Phlogger";
        if (atomicReference.get() != null) {
            return ((zzaai) atomicReference.get()).zza("Phlogger");
        }
        int i = 7;
        while (true) {
            if (i >= 0) {
                char charAt = "Phlogger".charAt(i);
                if (charAt != '$') {
                    if (charAt == '.') {
                        break;
                    }
                    i--;
                } else {
                    str = "Phlogger".replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        p5n p5nVar = new p5n(str);
        if (p5n.c || p5n.d) {
            new zzaah();
            p5nVar.b = new u5n(p5nVar.a);
        } else {
            if (p5n.e) {
                zzaaq zzaaqVar = zzaas.h;
                zzzfVar = new zzaaq(Level.OFF, zzaaqVar.b, zzaaqVar.c).zza(p5nVar.a);
            } else {
                zzzfVar = null;
            }
            p5nVar.b = zzzfVar;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = j5n.a;
        concurrentLinkedQueue.offer(p5nVar);
        if (atomicReference.get() != null) {
            while (true) {
                p5n p5nVar2 = (p5n) concurrentLinkedQueue.poll();
                if (p5nVar2 == null) {
                    break;
                }
                p5nVar2.b = ((zzaai) atomicReference.get()).zza(p5nVar2.a);
            }
            p5n.e();
        }
        return p5nVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final zzaat c() {
        return r5n.b;
    }
}
