package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bgf;
import defpackage.bno;
import defpackage.hno;
import defpackage.igf;
import defpackage.jno;
import defpackage.kif;
import defpackage.wkf;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhks {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = new jno(zzhhs.class, wkf.l);
        b = new hno(a2, bgf.l);
        c = new bno(zzhhn.class, igf.l);
        d = new ano(a2, kif.o);
    }

    public static zzhfm a(zzhhr zzhhrVar) {
        if (zzhhrVar.equals(zzhhr.b)) {
            return zzhfm.c;
        }
        if (zzhhrVar == zzhhr.c) {
            return zzhfm.f;
        }
        if (zzhhrVar == zzhhr.d) {
            return zzhfm.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhhrVar.a));
    }

    public static zzhhr b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.c) {
            return zzhhr.b;
        }
        if (zzhfmVar == zzhfm.f || zzhfmVar == zzhfm.d) {
            return zzhhr.c;
        }
        if (zzhfmVar == zzhfm.e) {
            return zzhhr.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }
}
