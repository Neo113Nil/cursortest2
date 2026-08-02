package com.google.android.gms.internal.auth;

import defpackage.bm2;
import defpackage.ido;
import defpackage.nco;
import defpackage.nko;
import defpackage.o5o;
import defpackage.x4o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c implements ido {
    public final zzfx a;
    public final nko b;

    public c(nko nkoVar, x4o x4oVar, zzfx zzfxVar) {
        this.b = nkoVar;
        this.a = zzfxVar;
    }

    @Override // defpackage.ido
    public final void a(Object obj) {
        this.b.getClass();
        zzha zzhaVar = ((zzev) obj).zzc;
        if (zzhaVar.d) {
            zzhaVar.d = false;
        }
        o5o o5oVar = ((zzeu) obj).zzb;
        throw null;
    }

    @Override // defpackage.ido
    public final void b(Object obj, byte[] bArr, int i, int i2, bm2 bm2Var) {
        zzev zzevVar = (zzev) obj;
        if (zzevVar.zzc == zzha.e) {
            zzevVar.zzc = zzha.a();
        }
        throw null;
    }

    @Override // defpackage.ido
    public final boolean c(zzev zzevVar, zzev zzevVar2) {
        this.b.getClass();
        return zzevVar.zzc.equals(zzevVar2.zzc);
    }

    @Override // defpackage.ido
    public final int d(zzev zzevVar) {
        this.b.getClass();
        return zzevVar.zzc.hashCode();
    }

    @Override // defpackage.ido
    public final void e(Object obj, Object obj2) {
        d.a(this.b, obj, obj2);
    }

    @Override // defpackage.ido
    public final boolean f(Object obj) {
        o5o o5oVar = ((zzeu) obj).zzb;
        throw null;
    }

    @Override // defpackage.ido
    public final zzev zzd() {
        zzfx zzfxVar = this.a;
        if (zzfxVar instanceof zzev) {
            return (zzev) ((zzev) zzfxVar).g(4);
        }
        zzet zzetVar = (zzet) ((zzev) zzfxVar).g(5);
        boolean f = zzetVar.b.f();
        zzev zzevVar = zzetVar.b;
        if (!f) {
            return zzevVar;
        }
        zzevVar.getClass();
        nco.c.a(zzevVar.getClass()).a(zzevVar);
        zzevVar.c();
        return zzetVar.b;
    }
}
