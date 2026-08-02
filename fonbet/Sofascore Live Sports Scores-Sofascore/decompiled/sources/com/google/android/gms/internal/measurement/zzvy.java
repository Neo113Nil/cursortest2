package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.Trace;
import defpackage.ewf;
import defpackage.h4p;
import defpackage.j40;
import defpackage.k9p;
import defpackage.lap;
import defpackage.vha;
import defpackage.vv9;
import defpackage.x9p;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvy {
    public static final AtomicReference a;
    public static final zzrg b;
    public static final WeakHashMap c;
    public static final j40 d;

    static {
        vv9.s(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        a = new AtomicReference(ewf.j);
        b = new zzrg();
        c = new WeakHashMap();
        d = new j40(21);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static zzws a() {
        zzwq c2 = c();
        zzws zzwsVar = c2.b;
        if (zzwsVar != null && zzwsVar != zzwg.g) {
            return zzwsVar;
        }
        zzvr zzvrVar = zzwd.f;
        x9p x9pVar = x9p.c;
        long a2 = x9pVar.a() & (-61441);
        long a3 = x9pVar.a() >>> 2;
        UUID uuid = x9pVar.a;
        UUID uuid2 = new UUID(a2 ^ uuid.getMostSignificantBits(), a3 ^ uuid.getLeastSignificantBits());
        String e = k9p.e(uuid2);
        vv9 vv9Var = (vv9) a.get();
        if (!vv9Var.isEmpty()) {
            vv9Var.forEach(new lap());
        }
        zzvr zzvrVar2 = zzwd.f;
        return new zzwd("<missing root>", uuid2, e, c2);
    }

    public static zzws b(zzwq zzwqVar, zzws zzwsVar) {
        boolean a2;
        zzwqVar.getClass();
        zzws zzwsVar2 = zzwqVar.b;
        if (zzwsVar2 != zzwsVar) {
            if (zzwsVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    a2 = Trace.isEnabled();
                } else {
                    a2 = h4p.a.a(b);
                }
                zzwqVar.a = a2;
            }
            if (zzwqVar.a) {
                if (zzwsVar2 != null) {
                    if (zzwsVar != null) {
                        if (zzwsVar2.zzb() == zzwsVar && zzwsVar2.zza() == Thread.currentThread()) {
                            Trace.endSection();
                        } else if (zzwsVar2 == zzwsVar.zzb() && zzwsVar.zza() == Thread.currentThread()) {
                            vha.U(zzwsVar);
                        }
                    }
                    vha.S(zzwsVar2);
                }
                if (zzwsVar != null) {
                    vha.P(zzwsVar);
                }
            }
            if (zzwsVar2 != zzwsVar) {
                zzwqVar.b = zzwsVar;
                return zzwsVar2;
            }
        }
        return zzwsVar;
    }

    public static zzwq c() {
        return (zzwq) d.get();
    }
}
