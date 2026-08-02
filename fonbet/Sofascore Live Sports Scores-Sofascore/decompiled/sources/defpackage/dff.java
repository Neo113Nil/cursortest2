package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzddp;
import com.google.android.gms.internal.ads.zzdgl;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdlw;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhhf;
import com.google.android.gms.internal.ads.zzhia;
import com.google.android.gms.internal.ads.zzhib;
import com.google.android.gms.internal.ads.zzhic;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhpq;
import com.google.android.gms.internal.ads.zzhsn;
import com.google.android.gms.internal.ads.zzhso;
import com.google.android.gms.internal.ads.zzhui;
import com.google.android.gms.internal.ads.zzhvh;
import com.google.android.gms.internal.ads.zzhxz;
import com.google.android.gms.internal.ads.zzhya;
import com.google.android.gms.internal.ads.zzhyb;
import com.google.android.gms.internal.ads.zzhyc;
import com.google.android.gms.internal.ads.zzhyf;
import com.google.android.gms.internal.ads.zzhyg;
import com.google.android.gms.internal.ads.zziac;
import com.google.android.gms.internal.ads.zziae;
import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.ads.zzibq;
import com.google.android.gms.internal.ads.zzibx;
import com.google.android.gms.internal.ads.zzicd;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzqx;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahw;
import com.google.android.gms.internal.measurement.zzahx;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.media.news.TopNewsActivity;
import com.sofascore.results.stagesport.StageConstructorActivity;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dff implements Continuation, ec3, zzbuu, don, fon, zzdjm, zzhmw, zzhmz, zzhoj, zzeb {
    public static final /* synthetic */ dff b = new dff(6);
    public static final /* synthetic */ dff c = new dff(7);
    public static final /* synthetic */ dff d = new dff(10);
    public static final /* synthetic */ dff e = new dff(11);
    public static final /* synthetic */ dff f = new dff(12);
    public static final /* synthetic */ dff g = new dff(13);
    public static final /* synthetic */ dff h = new dff(14);
    public static final /* synthetic */ dff i = new dff(15);
    public static final /* synthetic */ dff j = new dff(16);
    public static final /* synthetic */ dff k = new dff(17);
    public static final /* synthetic */ dff l = new dff(19);
    public static final /* synthetic */ dff m = new dff(20);
    public static final /* synthetic */ dff n = new dff(21);
    public static final /* synthetic */ dff o = new dff(22);
    public static final /* synthetic */ dff p = new dff(23);
    public static final /* synthetic */ dff q = new dff(27);
    public final /* synthetic */ int a;

    public /* synthetic */ dff(int i2) {
        this.a = i2;
    }

    public static wa b(mhc mhcVar, qhc qhcVar) {
        n7j n7jVar;
        f4a c2 = c(mhcVar);
        if (!qhcVar.equals(qhc.i())) {
            String h2 = !TextUtils.isEmpty(qhcVar.h()) ? qhcVar.h() : null;
            if (qhcVar.k()) {
                aic j2 = qhcVar.j();
                String j3 = !TextUtils.isEmpty(j2.j()) ? j2.j() : null;
                String i2 = !TextUtils.isEmpty(j2.i()) ? j2.i() : null;
                if (TextUtils.isEmpty(i2)) {
                    a70.p("Text model must have a color");
                    return null;
                }
                n7jVar = new n7j(j3, i2);
            } else {
                n7jVar = null;
            }
            if (TextUtils.isEmpty(h2)) {
                a70.p("Button model must have a color");
                return null;
            }
            if (n7jVar == null) {
                a70.p("Button model must have text");
                return null;
            }
            c2.c = new o72(n7jVar, h2);
        }
        return new wa((String) c2.b, (o72) c2.c);
    }

    public static f4a c(mhc mhcVar) {
        f4a f4aVar = new f4a((char) 0, 6);
        if (!TextUtils.isEmpty(mhcVar.h())) {
            String h2 = mhcVar.h();
            if (!TextUtils.isEmpty(h2)) {
                f4aVar.b = h2;
            }
        }
        return f4aVar;
    }

    public static n7j d(aic aicVar) {
        String i2 = !TextUtils.isEmpty(aicVar.i()) ? aicVar.i() : null;
        String j2 = !TextUtils.isEmpty(aicVar.j()) ? aicVar.j() : null;
        if (!TextUtils.isEmpty(i2)) {
            return new n7j(j2, i2);
        }
        a70.p("Text model must have a color");
        return null;
    }

    public static Intent e(Context context, int i2, m2i m2iVar, Intent intent) {
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) StageConstructorActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("STAGE_TEAM_ID", i2);
        intent2.putExtra("INITIAL_TAB", m2iVar);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static void f(Context context, Integer num, Integer num2, boolean z, String str) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) TopNewsActivity.class);
        intent.putExtra("media_post_id", num);
        intent.putExtra("tournament_id", num2);
        intent.putExtra("from_world_cup", z);
        intent.putExtra("analytics_location", str);
        context.startActivity(intent);
    }

    public static void g(int i2, Context context) {
        int i3 = StageConstructorActivity.R;
        context.getClass();
        context.startActivity(e(context, i2, null, null));
    }

    public static /* synthetic */ void i(Context context, Integer num, int i2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        f(context, num, (i2 & 4) != 0 ? null : 16, (i2 & 8) == 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhhf zzhhfVar = (zzhhf) zzhesVar;
        jno jnoVar = zzhkm.a;
        zzhsn G = zzhso.G();
        byte[] b2 = zzhhfVar.b.a.b();
        mpo B = zziei.B(0, b2.length, b2);
        G.n();
        ((zzhso) G.b).I(B);
        return zzhos.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhso) G.o()).e(), zzhfl.c, zzhkm.a(zzhhfVar.a.b), zzhhfVar.d);
    }

    @Override // defpackage.ec3
    public /* synthetic */ Object l(vng vngVar) {
        iu lambda$getComponents$0;
        lambda$getComponents$0 = AnalyticsConnectorRegistrar.lambda$getComponents$0(vngVar);
        return lambda$getComponents$0;
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        zzhib zzhibVar;
        switch (this.a) {
            case 19:
                jno jnoVar = nmo.a;
                if (!zzhosVar.a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    a70.p("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zziei zzieiVar = zzhosVar.c;
                    zziew zziewVar = zziew.b;
                    int i2 = dpo.a;
                    zzhui F = zzhui.F(zzieiVar, zziew.c);
                    if (F.D() != 0) {
                        String valueOf = String.valueOf(F);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                        sb.append("KmsAeadKey are only accepted with version 0, got ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    String D = F.E().D();
                    zzhfm zzhfmVar = zzhosVar.e;
                    if (zzhfmVar == zzhfm.c) {
                        zzhibVar = zzhib.b;
                    } else {
                        if (zzhfmVar != zzhfm.e) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
                        }
                        zzhibVar = zzhib.c;
                    }
                    return zzhia.d(new zzhic(D, zzhibVar), zzhosVar.f);
                } catch (zzige e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                }
            default:
                jno jnoVar2 = zziac.a;
                String str = zzhosVar.a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    a70.p("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                    return null;
                }
                try {
                    zziei zzieiVar2 = zzhosVar.c;
                    zziew zziewVar2 = zziew.b;
                    int i3 = dpo.a;
                    zzhvh H = zzhvh.H(zzieiVar2, zziew.c);
                    if (H.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, H.F().d());
                    int bitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = zzhyc.g;
                    int i4 = 0;
                    zzhxz zzhxzVar = new zzhxz(i4);
                    zzhmo zzhmoVar = zziac.g;
                    zzhxzVar.c = (zzhya) zzhmoVar.c(H.E().D());
                    zzhxzVar.d = (zzhya) zzhmoVar.c(H.E().E());
                    zzhxzVar.b = new BigInteger(1, H.G().d());
                    zzhxzVar.a(bitLength);
                    zzhxzVar.b(H.E().F());
                    zzhxzVar.f = zziac.b(zzhosVar.e);
                    zzhyc c2 = zzhxzVar.c();
                    zzhyf zzhyfVar = new zzhyf(i4);
                    zzhyfVar.a = c2;
                    zzhyfVar.b = bigInteger;
                    zzhyfVar.c = zzhosVar.f;
                    return zzhyfVar.a();
                } catch (zzige | IllegalArgumentException unused) {
                    zzl.x("Parsing RsaSsaPssPublicKey failed");
                    return null;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        switch (this.a) {
            case 21:
                return new zzibx((zzhpq) zzhesVar);
            default:
                zzhyg zzhygVar = (zzhyg) zzhesVar;
                zzhmo zzhmoVar = zzicd.a;
                try {
                    return zziae.d(zzhygVar);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory = (KeyFactory) zzibh.g.a.zza("RSA");
                    BigInteger bigInteger = zzhygVar.b;
                    zzhyc zzhycVar = zzhygVar.a;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhycVar.b));
                    zzhmo zzhmoVar2 = zzicd.a;
                    return new woo(rSAPublicKey, (zzibq) zzhmoVar2.b(zzhycVar.d), (zzibq) zzhmoVar2.b(zzhycVar.e), zzhycVar.f, zzhygVar.c.b(), zzhycVar.c.equals(zzhyb.d) ? zzicd.c : zzicd.b);
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new CloudMessage(intent);
        }
        return null;
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 10:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().zzf());
            case 11:
            case 12:
            case 13:
            default:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().v());
            case 14:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().c());
            case 15:
                List list4 = zzfy.a;
                return zzags.b.get().M();
            case 16:
                List list5 = zzfy.a;
                return Boolean.valueOf(((zzahx) zzahw.b.a.a).zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    public /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        return (JSONObject) obj;
    }

    public /* synthetic */ dff(Object obj, int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((zzddp) obj).a0();
                break;
            case 12:
                ((zzdgl) obj).zzL();
                break;
            case 13:
                ((zzdlw) obj).O();
                break;
            case 24:
                ((zzaz) obj).zzg();
                break;
            case 25:
                break;
            case 26:
                break;
            default:
                ((zzqx) obj).zzb();
                break;
        }
    }
}
