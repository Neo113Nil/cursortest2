package com.google.android.gms.internal.wearable;

import defpackage.a70;
import defpackage.d0o;
import defpackage.e3c;
import defpackage.hxn;
import defpackage.i7o;
import defpackage.igf;
import defpackage.n0o;
import defpackage.s6o;
import defpackage.uwn;
import defpackage.wt3;
import defpackage.x5n;
import defpackage.zz0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c implements s6o {
    public final zzel a;
    public final e b;
    public final boolean c;

    public c(e eVar, zzel zzelVar) {
        igf igfVar = uwn.a;
        this.b = eVar;
        this.c = zzelVar instanceof zzdd;
        this.a = zzelVar;
    }

    @Override // defpackage.s6o
    public final void a(Object obj, Object obj2) {
        d.b(obj, obj2);
        if (this.c) {
            igf igfVar = uwn.a;
            if (((zzdd) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.s6o
    public final boolean b(Object obj) {
        return ((zzdd) obj).zzb.d();
    }

    @Override // defpackage.s6o
    public final void c(Object obj) {
        this.b.getClass();
        zzfj zzfjVar = ((zzdg) obj).zzc;
        if (zzfjVar.e) {
            zzfjVar.e = false;
        }
        igf igfVar = uwn.a;
        ((zzdd) obj).zzb.a();
    }

    @Override // defpackage.s6o
    public final void d(Object obj, e3c e3cVar) {
        zzcg zzcgVar;
        Iterator b = ((zzdd) obj).zzb.b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            zzcw zzcwVar = (zzcw) entry.getKey();
            if (zzcwVar.zzc() != zzfw.i || zzcwVar.zzd() || zzcwVar.zze()) {
                a70.r("Found invalid MessageSet item.");
                return;
            }
            if (entry instanceof d0o) {
                int zza = zzcwVar.zza();
                n0o n0oVar = (n0o) ((d0o) entry).a.getValue();
                if (n0oVar.c != null) {
                    zzcgVar = n0oVar.c;
                } else {
                    synchronized (n0oVar) {
                        try {
                            if (n0oVar.c != null) {
                                zzcgVar = n0oVar.c;
                            } else {
                                n0oVar.c = n0oVar.d.zzH();
                                zzcgVar = n0oVar.c;
                            }
                        } finally {
                        }
                    }
                }
                e3cVar.v(zza, zzcgVar);
            } else {
                e3cVar.v(zzcwVar.zza(), entry.getValue());
            }
        }
        zzfj zzfjVar = ((zzdg) obj).zzc;
        for (int i = 0; i < zzfjVar.a; i++) {
            e3cVar.v(zzfjVar.b[i] >>> 3, zzfjVar.c[i]);
        }
    }

    @Override // defpackage.s6o
    public final void e(Object obj, zz0 zz0Var, zzcs zzcsVar) {
        this.b.getClass();
        e.a(obj);
        throw null;
    }

    @Override // defpackage.s6o
    public final boolean f(zzdg zzdgVar, zzdg zzdgVar2) {
        if (!zzdgVar.zzc.equals(zzdgVar2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((zzdd) zzdgVar).zzb.equals(((zzdd) zzdgVar2).zzb);
        }
        return true;
    }

    @Override // defpackage.s6o
    public final int g(zzdg zzdgVar) {
        int hashCode = zzdgVar.zzc.hashCode();
        if (!this.c) {
            return hashCode;
        }
        return ((zzdd) zzdgVar).zzb.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.s6o
    public final int h(zzdg zzdgVar) {
        zzfj zzfjVar = zzdgVar.zzc;
        int i = zzfjVar.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < zzfjVar.a; i2++) {
                int i3 = zzfjVar.b[i2] >>> 3;
                zzcg zzcgVar = (zzcg) zzfjVar.c[i2];
                int r = zzcn.r(8);
                int r2 = zzcn.r(i3) + zzcn.r(16);
                int r3 = zzcn.r(24);
                int d = zzcgVar.d();
                i = wt3.B(r + r, r2, x5n.B(d, d, r3), i);
            }
            zzfjVar.d = i;
        }
        if (!this.c) {
            return i;
        }
        i7o i7oVar = ((zzdd) zzdgVar).zzb.a;
        int i4 = i7oVar.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += hxn.g(i7oVar.a(i6));
        }
        Iterator it = i7oVar.c().iterator();
        while (it.hasNext()) {
            i5 += hxn.g((Map.Entry) it.next());
        }
        return i + i5;
    }

    @Override // defpackage.s6o
    public final Object zza() {
        zzel zzelVar = this.a;
        return zzelVar instanceof zzdg ? (zzdg) ((zzdg) zzelVar).d(4, null) : zzelVar.f().zzw();
    }
}
