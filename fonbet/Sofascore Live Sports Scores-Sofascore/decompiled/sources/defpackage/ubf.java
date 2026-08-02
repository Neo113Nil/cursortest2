package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcde;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzdej;
import com.google.android.gms.internal.ads.zzdgk;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdln;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgbl;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhhk;
import com.google.android.gms.internal.ads.zzhia;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhlx;
import com.google.android.gms.internal.ads.zzhly;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhqt;
import com.google.android.gms.internal.ads.zzhsq;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhuh;
import com.google.android.gms.internal.ads.zzhui;
import com.google.android.gms.internal.ads.zzhuj;
import com.google.android.gms.internal.ads.zzhuk;
import com.google.android.gms.internal.ads.zzhyc;
import com.google.android.gms.internal.ads.zzhye;
import com.google.android.gms.internal.ads.zzhyg;
import com.google.android.gms.internal.ads.zziac;
import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.ads.zzibq;
import com.google.android.gms.internal.ads.zzicd;
import com.google.android.gms.internal.ads.zzicf;
import com.google.android.gms.internal.ads.zzici;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzqx;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahn;
import com.google.android.gms.internal.measurement.zzaho;
import com.google.android.gms.internal.measurement.zzail;
import com.google.android.gms.internal.measurement.zzaim;
import com.google.android.gms.internal.pal.zzrc;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.stats.zzd;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ubf implements fpk, zzd, zzcgs, zzq, fon, zzdjm, zzgbl, zzhmz, zzhnz, zzhoj, zzeb, zzrc {
    public static final /* synthetic */ ubf b = new ubf(9);
    public static final /* synthetic */ ubf c = new ubf(10);
    public static final /* synthetic */ ubf d = new ubf(11);
    public static final /* synthetic */ ubf e = new ubf(12);
    public static final /* synthetic */ ubf f = new ubf(13);
    public static final /* synthetic */ ubf g = new ubf(14);
    public static final /* synthetic */ ubf h = new ubf(15);
    public static final /* synthetic */ ubf i = new ubf(16);
    public static final /* synthetic */ ubf j = new ubf(17);
    public static final /* synthetic */ ubf k = new ubf(19);
    public static final /* synthetic */ ubf l = new ubf(20);
    public static final /* synthetic */ ubf m = new ubf(21);
    public static final /* synthetic */ ubf n = new ubf(22);
    public static final /* synthetic */ ubf o = new ubf(23);
    public static final /* synthetic */ ubf p = new ubf(27);
    public final /* synthetic */ int a;

    public /* synthetic */ ubf(zzan zzanVar) {
        this.a = 24;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ljj a(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return ljj.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return ljj.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return ljj.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return ljj.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return ljj.SSL_3_0;
        }
        a70.p("Unexpected TLS version: ".concat(str));
        return null;
    }

    @Override // defpackage.fpk
    public void b(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.fpk
    public void c(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        jno jnoVar = zzhkm.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            a70.p("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhsq F = zzhsq.F(E, zziew.c);
            if (F.E() != 0) {
                zzl.x("Only version 0 parameters are accepted");
                return null;
            }
            zzhhk zzhhkVar = new zzhhk(0);
            zzhhkVar.a(F.D());
            zzhhkVar.b = zzhkm.b(zzhotVar.c);
            return zzhhkVar.b();
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        switch (this.a) {
            case 19:
                zzhia zzhiaVar = (zzhia) zzhesVar;
                jno jnoVar = nmo.a;
                zzhuh G = zzhui.G();
                zzhuj F = zzhuk.F();
                String str = zzhiaVar.a.a;
                F.n();
                ((zzhuk) F.b).H(str);
                zzhuk zzhukVar = (zzhuk) F.o();
                G.n();
                ((zzhui) G.b).I(zzhukVar);
                return zzhos.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhui) G.o()).e(), zzhfl.f, nmo.a(zzhiaVar.a.b), zzhiaVar.c);
            default:
                zzhyg zzhygVar = (zzhyg) zzhesVar;
                return zzhos.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zziac.d(zzhygVar).e(), zzhfl.e, zziac.a(zzhygVar.a.c), zzhygVar.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        switch (this.a) {
            case 21:
                zzhqt zzhqtVar = new zzhqt();
                if (!zzhlx.a(2)) {
                    zzl.x("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                    break;
                } else {
                    break;
                }
            default:
                zzhye zzhyeVar = (zzhye) zzhesVar;
                try {
                    break;
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory = (KeyFactory) zzibh.g.a.zza("RSA");
                    zzhyg zzhygVar = zzhyeVar.a;
                    zzhyg zzhygVar2 = zzhyeVar.a;
                    BigInteger bigInteger = zzhygVar.b;
                    zzhyc zzhycVar = zzhygVar2.a;
                    zzhyc zzhycVar2 = zzhygVar2.a;
                    BigInteger bigInteger2 = zzhycVar.b;
                    zzici zziciVar = zzhyeVar.b;
                    zzhfr zzhfrVar = zzhfr.a;
                    BigInteger bigInteger3 = zziciVar.a;
                    zzici zziciVar2 = zzhyeVar.c;
                    zzhfr zzhfrVar2 = zzhfr.a;
                    BigInteger bigInteger4 = zziciVar2.a;
                    zzici zziciVar3 = zzhyeVar.d;
                    zzhfr zzhfrVar3 = zzhfr.a;
                    BigInteger bigInteger5 = zziciVar3.a;
                    zzici zziciVar4 = zzhyeVar.e;
                    zzhfr zzhfrVar4 = zzhfr.a;
                    BigInteger bigInteger6 = zziciVar4.a;
                    zzici zziciVar5 = zzhyeVar.f;
                    zzhfr zzhfrVar5 = zzhfr.a;
                    BigInteger bigInteger7 = zziciVar5.a;
                    zzici zziciVar6 = zzhyeVar.g;
                    zzhfr zzhfrVar6 = zzhfr.a;
                    RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, zziciVar6.a));
                    zzhmo zzhmoVar = zzicd.a;
                    zzibq zzibqVar = (zzibq) zzhmoVar.b(zzhycVar2.d);
                    zzibq zzibqVar2 = (zzibq) zzhmoVar.b(zzhycVar2.e);
                    zzhygVar2.c.b();
                    zzhycVar2.c.getClass();
                    moo mooVar = new moo();
                    if (zzhly.a()) {
                        zzl.x("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                        return null;
                    }
                    zzicf.b(zzibqVar);
                    if (!zzibqVar.equals(zzibqVar2)) {
                        zzl.x("sigHash and mgf1Hash must be the same");
                        return null;
                    }
                    zzicf.c(rSAPrivateCrtKey.getModulus().bitLength());
                    zzicf.d(rSAPrivateCrtKey.getPublicExponent());
                    return mooVar;
                }
        }
        return null;
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 10:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().b());
            case 11:
            case 12:
            case 13:
            default:
                List list2 = zzfy.a;
                return Boolean.valueOf(((zzaim) zzail.b.a.a).zza());
            case 14:
                List list3 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzd());
            case 15:
                List list4 = zzfy.a;
                return zzags.b.get().zzm();
            case 16:
                List list5 = zzfy.a;
                return Boolean.valueOf(((zzaho) zzahn.b.a.a).zzd());
        }
    }

    public /* synthetic */ ubf(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 8:
                zzcgj.f.execute(new f2n((zzbth) obj, 24));
                break;
            case 11:
                ((zzdej) obj).j();
                break;
            case 12:
                ((zzdgk) obj).zzk();
                break;
            case 13:
                ((zzdln) obj).zzi();
                break;
            case 24:
                int i2 = cwo.Z;
                ((zzaz) obj).zze();
                break;
            case 25:
                break;
            default:
                ((zzqx) obj).zzc();
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    /* renamed from: zza */
    public Object mo910zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (queryLocalInterface instanceof zzcde) {
            return (zzcde) queryLocalInterface;
        }
        return new zzcde(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }
}
