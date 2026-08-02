package com.google.android.gms.internal.pal;

import defpackage.anf;
import defpackage.euo;
import defpackage.r7n;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlf {
    public static final Logger a = Logger.getLogger(zzlf.class.getName());
    public static final AtomicReference b = new AtomicReference(new euo());
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e;
    public static final ConcurrentHashMap f;

    static {
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
    }

    private zzlf() {
    }

    public static synchronized void a(zzpr zzprVar, zzpa zzpaVar) {
        synchronized (zzlf.class) {
            try {
                AtomicReference atomicReference = b;
                euo euoVar = new euo((euo) atomicReference.get());
                euoVar.a(zzprVar, zzpaVar);
                String b2 = zzprVar.b();
                String b3 = zzpaVar.b();
                d(b2, zzprVar.a().a(), true);
                d(b3, Collections.EMPTY_MAP, false);
                if (!((euo) atomicReference.get()).a.containsKey(b2)) {
                    c.put(b2, new anf(24));
                    e(zzprVar.b(), zzprVar.a().a());
                }
                ConcurrentHashMap concurrentHashMap = d;
                concurrentHashMap.put(b2, Boolean.TRUE);
                concurrentHashMap.put(b3, Boolean.FALSE);
                atomicReference.set(euoVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void b(zzpa zzpaVar) {
        synchronized (zzlf.class) {
            try {
                AtomicReference atomicReference = b;
                euo euoVar = new euo((euo) atomicReference.get());
                euoVar.b(zzpaVar);
                String b2 = zzpaVar.b();
                d(b2, zzpaVar.a().a(), true);
                if (!((euo) atomicReference.get()).a.containsKey(b2)) {
                    c.put(b2, new anf(24));
                    e(b2, zzpaVar.a().a());
                }
                d.put(b2, Boolean.TRUE);
                atomicReference.set(euoVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void c(zzlc zzlcVar) {
        synchronized (zzlf.class) {
            try {
                Class zzb = zzlcVar.zzb();
                ConcurrentHashMap concurrentHashMap = e;
                if (concurrentHashMap.containsKey(zzb)) {
                    zzlc zzlcVar2 = (zzlc) concurrentHashMap.get(zzb);
                    if (!zzlcVar.getClass().getName().equals(zzlcVar2.getClass().getName())) {
                        a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                        throw new GeneralSecurityException("PrimitiveWrapper for primitive (" + zzb.getName() + ") is already registered to be " + zzlcVar2.getClass().getName() + ", cannot be re-registered with " + zzlcVar.getClass().getName());
                    }
                }
                concurrentHashMap.put(zzb, zzlcVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void d(String str, Map map, boolean z) {
        synchronized (zzlf.class) {
            if (z) {
                try {
                    ConcurrentHashMap concurrentHashMap = d;
                    if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                    if (((euo) b.get()).a.containsKey(str)) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!f.containsKey(entry.getKey())) {
                                throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                            }
                        }
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (f.containsKey(entry2.getKey())) {
                                throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.pal.zzaef, java.lang.Object] */
    public static void e(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] A = ((zzoy) entry.getValue()).a.A();
            int i = ((zzoy) entry.getValue()).b;
            zzvs j = zzvt.j();
            if (j.c) {
                j.j();
                j.c = false;
            }
            zzvt.p((zzvt) j.b, str);
            r7n u = zzaby.u(0, A.length, A);
            if (j.c) {
                j.j();
                j.c = false;
            }
            ((zzvt) j.b).zzf = u;
            int i2 = i - 1;
            int i3 = i2 != 0 ? i2 != 1 ? 5 : 4 : 3;
            if (j.c) {
                j.j();
                j.c = false;
            }
            ((zzvt) j.b).zzg = zzwu.a(i3);
            f.put(str2, new zzkk((zzvt) j.f()));
        }
    }
}
