package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bno;
import defpackage.hno;
import defpackage.jno;
import defpackage.mpo;
import defpackage.n2f;
import defpackage.u8f;
import defpackage.v9f;
import defpackage.w9f;
import defpackage.x3f;
import defpackage.y9f;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhzt {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;
    public static final bno e;
    public static final ano f;
    public static final zzhmo g;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzich a3 = zzhpd.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        a = new jno(zzhxq.class, y9f.o);
        b = new hno(a2, n2f.p);
        c = new bno(zzhxu.class, x3f.m);
        d = new ano(a3, u8f.n);
        e = new bno(zzhxs.class, v9f.o);
        f = new ano(a2, w9f.p);
        zzhmn a4 = zzhmo.a();
        a4.a(zzhtl.SHA256, zzhxo.b);
        a4.a(zzhtl.SHA384, zzhxo.c);
        a4.a(zzhtl.SHA512, zzhxo.d);
        g = a4.b();
    }

    public static zzhfm a(zzhxp zzhxpVar) {
        if (zzhxpVar.equals(zzhxp.e)) {
            return zzhfm.e;
        }
        if (zzhxpVar == zzhxp.b) {
            return zzhfm.c;
        }
        if (zzhxpVar == zzhxp.c) {
            return zzhfm.f;
        }
        if (zzhxpVar == zzhxp.d) {
            return zzhfm.d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhxpVar)));
    }

    public static zzhxp b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.e) {
            return zzhxp.e;
        }
        if (zzhfmVar == zzhfm.c) {
            return zzhxp.b;
        }
        if (zzhfmVar == zzhfm.f) {
            return zzhxp.c;
        }
        if (zzhfmVar == zzhfm.d) {
            return zzhxp.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }

    public static zzhuz c(zzhxu zzhxuVar) {
        zzhuy I = zzhuz.I();
        zzhxq zzhxqVar = zzhxuVar.a;
        zzhuu E = zzhuv.E();
        zzhtl zzhtlVar = (zzhtl) g.b(zzhxqVar.d);
        E.n();
        ((zzhuv) E.b).G(zzhtlVar);
        zzhuv zzhuvVar = (zzhuv) E.o();
        I.n();
        ((zzhuz) I.b).L(zzhuvVar);
        byte[] a2 = zzhma.a(zzhxuVar.b);
        mpo mpoVar = zziei.b;
        mpo B = zziei.B(0, a2.length, a2);
        I.n();
        ((zzhuz) I.b).M(B);
        byte[] a3 = zzhma.a(zzhxuVar.a.b);
        mpo B2 = zziei.B(0, a3.length, a3);
        I.n();
        ((zzhuz) I.b).N(B2);
        return (zzhuz) I.o();
    }

    public static zzici d(zziei zzieiVar) {
        return new zzici(new BigInteger(1, zzieiVar.d()));
    }
}
