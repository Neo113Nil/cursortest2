package defpackage;

import androidx.media3.common.b;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.internal.zzao;
import com.google.android.gms.internal.ads.zzajv;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdkx;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgav;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhgn;
import com.google.android.gms.internal.ads.zzhgs;
import com.google.android.gms.internal.ads.zzhgu;
import com.google.android.gms.internal.ads.zzhjo;
import com.google.android.gms.internal.ads.zzhjy;
import com.google.android.gms.internal.ads.zzhlq;
import com.google.android.gms.internal.ads.zzhlx;
import com.google.android.gms.internal.ads.zzhmi;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhse;
import com.google.android.gms.internal.ads.zzhvr;
import com.google.android.gms.internal.ads.zzhwi;
import com.google.android.gms.internal.ads.zzhwo;
import com.google.android.gms.internal.ads.zzhxu;
import com.google.android.gms.internal.ads.zzhzj;
import com.google.android.gms.internal.ads.zzhzt;
import com.google.android.gms.internal.ads.zziaw;
import com.google.android.gms.internal.ads.zzich;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.cast.zzhg;
import com.google.android.gms.internal.cast.zzjf;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.measurement.internal.zzfy;
import com.sofascore.model.database.VoteType;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x3f implements xli, foh, zzajv, don, zzao, fon, zzdjm, zzhcv, zzgav, zzhg, zzhmw, zzhoc, zzhoj, zzhmz, zzjf, zzeb, n4p {
    public static final /* synthetic */ x3f b = new x3f(7);
    public static final /* synthetic */ x3f c = new x3f(11);
    public static final /* synthetic */ x3f d = new x3f(12);
    public static final /* synthetic */ x3f e = new x3f(13);
    public static final /* synthetic */ x3f f = new x3f(14);
    public static final /* synthetic */ x3f g = new x3f(15);
    public static final /* synthetic */ x3f h = new x3f(16);
    public static final /* synthetic */ x3f i = new x3f(19);
    public static final /* synthetic */ x3f j = new x3f(20);
    public static final /* synthetic */ x3f k = new x3f(21);
    public static final /* synthetic */ x3f l = new x3f(22);
    public static final /* synthetic */ x3f m = new x3f(23);
    public final /* synthetic */ int a;

    public /* synthetic */ x3f(int i2) {
        this.a = i2;
    }

    public static y3f p(VoteType voteType) {
        Object obj;
        Iterator<E> it = y3f.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y3f) obj).a.equals(voteType.getValue())) {
                break;
            }
        }
        y3f y3fVar = (y3f) obj;
        return y3fVar == null ? y3f.e : y3fVar;
    }

    @Override // defpackage.n4p
    public a5p a(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.n4p
    public boolean b(Class cls) {
        return false;
    }

    @Override // defpackage.xli
    public int f(b bVar) {
        return 1;
    }

    @Override // defpackage.xli
    public zli g(b bVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhxu zzhxuVar = (zzhxu) zzhesVar;
        return zzhos.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhzt.c(zzhxuVar).e(), zzhfl.e, zzhzt.a(zzhxuVar.a.c), zzhxuVar.d);
    }

    @Override // defpackage.xli
    public boolean i(b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        jno jnoVar = zzhlq.a;
        return zzhot.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzhlq.a(((zzhjo) zzhfjVar).a), (mpo) zzhvr.F().e());
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        jno jnoVar = zzhjy.a;
        if (!zzhosVar.a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            a70.p("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhse G = zzhse.G(zzieiVar, zziew.c);
            if (G.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            int i3 = 0;
            zzhgs zzhgsVar = new zzhgs(i3);
            zzhgsVar.a(G.F().o());
            zzhgsVar.b(G.E().D());
            zzhgsVar.c();
            zzhgsVar.d = zzhjy.b(zzhosVar.e);
            zzhgu d2 = zzhgsVar.d();
            zzhgn zzhgnVar = new zzhgn(i3);
            zzhgnVar.a = d2;
            zzhgnVar.b = new zzicj(zzich.a(G.F().d()));
            zzhgnVar.c = zzhosVar.f;
            return zzhgnVar.a();
        } catch (zzige unused) {
            zzl.x("Parsing AesEaxKey failed");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        zzhwi zzhwiVar = (zzhwi) zzhesVar;
        if (!zzhlx.a(1)) {
            zzl.x("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        try {
            return zzhzj.a(zzhwiVar);
        } catch (GeneralSecurityException unused) {
            zzicj zzicjVar = zzhwiVar.b;
            zzhwo zzhwoVar = zzhwiVar.a;
            zzhfr zzhfrVar = zzhfr.a;
            byte[] b2 = zzicjVar.a.b();
            zzhwoVar.c.b();
            zzhwoVar.a.a.getClass();
            zziaw zziawVar = new zziaw();
            if (!zzhlx.a(1)) {
                zzl.x("Can not use Ed25519 in FIPS-mode.");
                return null;
            }
            if (b2.length == 32) {
                zzhmi.a(zzhmi.b(b2));
                return zziawVar;
            }
            a70.p("Given private key's length is not 32");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    @Override // defpackage.foh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean q(Object obj, Object obj2) {
        xaj xajVar = (xaj) obj;
        xaj xajVar2 = (xaj) obj2;
        if (xajVar == null || xajVar2 == null) {
            return !((xajVar == null) ^ (xajVar2 == null));
        }
        if (xajVar.a != xajVar2.a || !Intrinsics.c(xajVar.b, xajVar2.b) || xajVar.c != xajVar2.c || xajVar.d != xajVar2.d || xajVar.e != xajVar2.e) {
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 11:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().r());
            case 12:
            case 13:
            default:
                throw new IllegalStateException();
            case 14:
                List list2 = zzfy.a;
                return Double.valueOf(zzaic.b.get().zzc());
            case 15:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzl());
            case 16:
                List list4 = zzfy.a;
                return Boolean.valueOf(zzags.b.get().zzj());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public /* synthetic */ void zzb(Object obj) {
        zze.zza("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void zzb() {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void zzc() {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void zzd() {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void zze() {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void zzf() {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void zzm() {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void c(int[] iArr) {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void d(MediaQueueItem[] mediaQueueItemArr) {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void k(int[] iArr) {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void m(int[] iArr) {
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void j(int i2, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 12:
                ((zzr) obj).zzdw();
                break;
            case 13:
                ((zzdkx) obj).zzf();
                break;
            case 25:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.cast.internal.zzao
    public void e(int i2, ArrayList arrayList, ArrayList arrayList2) {
    }
}
