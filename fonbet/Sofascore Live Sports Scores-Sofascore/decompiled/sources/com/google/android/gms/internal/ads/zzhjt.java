package com.google.android.gms.internal.ads;

import defpackage.anf;
import defpackage.ano;
import defpackage.bno;
import defpackage.hno;
import defpackage.jle;
import defpackage.jno;
import defpackage.jpe;
import defpackage.me4;
import defpackage.wje;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhjt {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = new jno(zzhgm.class, jpe.n);
        b = new hno(a2, anf.l);
        c = new bno(zzhge.class, wje.k);
        d = new ano(a2, jle.j);
    }

    public static zzhfm a(zzhgl zzhglVar) {
        if (zzhglVar.equals(zzhgl.b)) {
            return zzhfm.c;
        }
        if (zzhglVar == zzhgl.c) {
            return zzhfm.f;
        }
        if (zzhglVar == zzhgl.d) {
            return zzhfm.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhglVar)));
    }

    public static zzhgl b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.c) {
            return zzhgl.b;
        }
        if (zzhfmVar == zzhfm.f || zzhfmVar == zzhfm.d) {
            return zzhgl.c;
        }
        if (zzhfmVar == zzhfm.e) {
            return zzhgl.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }

    public static zzhgk c(zzhtl zzhtlVar) {
        int ordinal = zzhtlVar.ordinal();
        if (ordinal == 1) {
            return zzhgk.b;
        }
        if (ordinal == 2) {
            return zzhgk.e;
        }
        if (ordinal == 3) {
            return zzhgk.d;
        }
        if (ordinal == 4) {
            return zzhgk.f;
        }
        if (ordinal == 5) {
            return zzhgk.c;
        }
        int zza = zzhtlVar.zza();
        throw new GeneralSecurityException(me4.g(zza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(zza).length() + 26)));
    }

    public static zzhtr d(zzhgm zzhgmVar) {
        zzhtl zzhtlVar;
        zzhtq F = zzhtr.F();
        int i = zzhgmVar.d;
        F.n();
        ((zzhtr) F.b).I(i);
        zzhgk zzhgkVar = zzhgmVar.f;
        if (zzhgkVar.equals(zzhgk.b)) {
            zzhtlVar = zzhtl.SHA1;
        } else if (zzhgkVar == zzhgk.c) {
            zzhtlVar = zzhtl.SHA224;
        } else if (zzhgkVar == zzhgk.d) {
            zzhtlVar = zzhtl.SHA256;
        } else if (zzhgkVar == zzhgk.e) {
            zzhtlVar = zzhtl.SHA384;
        } else {
            if (zzhgkVar != zzhgk.f) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzhgkVar)));
            }
            zzhtlVar = zzhtl.SHA512;
        }
        F.n();
        ((zzhtr) F.b).H(zzhtlVar);
        return (zzhtr) F.o();
    }
}
