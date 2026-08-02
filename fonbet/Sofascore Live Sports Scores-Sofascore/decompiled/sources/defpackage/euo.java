package defpackage;

import com.google.android.gms.internal.pal.zzna;
import com.google.android.gms.internal.pal.zzpa;
import com.google.android.gms.internal.pal.zzpr;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class euo {
    public static final Logger b = Logger.getLogger(euo.class.getName());
    public final ConcurrentHashMap a;

    public euo(euo euoVar) {
        this.a = new ConcurrentHashMap(euoVar.a);
    }

    public final synchronized void a(zzpr zzprVar, zzpa zzpaVar) {
        Class zzd;
        try {
            int c = zzpaVar.c();
            if (!zzna.a(1)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzprVar.getClass()) + " as it is not FIPS compatible.");
            }
            if (!zzna.a(c)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzpaVar.getClass()) + " as it is not FIPS compatible.");
            }
            String b2 = zzprVar.b();
            String b3 = zzpaVar.b();
            if (this.a.containsKey(b2) && ((cuo) this.a.get(b2)).zzd() != null && (zzd = ((cuo) this.a.get(b2)).zzd()) != null && !zzd.getName().equals(zzpaVar.getClass().getName())) {
                b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + b2 + " with inconsistent public key type " + b3);
                throw new GeneralSecurityException("public key manager corresponding to " + zzprVar.getClass().getName() + " is already registered with " + zzd.getName() + ", cannot be re-registered with " + zzpaVar.getClass().getName());
            }
            c(new buo(zzprVar, zzpaVar), true);
            c(new yto(zzpaVar), false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(zzpa zzpaVar) {
        if (!zzna.a(zzpaVar.c())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzpaVar.getClass()) + " as it is not FIPS compatible.");
        }
        c(new yto(zzpaVar), false);
    }

    public final synchronized void c(cuo cuoVar, boolean z) {
        String b2 = ((zzpa) ((ohn) cuoVar.zzb()).b).b();
        cuo cuoVar2 = (cuo) this.a.get(b2);
        if (cuoVar2 != null && !cuoVar2.zzc().equals(cuoVar.zzc())) {
            b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(b2));
            throw new GeneralSecurityException("typeUrl (" + b2 + ") is already registered with " + cuoVar2.zzc().getName() + ", cannot be re-registered with " + cuoVar.zzc().getName());
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        if (z) {
            concurrentHashMap.put(b2, cuoVar);
        } else {
            concurrentHashMap.putIfAbsent(b2, cuoVar);
        }
    }

    public euo() {
        this.a = new ConcurrentHashMap();
    }
}
