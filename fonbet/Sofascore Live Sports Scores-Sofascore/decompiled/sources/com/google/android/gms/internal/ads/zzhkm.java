package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bno;
import defpackage.dff;
import defpackage.fff;
import defpackage.hno;
import defpackage.jno;
import defpackage.pff;
import defpackage.ubf;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhkm {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = new jno(zzhhm.class, pff.m);
        b = new hno(a2, ubf.l);
        c = new bno(zzhhf.class, dff.m);
        d = new ano(a2, fff.n);
    }

    public static zzhfm a(zzhhl zzhhlVar) {
        if (zzhhlVar.equals(zzhhl.b)) {
            return zzhfm.c;
        }
        if (zzhhlVar == zzhhl.c) {
            return zzhfm.f;
        }
        if (zzhhlVar == zzhhl.d) {
            return zzhfm.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhhlVar)));
    }

    public static zzhhl b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.c) {
            return zzhhl.b;
        }
        if (zzhfmVar == zzhfm.f || zzhfmVar == zzhfm.d) {
            return zzhhl.c;
        }
        if (zzhfmVar == zzhfm.e) {
            return zzhhl.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }
}
