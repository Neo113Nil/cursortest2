package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import com.blaze.blazesdk.widgets.models.WidgetRemoteConfigRemoteResponse;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzddt;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfh;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfo;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhgw;
import com.google.android.gms.internal.ads.zzhhv;
import com.google.android.gms.internal.ads.zzhia;
import com.google.android.gms.internal.ads.zzhkf;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhmu;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhne;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhor;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhsj;
import com.google.android.gms.internal.ads.zzhsk;
import com.google.android.gms.internal.ads.zzhux;
import com.google.android.gms.internal.ads.zzhuz;
import com.google.android.gms.internal.ads.zzhxn;
import com.google.android.gms.internal.ads.zzhxo;
import com.google.android.gms.internal.ads.zzhxq;
import com.google.android.gms.internal.ads.zzhxr;
import com.google.android.gms.internal.ads.zzhxt;
import com.google.android.gms.internal.ads.zzhxu;
import com.google.android.gms.internal.ads.zzhzm;
import com.google.android.gms.internal.ads.zzhzt;
import com.google.android.gms.internal.ads.zzici;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzqx;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.cast.zzc;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.internal.measurement.zzaii;
import com.google.android.gms.internal.measurement.zzaij;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w9f implements x9f, fpk, zal, RemoteCall, zzcgq, don, fon, zzdjm, OnUserEarnedRewardListener, zzgvc, zzhoj, zzhmz, zzhmw, zzeb {
    public static final /* synthetic */ w9f b = new w9f(7);
    public static final /* synthetic */ w9f c = new w9f(8);
    public static final /* synthetic */ w9f d = new w9f(10);
    public static final /* synthetic */ w9f e = new w9f(11);
    public static final /* synthetic */ w9f f = new w9f(12);
    public static final /* synthetic */ w9f g = new w9f(13);
    public static final /* synthetic */ w9f h = new w9f(14);
    public static final /* synthetic */ w9f i = new w9f(15);
    public static final /* synthetic */ w9f j = new w9f(16);
    public static final /* synthetic */ w9f k = new w9f(17);
    public static final /* synthetic */ w9f l = new w9f(19);
    public static final /* synthetic */ w9f m = new w9f(20);
    public static final /* synthetic */ w9f n = new w9f(21);
    public static final /* synthetic */ w9f o = new w9f(22);
    public static final /* synthetic */ w9f p = new w9f(23);
    public static final /* synthetic */ w9f q = new w9f(27);
    public final /* synthetic */ int a;

    public static String d(String str) {
        Object obj;
        Iterator<E> it = ufj.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((ufj) obj).toString(), str)) {
                break;
            }
        }
        ufj ufjVar = (ufj) obj;
        if (ufjVar != null) {
            return ufjVar.a;
        }
        w9f w9fVar = ufj.b;
        return WidgetRemoteConfigRemoteResponse.DEFAULT_LAYOUT_KEY;
    }

    @Override // defpackage.x9f
    public void a(int i2, Object obj) {
        if (i2 == 6 || i2 == 7 || i2 == 8) {
        }
    }

    @Override // defpackage.fpk
    public void b(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.fpk
    public void c(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        switch (this.a) {
            case 20:
                zzhgw zzhgwVar = (zzhgw) zzhesVar;
                jno jnoVar = zzhkf.a;
                zzhsj G = zzhsk.G();
                byte[] b2 = zzhgwVar.b.a.b();
                mpo B = zziei.B(0, b2.length, b2);
                G.n();
                ((zzhsk) G.b).I(B);
                return zzhos.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhsk) G.o()).e(), zzhfl.c, zzhkf.a(zzhgwVar.a.b), zzhgwVar.d);
            default:
                zzhos zzhosVar = ((zzhne) zzhesVar).a;
                zzhfl zzhflVar = zzhosVar.d;
                return zzhosVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        jno jnoVar = zzhzt.a;
        String str = zzhosVar.a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            a70.p("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhux L = zzhux.L(zzieiVar, zziew.c);
            if (L.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhuz E = L.E();
            if (E.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, E.F().d());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, E.G().d());
            BigInteger bigInteger3 = zzhxq.e;
            int i3 = 0;
            zzhxn zzhxnVar = new zzhxn(i3);
            zzhxnVar.c = (zzhxo) zzhzt.g.c(E.E().D());
            zzhxnVar.b = bigInteger2;
            zzhxnVar.a(bitLength);
            zzhxnVar.d = zzhzt.b(zzhosVar.e);
            zzhxq b2 = zzhxnVar.b();
            zzhxt zzhxtVar = new zzhxt(i3);
            zzhxtVar.a = b2;
            zzhxtVar.b = bigInteger;
            zzhxtVar.c = zzhosVar.f;
            zzhxu a = zzhxtVar.a();
            zzhxr zzhxrVar = new zzhxr(i3);
            zzhxrVar.a = a;
            zzici d2 = zzhzt.d(L.G());
            zzici d3 = zzhzt.d(L.H());
            zzhxrVar.c = d2;
            zzhxrVar.d = d3;
            zzhxrVar.b = zzhzt.d(L.F());
            zzici d4 = zzhzt.d(L.I());
            zzici d5 = zzhzt.d(L.J());
            zzhxrVar.e = d4;
            zzhxrVar.f = d5;
            zzhxrVar.g = zzhzt.d(L.K());
            return zzhxrVar.a();
        } catch (zzige | IllegalArgumentException unused) {
            zzl.x("Parsing RsaSsaPkcs1PrivateKey failed");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        switch (this.a) {
            case 19:
                zzhia zzhiaVar = (zzhia) zzhesVar;
                kno knoVar = zzhhv.a;
                return new zzhla(zzhfh.a(zzhiaVar.a.a).zzb(), zzhiaVar.b.b());
            default:
                zzhfr zzhfrVar = zzhfr.a;
                zzhos zzhosVar = ((zzhne) zzhesVar).a;
                zzhfl zzhflVar = zzhosVar.d;
                zzhfo zzhfoVar = (zzhfo) zzhmu.d.b(zzhfo.class, zzhosVar.a).a(zzhosVar.c);
                zzhfm zzhfmVar = zzhosVar.e;
                return new zzhzm(zzhfoVar, zzhor.a(zzhfmVar, zzhosVar.f).b(), zzhfmVar != zzhfm.d ? new byte[0] : new byte[]{0});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzy zzyVar = (zzy) anyClient;
        Logger logger = zzbm.H;
        zzah zzahVar = (zzah) zzyVar.getService();
        zzyVar.getContext();
        ApiMetadata a = zzff.a();
        Parcel J = zzahVar.J();
        zzc.b(J, a);
        zzahVar.l2(J, 19);
        taskCompletionSource.setResult(Boolean.TRUE);
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 10:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().s());
            case 11:
            case 12:
            case 15:
            default:
                return 265;
            case 13:
                List list2 = zzfy.a;
                return zzaic.b.get().zzf();
            case 14:
                List list3 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzw());
            case 16:
                List list4 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().J());
            case 17:
                List list5 = zzfy.a;
                return Boolean.valueOf(((zzaij) zzaii.b.a.a).zza());
        }
    }

    public /* synthetic */ w9f(int i2) {
        this.a = i2;
    }

    public /* synthetic */ w9f(boolean z) {
        this.a = 24;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public /* synthetic */ void onUserEarnedReward(RewardItem rewardItem) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((zzddt) obj).zze();
                break;
            case 12:
                ((zzr) obj).zzdz();
                break;
            case 24:
                ((zzaz) obj).zzs();
                break;
            case 25:
                break;
            case 26:
                break;
            default:
                ((zzqx) obj).zze();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgq
    /* renamed from: zza */
    public /* synthetic */ void mo17zza() {
    }
}
