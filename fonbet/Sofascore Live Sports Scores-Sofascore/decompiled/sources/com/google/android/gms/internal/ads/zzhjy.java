package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bno;
import defpackage.e2f;
import defpackage.hno;
import defpackage.jno;
import defpackage.n2f;
import defpackage.u8f;
import defpackage.x3f;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhjy {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = new jno(zzhgu.class, u8f.l);
        b = new hno(a2, e2f.i);
        c = new bno(zzhgo.class, n2f.m);
        d = new ano(a2, x3f.j);
    }

    public static zzhfm a(zzhgt zzhgtVar) {
        if (zzhgtVar.equals(zzhgt.b)) {
            return zzhfm.c;
        }
        if (zzhgtVar == zzhgt.c) {
            return zzhfm.f;
        }
        if (zzhgtVar == zzhgt.d) {
            return zzhfm.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhgtVar)));
    }

    public static zzhgt b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.c) {
            return zzhgt.b;
        }
        if (zzhfmVar == zzhfm.f || zzhfmVar == zzhfm.d) {
            return zzhgt.c;
        }
        if (zzhfmVar == zzhfm.e) {
            return zzhgt.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }
}
