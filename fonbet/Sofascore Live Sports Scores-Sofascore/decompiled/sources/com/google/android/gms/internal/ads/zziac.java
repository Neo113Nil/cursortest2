package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bno;
import defpackage.dff;
import defpackage.fff;
import defpackage.haf;
import defpackage.hno;
import defpackage.igf;
import defpackage.jno;
import defpackage.kif;
import defpackage.mpo;
import defpackage.ubf;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziac {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;
    public static final bno e;
    public static final ano f;
    public static final zzhmo g;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzich a3 = zzhpd.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        a = new jno(zzhyc.class, kif.r);
        b = new hno(a2, haf.q);
        c = new bno(zzhyg.class, ubf.o);
        d = new ano(a3, dff.p);
        e = new bno(zzhye.class, fff.q);
        f = new ano(a2, igf.o);
        zzhmn a4 = zzhmo.a();
        a4.a(zzhtl.SHA256, zzhya.b);
        a4.a(zzhtl.SHA384, zzhya.c);
        a4.a(zzhtl.SHA512, zzhya.d);
        g = a4.b();
    }

    public static zzhfm a(zzhyb zzhybVar) {
        if (zzhybVar.equals(zzhyb.e)) {
            return zzhfm.e;
        }
        if (zzhybVar == zzhyb.b) {
            return zzhfm.c;
        }
        if (zzhybVar == zzhyb.c) {
            return zzhfm.f;
        }
        if (zzhybVar == zzhyb.d) {
            return zzhfm.d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhybVar)));
    }

    public static zzhyb b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.e) {
            return zzhyb.e;
        }
        if (zzhfmVar == zzhfm.c) {
            return zzhyb.b;
        }
        if (zzhfmVar == zzhfm.f) {
            return zzhyb.c;
        }
        if (zzhfmVar == zzhfm.d) {
            return zzhyb.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }

    public static zzhvd c(zzhyc zzhycVar) {
        zzhvc G = zzhvd.G();
        zzhya zzhyaVar = zzhycVar.d;
        zzhmo zzhmoVar = g;
        zzhtl zzhtlVar = (zzhtl) zzhmoVar.b(zzhyaVar);
        G.n();
        ((zzhvd) G.b).I(zzhtlVar);
        zzhtl zzhtlVar2 = (zzhtl) zzhmoVar.b(zzhycVar.e);
        G.n();
        ((zzhvd) G.b).J(zzhtlVar2);
        int i = zzhycVar.f;
        G.n();
        ((zzhvd) G.b).K(i);
        return (zzhvd) G.o();
    }

    public static zzhvh d(zzhyg zzhygVar) {
        zzhvg I = zzhvh.I();
        zzhvd c2 = c(zzhygVar.a);
        I.n();
        ((zzhvh) I.b).M(c2);
        byte[] a2 = zzhma.a(zzhygVar.b);
        mpo mpoVar = zziei.b;
        mpo B = zziei.B(0, a2.length, a2);
        I.n();
        ((zzhvh) I.b).N(B);
        byte[] a3 = zzhma.a(zzhygVar.a.b);
        mpo B2 = zziei.B(0, a3.length, a3);
        I.n();
        ((zzhvh) I.b).O(B2);
        I.n();
        ((zzhvh) I.b).L(0);
        return (zzhvh) I.o();
    }

    public static zzici e(zziei zzieiVar) {
        return new zzici(new BigInteger(1, zzieiVar.d()));
    }
}
