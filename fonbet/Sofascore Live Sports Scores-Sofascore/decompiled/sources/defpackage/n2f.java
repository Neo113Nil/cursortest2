package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzamd;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzanx;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdkx;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgan;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhgo;
import com.google.android.gms.internal.ads.zzhgu;
import com.google.android.gms.internal.ads.zzhgw;
import com.google.android.gms.internal.ads.zzhhd;
import com.google.android.gms.internal.ads.zzhji;
import com.google.android.gms.internal.ads.zzhjy;
import com.google.android.gms.internal.ads.zzhlq;
import com.google.android.gms.internal.ads.zzhmb;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhsd;
import com.google.android.gms.internal.ads.zzhse;
import com.google.android.gms.internal.ads.zzhsh;
import com.google.android.gms.internal.ads.zzhsi;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhut;
import com.google.android.gms.internal.ads.zzhvp;
import com.google.android.gms.internal.ads.zzhvw;
import com.google.android.gms.internal.ads.zzhvx;
import com.google.android.gms.internal.ads.zzhwb;
import com.google.android.gms.internal.ads.zzhxn;
import com.google.android.gms.internal.ads.zzhxo;
import com.google.android.gms.internal.ads.zzhxq;
import com.google.android.gms.internal.ads.zzhzb;
import com.google.android.gms.internal.ads.zzhzt;
import com.google.android.gms.internal.ads.zziap;
import com.google.android.gms.internal.ads.zziaz;
import com.google.android.gms.internal.ads.zziba;
import com.google.android.gms.internal.ads.zzibb;
import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.ads.zzibq;
import com.google.android.gms.internal.ads.zzich;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.cast.zzje;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahe;
import com.google.android.gms.internal.measurement.zzahf;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.measurement.internal.zzfy;
import com.ironsource.U3;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n2f implements lah, foh, wy2, lgn, fon, zzbz, zzagn, zzdjm, zzgan, zzhoj, zzhmz, zzhmw, zzhnz, zzje, zzeb {
    public static final /* synthetic */ n2f b = new n2f(7);
    public static final /* synthetic */ n2f c = new n2f(8);
    public static final /* synthetic */ n2f d = new n2f(10);
    public static final /* synthetic */ n2f e = new n2f(11);
    public static final /* synthetic */ n2f f = new n2f(12);
    public static final /* synthetic */ n2f g = new n2f(13);
    public static final /* synthetic */ n2f h = new n2f(14);
    public static final /* synthetic */ n2f i = new n2f(15);
    public static final /* synthetic */ n2f j = new n2f(16);
    public static final /* synthetic */ n2f k = new n2f(17);
    public static final /* synthetic */ n2f l = new n2f(19);
    public static final /* synthetic */ n2f m = new n2f(20);
    public static final /* synthetic */ n2f n = new n2f(21);
    public static final /* synthetic */ n2f o = new n2f(22);
    public static final /* synthetic */ n2f p = new n2f(23);
    public final /* synthetic */ int a;

    public /* synthetic */ n2f(int i2) {
        this.a = i2;
    }

    public static oul a(String str) {
        if (TextUtils.isEmpty(str)) {
            hpo.h("%s : empty one dt", "OneDTParser");
            return new oul("", -1L);
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            if (optJSONObject != null && "onedtid".equalsIgnoreCase(optJSONObject.optString("propertyName", ""))) {
                return new oul(optJSONObject.optString("propertyValue", ""), optJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e2) {
            de0.g(p5m.ONE_DT_PARSE_ERROR, e2);
            hpo.h("%s : failed parse one dt", "OneDTParser");
        }
        return new oul("", -1L);
    }

    @Override // defpackage.lah
    public bah b(omf omfVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        int i2 = 11;
        zid zidVar = jSONObject.has("session") ? new zid(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), i2) : new zid(new JSONObject().optInt("max_custom_exception_events", 8), i2);
        JSONObject jSONObject2 = jSONObject.getJSONObject(U3.a.v);
        return new bah(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), zidVar, new vn0(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        jno jnoVar = zzhzt.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            a70.p("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhut G = zzhut.G(E, zziew.c);
            BigInteger bigInteger = zzhxq.e;
            zzhxn zzhxnVar = new zzhxn(0);
            zzhxnVar.c = (zzhxo) zzhzt.g.c(G.D().D());
            zzhxnVar.b = new BigInteger(1, G.F().d());
            zzhxnVar.a(G.E());
            zzhxnVar.d = zzhzt.b(zzhotVar.c);
            return zzhxnVar.b();
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e2);
        }
    }

    @Override // defpackage.wy2
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhgo zzhgoVar = (zzhgo) zzhesVar;
        jno jnoVar = zzhjy.a;
        zzhsd H = zzhse.H();
        zzhgu zzhguVar = zzhgoVar.a;
        zzhsh E = zzhsi.E();
        int i2 = zzhguVar.b;
        E.n();
        ((zzhsi) E.b).G(i2);
        zzhsi zzhsiVar = (zzhsi) E.o();
        H.n();
        ((zzhse) H.b).J(zzhsiVar);
        byte[] b2 = zzhgoVar.b.a.b();
        mpo B = zziei.B(0, b2.length, b2);
        H.n();
        ((zzhse) H.b).K(B);
        return zzhos.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhse) H.o()).e(), zzhfl.c, zzhjy.a(zzhgoVar.a.c), zzhgoVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        jno jnoVar = zzhlq.a;
        if (!zzhosVar.a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            a70.p("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhvp F = zzhvp.F(zzieiVar, zziew.c);
            if (F.D() == 0) {
                return zzhji.d(zzhlq.b(zzhosVar.e), new zzicj(zzich.a(F.E().d())), zzhosVar.f);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzige unused) {
            zzl.x("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        switch (this.a) {
            case 19:
                zzhgw zzhgwVar = (zzhgw) zzhesVar;
                zzhhd zzhhdVar = zzhgwVar.a;
                zzicj zzicjVar = zzhgwVar.b;
                zzhfr zzhfrVar = zzhfr.a;
                return new zziap(zzicjVar.a.b(), zzhgwVar.c);
            default:
                zzhwb zzhwbVar = (zzhwb) zzhesVar;
                byte[] bArr = zzhzb.g;
                Provider a = zzhmb.a();
                zzhmo zzhmoVar = zzhzb.k;
                zzhvx zzhvxVar = zzhwbVar.a;
                return new zzhzb((ECPublicKey) (a != null ? KeyFactory.getInstance("EC", a) : (KeyFactory) zzibh.g.a.zza("EC")).generatePublic(new ECPublicKeySpec(zzhwbVar.b, zzibb.a((zziaz) zzhmoVar.b(zzhvxVar.b)))), (zzibq) zzhzb.i.b(zzhvxVar.c), (zziba) zzhzb.j.b(zzhvxVar.a), zzhwbVar.c.b(), zzhvxVar.d.equals(zzhvw.d) ? zzhzb.h : zzhzb.g, a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    @Override // defpackage.foh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean q(Object obj, Object obj2) {
        waj wajVar = (waj) obj;
        waj wajVar2 = (waj) obj2;
        if (wajVar == null || wajVar2 == null) {
            return !((wajVar == null) ^ (wajVar2 == null));
        }
        if (wajVar.e != wajVar2.e || wajVar.f != wajVar2.f || wajVar.b != wajVar2.b || !Intrinsics.c(wajVar.c, wajVar2.c) || !an3.b(wajVar.d, wajVar2.d)) {
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 8:
                List list = zzfy.a;
                return ((zzahf) zzahe.b.a.a).zza();
            case 9:
            case 10:
            case 12:
            case 13:
            default:
                List list2 = zzfy.a;
                return Boolean.valueOf(zzaif.b.get().zzg());
            case 11:
                List list3 = zzfy.a;
                return zzags.b.get().zzh();
            case 14:
                List list4 = zzfy.a;
                return Integer.valueOf((int) zzaic.b.get().zzd());
            case 15:
                List list5 = zzfy.a;
                return zzags.b.get().h();
            case 16:
                List list6 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzD());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 12:
                ((zzr) obj).zzdv();
                break;
            case 13:
                ((zzdkx) obj).zze();
                break;
            case 25:
                break;
            default:
                break;
        }
    }

    @Override // defpackage.lgn
    public /* synthetic */ String zza(String str, String str2) {
        return null;
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public zzagh[] mo792zza() {
        int i2 = zzcku.w;
        zzamp zzampVar = new zzamp();
        zzakt zzaktVar = new zzakt();
        mio mioVar = zzgxm.b;
        return new zzagh[]{zzampVar, zzaktVar, new zzamd(zzanx.G7, 32, s.e)};
    }
}
