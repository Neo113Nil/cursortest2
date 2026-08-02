package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdkx;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhgo;
import com.google.android.gms.internal.ads.zzhgs;
import com.google.android.gms.internal.ads.zzhji;
import com.google.android.gms.internal.ads.zzhjy;
import com.google.android.gms.internal.ads.zzhlq;
import com.google.android.gms.internal.ads.zzhlx;
import com.google.android.gms.internal.ads.zzhmb;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhsg;
import com.google.android.gms.internal.ads.zzhtf;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhvo;
import com.google.android.gms.internal.ads.zzhvp;
import com.google.android.gms.internal.ads.zzhvx;
import com.google.android.gms.internal.ads.zzhvz;
import com.google.android.gms.internal.ads.zzhwb;
import com.google.android.gms.internal.ads.zzhwh;
import com.google.android.gms.internal.ads.zzhza;
import com.google.android.gms.internal.ads.zzhzb;
import com.google.android.gms.internal.ads.zzhzi;
import com.google.android.gms.internal.ads.zziao;
import com.google.android.gms.internal.ads.zziaz;
import com.google.android.gms.internal.ads.zzibb;
import com.google.android.gms.internal.ads.zzibq;
import com.google.android.gms.internal.ads.zzicf;
import com.google.android.gms.internal.ads.zzici;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.cast.zzfh;
import com.google.android.gms.internal.cast.zzjf;
import com.google.android.gms.internal.fido.zzdy;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.measurement.internal.zzfy;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.unity3d.services.UnityAdsConstants;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.spec.ECParameterSpec;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class e2f implements ynd, puk, zzagk, fon, zzagn, zzdjm, zzdy, zzfh, eln, zzhoj, zzhnz, zzhmz, zzhoc, zzjf, zzeb {
    public static final /* synthetic */ e2f b = new e2f(8);
    public static final /* synthetic */ e2f c = new e2f(9);
    public static final /* synthetic */ e2f d = new e2f(10);
    public static final /* synthetic */ e2f e = new e2f(11);
    public static final /* synthetic */ e2f f = new e2f(12);
    public static final /* synthetic */ e2f g = new e2f(14);
    public static final /* synthetic */ e2f h = new e2f(19);
    public static final /* synthetic */ e2f i = new e2f(20);
    public static final /* synthetic */ e2f j = new e2f(21);
    public static final /* synthetic */ e2f k = new e2f(22);
    public static final /* synthetic */ e2f l = new e2f(23);
    public final /* synthetic */ int a;

    public /* synthetic */ e2f(int i2) {
        this.a = i2;
    }

    public static void k(Context context, boolean z) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) UpgradeSofascoreActivity.class);
        intent.putExtra("preselectYearlyAds", z);
        context.startActivity(intent);
    }

    @Override // defpackage.ynd
    public long a(nl6 nl6Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public zzaht b(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public void c(zzahk zzahkVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ynd
    /* renamed from: createSeekMap */
    public b0h mo18createSeekMap() {
        return new bw0(C.TIME_UNSET);
    }

    @Override // defpackage.eln
    public Object e(IBinder iBinder) {
        int i2 = ykn.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHpoaService");
        return queryLocalInterface instanceof tqn ? (tqn) queryLocalInterface : new x3n(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService");
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        jno jnoVar = zzhjy.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            a70.p("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhsg F = zzhsg.F(E, zziew.c);
            zzhgs zzhgsVar = new zzhgs(0);
            zzhgsVar.a(F.E());
            zzhgsVar.b(F.D().D());
            zzhgsVar.c();
            zzhgsVar.d = zzhjy.b(zzhotVar.c);
            return zzhgsVar.d();
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
        }
    }

    public void g(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhji zzhjiVar = (zzhji) zzhesVar;
        jno jnoVar = zzhlq.a;
        zzhvo G = zzhvp.G();
        byte[] b2 = zzhjiVar.b.a.b();
        mpo B = zziei.B(0, b2.length, b2);
        G.n();
        ((zzhvp) G.b).I(B);
        return zzhos.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhvp) G.o()).e(), zzhfl.c, zzhlq.a(zzhjiVar.a.a), zzhjiVar.d);
    }

    @Override // defpackage.puk
    public void j(View view, float f2) {
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float abs = ((f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f2 + 1.0f : Math.abs(1.0f - f2)) * 0.2f) + 0.8f;
        view.setScaleX(abs);
        view.setScaleY(abs);
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        if (f2 >= -1.0f && f2 <= 1.0f) {
            f3 = 1.0f - (abs - 1.0f);
        }
        view.setAlpha(f3);
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        jno jnoVar = zzhzi.a;
        return zzhot.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzhzi.a(((zzhwh) zzhfjVar).a), (mpo) zzhtf.F().e());
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        switch (this.a) {
            case 19:
                return zziao.a((zzhgo) zzhesVar);
            default:
                zzhvz zzhvzVar = (zzhvz) zzhesVar;
                Provider a = zzhmb.a();
                zzibq zzibqVar = (zzibq) zzhzb.i.b(zzhvzVar.a.a.c);
                zzhmo zzhmoVar = zzhzb.j;
                zzhwb zzhwbVar = zzhvzVar.a;
                zzhmo zzhmoVar2 = zzhzb.k;
                zzhvx zzhvxVar = zzhwbVar.a;
                ECParameterSpec a2 = zzibb.a((zziaz) zzhmoVar2.b(zzhvxVar.b));
                zzici zziciVar = zzhvzVar.b;
                zzhfr zzhfrVar = zzhfr.a;
                zzhwbVar.c.b();
                zzhvxVar.d.getClass();
                zzhza zzhzaVar = new zzhza();
                if (!zzhlx.a(2)) {
                    zzl.x("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
                    return null;
                }
                zzicf.b(zzibqVar);
                zzibqVar.toString().concat("withECDSA");
                return zzhzaVar;
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 8:
                List list = zzfy.a;
                return zzags.b.get().zzn();
            case 9:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzt());
            case 10:
            default:
                List list3 = zzfy.a;
                return Long.valueOf(zzaic.b.get().zzb());
            case 11:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public void zzv() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ynd
    public void startSeek(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 12:
                ((zzr) obj).zzdV();
                break;
            case 13:
                ((zzdkx) obj).n("MalformedJson");
                break;
            case 25:
                break;
            default:
                break;
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public /* synthetic */ zzagh[] mo792zza() {
        int i2 = zzcku.w;
        return new zzagh[]{new zzamp(), new zzakt()};
    }

    public void i(b2f b2fVar, int i2, int i3) {
    }
}
