package com.google.android.gms.internal.ads;

import defpackage.f0o;
import defpackage.fc6;
import defpackage.fff;
import defpackage.jle;
import defpackage.kno;
import defpackage.rno;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhqe implements zzhoq {
    public static final zzhqe a = new zzhqe();
    public static final kno b = new kno(zzhne.class, zzhfi.class, fff.o);

    @Override // com.google.android.gms.internal.ads.zzhoq
    public final Object a(zzhfe zzhfeVar, f0o f0oVar) {
        zzich c;
        zzhof zzhofVar = new zzhof();
        for (int i = 0; i < zzhfeVar.zzd(); i++) {
            zzhfb d = ((zzhfd) zzhfeVar).d(i);
            if (d.b == zzheu.b) {
                zzhes a2 = d.a();
                if (a2 instanceof zzhqb) {
                    c = ((zzhqb) a2).c();
                } else {
                    if (!(a2 instanceof zzhne)) {
                        String name = a2.getClass().getName();
                        String valueOf = String.valueOf(a2.a());
                        throw new GeneralSecurityException(fc6.o(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    c = ((zzhne) a2).c();
                }
                zzhofVar.a(c, new jle(22));
            }
        }
        if (((zzhnh) zzhfeVar.zzf()) != null) {
            throw null;
        }
        zzhfd zzhfdVar = (zzhfd) zzhfeVar;
        zzhfdVar.c();
        return new rno();
    }

    @Override // com.google.android.gms.internal.ads.zzhoq
    public final Class zza() {
        return zzhfi.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhoq
    public final Class zzb() {
        return zzhfi.class;
    }
}
