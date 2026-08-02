package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzinv implements zziof, zzinq {
    public static final Object c = new Object();
    public volatile zziof a;
    public volatile Object b = c;

    public zzinv(zziof zziofVar) {
        this.a = zziofVar;
    }

    public static zzinv a(zziof zziofVar) {
        return zziofVar instanceof zzinv ? (zzinv) zziofVar : new zzinv(zziofVar);
    }

    public static zzinq b(zziof zziofVar) {
        if (zziofVar instanceof zzinq) {
            return (zzinq) zziofVar;
        }
        zziofVar.getClass();
        return new zzinv(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object zzb = this.a.zzb();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != zzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + zzb + ". This is likely due to a circular dependency.");
                }
                this.b = zzb;
                this.a = null;
                return zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
