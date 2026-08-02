package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bgf;
import defpackage.bno;
import defpackage.hno;
import defpackage.igf;
import defpackage.jno;
import defpackage.kif;
import defpackage.pff;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhqp {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new jno(zzhpm.class, kif.p);
        b = new hno(a2, pff.n);
        c = new bno(zzhpf.class, bgf.m);
        d = new ano(a2, igf.m);
    }

    public static zzhfm a(zzhpl zzhplVar) {
        if (zzhplVar.equals(zzhpl.b)) {
            return zzhfm.c;
        }
        if (zzhplVar == zzhpl.c) {
            return zzhfm.f;
        }
        if (zzhplVar == zzhpl.e) {
            return zzhfm.e;
        }
        if (zzhplVar == zzhpl.d) {
            return zzhfm.d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhplVar)));
    }

    public static zzhpl b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.c) {
            return zzhpl.b;
        }
        if (zzhfmVar == zzhfm.f) {
            return zzhpl.c;
        }
        if (zzhfmVar == zzhfm.d) {
            return zzhpl.d;
        }
        if (zzhfmVar == zzhfm.e) {
            return zzhpl.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }
}
