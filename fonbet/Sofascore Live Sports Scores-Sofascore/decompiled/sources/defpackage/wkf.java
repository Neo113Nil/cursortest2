package defpackage;

import android.graphics.Path;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.zzak;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzdfd;
import com.google.android.gms.internal.ads.zzdir;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfd;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhhs;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhks;
import com.google.android.gms.internal.ads.zzhlf;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhnh;
import com.google.android.gms.internal.ads.zzhnj;
import com.google.android.gms.internal.ads.zzhnr;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpw;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzhsu;
import com.google.android.gms.internal.ads.zzhsv;
import com.google.android.gms.internal.ads.zzhsw;
import com.google.android.gms.internal.ads.zzhsy;
import com.google.android.gms.internal.ads.zzhtp;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhvx;
import com.google.android.gms.internal.ads.zzhyz;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzahl;
import com.google.android.gms.internal.measurement.zzaio;
import com.google.android.gms.internal.measurement.zzaip;
import com.google.android.gms.measurement.internal.zzfy;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wkf implements ky3, xeh, ycn, zzq, don, fon, zzdjm, fmo, zzhoj, zzhoc, zzhnz, zzeb, uap {
    public static final /* synthetic */ wkf b = new wkf(7);
    public static final /* synthetic */ wkf c = new wkf(10);
    public static final /* synthetic */ wkf d = new wkf(11);
    public static final /* synthetic */ wkf e = new wkf(12);
    public static final /* synthetic */ wkf f = new wkf(13);
    public static final /* synthetic */ wkf g = new wkf(14);
    public static final /* synthetic */ wkf h = new wkf(15);
    public static final /* synthetic */ wkf i = new wkf(16);
    public static final /* synthetic */ wkf j = new wkf(17);
    public static final /* synthetic */ wkf k = new wkf(19);
    public static final /* synthetic */ wkf l = new wkf(20);
    public static final /* synthetic */ wkf m = new wkf(21);
    public static final /* synthetic */ wkf n = new wkf(22);
    public static final /* synthetic */ wkf o = new wkf(27);
    public final /* synthetic */ int a;

    public /* synthetic */ wkf(zzak zzakVar, int i2) {
        this.a = 24;
    }

    public static Path c(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    @Override // defpackage.ycn
    public boolean a(Class cls) {
        return false;
    }

    @Override // defpackage.ycn
    public ndn b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.xeh
    public z88 d(kki kkiVar) {
        return new wf2(kkiVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        zzhmo zzhmoVar = zzhqy.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            a70.p("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhtp G = zzhtp.G(E, zziew.c);
            if (G.F() != 0) {
                int F = G.F();
                throw new GeneralSecurityException(me4.g(F, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(F).length() + 47)));
            }
            zzhpw zzhpwVar = new zzhpw(0);
            zzhpwVar.a(G.E());
            zzhpwVar.b(G.D().E());
            zzhpwVar.c = (zzhpx) zzhqy.a.c(G.D().D());
            zzhpwVar.d = zzhqy.b(zzhotVar.c);
            return zzhpwVar.c();
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        switch (this.a) {
            case 20:
                jno jnoVar = zzhks.a;
                return zzhot.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzhks.a(((zzhhs) zzhfjVar).a), (mpo) zzhsu.E().e());
            default:
                zzhvx zzhvxVar = (zzhvx) zzhfjVar;
                jno jnoVar2 = zzhyz.a;
                zzhfm a = zzhyz.a(zzhvxVar.d);
                zzhsv F = zzhsw.F();
                zzhsy e2 = zzhyz.e(zzhvxVar);
                F.n();
                ((zzhsw) F.b).G(e2);
                return zzhot.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", a, (mpo) ((zzhsw) F.o()).e());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        zzhjc zzhjcVar = (zzhjc) zzhesVar;
        zzhjh zzhjhVar = zzhjcVar.a;
        zzicj zzicjVar = zzhjcVar.b;
        zzhfr zzhfrVar = zzhfr.a;
        return new zzhlf(zzicjVar.a.b(), zzhjcVar.c, zzhjcVar.a.b);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                num.getClass();
                return bf3.k("CreationExtras.Key@", num, "<", duf.a.getOrCreateKotlinClass(qqg.class).getSimpleName(), ">");
            case 2:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 10:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().zzi());
            case 11:
            case 12:
            case 13:
            default:
                return new Boolean(((zzaip) zzaio.b.a.a).zza());
            case 14:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzr());
            case 15:
                List list3 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().u());
            case 16:
                List list4 = zzfy.a;
                return Boolean.valueOf(((zzahl) zzahk.b.a.a).zzc());
        }
    }

    public /* synthetic */ wkf(int i2) {
        this.a = i2;
    }

    public /* synthetic */ wkf(zzhfd zzhfdVar, zzhnh zzhnhVar) {
        this.a = 18;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((zzdfd) obj).zzg();
                break;
            case 12:
                ((zzdir) obj).M();
                break;
            case 13:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
                break;
            case 24:
                int i2 = cwo.Z;
                ((zzaz) obj).zzc();
                break;
            case 25:
                break;
            default:
                break;
        }
    }

    @Override // defpackage.uap
    public /* synthetic */ int zza(Object obj) {
        HashMap hashMap = zzwl.a;
        String str = ((zzvs) obj).a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    @Override // defpackage.fmo
    public void zza() {
        Object obj = (zzhnj) zzhnr.b.a.get();
        if (obj == null) {
            obj = zzhnr.c;
        }
        obj.getClass();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    /* renamed from: zza, reason: collision with other method in class */
    public Object mo910zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        if (queryLocalInterface instanceof zzbmc) {
            return (zzbmc) queryLocalInterface;
        }
        return new zzbmc(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }
}
