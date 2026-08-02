package com.google.android.gms.internal.ads;

import defpackage.ano;
import defpackage.bno;
import defpackage.e2f;
import defpackage.hno;
import defpackage.jno;
import defpackage.jpe;
import defpackage.n2f;
import defpackage.x3f;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhlq {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = new jno(zzhjo.class, x3f.k);
        b = new hno(a2, jpe.o);
        c = new bno(zzhji.class, e2f.j);
        d = new ano(a2, n2f.n);
    }

    public static zzhfm a(zzhjn zzhjnVar) {
        if (zzhjnVar.equals(zzhjn.b)) {
            return zzhfm.c;
        }
        if (zzhjnVar == zzhjn.c) {
            return zzhfm.f;
        }
        if (zzhjnVar == zzhjn.d) {
            return zzhfm.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhjnVar.a));
    }

    public static zzhjn b(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.c) {
            return zzhjn.b;
        }
        if (zzhfmVar == zzhfm.f || zzhfmVar == zzhfm.d) {
            return zzhjn.c;
        }
        if (zzhfmVar == zzhfm.e) {
            return zzhjn.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
    }
}
