package com.google.android.gms.internal.ads;

import defpackage.jno;
import defpackage.kno;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhyl {
    static {
        int i = zzhur.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        zzhxk zzhxkVar = zzhxk.a;
        zzhnt zzhntVar = zzhnt.b;
        zzhntVar.b(zzhxk.a);
        zzhntVar.a(zzhxk.b);
        zzhntVar.b(zzhxm.a);
        zzhntVar.a(zzhxm.b);
        int i = zzhwf.f;
        if (!zzhlx.a(i)) {
            defpackage.zzl.x("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        jno jnoVar = zzhyz.a;
        zzhnw zzhnwVar = zzhnw.b;
        zzhnwVar.c(zzhyz.a);
        zzhnwVar.d(zzhyz.b);
        zzhnwVar.a(zzhyz.c);
        zzhnwVar.b(zzhyz.d);
        zzhnwVar.a(zzhyz.e);
        zzhnwVar.b(zzhyz.f);
        zzhns zzhnsVar = zzhns.b;
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", zzhxi.a);
        hashMap.put("ECDSA_P256_IEEE_P1363", zzhxi.d);
        zzhvs zzhvsVar = new zzhvs(0);
        zzhvsVar.c = zzhvu.b;
        zzhvsVar.b = zzhvt.c;
        zzhvsVar.a = zzhvv.b;
        zzhvsVar.d = zzhvw.e;
        hashMap.put("ECDSA_P256_RAW", zzhvsVar.a());
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzhxi.f);
        hashMap.put("ECDSA_P384", zzhxi.b);
        hashMap.put("ECDSA_P384_IEEE_P1363", zzhxi.e);
        zzhvs zzhvsVar2 = new zzhvs(0);
        zzhvsVar2.c = zzhvu.d;
        zzhvt zzhvtVar = zzhvt.d;
        zzhvsVar2.b = zzhvtVar;
        zzhvv zzhvvVar = zzhvv.c;
        zzhvsVar2.a = zzhvvVar;
        zzhvw zzhvwVar = zzhvw.b;
        zzhvsVar2.d = zzhvwVar;
        hashMap.put("ECDSA_P384_SHA512", zzhvsVar2.a());
        zzhvs zzhvsVar3 = new zzhvs(0);
        zzhvsVar3.c = zzhvu.c;
        zzhvsVar3.b = zzhvtVar;
        zzhvsVar3.a = zzhvvVar;
        zzhvsVar3.d = zzhvwVar;
        hashMap.put("ECDSA_P384_SHA384", zzhvsVar3.a());
        hashMap.put("ECDSA_P521", zzhxi.c);
        hashMap.put("ECDSA_P521_IEEE_P1363", zzhxi.g);
        zzhnsVar.b(Collections.unmodifiableMap(hashMap));
        zzhntVar.a(zzhwf.a);
        zzhntVar.a(zzhwf.b);
        zzhnn zzhnnVar = zzhnn.b;
        zzhnnVar.a(zzhwf.e, zzhvx.class);
        zzhmu zzhmuVar = zzhmu.d;
        zzhmuVar.c(zzhwf.c, i, true);
        zzhmuVar.c(zzhwf.d, i, false);
        int i2 = zzhxy.f;
        if (!zzhlx.a(i2)) {
            defpackage.zzl.x("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        zzhnwVar.c(zzhzt.a);
        zzhnwVar.d(zzhzt.b);
        zzhnwVar.a(zzhzt.c);
        zzhnwVar.b(zzhzt.d);
        zzhnwVar.a(zzhzt.e);
        zzhnwVar.b(zzhzt.f);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhxi.h);
        BigInteger bigInteger = zzhxq.e;
        zzhxn zzhxnVar = new zzhxn(0);
        zzhxnVar.c = zzhxo.b;
        zzhxnVar.a(3072);
        BigInteger bigInteger2 = zzhxq.e;
        zzhxnVar.b = bigInteger2;
        zzhxp zzhxpVar = zzhxp.e;
        zzhxnVar.d = zzhxpVar;
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhxnVar.b());
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhxi.i);
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhxi.j);
        zzhxn zzhxnVar2 = new zzhxn(0);
        zzhxnVar2.c = zzhxo.d;
        zzhxnVar2.a(4096);
        zzhxnVar2.b = bigInteger2;
        zzhxnVar2.d = zzhxpVar;
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhxnVar2.b());
        zzhnsVar.b(hashMap2);
        zzhntVar.a(zzhxy.a);
        zzhntVar.a(zzhxy.b);
        zzhnnVar.a(zzhxy.e, zzhxq.class);
        zzhmuVar.c(zzhxy.c, i2, true);
        zzhmuVar.c(zzhxy.d, i2, false);
        int i3 = zzhyk.f;
        if (!zzhlx.a(i3)) {
            defpackage.zzl.x("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        zzhnwVar.c(zziac.a);
        zzhnwVar.d(zziac.b);
        zzhnwVar.a(zziac.c);
        zzhnwVar.b(zziac.d);
        zzhnwVar.a(zziac.e);
        zzhnwVar.b(zziac.f);
        HashMap hashMap3 = new HashMap();
        BigInteger bigInteger3 = zzhyc.g;
        zzhxz zzhxzVar = new zzhxz(0);
        zzhya zzhyaVar = zzhya.b;
        zzhxzVar.c = zzhyaVar;
        zzhxzVar.d = zzhyaVar;
        zzhxzVar.b(32);
        zzhxzVar.a(3072);
        BigInteger bigInteger4 = zzhyc.g;
        zzhxzVar.b = bigInteger4;
        zzhyb zzhybVar = zzhyb.b;
        zzhxzVar.f = zzhybVar;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", zzhxzVar.c());
        zzhxz zzhxzVar2 = new zzhxz(0);
        zzhxzVar2.c = zzhyaVar;
        zzhxzVar2.d = zzhyaVar;
        zzhxzVar2.b(32);
        zzhxzVar2.a(3072);
        zzhxzVar2.b = bigInteger4;
        zzhyb zzhybVar2 = zzhyb.e;
        zzhxzVar2.f = zzhybVar2;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhxzVar2.c());
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzhxi.k);
        zzhxz zzhxzVar3 = new zzhxz(0);
        zzhya zzhyaVar2 = zzhya.d;
        zzhxzVar3.c = zzhyaVar2;
        zzhxzVar3.d = zzhyaVar2;
        zzhxzVar3.b(64);
        zzhxzVar3.a(4096);
        zzhxzVar3.b = bigInteger4;
        zzhxzVar3.f = zzhybVar;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", zzhxzVar3.c());
        zzhxz zzhxzVar4 = new zzhxz(0);
        zzhxzVar4.c = zzhyaVar2;
        zzhxzVar4.d = zzhyaVar2;
        zzhxzVar4.b(64);
        zzhxzVar4.a(4096);
        zzhxzVar4.b = bigInteger4;
        zzhxzVar4.f = zzhybVar2;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhxzVar4.c());
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzhxi.l);
        zzhnsVar.b(Collections.unmodifiableMap(hashMap3));
        zzhntVar.a(zzhyk.a);
        zzhntVar.a(zzhyk.b);
        zzhnnVar.a(zzhyk.e, zzhyc.class);
        zzhmuVar.c(zzhyk.c, i3, true);
        zzhmuVar.c(zzhyk.d, i3, false);
        if (zzhly.a()) {
            return;
        }
        kno knoVar = zzhwn.a;
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        zzhnwVar.c(zzhzi.a);
        zzhnwVar.d(zzhzi.b);
        zzhnwVar.a(zzhzi.c);
        zzhnwVar.b(zzhzi.d);
        zzhnwVar.a(zzhzi.e);
        zzhnwVar.b(zzhzi.f);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("ED25519", new zzhwh(zzhwg.b));
        zzhwg zzhwgVar = zzhwg.e;
        hashMap4.put("ED25519_RAW", new zzhwh(zzhwgVar));
        hashMap4.put("ED25519WithRawOutput", new zzhwh(zzhwgVar));
        zzhnsVar.b(Collections.unmodifiableMap(hashMap4));
        zzhnnVar.a(zzhwn.f, zzhwh.class);
        zzhnp.b.a(zzhwn.e, zzhwh.class);
        zzhntVar.a(zzhwn.a);
        zzhntVar.a(zzhwn.b);
        zzhmuVar.a(zzhwn.c, true);
        zzhmuVar.a(zzhwn.d, false);
    }
}
