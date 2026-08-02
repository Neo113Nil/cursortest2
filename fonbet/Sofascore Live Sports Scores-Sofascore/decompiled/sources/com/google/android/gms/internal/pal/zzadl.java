package com.google.android.gms.internal.pal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzadl {
    public volatile zzaef a;
    public volatile zzaby b;

    static {
        zzacm.a();
    }

    public final zzaby a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzaby.b;
                } else {
                    this.b = this.a.a();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(zzaef zzaefVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = zzaefVar;
                    this.b = zzaby.b;
                } catch (zzadi unused) {
                    this.a = zzaefVar;
                    this.b = zzaby.b;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadl)) {
            return false;
        }
        zzadl zzadlVar = (zzadl) obj;
        zzaef zzaefVar = this.a;
        zzaef zzaefVar2 = zzadlVar.a;
        if (zzaefVar == null && zzaefVar2 == null) {
            return a().equals(zzadlVar.a());
        }
        if (zzaefVar != null && zzaefVar2 != null) {
            return zzaefVar.equals(zzaefVar2);
        }
        if (zzaefVar != null) {
            zzadlVar.b(zzaefVar.n());
            return zzaefVar.equals(zzadlVar.a);
        }
        b(zzaefVar2.n());
        return this.a.equals(zzaefVar2);
    }

    public int hashCode() {
        return 1;
    }
}
