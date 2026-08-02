package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzaem {
    public volatile zzafc a;
    public volatile zzacr b;

    public final int a() {
        if (this.b != null) {
            return this.b.d();
        }
        if (this.a != null) {
            return this.a.e();
        }
        return 0;
    }

    public final zzacr b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzacr.b;
                } else {
                    this.b = this.a.g();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zzafc zzafcVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = zzafcVar;
                this.b = zzacr.b;
            } catch (zzaeh unused) {
                this.a = zzafcVar;
                this.b = zzacr.b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaem)) {
            return false;
        }
        zzaem zzaemVar = (zzaem) obj;
        zzafc zzafcVar = this.a;
        zzafc zzafcVar2 = zzaemVar.a;
        if (zzafcVar == null && zzafcVar2 == null) {
            return b().equals(zzaemVar.b());
        }
        if (zzafcVar != null && zzafcVar2 != null) {
            return zzafcVar.equals(zzafcVar2);
        }
        if (zzafcVar != null) {
            zzaemVar.c(zzafcVar.a());
            return zzafcVar.equals(zzaemVar.a);
        }
        c(zzafcVar2.a());
        return this.a.equals(zzafcVar2);
    }

    public int hashCode() {
        return 1;
    }
}
