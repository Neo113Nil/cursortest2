package com.google.android.gms.internal.ads;

import defpackage.jmo;
import defpackage.kno;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhqa {
    static {
        int i = zzhur.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        zzhqe zzhqeVar = zzhqe.a;
        zzhnt zzhntVar = zzhnt.b;
        zzhntVar.b(zzhqe.a);
        zzhntVar.a(zzhqe.b);
        zzhntVar.b(zzhpo.a);
        int i = zzhpv.f;
        if (!zzhlx.a(i)) {
            defpackage.zzl.x("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        zzhmo zzhmoVar = zzhqy.a;
        zzhnw zzhnwVar = zzhnw.b;
        zzhnwVar.c(zzhqy.b);
        zzhnwVar.d(zzhqy.c);
        zzhnwVar.a(zzhqy.d);
        zzhnwVar.b(zzhqy.e);
        zzhntVar.a(zzhpv.a);
        zzhntVar.a(zzhpv.b);
        zzhns zzhnsVar = zzhns.b;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzhqk.a);
        zzhpw zzhpwVar = new zzhpw(0);
        zzhpwVar.a(32);
        zzhpwVar.b(16);
        zzhpy zzhpyVar = zzhpy.e;
        zzhpwVar.d = zzhpyVar;
        zzhpx zzhpxVar = zzhpx.d;
        zzhpwVar.c = zzhpxVar;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzhpwVar.c());
        zzhpw zzhpwVar2 = new zzhpw(0);
        zzhpwVar2.a(32);
        zzhpwVar2.b(32);
        zzhpy zzhpyVar2 = zzhpy.b;
        zzhpwVar2.d = zzhpyVar2;
        zzhpwVar2.c = zzhpxVar;
        hashMap.put("HMAC_SHA256_256BITTAG", zzhpwVar2.c());
        zzhpw zzhpwVar3 = new zzhpw(0);
        zzhpwVar3.a(32);
        zzhpwVar3.b(32);
        zzhpwVar3.d = zzhpyVar;
        zzhpwVar3.c = zzhpxVar;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzhpwVar3.c());
        zzhpw zzhpwVar4 = new zzhpw(0);
        zzhpwVar4.a(64);
        zzhpwVar4.b(16);
        zzhpwVar4.d = zzhpyVar2;
        zzhpx zzhpxVar2 = zzhpx.f;
        zzhpwVar4.c = zzhpxVar2;
        hashMap.put("HMAC_SHA512_128BITTAG", zzhpwVar4.c());
        zzhpw zzhpwVar5 = new zzhpw(0);
        zzhpwVar5.a(64);
        zzhpwVar5.b(16);
        zzhpwVar5.d = zzhpyVar;
        zzhpwVar5.c = zzhpxVar2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzhpwVar5.c());
        zzhpw zzhpwVar6 = new zzhpw(0);
        zzhpwVar6.a(64);
        zzhpwVar6.b(32);
        zzhpwVar6.d = zzhpyVar2;
        zzhpwVar6.c = zzhpxVar2;
        hashMap.put("HMAC_SHA512_256BITTAG", zzhpwVar6.c());
        zzhpw zzhpwVar7 = new zzhpw(0);
        zzhpwVar7.a(64);
        zzhpwVar7.b(32);
        zzhpwVar7.d = zzhpyVar;
        zzhpwVar7.c = zzhpxVar2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzhpwVar7.c());
        hashMap.put("HMAC_SHA512_512BITTAG", zzhqk.b);
        zzhpw zzhpwVar8 = new zzhpw(0);
        zzhpwVar8.a(64);
        zzhpwVar8.b(64);
        zzhpwVar8.d = zzhpyVar;
        zzhpwVar8.c = zzhpxVar2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzhpwVar8.c());
        zzhnsVar.b(Collections.unmodifiableMap(hashMap));
        zzhnn zzhnnVar = zzhnn.b;
        zzhnnVar.a(zzhpv.e, zzhpz.class);
        zzhnp.b.a(zzhpv.d, zzhpz.class);
        zzhmu zzhmuVar = zzhmu.d;
        zzhmuVar.c(zzhpv.c, i, true);
        if (zzhly.a()) {
            return;
        }
        kno knoVar = zzhpj.a;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        zzhnwVar.c(zzhqp.a);
        zzhnwVar.d(zzhqp.b);
        zzhnwVar.a(zzhqp.c);
        zzhnwVar.b(zzhqp.d);
        zzhnnVar.a(jmo.l, zzhpm.class);
        zzhntVar.a(zzhpj.a);
        zzhntVar.a(zzhpj.b);
        HashMap hashMap2 = new HashMap();
        zzhpm zzhpmVar = zzhqk.c;
        hashMap2.put("AES_CMAC", zzhpmVar);
        hashMap2.put("AES256_CMAC", zzhpmVar);
        zzhpk zzhpkVar = new zzhpk(0);
        zzhpkVar.a(32);
        zzhpkVar.b(16);
        zzhpkVar.c = zzhpl.e;
        hashMap2.put("AES256_CMAC_RAW", zzhpkVar.c());
        zzhnsVar.b(Collections.unmodifiableMap(hashMap2));
        zzhmuVar.a(zzhpj.c, true);
    }
}
