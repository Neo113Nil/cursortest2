package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.equativ.displaysdk.coresdkdisplay.util.SCSGoogleServicesApiProxy;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzddp;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdma;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhhm;
import com.google.android.gms.internal.ads.zzhir;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpk;
import com.google.android.gms.internal.ads.zzhqp;
import com.google.android.gms.internal.ads.zzhrq;
import com.google.android.gms.internal.ads.zzhsp;
import com.google.android.gms.internal.ads.zzhsq;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhuo;
import com.google.android.gms.internal.ads.zzhwb;
import com.google.android.gms.internal.ads.zzhyz;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.cloudmessaging.zzs;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagy;
import com.google.android.gms.internal.measurement.zzagz;
import com.google.android.gms.internal.measurement.zzaht;
import com.google.android.gms.internal.measurement.zzahu;
import com.google.android.gms.internal.measurement.zzajd;
import com.google.android.gms.internal.measurement.zzaje;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.wearable.zzh;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.OnSuccessListener;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.stagesport.StageDriverActivity;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.Normalizer;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pff implements OnSuccessListener, p2c, ky3, fon, zzbc, zzdjm, zzfpi, zzgvc, zzhnz, zzhoc, zzhmz, zzh, zzeb, zzbt, zzs {
    public static final /* synthetic */ pff b;
    public static final /* synthetic */ pff c;
    public static final /* synthetic */ pff d;
    public static final /* synthetic */ pff e;
    public static final /* synthetic */ pff f;
    public static final /* synthetic */ pff g;
    public static final /* synthetic */ pff h;
    public static final /* synthetic */ pff i;
    public static final /* synthetic */ pff j;
    public static final /* synthetic */ pff k;
    public static final /* synthetic */ pff l;
    public static final /* synthetic */ pff m;
    public static final /* synthetic */ pff n;
    public static final /* synthetic */ pff o;
    public final /* synthetic */ int a;

    static {
        byte b2 = 0;
        b = new pff(b2, 7);
        c = new pff(b2, 9);
        d = new pff(b2, 10);
        e = new pff(b2, 11);
        f = new pff(b2, 12);
        g = new pff(b2, 13);
        h = new pff(b2, 14);
        i = new pff(b2, 15);
        j = new pff(b2, 16);
        k = new pff(b2, 17);
        l = new pff(b2, 19);
        m = new pff(b2, 20);
        n = new pff(b2, 21);
        o = new pff(b2, 22);
    }

    public /* synthetic */ pff(int i2) {
        this.a = 24;
    }

    public static String a(TournamentRoundWrapper tournamentRoundWrapper, boolean z) {
        tournamentRoundWrapper.getClass();
        if (Intrinsics.c(tournamentRoundWrapper.getTotwType(), TeamOfTheWeekRoundsResponseKt.TOTW_SEASON)) {
            return z ? "tournament" : TeamOfTheWeekRoundsResponseKt.TOTW_SEASON;
        }
        String obj = StringsKt.l0(tournamentRoundWrapper.getRoundName()).toString();
        if (StringsKt.toIntOrNull(obj) != null) {
            return dmi.q("round_", obj);
        }
        mqi mqiVar = qhi.a;
        obj.getClass();
        String normalize = Normalizer.normalize(obj, Normalizer.Form.NFD);
        normalize.getClass();
        String lowerCase = me4.h("\\s+", StringsKt.l0(new Regex("[^a-zA-Z0-9\\s]+").replace(new Regex("[^\\p{ASCII}]").replace(normalize, ""), "")).toString(), "_").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static MediaCodec b(vng vngVar) {
        String str = ((a3c) vngVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static qff c(String str) {
        qff qffVar = qff.HTTP_1_0;
        if (str.equals("http/1.0")) {
            return qffVar;
        }
        qff qffVar2 = qff.HTTP_1_1;
        if (str.equals("http/1.1")) {
            return qffVar2;
        }
        qff qffVar3 = qff.H2_PRIOR_KNOWLEDGE;
        if (str.equals("h2_prior_knowledge")) {
            return qffVar3;
        }
        qff qffVar4 = qff.HTTP_2;
        if (str.equals("h2")) {
            return qffVar4;
        }
        qff qffVar5 = qff.SPDY_3;
        if (str.equals("spdy/3.1")) {
            return qffVar5;
        }
        qff qffVar6 = qff.QUIC;
        if (str.equals("quic")) {
            return qffVar6;
        }
        qff qffVar7 = qff.HTTP_3;
        if (c.v(str, "h3", false)) {
            return qffVar7;
        }
        is8.e("Unexpected protocol: ".concat(str));
        return null;
    }

    public static Intent e(Context context, int i2, b5i b5iVar, Intent intent) {
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) StageDriverActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("STAGE_TEAM_ID", i2);
        intent2.putExtra("INITIAL_TAB", b5iVar);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static void g(int i2, Context context) {
        int i3 = StageDriverActivity.R;
        context.getClass();
        context.startActivity(e(context, i2, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // defpackage.p2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r2c d(vng vngVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = b(vngVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) vngVar.d;
            mediaCodec.configure((MediaFormat) vngVar.b, surface, (MediaCrypto) vngVar.e, (surface == null && ((a3c) vngVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new umb(mediaCodec, (umb) vngVar.f);
        } catch (IOException e2) {
            e = e2;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        switch (this.a) {
            case 19:
                jno jnoVar = zzhir.a;
                zzhtw zzhtwVar = zzhotVar.b;
                if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    a70.p("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
                    return null;
                }
                try {
                    zziei E = zzhtwVar.E();
                    zziew zziewVar = zziew.b;
                    int i2 = dpo.a;
                    return zzhir.b(zzhuo.F(E, zziew.c), zzhotVar.c);
                } catch (zzige e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            default:
                jno jnoVar2 = zzhqp.a;
                zzhtw zzhtwVar2 = zzhotVar.b;
                if (!zzhtwVar2.D().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    a70.p("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar2.D())));
                    return null;
                }
                try {
                    zziei E2 = zzhtwVar2.E();
                    zziew zziewVar2 = zziew.b;
                    int i3 = dpo.a;
                    zzhrq F = zzhrq.F(E2, zziew.c);
                    zzhpk zzhpkVar = new zzhpk(0);
                    zzhpkVar.a(F.D());
                    zzhpkVar.b(F.E().D());
                    zzhpkVar.c = zzhqp.b(zzhotVar.c);
                    return zzhpkVar.c();
                } catch (zzige e3) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e3);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhwb zzhwbVar = (zzhwb) zzhesVar;
        return zzhos.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhyz.f(zzhwbVar).e(), zzhfl.e, zzhyz.a(zzhwbVar.a.d), zzhwbVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        zzhhm zzhhmVar = (zzhhm) zzhfjVar;
        jno jnoVar = zzhkm.a;
        zzhfm a = zzhkm.a(zzhhmVar.b);
        zzhsp G = zzhsq.G();
        int i2 = zzhhmVar.a;
        G.n();
        ((zzhsq) G.b).H(i2);
        return zzhot.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", a, (mpo) ((zzhsq) G.o()).e());
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Location location = (Location) obj;
        synchronized (this) {
            SCSGoogleServicesApiProxy.b = location;
            fjg c2 = fjg.c();
            System.currentTimeMillis();
            Objects.toString(location);
            c2.f(1);
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                num.getClass();
                return bf3.k("CreationExtras.Key@", num, "<", duf.a.getOrCreateKotlinClass(String.class).getSimpleName(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 7:
                return new Boolean(((zzagz) zzagy.b.a.a).zza());
            case 8:
            case 11:
            case 13:
            case 15:
            default:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 9:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().e());
            case 10:
                List list2 = zzfy.a;
                return Long.valueOf(zzags.b.get().C());
            case 12:
                List list3 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzv());
            case 14:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().B());
            case 16:
                List list5 = zzfy.a;
                return Boolean.valueOf(((zzaje) zzajd.b.a.a).zza());
            case 17:
                return new Boolean(((zzahu) zzaht.b.a.a).zza());
        }
    }

    public /* synthetic */ pff(byte b2, int i2) {
        this.a = i2;
    }

    public pff(long j2) {
        this.a = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((zzddp) obj).zze();
                break;
            case 13:
                zzdma zzdmaVar = (zzdma) obj;
                if (!zzdmaVar.d) {
                    zzdmaVar.b.a(zzdmaVar.a, zzdmaVar.c);
                    zzdmaVar.d = true;
                    break;
                }
                break;
            case 24:
                int i2 = cwo.Z;
                ((zzaz) obj).zzq();
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zze.zza("Ad request signals:");
        zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
