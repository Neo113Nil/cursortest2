package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdlf;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhhd;
import com.google.android.gms.internal.ads.zzhib;
import com.google.android.gms.internal.ads.zzhic;
import com.google.android.gms.internal.ads.zzhkf;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpf;
import com.google.android.gms.internal.ads.zzhpj;
import com.google.android.gms.internal.ads.zzhsl;
import com.google.android.gms.internal.ads.zzhsm;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhuk;
import com.google.android.gms.internal.ads.zzhvb;
import com.google.android.gms.internal.ads.zzhxu;
import com.google.android.gms.internal.ads.zzhxz;
import com.google.android.gms.internal.ads.zzhya;
import com.google.android.gms.internal.ads.zzhyc;
import com.google.android.gms.internal.ads.zziac;
import com.google.android.gms.internal.ads.zzibx;
import com.google.android.gms.internal.ads.zzibz;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.cast.zzc;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahn;
import com.google.android.gms.internal.measurement.zzaho;
import com.google.android.gms.internal.measurement.zzail;
import com.google.android.gms.internal.measurement.zzaim;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.wearable.zzef;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class haf implements x06, RemoteCall, zzcgs, fon, zzdjm, zzgvc, zzhnz, zzhoc, zzhoj, zzeb {
    public static final /* synthetic */ haf b = new haf(6);
    public static final /* synthetic */ haf c = new haf(7);
    public static final /* synthetic */ haf d = new haf(9);
    public static final /* synthetic */ haf e = new haf(10);
    public static final /* synthetic */ haf f = new haf(11);
    public static final /* synthetic */ haf g = new haf(12);
    public static final /* synthetic */ haf h = new haf(13);
    public static final /* synthetic */ haf i = new haf(14);
    public static final /* synthetic */ haf j = new haf(16);
    public static final /* synthetic */ haf k = new haf(17);
    public static final /* synthetic */ haf l = new haf(18);
    public static final /* synthetic */ haf m = new haf(19);
    public static final /* synthetic */ haf n = new haf(20);
    public static final /* synthetic */ haf o = new haf(21);
    public static final /* synthetic */ haf p = new haf(22);
    public static final /* synthetic */ haf q = new haf(23);
    public static final /* synthetic */ haf r = new haf(24);
    public final /* synthetic */ int a;

    public /* synthetic */ haf(int i2) {
        this.a = i2;
    }

    public static final boolean a(Object obj) {
        return !((zzef) obj).a;
    }

    public static final zzef b(Object obj, Object obj2) {
        zzef zzefVar = (zzef) obj;
        zzef zzefVar2 = (zzef) obj2;
        if (!zzefVar2.isEmpty()) {
            if (!zzefVar.a) {
                zzefVar = zzefVar.g();
            }
            zzefVar.i();
            if (!zzefVar2.isEmpty()) {
                zzefVar.putAll(zzefVar2);
            }
        }
        return zzefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        zzhib zzhibVar;
        switch (this.a) {
            case 19:
                jno jnoVar = nmo.a;
                zzhtw zzhtwVar = zzhotVar.b;
                if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    a70.p("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
                    return null;
                }
                try {
                    zziei E = zzhtwVar.E();
                    zziew zziewVar = zziew.b;
                    int i2 = dpo.a;
                    String D = zzhuk.E(E, zziew.c).D();
                    zzhfm zzhfmVar = zzhotVar.c;
                    if (zzhfmVar == zzhfm.c) {
                        zzhibVar = zzhib.b;
                    } else {
                        if (zzhfmVar != zzhfm.e) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
                        }
                        zzhibVar = zzhib.c;
                    }
                    return new zzhic(D, zzhibVar);
                } catch (zzige e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            default:
                jno jnoVar2 = zziac.a;
                zzhtw zzhtwVar2 = zzhotVar.b;
                if (!zzhtwVar2.D().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    a70.p("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar2.D())));
                    return null;
                }
                try {
                    zziei E2 = zzhtwVar2.E();
                    zziew zziewVar2 = zziew.b;
                    int i3 = dpo.a;
                    zzhvb G = zzhvb.G(E2, zziew.c);
                    BigInteger bigInteger = zzhyc.g;
                    zzhxz zzhxzVar = new zzhxz(0);
                    zzhmo zzhmoVar = zziac.g;
                    zzhxzVar.c = (zzhya) zzhmoVar.c(G.D().D());
                    zzhxzVar.d = (zzhya) zzhmoVar.c(G.D().E());
                    zzhxzVar.b = new BigInteger(1, G.F().d());
                    zzhxzVar.a(G.E());
                    zzhxzVar.b(G.D().F());
                    zzhxzVar.f = zziac.b(zzhotVar.c);
                    return zzhxzVar.c();
                } catch (zzige e3) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e3);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        zzhhd zzhhdVar = (zzhhd) zzhfjVar;
        jno jnoVar = zzhkf.a;
        zzhfm a = zzhkf.a(zzhhdVar.b);
        zzhsl G = zzhsm.G();
        int i2 = zzhhdVar.a;
        G.n();
        ((zzhsm) G.b).H(i2);
        return zzhot.a("type.googleapis.com/google.crypto.tink.AesGcmKey", a, (mpo) ((zzhsm) G.o()).e());
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        switch (this.a) {
            case 21:
                zzhpf zzhpfVar = (zzhpf) zzhesVar;
                kno knoVar = zzhpj.a;
                if (zzhpfVar.a.a == 32) {
                    return new zzibx(zzhpfVar);
                }
                zzl.x("AesCmacKey size wrong, must be 32 bytes");
                return null;
            default:
                return zzibz.a((zzhxu) zzhesVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        switch (this.a) {
            case 7:
                zzy zzyVar = (zzy) anyClient;
                Logger logger = zzbm.H;
                zzah zzahVar = (zzah) zzyVar.getService();
                zzyVar.getContext();
                ApiMetadata a = zzff.a();
                Parcel J = zzahVar.J();
                zzc.b(J, a);
                zzahVar.l2(J, 1);
                taskCompletionSource.setResult(null);
                break;
            default:
                int i2 = zzkk.l;
                break;
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 9:
                List list = zzfy.a;
                return zzags.b.get().zzP();
            case 10:
                List list2 = zzfy.a;
                return Long.valueOf(zzags.b.get().p());
            case 11:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().z());
            case 12:
                List list4 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzq());
            case 13:
            case 15:
            default:
                return -1;
            case 14:
                List list5 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzs());
            case 16:
                List list6 = zzfy.a;
                return Boolean.valueOf(((zzaho) zzahn.b.a.a).zzb());
            case 17:
                List list7 = zzfy.a;
                return Boolean.valueOf(((zzaim) zzail.b.a.a).zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public void mo13zza(Object obj) {
        switch (this.a) {
            case 8:
                zze.zza("Ending javascript session.");
                zzbuo zzbuoVar = (zzbuo) ((zzbun) obj);
                HashSet hashSet = zzbuoVar.b;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbqh) simpleEntry.getValue()).toString())));
                    zzbuoVar.a.a0((String) simpleEntry.getKey(), (zzbqh) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 13:
                ((zzdlf) obj).zza();
                break;
            case 25:
                break;
            default:
                break;
        }
    }
}
