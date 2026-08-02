package com.google.android.gms.internal.ads;

import defpackage.f0o;
import defpackage.fc6;
import defpackage.kno;
import defpackage.noo;
import defpackage.ooo;
import defpackage.w9f;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhxm implements zzhoq {
    public static final zzhxm a = new zzhxm();
    public static final kno b = new kno(zzhne.class, zzhfo.class, w9f.o);

    @Override // com.google.android.gms.internal.ads.zzhoq
    public final Object a(zzhfe zzhfeVar, f0o f0oVar) {
        zzich c;
        zzhof zzhofVar = new zzhof();
        for (int i = 0; i < zzhfeVar.zzd(); i++) {
            zzhfb d = ((zzhfd) zzhfeVar).d(i);
            if (d.b == zzheu.b) {
                zzhfo zzhfoVar = (zzhfo) f0oVar.c(d);
                zzhes a2 = d.a();
                if (a2 instanceof zzhyo) {
                    c = ((zzhyo) a2).c();
                } else {
                    if (!(a2 instanceof zzhne)) {
                        String name = a2.getClass().getName();
                        String valueOf = String.valueOf(a2.a());
                        throw new GeneralSecurityException(fc6.o(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    c = ((zzhne) a2).c();
                }
                zzhofVar.a(c, new ooo(zzhfoVar, d.c));
            }
        }
        if (((zzhnh) zzhfeVar.zzf()) == null) {
            return new noo(new zzhoh(zzhofVar.a));
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhoq
    public final Class zza() {
        return zzhfo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhoq
    public final Class zzb() {
        return zzhfo.class;
    }
}
