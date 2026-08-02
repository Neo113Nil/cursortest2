package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bno;
import defpackage.haf;
import defpackage.hno;
import defpackage.jno;
import defpackage.v9f;
import defpackage.w9f;
import defpackage.y9f;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhkf {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = new jno(zzhhd.class, haf.n);
        b = new hno(a2, v9f.m);
        c = new bno(zzhgw.class, w9f.m);
        d = new ano(a2, y9f.l);
    }

    public static zzhfm a(zzhhc zzhhcVar) {
        if (zzhhcVar.equals(zzhhc.b)) {
            return zzhfm.c;
        }
        if (zzhhcVar == zzhhc.c) {
            return zzhfm.f;
        }
        if (zzhhcVar == zzhhc.d) {
            return zzhfm.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhhcVar)));
    }

    public static zzhhc b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.c) {
            return zzhhc.b;
        }
        if (zzhfmVar == zzhfm.f || zzhfmVar == zzhfm.d) {
            return zzhhc.c;
        }
        if (zzhfmVar == zzhfm.e) {
            return zzhhc.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }
}
