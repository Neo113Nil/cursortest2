package defpackage;

import com.google.android.gms.internal.pal.zzkk;
import com.google.android.gms.internal.pal.zzkl;
import com.google.android.gms.internal.pal.zzlo;
import com.google.android.gms.internal.pal.zzlu;
import com.google.android.gms.internal.pal.zzlx;
import com.google.android.gms.internal.pal.zzma;
import com.google.android.gms.internal.pal.zznk;
import com.google.android.gms.internal.pal.zzoi;
import com.google.android.gms.internal.pal.zzoy;
import com.google.android.gms.internal.pal.zzoz;
import com.google.android.gms.internal.pal.zzqr;
import com.google.android.gms.internal.pal.zzro;
import com.google.android.gms.internal.pal.zzrp;
import com.google.android.gms.internal.pal.zzrr;
import com.google.android.gms.internal.pal.zzrs;
import com.google.android.gms.internal.pal.zzth;
import com.google.android.gms.internal.pal.zzti;
import com.google.android.gms.internal.pal.zzto;
import com.google.android.gms.internal.pal.zzxd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mwo extends zzoz {
    public final /* synthetic */ int a;

    public mwo(int i, Class cls) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public Map a() {
        switch (this.a) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", zzlo.d(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzlo.d(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", zzlo.d(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzlo.d(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
            case 6:
            case 7:
            default:
                return super.a();
            case 2:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_EAX", zzlu.d(16, 1));
                hashMap2.put("AES128_EAX_RAW", zzlu.d(16, 3));
                hashMap2.put("AES256_EAX", zzlu.d(32, 1));
                hashMap2.put("AES256_EAX_RAW", zzlu.d(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            case 3:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("AES128_GCM", zzlx.d(16, 1));
                hashMap3.put("AES128_GCM_RAW", zzlx.d(16, 3));
                hashMap3.put("AES256_GCM", zzlx.d(32, 1));
                hashMap3.put("AES256_GCM_RAW", zzlx.d(32, 3));
                return Collections.unmodifiableMap(hashMap3);
            case 4:
                HashMap hashMap4 = new HashMap();
                hashMap4.put("AES128_GCM_SIV", zzma.d(16, 1));
                hashMap4.put("AES128_GCM_SIV_RAW", zzma.d(16, 3));
                hashMap4.put("AES256_GCM_SIV", zzma.d(32, 1));
                hashMap4.put("AES256_GCM_SIV_RAW", zzma.d(32, 3));
                return Collections.unmodifiableMap(hashMap4);
            case 5:
                HashMap hashMap5 = new HashMap();
                hashMap5.put("CHACHA20_POLY1305", new zzoy(zzto.l(), 1));
                hashMap5.put("CHACHA20_POLY1305_RAW", new zzoy(zzto.l(), 3));
                return Collections.unmodifiableMap(hashMap5);
            case 8:
                HashMap hashMap6 = new HashMap();
                hashMap6.put("XCHACHA20_POLY1305", new zzoy(zzxd.l(), 1));
                hashMap6.put("XCHACHA20_POLY1305_RAW", new zzoy(zzxd.l(), 3));
                return Collections.unmodifiableMap(hashMap6);
            case 9:
                HashMap hashMap7 = new HashMap();
                zzth j = zzti.j();
                if (j.c) {
                    j.j();
                    j.c = false;
                }
                ((zzti) j.b).zze = 64;
                hashMap7.put("AES256_SIV", new zzoy((zzti) j.f(), 1));
                zzth j2 = zzti.j();
                if (j2.c) {
                    j2.j();
                    j2.c = false;
                }
                ((zzti) j2.b).zze = 64;
                hashMap7.put("AES256_SIV_RAW", new zzoy((zzti) j2.f(), 3));
                return Collections.unmodifiableMap(hashMap7);
            case 10:
                HashMap hashMap8 = new HashMap();
                zzkk a = zzkl.a("AES128_GCM");
                byte[] bArr = zznk.c;
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zznk.d(3, a, bArr, 1));
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zznk.d(3, zzkl.a("AES128_GCM"), bArr, 3));
                hashMap8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zznk.d(4, zzkl.a("AES128_GCM"), bArr, 1));
                hashMap8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zznk.d(4, zzkl.a("AES128_GCM"), bArr, 3));
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zznk.d(4, zzkl.a("AES128_GCM"), bArr, 3));
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zznk.d(3, zzkl.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zznk.d(3, zzkl.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
                hashMap8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zznk.d(4, zzkl.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zznk.d(4, zzkl.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
                return Collections.unmodifiableMap(hashMap8);
            case 11:
                HashMap hashMap9 = new HashMap();
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzoi.d(3, 3, 3, 1));
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzoi.d(3, 3, 3, 3));
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzoi.d(3, 3, 4, 1));
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzoi.d(3, 3, 4, 3));
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzoi.d(3, 3, 5, 1));
                hashMap9.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzoi.d(3, 3, 5, 3));
                hashMap9.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzoi.d(4, 3, 3, 1));
                hashMap9.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzoi.d(4, 3, 3, 3));
                hashMap9.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzoi.d(4, 3, 4, 1));
                hashMap9.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzoi.d(4, 3, 4, 3));
                hashMap9.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzoi.d(5, 4, 3, 1));
                hashMap9.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzoi.d(5, 4, 3, 3));
                hashMap9.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzoi.d(5, 4, 4, 1));
                hashMap9.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzoi.d(5, 4, 4, 3));
                hashMap9.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzoi.d(6, 5, 3, 1));
                hashMap9.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzoi.d(6, 5, 3, 3));
                hashMap9.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzoi.d(6, 5, 4, 1));
                hashMap9.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzoi.d(6, 5, 4, 3));
                return Collections.unmodifiableMap(hashMap9);
            case 12:
                HashMap hashMap10 = new HashMap();
                zzro j3 = zzrp.j();
                j3.l();
                zzrr j4 = zzrs.j();
                j4.l();
                j3.m((zzrs) j4.f());
                hashMap10.put("AES_CMAC", new zzoy((zzrp) j3.f(), 1));
                zzro j5 = zzrp.j();
                j5.l();
                zzrr j6 = zzrs.j();
                j6.l();
                j5.m((zzrs) j6.f());
                hashMap10.put("AES256_CMAC", new zzoy((zzrp) j5.f(), 1));
                zzro j7 = zzrp.j();
                j7.l();
                zzrr j8 = zzrs.j();
                j8.l();
                j7.m((zzrs) j8.f());
                hashMap10.put("AES256_CMAC_RAW", new zzoy((zzrp) j7.f(), 3));
                return Collections.unmodifiableMap(hashMap10);
            case 13:
                HashMap hashMap11 = new HashMap();
                hashMap11.put("HMAC_SHA256_128BITTAG", zzqr.d(32, 16, 5, 1));
                hashMap11.put("HMAC_SHA256_128BITTAG_RAW", zzqr.d(32, 16, 5, 3));
                hashMap11.put("HMAC_SHA256_256BITTAG", zzqr.d(32, 32, 5, 1));
                hashMap11.put("HMAC_SHA256_256BITTAG_RAW", zzqr.d(32, 32, 5, 3));
                hashMap11.put("HMAC_SHA512_128BITTAG", zzqr.d(64, 16, 6, 1));
                hashMap11.put("HMAC_SHA512_128BITTAG_RAW", zzqr.d(64, 16, 6, 3));
                hashMap11.put("HMAC_SHA512_256BITTAG", zzqr.d(64, 32, 6, 1));
                hashMap11.put("HMAC_SHA512_256BITTAG_RAW", zzqr.d(64, 32, 6, 3));
                hashMap11.put("HMAC_SHA512_512BITTAG", zzqr.d(64, 64, 6, 1));
                hashMap11.put("HMAC_SHA512_512BITTAG_RAW", zzqr.d(64, 64, 6, 3));
                return Collections.unmodifiableMap(hashMap11);
        }
    }
}
