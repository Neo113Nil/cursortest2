package defpackage;

import com.google.android.gms.internal.ads.zzgvi;
import com.google.android.gms.internal.cast.zzhg;
import com.google.android.gms.internal.cast.zzhk;
import com.google.android.gms.internal.cast.zzwa;
import com.google.android.gms.internal.play_billing.zzbr;
import com.google.android.gms.internal.wearable.zzak;
import com.google.android.gms.internal.wearable.zzan;
import com.google.android.gms.internal.wearable.zzap;
import java.io.Serializable;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nsa implements zzak, zzhg {
    public final /* synthetic */ int a;
    public Object b;
    public final Serializable c;
    public volatile Object d;

    public nsa(int i, Class cls) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new zzbr();
                this.c = cls.getName();
                break;
            case 4:
                this.b = new zzgvi();
                this.c = cls.getName();
                break;
            case 5:
            default:
                this.b = new Object();
                this.c = cls.getName();
                break;
            case 6:
                this.b = new s2p();
                this.c = cls.getName();
                break;
        }
    }

    private final Logger c() {
        Logger logger = (Logger) this.d;
        if (logger != null) {
            return logger;
        }
        synchronized (((s2p) this.b)) {
            try {
                Logger logger2 = (Logger) this.d;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.c);
                this.d = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Logger a() {
        Logger logger = (Logger) this.d;
        if (logger != null) {
            return logger;
        }
        synchronized (this.b) {
            try {
                Logger logger2 = (Logger) this.d;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.c);
                this.d = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Logger b() {
        Logger logger;
        Logger logger2;
        Logger logger3;
        Logger logger4;
        switch (this.a) {
            case 2:
                Logger logger5 = (Logger) this.d;
                if (logger5 != null) {
                    return logger5;
                }
                synchronized (((zzan) this.b)) {
                    try {
                        logger = (Logger) this.d;
                        if (logger == null) {
                            logger = Logger.getLogger((String) this.c);
                            this.d = logger;
                        }
                    } finally {
                    }
                }
                return logger;
            case 3:
                Logger logger6 = (Logger) this.d;
                if (logger6 != null) {
                    return logger6;
                }
                synchronized (((zzbr) this.b)) {
                    try {
                        logger2 = (Logger) this.d;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger((String) this.c);
                            this.d = logger2;
                        }
                    } finally {
                    }
                }
                return logger2;
            case 4:
                Logger logger7 = (Logger) this.d;
                if (logger7 != null) {
                    return logger7;
                }
                synchronized (((zzgvi) this.b)) {
                    try {
                        logger3 = (Logger) this.d;
                        if (logger3 == null) {
                            logger3 = Logger.getLogger((String) this.c);
                            this.d = logger3;
                        }
                    } finally {
                    }
                }
                return logger3;
            case 5:
            default:
                Logger logger8 = (Logger) this.d;
                if (logger8 != null) {
                    return logger8;
                }
                synchronized (((zzhk) this.b)) {
                    try {
                        logger4 = (Logger) this.d;
                        if (logger4 == null) {
                            logger4 = Logger.getLogger((String) this.c);
                            this.d = logger4;
                        }
                    } finally {
                    }
                }
                return logger4;
            case 6:
                return c();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Object obj = (qc4) this.d;
                if (obj == null) {
                    String valueOf = String.valueOf(this.b);
                    obj = wt3.m("<supplier that returned ", valueOf, new StringBuilder(valueOf.length() + 25), ">");
                }
                String obj2 = obj.toString();
                return wt3.m("Suppliers.memoize(", obj2, new StringBuilder(obj2.length() + 19), ")");
            case 5:
                Object obj3 = (zzhg) this.d;
                if (obj3 == x3f.i) {
                    String valueOf2 = String.valueOf(this.b);
                    obj3 = wt3.m("<supplier that returned ", valueOf2, new StringBuilder(valueOf2.length() + 25), ">");
                }
                String valueOf3 = String.valueOf(obj3);
                return wt3.m("Suppliers.memoize(", valueOf3, new StringBuilder(valueOf3.length() + 19), ")");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.cast.zzhg
    public Object zza() {
        switch (this.a) {
            case 1:
                if (((qc4) this.d) != null) {
                    synchronized (((zzan) this.c)) {
                        try {
                            if (((qc4) this.d) != null) {
                                Object mo792zza = ((qc4) this.d).mo792zza();
                                this.b = mo792zza;
                                this.d = null;
                                return mo792zza;
                            }
                        } finally {
                        }
                    }
                }
                return this.b;
            default:
                zzhg zzhgVar = (zzhg) this.d;
                x3f x3fVar = x3f.i;
                if (zzhgVar != x3fVar) {
                    synchronized (((zzhk) this.c)) {
                        try {
                            if (((zzhg) this.d) != x3fVar) {
                                Object zza = ((zzhg) this.d).zza();
                                this.b = zza;
                                this.d = x3fVar;
                                return zza;
                            }
                        } finally {
                        }
                    }
                }
                return this.b;
        }
    }

    public nsa(qc4 qc4Var) {
        this.a = 1;
        this.c = new zzan();
        this.d = qc4Var;
    }

    public nsa(int i) {
        this.a = i;
        switch (i) {
            case 5:
                jle jleVar = jle.m;
                this.c = new zzhk();
                this.d = jleVar;
                break;
            case 6:
            default:
                this.b = new zzan();
                this.c = zzap.class.getName();
                break;
            case 7:
                this.b = new zzhk();
                this.c = zzwa.class.getName();
                break;
        }
    }
}
