package com.google.android.gms.internal.ads;

import defpackage.anf;
import defpackage.ano;
import defpackage.bno;
import defpackage.e2f;
import defpackage.hno;
import defpackage.jle;
import defpackage.jno;
import defpackage.jpe;
import defpackage.mpo;
import defpackage.omf;
import defpackage.wje;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhzi {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;
    public static final bno e;
    public static final ano f;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzich a3 = zzhpd.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        a = new jno(zzhwh.class, e2f.l);
        b = new hno(a2, omf.n);
        c = new bno(zzhwo.class, anf.o);
        d = new ano(a3, wje.n);
        e = new bno(zzhwi.class, jle.l);
        f = new ano(a2, jpe.p);
    }

    public static zzhfm a(zzhwg zzhwgVar) {
        if (zzhwgVar.equals(zzhwg.e)) {
            return zzhfm.e;
        }
        if (zzhwgVar == zzhwg.b) {
            return zzhfm.c;
        }
        if (zzhwgVar == zzhwg.c) {
            return zzhfm.f;
        }
        if (zzhwgVar == zzhwg.d) {
            return zzhfm.d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhwgVar.a));
    }

    public static zzhwg b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.e) {
            return zzhwg.e;
        }
        if (zzhfmVar == zzhfm.c) {
            return zzhwg.b;
        }
        if (zzhfmVar == zzhfm.f) {
            return zzhwg.c;
        }
        if (zzhfmVar == zzhfm.d) {
            return zzhwg.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }

    public static zzhtj c(zzhwo zzhwoVar) {
        zzhti G = zzhtj.G();
        byte[] b2 = zzhwoVar.b.b();
        mpo B = zziei.B(0, b2.length, b2);
        G.n();
        ((zzhtj) G.b).J(B);
        return (zzhtj) G.o();
    }
}
