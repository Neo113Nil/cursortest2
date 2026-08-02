package com.google.android.gms.internal.ads;

import defpackage.jmo;
import defpackage.jno;
import defpackage.kmo;
import defpackage.kno;
import defpackage.nmo;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhfv {
    static {
        int i = zzhur.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        zzhgc zzhgcVar = zzhgc.a;
        zzhnt zzhntVar = zzhnt.b;
        zzhntVar.b(zzhgc.a);
        zzhntVar.a(zzhgc.b);
        zzhqa.a();
        int i = zzhgi.e;
        if (!zzhlx.a(i)) {
            defpackage.zzl.x("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        jno jnoVar = zzhjt.a;
        zzhnw zzhnwVar = zzhnw.b;
        zzhnwVar.c(zzhjt.a);
        zzhnwVar.d(zzhjt.b);
        zzhnwVar.a(zzhjt.c);
        zzhnwVar.b(zzhjt.d);
        zzhntVar.a(zzhgi.a);
        zzhns zzhnsVar = zzhns.b;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzhjb.e);
        zzhgj zzhgjVar = new zzhgj(0);
        zzhgjVar.a(16);
        zzhgjVar.b(32);
        zzhgjVar.d(16);
        zzhgjVar.c(16);
        zzhgk zzhgkVar = zzhgk.d;
        zzhgjVar.e = zzhgkVar;
        zzhgl zzhglVar = zzhgl.d;
        zzhgjVar.f = zzhglVar;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzhgjVar.e());
        hashMap.put("AES256_CTR_HMAC_SHA256", zzhjb.f);
        zzhgj zzhgjVar2 = new zzhgj(0);
        zzhgjVar2.a(32);
        zzhgjVar2.b(32);
        zzhgjVar2.d(32);
        zzhgjVar2.c(16);
        zzhgjVar2.e = zzhgkVar;
        zzhgjVar2.f = zzhglVar;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzhgjVar2.e());
        zzhnsVar.b(Collections.unmodifiableMap(hashMap));
        zzhnp zzhnpVar = zzhnp.b;
        zzhnpVar.a(zzhgi.c, zzhgm.class);
        zzhnn zzhnnVar = zzhnn.b;
        zzhnnVar.a(zzhgi.d, zzhgm.class);
        zzhmu zzhmuVar = zzhmu.d;
        zzhmuVar.c(zzhgi.b, i, true);
        int i2 = zzhha.e;
        if (!zzhlx.a(i2)) {
            defpackage.zzl.x("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        zzhnwVar.c(zzhkf.a);
        zzhnwVar.d(zzhkf.b);
        zzhnwVar.a(zzhkf.c);
        zzhnwVar.b(zzhkf.d);
        zzhntVar.a(zzhha.a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", zzhjb.a);
        zzhhb zzhhbVar = new zzhhb(0);
        zzhhbVar.b();
        zzhhbVar.a(16);
        zzhhbVar.c();
        zzhhc zzhhcVar = zzhhc.d;
        zzhhbVar.d = zzhhcVar;
        hashMap2.put("AES128_GCM_RAW", zzhhbVar.d());
        hashMap2.put("AES256_GCM", zzhjb.b);
        zzhhb zzhhbVar2 = new zzhhb(0);
        zzhhbVar2.b();
        zzhhbVar2.a(32);
        zzhhbVar2.c();
        zzhhbVar2.d = zzhhcVar;
        hashMap2.put("AES256_GCM_RAW", zzhhbVar2.d());
        zzhnsVar.b(Collections.unmodifiableMap(hashMap2));
        zzhnpVar.a(zzhha.c, zzhhd.class);
        zzhnnVar.a(zzhha.d, zzhhd.class);
        zzhmuVar.c(zzhha.b, i2, true);
        if (zzhly.a()) {
            return;
        }
        kno knoVar = zzhgr.a;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Registering AES EAX is not supported in FIPS mode");
            return;
        }
        zzhnwVar.c(zzhjy.a);
        zzhnwVar.d(zzhjy.b);
        zzhnwVar.a(zzhjy.c);
        zzhnwVar.b(zzhjy.d);
        zzhntVar.a(zzhgr.a);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", zzhjb.c);
        zzhgs zzhgsVar = new zzhgs(0);
        zzhgsVar.b(16);
        zzhgsVar.a(16);
        zzhgsVar.c();
        zzhgt zzhgtVar = zzhgt.d;
        zzhgsVar.d = zzhgtVar;
        hashMap3.put("AES128_EAX_RAW", zzhgsVar.d());
        hashMap3.put("AES256_EAX", zzhjb.d);
        zzhgs zzhgsVar2 = new zzhgs(0);
        zzhgsVar2.b(16);
        zzhgsVar2.a(32);
        zzhgsVar2.c();
        zzhgsVar2.d = zzhgtVar;
        hashMap3.put("AES256_EAX_RAW", zzhgsVar2.d());
        zzhnsVar.b(Collections.unmodifiableMap(hashMap3));
        zzhnnVar.a(zzhgr.c, zzhgu.class);
        zzhmuVar.a(zzhgr.b, true);
        kno knoVar2 = zzhhj.a;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        zzhnwVar.c(zzhkm.a);
        zzhnwVar.d(zzhkm.b);
        zzhnwVar.a(zzhkm.c);
        zzhnwVar.b(zzhkm.d);
        HashMap hashMap4 = new HashMap();
        zzhhk zzhhkVar = new zzhhk(0);
        zzhhkVar.a(16);
        zzhhl zzhhlVar = zzhhl.b;
        zzhhkVar.b = zzhhlVar;
        hashMap4.put("AES128_GCM_SIV", zzhhkVar.b());
        zzhhk zzhhkVar2 = new zzhhk(0);
        zzhhkVar2.a(16);
        zzhhl zzhhlVar2 = zzhhl.d;
        zzhhkVar2.b = zzhhlVar2;
        hashMap4.put("AES128_GCM_SIV_RAW", zzhhkVar2.b());
        zzhhk zzhhkVar3 = new zzhhk(0);
        zzhhkVar3.a(32);
        zzhhkVar3.b = zzhhlVar;
        hashMap4.put("AES256_GCM_SIV", zzhhkVar3.b());
        zzhhk zzhhkVar4 = new zzhhk(0);
        zzhhkVar4.a(32);
        zzhhkVar4.b = zzhhlVar2;
        hashMap4.put("AES256_GCM_SIV_RAW", zzhhkVar4.b());
        zzhnsVar.b(Collections.unmodifiableMap(hashMap4));
        zzhnpVar.a(kmo.c, zzhhm.class);
        zzhnnVar.a(jmo.e, zzhhm.class);
        zzhntVar.a(zzhhj.a);
        zzhmuVar.a(zzhhj.b, true);
        kno knoVar3 = zzhhq.a;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Registering ChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        zzhnwVar.c(zzhks.a);
        zzhnwVar.d(zzhks.b);
        zzhnwVar.a(zzhks.c);
        zzhnwVar.b(zzhks.d);
        zzhntVar.a(zzhhq.a);
        zzhnnVar.a(jmo.f, zzhhs.class);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new zzhhs(zzhhr.b));
        hashMap5.put("CHACHA20_POLY1305_RAW", new zzhhs(zzhhr.d));
        zzhnsVar.b(Collections.unmodifiableMap(hashMap5));
        zzhmuVar.a(zzhhq.b, true);
        kno knoVar4 = zzhhv.a;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Registering KMS AEAD is not supported in FIPS mode");
            return;
        }
        zzhnwVar.c(nmo.a);
        zzhnwVar.d(nmo.b);
        zzhnwVar.a(nmo.c);
        zzhnwVar.b(nmo.d);
        zzhntVar.a(zzhhv.a);
        zzhnnVar.a(zzhhv.c, zzhic.class);
        zzhmuVar.a(zzhhv.b, true);
        zzhnc zzhncVar = zzhhz.a;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Registering KMS Envelope AEAD is not supported in FIPS mode");
            return;
        }
        zzhnwVar.c(zzhir.a);
        zzhnwVar.d(zzhir.b);
        zzhnwVar.a(zzhir.c);
        zzhnwVar.b(zzhir.d);
        zzhnnVar.a(zzhhz.b, zzhim.class);
        zzhntVar.a(zzhhz.c);
        zzhmuVar.a(zzhhz.a, true);
        kno knoVar5 = zzhjm.a;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Registering XChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        zzhnwVar.c(zzhlq.a);
        zzhnwVar.d(zzhlq.b);
        zzhnwVar.a(zzhlq.c);
        zzhnwVar.b(zzhlq.d);
        zzhntVar.a(zzhjm.a);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new zzhjo(zzhjn.b));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new zzhjo(zzhjn.d));
        zzhnsVar.b(Collections.unmodifiableMap(hashMap6));
        zzhnnVar.a(zzhjm.d, zzhjo.class);
        zzhnpVar.a(zzhjm.c, zzhjo.class);
        zzhmuVar.a(zzhjm.b, true);
        kno knoVar6 = zzhjf.a;
        zzhnwVar.c(zzhlk.a);
        zzhnwVar.d(zzhlk.b);
        zzhnwVar.a(zzhlk.c);
        zzhnwVar.b(zzhlk.d);
        HashMap hashMap7 = new HashMap();
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", zzhjb.g);
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhjb.h);
        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhjb.i);
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhjb.j);
        zzhnsVar.b(Collections.unmodifiableMap(hashMap7));
        zzhntVar.a(zzhjf.a);
        zzhnnVar.a(jmo.i, zzhjh.class);
    }
}
