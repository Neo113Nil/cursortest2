package com.google.android.gms.internal.cast;

import defpackage.dcp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzyt {
    public volatile zzzi a;
    public volatile zzxk b;

    public final int a() {
        if (this.b != null) {
            return ((dcp) this.b).c.length;
        }
        if (this.a != null) {
            return this.a.zzE();
        }
        return 0;
    }

    public final zzxk b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = zzxk.b;
                } else {
                    this.b = this.a.t();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zzzi zzziVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = zzziVar;
                this.b = zzxk.b;
            } catch (zzyo unused) {
                this.a = zzziVar;
                this.b = zzxk.b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzyt)) {
            return false;
        }
        zzyt zzytVar = (zzyt) obj;
        zzzi zzziVar = this.a;
        zzzi zzziVar2 = zzytVar.a;
        if (zzziVar == null && zzziVar2 == null) {
            return b().equals(zzytVar.b());
        }
        if (zzziVar != null && zzziVar2 != null) {
            return zzziVar.equals(zzziVar2);
        }
        if (zzziVar != null) {
            zzytVar.c(zzziVar.zzx());
            return zzziVar.equals(zzytVar.a);
        }
        c(zzziVar2.zzx());
        return this.a.equals(zzziVar2);
    }

    public int hashCode() {
        return 1;
    }
}
