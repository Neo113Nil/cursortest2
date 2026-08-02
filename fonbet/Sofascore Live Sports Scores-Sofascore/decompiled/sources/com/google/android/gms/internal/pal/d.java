package com.google.android.gms.internal.pal;

import defpackage.c9n;
import defpackage.d7n;
import defpackage.e3c;
import defpackage.hdn;
import defpackage.kcn;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d implements kcn {
    public final zzaef a;
    public final hdn b;
    public final boolean c;

    public d(hdn hdnVar, a aVar, zzaef zzaefVar) {
        this.b = hdnVar;
        this.c = zzaefVar instanceof zzacw;
        this.a = zzaefVar;
    }

    @Override // defpackage.kcn
    public final void a(Object obj) {
        this.b.getClass();
        ((zzacz) obj).zzc.e = false;
        c9n c9nVar = ((zzacw) obj).zzb;
        throw null;
    }

    @Override // defpackage.kcn
    public final boolean b(Object obj) {
        a.a(obj);
        throw null;
    }

    @Override // defpackage.kcn
    public final void c(Object obj, byte[] bArr, int i, int i2, d7n d7nVar) {
        zzacz zzaczVar = (zzacz) obj;
        if (zzaczVar.zzc == zzafj.f) {
            zzaczVar.zzc = zzafj.b();
        }
        throw null;
    }

    @Override // defpackage.kcn
    public final void d(zzacz zzaczVar, zzacz zzaczVar2) {
        e.c(this.b, zzaczVar, zzaczVar2);
        if (this.c) {
            a.a(zzaczVar2);
            throw null;
        }
    }

    @Override // defpackage.kcn
    public final void e(Object obj, e3c e3cVar) {
        a.a(obj);
        throw null;
    }

    @Override // defpackage.kcn
    public final boolean f(zzacz zzaczVar, zzacz zzaczVar2) {
        this.b.getClass();
        if (!zzaczVar.zzc.equals(zzaczVar2.zzc)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        a.a(zzaczVar);
        throw null;
    }

    @Override // defpackage.kcn
    public final int g(zzacz zzaczVar) {
        this.b.getClass();
        int hashCode = zzaczVar.zzc.hashCode();
        if (!this.c) {
            return hashCode;
        }
        a.a(zzaczVar);
        throw null;
    }

    @Override // defpackage.kcn
    public final int zza(Object obj) {
        this.b.getClass();
        zzafj zzafjVar = ((zzacz) obj).zzc;
        int i = zzafjVar.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < zzafjVar.a; i3++) {
                int i4 = zzafjVar.b[i3];
                zzaby zzabyVar = (zzaby) zzafjVar.c[i3];
                int a = zzach.a(8);
                int m = zzabyVar.m();
                i2 += zzach.a(m) + m + zzach.a(24) + x5n.t(i4 >>> 3, zzach.a(16), a + a);
            }
            zzafjVar.d = i2;
            i = i2;
        }
        if (!this.c) {
            return i;
        }
        a.a(obj);
        throw null;
    }

    @Override // defpackage.kcn
    public final Object zze() {
        return this.a.x().i();
    }
}
