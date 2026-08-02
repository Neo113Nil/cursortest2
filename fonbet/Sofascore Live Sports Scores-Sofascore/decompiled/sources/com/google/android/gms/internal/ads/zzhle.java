package com.google.android.gms.internal.ads;

import defpackage.fc6;
import defpackage.qmo;
import defpackage.rmo;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhle {
    public static rmo a(zzhfe zzhfeVar, zzhop zzhopVar) {
        zzich c;
        zzhof zzhofVar = new zzhof();
        for (int i = 0; i < zzhfeVar.zzd(); i++) {
            zzhfb d = ((zzhfd) zzhfeVar).d(i);
            if (d.b == zzheu.b) {
                zzhes a = d.a();
                if (a instanceof zzhfz) {
                    c = ((zzhfz) a).c();
                } else {
                    if (!(a instanceof zzhne)) {
                        String name = a.getClass().getName();
                        String valueOf = String.valueOf(a.a());
                        throw new GeneralSecurityException(fc6.o(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    c = ((zzhne) a).c();
                }
                zzhofVar.a(c, new qmo((zzhek) zzhopVar.c(d), d.c));
            }
        }
        if (((zzhnh) zzhfeVar.zzf()) != null) {
            throw null;
        }
        zzhfd zzhfdVar = (zzhfd) zzhfeVar;
        zzhfdVar.c();
        return new rmo(new zzhoh(zzhofVar.a));
    }
}
