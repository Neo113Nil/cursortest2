package com.google.android.gms.internal.ads;

import defpackage.anf;
import defpackage.ano;
import defpackage.bno;
import defpackage.hno;
import defpackage.jno;
import defpackage.omf;
import defpackage.wje;
import defpackage.wkf;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhqy {
    public static final zzhmo a;
    public static final jno b;
    public static final hno c;
    public static final bno d;
    public static final ano e;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhmn a3 = zzhmo.a();
        a3.a(zzhtl.SHA1, zzhpx.b);
        a3.a(zzhtl.SHA224, zzhpx.c);
        a3.a(zzhtl.SHA256, zzhpx.d);
        a3.a(zzhtl.SHA384, zzhpx.e);
        a3.a(zzhtl.SHA512, zzhpx.f);
        a = a3.b();
        b = new jno(zzhpz.class, wje.m);
        c = new hno(a2, wkf.m);
        d = new bno(zzhpq.class, omf.m);
        e = new ano(a2, anf.n);
    }

    public static zzhfm a(zzhpy zzhpyVar) {
        if (zzhpyVar == zzhpy.e) {
            return zzhfm.e;
        }
        if (zzhpyVar == zzhpy.b) {
            return zzhfm.c;
        }
        if (zzhpyVar == zzhpy.d) {
            return zzhfm.d;
        }
        if (zzhpyVar == zzhpy.c) {
            return zzhfm.f;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(zzhpyVar)));
    }

    public static zzhpy b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.e) {
            return zzhpy.e;
        }
        if (zzhfmVar == zzhfm.c) {
            return zzhpy.b;
        }
        if (zzhfmVar == zzhfm.d) {
            return zzhpy.d;
        }
        if (zzhfmVar == zzhfm.f) {
            return zzhpy.c;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(zzhfmVar.a));
    }
}
