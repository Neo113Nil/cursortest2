package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bgf;
import defpackage.bno;
import defpackage.fff;
import defpackage.hno;
import defpackage.igf;
import defpackage.jno;
import defpackage.kif;
import defpackage.me4;
import defpackage.mpo;
import defpackage.pff;
import defpackage.wkf;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhyz {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;
    public static final bno e;
    public static final ano f;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzich a3 = zzhpd.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        a = new jno(zzhvx.class, wkf.n);
        b = new hno(a2, fff.p);
        c = new bno(zzhwb.class, pff.o);
        d = new ano(a3, bgf.n);
        e = new bno(zzhvz.class, igf.n);
        f = new ano(a2, kif.q);
    }

    public static zzhfm a(zzhvw zzhvwVar) {
        if (zzhvwVar.equals(zzhvw.b)) {
            return zzhfm.c;
        }
        if (zzhvwVar == zzhvw.c) {
            return zzhfm.f;
        }
        if (zzhvwVar == zzhvw.e) {
            return zzhfm.e;
        }
        if (zzhvwVar == zzhvw.d) {
            return zzhfm.d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhvwVar.a));
    }

    public static zzhvu b(zzhtl zzhtlVar) {
        int ordinal = zzhtlVar.ordinal();
        if (ordinal == 2) {
            return zzhvu.c;
        }
        if (ordinal == 3) {
            return zzhvu.b;
        }
        if (ordinal == 4) {
            return zzhvu.d;
        }
        int zza = zzhtlVar.zza();
        throw new GeneralSecurityException(me4.g(zza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(zza).length() + 26)));
    }

    public static zzhvw c(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.c) {
            return zzhvw.b;
        }
        if (zzhfmVar == zzhfm.f) {
            return zzhvw.c;
        }
        if (zzhfmVar == zzhfm.d) {
            return zzhvw.d;
        }
        if (zzhfmVar == zzhfm.e) {
            return zzhvw.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }

    public static int d(zzhvt zzhvtVar) {
        if (zzhvtVar.equals(zzhvt.c)) {
            return 33;
        }
        if (zzhvtVar == zzhvt.d) {
            return 49;
        }
        if (zzhvtVar == zzhvt.e) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhvtVar.a));
    }

    public static zzhsy e(zzhvx zzhvxVar) {
        zzhtl zzhtlVar;
        int i;
        zzhsx E = zzhsy.E();
        zzhvu zzhvuVar = zzhvxVar.c;
        if (zzhvuVar.equals(zzhvu.b)) {
            zzhtlVar = zzhtl.SHA256;
        } else if (zzhvuVar == zzhvu.c) {
            zzhtlVar = zzhtl.SHA384;
        } else {
            if (zzhvuVar != zzhvu.d) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zzhvuVar.a));
            }
            zzhtlVar = zzhtl.SHA512;
        }
        E.n();
        ((zzhsy) E.b).G(zzhtlVar);
        zzhvt zzhvtVar = zzhvxVar.b;
        int i2 = 4;
        if (zzhvtVar.equals(zzhvt.c)) {
            i = 4;
        } else if (zzhvtVar == zzhvt.d) {
            i = 5;
        } else {
            if (zzhvtVar != zzhvt.e) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhvtVar.a));
            }
            i = 6;
        }
        E.n();
        ((zzhsy) E.b).J(i);
        zzhvv zzhvvVar = zzhvxVar.a;
        if (zzhvvVar.equals(zzhvv.b)) {
            i2 = 3;
        } else if (zzhvvVar != zzhvv.c) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzhvvVar.a));
        }
        E.n();
        ((zzhsy) E.b).K(i2);
        return (zzhsy) E.o();
    }

    public static zzhtc f(zzhwb zzhwbVar) {
        int d2 = d(zzhwbVar.a.b);
        ECPoint eCPoint = zzhwbVar.b;
        zzhtb I = zzhtc.I();
        zzhsy e2 = e(zzhwbVar.a);
        I.n();
        ((zzhtc) I.b).L(e2);
        byte[] b2 = zzhma.b(eCPoint.getAffineX(), d2);
        mpo mpoVar = zziei.b;
        mpo B = zziei.B(0, b2.length, b2);
        I.n();
        ((zzhtc) I.b).M(B);
        byte[] b3 = zzhma.b(eCPoint.getAffineY(), d2);
        mpo B2 = zziei.B(0, b3.length, b3);
        I.n();
        ((zzhtc) I.b).N(B2);
        return (zzhtc) I.o();
    }

    public static zzhvt g(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return zzhvt.c;
        }
        if (i2 == 3) {
            return zzhvt.d;
        }
        if (i2 == 4) {
            return zzhvt.e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(me4.g(i2, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i2).length() + 35)));
        }
        zzifz.a();
        throw null;
    }

    public static zzhvv h(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return zzhvv.b;
        }
        if (i2 == 2) {
            return zzhvv.c;
        }
        if (i != 1) {
            throw new GeneralSecurityException(me4.g(i2, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i2).length() + 40)));
        }
        zzifz.a();
        throw null;
    }
}
